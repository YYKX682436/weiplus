package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class z3 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186702b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186703c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186705e;

    public z3(java.lang.String str, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, java.lang.String str2, java.lang.String str3, nw4.k kVar) {
        this.f186701a = str;
        this.f186702b = webViewUI;
        this.f186703c = str2;
        this.f186704d = str3;
        this.f186705e = kVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap(1);
        if (z17) {
            java.lang.String str2 = this.f186701a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                hashMap.put("event", com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED);
            } else {
                hashMap.put("event", ya.b.SUCCESS);
                com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5 k5Var = com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.f186304d;
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186702b;
                java.lang.String str3 = this.f186703c;
                java.lang.String wi6 = ((qv.a) ((rv.h2) i95.n0.c(rv.h2.class))).wi(this.f186704d);
                g45.b.f268846a.a(str2, str, 0);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "bobkw shareSendImg: " + wi6);
                ((dk5.s5) tg3.t1.a()).bj(webViewUI, str2, str3, 1, wi6, "", "", null);
                if (!com.tencent.mm.repairer.config.forward.RepairerConfigForwardSnackBarJumpChatting.f192214a.a()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "EnterChattingAfterTrans done config disabled");
                    com.tencent.mm.ui.widget.snackbar.j.c(webViewUI.getString(com.tencent.mm.R.string.fw6), null, webViewUI, null, null);
                }
                ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class)).Ai().g(str2);
            }
        } else {
            hashMap.put("event", "canceled");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "initRecentForward-> showShareSnsConfirmDialog for recent forward event:" + hashMap.get("event"));
        nw4.g gVar = this.f186705e.f340863d;
        kotlin.jvm.internal.o.e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
        ((nw4.n) gVar).o("onShareEmbedExcerptEvent", hashMap);
    }
}
