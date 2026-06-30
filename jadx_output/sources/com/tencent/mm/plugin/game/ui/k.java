package com.tencent.mm.plugin.game.ui;

/* loaded from: classes14.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.game.ui.k f141440d = new com.tencent.mm.plugin.game.ui.k();

    public k() {
        super(3);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        d0.p2 Button = (d0.p2) obj;
        n0.o oVar = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(Button, "$this$Button");
        if ((intValue & 81) == 16) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj4 = n0.e1.f333492a;
        l0.e5.c("清空数据", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, oVar, 6, 0, 65534);
        return jz5.f0.f302826a;
    }
}
