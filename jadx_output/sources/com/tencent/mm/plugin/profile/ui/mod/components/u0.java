package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes11.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView f153991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.x0 f153992e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView, com.tencent.mm.plugin.profile.ui.mod.components.x0 x0Var) {
        super(1);
        this.f153991d = profileEditPhoneNumberView;
        this.f153992e = x0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModPhoneUIC", "onclick AddPhone");
        com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView = this.f153991d;
        if (!profileEditPhoneNumberView.f()) {
            return java.lang.Boolean.FALSE;
        }
        profileEditPhoneNumberView.c(str, false, false);
        this.f153992e.e7();
        return java.lang.Boolean.TRUE;
    }
}
