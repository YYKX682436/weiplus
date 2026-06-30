package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class w2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.e3 f182003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f182004e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f182005f;

    public w2(com.tencent.mm.plugin.webview.core.e3 e3Var, int i17, int i18) {
        this.f182003d = e3Var;
        this.f182004e = i17;
        this.f182005f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.f182003d;
        pw4.c cVar = e3Var.f181938l;
        int f17 = e3Var.f181916a.getSettings().f();
        cVar.f358718g = this.f182004e;
        cVar.f358719h = f17;
        nw4.n g07 = e3Var.g0();
        boolean z17 = g07.f340895i;
        int i17 = this.f182005f;
        if (z17) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("fontSize", java.lang.String.valueOf(i17));
            g07.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("menu:setfont", hashMap, g07.f340903q, g07.f340904r) + ")", null);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onFontSizeChanged fail, not ready");
        }
        java.util.Iterator it = e3Var.Z.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.webview.core.f3) it.next()).g(i17);
        }
    }
}
