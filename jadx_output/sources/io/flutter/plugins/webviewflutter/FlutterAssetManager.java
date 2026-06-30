package io.flutter.plugins.webviewflutter;

/* loaded from: classes16.dex */
abstract class FlutterAssetManager {
    final android.content.res.AssetManager assetManager;

    /* loaded from: classes16.dex */
    public static class PluginBindingFlutterAssetManager extends io.flutter.plugins.webviewflutter.FlutterAssetManager {
        final io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets flutterAssets;

        public PluginBindingFlutterAssetManager(android.content.res.AssetManager assetManager, io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets flutterAssets) {
            super(assetManager);
            this.flutterAssets = flutterAssets;
        }

        @Override // io.flutter.plugins.webviewflutter.FlutterAssetManager
        public java.lang.String getAssetFilePathByName(java.lang.String str) {
            return this.flutterAssets.getAssetFilePathByName(str);
        }
    }

    public FlutterAssetManager(android.content.res.AssetManager assetManager) {
        this.assetManager = assetManager;
    }

    public abstract java.lang.String getAssetFilePathByName(java.lang.String str);

    public java.lang.String[] list(java.lang.String str) {
        return this.assetManager.list(str);
    }
}
