package wd2;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wd2.g f444826d;

    public b(wd2.g gVar) {
        this.f444826d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f444826d.getClass();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
