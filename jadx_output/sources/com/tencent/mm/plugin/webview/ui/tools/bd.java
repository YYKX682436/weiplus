package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class bd implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.cd f183998d;

    public bd(com.tencent.mm.plugin.webview.ui.tools.cd cdVar) {
        this.f183998d = cdVar;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        com.tencent.mm.plugin.webview.ui.tools.cd cdVar = this.f183998d;
        cdVar.f184085d.f185656g.e(cw4.b0.f224197e);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("translate_to_language", com.tencent.mm.sdk.platformtools.m2.c(cdVar.f184085d.f185654e));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("translate_btn_in_webview", "view_clk", hashMap, 30223);
        return null;
    }
}
