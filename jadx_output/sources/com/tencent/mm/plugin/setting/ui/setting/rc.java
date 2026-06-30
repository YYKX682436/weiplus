package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public final class rc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidFinishUI f161503d;

    public rc(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidFinishUI settingsHearingAidFinishUI) {
        this.f161503d = settingsHearingAidFinishUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidFinishUI settingsHearingAidFinishUI = this.f161503d;
        db5.t7.i(settingsHearingAidFinishUI.getContext(), settingsHearingAidFinishUI.getContext().getString(com.tencent.mm.R.string.kds), com.tencent.mm.R.raw.icons_filled_volume_off);
    }
}
