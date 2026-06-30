package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class xl implements db5.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsMsgUI f171571a;

    public xl(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI) {
        this.f171571a = snsMsgUI;
    }

    @Override // db5.e6
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemDel", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$7");
        if (obj == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsMsgUI", "onItemDel object null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemDel", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$7");
            return;
        }
        try {
            com.tencent.mm.plugin.sns.ui.SnsMsgUI.c7(this.f171571a, com.tencent.mm.sdk.platformtools.t8.D1(obj.toString(), 0));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemDel", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$7");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsMsgUI", "onItemDel object not int");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsMsgUI", e17, "", new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemDel", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$7");
        }
    }
}
