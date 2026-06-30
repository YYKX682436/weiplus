package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes.dex */
public class pw implements android.content.DialogInterface.OnCancelListener {
    public pw(com.tencent.mm.plugin.sns.ui.qw qwVar, com.tencent.mm.plugin.sns.ui.cw cwVar) {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$13$2");
        c01.n8.a();
        throw null;
    }
}
