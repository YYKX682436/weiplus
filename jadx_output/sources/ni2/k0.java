package ni2;

/* loaded from: classes10.dex */
public final class k0 extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public final gk2.e f337350h;

    /* renamed from: i, reason: collision with root package name */
    public final lj2.x0 f337351i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f337352m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f337353n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f337354o;

    /* renamed from: p, reason: collision with root package name */
    public xh2.a f337355p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f337356q;

    /* renamed from: r, reason: collision with root package name */
    public final yz5.p f337357r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(android.content.Context context, gk2.e buContext, lj2.x0 server) {
        super(context, false, null, false, 14, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(server, "server");
        this.f337350h = buContext;
        this.f337351i = server;
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f337352m = hashMap;
        this.f337353n = new java.util.HashMap();
        this.f337354o = new java.util.HashMap();
        ni2.i0 i0Var = new ni2.i0(this, context);
        this.f337357r = i0Var;
        android.view.View view = this.f337356q;
        if (view == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.qtz);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        hashMap.put(1, new ij2.c(findViewById, i0Var));
        android.view.View view2 = this.f337356q;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.View findViewById2 = view2.findViewById(com.tencent.mm.R.id.qub);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById2;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            this.f337352m.put(java.lang.Integer.valueOf(i17 + 2), new ij2.c(viewGroup.getChildAt(i17), this.f337357r));
        }
        android.view.View view3 = this.f337356q;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.View findViewById3 = view3.findViewById(com.tencent.mm.R.id.quc);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById3;
        int childCount2 = viewGroup2.getChildCount();
        for (int i18 = 0; i18 < childCount2; i18++) {
            this.f337352m.put(java.lang.Integer.valueOf(i18 + 6), new ij2.c(viewGroup2.getChildAt(i18), this.f337357r));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View b() {
        return h();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View c() {
        return f();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.f488939dl3;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f337356q = rootView;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void v() {
        kotlinx.coroutines.y0 a17 = this.f337351i.a();
        if (a17 != null) {
            kotlinx.coroutines.l.d(a17, null, null, new ni2.j0(this, null), 3, null);
        }
    }
}
