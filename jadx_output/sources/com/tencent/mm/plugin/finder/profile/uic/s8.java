package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class s8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f124208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f124209e;

    public s8(com.tencent.mm.plugin.finder.profile.uic.ob obVar, ya2.b2 b2Var) {
        this.f124208d = obVar;
        this.f124209e = b2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.app.Activity parentActivity;
        gx2.q qVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleNickname$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f124208d;
        com.tencent.mm.plugin.finder.report.b6.d(b6Var, obVar.getContextObj(), "link_halfscreen_profile_avatar_profile", 1, null, false, null, 56, null);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127967u9).getValue()).r()).intValue() == 1) {
            androidx.appcompat.app.AppCompatActivity activity = obVar.getActivity();
            jz5.f0 f0Var = null;
            com.tencent.mm.ui.vas.VASActivity vASActivity = activity instanceof com.tencent.mm.ui.vas.VASActivity ? (com.tencent.mm.ui.vas.VASActivity) activity : null;
            if (vASActivity != null && (parentActivity = vASActivity.getParentActivity()) != null) {
                pf5.z zVar = pf5.z.f353948a;
                if (!(parentActivity instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC finderProfileDrawerUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) parentActivity).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC.class);
                if (finderProfileDrawerUIC != null && (qVar = finderProfileDrawerUIC.f133621f) != null) {
                    com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(qVar, false, null, false, new com.tencent.mm.plugin.finder.profile.uic.r8(obVar, this.f124209e), 7, null);
                    f0Var = jz5.f0.f302826a;
                }
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.i("Finder.FinderProfileHeaderUIC", "Skip clicking on nickname since there is no parent activity (Jumping to profile needs profile drawer)");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleNickname$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
