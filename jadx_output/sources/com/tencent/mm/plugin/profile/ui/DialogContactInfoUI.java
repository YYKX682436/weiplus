package com.tencent.mm.plugin.profile.ui;

@db5.a(3)
/* loaded from: classes11.dex */
public class DialogContactInfoUI extends com.tencent.mm.plugin.profile.ui.ContactInfoUI implements qk.c9 {
    public int V;
    public boolean W = true;
    public boolean X = false;

    @Override // qk.c9
    /* renamed from: N3 */
    public boolean getF109514v() {
        return this.X;
    }

    @Override // com.tencent.mm.plugin.profile.ui.ContactInfoUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477855dd);
    }

    @Override // com.tencent.mm.plugin.profile.ui.ContactInfoUI, com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.ViewGroup viewGroup;
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477855dd);
        super.onCreate(bundle);
        if (!isFragmentMode()) {
            int k17 = i65.a.k(com.tencent.mm.sdk.platformtools.x2.f193071a);
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById(android.R.id.content);
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            layoutParams.height = (k17 / 4) * 3;
            viewGroup2.setLayoutParams(layoutParams);
            android.view.Window window = getWindow();
            fq1.e eVar = fq1.e.f265507a;
            eVar.g(window.getDecorView(), i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12), true, false);
            window.setBackgroundDrawableResource(com.tencent.mm.R.color.a9e);
            window.getDecorView().setBackgroundColor(i65.a.d(this, com.tencent.mm.R.color.a9e));
            window.getDecorView().setPadding(0, 0, 0, 0);
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            attributes.gravity = 80;
            window.setAttributes(attributes);
            getWindow().setLayout(-1, -2);
            setFinishOnTouchOutside(true);
            com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) findViewById(com.tencent.mm.R.id.am8);
            if (appBarLayout != null) {
                appBarLayout.a(new com.google.android.material.appbar.g() { // from class: hr3.a9$$a
                    @Override // com.google.android.material.appbar.e
                    public final void a(com.google.android.material.appbar.AppBarLayout appBarLayout2, int i17) {
                        com.tencent.mm.plugin.profile.ui.DialogContactInfoUI.this.V = i17;
                    }
                });
                hr3.lc lcVar = new hr3.lc(this, new yz5.a() { // from class: hr3.a9$$b
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(com.tencent.mm.plugin.profile.ui.DialogContactInfoUI.this.V == 0);
                    }
                });
                android.app.Activity activity = lcVar.f283761g;
                if (activity == null) {
                    kotlin.jvm.internal.o.o("mActivity");
                    throw null;
                }
                android.view.View decorView = activity.getWindow().getDecorView();
                kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) decorView;
                lcVar.f283759e = viewGroup3;
                android.view.View childAt = viewGroup3.getChildAt(0);
                lcVar.f283760f = childAt;
                android.view.ViewGroup viewGroup4 = lcVar.f283759e;
                if (viewGroup4 == null) {
                    kotlin.jvm.internal.o.o("mDecorView");
                    throw null;
                }
                viewGroup4.removeView(childAt);
                lcVar.addView(lcVar.f283760f);
                android.view.ViewGroup viewGroup5 = lcVar.f283759e;
                if (viewGroup5 == null) {
                    kotlin.jvm.internal.o.o("mDecorView");
                    throw null;
                }
                viewGroup5.addView(lcVar);
                eVar.g(lcVar.f283760f, i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12), true, false);
                int k18 = i65.a.k(com.tencent.mm.sdk.platformtools.x2.f193071a);
                lcVar.f283764m = k18;
                lcVar.f283763i = k18 * 0.3f;
                eVar.g(lcVar, i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12), true, false);
            }
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = getController().K;
        if (weImageView != null) {
            weImageView.clearColorFilter();
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = getController().K;
        if (weImageView2 != null) {
            weImageView2.setEnableColorFilter(false);
        }
        getController().Q0(i65.a.i(this, com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.drawable.bdg : com.tencent.mm.R.drawable.bdh));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = getController().K;
        if (weImageView3 != null) {
            weImageView3.clearColorFilter();
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = getController().K;
        if (weImageView4 != null) {
            weImageView4.setEnableColorFilter(false);
        }
        this.W = getIntent().getBooleanExtra("biz_dialog_show_header_bar", true);
        com.google.android.material.appbar.AppBarLayout appBarLayout2 = (com.google.android.material.appbar.AppBarLayout) findViewById(com.tencent.mm.R.id.am8);
        if (appBarLayout2 != null) {
            appBarLayout2.setTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#AppBarLayout");
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.amc);
        if (findViewById != null && this.W) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/DialogContactInfoUI", "setTagToDragBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/DialogContactInfoUI", "setTagToDragBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.amf);
            android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.ame);
            findViewById.setTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#DragBarContainer");
            findViewById2.setTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#DragBarLine");
            findViewById3.setTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#DragBarArrow");
        }
        int b17 = i65.a.b(this, 64);
        if (isFragmentMode() && (viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.hvf)) != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            layoutParams2.height = b17;
            viewGroup.setLayoutParams(layoutParams2);
        }
        getController().r0(i65.a.b(this, 64), true);
        boolean booleanExtra = getIntent().getBooleanExtra("key_enter_dialog", false);
        this.X = booleanExtra;
        if (booleanExtra) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Zj(this, 46100);
        }
    }
}
