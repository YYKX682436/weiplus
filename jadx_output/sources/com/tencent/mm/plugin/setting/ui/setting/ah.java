package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class ah implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f160836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI f160837e;

    public ah(com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI settingsModifyAliasUI, int i17) {
        this.f160837e = settingsModifyAliasUI;
        this.f160836d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI settingsModifyAliasUI = this.f160837e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(settingsModifyAliasUI.f160520e.getHeight());
        int i17 = this.f160836d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsModifyAliasUI", "inputContainer.height: %d, screenHeight: %d", valueOf, java.lang.Integer.valueOf(i17));
        if (settingsModifyAliasUI.f160520e.getHeight() > i17) {
            settingsModifyAliasUI.f160526n.scrollBy(0, settingsModifyAliasUI.f160520e.getHeight() - i17);
        }
    }
}
