package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class m3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.f4 f123969d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(com.tencent.mm.plugin.finder.profile.uic.f4 f4Var) {
        super(1);
        this.f123969d = f4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", c01.z1.r());
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 22);
        com.tencent.mm.plugin.finder.profile.uic.f4 f4Var = this.f123969d;
        j45.l.j(f4Var.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3.Mj((com.tencent.mm.plugin.finder.report.o3) c17, f4Var.getActivity(), 13L, 5L, false, 0, 0, null, 120, null);
        return jz5.f0.f302826a;
    }
}
