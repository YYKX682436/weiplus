package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class du implements android.content.DialogInterface.OnClickListener {
    public du(com.tencent.mm.plugin.sns.ui.SnsUploadConfigView snsUploadConfigView) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$4");
    }
}
