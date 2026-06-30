package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class k4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.n4 f116438d;

    public k4(com.tencent.mm.plugin.finder.live.view.n4 n4Var) {
        this.f116438d = n4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel$initContentView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f116438d.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel$initContentView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
