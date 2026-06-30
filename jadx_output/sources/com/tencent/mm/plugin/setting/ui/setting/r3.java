package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class r3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintVerifyUI f161493d;

    public r3(com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintVerifyUI settingFingerprintVerifyUI) {
        this.f161493d = settingFingerprintVerifyUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintVerifyUI settingFingerprintVerifyUI = this.f161493d;
        settingFingerprintVerifyUI.f160216e.f444697a.a(true);
        ((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).getClass();
        ju5.n.c().b();
        settingFingerprintVerifyUI.f160215d = true;
        settingFingerprintVerifyUI.setResult(0);
        settingFingerprintVerifyUI.finish();
        return false;
    }
}
