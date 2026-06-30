package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes.dex */
public class ev implements android.content.DialogInterface.OnClickListener {
    public ev(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$22");
        dialogInterface.dismiss();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$22");
    }
}
