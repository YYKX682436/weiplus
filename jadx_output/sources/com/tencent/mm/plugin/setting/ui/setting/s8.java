package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class s8 implements db5.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro f161533a;

    public s8(com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro) {
        this.f161533a = settingsCareModeIntro;
    }

    @Override // db5.p4
    public void a(db5.h4 h4Var, android.view.View view) {
        if (h4Var.f228366g == this.f161533a.C) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view, "care_mode_quite_mode_close_confirm");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view, 8, 29254);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(view, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, 0);
        }
    }
}
