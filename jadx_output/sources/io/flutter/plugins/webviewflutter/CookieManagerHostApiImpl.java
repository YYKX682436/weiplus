package io.flutter.plugins.webviewflutter;

/* loaded from: classes13.dex */
public class CookieManagerHostApiImpl implements io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi {
    private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;
    private final io.flutter.plugins.webviewflutter.InstanceManager instanceManager;
    private final io.flutter.plugins.webviewflutter.CookieManagerHostApiImpl.CookieManagerProxy proxy;
    private final io.flutter.plugins.webviewflutter.CookieManagerHostApiImpl.AndroidSdkChecker sdkChecker;

    /* loaded from: classes13.dex */
    public interface AndroidSdkChecker {
        boolean sdkIsAtLeast(int i17);
    }

    /* loaded from: classes13.dex */
    public static class CookieManagerProxy {
        public android.webkit.CookieManager getInstance() {
            return android.webkit.CookieManager.getInstance();
        }
    }

    public CookieManagerHostApiImpl(io.flutter.plugin.common.BinaryMessenger binaryMessenger, io.flutter.plugins.webviewflutter.InstanceManager instanceManager) {
        this(binaryMessenger, instanceManager, new io.flutter.plugins.webviewflutter.CookieManagerHostApiImpl.CookieManagerProxy());
    }

    private android.webkit.CookieManager getCookieManagerInstance(java.lang.Long l17) {
        android.webkit.CookieManager cookieManager = (android.webkit.CookieManager) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(cookieManager);
        return cookieManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$0(int i17) {
        return android.os.Build.VERSION.SDK_INT >= i17;
    }

    private boolean removeCookiesPreL(android.webkit.CookieManager cookieManager) {
        boolean hasCookies = cookieManager.hasCookies();
        if (hasCookies) {
            cookieManager.removeAllCookie();
        }
        return hasCookies;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi
    public void attachInstance(java.lang.Long l17) {
        this.instanceManager.addDartCreatedInstance(this.proxy.getInstance(), l17.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi
    public void removeAllCookies(java.lang.Long l17, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.Result<java.lang.Boolean> result) {
        if (!this.sdkChecker.sdkIsAtLeast(21)) {
            result.success(java.lang.Boolean.valueOf(removeCookiesPreL(getCookieManagerInstance(l17))));
            return;
        }
        android.webkit.CookieManager cookieManagerInstance = getCookieManagerInstance(l17);
        java.util.Objects.requireNonNull(result);
        cookieManagerInstance.removeAllCookies(new android.webkit.ValueCallback() { // from class: io.flutter.plugins.webviewflutter.CookieManagerHostApiImpl$$a
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.Result.this.success((java.lang.Boolean) obj);
            }
        });
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi
    public void setAcceptThirdPartyCookies(java.lang.Long l17, java.lang.Long l18, java.lang.Boolean bool) {
        if (!this.sdkChecker.sdkIsAtLeast(21)) {
            throw new java.lang.UnsupportedOperationException("`setAcceptThirdPartyCookies` is unsupported on versions below `Build.VERSION_CODES.LOLLIPOP`.");
        }
        android.webkit.CookieManager cookieManagerInstance = getCookieManagerInstance(l17);
        android.webkit.WebView webView = (android.webkit.WebView) this.instanceManager.getInstance(l18.longValue());
        java.util.Objects.requireNonNull(webView);
        cookieManagerInstance.setAcceptThirdPartyCookies(webView, bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi
    public void setCookie(java.lang.Long l17, java.lang.String str, java.lang.String str2) {
        getCookieManagerInstance(l17).setCookie(str, str2);
    }

    public CookieManagerHostApiImpl(io.flutter.plugin.common.BinaryMessenger binaryMessenger, io.flutter.plugins.webviewflutter.InstanceManager instanceManager, io.flutter.plugins.webviewflutter.CookieManagerHostApiImpl.CookieManagerProxy cookieManagerProxy) {
        this(binaryMessenger, instanceManager, cookieManagerProxy, new io.flutter.plugins.webviewflutter.CookieManagerHostApiImpl$$b());
    }

    public CookieManagerHostApiImpl(io.flutter.plugin.common.BinaryMessenger binaryMessenger, io.flutter.plugins.webviewflutter.InstanceManager instanceManager, io.flutter.plugins.webviewflutter.CookieManagerHostApiImpl.CookieManagerProxy cookieManagerProxy, io.flutter.plugins.webviewflutter.CookieManagerHostApiImpl.AndroidSdkChecker androidSdkChecker) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
        this.proxy = cookieManagerProxy;
        this.sdkChecker = androidSdkChecker;
    }
}
