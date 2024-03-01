// MAIN JS

var specificPagePath = ''; // Global variable to store the specific page path
var showModals = false;

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

window.loadFiles = function(num, placeHolder, filePath) {
    for (let i = 0; i < num; i++) {
        $.ajax({
            url: filePath,
            success: function(data) {
                // Append the fetched data to the placeholder.
                $(placeHolder).append(data);
                console.log(filePath + " loaded successfully.");
            },
            error: function(xhr, status, error) {
                // Handle error
                console.log("Error loading " + filePath + " : " + xhr.status + " " + error);
            }
        });
    }
};

// Modals

function displayModal(modalID, closeButton, pathName) {
    if (showModals == true) {
        if (window.location.pathname .indexOf(pathName) > -1) {
            var modal = document.getElementById(modalID);
            var closeButton = document.getElementById(closeButton);

            if (modal) {
                modal.style.display = "block";

                closeButton.onclick = function() 
                {
                    modal.style.display = "none";
                }
            }
        }
    }
}


