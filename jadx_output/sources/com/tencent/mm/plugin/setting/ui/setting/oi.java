package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class oi implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsModifyPatSuffixUI f161395d;

    public oi(com.tencent.mm.plugin.setting.ui.setting.SettingsModifyPatSuffixUI settingsModifyPatSuffixUI) {
        this.f161395d = settingsModifyPatSuffixUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.setting.ui.setting.SettingsModifyPatSuffixUI settingsModifyPatSuffixUI = this.f161395d;
        settingsModifyPatSuffixUI.f160553h.setText(settingsModifyPatSuffixUI.getString(com.tencent.mm.R.string.ike));
        settingsModifyPatSuffixUI.f160553h.setTextColor(settingsModifyPatSuffixUI.getResources().getColor(com.tencent.mm.R.color.f478873jj));
        return false;
    }
}
