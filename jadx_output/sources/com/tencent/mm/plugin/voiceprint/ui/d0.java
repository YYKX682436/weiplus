package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes.dex */
public final class d0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.VoicePrintCreateFinishUI f176241d;

    public d0(com.tencent.mm.plugin.voiceprint.ui.VoicePrintCreateFinishUI voicePrintCreateFinishUI) {
        this.f176241d = voicePrintCreateFinishUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f176241d.finish();
        return true;
    }
}
