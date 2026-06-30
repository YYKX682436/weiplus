package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes11.dex */
public class jr implements android.content.DialogInterface.OnClickListener {
    public jr(com.tencent.mm.plugin.sns.ui.SnsTagDetailUI snsTagDetailUI) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$2");
    }
}
