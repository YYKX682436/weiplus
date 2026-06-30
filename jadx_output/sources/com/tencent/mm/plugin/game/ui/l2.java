package com.tencent.mm.plugin.game.ui;

/* loaded from: classes14.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameDebugView f141456d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.tencent.mm.plugin.game.ui.GameDebugView gameDebugView) {
        super(2);
        this.f141456d = gameDebugView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj3 = n0.e1.f333492a;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(1273401510);
        java.lang.Object y17 = y0Var2.y();
        int i17 = n0.o.f333629a;
        if (y17 == n0.n.f333620a) {
            y17 = new com.tencent.mm.plugin.game.ui.e1(com.tencent.mm.plugin.game.ui.h1.f141403b);
            y0Var2.g0(y17);
        }
        com.tencent.mm.plugin.game.ui.e1 e1Var = (com.tencent.mm.plugin.game.ui.e1) y17;
        y0Var2.o(false);
        com.tencent.mm.plugin.game.ui.GameDebugView gameDebugView = this.f141456d;
        gameDebugView.Q6(e1Var, u0.j.b(y0Var2, -1730597660, true, new com.tencent.mm.plugin.game.ui.k2(e1Var, gameDebugView)), y0Var2, 54);
        return jz5.f0.f302826a;
    }
}
