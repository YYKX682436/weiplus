package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class pd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.qd f170212d;

    public pd(com.tencent.mm.plugin.sns.ui.qd qdVar) {
        this.f170212d = qdVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2$1");
        com.tencent.mars.xlog.Log.i("SnsAdPressGestureCtrl", "onFinish, vabriate");
        ca4.z0.I0(new long[]{0, 60});
        com.tencent.mm.plugin.sns.ui.qd qdVar = this.f170212d;
        if (com.tencent.mm.plugin.sns.ui.td.b(qdVar.f170338a) != null) {
            com.tencent.mm.plugin.sns.ui.td.b(qdVar.f170338a).setBackground(null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2$1");
    }
}
