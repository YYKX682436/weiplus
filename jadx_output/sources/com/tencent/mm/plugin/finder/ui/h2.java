package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class h2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f129312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f129313e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(android.content.Context context, boolean z17) {
        super(1);
        this.f129312d = context;
        this.f129313e = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.content.Intent intent = new android.content.Intent();
        java.lang.String r17 = c01.z1.r();
        intent.putExtra("Contact_User", r17);
        if (r17 != null) {
            if (r17.length() > 0) {
                intent.putExtra("CONTACT_INFO_UI_SOURCE", 22);
                j45.l.j(this.f129312d, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
            }
        }
        if (this.f129313e) {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3.Mj((com.tencent.mm.plugin.finder.report.o3) c17, this.f129312d, 12L, 5L, false, 0, 0, null, 120, null);
        }
        return jz5.f0.f302826a;
    }
}
