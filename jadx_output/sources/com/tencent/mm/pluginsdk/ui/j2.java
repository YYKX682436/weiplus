package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes.dex */
public class j2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.ProfileMobilePhoneView f190879d;

    public j2(com.tencent.mm.pluginsdk.ui.ProfileMobilePhoneView profileMobilePhoneView) {
        this.f190879d = profileMobilePhoneView;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.pluginsdk.ui.ProfileMobilePhoneView profileMobilePhoneView = this.f190879d;
        g4Var.g(0, profileMobilePhoneView.getResources().getString(com.tencent.mm.R.string.bd7), com.tencent.mm.R.raw.bottomsheet_icon_transmit);
        g4Var.g(1, profileMobilePhoneView.getResources().getString(com.tencent.mm.R.string.f490359sr), com.tencent.mm.R.raw.bottomsheet_icon_moment);
    }
}
