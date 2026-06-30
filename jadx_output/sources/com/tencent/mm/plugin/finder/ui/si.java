package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class si implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f129814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f129815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f129816f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f129817g;

    public si(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI, long j17, boolean z17, in5.s0 s0Var) {
        this.f129814d = finderShareFeedRelUI;
        this.f129815e = j17;
        this.f129816f = z17;
        this.f129817g = s0Var;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener
    public final void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        cw2.da videoView;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        java.lang.String str = this.f129814d.C;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkSeek: onSeekComplete, feedId=");
        sb6.append(pm0.v.u(this.f129815e));
        sb6.append(", afterSeekPlay=");
        boolean z17 = this.f129816f;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        in5.s0 s0Var = this.f129817g;
        if (!z17 && (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k)) != null) {
            cw2.v9.j(finderVideoLayout, false, 1, null);
        }
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout2 = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
        if (finderVideoLayout2 == null || (videoView = finderVideoLayout2.getVideoView()) == null) {
            return;
        }
        videoView.setMute(false);
    }
}
