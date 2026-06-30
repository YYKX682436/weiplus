package com.tencent.mm.plugin.game.media;

/* loaded from: classes8.dex */
public class GameLocalGalleryView extends android.widget.FrameLayout implements t23.m1 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f140044q = 0;

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f140045d;

    /* renamed from: e, reason: collision with root package name */
    public i53.i1 f140046e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f140047f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f140048g;

    /* renamed from: h, reason: collision with root package name */
    public int f140049h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f140050i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f140051m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f140052n;

    /* renamed from: o, reason: collision with root package name */
    public int f140053o;

    /* renamed from: p, reason: collision with root package name */
    public long f140054p;

    public GameLocalGalleryView(android.content.Context context) {
        super(context);
        this.f140051m = false;
        this.f140052n = false;
        this.f140053o = 0;
        this.f140054p = 0L;
        b();
    }

    public void a() {
        i53.i1 i1Var = this.f140046e;
        java.util.ArrayList arrayList = i1Var.f288595e;
        arrayList.clear();
        i53.b1 b1Var = i1Var.f288599i;
        if (b1Var != null) {
            ((i53.z0) b1Var).a(arrayList.size());
        }
        i1Var.f288601n.postDelayed(new i53.f1(i1Var), 500L);
    }

    public final void b() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.bhg, (android.view.ViewGroup) this, false);
        this.f140045d = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.gn6);
        this.f140045d.setLayoutManager(new com.tencent.mm.plugin.game.widget.GameGridLayoutManager(getContext(), 4));
        this.f140045d.N(new i53.a1(this));
        i53.i1 i1Var = new i53.i1(this, getContext());
        this.f140046e = i1Var;
        this.f140045d.setAdapter(i1Var);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gn_);
        this.f140047f = textView;
        textView.setOnClickListener(new i53.x0(this));
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.gn8);
        this.f140048g = button;
        button.setOnClickListener(new i53.y0(this));
        this.f140046e.f288599i = new i53.z0(this);
        addView(inflate, -1, -1);
    }

    public final void c(int i17, int i18, java.util.Map map) {
        if (map == null) {
            map = new java.util.HashMap();
        }
        com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 87, 8767, i17, i18, this.f140053o, lj0.a.a(7, map));
    }

    public void setQueryType(int i17) {
        this.f140046e.f288597g = i17;
        ((d60.y) ((e60.c1) i95.n0.c(e60.c1.class))).getClass();
        t23.p0.k().g(i17);
        ((d60.y) ((e60.c1) i95.n0.c(e60.c1.class))).getClass();
        t23.p0.k().f415297f = 15;
        ((d60.y) ((e60.c1) i95.n0.c(e60.c1.class))).getClass();
        t23.p0.k().b(this);
        this.f140054p = java.lang.System.currentTimeMillis();
        ((d60.y) ((e60.c1) i95.n0.c(e60.c1.class))).getClass();
        t23.x1 k17 = t23.p0.k();
        k17.e("", k17.f415298g, this.f140054p);
    }

    public void setSelectLimitCount(int i17) {
        this.f140046e.f288598h = i17;
        this.f140049h = i17;
    }

    @Override // t23.m1
    public void u5(java.util.LinkedList linkedList, long j17, boolean z17) {
        if (this.f140054p == j17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (linkedList != null) {
                arrayList.addAll(linkedList);
            }
            i53.i1 i1Var = this.f140046e;
            if (i1Var != null) {
                i1Var.getClass();
                com.tencent.mm.sdk.platformtools.u3.h(new i53.e1(i1Var, arrayList));
            }
        }
    }

    public GameLocalGalleryView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f140051m = false;
        this.f140052n = false;
        this.f140053o = 0;
        this.f140054p = 0L;
        b();
    }

    public GameLocalGalleryView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f140051m = false;
        this.f140052n = false;
        this.f140053o = 0;
        this.f140054p = 0L;
        b();
    }
}
