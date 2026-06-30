package io.flutter.plugins.webviewflutter;

/* loaded from: classes16.dex */
public class DownloadListenerFlutterApiImpl extends io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.DownloadListenerFlutterApi {
    private final io.flutter.plugins.webviewflutter.InstanceManager instanceManager;

    public DownloadListenerFlutterApiImpl(io.flutter.plugin.common.BinaryMessenger binaryMessenger, io.flutter.plugins.webviewflutter.InstanceManager instanceManager) {
        super(binaryMessenger);
        this.instanceManager = instanceManager;
    }

    private long getIdentifierForListener(android.webkit.DownloadListener downloadListener) {
        java.lang.Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(downloadListener);
        if (identifierForStrongReference != null) {
            return identifierForStrongReference.longValue();
        }
        throw new java.lang.IllegalStateException("Could not find identifier for DownloadListener.");
    }

    public void onDownloadStart(android.webkit.DownloadListener downloadListener, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.DownloadListenerFlutterApi.Reply<java.lang.Void> reply) {
        onDownloadStart(java.lang.Long.valueOf(getIdentifierForListener(downloadListener)), str, str2, str3, str4, java.lang.Long.valueOf(j17), reply);
    }
}
