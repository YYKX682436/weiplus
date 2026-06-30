package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.o0 f130237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f130238e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f130239f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f130240g;

    public f(com.tencent.mm.plugin.finder.uniComments.o0 o0Var, androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        this.f130237d = o0Var;
        this.f130238e = recyclerView;
        this.f130239f = i17;
        this.f130240g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f130237d.getClass();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f130238e;
        kotlin.jvm.internal.o.g(recyclerView, "<this>");
        com.tencent.mm.plugin.finder.uniComments.m0 m0Var = new com.tencent.mm.plugin.finder.uniComments.m0(this.f130240g, 0, recyclerView.getContext());
        m0Var.f12049a = this.f130239f;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.startSmoothScroll(m0Var);
        }
    }
}
