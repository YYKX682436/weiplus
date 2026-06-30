package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class v4 implements uh4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain f173164a;

    public v4(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain settingsTeenModeMain) {
        this.f173164a = settingsTeenModeMain;
    }

    public void a(boolean z17) {
        com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain settingsTeenModeMain = this.f173164a;
        if (!z17) {
            settingsTeenModeMain.finish();
        } else {
            int i17 = com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain.I;
            settingsTeenModeMain.V6();
        }
    }
}
