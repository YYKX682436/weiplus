package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class yc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI f161783d;

    public yc(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI settingsHearingAidInitUI) {
        this.f161783d = settingsHearingAidInitUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI.f160424r;
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI settingsHearingAidInitUI = this.f161783d;
        settingsHearingAidInitUI.getClass();
        f25.m0 m0Var = settingsHearingAidInitUI.f160433o;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        settingsHearingAidInitUI.f160433o = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.s.f259111c, settingsHearingAidInitUI.f160434p);
        f25.m0 m0Var2 = settingsHearingAidInitUI.f160433o;
        boolean z17 = false;
        if (m0Var2 != null && ((g25.e) m0Var2).f267980c) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidInitUI", "requestAudioFocus: gain focus");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidInitUI", "requestAudioFocus: not gain focus");
            if (!j65.e.g()) {
                yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidInitUI", "requestAudioFocus: not gain focus but because of muteMode");
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((sb0.f) jVar).getClass();
        if (j35.u.d(context, "android.permission.RECORD_AUDIO", true)) {
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI.T6(settingsHearingAidInitUI);
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Zi(80, new com.tencent.mm.plugin.setting.ui.setting.xc(settingsHearingAidInitUI), "android.permission.RECORD_AUDIO");
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
