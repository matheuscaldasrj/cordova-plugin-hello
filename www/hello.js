/*global cordova, module*/

module.exports = {
    greet: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Hello", "greet", [name]);
    },
    getMonth: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Hello", "getMonth", [name]);
    },
    search: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Hello", "search", [name]);
    },
    function1: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "MyClass", "function1", [name]);
    },
    function2: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "MyClass", "function2", [name]);
    }
};
