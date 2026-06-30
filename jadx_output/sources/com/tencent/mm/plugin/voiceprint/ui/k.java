package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes.dex */
public class k implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.SettingsVoicePrintUI f176260d;

    public k(com.tencent.mm.plugin.voiceprint.ui.SettingsVoicePrintUI settingsVoicePrintUI) {
        this.f176260d = settingsVoicePrintUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f176260d.finish();
        return true;
    }
}
