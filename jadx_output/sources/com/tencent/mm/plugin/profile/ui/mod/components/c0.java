package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes10.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.j0 f153887e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(java.lang.String str, com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var) {
        super(1);
        this.f153886d = str;
        this.f153887e = j0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String compressPath = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(compressPath, "compressPath");
        mr3.l a17 = mr3.l.f330874n.a(this.f153886d, compressPath, 4);
        if (a17 != null) {
            a17.f330880i = 1;
            com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var = this.f153887e;
            j0Var.n7().f330885f = a17;
            j0Var.e7();
        }
        return jz5.f0.f302826a;
    }
}
