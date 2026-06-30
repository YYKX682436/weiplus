package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes15.dex */
public class u implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.VoiceLoginUI f176278d;

    public u(com.tencent.mm.plugin.voiceprint.ui.VoiceLoginUI voiceLoginUI) {
        this.f176278d = voiceLoginUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.voiceprint.ui.VoiceLoginUI.f176198z;
        com.tencent.mm.plugin.voiceprint.ui.VoiceLoginUI voiceLoginUI = this.f176278d;
        voiceLoginUI.setResult(0);
        voiceLoginUI.finish();
        return true;
    }
}
