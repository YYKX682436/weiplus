package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.b0 f139947d;

    public x(com.tencent.mm.plugin.game.luggage.page.b0 b0Var) {
        this.f139947d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.luggage.page.b0 b0Var = this.f139947d;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebCoreImpl", "reloadUrl, url:%s", b0Var.S);
        b0Var.loadUrl(b0Var.S, b0Var.T);
    }
}
