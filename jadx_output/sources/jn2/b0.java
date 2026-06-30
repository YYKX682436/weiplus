package jn2;

/* loaded from: classes5.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.f0 f300554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f300555e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f300556f;

    public b0(jn2.f0 f0Var, int i17, kotlinx.coroutines.y0 y0Var) {
        this.f300554d = f0Var;
        this.f300555e = i17;
        this.f300556f = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelTabView$initSubTabs$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f300554d.a(this.f300555e, null, this.f300556f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelTabView$initSubTabs$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
