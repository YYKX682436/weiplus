package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class cf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI f160912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView f160913e;

    public cf(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI settingsHearingAidTestUI, com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView) {
        this.f160912d = settingsHearingAidTestUI;
        this.f160913e = settingsHearingAidAudioCardView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$setNegativeBtn$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI settingsHearingAidTestUI = this.f160912d;
        boolean z17 = settingsHearingAidTestUI.G;
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView = this.f160913e;
        if (!z17) {
            android.content.Context context = settingsHearingAidAudioCardView.getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.d(com.tencent.mm.R.string.p1i);
            e4Var.c();
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$setNegativeBtn$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (settingsHearingAidTestUI.f160476y) {
            settingsHearingAidTestUI.W6("hearing_level_test_result", 12, settingsHearingAidAudioCardView.getYa.b.SOURCE java.lang.String(), false);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager = settingsHearingAidTestUI.f160460f;
            if (settingsHearingAidAudioCardViewManager == null) {
                kotlin.jvm.internal.o.o("audioCardManager");
                throw null;
            }
            settingsHearingAidAudioCardViewManager.c();
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(settingsHearingAidTestUI, com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI.class);
            intent.putExtra("audio_auto_play", settingsHearingAidTestUI.getIntent().getBooleanExtra("audio_auto_play", false));
            intent.putExtra("audio_snr", 3);
            intent.putExtra("audio_test_type", 3);
            settingsHearingAidTestUI.startActivityForResult(intent, settingsHearingAidTestUI.I);
        } else {
            android.widget.TextView textView = settingsHearingAidTestUI.f160459e;
            if (textView == null) {
                kotlin.jvm.internal.o.o("tipsInfo");
                throw null;
            }
            textView.removeCallbacks(settingsHearingAidTestUI.f160475x);
            android.widget.TextView textView2 = settingsHearingAidTestUI.f160459e;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("tipsInfo");
                throw null;
            }
            textView2.setText(settingsHearingAidTestUI.getString(com.tencent.mm.R.string.o5c));
            android.widget.TextView textView3 = settingsHearingAidTestUI.f160459e;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("tipsInfo");
                throw null;
            }
            textView3.setVisibility(0);
            android.widget.TextView textView4 = settingsHearingAidTestUI.f160459e;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("tipsInfo");
                throw null;
            }
            textView4.postDelayed(settingsHearingAidTestUI.f160475x, 3000L);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$setNegativeBtn$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
