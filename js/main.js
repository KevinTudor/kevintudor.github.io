// MAIN JS

window.loadTemplate = function(placeHolder, templatePath) {
    $(placeHolder).load(templatePath, function(response, status, xhr) {
        if(status == "error") {
            console.log("Error loading \(" + templatePath + "\) : " + xhr.status + " " + xhr.statusText);
        } else {
            console.log("\(" + templatePath + "\) loaded successfully.");
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



