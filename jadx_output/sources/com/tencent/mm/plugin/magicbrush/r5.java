package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes7.dex */
public final class r5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.s5 f148112d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(com.tencent.mm.plugin.magicbrush.s5 s5Var) {
        super(0);
        this.f148112d = s5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.magicbrush.s5 s5Var = this.f148112d;
        com.tencent.mm.sdk.platformtools.n3 n3Var = s5Var.f148117c;
        n3Var.removeCallbacks(s5Var.f148119e);
        n3Var.removeCallbacks(s5Var.f148118d);
        s5Var.f148117c.post(s5Var.f148119e);
        return jz5.f0.f302826a;
    }
}
