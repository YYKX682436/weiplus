package com.tencent.mm.plugin.game.ui;

/* loaded from: classes14.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.game.ui.n f141668d = new com.tencent.mm.plugin.game.ui.n();

    public n() {
        super(2);
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
        l0.e5.c("示例:<xml>hello</xml>", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, oVar, 6, 0, 65534);
        return jz5.f0.f302826a;
    }
}
