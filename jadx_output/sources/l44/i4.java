package l44;

/* loaded from: classes4.dex */
public final class i4 implements w64.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u74.d f316180a;

    public i4(u74.d dVar) {
        this.f316180a = dVar;
    }

    @Override // w64.w
    public void a(int i17) {
        com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView snsAdTimelineVideoView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("seek", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createFullCardAdLandingPageJumpAnimInfo$1$seekable$1");
        u74.d dVar = this.f316180a;
        u74.c cVar = dVar.T;
        if (cVar == null || !cVar.f425133c) {
            com.tencent.mm.plugin.sns.ui.g9 g9Var = dVar.f425154o;
            if (g9Var != null && (snsAdTimelineVideoView = g9Var.f168417g) != null && snsAdTimelineVideoView.getVisibility() == 0) {
                com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView snsAdTimelineVideoView2 = dVar.f425154o.f168417g;
                snsAdTimelineVideoView2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replayVideos", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
                m3.a aVar = snsAdTimelineVideoView2.f170830z;
                if (aVar != null) {
                    aVar.accept(java.lang.Boolean.TRUE);
                }
                snsAdTimelineVideoView2.k(0, false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replayVideos", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
                com.tencent.mars.xlog.Log.i("ClickActionHelper", "seek newVideoView to 0");
            }
        } else {
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView = dVar.f425162w;
            if (snsTimelineVideoView != null) {
                snsTimelineVideoView.M(0, false);
                com.tencent.mars.xlog.Log.i("ClickActionHelper", "seek onlineVideoView to 0");
            }
        }
        u74.c cVar2 = dVar.T;
        if (cVar2 != null) {
            fd4.l lVar = cVar2.f425135e;
            if (lVar != null) {
                lVar.e();
                com.tencent.mars.xlog.Log.i("ClickActionHelper", "onCardClickAnimEnd");
            }
            if (cVar2.f425136f != null) {
                cVar2.f425136f.onAnimationEnd(new android.animation.AnimatorSet());
                com.tencent.mars.xlog.Log.i("ClickActionHelper", "mClickToLandingPageAnimListener onCardClickAnimEnd");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("seek", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createFullCardAdLandingPageJumpAnimInfo$1$seekable$1");
    }
}
