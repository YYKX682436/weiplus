package qs1;

/* loaded from: classes8.dex */
public final class m implements rv.n2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f366228a;

    /* renamed from: b, reason: collision with root package name */
    public final int f366229b;

    /* renamed from: c, reason: collision with root package name */
    public final int f366230c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f366231d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f366232e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f366233f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f366234g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f366235h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f366236i;

    /* renamed from: j, reason: collision with root package name */
    public final android.view.View f366237j;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.core.widget.NestedScrollView f366238k;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f366239l;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f366240m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f366241n;

    /* renamed from: o, reason: collision with root package name */
    public final qs1.c f366242o;

    /* renamed from: p, reason: collision with root package name */
    public final qs1.c f366243p;

    /* renamed from: q, reason: collision with root package name */
    public final qs1.c f366244q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f366245r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f366246s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f366247t;

    /* renamed from: u, reason: collision with root package name */
    public final qs1.a f366248u;

    /* renamed from: v, reason: collision with root package name */
    public final qs1.a f366249v;

    /* renamed from: w, reason: collision with root package name */
    public final qs1.a f366250w;

    /* renamed from: x, reason: collision with root package name */
    public db5.o4 f366251x;

    /* renamed from: y, reason: collision with root package name */
    public db5.o4 f366252y;

    /* renamed from: z, reason: collision with root package name */
    public db5.o4 f366253z;

    public m(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f366228a = context;
        this.f366229b = 6;
        this.f366230c = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        this.f366231d = jz5.h.b(new qs1.h(this));
        this.f366232e = jz5.h.b(new qs1.d(this));
        this.f366233f = jz5.h.b(new qs1.f(this));
        this.f366234g = jz5.h.b(new qs1.l(this));
        this.f366235h = jz5.h.b(new qs1.g(this));
        this.f366236i = jz5.h.b(new qs1.j(this));
        this.f366248u = new qs1.a(this);
        this.f366249v = new qs1.a(this);
        this.f366250w = new qs1.a(this);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.dzc, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f366237j = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.sif);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f366238k = (androidx.core.widget.NestedScrollView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.sil);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById2;
        this.f366239l = recyclerView;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.sih);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) findViewById3;
        this.f366240m = recyclerView2;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.sij);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView3 = (androidx.recyclerview.widget.RecyclerView) findViewById4;
        this.f366241n = recyclerView3;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.sik);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById5;
        this.f366245r = textView;
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.sig);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById6;
        this.f366246s = textView2;
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.sii);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById7;
        this.f366247t = textView3;
        com.tencent.mm.ui.fk.a(textView);
        com.tencent.mm.ui.fk.a(textView2);
        com.tencent.mm.ui.fk.a(textView3);
        textView.setText("");
        textView.setVisibility(8);
        recyclerView.setVisibility(8);
        textView2.setText("");
        textView2.setVisibility(8);
        recyclerView2.setVisibility(8);
        textView3.setText("");
        textView3.setVisibility(8);
        recyclerView3.setVisibility(8);
        qs1.c cVar = new qs1.c(this);
        this.f366242o = cVar;
        qs1.c cVar2 = new qs1.c(this);
        this.f366243p = cVar2;
        qs1.c cVar3 = new qs1.c(this);
        this.f366244q = cVar3;
        b(recyclerView, cVar);
        b(recyclerView2, cVar2);
        b(recyclerView3, cVar3);
    }

    public final int a() {
        return ((java.lang.Number) this.f366231d.getValue()).intValue();
    }

    public final void b(androidx.recyclerview.widget.RecyclerView recyclerView, qs1.c cVar) {
        recyclerView.setFocusable(false);
        recyclerView.setAdapter(cVar);
        jz5.g gVar = this.f366232e;
        int intValue = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        android.content.Context context = this.f366228a;
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(context, intValue));
        recyclerView.setNestedScrollingEnabled(true);
        recyclerView.setPadding(0, recyclerView.getPaddingTop(), 0, recyclerView.getPaddingBottom());
        recyclerView.setClipToPadding(false);
        recyclerView.N(new rs1.a(((java.lang.Number) ((jz5.n) gVar).getValue()).intValue(), a(), (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479731dn)));
    }
}
