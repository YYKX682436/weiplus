package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public final class wc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI f161701d;

    public wc(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI settingsHearingAidInitUI) {
        this.f161701d = settingsHearingAidInitUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI settingsHearingAidInitUI = this.f161701d;
        settingsHearingAidInitUI.setResult(0);
        settingsHearingAidInitUI.finish();
        return false;
    }
}
