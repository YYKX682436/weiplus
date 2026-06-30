package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ym implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.mn f136590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager f136591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f136592f;

    public ym(com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar, com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f136590d = mnVar;
        this.f136591e = finderLinearLayoutManager;
        this.f136592f = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long longExtra = this.f136590d.getContext().getIntent().getLongExtra("KEY_VIDEO_START_PLAY_TIME_MS", 0L);
        if (longExtra > 0) {
            pm0.v.V(0L, new com.tencent.mm.plugin.finder.viewmodel.component.xm(this.f136591e, this.f136592f, longExtra));
        }
    }
}
