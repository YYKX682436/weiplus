package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes.dex */
public final class l0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI f176262d;

    public l0(com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI voicePrintStateSettingUI) {
        this.f176262d = voicePrintStateSettingUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        androidx.appcompat.app.AppCompatActivity context = this.f176262d.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
    }
}
