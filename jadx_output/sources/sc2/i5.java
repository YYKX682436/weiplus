package sc2;

/* loaded from: classes2.dex */
public final class i5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.d6 f405969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f405970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405971f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f405972g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405973h;

    public i5(sc2.d6 d6Var, xc2.p0 p0Var, android.view.View view, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var) {
        this.f405969d = d6Var;
        this.f405970e = p0Var;
        this.f405971f = view;
        this.f405972g = baseFinderFeed;
        this.f405973h = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver$bindBigCard$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f405972g;
        java.lang.String field_username = baseFinderFeed.getFeedObject().field_username;
        kotlin.jvm.internal.o.f(field_username, "field_username");
        java.lang.String field_username2 = baseFinderFeed.getFeedObject().field_username;
        kotlin.jvm.internal.o.f(field_username2, "field_username");
        sc2.d6 d6Var = this.f405969d;
        xc2.p0 p0Var = this.f405970e;
        r45.h32 O = d6Var.O(field_username2, p0Var);
        android.view.View view2 = this.f405971f;
        d6Var.S(p0Var, view2, field_username, O);
        p0Var.G = true;
        xc2.z2 z2Var = d6Var.f3151o;
        xc2.b bVar = z2Var instanceof xc2.b ? (xc2.b) z2Var : null;
        in5.s0 s0Var = this.f405973h;
        if (bVar != null) {
            bVar.B(s0Var, view2, p0Var, 0);
        }
        xc2.z2 z2Var2 = d6Var.f3151o;
        xc2.b bVar2 = z2Var2 instanceof xc2.b ? (xc2.b) z2Var2 : null;
        if (bVar2 != null) {
            bVar2.q(s0Var, view2, p0Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver$bindBigCard$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
