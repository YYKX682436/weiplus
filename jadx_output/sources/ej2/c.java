package ej2;

/* loaded from: classes10.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej2.j f253291d;

    public c(ej2.j jVar) {
        this.f253291d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/search/FinderLiveMicBaseSearchWidget$initSearchLogin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f253291d.b();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/search/FinderLiveMicBaseSearchWidget$initSearchLogin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
