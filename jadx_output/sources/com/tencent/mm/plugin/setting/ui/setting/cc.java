package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class cc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView f160907d;

    public cc(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView) {
        this.f160907d = settingsHearingAidAudioCardView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f160907d.setHasPlayed(true);
    }
}
