package u84;

/* loaded from: classes4.dex */
public final class x1 implements ym5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView f425687a;

    public x1(com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView snsAdInteractionTagView) {
        this.f425687a = snsAdInteractionTagView;
    }

    @Override // ym5.v1
    public void onFlush() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView$mPAGFlushListener$1");
        com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView snsAdInteractionTagView = this.f425687a;
        if (snsAdInteractionTagView.getMPAGThumb() != null) {
            android.widget.ImageView mPAGThumb = snsAdInteractionTagView.getMPAGThumb();
            boolean z17 = false;
            if (mPAGThumb != null && mPAGThumb.getVisibility() == 0) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("SnsAdInteractionTagView", "mThumbIv need to be gone");
                com.tencent.mm.view.MMPAGView mPAGView = snsAdInteractionTagView.getMPAGView();
                if (mPAGView != null) {
                    mPAGView.j(this);
                }
                android.widget.ImageView mPAGThumb2 = snsAdInteractionTagView.getMPAGThumb();
                if (mPAGThumb2 != null) {
                    mPAGThumb2.clearAnimation();
                }
                android.widget.ImageView mPAGThumb3 = snsAdInteractionTagView.getMPAGThumb();
                if (mPAGThumb3 != null) {
                    mPAGThumb3.setVisibility(8);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView$mPAGFlushListener$1");
    }
}
