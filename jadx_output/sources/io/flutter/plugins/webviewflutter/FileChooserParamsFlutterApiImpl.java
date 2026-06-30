package io.flutter.plugins.webviewflutter;

/* loaded from: classes16.dex */
public class FileChooserParamsFlutterApiImpl extends io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FileChooserParamsFlutterApi {
    private final io.flutter.plugins.webviewflutter.InstanceManager instanceManager;

    public FileChooserParamsFlutterApiImpl(io.flutter.plugin.common.BinaryMessenger binaryMessenger, io.flutter.plugins.webviewflutter.InstanceManager instanceManager) {
        super(binaryMessenger);
        this.instanceManager = instanceManager;
    }

    private static io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FileChooserMode toFileChooserEnumData(int i17) {
        if (i17 == 0) {
            return io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FileChooserMode.OPEN;
        }
        if (i17 == 1) {
            return io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FileChooserMode.OPEN_MULTIPLE;
        }
        if (i17 == 3) {
            return io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FileChooserMode.SAVE;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Unsupported FileChooserMode: %d", java.lang.Integer.valueOf(i17)));
    }

    public void create(android.webkit.WebChromeClient.FileChooserParams fileChooserParams, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FileChooserParamsFlutterApi.Reply<java.lang.Void> reply) {
        if (this.instanceManager.containsInstance(fileChooserParams)) {
            return;
        }
        create(java.lang.Long.valueOf(this.instanceManager.addHostCreatedInstance(fileChooserParams)), java.lang.Boolean.valueOf(fileChooserParams.isCaptureEnabled()), java.util.Arrays.asList(fileChooserParams.getAcceptTypes()), toFileChooserEnumData(fileChooserParams.getMode()), fileChooserParams.getFilenameHint(), reply);
    }
}
