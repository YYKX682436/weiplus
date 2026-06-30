package el2;

/* loaded from: classes3.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f253741d;

    public a0(el2.i0 i0Var) {
        this.f253741d = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAnchorPromoteView$register$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        el2.i0.f0(this.f253741d);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAnchorPromoteView$register$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
