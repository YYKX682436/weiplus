package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class we implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI f161703d;

    public we(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI settingsHearingAidTestUI) {
        this.f161703d = settingsHearingAidTestUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View findViewById;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$setClickReaction$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI settingsHearingAidTestUI = this.f161703d;
        if (!settingsHearingAidTestUI.G) {
            androidx.appcompat.app.AppCompatActivity context = settingsHearingAidTestUI.getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.d(com.tencent.mm.R.string.p1i);
            e4Var.c();
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$setClickReaction$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (hq.b.a()) {
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView = settingsHearingAidTestUI.f160461g;
            if (settingsHearingAidAudioCardView == null) {
                kotlin.jvm.internal.o.o("audioCardView1");
                throw null;
            }
            findViewById = settingsHearingAidAudioCardView.findViewById(com.tencent.mm.R.id.u0b);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            findViewById.setBackgroundResource(com.tencent.mm.R.drawable.f480874cs5);
        } else {
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView2 = settingsHearingAidTestUI.f160461g;
            if (settingsHearingAidAudioCardView2 == null) {
                kotlin.jvm.internal.o.o("audioCardView1");
                throw null;
            }
            findViewById = settingsHearingAidAudioCardView2.findViewById(com.tencent.mm.R.id.u0b);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$setClickReaction$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$setClickReaction$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (settingsHearingAidTestUI.B) {
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView3 = settingsHearingAidTestUI.f160462h;
            if (settingsHearingAidAudioCardView3 == null) {
                kotlin.jvm.internal.o.o("audioCardView2");
                throw null;
            }
            android.view.View findViewById2 = settingsHearingAidAudioCardView3.findViewById(com.tencent.mm.R.id.u0b);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$setClickReaction$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$setClickReaction$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView4 = settingsHearingAidTestUI.f160461g;
        if (settingsHearingAidAudioCardView4 == null) {
            kotlin.jvm.internal.o.o("audioCardView1");
            throw null;
        }
        if (settingsHearingAidAudioCardView4.isPlaying) {
            if (settingsHearingAidAudioCardView4 == null) {
                kotlin.jvm.internal.o.o("audioCardView1");
                throw null;
            }
            settingsHearingAidAudioCardView4.b(true);
        } else {
            if (settingsHearingAidAudioCardView4 == null) {
                kotlin.jvm.internal.o.o("audioCardView1");
                throw null;
            }
            settingsHearingAidTestUI.W6("care_audio_play", -1, settingsHearingAidAudioCardView4.getYa.b.SOURCE java.lang.String(), true);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView5 = settingsHearingAidTestUI.f160461g;
            if (settingsHearingAidAudioCardView5 == null) {
                kotlin.jvm.internal.o.o("audioCardView1");
                throw null;
            }
            settingsHearingAidAudioCardView5.a(true);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView6 = settingsHearingAidTestUI.f160461g;
            if (settingsHearingAidAudioCardView6 == null) {
                kotlin.jvm.internal.o.o("audioCardView1");
                throw null;
            }
            settingsHearingAidAudioCardView6.setHasPlayed(true);
        }
        settingsHearingAidTestUI.V6(1);
        if (settingsHearingAidTestUI.f160477z) {
            settingsHearingAidTestUI.a7(true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$setClickReaction$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
