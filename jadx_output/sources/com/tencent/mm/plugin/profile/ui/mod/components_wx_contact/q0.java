package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes11.dex */
public final class q0 implements lr3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.w0 f154121a;

    public q0(com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.w0 w0Var) {
        this.f154121a = w0Var;
    }

    @Override // lr3.a
    public void a() {
        com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView = (com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView) this.f154121a.f311480h;
        if (profileEditPhoneNumberView == null) {
            return;
        }
        java.util.ArrayList<java.lang.String> phoneNumberList = profileEditPhoneNumberView.getPhoneNumberList();
        if (phoneNumberList == null || phoneNumberList.isEmpty()) {
            profileEditPhoneNumberView.post(new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.p0(profileEditPhoneNumberView));
        }
    }

    @Override // lr3.a
    public void b() {
        com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView = (com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView) this.f154121a.f311480h;
        if (profileEditPhoneNumberView == null) {
            return;
        }
        sa5.d.e(profileEditPhoneNumberView, i65.a.h(r0.getActivity(), com.tencent.mm.R.dimen.f479738dv), (r14 & 2) != 0 ? 1 : 0, (r14 & 4) != 0 ? 1000L : 0L, (r14 & 8) != 0 ? 300L : 0L, (r14 & 16) != 0 ? null : null);
    }
}
