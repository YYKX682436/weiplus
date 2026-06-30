package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFeedSearchUI f125786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.n2 f125787e;

    public n1(com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI, androidx.recyclerview.widget.n2 n2Var) {
        this.f125786d = finderFeedSearchUI;
        this.f125787e = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f125786d.P;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(this.f125787e);
        } else {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
    }
}
