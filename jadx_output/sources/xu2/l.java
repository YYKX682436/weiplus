package xu2;

/* loaded from: classes8.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xu2.n f457209d;

    public l(xu2.n nVar) {
        this.f457209d = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$9$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xu2.n.a(this.f457209d, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$9$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
