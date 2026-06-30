package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class d9 implements com.tencent.mm.ui.widget.dialog.c1 {
    public d9(com.tencent.mm.plugin.setting.ui.setting.e9 e9Var) {
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, 1);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("care_mode_close_confirm", "view_clk", hashMap, 29254);
    }
}
