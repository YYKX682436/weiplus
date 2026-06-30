package io.flutter.plugins.webviewflutter;

/* loaded from: classes16.dex */
public class WebChromeClientHostApiImpl implements io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi {
    private android.content.Context context;
    private final io.flutter.plugins.webviewflutter.WebChromeClientFlutterApiImpl flutterApi;
    private final io.flutter.plugins.webviewflutter.InstanceManager instanceManager;
    private final io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.WebChromeClientCreator webChromeClientCreator;

    /* loaded from: classes13.dex */
    public static class SecureWebChromeClient extends android.webkit.WebChromeClient {
        android.webkit.WebViewClient webViewClient;

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(android.webkit.WebView webView, boolean z17, boolean z18, android.os.Message message) {
            return onCreateWindow(webView, message, new android.webkit.WebView(webView.getContext()));
        }

        public void setWebViewClient(android.webkit.WebViewClient webViewClient) {
            this.webViewClient = webViewClient;
        }

        public boolean onCreateWindow(final android.webkit.WebView webView, android.os.Message message, android.webkit.WebView webView2) {
            if (this.webViewClient == null) {
                return false;
            }
            android.webkit.WebViewClient webViewClient = new android.webkit.WebViewClient() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.SecureWebChromeClient.1
                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(android.webkit.WebView webView3, android.webkit.WebResourceRequest webResourceRequest) {
                    if (io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.SecureWebChromeClient.this.webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest)) {
                        return true;
                    }
                    webView.loadUrl(webResourceRequest.getUrl().toString());
                    return true;
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(android.webkit.WebView webView3, java.lang.String str) {
                    if (io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.SecureWebChromeClient.this.webViewClient.shouldOverrideUrlLoading(webView, str)) {
                        return true;
                    }
                    webView.loadUrl(str);
                    return true;
                }
            };
            if (webView2 == null) {
                webView2 = new android.webkit.WebView(webView.getContext());
            }
            webView2.setWebViewClient(webViewClient);
            ((android.webkit.WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    /* loaded from: classes16.dex */
    public static class WebChromeClientCreator {
        public io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.WebChromeClientImpl createWebChromeClient(io.flutter.plugins.webviewflutter.WebChromeClientFlutterApiImpl webChromeClientFlutterApiImpl) {
            return new io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.WebChromeClientImpl(webChromeClientFlutterApiImpl);
        }
    }

    /* loaded from: classes16.dex */
    public static class WebChromeClientImpl extends io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.SecureWebChromeClient {
        private final io.flutter.plugins.webviewflutter.WebChromeClientFlutterApiImpl flutterApi;
        private boolean returnValueForOnShowFileChooser = false;
        private boolean returnValueForOnConsoleMessage = false;
        private boolean returnValueForOnJsAlert = false;
        private boolean returnValueForOnJsConfirm = false;
        private boolean returnValueForOnJsPrompt = false;

        public WebChromeClientImpl(io.flutter.plugins.webviewflutter.WebChromeClientFlutterApiImpl webChromeClientFlutterApiImpl) {
            this.flutterApi = webChromeClientFlutterApiImpl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onConsoleMessage$7(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onGeolocationPermissionsHidePrompt$4(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onGeolocationPermissionsShowPrompt$3(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onHideCustomView$2(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onJsConfirm$9(android.webkit.JsResult jsResult, java.lang.Boolean bool) {
            if (bool.booleanValue()) {
                jsResult.confirm();
            } else {
                jsResult.cancel();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onJsPrompt$10(android.webkit.JsPromptResult jsPromptResult, java.lang.String str) {
            if (str != null) {
                jsPromptResult.confirm(str);
            } else {
                jsPromptResult.cancel();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onPermissionRequest$6(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onProgressChanged$0(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onShowCustomView$1(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onShowFileChooser$5(boolean z17, android.webkit.ValueCallback valueCallback, java.util.List list) {
            if (z17) {
                android.net.Uri[] uriArr = new android.net.Uri[list.size()];
                for (int i17 = 0; i17 < list.size(); i17++) {
                    uriArr[i17] = android.net.Uri.parse((java.lang.String) list.get(i17));
                }
                valueCallback.onReceiveValue(uriArr);
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
            this.flutterApi.onConsoleMessage(this, consoleMessage, new io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl$WebChromeClientImpl$$b());
            return this.returnValueForOnConsoleMessage;
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsHidePrompt() {
            this.flutterApi.onGeolocationPermissionsHidePrompt(this, new io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl$WebChromeClientImpl$$c());
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
            this.flutterApi.onGeolocationPermissionsShowPrompt(this, str, callback, new io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl$WebChromeClientImpl$$e());
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            this.flutterApi.onHideCustomView(this, new io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl$WebChromeClientImpl$$f());
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, final android.webkit.JsResult jsResult) {
            if (!this.returnValueForOnJsAlert) {
                return false;
            }
            this.flutterApi.onJsAlert(this, str, str2, new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl$WebChromeClientImpl$$j
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply
                public final void reply(java.lang.Object obj) {
                    jsResult.confirm();
                }
            });
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, final android.webkit.JsResult jsResult) {
            if (!this.returnValueForOnJsConfirm) {
                return false;
            }
            this.flutterApi.onJsConfirm(this, str, str2, new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl$WebChromeClientImpl$$i
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.WebChromeClientImpl.lambda$onJsConfirm$9(jsResult, (java.lang.Boolean) obj);
                }
            });
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, final android.webkit.JsPromptResult jsPromptResult) {
            if (!this.returnValueForOnJsPrompt) {
                return false;
            }
            this.flutterApi.onJsPrompt(this, str, str2, str3, new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl$WebChromeClientImpl$$d
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.WebChromeClientImpl.lambda$onJsPrompt$10(jsPromptResult, (java.lang.String) obj);
                }
            });
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(android.webkit.PermissionRequest permissionRequest) {
            this.flutterApi.onPermissionRequest(this, permissionRequest, new io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl$WebChromeClientImpl$$k());
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(android.webkit.WebView webView, int i17) {
            this.flutterApi.onProgressChanged(this, webView, java.lang.Long.valueOf(i17), new io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl$WebChromeClientImpl$$g());
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
            this.flutterApi.onShowCustomView(this, view, customViewCallback, new io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl$WebChromeClientImpl$$h());
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(android.webkit.WebView webView, final android.webkit.ValueCallback<android.net.Uri[]> valueCallback, android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
            final boolean z17 = this.returnValueForOnShowFileChooser;
            this.flutterApi.onShowFileChooser(this, webView, fileChooserParams, new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl$WebChromeClientImpl$$a
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.WebChromeClientImpl.lambda$onShowFileChooser$5(z17, valueCallback, (java.util.List) obj);
                }
            });
            return z17;
        }

        public void setReturnValueForOnConsoleMessage(boolean z17) {
            this.returnValueForOnConsoleMessage = z17;
        }

        public void setReturnValueForOnJsAlert(boolean z17) {
            this.returnValueForOnJsAlert = z17;
        }

        public void setReturnValueForOnJsConfirm(boolean z17) {
            this.returnValueForOnJsConfirm = z17;
        }

        public void setReturnValueForOnJsPrompt(boolean z17) {
            this.returnValueForOnJsPrompt = z17;
        }

        public void setReturnValueForOnShowFileChooser(boolean z17) {
            this.returnValueForOnShowFileChooser = z17;
        }
    }

    public WebChromeClientHostApiImpl(io.flutter.plugins.webviewflutter.InstanceManager instanceManager, io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.WebChromeClientCreator webChromeClientCreator, io.flutter.plugins.webviewflutter.WebChromeClientFlutterApiImpl webChromeClientFlutterApiImpl) {
        this.instanceManager = instanceManager;
        this.webChromeClientCreator = webChromeClientCreator;
        this.flutterApi = webChromeClientFlutterApiImpl;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi
    public void create(java.lang.Long l17) {
        this.instanceManager.addDartCreatedInstance(this.webChromeClientCreator.createWebChromeClient(this.flutterApi), l17.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi
    public void setSynchronousReturnValueForOnConsoleMessage(java.lang.Long l17, java.lang.Boolean bool) {
        io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.WebChromeClientImpl webChromeClientImpl = (io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.WebChromeClientImpl) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webChromeClientImpl);
        webChromeClientImpl.setReturnValueForOnConsoleMessage(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi
    public void setSynchronousReturnValueForOnJsAlert(java.lang.Long l17, java.lang.Boolean bool) {
        io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.WebChromeClientImpl webChromeClientImpl = (io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.WebChromeClientImpl) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webChromeClientImpl);
        webChromeClientImpl.setReturnValueForOnJsAlert(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi
    public void setSynchronousReturnValueForOnJsConfirm(java.lang.Long l17, java.lang.Boolean bool) {
        io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.WebChromeClientImpl webChromeClientImpl = (io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.WebChromeClientImpl) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webChromeClientImpl);
        webChromeClientImpl.setReturnValueForOnJsConfirm(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi
    public void setSynchronousReturnValueForOnJsPrompt(java.lang.Long l17, java.lang.Boolean bool) {
        io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.WebChromeClientImpl webChromeClientImpl = (io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.WebChromeClientImpl) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webChromeClientImpl);
        webChromeClientImpl.setReturnValueForOnJsPrompt(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi
    public void setSynchronousReturnValueForOnShowFileChooser(java.lang.Long l17, java.lang.Boolean bool) {
        io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.WebChromeClientImpl webChromeClientImpl = (io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.WebChromeClientImpl) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webChromeClientImpl);
        webChromeClientImpl.setReturnValueForOnShowFileChooser(bool.booleanValue());
    }
}
