package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeIntro f173071d;

    public m3(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeIntro settingsTeenModeIntro) {
        this.f173071d = settingsTeenModeIntro;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.expand(this.f173071d.f172847e, 50, 50, 50, 50);
    }
}
