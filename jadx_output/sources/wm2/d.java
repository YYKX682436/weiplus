package wm2;

/* loaded from: classes3.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wm2.n f447234d;

    public d(wm2.n nVar) {
        this.f447234d = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/beauty/FinderLiveBeautyUnifiedPanelWidget$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f447234d.f447258h.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/beauty/FinderLiveBeautyUnifiedPanelWidget$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
