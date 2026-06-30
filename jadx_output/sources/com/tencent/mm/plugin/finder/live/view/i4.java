package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class i4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.n4 f116374d;

    public i4(com.tencent.mm.plugin.finder.live.view.n4 n4Var) {
        this.f116374d = n4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f116374d.A(true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
