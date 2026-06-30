package v74;

/* loaded from: classes4.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v74.h1 f433774d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(v74.h1 h1Var) {
        super(2);
        this.f433774d = h1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        java.lang.String str = "invoke";
        java.lang.String str2 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic$mVideoPlayUpdateCallback$1";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic$mVideoPlayUpdateCallback$1");
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic$mVideoPlayUpdateCallback$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSplashCardInfo$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        v74.h1 h1Var = this.f433774d;
        v74.l lVar = h1Var.f433815o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSplashCardInfo$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        if (lVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAdLookbookStatistic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAdLookbookStatistic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
            v74.v0 v0Var = h1Var.f433803c;
            v0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSplashCardVideoPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
            v74.u0 u0Var = v0Var.f433938h;
            if (u0Var != null) {
                if (intValue > 0) {
                    u0Var.i(1);
                }
                if (intValue2 > 0) {
                    int i18 = intValue > intValue2 ? intValue2 : intValue;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDurationMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                    u0Var.f433922a = intValue2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDurationMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                    i17 = i18;
                } else {
                    i17 = intValue;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPlayTotalTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                u0Var.f433924c = i17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPlayTotalTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMaxPlayTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                u0Var.f433925d = i17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMaxPlayTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                u0Var.h(i17);
            } else {
                com.tencent.mars.xlog.Log.e("AdLookbookStatistic.splashCard", "onSplashCardVideoPlaying, data==null");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSplashCardVideoPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAnimDelay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$SplashCardInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAnimDelay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$SplashCardInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMIsPlayedAnim$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMIsPlayedAnim$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMIsPlayingAnim$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMIsPlayingAnim$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
            long j17 = intValue;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAnimDelay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$SplashCardInfo");
            long j18 = lVar.f433862b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAnimDelay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$SplashCardInfo");
            if (j17 >= j18) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMIsPlayedAnim$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                boolean z17 = h1Var.f433813m;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMIsPlayedAnim$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                if (!z17) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMIsPlayingAnim$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                    boolean z18 = h1Var.f433812l;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMIsPlayingAnim$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                    if (!z18) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAdLookbookStatistic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAdLookbookStatistic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                        v0Var.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSplashCardVideoPlayEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
                        v74.u0 u0Var2 = v0Var.f433938h;
                        if (u0Var2 != null) {
                            u0Var2.i(1);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                            u0Var2.f433923b = 1;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                            int abs = java.lang.Math.abs(u0Var2.g() - u0Var2.b());
                            com.tencent.mars.xlog.Log.i("AdLookbookStatistic.splashCard", "onSplashCardVideoPlayEnd, durationMs=" + u0Var2.b() + ", playTime=" + u0Var2.g() + ", delta=" + abs);
                            if (u0Var2.b() > 0 && abs < 1000) {
                                int b17 = u0Var2.b();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPlayTotalTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                                u0Var2.f433924c = b17;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPlayTotalTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                                int b18 = u0Var2.b();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMaxPlayTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                                u0Var2.f433925d = b18;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMaxPlayTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                                u0Var2.h(u0Var2.b());
                            }
                        } else {
                            com.tencent.mars.xlog.Log.e("AdLookbookStatistic.splashCard", "onSplashCardVideoPlayEnd, data==null");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSplashCardVideoPlayEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$stopVideoUpdateTimer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                        h1Var.g();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$stopVideoUpdateTimer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$startAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                        com.tencent.mars.xlog.Log.i("SplashCardLogic", "startAnim");
                        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = h1Var.f433804d;
                        if (roundedCornerFrameLayout == null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                        } else {
                            h0Var.f310123d = roundedCornerFrameLayout;
                            kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
                            com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView b19 = h1Var.f433801a.b();
                            if (b19 == null) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                            } else {
                                h0Var2.f310123d = b19;
                                v74.l lVar2 = h1Var.f433815o;
                                if (lVar2 == null) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                                } else {
                                    kotlin.jvm.internal.h0 h0Var3 = new kotlin.jvm.internal.h0();
                                    v74.s sVar = h1Var.f433816p;
                                    if (sVar == null) {
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                                    } else {
                                        h0Var3.f310123d = sVar;
                                        if (h1Var.f433813m || h1Var.f433812l) {
                                            com.tencent.mars.xlog.Log.i("SplashCardLogic", "startAnim, isPlayed=" + h1Var.f433813m + ", isPlaying=" + h1Var.f433812l);
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                                        } else {
                                            h1Var.f433812l = true;
                                            h1Var.f433813m = true;
                                            com.tencent.mars.xlog.Log.i("SplashCardLogic", "doAnim");
                                            h1Var.e(true);
                                            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                                            ofFloat.setInterpolator(new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAnimDuration", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$SplashCardInfo");
                                            long j19 = lVar2.f433863c;
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAnimDuration", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$SplashCardInfo");
                                            ofFloat.setDuration(j19);
                                            ofFloat.addUpdateListener(new v74.f1(h0Var3, h0Var, h0Var2, h1Var));
                                            ofFloat.addListener(new v74.g1(h1Var, h0Var2, h0Var));
                                            h1Var.f433820t = ofFloat;
                                            ofFloat.start();
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                                        }
                                    }
                                }
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$startAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                    }
                }
            }
            str = "invoke";
            str2 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic$mVideoPlayUpdateCallback$1";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
        return f0Var;
    }
}
