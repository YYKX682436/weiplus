package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class oh implements android.content.DialogInterface.OnCancelListener {
    public oh(com.tencent.mm.plugin.sns.ui.SnsCommentUI snsCommentUI) {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$1");
    }
}
