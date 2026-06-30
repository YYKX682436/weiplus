package wm2;

/* loaded from: classes14.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wm2.n f447235d;

    public e(wm2.n nVar) {
        this.f447235d = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/beauty/FinderLiveBeautyUnifiedPanelWidget$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((bn2.p) kz5.n0.i0(this.f447235d.f447257g)).b();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/beauty/FinderLiveBeautyUnifiedPanelWidget$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
