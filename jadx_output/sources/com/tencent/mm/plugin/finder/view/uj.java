package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class uj {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f133182a;

    /* renamed from: b, reason: collision with root package name */
    public final int f133183b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f133184c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f133185d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f133186e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f133187f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f133188g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f133189h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f133190i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f133191j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.oj f133192k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.oj f133193l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.oj f133194m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f133195n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f133196o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f133197p;

    /* renamed from: q, reason: collision with root package name */
    public db5.o4 f133198q;

    /* renamed from: r, reason: collision with root package name */
    public db5.o4 f133199r;

    /* renamed from: s, reason: collision with root package name */
    public db5.o4 f133200s;

    /* renamed from: t, reason: collision with root package name */
    public db5.r4 f133201t;

    static {
        com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
    }

    public uj(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f133182a = context;
        this.f133183b = context.getResources().getDisplayMetrics().widthPixels >= 1440 ? 5 : 4;
        this.f133184c = jz5.h.b(new com.tencent.mm.plugin.finder.view.qj(this));
        this.f133185d = jz5.h.b(new com.tencent.mm.plugin.finder.view.tj(this));
        this.f133186e = jz5.h.b(new com.tencent.mm.plugin.finder.view.rj(this));
        this.f133187f = jz5.h.b(new com.tencent.mm.plugin.finder.view.sj(this));
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.dlr, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f133188g = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.qsv);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
        this.f133189h = recyclerView;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.qsr);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) findViewById2;
        this.f133190i = recyclerView2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.qst);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView3 = (androidx.recyclerview.widget.RecyclerView) findViewById3;
        this.f133191j = recyclerView3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.qsu);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById4;
        this.f133195n = textView;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.qsq);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById5;
        this.f133196o = textView2;
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.qss);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById6;
        this.f133197p = textView3;
        com.tencent.mm.ui.fk.a(textView);
        com.tencent.mm.ui.fk.a(textView2);
        com.tencent.mm.ui.fk.a(textView3);
        com.tencent.mm.plugin.finder.view.oj ojVar = new com.tencent.mm.plugin.finder.view.oj(this);
        this.f133192k = ojVar;
        com.tencent.mm.plugin.finder.view.oj ojVar2 = new com.tencent.mm.plugin.finder.view.oj(this);
        this.f133193l = ojVar2;
        com.tencent.mm.plugin.finder.view.oj ojVar3 = new com.tencent.mm.plugin.finder.view.oj(this);
        this.f133194m = ojVar3;
        a(recyclerView, ojVar);
        a(recyclerView2, ojVar2);
        a(recyclerView3, ojVar3);
    }

    public final void a(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.finder.view.oj ojVar) {
        recyclerView.setFocusable(false);
        recyclerView.setAdapter(ojVar);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(this.f133182a, this.f133183b));
    }
}
