package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes11.dex */
public final class w0 implements com.tencent.mm.pluginsdk.ui.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.x0 f153997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f153998b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView f153999c;

    public w0(com.tencent.mm.plugin.profile.ui.mod.components.x0 x0Var, com.tencent.mm.storage.z3 z3Var, com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView) {
        this.f153997a = x0Var;
        this.f153998b = z3Var;
        this.f153999c = profileEditPhoneNumberView;
    }

    @Override // com.tencent.mm.pluginsdk.ui.h2
    public void a(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        view.requestFocus();
        androidx.appcompat.app.AppCompatActivity activity = this.f153997a.getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.showVKB();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.h2
    public void b() {
        c01.e2.e0(this.f153998b);
        w11.d2 wi6 = w11.w1.wi();
        if (wi6 != null) {
            wi6.h(7);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ModProfile.ModPhoneUIC", "onCancelMatchPhoneMD5() SubCoreSync.getSyncService() is [" + w11.w1.wi() + ']');
    }

    @Override // com.tencent.mm.pluginsdk.ui.h2
    public void c() {
        boolean f17 = this.f153999c.f();
        com.tencent.mm.plugin.profile.ui.mod.components.x0 x0Var = this.f153997a;
        if (f17) {
            android.widget.TextView textView = x0Var.f311391f;
            if (textView != null) {
                textView.setVisibility(8);
            }
            com.tencent.mm.ui.base.FlowLayout flowLayout = x0Var.f311390e;
            if (flowLayout != null) {
                flowLayout.setVisibility(0);
            }
        } else {
            android.widget.TextView textView2 = x0Var.f311391f;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            com.tencent.mm.ui.base.FlowLayout flowLayout2 = x0Var.f311390e;
            if (flowLayout2 != null) {
                flowLayout2.setVisibility(8);
            }
        }
        onChange();
    }

    @Override // com.tencent.mm.pluginsdk.ui.h2
    public void onChange() {
        this.f153997a.e7();
    }
}
