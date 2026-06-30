package sc2;

/* loaded from: classes2.dex */
public final class h6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.m6 f405948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405949e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f405950f;

    public h6(sc2.m6 m6Var, in5.s0 s0Var, xc2.p0 p0Var) {
        this.f405948d = m6Var;
        this.f405949e = s0Var;
        this.f405950f = p0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/component/FinderFeedBottomBubbleObserver$onBindView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sc2.m6 m6Var = this.f405948d;
        if (m6Var.G() != null) {
            yc2.b bVar = yc2.b.f460825e;
        }
        m6Var.H(this.f405949e, this.f405950f, yc2.b.f460826f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/FinderFeedBottomBubbleObserver$onBindView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
