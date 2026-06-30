package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class zb implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f161821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI f161822b;

    public zb(com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI settingsFontUI, float f17) {
        this.f161822b = settingsFontUI;
        this.f161821a = f17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            j65.e.j(0);
            com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI settingsFontUI = this.f161822b;
            if (!i65.a.l(settingsFontUI.getContext())) {
                settingsFontUI.f160390i = settingsFontUI.f160389h;
            }
            if (settingsFontUI.f160389h != this.f161821a) {
                settingsFontUI.f160385d = 1;
            } else {
                settingsFontUI.f160385d = 0;
            }
            f14.e.d(settingsFontUI.getContext(), settingsFontUI.f160389h, settingsFontUI.f160391m);
            settingsFontUI.f160386e = i65.a.o(settingsFontUI.getContext());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11609, java.lang.Integer.valueOf(settingsFontUI.f160385d), java.lang.Integer.valueOf(settingsFontUI.f160386e), 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsFontUI", "choose font size kvReport logID:%d , changeFontSize: %d, curFontSize:%d", 11609, java.lang.Integer.valueOf(settingsFontUI.f160385d), java.lang.Integer.valueOf(settingsFontUI.f160386e));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).vk();
            androidx.appcompat.app.AppCompatActivity context = settingsFontUI.getContext();
            com.tencent.mars.xlog.Log.i("MicroMsg.FontSizeService", "fontSizeAfter=" + f14.e.a(context));
            int b17 = f14.e.b(context);
            int g17 = j65.f.g();
            int c17 = f14.e.c(b17);
            if (c17 != g17) {
                j65.f.k(c17);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Intro_Need_Clear_Top ", true);
                ((com.tencent.mm.app.y7) f14.g.b()).d(intent, context);
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Intro_Need_Clear_Top ", true);
            ((com.tencent.mm.app.y7) f14.g.b()).u(intent2, context);
            com.tencent.mm.autogen.events.FontSizeChangedEvent fontSizeChangedEvent = new com.tencent.mm.autogen.events.FontSizeChangedEvent();
            fontSizeChangedEvent.f54347g.getClass();
            fontSizeChangedEvent.e();
            ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).getClass();
            com.tencent.mm.xwebutil.s0.b("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
        }
    }
}
