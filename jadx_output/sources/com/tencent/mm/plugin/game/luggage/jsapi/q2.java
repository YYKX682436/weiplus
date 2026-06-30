package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139737e;

    public q2(com.tencent.mm.plugin.game.luggage.jsapi.s2 s2Var, java.lang.String str, java.lang.String str2) {
        this.f139736d = str;
        this.f139737e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wepkg.model.WepkgVersion d17 = com.tencent.mm.plugin.wepkg.model.o0.d(this.f139736d);
        if (d17 == null || com.tencent.mm.sdk.platformtools.t8.K0(d17.f188377g)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenGameUrlWithExtraWebView", "wepkgVersion not exists or pkgPath is empty");
            return;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(d17.f188377g);
        if (!r6Var.m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenGameUrlWithExtraWebView", "wepkg file not exists");
            return;
        }
        com.tencent.mm.plugin.wepkg.model.o oVar = new com.tencent.mm.plugin.wepkg.model.o(r6Var);
        if (oVar.f188447b) {
            java.util.Iterator it = oVar.c().iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.wepkg.model.k kVar = (com.tencent.mm.plugin.wepkg.model.k) it.next();
                if (kVar.f188431a.equals(this.f139737e)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenGameUrlWithExtraWebView", "patchId does not match");
                    com.tencent.mm.plugin.wepkg.model.j.a(kVar);
                }
            }
        }
    }
}
