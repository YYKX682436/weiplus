package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class od implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f170095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.td f170096e;

    public od(com.tencent.mm.plugin.sns.ui.td tdVar, long j17) {
        this.f170096e = tdVar;
        this.f170095d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.td tdVar = this.f170096e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$1");
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
            com.tencent.mm.plugin.sns.ui.g9 g9Var = tdVar.f170510d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
            boolean g17 = g9Var.f168417g.g();
            int i17 = com.tencent.mm.plugin.sns.ui.td.a(tdVar).f166158a;
            int i18 = com.tencent.mm.plugin.sns.ui.td.a(tdVar).f166159b;
            int i19 = com.tencent.mm.plugin.sns.ui.td.a(tdVar).f166165h;
            long j17 = com.tencent.mm.plugin.sns.ui.td.a(tdVar).f166158a;
            long j18 = this.f170095d;
            if (j18 < j17 || j18 > com.tencent.mm.plugin.sns.ui.td.a(tdVar).f166159b || !g17) {
                tdVar.d();
            } else {
                tdVar.e();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("SnsAdPressGestureCtrl", "checkLongPressGesture, exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$1");
    }
}
