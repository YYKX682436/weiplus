package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class v implements com.tencent.mm.ui.widget.dialog.w1 {
    public v(com.tencent.mm.plugin.sns.ui.listener.x xVar) {
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$20$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$20$1");
    }
}
