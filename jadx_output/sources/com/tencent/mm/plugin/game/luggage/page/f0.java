package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f139887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.x0 f139888e;

    public f0(com.tencent.mm.plugin.game.luggage.page.x0 x0Var, int i17) {
        this.f139888e = x0Var;
        this.f139887d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String format = java.lang.String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__currentFontSize__= %d; })()", java.lang.Integer.valueOf(this.f139887d));
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPage", "initFontSize, fontSize:%s", format);
        this.f139888e.o(format, null);
    }
}
