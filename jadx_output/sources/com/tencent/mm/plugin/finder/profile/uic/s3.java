package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class s3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.f4 f124203d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(com.tencent.mm.plugin.finder.profile.uic.f4 f4Var) {
        super(1);
        this.f124203d = f4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", c01.z1.r());
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 22);
        j45.l.j(this.f124203d.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        com.tencent.mm.plugin.finder.profile.uic.f4.a7(this.f124203d, "to_profile", 0, null, 0, null, 30, null);
        return jz5.f0.f302826a;
    }
}
