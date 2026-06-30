package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class vf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget f120066d;

    public vf(com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget finderLiveFansClubTagWidget) {
        this.f120066d = finderLiveFansClubTagWidget;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubTagWidget$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget finderLiveFansClubTagWidget = this.f120066d;
        yz5.p clickListener = finderLiveFansClubTagWidget.getClickListener();
        if (clickListener != null) {
            kotlin.jvm.internal.o.d(view);
            clickListener.invoke(view, java.lang.Boolean.valueOf(finderLiveFansClubTagWidget.getHasJoinFansClub()));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubTagWidget$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
