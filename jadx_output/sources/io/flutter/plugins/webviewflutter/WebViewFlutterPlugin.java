package io.flutter.plugins.webviewflutter;

/* loaded from: classes16.dex */
public class WebViewFlutterPlugin implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware {
    private io.flutter.plugins.webviewflutter.InstanceManager instanceManager;
    private io.flutter.plugins.webviewflutter.JavaScriptChannelHostApiImpl javaScriptChannelHostApi;
    private io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding pluginBinding;
    private io.flutter.plugins.webviewflutter.WebViewHostApiImpl webViewHostApi;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setUp$0(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setUp$1(io.flutter.plugin.common.BinaryMessenger binaryMessenger, long j17) {
        new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.JavaObjectFlutterApi(binaryMessenger).dispose(java.lang.Long.valueOf(j17), new io.flutter.plugins.webviewflutter.WebViewFlutterPlugin$$a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUp$2() {
        this.instanceManager.clear();
    }

    private void setUp(final io.flutter.plugin.common.BinaryMessenger binaryMessenger, io.flutter.plugin.platform.PlatformViewRegistry platformViewRegistry, android.content.Context context, io.flutter.plugins.webviewflutter.FlutterAssetManager flutterAssetManager) {
        this.instanceManager = io.flutter.plugins.webviewflutter.InstanceManager.create(new io.flutter.plugins.webviewflutter.InstanceManager.FinalizationListener() { // from class: io.flutter.plugins.webviewflutter.WebViewFlutterPlugin$$b
            @Override // io.flutter.plugins.webviewflutter.InstanceManager.FinalizationListener
            public final void onFinalize(long j17) {
                io.flutter.plugins.webviewflutter.WebViewFlutterPlugin.lambda$setUp$1(io.flutter.plugin.common.BinaryMessenger.this, j17);
            }
        });
        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.InstanceManagerHostApi.setup(binaryMessenger, new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.InstanceManagerHostApi() { // from class: io.flutter.plugins.webviewflutter.WebViewFlutterPlugin$$c
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.InstanceManagerHostApi
            public final void clear() {
                io.flutter.plugins.webviewflutter.WebViewFlutterPlugin.this.lambda$setUp$2();
            }
        });
        platformViewRegistry.registerViewFactory("plugins.flutter.io/webview", new io.flutter.plugins.webviewflutter.FlutterWebViewFactory(this.instanceManager));
        this.webViewHostApi = new io.flutter.plugins.webviewflutter.WebViewHostApiImpl(this.instanceManager, binaryMessenger, new io.flutter.plugins.webviewflutter.WebViewHostApiImpl.WebViewProxy(), context);
        this.javaScriptChannelHostApi = new io.flutter.plugins.webviewflutter.JavaScriptChannelHostApiImpl(this.instanceManager, new io.flutter.plugins.webviewflutter.JavaScriptChannelHostApiImpl.JavaScriptChannelCreator(), new io.flutter.plugins.webviewflutter.JavaScriptChannelFlutterApiImpl(binaryMessenger, this.instanceManager), new android.os.Handler(context.getMainLooper()));
        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.JavaObjectHostApi.setup(binaryMessenger, new io.flutter.plugins.webviewflutter.JavaObjectHostApiImpl(this.instanceManager));
        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.setup(binaryMessenger, this.webViewHostApi);
        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.JavaScriptChannelHostApi.setup(binaryMessenger, this.javaScriptChannelHostApi);
        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientHostApi.setup(binaryMessenger, new io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl(this.instanceManager, new io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl.WebViewClientCreator(), new io.flutter.plugins.webviewflutter.WebViewClientFlutterApiImpl(binaryMessenger, this.instanceManager)));
        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi.setup(binaryMessenger, new io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl(this.instanceManager, new io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.WebChromeClientCreator(), new io.flutter.plugins.webviewflutter.WebChromeClientFlutterApiImpl(binaryMessenger, this.instanceManager)));
        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.DownloadListenerHostApi.setup(binaryMessenger, new io.flutter.plugins.webviewflutter.DownloadListenerHostApiImpl(this.instanceManager, new io.flutter.plugins.webviewflutter.DownloadListenerHostApiImpl.DownloadListenerCreator(), new io.flutter.plugins.webviewflutter.DownloadListenerFlutterApiImpl(binaryMessenger, this.instanceManager)));
        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.setup(binaryMessenger, new io.flutter.plugins.webviewflutter.WebSettingsHostApiImpl(this.instanceManager, new io.flutter.plugins.webviewflutter.WebSettingsHostApiImpl.WebSettingsCreator()));
        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FlutterAssetManagerHostApi.setup(binaryMessenger, new io.flutter.plugins.webviewflutter.FlutterAssetManagerHostApiImpl(flutterAssetManager));
        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi.setup(binaryMessenger, new io.flutter.plugins.webviewflutter.CookieManagerHostApiImpl(binaryMessenger, this.instanceManager));
        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebStorageHostApi.setup(binaryMessenger, new io.flutter.plugins.webviewflutter.WebStorageHostApiImpl(this.instanceManager, new io.flutter.plugins.webviewflutter.WebStorageHostApiImpl.WebStorageCreator()));
        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.PermissionRequestHostApi.setup(binaryMessenger, new io.flutter.plugins.webviewflutter.PermissionRequestHostApiImpl(binaryMessenger, this.instanceManager));
        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.GeolocationPermissionsCallbackHostApi.setup(binaryMessenger, new io.flutter.plugins.webviewflutter.GeolocationPermissionsCallbackHostApiImpl(binaryMessenger, this.instanceManager));
        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CustomViewCallbackHostApi.setup(binaryMessenger, new io.flutter.plugins.webviewflutter.CustomViewCallbackHostApiImpl(binaryMessenger, this.instanceManager));
        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerHostApi.setup(binaryMessenger, new io.flutter.plugins.webviewflutter.HttpAuthHandlerHostApiImpl(binaryMessenger, this.instanceManager));
    }

    private void updateContext(android.content.Context context) {
        this.webViewHostApi.setContext(context);
        this.javaScriptChannelHostApi.setPlatformThreadHandler(new android.os.Handler(context.getMainLooper()));
    }

    public io.flutter.plugins.webviewflutter.InstanceManager getInstanceManager() {
        return this.instanceManager;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding activityPluginBinding) {
        updateContext(activityPluginBinding.getActivity());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.pluginBinding = flutterPluginBinding;
        setUp(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getPlatformViewRegistry(), flutterPluginBinding.getApplicationContext(), new io.flutter.plugins.webviewflutter.FlutterAssetManager.PluginBindingFlutterAssetManager(flutterPluginBinding.getApplicationContext().getAssets(), flutterPluginBinding.getFlutterAssets()));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        updateContext(this.pluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        updateContext(this.pluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        io.flutter.plugins.webviewflutter.InstanceManager instanceManager = this.instanceManager;
        if (instanceManager != null) {
            instanceManager.stopFinalizationListener();
            this.instanceManager = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding activityPluginBinding) {
        updateContext(activityPluginBinding.getActivity());
    }
}
