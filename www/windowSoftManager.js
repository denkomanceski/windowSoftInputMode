var exec = require('cordova/exec');

function windowSoftManager() {

}

windowSoftManager.prototype.setMode = function(aString){
 exec(function(result){
     /*alert("OK" + reply);*/
   },
  function(result){
    /*alert("Error" + reply);*/
   },"windowSoftManager",aString,[]);
};

windowSoftManager.prototype.MODES = {
    SOFT_INPUT_ADJUST_PAN: "adjustPan",
    SOFT_INPUT_ADJUST_RESIZE: "adjustResize",
    SOFT_INPUT_ADJUST_NOTHING: "adjustNothing"
};

 var windowSoftManager = new windowSoftManager();
 module.exports = windowSoftManager;
