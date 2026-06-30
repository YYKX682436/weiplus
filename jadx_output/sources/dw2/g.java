package dw2;

/* loaded from: classes2.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dw2.o f244120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f244121e;

    public g(dw2.o oVar, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f244120d = oVar;
        this.f244121e = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        lw2.m videoScaleCleanHelper;
        dw2.o.f(this.f244120d, null, false, "onChildViewAttachedToWindow", 3, null);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f244121e;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
        if (finderLinearLayoutManager != null) {
            androidx.recyclerview.widget.k3 q07 = recyclerView.q0(finderLinearLayoutManager.w(), false);
            in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
            if (s0Var == null || (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k)) == null || (videoScaleCleanHelper = finderVideoLayout.getVideoScaleCleanHelper()) == null) {
                return;
            }
            videoScaleCleanHelper.g();
        }
    }
}
