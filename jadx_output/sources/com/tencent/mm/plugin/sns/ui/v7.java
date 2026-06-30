package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class v7 implements android.content.DialogInterface.OnCancelListener {
    public v7(com.tencent.mm.plugin.sns.ui.w7 w7Var, com.tencent.mm.plugin.sns.ui.p7 p7Var) {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.PicWidget$CommitTask$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.PicWidget$CommitTask$1");
    }
}
