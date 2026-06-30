package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f163699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper f163700e;

    public d0(com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper, java.util.List list) {
        this.f163700e = finderLivingAnimWrapper;
        this.f163699d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$2");
        try {
            com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper = this.f163700e;
            int i17 = com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper.f163653o;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
            z17 = finderLivingAnimWrapper.f163661n;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FinderLivingAnimWrapper", "prepareIconAsynAndStart, exp=" + android.util.Log.getStackTraceString(th6));
        }
        if (z17) {
            com.tencent.mars.xlog.Log.w("FinderLivingAnimWrapper", "before addBitmap, isDestroyed=true");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$2");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper2 = this.f163700e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        boolean z18 = finderLivingAnimWrapper2.f163657g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        if (!z18) {
            com.tencent.mars.xlog.Log.i("FinderLivingAnimWrapper", "prepareIconAsynAndStart, addDefaultBitmap");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f481924br3));
            arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f481925br4));
            arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f481926br5));
            arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.br6));
            arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.br7));
            arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.br8));
            try {
                com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper3 = this.f163700e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                zy2.y7 y7Var = finderLivingAnimWrapper3.f163655e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                ((com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView) y7Var).c(arrayList);
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.e("FinderLivingAnimWrapper", "addDefaultBitmap, exp=" + th7.toString());
            }
            com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper4 = this.f163700e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
            finderLivingAnimWrapper4.f163657g = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper.a(this.f163700e, this.f163699d);
        com.tencent.mars.xlog.Log.i("FinderLivingAnimWrapper", "prepareIconAsynAndStart, defIcon cost=" + (currentTimeMillis2 - currentTimeMillis) + ", configIcon cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis2));
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.sns.ad.widget.living.c0(this), 50L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$2");
    }
}
