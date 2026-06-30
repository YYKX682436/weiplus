package fh2;

/* loaded from: classes3.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh2.g f262646d;

    public e(fh2.g gVar) {
        this.f262646d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/ktv/panel/FinderLiveKTVCloseTipsPanel$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fh2.g gVar = this.f262646d;
        gVar.y(2);
        gVar.a();
        gVar.f262649i.invoke();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ktv/panel/FinderLiveKTVCloseTipsPanel$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
