/*global cordova, module*/

module.exports = {
    greet: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Hello", "greet", [name]);
    },
    getMonth: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Ola", "getMonth", [name]);
    },
};
