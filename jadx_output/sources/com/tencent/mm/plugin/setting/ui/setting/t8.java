package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class t8 implements com.tencent.mm.ui.widget.dialog.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro f161567a;

    public t8(com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro) {
        this.f161567a = settingsCareModeIntro;
    }

    @Override // com.tencent.mm.ui.widget.dialog.b1
    public void a() {
        this.f161567a.f160353o.setCheck(true);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, 1);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("care_mode_quite_mode_close_confirm", "view_clk", hashMap, 29254);
    }
}
