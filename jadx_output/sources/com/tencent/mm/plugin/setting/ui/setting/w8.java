package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class w8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro f161691d;

    public w8(com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro) {
        this.f161691d = settingsCareModeIntro;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.appcompat.app.AppCompatActivity context = this.f161691d.getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.d(com.tencent.mm.R.string.o5y);
        e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
        e4Var.c();
    }
}
