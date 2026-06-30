package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class z8 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.a9 f161818a;

    public z8(com.tencent.mm.plugin.setting.ui.setting.a9 a9Var) {
        this.f161818a = a9Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            l14.a.a("care_mode_btn", false);
            if (j65.e.e()) {
                l14.a.a("large_font_btn", false);
            }
            if (j65.e.f()) {
                l14.a.a("listen_text_msg_btn", false);
            }
            if (j65.e.g()) {
                l14.a.a("silent_mode_btn", false);
            }
            com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro.T6(this.f161818a.f160807d.f160988d);
        }
    }
}
