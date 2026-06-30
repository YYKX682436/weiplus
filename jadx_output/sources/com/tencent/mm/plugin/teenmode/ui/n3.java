package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class n3 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeIntro f173080a;

    public n3(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeIntro settingsTeenModeIntro) {
        this.f173080a = settingsTeenModeIntro;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeIntro settingsTeenModeIntro = this.f173080a;
        if (z17) {
            settingsTeenModeIntro.f172846d.setEnabled(true);
        } else {
            settingsTeenModeIntro.f172846d.setEnabled(false);
        }
    }
}
