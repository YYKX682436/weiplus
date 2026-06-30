package q74;

/* loaded from: classes4.dex */
public final class l0 implements ym5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q74.s0 f360475a;

    public l0(q74.s0 s0Var) {
        this.f360475a = s0Var;
    }

    @Override // ym5.v1
    public void onFlush() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$mPagFlushListener$1");
        q74.s0 s0Var = this.f360475a;
        if (q74.s0.d(s0Var) != null) {
            android.widget.ImageView d17 = q74.s0.d(s0Var);
            boolean z17 = false;
            if (d17 != null && d17.getVisibility() == 0) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("SlideFullCardBreakFrameUICtrl", "mThumbIv need to be gone");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPagView$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                com.tencent.mm.view.MMPAGView mMPAGView = s0Var.f360506o;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPagView$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                if (mMPAGView != null) {
                    mMPAGView.j(this);
                }
                android.widget.ImageView d18 = q74.s0.d(s0Var);
                if (d18 != null) {
                    d18.clearAnimation();
                }
                android.widget.ImageView d19 = q74.s0.d(s0Var);
                if (d19 != null) {
                    d19.setVisibility(8);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$mPagFlushListener$1");
    }
}
