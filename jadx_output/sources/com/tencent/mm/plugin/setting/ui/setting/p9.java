package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class p9 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f161430a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro f161431b;

    public p9(com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f161431b = settingsCareModeIntro;
        this.f161430a = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        this.f161430a.B();
        com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro.U6(this.f161431b);
    }
}
