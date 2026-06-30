package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class oc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidFinishUI f161387d;

    public oc(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidFinishUI settingsHearingAidFinishUI) {
        this.f161387d = settingsHearingAidFinishUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidFinishUI settingsHearingAidFinishUI = this.f161387d;
        if (!settingsHearingAidFinishUI.f160422o) {
            androidx.appcompat.app.AppCompatActivity context = settingsHearingAidFinishUI.getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.d(com.tencent.mm.R.string.p1i);
            e4Var.c();
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView = settingsHearingAidFinishUI.f160415e;
        if (settingsHearingAidAudioCardView == null) {
            kotlin.jvm.internal.o.o("audioCardView");
            throw null;
        }
        if (settingsHearingAidAudioCardView.isPlaying) {
            settingsHearingAidAudioCardView.b(true);
        } else {
            settingsHearingAidAudioCardView.a(true);
            java.lang.String a17 = com.tencent.mm.plugin.setting.ui.setting.ce.f160909a.a();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("care_audio_play_scene", java.lang.Integer.valueOf(settingsHearingAidFinishUI.f160420m ? 1 : 4));
            hashMap.put("care_session_id", a17);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView2 = settingsHearingAidFinishUI.f160415e;
            if (settingsHearingAidAudioCardView2 == null) {
                kotlin.jvm.internal.o.o("audioCardView");
                throw null;
            }
            hashMap.put("audio_name", settingsHearingAidAudioCardView2.getYa.b.SOURCE java.lang.String());
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("care_audio_play", hashMap, 35684);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
