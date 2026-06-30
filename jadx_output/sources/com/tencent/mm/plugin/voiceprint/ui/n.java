package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes.dex */
public class n implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.SettingsVoicePrintUI f176265d;

    public n(com.tencent.mm.plugin.voiceprint.ui.SettingsVoicePrintUI settingsVoicePrintUI) {
        this.f176265d = settingsVoicePrintUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        androidx.appcompat.app.AppCompatActivity context = this.f176265d.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
    }
}
