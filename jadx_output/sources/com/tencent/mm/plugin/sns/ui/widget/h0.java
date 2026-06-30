package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class h0 implements n84.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView f171146a;

    public h0(com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView) {
        this.f171146a = snsAdBreakFrameVideoView;
    }

    public final void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayProgress", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$3");
        com.tencent.mm.plugin.sns.ui.widget.p onProgressListener = this.f171146a.getOnProgressListener();
        if (onProgressListener != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayProgress", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
            hd4.i iVar = ((gd4.r) onProgressListener).f270834s;
            if (iVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayProgress", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureLogic");
                try {
                    hd4.g gVar = iVar.f280586b;
                    if (gVar != null) {
                        gVar.C(iVar.f280587c, j17);
                    }
                } catch (java.lang.Throwable th6) {
                    ca4.q.c("AdBreakFrameGestureLogic", th6);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayProgress", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureLogic");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayProgress", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayProgress", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$3");
    }
}
