package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class a3 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingDarkMode f160796a;

    public a3(com.tencent.mm.plugin.setting.ui.setting.SettingDarkMode settingDarkMode) {
        this.f160796a = settingDarkMode;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e());
            com.tencent.mm.plugin.setting.ui.setting.SettingDarkMode settingDarkMode = this.f160796a;
            M.putBoolean("dark_mode_follow_system", settingDarkMode.f160205t);
            com.tencent.mm.ui.bk.x0();
            com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putBoolean("dark_mode", settingDarkMode.f160204s);
            if (settingDarkMode.f160205t) {
                com.tencent.mm.ui.ee.e(2, settingDarkMode.getTaskId());
            } else {
                boolean z18 = settingDarkMode.f160204s;
                com.tencent.mm.ui.ee.e(z18 ? 1 : 0, settingDarkMode.getTaskId());
            }
            settingDarkMode.Y6();
            if (!settingDarkMode.f160205t) {
                com.tencent.xweb.a3.v(settingDarkMode.f160204s);
                com.tencent.mm.ui.widget.MMWebView.H0(settingDarkMode.f160204s);
            }
            ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetSnsPostDescPreloadTextViewConfig", "com.tencent.mm.feature.sns.SnsFeatureService");
            com.tencent.mm.plugin.sns.ui.widget.h3.f();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetSnsPostDescPreloadTextViewConfig", "com.tencent.mm.feature.sns.SnsFeatureService");
            l01.n nVar = (l01.n) l01.d0.f314761a.f314743e;
            synchronized (nVar.f314781a) {
                ((l01.m) nVar.f314781a).clear();
            }
            if (((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi() != null) {
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().a();
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().n0();
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Intro_Need_Clear_Top ", true);
            intent.addFlags(67108864);
            intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).vk();
            ((com.tencent.mm.app.y7) f14.g.b()).d(intent, settingDarkMode.getContext());
        }
    }
}
