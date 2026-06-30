package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class gf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI f161076d;

    public gf(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI settingsHearingAidTestUI) {
        this.f161076d = settingsHearingAidTestUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$setPositiveBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI settingsHearingAidTestUI = this.f161076d;
        if (!settingsHearingAidTestUI.G) {
            androidx.appcompat.app.AppCompatActivity context = settingsHearingAidTestUI.getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.d(com.tencent.mm.R.string.p1i);
            e4Var.c();
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$setPositiveBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (settingsHearingAidTestUI.f160476y) {
            settingsHearingAidTestUI.W6("hearing_level_test_result", 11, com.tencent.mm.plugin.setting.ui.setting.xd.f161738h.h(), false);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager = settingsHearingAidTestUI.f160460f;
            if (settingsHearingAidAudioCardViewManager == null) {
                kotlin.jvm.internal.o.o("audioCardManager");
                throw null;
            }
            settingsHearingAidAudioCardViewManager.setAutoPlay(settingsHearingAidTestUI.getIntent().getBooleanExtra("audio_auto_play", false));
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView = settingsHearingAidTestUI.f160462h;
            if (settingsHearingAidAudioCardView == null) {
                kotlin.jvm.internal.o.o("audioCardView2");
                throw null;
            }
            settingsHearingAidAudioCardView.setSource(com.tencent.mm.plugin.setting.ui.setting.xd.f161736f.h());
            com.tencent.mm.ui.widget.button.WeButton weButton = settingsHearingAidTestUI.f160466o;
            if (weButton == null) {
                kotlin.jvm.internal.o.o("positiveBtn");
                throw null;
            }
            weButton.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.ef(settingsHearingAidTestUI, settingsHearingAidAudioCardView));
            com.tencent.mm.ui.widget.button.WeButton weButton2 = settingsHearingAidTestUI.f160465n;
            if (weButton2 == null) {
                kotlin.jvm.internal.o.o("negativeBtn");
                throw null;
            }
            weButton2.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.ff(settingsHearingAidTestUI, settingsHearingAidAudioCardView));
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView2 = settingsHearingAidTestUI.f160462h;
            if (settingsHearingAidAudioCardView2 == null) {
                kotlin.jvm.internal.o.o("audioCardView2");
                throw null;
            }
            settingsHearingAidAudioCardView2.setHasPlayed(false);
            settingsHearingAidTestUI.X6(false);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager2 = settingsHearingAidTestUI.f160460f;
            if (settingsHearingAidAudioCardViewManager2 == null) {
                kotlin.jvm.internal.o.o("audioCardManager");
                throw null;
            }
            settingsHearingAidAudioCardViewManager2.d(true);
            settingsHearingAidTestUI.a7(false);
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
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$setPositiveBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
