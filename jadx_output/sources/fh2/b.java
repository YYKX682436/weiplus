package fh2;

/* loaded from: classes10.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh2.c f262638d;

    public b(fh2.c cVar) {
        this.f262638d = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/ktv/panel/FinderLiveKTVCloseLinkTipsPanel$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fh2.c cVar = this.f262638d;
        fh2.c.y(cVar, 2);
        cVar.a();
        cVar.f262640i.invoke();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ktv/panel/FinderLiveKTVCloseLinkTipsPanel$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
