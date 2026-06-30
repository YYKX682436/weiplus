package io.flutter.plugins.webviewflutter;

/* loaded from: classes16.dex */
public class JavaScriptChannelFlutterApiImpl extends io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.JavaScriptChannelFlutterApi {
    private final io.flutter.plugins.webviewflutter.InstanceManager instanceManager;

    public JavaScriptChannelFlutterApiImpl(io.flutter.plugin.common.BinaryMessenger binaryMessenger, io.flutter.plugins.webviewflutter.InstanceManager instanceManager) {
        super(binaryMessenger);
        this.instanceManager = instanceManager;
    }

    private long getIdentifierForJavaScriptChannel(io.flutter.plugins.webviewflutter.JavaScriptChannel javaScriptChannel) {
        java.lang.Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(javaScriptChannel);
        if (identifierForStrongReference != null) {
            return identifierForStrongReference.longValue();
        }
        throw new java.lang.IllegalStateException("Could not find identifier for JavaScriptChannel.");
    }

    public void postMessage(io.flutter.plugins.webviewflutter.JavaScriptChannel javaScriptChannel, java.lang.String str, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.JavaScriptChannelFlutterApi.Reply<java.lang.Void> reply) {
        super.postMessage(java.lang.Long.valueOf(getIdentifierForJavaScriptChannel(javaScriptChannel)), str, reply);
    }
}
