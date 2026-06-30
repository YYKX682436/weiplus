package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class n0 implements android.content.DialogInterface.OnCancelListener {
    public n0(com.tencent.mm.plugin.sns.ui.ArtistUI artistUI) {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.ArtistUI$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.ArtistUI$3");
    }
}
