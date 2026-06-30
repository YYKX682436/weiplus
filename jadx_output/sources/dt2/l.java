package dt2;

/* loaded from: classes3.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dt2.t f243187d;

    public l(dt2.t tVar) {
        this.f243187d = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/replay/widget/FinderLiveReplayMiniView$miniWindowClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dt2.t tVar = this.f243187d;
        tVar.f243195d.b();
        tVar.o();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveReplayMiniView$miniWindowClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
