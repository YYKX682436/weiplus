package io.flutter.embedding.engine.plugins;

/* loaded from: classes15.dex */
public interface FlutterPlugin {

    /* loaded from: classes13.dex */
    public interface FlutterAssets {
        java.lang.String getAssetFilePathByName(java.lang.String str);

        java.lang.String getAssetFilePathByName(java.lang.String str, java.lang.String str2);

        java.lang.String getAssetFilePathBySubpath(java.lang.String str);

        java.lang.String getAssetFilePathBySubpath(java.lang.String str, java.lang.String str2);
    }

    /* loaded from: classes15.dex */
    public static class FlutterPluginBinding {
        private final android.content.Context applicationContext;
        private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;
        private final io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets flutterAssets;
        private final io.flutter.embedding.engine.FlutterEngine flutterEngine;
        private final io.flutter.embedding.engine.FlutterEngineGroup group;
        private final io.flutter.plugin.platform.PlatformViewRegistry platformViewRegistry;
        private final io.flutter.view.TextureRegistry textureRegistry;

        public FlutterPluginBinding(android.content.Context context, io.flutter.embedding.engine.FlutterEngine flutterEngine, io.flutter.plugin.common.BinaryMessenger binaryMessenger, io.flutter.view.TextureRegistry textureRegistry, io.flutter.plugin.platform.PlatformViewRegistry platformViewRegistry, io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets flutterAssets, io.flutter.embedding.engine.FlutterEngineGroup flutterEngineGroup) {
            this.applicationContext = context;
            this.flutterEngine = flutterEngine;
            this.binaryMessenger = binaryMessenger;
            this.textureRegistry = textureRegistry;
            this.platformViewRegistry = platformViewRegistry;
            this.flutterAssets = flutterAssets;
            this.group = flutterEngineGroup;
        }

        public android.content.Context getApplicationContext() {
            return this.applicationContext;
        }

        public io.flutter.plugin.common.BinaryMessenger getBinaryMessenger() {
            return this.binaryMessenger;
        }

        public io.flutter.embedding.engine.FlutterEngineGroup getEngineGroup() {
            return this.group;
        }

        public io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets getFlutterAssets() {
            return this.flutterAssets;
        }

        @java.lang.Deprecated
        public io.flutter.embedding.engine.FlutterEngine getFlutterEngine() {
            return this.flutterEngine;
        }

        public io.flutter.plugin.platform.PlatformViewRegistry getPlatformViewRegistry() {
            return this.platformViewRegistry;
        }

        public io.flutter.view.TextureRegistry getTextureRegistry() {
            return this.textureRegistry;
        }
    }

    void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding);

    void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding);
}
