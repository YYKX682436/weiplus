package io.flutter.plugins.webviewflutter;

/* loaded from: classes16.dex */
public class FlutterAssetManagerHostApiImpl implements io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FlutterAssetManagerHostApi {
    final io.flutter.plugins.webviewflutter.FlutterAssetManager flutterAssetManager;

    public FlutterAssetManagerHostApiImpl(io.flutter.plugins.webviewflutter.FlutterAssetManager flutterAssetManager) {
        this.flutterAssetManager = flutterAssetManager;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FlutterAssetManagerHostApi
    public java.lang.String getAssetFilePathByName(java.lang.String str) {
        return this.flutterAssetManager.getAssetFilePathByName(str);
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FlutterAssetManagerHostApi
    public java.util.List<java.lang.String> list(java.lang.String str) {
        try {
            java.lang.String[] list = this.flutterAssetManager.list(str);
            return list == null ? new java.util.ArrayList() : java.util.Arrays.asList(list);
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException(e17.getMessage());
        }
    }
}
