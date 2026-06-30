package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.r0 f139931d;

    public q0(com.tencent.mm.plugin.game.luggage.page.r0 r0Var) {
        this.f139931d = r0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.luggage.page.r0 r0Var = this.f139931d;
        super/*sd.u0*/.i();
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = r0Var.f139935b;
        if (!x0Var.f406657n.getBoolean("from_bag", false) && !x0Var.U1) {
            sx4.y.b(x0Var.P(), x0Var);
        }
        if (x0Var.U1) {
            return;
        }
    }
}
