package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class nl implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsMsgUI f170017d;

    public nl(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI) {
        this.f170017d = snsMsgUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$16");
        com.tencent.mm.plugin.sns.ui.SnsMsgUI.V6(this.f170017d, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$16");
    }
}
