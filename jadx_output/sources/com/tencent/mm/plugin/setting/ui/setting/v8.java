package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class v8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro f161636d;

    public v8(com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro) {
        this.f161636d = settingsCareModeIntro;
    }

    @Override // java.lang.Runnable
    public void run() {
        new android.content.Intent().putExtra("Intro_Need_Clear_Top ", true);
        o25.t1 b17 = f14.g.b();
        androidx.appcompat.app.AppCompatActivity context = this.f161636d.getContext();
        ((com.tencent.mm.app.y7) b17).getClass();
        com.tencent.mm.process.KillProcessHelperActivity.f192149d.a(context, false);
    }
}
