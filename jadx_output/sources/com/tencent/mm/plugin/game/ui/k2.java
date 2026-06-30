package com.tencent.mm.plugin.game.ui;

/* loaded from: classes14.dex */
public final class k2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.e1 f141444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameDebugView f141445e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(com.tencent.mm.plugin.game.ui.e1 e1Var, com.tencent.mm.plugin.game.ui.GameDebugView gameDebugView) {
        super(2);
        this.f141444d = e1Var;
        this.f141445e = gameDebugView;
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
        com.tencent.mm.plugin.game.ui.e1 e1Var = this.f141444d;
        com.tencent.mm.plugin.game.ui.l1 l1Var = (com.tencent.mm.plugin.game.ui.l1) kz5.n0.i0(e1Var.f141371a);
        boolean b17 = kotlin.jvm.internal.o.b(l1Var, com.tencent.mm.plugin.game.ui.k1.f141443b);
        com.tencent.mm.plugin.game.ui.GameDebugView gameDebugView = this.f141445e;
        if (b17) {
            n0.y0 y0Var2 = (n0.y0) oVar;
            y0Var2.U(-1960114518);
            gameDebugView.U6(y0Var2, 0);
            y0Var2.o(false);
        } else if (kotlin.jvm.internal.o.b(l1Var, com.tencent.mm.plugin.game.ui.j1.f141435b)) {
            n0.y0 y0Var3 = (n0.y0) oVar;
            y0Var3.U(-1960114442);
            gameDebugView.T6(y0Var3, 0);
            y0Var3.o(false);
        } else if (kotlin.jvm.internal.o.b(l1Var, com.tencent.mm.plugin.game.ui.i1.f141415b)) {
            n0.y0 y0Var4 = (n0.y0) oVar;
            y0Var4.U(-1960114365);
            gameDebugView.S6(y0Var4, 0);
            y0Var4.o(false);
        } else if (kotlin.jvm.internal.o.b(l1Var, com.tencent.mm.plugin.game.ui.h1.f141403b)) {
            n0.y0 y0Var5 = (n0.y0) oVar;
            y0Var5.U(-1960114294);
            y0Var5.U(-1960114283);
            boolean e17 = y0Var5.e(e1Var);
            java.lang.Object y17 = y0Var5.y();
            if (e17 || y17 == n0.n.f333620a) {
                y17 = new com.tencent.mm.plugin.game.ui.j2(e1Var);
                y0Var5.g0(y17);
            }
            y0Var5.o(false);
            gameDebugView.R6((yz5.l) y17, y0Var5, 6);
            y0Var5.o(false);
        } else {
            n0.y0 y0Var6 = (n0.y0) oVar;
            y0Var6.U(-1960113816);
            y0Var6.o(false);
        }
        return jz5.f0.f302826a;
    }
}
