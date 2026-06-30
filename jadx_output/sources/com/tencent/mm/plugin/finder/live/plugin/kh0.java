package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class kh0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.th0 f113253d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh0(com.tencent.mm.plugin.finder.live.plugin.th0 th0Var) {
        super(1);
        this.f113253d = th0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.finder.live.plugin.th0 th0Var = this.f113253d;
        if (booleanValue) {
            qo0.c.a(th0Var.f113325g, qo0.b.f365329a5, null, 2, null);
        } else {
            qo0.c.a(th0Var.f113325g, qo0.b.f365333b5, null, 2, null);
        }
        return jz5.f0.f302826a;
    }
}
