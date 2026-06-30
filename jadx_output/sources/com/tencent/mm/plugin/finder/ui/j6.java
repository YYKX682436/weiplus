package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class j6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.o6 f129381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f129382e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager f129383f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f129384g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f129385h;

    public j6(com.tencent.mm.plugin.finder.ui.o6 o6Var, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2) {
        this.f129381d = o6Var;
        this.f129382e = recyclerView;
        this.f129383f = linearLayoutManager;
        this.f129384g = f0Var;
        this.f129385h = f0Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.ui.o6 o6Var = this.f129381d;
        o6Var.o(this.f129382e, this.f129383f, o6Var.f129579n, true);
        com.tencent.mm.plugin.finder.ui.o6 o6Var2 = this.f129381d;
        com.tencent.mm.plugin.finder.ui.o6.n(o6Var2, this.f129382e, this.f129383f, this.f129384g.f310116d, this.f129385h.f310116d, o6Var2.f129579n);
        o6Var.f129579n = 0;
        o6Var.f129580o = null;
    }
}
