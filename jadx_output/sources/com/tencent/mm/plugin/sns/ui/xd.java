package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class xd implements com.tencent.mm.ui.widget.dialog.c1 {
    public xd(com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI) {
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$3");
    }
}
