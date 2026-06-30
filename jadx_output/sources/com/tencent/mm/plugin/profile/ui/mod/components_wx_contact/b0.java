package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes10.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 f154029e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.lang.String str, com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 i0Var) {
        super(1);
        this.f154028d = str;
        this.f154029e = i0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String compressPath = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(compressPath, "compressPath");
        mr3.l a17 = mr3.l.f330874n.a(this.f154028d, compressPath, 4);
        if (a17 != null) {
            a17.f330880i = 1;
            com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 i0Var = this.f154029e;
            i0Var.m7().f330885f = a17;
            i0Var.d7();
        }
        return jz5.f0.f302826a;
    }
}
