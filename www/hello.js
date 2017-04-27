/*global cordova, module*/

module.exports = {
    greet: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Hello", "greet", [name]);
    },
    ola: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Ola", "ola", [name]);
    },
};
