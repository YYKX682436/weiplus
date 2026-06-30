package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class pe implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI f161436d;

    public pe(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI settingsHearingAidTestUI) {
        this.f161436d = settingsHearingAidTestUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$initAudioTestDisable$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI settingsHearingAidTestUI = this.f161436d;
        if (!settingsHearingAidTestUI.G) {
            androidx.appcompat.app.AppCompatActivity context = settingsHearingAidTestUI.getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.d(com.tencent.mm.R.string.p1i);
            e4Var.c();
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$initAudioTestDisable$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView = settingsHearingAidTestUI.f160461g;
        if (settingsHearingAidAudioCardView == null) {
            kotlin.jvm.internal.o.o("audioCardView1");
            throw null;
        }
        if (settingsHearingAidAudioCardView.isPlaying) {
            if (settingsHearingAidAudioCardView == null) {
                kotlin.jvm.internal.o.o("audioCardView1");
                throw null;
            }
            settingsHearingAidAudioCardView.b(true);
        } else {
            if (settingsHearingAidAudioCardView == null) {
                kotlin.jvm.internal.o.o("audioCardView1");
                throw null;
            }
            settingsHearingAidAudioCardView.a(true);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView2 = settingsHearingAidTestUI.f160461g;
            if (settingsHearingAidAudioCardView2 == null) {
                kotlin.jvm.internal.o.o("audioCardView1");
                throw null;
            }
            settingsHearingAidTestUI.W6("care_audio_play", -1, settingsHearingAidAudioCardView2.getYa.b.SOURCE java.lang.String(), true);
        }
        settingsHearingAidTestUI.a7(true);
        settingsHearingAidTestUI.V6(1);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$initAudioTestDisable$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
