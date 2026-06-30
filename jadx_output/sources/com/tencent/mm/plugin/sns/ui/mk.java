package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes15.dex */
public class mk implements android.content.DialogInterface.OnClickListener {
    public mk(com.tencent.mm.plugin.sns.ui.SnsLabelUI snsLabelUI) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$12");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$12");
    }
}
