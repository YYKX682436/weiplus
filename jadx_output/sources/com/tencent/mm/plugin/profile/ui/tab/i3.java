package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class i3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.s4 f154359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xl3 f154360e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.tencent.mm.plugin.profile.ui.tab.s4 s4Var, r45.xl3 xl3Var) {
        super(1);
        this.f154359d = s4Var;
        this.f154360e = xl3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.profile.ui.tab.s4 s4Var = this.f154359d;
        com.tencent.mm.storage.z3 z3Var = s4Var.f154555f;
        java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
        if (d17 == null) {
            d17 = "";
        }
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = s4Var.f154551d;
        long j17 = m0Var.D;
        android.content.Intent intent = s4Var.f154553e.getIntent();
        int i17 = m0Var.L;
        int i18 = m0Var.f154467v;
        boolean i19 = m0Var.i();
        r45.xl3 xl3Var = this.f154360e;
        java.lang.String str = xl3Var != null ? xl3Var.f390213f : null;
        gr3.e.d(d17, intValue, j17, intent, i17, i18, i19 ? 1 : 0, null, str == null ? "" : str, null, 0, 0, 3712, null);
        return jz5.f0.f302826a;
    }
}
