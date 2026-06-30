package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class l2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.z2 f124611d;

    public l2(com.tencent.mm.plugin.finder.profile.widget.z2 z2Var) {
        this.f124611d = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/HeaderPostPlayBannerWidget$handlePostPlayBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.profile.widget.z2 z2Var = this.f124611d;
        z2Var.getClass();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = z2Var.f124845a;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) appCompatActivity, 1, true);
        k0Var.r(appCompatActivity.getString(com.tencent.mm.R.string.p4a), 17, i65.a.b(appCompatActivity, 14), null);
        k0Var.f211872n = new com.tencent.mm.plugin.finder.profile.widget.w2(z2Var);
        k0Var.C = new com.tencent.mm.plugin.finder.profile.widget.x2(z2Var);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.profile.widget.y2(z2Var);
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        com.tencent.mm.plugin.finder.report.d2.i(d2Var, z2Var.f124845a, "profile_cluster_nodisplay", "view_exp", false, z2Var.b(), 8, null);
        com.tencent.mm.plugin.finder.report.d2.i(d2Var, z2Var.f124845a, "profile_cluster_cancel_close", "view_exp", false, z2Var.b(), 8, null);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderPostPlayBannerWidget$handlePostPlayBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
