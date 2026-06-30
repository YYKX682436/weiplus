package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFeedSearchUI f125700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.n2 f125701e;

    public g1(com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI, androidx.recyclerview.widget.n2 n2Var) {
        this.f125700d = finderFeedSearchUI;
        this.f125701e = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f125700d.P;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(this.f125701e);
        } else {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
    }
}
