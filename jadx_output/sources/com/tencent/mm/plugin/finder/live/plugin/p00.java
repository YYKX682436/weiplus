package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class p00 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.w00 f113810d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p00(com.tencent.mm.plugin.finder.live.plugin.w00 w00Var) {
        super(1);
        this.f113810d = w00Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.xn1 xn1Var = (r45.xn1) obj;
        if (xn1Var != null) {
            com.tencent.mm.plugin.finder.live.plugin.w00 w00Var = this.f113810d;
            w00Var.Q = xn1Var;
            w00Var.x1(xn1Var, false);
        }
        return jz5.f0.f302826a;
    }
}
