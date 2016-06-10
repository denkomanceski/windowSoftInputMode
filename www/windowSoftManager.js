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
}

 var windowSoftManager = new windowSoftManager();
 module.exports = windowSoftManager;
