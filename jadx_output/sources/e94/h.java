package e94;

/* loaded from: classes4.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView f250378d;

    public h(com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView gLTwistRoateCardsView) {
        this.f250378d = gLTwistRoateCardsView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$1");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView.f163901J;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView gLTwistRoateCardsView = this.f250378d;
        gLTwistRoateCardsView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        float f17 = gLTwistRoateCardsView.A ? -180.0f : 180.0f;
        char c17 = 0;
        int i18 = 0;
        while (i18 < 12) {
            t84.c cVar = (t84.c) gLTwistRoateCardsView.e(i18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInitCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(cVar, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(500L);
            float[] fArr = new float[2];
            fArr[c17] = f17;
            fArr[1] = 0.0f;
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(cVar, "rotation", fArr);
            int i19 = i18;
            long j17 = 1500;
            ofFloat2.setDuration(j17);
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(cVar, "scaleX", 0.3f, 1.0f);
            ofFloat3.setDuration(j17);
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(cVar, "scaleY", 0.3f, 1.0f);
            ofFloat4.setDuration(j17);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat3, ofFloat4, ofFloat2);
            if (i19 == 0) {
                ofFloat2.addListener(new e94.j(gLTwistRoateCardsView));
                ofFloat2.addUpdateListener(new e94.k(gLTwistRoateCardsView));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInitCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            animatorSet.start();
            i18 = i19 + 1;
            c17 = 0;
        }
        android.animation.ValueAnimator ofFloat5 = android.animation.ValueAnimator.ofFloat(0.3f, 1.0f);
        ofFloat5.setDuration(1500L);
        ofFloat5.addUpdateListener(new e94.i(gLTwistRoateCardsView));
        ofFloat5.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$1");
    }
}
