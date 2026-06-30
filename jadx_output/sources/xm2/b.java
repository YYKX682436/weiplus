package xm2;

/* loaded from: classes14.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xm2.c f455192d;

    public b(xm2.c cVar) {
        this.f455192d = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyFineTuningControlPanelWidget$ItemViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xm2.c cVar = this.f455192d;
        zm2.b bVar = cVar.f455202p;
        if (bVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyFineTuningControlPanelWidget$ItemViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            cVar.f455193d.invoke(bVar.f474162d);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyFineTuningControlPanelWidget$ItemViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
