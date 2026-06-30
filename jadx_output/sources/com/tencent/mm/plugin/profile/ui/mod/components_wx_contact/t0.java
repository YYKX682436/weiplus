package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes11.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView f154132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.w0 f154133e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView, com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.w0 w0Var) {
        super(1);
        this.f154132d = profileEditPhoneNumberView;
        this.f154133e = w0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModPhoneUIC", "onclick AddPhone");
        com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView = this.f154132d;
        if (!profileEditPhoneNumberView.f()) {
            return java.lang.Boolean.FALSE;
        }
        profileEditPhoneNumberView.c(str, false, false);
        this.f154133e.d7();
        return java.lang.Boolean.TRUE;
    }
}
