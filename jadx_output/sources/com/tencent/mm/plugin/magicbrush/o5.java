package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes7.dex */
public final class o5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.s5 f148088d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(com.tencent.mm.plugin.magicbrush.s5 s5Var) {
        super(0);
        this.f148088d = s5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.magicbrush.s5 s5Var = this.f148088d;
        com.tencent.mm.sdk.platformtools.n3 n3Var = s5Var.f148117c;
        n3Var.removeCallbacks(s5Var.f148119e);
        n3Var.removeCallbacks(s5Var.f148118d);
        com.tencent.mm.sdk.platformtools.n3 n3Var2 = s5Var.f148117c;
        n3Var2.post(s5Var.f148119e);
        n3Var2.postDelayed(s5Var.f148118d, s5Var.f148115a);
        return jz5.f0.f302826a;
    }
}
