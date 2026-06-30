package xx0;

/* loaded from: classes5.dex */
public final class d0 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f457876d;

    /* renamed from: e, reason: collision with root package name */
    public final vt3.r f457877e;

    /* renamed from: f, reason: collision with root package name */
    public final xx0.i f457878f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ProgressBar f457879g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f457880h;

    /* renamed from: i, reason: collision with root package name */
    public final xx0.t f457881i;

    /* renamed from: m, reason: collision with root package name */
    public volatile kotlinx.coroutines.r2 f457882m;

    /* renamed from: n, reason: collision with root package name */
    public volatile e06.k f457883n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f457884o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(android.content.Context context, kotlinx.coroutines.y0 scope, vt3.r tabItem, xx0.i dataProvider, xx0.j jVar) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(tabItem, "tabItem");
        kotlin.jvm.internal.o.g(dataProvider, "dataProvider");
        this.f457876d = scope;
        this.f457877e = tabItem;
        this.f457878f = dataProvider;
        this.f457883n = new e06.k(Integer.MIN_VALUE, Integer.MIN_VALUE);
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f489470dk3, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.lbl);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f457879g = (android.widget.ProgressBar) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.lqa);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById2;
        this.f457880h = recyclerView;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.ait);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.aix);
        int i17 = (com.tencent.mm.ui.bk.h(context).x - (dimensionPixelSize * 2)) / dimensionPixelSize2;
        i17 = i17 <= 0 ? 4 : i17;
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(context, i17, 1, false));
        recyclerView.N(new xx0.o(context, i17, dimensionPixelSize2));
        xx0.t tVar = new xx0.t(dataProvider, jVar);
        this.f457881i = tVar;
        recyclerView.setAdapter(tVar);
        recyclerView.i(new xx0.a0(this));
    }

    public final void a() {
        e06.k kVar;
        int i17;
        int i18;
        pp0.k0 k0Var = (pp0.k0) i95.n0.c(pp0.k0.class);
        long j17 = this.f457877e.f440039a;
        ((yy0.o0) k0Var).getClass();
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        java.lang.String templateTabID = java.lang.String.valueOf(j17);
        yy0.m7 m7Var = (yy0.m7) l0Var;
        m7Var.getClass();
        kotlin.jvm.internal.o.g(templateTabID, "templateTabID");
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.e6(m7Var, templateTabID, null), 3, null);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map Ai = m7Var.Ai();
        Ai.put("template_tab_id", java.lang.Long.valueOf(j17));
        Ai.put("view_id", "sc_enter_template_tab");
        ((cy1.a) rVar).yj("sc_enter_template_tab", null, Ai, 6, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.TemplateTabPageView", "notifyIsSelected tab: " + this.f457877e.f440039a);
        this.f457884o = true;
        if (kotlin.jvm.internal.o.b(this.f457883n, new e06.k(Integer.MIN_VALUE, Integer.MIN_VALUE)) || (i17 = (kVar = this.f457883n).f246209d) > (i18 = kVar.f246210e)) {
            return;
        }
        while (true) {
            this.f457881i.B(i17);
            if (i17 == i18) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final void b() {
        e06.k kVar;
        int i17;
        int i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.TemplateTabPageView", "notifyIsUnselected tab: " + this.f457877e.f440039a);
        this.f457884o = false;
        if (kotlin.jvm.internal.o.b(this.f457883n, new e06.k(Integer.MIN_VALUE, Integer.MIN_VALUE)) || (i17 = (kVar = this.f457883n).f246209d) > (i18 = kVar.f246210e)) {
            return;
        }
        while (true) {
            this.f457881i.z(i17);
            if (i17 == i18) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final long getTabID() {
        return this.f457877e.f440039a;
    }
}
