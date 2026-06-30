package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public final class bd implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI f160867d;

    public bd(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI settingsHearingAidInitUI) {
        this.f160867d = settingsHearingAidInitUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        androidx.appcompat.app.AppCompatActivity context = this.f160867d.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
    }
}
