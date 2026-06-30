package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class j4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.n4 f116408d;

    public j4(com.tencent.mm.plugin.finder.live.view.n4 n4Var) {
        this.f116408d = n4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel$initContentView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.view.n4 n4Var = this.f116408d;
        n4Var.a();
        yz5.p pVar = n4Var.f116512y;
        if (pVar != null) {
            pVar.invoke(java.lang.Integer.valueOf(n4Var.f116510w), java.lang.Integer.valueOf(n4Var.f116511x));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel$initContentView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
