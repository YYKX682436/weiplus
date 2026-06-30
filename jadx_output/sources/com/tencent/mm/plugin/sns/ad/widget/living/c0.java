package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.living.d0 f163697d;

    public c0(com.tencent.mm.plugin.sns.ad.widget.living.d0 d0Var) {
        this.f163697d = d0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$2$1");
        com.tencent.mm.plugin.sns.ad.widget.living.d0 d0Var = this.f163697d;
        com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper = d0Var.f163700e;
        int i17 = com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper.f163653o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        boolean z17 = finderLivingAnimWrapper.f163661n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        if (z17) {
            com.tencent.mars.xlog.Log.i("FinderLivingAnimWrapper", "before startAnim, isDestroyed=true");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$2$1");
            return;
        }
        int width = d0Var.f163700e.getWidth();
        int height = d0Var.f163700e.getHeight();
        com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper2 = d0Var.f163700e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        boolean z18 = finderLivingAnimWrapper2.f163657g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        if (!z18 || width <= 0 || height <= 0) {
            com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper3 = d0Var.f163700e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
            boolean z19 = finderLivingAnimWrapper3.f163657g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        } else {
            try {
                com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper4 = d0Var.f163700e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                zy2.y7 y7Var = finderLivingAnimWrapper4.f163655e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper5 = d0Var.f163700e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                int i18 = finderLivingAnimWrapper5.f163659i;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper6 = d0Var.f163700e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                int i19 = finderLivingAnimWrapper6.f163660m;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView finderLiveConfettiView = (com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView) y7Var;
                finderLiveConfettiView.f117596p = width - i18;
                finderLiveConfettiView.f117597q = height - i19;
                com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper7 = d0Var.f163700e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                zy2.y7 y7Var2 = finderLivingAnimWrapper7.f163655e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                ((com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView) y7Var2).d();
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("FinderLivingAnimWrapper", "start exp=" + th6.toString());
            }
            com.tencent.mars.xlog.Log.i("FinderLivingAnimWrapper", "prepareIconAsynAndStart, startAnim, w=" + width + ", h=" + height);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$2$1");
    }
}
