package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class pl implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsMsgUI f170247d;

    public pl(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI) {
        this.f170247d = snsMsgUI;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$17");
        com.tencent.mm.plugin.sns.model.l4.Tj().post(new com.tencent.mm.plugin.sns.ui.ol(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$17");
    }
}
