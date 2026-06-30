package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class pl {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f132848a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f132849b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f132850c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.nl f132851d;

    public pl(android.content.Context context, long j17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f132848a = context;
        this.f132849b = jz5.h.b(new com.tencent.mm.plugin.finder.view.ol(this));
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.e7g, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f132850c = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.tvg);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
        com.tencent.mm.plugin.finder.view.nl nlVar = new com.tencent.mm.plugin.finder.view.nl(this);
        this.f132851d = nlVar;
        recyclerView.setFocusable(false);
        recyclerView.setAdapter(nlVar);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
    }
}
