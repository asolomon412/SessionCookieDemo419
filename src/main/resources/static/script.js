/**
 * 
 */

function validateInfo() {
	// 1. get the textbox value
	var fName = document.getElementById("firstname").value;
	
	if (fName.length <= 2) {
		alert("Please enter a longer firstname");
		document.getElementById("firstname").focus();
		return false;
	}
}