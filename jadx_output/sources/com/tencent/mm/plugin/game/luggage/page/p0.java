package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.x0 f139928d;

    public p0(com.tencent.mm.plugin.game.luggage.page.x0 x0Var) {
        this.f139928d = x0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = this.f139928d;
        x0Var.getClass();
        x0Var.f182180p.evaluateJavascript(ik1.f.e("game_performance.js"), new com.tencent.mm.plugin.game.luggage.page.r0(x0Var, java.lang.System.currentTimeMillis()));
    }
}
