package k84;

/* loaded from: classes4.dex */
public final class a6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.c6 f304946d;

    public a6(k84.c6 c6Var) {
        this.f304946d = c6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startPAGPlay$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        k84.c6 c6Var = this.f304946d;
        sb6.append(c6Var.j());
        sb6.append("_pagViewPlay");
        java.lang.String sb7 = sb6.toString();
        try {
            com.tencent.mm.view.MMPAGView D = k84.c6.D(c6Var);
            if (D != null) {
                D.g();
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c(sb7, th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startPAGPlay$1");
    }
}
