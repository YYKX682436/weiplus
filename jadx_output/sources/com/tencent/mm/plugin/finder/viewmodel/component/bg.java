package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class bg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.gg f133874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager f133875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f133876f;

    public bg(com.tencent.mm.plugin.finder.viewmodel.component.gg ggVar, com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f133874d = ggVar;
        this.f133875e = finderLinearLayoutManager;
        this.f133876f = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long longExtra = this.f133874d.getIntent().getLongExtra("KEY_VIDEO_START_PLAY_TIME_MS", 0L);
        if (longExtra > 0) {
            pm0.v.V(0L, new com.tencent.mm.plugin.finder.viewmodel.component.ag(this.f133875e, this.f133876f, longExtra));
        }
    }
}
