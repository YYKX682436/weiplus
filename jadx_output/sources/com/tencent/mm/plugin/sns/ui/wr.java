package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes11.dex */
public class wr implements android.content.DialogInterface.OnCancelListener {
    public wr(com.tencent.mm.plugin.sns.ui.xr xrVar) {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$5$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$5$1");
    }
}
