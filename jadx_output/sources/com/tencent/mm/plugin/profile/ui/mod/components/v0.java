package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes11.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.x0 f153994d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.mm.plugin.profile.ui.mod.components.x0 x0Var) {
        super(0);
        this.f153994d = x0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initRecommendRemark() customView: ");
        com.tencent.mm.plugin.profile.ui.mod.components.x0 x0Var = this.f153994d;
        sb6.append(x0Var.f311393h);
        sb6.append(", flowLayout: ");
        sb6.append(x0Var.f311390e);
        sb6.append(", username: ");
        sb6.append(x0Var.getUsername());
        com.tencent.mars.xlog.Log.e("MicroMsg.ModProfile.ModPhoneUIC", sb6.toString());
        return jz5.f0.f302826a;
    }
}
