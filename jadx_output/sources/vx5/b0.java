package vx5;

/* loaded from: classes13.dex */
public class b0 extends com.tencent.xweb.pinus.sdk.WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vx5.i0 f441330a;

    public b0(vx5.i0 i0Var) {
        this.f441330a = i0Var;
    }

    @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
    public android.view.View getVideoLoadingProgressView() {
        vx5.i0 i0Var = this.f441330a;
        com.tencent.xweb.s0 s0Var = i0Var.f441358i;
        return s0Var != null ? s0Var.a() : android.view.LayoutInflater.from(i0Var.f441353d.getContext()).inflate(com.tencent.xwebsdk.R.layout.xweb_video_progress, (android.view.ViewGroup) null);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
    public boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        android.webkit.ConsoleMessage.MessageLevel messageLevel = android.webkit.ConsoleMessage.MessageLevel.ERROR;
        android.webkit.ConsoleMessage.MessageLevel messageLevel2 = consoleMessage.messageLevel();
        vx5.i0 i0Var = this.f441330a;
        if (messageLevel == messageLevel2) {
            i0Var.getClass();
        }
        com.tencent.xweb.s0 s0Var = i0Var.f441358i;
        return s0Var != null ? s0Var.b(consoleMessage) : super.onConsoleMessage(consoleMessage);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
    public boolean onCreateWindow(com.tencent.xweb.pinus.sdk.WebView webView, boolean z17, boolean z18, android.os.Message message) {
        vx5.i0 i0Var = this.f441330a;
        com.tencent.xweb.s0 s0Var = i0Var.f441358i;
        if (s0Var == null) {
            return super.onCreateWindow(webView, z17, z18, message);
        }
        com.tencent.xweb.WebView webView2 = i0Var.f441353d;
        s0Var.getClass();
        return false;
    }

    @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
    public void onExitFullscreenVideo(android.graphics.Bitmap bitmap) {
        by5.c4.f("PinusWebView", "onExitFullscreenVideo");
        com.tencent.xweb.s0 s0Var = this.f441330a.f441358i;
        if (s0Var != null) {
            s0Var.e(bitmap);
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
        by5.c4.f("PinusWebView", "onGeolocationPermissionsHidePrompt");
        com.tencent.xweb.s0 s0Var = this.f441330a.f441358i;
        if (s0Var != null) {
            s0Var.f();
        } else {
            super.onGeolocationPermissionsHidePrompt();
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
        by5.c4.f("PinusWebView", "onGeolocationPermissionsShowPrompt");
        com.tencent.xweb.s0 s0Var = this.f441330a.f441358i;
        if (s0Var != null) {
            s0Var.g(str, callback);
        } else {
            super.onGeolocationPermissionsShowPrompt(str, callback);
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
    public void onGetSampleString(com.tencent.xweb.pinus.sdk.WebView webView, java.util.Map map) {
        com.tencent.xweb.d3 d3Var = this.f441330a.f441368v;
        d3Var.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.putAll(map);
        by5.c4.b("XWebTranslateLogic", "translate: OnGetSampleString orgHashMap size = " + map.size() + " resultHashMap size = " + hashMap.size());
        bundle.putSerializable("sample_hashmap", hashMap);
        com.tencent.xweb.internal.ProxyWebViewClientExtension proxyWebViewClientExtension = ((vx5.i0) d3Var.f220245a).f441365s;
        if (proxyWebViewClientExtension != null) {
            proxyWebViewClientExtension.onMiscCallBack("onGetSampleString", bundle);
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
    public void onGetTranslateString(com.tencent.xweb.pinus.sdk.WebView webView, java.util.Map map) {
        com.tencent.xweb.d3 d3Var = this.f441330a.f441368v;
        d3Var.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.putAll(map);
        by5.c4.b("XWebTranslateLogic", "translate: onGetTranslateString orgHashMap size = " + map.size() + " resultHashMap size = " + hashMap.size());
        hashMap.size();
        bundle.putSerializable("translate_hashmap", hashMap);
        com.tencent.xweb.internal.ProxyWebViewClientExtension proxyWebViewClientExtension = ((vx5.i0) d3Var.f220245a).f441365s;
        if (proxyWebViewClientExtension != null) {
            proxyWebViewClientExtension.onMiscCallBack("onGetTranslateString", bundle);
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
    public void onHideCustomView() {
        by5.c4.f("PinusWebView", "onHideCustomView");
        vx5.i0 i0Var = this.f441330a;
        i0Var.f441369w = null;
        if (i0Var.f441370x) {
            i0Var.f441370x = false;
            by5.c4.f("PinusWebView", "onHideCustomView, mIsMediaPlaybackRequiresUserGesture:" + i0Var.f441371y + ", mIsVideoPlaybackRequiresUserGesture:" + i0Var.f441372z);
            ((com.tencent.xweb.pinus.sdk.v) i0Var.f441355f.getSettings()).a(i0Var.f441371y);
            ((com.tencent.xweb.pinus.sdk.v) i0Var.f441355f.getSettings()).b(i0Var.f441372z);
        }
        com.tencent.xweb.s0 s0Var = i0Var.f441358i;
        if (s0Var != null ? s0Var.d() : false) {
            by5.c4.f("PinusWebView", "onHideCustomView isHandled:true");
            return;
        }
        i0Var.f441356g.setVisibility(0);
        sx5.a aVar = i0Var.f441367u;
        if (aVar != null) {
            aVar.e();
            return;
        }
        com.tencent.xweb.s0 s0Var2 = i0Var.f441358i;
        if (s0Var2 != null) {
            s0Var2.h();
        } else {
            super.onHideCustomView();
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
    public boolean onJsAlert(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str, java.lang.String str2, com.tencent.xweb.pinus.sdk.i iVar) {
        by5.c4.f("PinusWebView", "onJsAlert, message:" + str2);
        vx5.i0 i0Var = this.f441330a;
        com.tencent.xweb.s0 s0Var = i0Var.f441358i;
        return s0Var != null ? s0Var.i(i0Var.f441353d, str, str2, new vx5.r(iVar)) : super.onJsAlert(webView, str, str2, iVar);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
    public boolean onJsAlertInner(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        return onJsAlert(webView, str, str2, new com.tencent.xweb.pinus.sdk.j(obj));
    }

    @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
    public boolean onJsConfirm(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str, java.lang.String str2, com.tencent.xweb.pinus.sdk.i iVar) {
        by5.c4.f("PinusWebView", "onJsConfirm, message:" + str2);
        vx5.i0 i0Var = this.f441330a;
        com.tencent.xweb.s0 s0Var = i0Var.f441358i;
        return s0Var != null ? s0Var.j(i0Var.f441353d, str, str2, new vx5.r(iVar)) : super.onJsConfirm(webView, str, str2, iVar);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
    public boolean onJsConfirmInner(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        return onJsConfirm(webView, str, str2, new com.tencent.xweb.pinus.sdk.j(obj));
    }

    @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
    public boolean onJsPrompt(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.xweb.pinus.sdk.i iVar) {
        by5.c4.f("PinusWebView", "onJsPrompt, message:" + str2);
        vx5.i0 i0Var = this.f441330a;
        com.tencent.xweb.s0 s0Var = i0Var.f441358i;
        return s0Var != null ? s0Var.k(i0Var.f441353d, str, str2, str3, new vx5.q(iVar)) : super.onJsPrompt(webView, str, str2, str3, iVar);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
    public boolean onJsPromptInner(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj) {
        return onJsPrompt(webView, str, str2, str3, new com.tencent.xweb.pinus.sdk.j(obj));
    }

    @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
    public void onPermissionRequest(android.webkit.PermissionRequest permissionRequest) {
        com.tencent.xweb.s0 s0Var = this.f441330a.f441358i;
        if (s0Var != null) {
            s0Var.l(permissionRequest);
        } else {
            super.onPermissionRequest(permissionRequest);
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
    public void onPermissionRequestCanceled(android.webkit.PermissionRequest permissionRequest) {
        com.tencent.xweb.s0 s0Var = this.f441330a.f441358i;
        if (s0Var != null) {
            s0Var.m(permissionRequest);
        } else {
            super.onPermissionRequestCanceled(permissionRequest);
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
    public void onProgressChanged(com.tencent.xweb.pinus.sdk.WebView webView, int i17) {
        vx5.i0 i0Var = this.f441330a;
        com.tencent.xweb.s0 s0Var = i0Var.f441358i;
        if (s0Var != null) {
            s0Var.n(i0Var.f441353d, i17);
        } else {
            super.onProgressChanged(webView, i17);
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
    public void onReceivedTitle(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str) {
        by5.c4.f("PinusWebView", "onReceivedTitle: " + str);
        vx5.i0 i0Var = this.f441330a;
        com.tencent.xweb.s0 s0Var = i0Var.f441358i;
        if (s0Var != null) {
            s0Var.o(i0Var.f441353d, str);
        } else {
            super.onReceivedTitle(webView, str);
        }
        sx5.a aVar = i0Var.f441367u;
        if (aVar != null) {
            aVar.g(true, i0Var.f441353d.getFullscreenVideoKind() == com.tencent.xweb.c1.HOOK_EVALUTE_JS);
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
    public void onRequestFocus(com.tencent.xweb.pinus.sdk.WebView webView) {
        vx5.i0 i0Var = this.f441330a;
        com.tencent.xweb.s0 s0Var = i0Var.f441358i;
        if (s0Var == null) {
            super.onRequestFocus(webView);
        } else {
            com.tencent.xweb.WebView webView2 = i0Var.f441353d;
            s0Var.getClass();
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
    public void onShowCustomView(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        boolean z17;
        boolean z18;
        by5.i0 i0Var;
        by5.i0 i0Var2;
        by5.c4.f("PinusWebView", "onShowCustomView");
        vx5.i0 i0Var3 = this.f441330a;
        i0Var3.f441369w = customViewCallback;
        if (!i0Var3.f441370x) {
            i0Var3.f441370x = true;
            com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) i0Var3.f441355f.getSettings();
            vVar.getClass();
            try {
                synchronized (vVar) {
                    i0Var2 = vVar.f220475d;
                    if (i0Var2 == null) {
                        i0Var2 = new by5.i0(vVar.f220472a, "getMediaPlaybackRequiresUserGesture", new java.lang.Class[0]);
                        vVar.f220475d = i0Var2;
                    }
                }
                z17 = ((java.lang.Boolean) i0Var2.b(new java.lang.Object[0])).booleanValue();
            } catch (java.lang.UnsupportedOperationException unused) {
                z17 = false;
            }
            i0Var3.f441371y = z17;
            vx5.i0 i0Var4 = this.f441330a;
            com.tencent.xweb.pinus.sdk.v vVar2 = (com.tencent.xweb.pinus.sdk.v) i0Var4.f441355f.getSettings();
            vVar2.getClass();
            try {
                synchronized (vVar2) {
                    i0Var = vVar2.R;
                    if (i0Var == null) {
                        i0Var = new by5.i0(vVar2.f220472a, "getVideoPlaybackRequiresUserGesture", new java.lang.Class[0]);
                        vVar2.R = i0Var;
                    }
                }
                z18 = ((java.lang.Boolean) i0Var.b(new java.lang.Object[0])).booleanValue();
            } catch (java.lang.UnsupportedOperationException unused2) {
                z18 = false;
            }
            i0Var4.f441372z = z18;
            by5.c4.f("PinusWebView", "onShowCustomView, mIsMediaPlaybackRequiresUserGesture:" + this.f441330a.f441371y + ", mIsVideoPlaybackRequiresUserGesture:" + this.f441330a.f441372z);
            ((com.tencent.xweb.pinus.sdk.v) this.f441330a.f441355f.getSettings()).a(false);
            ((com.tencent.xweb.pinus.sdk.v) this.f441330a.f441355f.getSettings()).b(false);
        }
        com.tencent.xweb.s0 s0Var = this.f441330a.f441358i;
        boolean c17 = s0Var != null ? s0Var.c(view, customViewCallback) : false;
        com.tencent.xweb.n1 n1Var = by5.s0.f36595c;
        if (n1Var != null) {
            n1Var.b(577L, 52L, 1L);
            by5.s0.f36595c.b(1749L, 4L, 1L);
        }
        if (c17) {
            by5.c4.f("PinusWebView", "onShowCustomView isHandled:true");
            return;
        }
        this.f441330a.f441356g.setVisibility(4);
        vx5.i0 i0Var5 = this.f441330a;
        sx5.a aVar = i0Var5.f441367u;
        if (aVar != null) {
            by5.s0.r(com.tencent.xweb.f1.WV_KIND_PINUS, aVar instanceof sx5.a1, i0Var5.getUrl());
            this.f441330a.f441367u.b(view, customViewCallback);
            return;
        }
        com.tencent.xweb.s0 s0Var2 = i0Var5.f441358i;
        if (s0Var2 != null) {
            s0Var2.p(view, customViewCallback);
        } else {
            super.onShowCustomView(view, customViewCallback);
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.WebChromeClient
    public boolean onShowFileChooser(com.tencent.xweb.pinus.sdk.WebView webView, android.webkit.ValueCallback valueCallback, android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
        by5.c4.f("PinusWebView", "onShowFileChooser last method");
        vx5.i0 i0Var = this.f441330a;
        com.tencent.xweb.s0 s0Var = i0Var.f441358i;
        return s0Var != null ? s0Var.q(i0Var.f441353d, valueCallback, new vx5.o(fileChooserParams)) : super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }
}
