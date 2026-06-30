package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class qc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidFinishUI f161471d;

    public qc(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidFinishUI settingsHearingAidFinishUI) {
        this.f161471d = settingsHearingAidFinishUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidFinishUI settingsHearingAidFinishUI = this.f161471d;
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView = settingsHearingAidFinishUI.f160415e;
        if (settingsHearingAidAudioCardView == null) {
            kotlin.jvm.internal.o.o("audioCardView");
            throw null;
        }
        settingsHearingAidAudioCardView.b(true);
        if (!settingsHearingAidFinishUI.f160420m) {
            android.content.Intent intent = new android.content.Intent(settingsHearingAidFinishUI, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI.class);
            intent.putExtra("result_code", 0);
            intent.putExtra("audio_test_abandon", true);
            intent.addFlags(603979776);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidFinishUI settingsHearingAidFinishUI2 = this.f161471d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            str = "(Landroid/view/View;)V";
            yj0.a.d(settingsHearingAidFinishUI2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsHearingAidFinishUI2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(settingsHearingAidFinishUI2, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsHearingAidFinishUI.finish();
        } else {
            if (!settingsHearingAidFinishUI.f160422o) {
                androidx.appcompat.app.AppCompatActivity context = settingsHearingAidFinishUI.getContext();
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.d(com.tencent.mm.R.string.p1i);
                e4Var.c();
                yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("HearingAid_");
            long n17 = j62.e.g().n();
            if (n17 == 0) {
                str2 = "0";
            } else if (n17 > 0) {
                str2 = java.lang.Long.toString(n17, 10);
            } else {
                char[] cArr = new char[64];
                str = "(Landroid/view/View;)V";
                long j17 = (n17 >>> 1) / 5;
                long j18 = 10;
                char forDigit = java.lang.Character.forDigit((int) (n17 - (j17 * j18)), 10);
                int i18 = 63;
                cArr[63] = forDigit;
                for (long j19 = 0; j17 > j19; j19 = 0) {
                    i18--;
                    cArr[i18] = java.lang.Character.forDigit((int) (j17 % j18), 10);
                    j17 /= j18;
                }
                str2 = new java.lang.String(cArr, i18, 64 - i18);
                sb6.append(str2);
                com.tencent.mm.sdk.platformtools.o4.M(sb6.toString()).putString("hearing_aid_mode_local_old", "CLOSE");
                java.lang.String a17 = com.tencent.mm.plugin.setting.ui.setting.ce.f160909a.a();
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("enter_method_detection", 2);
                hashMap.put("care_session_id", a17);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("enter_detection_process", hashMap, 35684);
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setClass(settingsHearingAidFinishUI, com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI.class);
                intent2.putExtra("audio_test_type", 1);
                intent2.putExtra("audio_auto_play", settingsHearingAidFinishUI.f160421n);
                settingsHearingAidFinishUI.startActivityForResult(intent2);
            }
            str = "(Landroid/view/View;)V";
            sb6.append(str2);
            com.tencent.mm.sdk.platformtools.o4.M(sb6.toString()).putString("hearing_aid_mode_local_old", "CLOSE");
            java.lang.String a172 = com.tencent.mm.plugin.setting.ui.setting.ce.f160909a.a();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("enter_method_detection", 2);
            hashMap2.put("care_session_id", a172);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("enter_detection_process", hashMap2, 35684);
            android.content.Intent intent22 = new android.content.Intent();
            intent22.setClass(settingsHearingAidFinishUI, com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI.class);
            intent22.putExtra("audio_test_type", 1);
            intent22.putExtra("audio_auto_play", settingsHearingAidFinishUI.f160421n);
            settingsHearingAidFinishUI.startActivityForResult(intent22);
        }
        if (settingsHearingAidFinishUI.f160420m) {
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_result_confirm_reuse_page_cancel");
        } else {
            wd0.g1 g1Var = settingsHearingAidFinishUI.f160414d;
            if (g1Var == null) {
                kotlin.jvm.internal.o.o("finalMode");
                throw null;
            }
            if (g1Var == wd0.g1.f444714f) {
                ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_result_confirm_normal_page_cancel");
            } else {
                ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_result_confirm_mode_page_cancel");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$5", "android/view/View$OnClickListener", "onClick", str);
    }
}
