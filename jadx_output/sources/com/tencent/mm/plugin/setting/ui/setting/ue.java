package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class ue implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI f161609d;

    public ue(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI settingsHearingAidTestUI) {
        this.f161609d = settingsHearingAidTestUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$initAudioTestMode$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI settingsHearingAidTestUI = this.f161609d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(settingsHearingAidTestUI.getContext());
        u1Var.a(false);
        u1Var.g(settingsHearingAidTestUI.getString(com.tencent.mm.R.string.f492279o63));
        u1Var.n(settingsHearingAidTestUI.getString(com.tencent.mm.R.string.f492277o61));
        u1Var.j(settingsHearingAidTestUI.getString(com.tencent.mm.R.string.f492278o62));
        u1Var.b(new com.tencent.mm.plugin.setting.ui.setting.te(settingsHearingAidTestUI));
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$initAudioTestMode$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
