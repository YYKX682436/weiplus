package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes11.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.w0 f154135d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.w0 w0Var) {
        super(0);
        this.f154135d = w0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initRecommendRemark() customView: ");
        com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.w0 w0Var = this.f154135d;
        sb6.append(w0Var.f311480h);
        sb6.append(", flowLayout: ");
        sb6.append(w0Var.f311477e);
        sb6.append(", username: ");
        sb6.append(w0Var.getUsername());
        com.tencent.mars.xlog.Log.e("MicroMsg.ModProfile.ModPhoneUIC", sb6.toString());
        return jz5.f0.f302826a;
    }
}
