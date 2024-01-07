// MAIN JS

var specificPagePath = ''; // Global variable to store the specific page path

window.loadTemplate = function(placeHolder, templatePath, contentPath) {
    specificPagePath = contentPath; // Store the page path

    $(placeHolder).load(templatePath, function(response, status, xhr) {
        if(status == "error") {
            console.log("Error loading " + templatePath + " : " + xhr.status + " " + xhr.statusText);
        } else {
            console.log(templatePath + " loaded successfully.");
            if(specificPagePath) {
                window.loadFile('#pageContent', specificPagePath); // Load the specific page
            }
        }
    });
}

window.loadFile = function(placeHolder, filePath) {
    $(placeHolder).load(filePath, function(response, status, xhr) {
        if(status == "error") {
            console.log("Error loading \(" + filePath + "\) : " + xhr.status + " " + xhr.statusText);
        } else {
            console.log("\(" + filePath + "\) loaded successfully.");
        }
    });
}



