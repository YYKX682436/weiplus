package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class a0 implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f170921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView f170922e;

    public a0(kotlinx.coroutines.q qVar, com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView) {
        this.f170921d = qVar;
        this.f170922e = snsAdBreakFrameVideoView;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener
    public final void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        kk4.c cVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$2$1$1");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        ((kotlinx.coroutines.r) this.f170921d).resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
        com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView mPlayerView = this.f170922e.getMPlayerView();
        if (mPlayerView != null && (cVar = mPlayerView.f163479e) != null) {
            ((kk4.f0) cVar).setOnSeekCompleteListener(null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$2$1$1");
    }
}
