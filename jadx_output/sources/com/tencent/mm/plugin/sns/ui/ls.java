package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ls implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ms f169875d;

    public ls(com.tencent.mm.plugin.sns.ui.ms msVar) {
        this.f169875d = msVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$TimelineGetContactCallBack$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$TimelineGetContactCallBack");
        com.tencent.mm.plugin.sns.ui.ms msVar = this.f169875d;
        com.tencent.mm.plugin.sns.ui.x4 x4Var = msVar.f169946a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$TimelineGetContactCallBack");
        com.tencent.mm.vending.base.Vending g27 = x4Var.g2();
        com.tencent.mm.plugin.sns.ui.x4 x4Var2 = msVar.f169946a;
        if (g27 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$TimelineGetContactCallBack");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$TimelineGetContactCallBack");
            com.tencent.mm.vending.base.Vending g28 = x4Var2.g2();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$TimelineGetContactCallBack");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$TimelineGetContactCallBack");
            g28.request(java.lang.Integer.valueOf(msVar.f169947b));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$TimelineGetContactCallBack");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$TimelineGetContactCallBack");
        x4Var2.notifyDataSetChanged();
        new com.tencent.mm.autogen.events.SnsOldItemContactEvent().e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$TimelineGetContactCallBack$1");
    }
}
