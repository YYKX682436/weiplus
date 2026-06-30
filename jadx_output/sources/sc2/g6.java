package sc2;

/* loaded from: classes2.dex */
public final class g6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.m6 f405912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f405914f;

    public g6(sc2.m6 m6Var, in5.s0 s0Var, xc2.p0 p0Var) {
        this.f405912d = m6Var;
        this.f405913e = s0Var;
        this.f405914f = p0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/component/FinderFeedBottomBubbleObserver$onBindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sc2.m6 m6Var = this.f405912d;
        yc2.c G = m6Var.G();
        if (G != null) {
            yc2.b bVar = yc2.b.f460825e;
            G.z();
        }
        m6Var.H(this.f405913e, this.f405914f, yc2.b.f460825e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/FinderFeedBottomBubbleObserver$onBindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
