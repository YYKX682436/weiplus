package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes8.dex */
public final class n0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI f176266d;

    public n0(com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI voicePrintStateSettingUI) {
        this.f176266d = voicePrintStateSettingUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.a(1, com.tencent.mm.R.string.f493101j10);
        g4Var.x(2, com.tencent.mm.R.string.j0w, this.f176266d.getResources().getColor(com.tencent.mm.R.color.a2y));
    }
}
