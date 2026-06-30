package xm2;

/* loaded from: classes14.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xm2.v f455264d;

    public u(xm2.v vVar) {
        this.f455264d = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget$ItemViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xm2.v vVar = this.f455264d;
        zm2.d dVar = vVar.f455271m;
        if (dVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget$ItemViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            vVar.f455265d.invoke(dVar.f474162d);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget$ItemViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
