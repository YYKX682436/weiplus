package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public class c1 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.e0 f153403a;

    public c1(com.tencent.mm.plugin.profile.e0 e0Var) {
        this.f153403a = e0Var;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.profile.e0 e0Var = this.f153403a;
        com.tencent.mm.ui.MMActivity mMActivity = e0Var.f153420d;
        if (mMActivity == null || mMActivity.isFinishing()) {
            return;
        }
        e0Var.h(e0Var.f153422f, (com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) e0Var.f153422f).h("contact_profile_header_normal"), (com.tencent.mm.ui.base.preference.ButtonPreference) ((com.tencent.mm.ui.base.preference.h0) e0Var.f153422f).h("contact_profile_send"), (com.tencent.mm.ui.base.preference.ButtonPreference) ((com.tencent.mm.ui.base.preference.h0) e0Var.f153422f).h("contact_profile_add_contact"));
        e0Var.g();
    }
}
