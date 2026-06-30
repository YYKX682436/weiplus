package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.k2 f184450d;

    public j2(com.tencent.mm.plugin.webview.ui.tools.fts.k2 k2Var) {
        this.f184450d = k2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f184450d.f184493e.f184567n.f183844p0;
        if (!nVar.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onFocusSearchInput fail, not ready");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onFocusSearchInput success, ready");
            com.tencent.mm.sdk.platformtools.u3.h(new nw4.h1(nVar, nw4.x2.c("onFocusSearchInput", null, nVar.f340903q, nVar.f340904r)));
        }
    }
}
