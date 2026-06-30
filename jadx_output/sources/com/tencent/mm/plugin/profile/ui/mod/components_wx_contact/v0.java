package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes11.dex */
public final class v0 implements com.tencent.mm.pluginsdk.ui.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.w0 f154138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.contact.o f154139b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView f154140c;

    public v0(com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.w0 w0Var, com.tencent.mm.contact.o oVar, com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView) {
        this.f154138a = w0Var;
        this.f154139b = oVar;
        this.f154140c = profileEditPhoneNumberView;
    }

    @Override // com.tencent.mm.pluginsdk.ui.h2
    public void a(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        view.requestFocus();
        androidx.appcompat.app.AppCompatActivity activity = this.f154138a.getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.showVKB();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.h2
    public void b() {
        c01.e2.e0(((yq3.v) this.f154139b).f464535f);
        w11.d2 wi6 = w11.w1.wi();
        if (wi6 != null) {
            wi6.h(7);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ModProfile.ModPhoneUIC", "onCancelMatchPhoneMD5() SubCoreSync.getSyncService() is [" + w11.w1.wi() + ']');
    }

    @Override // com.tencent.mm.pluginsdk.ui.h2
    public void c() {
        boolean f17 = this.f154140c.f();
        com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.w0 w0Var = this.f154138a;
        if (f17) {
            android.widget.TextView textView = w0Var.f311478f;
            if (textView != null) {
                textView.setVisibility(8);
            }
            com.tencent.mm.ui.base.FlowLayout flowLayout = w0Var.f311477e;
            if (flowLayout != null) {
                flowLayout.setVisibility(0);
            }
        } else {
            android.widget.TextView textView2 = w0Var.f311478f;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            com.tencent.mm.ui.base.FlowLayout flowLayout2 = w0Var.f311477e;
            if (flowLayout2 != null) {
                flowLayout2.setVisibility(8);
            }
        }
        onChange();
    }

    @Override // com.tencent.mm.pluginsdk.ui.h2
    public void onChange() {
        this.f154138a.d7();
    }
}
