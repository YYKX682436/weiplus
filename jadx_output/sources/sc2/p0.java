package sc2;

/* loaded from: classes2.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f406139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.t01 f406141f;

    public p0(sc2.h1 h1Var, in5.s0 s0Var, r45.t01 t01Var) {
        this.f406139d = h1Var;
        this.f406140e = s0Var;
        this.f406141f = t01Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$showCard$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.report.g3 g3Var = com.tencent.mm.plugin.finder.report.g3.f125047g;
        sc2.h1 h1Var = this.f406139d;
        h1Var.A1 = g3Var;
        h1Var.P(this.f406140e, true, true, this.f406141f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$showCard$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
