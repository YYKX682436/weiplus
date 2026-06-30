package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.s1 f122456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f122457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager f122458f;

    public t0(com.tencent.mm.plugin.finder.playlist.s1 s1Var, androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager) {
        this.f122456d = s1Var;
        this.f122457e = recyclerView;
        this.f122458f = finderLinearLayoutManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.ui.o6 o6Var = ((com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI) this.f122456d.f122421a).p7().f106976o;
        if (o6Var != null) {
            o6Var.o(this.f122457e, this.f122458f, 1, true);
        }
    }
}
