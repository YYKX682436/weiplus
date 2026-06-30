package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes.dex */
public final class k0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI f176261d;

    public k0(com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI voicePrintStateSettingUI) {
        this.f176261d = voicePrintStateSettingUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f176261d.finish();
        return true;
    }
}
