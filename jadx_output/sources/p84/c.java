package p84;

/* loaded from: classes4.dex */
public final class c extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p84.e f352776a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p84.e eVar, android.os.Looper looper) {
        super(looper);
        this.f352776a = eVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message msg) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$mUIHandler$1");
        kotlin.jvm.internal.o.g(msg, "msg");
        int i17 = msg.arg1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$handleVideoPlaying", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        p84.e eVar = this.f352776a;
        eVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleVideoPlaying", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        com.tencent.mm.plugin.sns.storage.u uVar = eVar.f352783e;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = eVar.f352782d;
        if (uVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleVideoPlaying", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        } else {
            if (snsInfo != null) {
                int i18 = uVar.f166147b;
                int i19 = uVar.f166148c;
                boolean z17 = eVar.f352788j;
                boolean z18 = eVar.f352789k;
                com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView animLabelView = eVar.f352784f;
                if (i17 >= i18) {
                    if (i17 < i19) {
                        eVar.f352789k = false;
                        if (z17) {
                            str = "handleMessage";
                        } else {
                            eVar.f352788j = true;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
                            android.view.View view = eVar.f352785g;
                            if (view != null) {
                                if (view.getVisibility() == 0) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startOutViewDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
                                    android.view.View view2 = eVar.f352785g;
                                    if (view2 == null) {
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startOutViewDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
                                    } else {
                                        if (view2.getVisibility() == 0) {
                                            if (eVar.f352787i == null) {
                                                str = "handleMessage";
                                                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(eVar.f352785g, "translationX", 0.0f, i65.a.b(animLabelView.getContext(), 16));
                                                ofFloat.setDuration(500L);
                                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
                                                android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
                                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
                                                ofFloat.setInterpolator(pathInterpolator);
                                                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(eVar.f352785g, "alpha", 1.0f, 0.0f);
                                                ofFloat2.setDuration(500L);
                                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
                                                android.view.animation.PathInterpolator pathInterpolator2 = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
                                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
                                                ofFloat2.setInterpolator(pathInterpolator2);
                                                android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                                                animatorSet.play(ofFloat).with(ofFloat2);
                                                animatorSet.addListener(new p84.d(eVar));
                                                eVar.f352787i = animatorSet;
                                            } else {
                                                str = "handleMessage";
                                            }
                                            android.animation.AnimatorSet animatorSet2 = eVar.f352787i;
                                            if (animatorSet2 != null) {
                                                animatorSet2.start();
                                            }
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startOutViewDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
                                        } else {
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startOutViewDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
                                        }
                                    }
                                    str = "handleMessage";
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
                                }
                            }
                            str = "handleMessage";
                            animLabelView.a();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
                        }
                    } else {
                        str = "handleMessage";
                        eVar.f352788j = false;
                        if (!z18) {
                            eVar.f352789k = true;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
                            animLabelView.getClass();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startContentDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
                            if (animLabelView.f163518p == null) {
                                float b17 = i65.a.b(animLabelView.getContext(), 12);
                                android.view.View view3 = animLabelView.f163510e;
                                if (view3 == null) {
                                    kotlin.jvm.internal.o.o("mContentView");
                                    throw null;
                                }
                                str2 = "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$mUIHandler$1";
                                android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view3, "translationX", 0.0f, b17);
                                str3 = "startContentDisappearAnim";
                                ofFloat3.setDuration(500L);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
                                android.view.animation.PathInterpolator pathInterpolator3 = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
                                ofFloat3.setInterpolator(pathInterpolator3);
                                android.view.View view4 = animLabelView.f163510e;
                                if (view4 == null) {
                                    kotlin.jvm.internal.o.o("mContentView");
                                    throw null;
                                }
                                android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(view4, "alpha", 1.0f, 0.0f);
                                ofFloat4.setDuration(500L);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
                                android.view.animation.PathInterpolator pathInterpolator4 = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
                                ofFloat4.setInterpolator(pathInterpolator4);
                                android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
                                animatorSet3.addListener(new p84.h(animLabelView));
                                animatorSet3.play(ofFloat3).with(ofFloat4);
                                animLabelView.f163518p = animatorSet3;
                            } else {
                                str2 = "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$mUIHandler$1";
                                str3 = "startContentDisappearAnim";
                            }
                            android.animation.AnimatorSet animatorSet4 = animLabelView.f163518p;
                            if (animatorSet4 != null) {
                                animatorSet4.start();
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
                        }
                    }
                    str2 = "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$mUIHandler$1";
                } else {
                    str = "handleMessage";
                    str2 = "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$mUIHandler$1";
                    if (animLabelView.getVisibility() == 0) {
                        eVar.d();
                    }
                    eVar.f352790l.removeCallbacksAndMessages(null);
                    eVar.f352788j = false;
                    eVar.f352789k = false;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleVideoPlaying", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$handleVideoPlaying", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleVideoPlaying", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        }
        str = "handleMessage";
        str2 = "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$mUIHandler$1";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$handleVideoPlaying", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }
}
