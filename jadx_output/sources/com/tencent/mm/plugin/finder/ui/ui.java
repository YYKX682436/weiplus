package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class ui implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f129924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager f129925e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f129926f;

    public ui(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI, com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f129924d = finderShareFeedRelUI;
        this.f129925e = finderLinearLayoutManager;
        this.f129926f = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI = this.f129924d;
        long longExtra = finderShareFeedRelUI.getIntent().getLongExtra("KEY_VIDEO_START_PLAY_TIME_MS", 0L);
        float floatExtra = finderShareFeedRelUI.getIntent().getFloatExtra("KEY_VIDEO_PLAY_SPEED_RATIO", 1.0f);
        boolean z17 = !finderShareFeedRelUI.getIntent().getBooleanExtra("KEY_VIDEO_IS_PAUSE", false);
        boolean booleanExtra = finderShareFeedRelUI.getIntent().getBooleanExtra("KEY_VIDEO_CLEAR_VIDEO_CACHE", false);
        if (longExtra > 0 || booleanExtra) {
            pm0.v.V(0L, new com.tencent.mm.plugin.finder.ui.ti(this.f129925e, this.f129926f, this.f129924d, longExtra, floatExtra, z17));
        }
    }
}
