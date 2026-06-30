package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class u8 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro f161601d;

    public u8(com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro) {
        this.f161601d = settingsCareModeIntro;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        this.f161601d.f160353o.setCheck(true);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, 1);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("care_mode_quite_mode_close_confirm", "view_clk", hashMap, 29254);
    }
}
