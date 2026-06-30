package la3;

/* loaded from: classes8.dex */
public final class j implements io.flutter.plugin.platform.PlatformView, io.flutter.plugin.common.MethodChannel.MethodCallHandler, la3.a {

    /* renamed from: d, reason: collision with root package name */
    public final io.flutter.plugin.common.MethodChannel f317539d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f317540e;

    /* JADX WARN: Removed duplicated region for block: B:83:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c0 A[Catch: all -> 0x01c4, TRY_LEAVE, TryCatch #0 {all -> 0x01c4, blocks: (B:76:0x016f, B:82:0x018a, B:85:0x01a2, B:89:0x01c0), top: B:75:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(android.content.Context r22, int r23, java.util.Map r24, io.flutter.plugin.common.MethodChannel r25) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: la3.j.<init>(android.content.Context, int, java.util.Map, io.flutter.plugin.common.MethodChannel):void");
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppWebviewView", "LiteAppWebview is dispose!!!");
        io.flutter.plugin.common.MethodChannel methodChannel = this.f317539d;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        android.view.View view = this.f317540e;
        if (!(view instanceof com.tencent.mm.ui.widget.MMWebView)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppWebviewView", "view not is MMWebview.");
            return;
        }
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.widget.MMWebView");
        com.tencent.mm.ui.widget.MMWebView mMWebView = (com.tencent.mm.ui.widget.MMWebView) view;
        if (mMWebView.f211376y) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppWebviewView", "webview already destroy.");
            return;
        }
        java.lang.Object webViewClient = mMWebView.getWebViewClient();
        if (webViewClient instanceof zg0.q2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppWebviewView", "webview controller destroy");
            ((com.tencent.mm.plugin.webview.core.e3) ((zg0.q2) webViewClient)).D0();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppWebviewView", "webview destroy");
        mMWebView.destroy();
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public android.view.View getView() {
        return this.f317540e;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        kotlin.jvm.internal.o.g(methodCall, "methodCall");
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppWebviewView", "onMethodCall " + methodCall.method + ", " + methodCall.arguments);
        java.lang.String str = methodCall.method;
        android.view.View view = this.f317540e;
        com.tencent.mm.ui.widget.MMWebView mMWebView = view instanceof com.tencent.mm.ui.widget.MMWebView ? (com.tencent.mm.ui.widget.MMWebView) view : null;
        if (mMWebView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppWebviewView", "view not is MMWebview");
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (str.equals("goBack")) {
            mMWebView.goBack();
        } else if (str.equals("goForward")) {
            mMWebView.goForward();
        } else if (str.equals("reload")) {
            mMWebView.reload();
        } else if (str.equals("loadURL")) {
            java.lang.Object obj = methodCall.arguments;
            if (obj instanceof java.util.ArrayList) {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                if (arrayList.size() == 1) {
                    java.lang.Object obj2 = arrayList.get(0);
                    kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                    mMWebView.loadUrl((java.lang.String) obj2);
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppWebviewView", "arguments error");
            }
        } else if (str.equals("canGoBack")) {
            linkedHashMap.put("canGoBack", java.lang.Boolean.valueOf(mMWebView.canGoBack()));
        } else if (str.equals("canGoForward")) {
            linkedHashMap.put("canGoForward", java.lang.Boolean.valueOf(mMWebView.canGoForward()));
        } else if (str.equals("getCurrentUrl")) {
            java.lang.String url = mMWebView.getUrl();
            kotlin.jvm.internal.o.f(url, "getUrl(...)");
            linkedHashMap.put("url", url);
        } else if (str.equals("getCurrentTitle")) {
            java.lang.String title = mMWebView.getTitle();
            kotlin.jvm.internal.o.f(title, "getTitle(...)");
            linkedHashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, title);
        } else {
            if (!str.equals("postMessage")) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppWebviewView", "onMethodCall not found method: ".concat(str));
                result.error("", "onMethodCall not found method", null);
                return;
            }
            java.lang.Object obj3 = methodCall.arguments;
            if (obj3 instanceof java.util.ArrayList) {
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                java.util.ArrayList arrayList2 = (java.util.ArrayList) obj3;
                if (arrayList2.size() == 1) {
                    java.lang.Object webViewClient = mMWebView.getWebViewClient();
                    if (webViewClient instanceof zg0.q2) {
                        int U = ((com.tencent.mm.plugin.webview.core.r0) ((zg0.q2) webViewClient)).U();
                        java.lang.Object obj4 = arrayList2.get(0);
                        kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.String");
                        com.tencent.mm.plugin.webview.model.SendDataToH5Event.g(new com.tencent.mm.plugin.webview.model.SendDataToH5Event(U, "onLiteAppMessage", new org.json.JSONObject((java.lang.String) obj4)));
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppWebviewView", "arguments error");
            }
        }
        result.success(linkedHashMap);
    }
}
