package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.s1 f122467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f122468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager f122469f;

    public u0(com.tencent.mm.plugin.finder.playlist.s1 s1Var, androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager) {
        this.f122467d = s1Var;
        this.f122468e = recyclerView;
        this.f122469f = finderLinearLayoutManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.v20 v20Var = ((com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI) this.f122467d.f122421a).E;
        if (v20Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        com.tencent.mm.plugin.finder.ui.o6 o6Var = v20Var.f106976o;
        if (o6Var != null) {
            o6Var.o(this.f122468e, this.f122469f, 1, true);
        }
    }
}
