package com.tencent.mm.plugin.finder.profile;

/* loaded from: classes2.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f123310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.b0 f123311e;

    public a0(android.widget.LinearLayout linearLayout, com.tencent.mm.plugin.finder.profile.b0 b0Var) {
        this.f123310d = linearLayout;
        this.f123311e = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText;
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/FinderProfilePoiListView$initSearch$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f123310d.setVisibility(8);
        com.tencent.mm.plugin.finder.profile.b0 b0Var = this.f123311e;
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = b0Var.f123322p;
        if (fTSSearchView != null) {
            fTSSearchView.setVisibility(0);
        }
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView2 = b0Var.f123322p;
        if (fTSSearchView2 != null && (ftsEditText2 = fTSSearchView2.getFtsEditText()) != null) {
            ftsEditText2.m();
        }
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView3 = b0Var.f123322p;
        if (fTSSearchView3 != null && (ftsEditText = fTSSearchView3.getFtsEditText()) != null) {
            ftsEditText.t();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/FinderProfilePoiListView$initSearch$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
