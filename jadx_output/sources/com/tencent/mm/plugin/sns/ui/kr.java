package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes11.dex */
public class kr implements android.content.DialogInterface.OnCancelListener {
    public kr(com.tencent.mm.plugin.sns.ui.SnsTagDetailUI snsTagDetailUI) {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$3");
    }
}
