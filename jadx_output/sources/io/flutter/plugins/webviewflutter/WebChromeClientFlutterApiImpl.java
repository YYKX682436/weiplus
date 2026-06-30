package io.flutter.plugins.webviewflutter;

/* loaded from: classes16.dex */
public class WebChromeClientFlutterApiImpl extends io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi {
    private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;
    private final io.flutter.plugins.webviewflutter.InstanceManager instanceManager;
    private final io.flutter.plugins.webviewflutter.WebViewFlutterApiImpl webViewFlutterApi;

    /* renamed from: io.flutter.plugins.webviewflutter.WebChromeClientFlutterApiImpl$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$webkit$ConsoleMessage$MessageLevel;

        static {
            int[] iArr = new int[android.webkit.ConsoleMessage.MessageLevel.values().length];
            $SwitchMap$android$webkit$ConsoleMessage$MessageLevel = iArr;
            try {
                iArr[android.webkit.ConsoleMessage.MessageLevel.TIP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[android.webkit.ConsoleMessage.MessageLevel.LOG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[android.webkit.ConsoleMessage.MessageLevel.WARNING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[android.webkit.ConsoleMessage.MessageLevel.ERROR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[android.webkit.ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    public WebChromeClientFlutterApiImpl(io.flutter.plugin.common.BinaryMessenger binaryMessenger, io.flutter.plugins.webviewflutter.InstanceManager instanceManager) {
        super(binaryMessenger);
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
        this.webViewFlutterApi = new io.flutter.plugins.webviewflutter.WebViewFlutterApiImpl(binaryMessenger, instanceManager);
    }

    private long getIdentifierForClient(android.webkit.WebChromeClient webChromeClient) {
        java.lang.Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        if (identifierForStrongReference != null) {
            return identifierForStrongReference.longValue();
        }
        throw new java.lang.IllegalStateException("Could not find identifier for WebChromeClient.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onGeolocationPermissionsShowPrompt$3(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPermissionRequest$4(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onProgressChanged$0(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onShowCustomView$5(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onShowCustomView$6(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onShowFileChooser$1(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onShowFileChooser$2(java.lang.Void r07) {
    }

    private static io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessageLevel toConsoleMessageLevel(android.webkit.ConsoleMessage.MessageLevel messageLevel) {
        int i17 = io.flutter.plugins.webviewflutter.WebChromeClientFlutterApiImpl.AnonymousClass1.$SwitchMap$android$webkit$ConsoleMessage$MessageLevel[messageLevel.ordinal()];
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessageLevel.UNKNOWN : io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessageLevel.DEBUG : io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessageLevel.ERROR : io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessageLevel.WARNING : io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessageLevel.LOG : io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessageLevel.TIP;
    }

    public void onConsoleMessage(android.webkit.WebChromeClient webChromeClient, android.webkit.ConsoleMessage consoleMessage, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
        java.lang.Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        java.util.Objects.requireNonNull(identifierForStrongReference);
        super.onConsoleMessage(identifierForStrongReference, new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessage.Builder().setLineNumber(java.lang.Long.valueOf(consoleMessage.lineNumber())).setMessage(consoleMessage.message()).setLevel(toConsoleMessageLevel(consoleMessage.messageLevel())).setSourceId(consoleMessage.sourceId()).build(), reply);
    }

    public void onGeolocationPermissionsHidePrompt(android.webkit.WebChromeClient webChromeClient, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
        java.lang.Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        java.util.Objects.requireNonNull(identifierForStrongReference);
        super.onGeolocationPermissionsHidePrompt(identifierForStrongReference, reply);
    }

    public void onGeolocationPermissionsShowPrompt(android.webkit.WebChromeClient webChromeClient, java.lang.String str, android.webkit.GeolocationPermissions.Callback callback, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
        new io.flutter.plugins.webviewflutter.GeolocationPermissionsCallbackFlutterApiImpl(this.binaryMessenger, this.instanceManager).create(callback, new io.flutter.plugins.webviewflutter.WebChromeClientFlutterApiImpl$$c());
        java.lang.Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        java.util.Objects.requireNonNull(identifierForStrongReference);
        java.lang.Long identifierForStrongReference2 = this.instanceManager.getIdentifierForStrongReference(callback);
        java.util.Objects.requireNonNull(identifierForStrongReference2);
        onGeolocationPermissionsShowPrompt(identifierForStrongReference, identifierForStrongReference2, str, reply);
    }

    public void onHideCustomView(android.webkit.WebChromeClient webChromeClient, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
        java.lang.Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        java.util.Objects.requireNonNull(identifierForStrongReference);
        super.onHideCustomView(identifierForStrongReference, reply);
    }

    public void onJsAlert(android.webkit.WebChromeClient webChromeClient, java.lang.String str, java.lang.String str2, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
        java.lang.Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        java.util.Objects.requireNonNull(identifierForStrongReference);
        super.onJsAlert(identifierForStrongReference, str, str2, reply);
    }

    public void onJsConfirm(android.webkit.WebChromeClient webChromeClient, java.lang.String str, java.lang.String str2, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<java.lang.Boolean> reply) {
        java.lang.Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        java.util.Objects.requireNonNull(identifierForStrongReference);
        super.onJsConfirm(identifierForStrongReference, str, str2, reply);
    }

    public void onJsPrompt(android.webkit.WebChromeClient webChromeClient, java.lang.String str, java.lang.String str2, java.lang.String str3, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<java.lang.String> reply) {
        java.lang.Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        java.util.Objects.requireNonNull(identifierForStrongReference);
        super.onJsPrompt(identifierForStrongReference, str, str2, str3, reply);
    }

    public void onPermissionRequest(android.webkit.WebChromeClient webChromeClient, android.webkit.PermissionRequest permissionRequest, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
        new io.flutter.plugins.webviewflutter.PermissionRequestFlutterApiImpl(this.binaryMessenger, this.instanceManager).create(permissionRequest, permissionRequest.getResources(), new io.flutter.plugins.webviewflutter.WebChromeClientFlutterApiImpl$$g());
        java.lang.Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        java.util.Objects.requireNonNull(identifierForStrongReference);
        java.lang.Long identifierForStrongReference2 = this.instanceManager.getIdentifierForStrongReference(permissionRequest);
        java.util.Objects.requireNonNull(identifierForStrongReference2);
        super.onPermissionRequest(identifierForStrongReference, identifierForStrongReference2, reply);
    }

    public void onProgressChanged(android.webkit.WebChromeClient webChromeClient, android.webkit.WebView webView, java.lang.Long l17, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
        this.webViewFlutterApi.create(webView, new io.flutter.plugins.webviewflutter.WebChromeClientFlutterApiImpl$$d());
        java.lang.Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        java.util.Objects.requireNonNull(identifierForStrongReference);
        super.onProgressChanged(java.lang.Long.valueOf(getIdentifierForClient(webChromeClient)), identifierForStrongReference, l17, reply);
    }

    public void onShowCustomView(android.webkit.WebChromeClient webChromeClient, android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
        new io.flutter.plugins.webviewflutter.ViewFlutterApiImpl(this.binaryMessenger, this.instanceManager).create(view, new io.flutter.plugins.webviewflutter.WebChromeClientFlutterApiImpl$$a());
        new io.flutter.plugins.webviewflutter.CustomViewCallbackFlutterApiImpl(this.binaryMessenger, this.instanceManager).create(customViewCallback, new io.flutter.plugins.webviewflutter.WebChromeClientFlutterApiImpl$$b());
        java.lang.Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        java.util.Objects.requireNonNull(identifierForStrongReference);
        java.lang.Long identifierForStrongReference2 = this.instanceManager.getIdentifierForStrongReference(view);
        java.util.Objects.requireNonNull(identifierForStrongReference2);
        java.lang.Long identifierForStrongReference3 = this.instanceManager.getIdentifierForStrongReference(customViewCallback);
        java.util.Objects.requireNonNull(identifierForStrongReference3);
        onShowCustomView(identifierForStrongReference, identifierForStrongReference2, identifierForStrongReference3, reply);
    }

    public void onShowFileChooser(android.webkit.WebChromeClient webChromeClient, android.webkit.WebView webView, android.webkit.WebChromeClient.FileChooserParams fileChooserParams, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<java.util.List<java.lang.String>> reply) {
        this.webViewFlutterApi.create(webView, new io.flutter.plugins.webviewflutter.WebChromeClientFlutterApiImpl$$e());
        new io.flutter.plugins.webviewflutter.FileChooserParamsFlutterApiImpl(this.binaryMessenger, this.instanceManager).create(fileChooserParams, new io.flutter.plugins.webviewflutter.WebChromeClientFlutterApiImpl$$f());
        java.lang.Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        java.util.Objects.requireNonNull(identifierForStrongReference);
        java.lang.Long identifierForStrongReference2 = this.instanceManager.getIdentifierForStrongReference(webView);
        java.util.Objects.requireNonNull(identifierForStrongReference2);
        java.lang.Long identifierForStrongReference3 = this.instanceManager.getIdentifierForStrongReference(fileChooserParams);
        java.util.Objects.requireNonNull(identifierForStrongReference3);
        onShowFileChooser(identifierForStrongReference, identifierForStrongReference2, identifierForStrongReference3, reply);
    }
}
