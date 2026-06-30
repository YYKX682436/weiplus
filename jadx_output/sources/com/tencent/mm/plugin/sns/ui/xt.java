package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class xt implements android.content.DialogInterface.OnClickListener {
    public xt(com.tencent.mm.plugin.sns.ui.yt ytVar) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI$2$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI$2$2");
    }
}
