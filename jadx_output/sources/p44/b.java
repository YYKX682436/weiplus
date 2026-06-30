package p44;

/* loaded from: classes4.dex */
public final class b extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView f351770a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView adLandingPagePickCardTipView, android.os.Looper looper) {
        super(looper);
        this.f351770a = adLandingPagePickCardTipView;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message msg) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView$mUIHandler$1");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("AdLandingPagePickCardTipView", "handleMessage, msg=" + msg.what);
        int i17 = msg.what;
        com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView adLandingPagePickCardTipView = this.f351770a;
        if (i17 == 1) {
            int i18 = com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView.f162696n;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMTextStyleTipLayout$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            android.widget.LinearLayout linearLayout = adLandingPagePickCardTipView.f162698e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMTextStyleTipLayout$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            if (linearLayout != null) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(linearLayout, "alpha", 0.0f, 1.0f);
                p44.q.f351832a.a(linearLayout, ofFloat);
                ofFloat.setDuration(300L);
                ofFloat.start();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMBtnStyleTipLayout$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = adLandingPagePickCardTipView.f162699f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMBtnStyleTipLayout$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            if (roundedCornerFrameLayout != null) {
                roundedCornerFrameLayout.setAlpha(0.0f);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAdLandingPageEggCardHelper$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = adLandingPagePickCardTipView.f162703m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAdLandingPageEggCardHelper$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            if (i0Var != null) {
                i0Var.L(false, false);
            }
            sendEmptyMessageDelayed(2, 5000L);
        } else if (i17 == 2) {
            int i19 = com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView.f162696n;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMTextStyleTipLayout$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            android.widget.LinearLayout linearLayout2 = adLandingPagePickCardTipView.f162698e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMTextStyleTipLayout$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            if (linearLayout2 != null) {
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(linearLayout2, "alpha", 1.0f, 0.0f);
                p44.q.f351832a.a(linearLayout2, ofFloat2);
                ofFloat2.setDuration(300L);
                ofFloat2.start();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMBtnStyleTipLayout$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout2 = adLandingPagePickCardTipView.f162699f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMBtnStyleTipLayout$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            if (roundedCornerFrameLayout2 != null) {
                android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(roundedCornerFrameLayout2, "alpha", 0.0f, 1.0f);
                p44.q.f351832a.a(roundedCornerFrameLayout2, ofFloat3);
                ofFloat3.setStartDelay(100L);
                ofFloat3.setDuration(300L);
                ofFloat3.start();
            }
            sendEmptyMessageDelayed(3, 5000L);
        } else if (i17 == 3) {
            int i27 = com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView.f162696n;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMTextStyleTipLayout$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            android.widget.LinearLayout linearLayout3 = adLandingPagePickCardTipView.f162698e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMTextStyleTipLayout$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            if (linearLayout3 != null && linearLayout3.getAlpha() > 0.0f) {
                android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(linearLayout3, "alpha", adLandingPagePickCardTipView.getAlpha(), 0.0f);
                p44.q.f351832a.a(linearLayout3, ofFloat4);
                ofFloat4.setDuration(300L);
                ofFloat4.start();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMBtnStyleTipLayout$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout3 = adLandingPagePickCardTipView.f162699f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMBtnStyleTipLayout$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            if (roundedCornerFrameLayout3 != null) {
                android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(roundedCornerFrameLayout3, "alpha", 1.0f, 0.0f);
                p44.q.f351832a.a(roundedCornerFrameLayout3, ofFloat5);
                ofFloat5.addListener(new p44.a(adLandingPagePickCardTipView));
                ofFloat5.setDuration(300L);
                ofFloat5.start();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAdLandingPageEggCardHelper$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var2 = adLandingPagePickCardTipView.f162703m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAdLandingPageEggCardHelper$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            if (i0Var2 != null) {
                i0Var2.L(true, true);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView$mUIHandler$1");
    }
}
