package com.tencent.mm.plugin.sns.ad.widget.adpag;

/* loaded from: classes4.dex */
public final class c0 {

    /* renamed from: a */
    public static final com.tencent.mm.plugin.sns.ad.widget.adpag.c0 f163333a = new com.tencent.mm.plugin.sns.ad.widget.adpag.c0();

    public static /* synthetic */ com.tencent.mm.view.MMPAGView b(com.tencent.mm.plugin.sns.ad.widget.adpag.c0 c0Var, android.content.Context context, android.view.ViewGroup viewGroup, java.lang.String str, java.lang.String str2, ym5.w1 w1Var, int i17, int i18, int i19, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPAGStartPlay$default", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
        com.tencent.mm.view.MMPAGView a17 = c0Var.a(context, viewGroup, str, str2, (i19 & 16) != 0 ? null : w1Var, (i19 & 32) != 0 ? 1 : i17, (i19 & 64) != 0 ? 3 : i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPAGStartPlay$default", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
        return a17;
    }

    public final com.tencent.mm.view.MMPAGView a(android.content.Context context, android.view.ViewGroup viewGroup, java.lang.String str, java.lang.String str2, ym5.w1 w1Var, int i17, int i18) {
        org.libpag.PAGFile c17;
        com.tencent.mm.rfx.RfxPagFile rfxPagFile;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPAGStartPlay", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPAGStartPlay", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
            return null;
        }
        if (viewGroup == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPAGStartPlay", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
            return null;
        }
        boolean z17 = context instanceof android.app.Activity;
        android.app.Activity activity = z17 ? (android.app.Activity) context : null;
        if (!(activity != null && activity.isFinishing())) {
            android.app.Activity activity2 = z17 ? (android.app.Activity) context : null;
            if (!(activity2 != null && activity2.isDestroyed())) {
                try {
                    boolean z18 = j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxSnsSwitch()) == 1;
                    if (z18) {
                        com.tencent.mm.rfx.RfxPagFile d17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.d("AdPAGHelper", str, str2);
                        if (d17 == null) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2029, 37);
                            com.tencent.mars.xlog.Log.e("AdPAGHelper", "doPAGStartPlay, useRfx is true, pagFile is null");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPAGStartPlay", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
                            return null;
                        }
                        rfxPagFile = d17;
                        c17 = null;
                    } else {
                        c17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.c("AdPAGHelper", str, str2);
                        if (c17 == null) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2029, 37);
                            com.tencent.mars.xlog.Log.e("AdPAGHelper", "doPAGStartPlay, useRfx is false, pagFile is null");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPAGStartPlay", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
                            return null;
                        }
                        rfxPagFile = null;
                    }
                    com.tencent.mm.view.MMPAGView mMPAGView = new com.tencent.mm.view.MMPAGView(context);
                    mMPAGView.o(z18);
                    mMPAGView.setRepeatCount(i17);
                    mMPAGView.setScaleMode(i18);
                    if (z18) {
                        mMPAGView.setComposition(rfxPagFile);
                    } else {
                        mMPAGView.setComposition(c17);
                    }
                    mMPAGView.a(w1Var);
                    int childCount = viewGroup.getChildCount();
                    a84.y0.o(mMPAGView, -1, -1);
                    a84.y0.b(viewGroup, mMPAGView, childCount);
                    mMPAGView.post(new com.tencent.mm.plugin.sns.ad.widget.adpag.z(mMPAGView));
                    com.tencent.mars.xlog.Log.i("AdPAGHelper", "doPAGStartPlay success");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPAGStartPlay", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
                    return mMPAGView;
                } catch (java.lang.Throwable th6) {
                    ca4.q.c("AdPAGHelper", th6);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPAGStartPlay", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
                    return null;
                }
            }
        }
        com.tencent.mars.xlog.Log.w("AdPAGHelper", "doPAGStartPlay, activity is finishing or destroyed");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPAGStartPlay", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
        return null;
    }
}
