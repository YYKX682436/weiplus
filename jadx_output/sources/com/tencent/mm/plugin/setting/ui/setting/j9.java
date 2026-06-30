package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class j9 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f161188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.k9 f161189b;

    public j9(com.tencent.mm.plugin.setting.ui.setting.k9 k9Var, boolean z17) {
        this.f161189b = k9Var;
        this.f161188a = z17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        float f17;
        int i17;
        if (z17) {
            l14.a.a("large_font_btn", this.f161188a);
            j65.e.k(this.f161188a);
            com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro = this.f161189b.f161232a;
            int i18 = com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro.D;
            settingsCareModeIntro.getClass();
            boolean e17 = j65.e.e();
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsCareModeIntro", "updateLargeFontStatus, lastExtStatus2:" + settingsCareModeIntro.f160350i + " isLargeFont:" + e17);
            if (e17) {
                settingsCareModeIntro.f160350i &= -33554433;
            } else {
                settingsCareModeIntro.f160350i |= 33554432;
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(settingsCareModeIntro.f160350i));
            bn0.g.f22779a.g("USERINFO_EXT_STATUS2_LONG_SYNC", settingsCareModeIntro.f160350i);
            int i19 = e17 ? 1 : 2;
            r45.p53 p53Var = new r45.p53();
            p53Var.f382761d = 90;
            p53Var.f382762e = i19;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsCareModeIntro", "switch ext change : big font open = " + e17 + " item value = " + p53Var.f382762e + " functionId = " + p53Var.f382761d);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, java.lang.Integer.valueOf(e17 ? 1 : 0));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("care_mode_big_font_switch", "view_clk", hashMap, 29254);
            if (!j65.e.f() && !j65.e.g() && !j65.e.c() && !this.f161188a) {
                com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro.T6(this.f161189b.f161232a);
                return;
            }
            com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro2 = this.f161189b.f161232a;
            boolean z18 = !this.f161188a;
            int b17 = f14.e.b(settingsCareModeIntro2.getContext());
            float n17 = i65.a.n(settingsCareModeIntro2.getContext());
            if (j65.e.e()) {
                f17 = 1.4f;
                i17 = 5;
            } else {
                i17 = b17;
                f17 = n17;
            }
            if (z18) {
                b17 = j65.c.e(settingsCareModeIntro2.getContext());
                n17 = j65.c.c(settingsCareModeIntro2.getContext());
                j65.e.j(0);
            } else if (b17 < i17) {
                j65.e.j(5);
                n17 = f17;
                b17 = i17;
            } else {
                j65.e.j(0);
            }
            f14.e.d(settingsCareModeIntro2.getContext(), n17, b17);
            j65.f.k(f14.e.c(b17));
            gm0.j1.u().c().i(true);
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.setting.ui.setting.v8 v8Var = new com.tencent.mm.plugin.setting.ui.setting.v8(settingsCareModeIntro2);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(v8Var, 200L, false);
        }
    }
}
