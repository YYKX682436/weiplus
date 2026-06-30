package k84;

/* loaded from: classes4.dex */
public final class l2 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f305105d;

    public l2(k84.d4 d4Var) {
        this.f305105d = d4Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6$3");
        jz5.l lVar = (jz5.l) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6$3");
        java.lang.Boolean bool = (java.lang.Boolean) lVar.f302833d;
        l44.e0 e0Var = (l44.e0) lVar.f302834e;
        com.tencent.mars.xlog.Log.i(this.f305105d.j(), "likeStatus = " + e0Var + "  isAttractPagPlayed = " + bool);
        kotlin.jvm.internal.o.d(bool);
        if (bool.booleanValue()) {
            if (e0Var == l44.e0.f316094e) {
                k84.d4 d4Var = this.f305105d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$triggerCheerContainerAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
                d4Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerCheerContainerAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
                com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView adAttitudeAttractView = d4Var.f305001r;
                java.lang.String str = null;
                android.content.Context context = adAttitudeAttractView != null ? adAttitudeAttractView.getContext() : null;
                if (context == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerCheerContainerAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
                } else {
                    int color = context.getColor(com.tencent.mm.R.color.f478492d);
                    s74.u3 u3Var = s74.u3.f404562a;
                    if (com.tencent.mm.ui.bk.C()) {
                        mb4.r B = d4Var.B();
                        if (B != null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLikeButtonBgColor", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
                            mb4.o oVar = B.f325455b;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLikeButtonBgColor", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
                            if (oVar != null) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getColorDark", "com.tencent.mm.plugin.sns.storage.adsocial.ColorEntity");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getColorDark", "com.tencent.mm.plugin.sns.storage.adsocial.ColorEntity");
                                str = oVar.f325448b;
                            }
                        }
                    } else {
                        mb4.r B2 = d4Var.B();
                        if (B2 != null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLikeButtonBgColor", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
                            mb4.o oVar2 = B2.f325455b;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLikeButtonBgColor", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
                            if (oVar2 != null) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getColor", "com.tencent.mm.plugin.sns.storage.adsocial.ColorEntity");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getColor", "com.tencent.mm.plugin.sns.storage.adsocial.ColorEntity");
                                str = oVar2.f325447a;
                            }
                        }
                    }
                    int w17 = u3Var.w(str, context.getColor(com.tencent.mm.R.color.aep));
                    android.animation.ValueAnimator valueAnimator = d4Var.Q;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                    d4Var.Q = ofFloat;
                    if (ofFloat != null) {
                        ofFloat.setDuration(250L);
                    }
                    android.animation.ValueAnimator valueAnimator2 = d4Var.Q;
                    if (valueAnimator2 != null) {
                        valueAnimator2.addUpdateListener(new k84.c4(color, w17, d4Var));
                    }
                    android.animation.ValueAnimator valueAnimator3 = d4Var.Q;
                    if (valueAnimator3 != null) {
                        valueAnimator3.start();
                    }
                    com.tencent.mars.xlog.Log.i(d4Var.j(), "cheerAnimator start !");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerCheerContainerAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$triggerCheerContainerAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
            } else {
                android.widget.LinearLayout N = this.f305105d.N();
                if (N != null) {
                    N.setBackground(new android.graphics.drawable.ColorDrawable(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f478492d)));
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6$3");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6$3");
        return f0Var;
    }
}
