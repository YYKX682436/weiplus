package jv0;

/* loaded from: classes5.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jv0.g f302180d;

    public b(jv0.g gVar) {
        this.f302180d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/duration/DurationModifyPanelUIC$initQuickAdjust$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f302180d.w7();
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/duration/DurationModifyPanelUIC$initQuickAdjust$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
