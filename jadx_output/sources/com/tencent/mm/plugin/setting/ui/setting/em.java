package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public class em implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f161004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSnsPrivacyUI f161005e;

    public em(com.tencent.mm.plugin.setting.ui.setting.SettingsSnsPrivacyUI settingsSnsPrivacyUI, android.widget.LinearLayout linearLayout) {
        this.f161005e = settingsSnsPrivacyUI;
        this.f161004d = linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsSnsPrivacyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        for (int i17 = 0; i17 < this.f161004d.getChildCount(); i17++) {
            android.widget.TextView textView = (android.widget.TextView) this.f161004d.getChildAt(i17);
            if (com.tencent.mm.R.id.f487334ob5 != textView.getId()) {
                textView.setContentDescription(((java.lang.Object) textView.getText()) + textView.getContext().getString(com.tencent.mm.R.string.f489843db));
                textView.setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.R.raw.radio_off, 0, 0, 0);
            }
        }
        android.widget.TextView textView2 = (android.widget.TextView) view;
        textView2.setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.R.raw.radio_on, 0, 0, 0);
        textView2.setContentDescription(((java.lang.Object) textView2.getText()) + textView2.getContext().getString(com.tencent.mm.R.string.d_));
        r45.cb6 cb6Var = new r45.cb6();
        if (p94.w0.c() != null) {
            cb6Var = ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).b1(this.f161005e.f160672i);
        }
        if (cb6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsSnsPrivacyUI", "userinfo is null");
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSnsPrivacyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSnsPrivacyUI", "settings_silence_update_mode choice: %d", java.lang.Integer.valueOf(intValue));
        int i18 = 4;
        if (intValue == 0) {
            if (this.f161005e.f160681u == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14090, 4);
            }
            com.tencent.mm.plugin.setting.ui.setting.SettingsSnsPrivacyUI settingsSnsPrivacyUI = this.f161005e;
            settingsSnsPrivacyUI.f160674n = false;
            settingsSnsPrivacyUI.f160675o = true;
            settingsSnsPrivacyUI.f160677q = false;
            settingsSnsPrivacyUI.f160676p = true;
            i18 = 3;
        } else if (intValue == 1) {
            if (this.f161005e.f160681u == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14090, 5);
            }
            com.tencent.mm.plugin.setting.ui.setting.SettingsSnsPrivacyUI settingsSnsPrivacyUI2 = this.f161005e;
            settingsSnsPrivacyUI2.f160674n = true;
            settingsSnsPrivacyUI2.f160675o = false;
            settingsSnsPrivacyUI2.f160677q = false;
            settingsSnsPrivacyUI2.f160676p = true;
            i18 = 1;
        } else if (intValue == 3) {
            com.tencent.mm.plugin.setting.ui.setting.SettingsSnsPrivacyUI settingsSnsPrivacyUI3 = this.f161005e;
            settingsSnsPrivacyUI3.f160674n = false;
            settingsSnsPrivacyUI3.f160675o = false;
            settingsSnsPrivacyUI3.f160677q = true;
            settingsSnsPrivacyUI3.f160676p = true;
            i18 = 2;
        } else {
            if (this.f161005e.f160681u == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14090, 6);
            }
            com.tencent.mm.plugin.setting.ui.setting.SettingsSnsPrivacyUI settingsSnsPrivacyUI4 = this.f161005e;
            settingsSnsPrivacyUI4.f160674n = false;
            settingsSnsPrivacyUI4.f160675o = false;
            settingsSnsPrivacyUI4.f160677q = false;
            settingsSnsPrivacyUI4.f160676p = true;
        }
        if (p94.w0.c() != null) {
            p94.j0 c17 = p94.w0.c();
            com.tencent.mm.plugin.setting.ui.setting.SettingsSnsPrivacyUI settingsSnsPrivacyUI5 = this.f161005e;
            ((com.tencent.mm.plugin.sns.storage.e2) c17).K1(settingsSnsPrivacyUI5.f160672i, settingsSnsPrivacyUI5.f160674n, settingsSnsPrivacyUI5.f160675o, settingsSnsPrivacyUI5.f160676p, settingsSnsPrivacyUI5.f160677q);
            p94.o0 o0Var = (p94.o0) i95.n0.c(p94.o0.class);
            int i19 = this.f161005e.f160678r;
            ((n34.p4) o0Var).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportPrivacyRangeModified", "com.tencent.mm.plugin.sns.SnsStatService");
            java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.sns.statistics.b0.f164830k;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportPrivacyChanged", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInstanceRef", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getInstanceRef$cp", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
            java.lang.ref.WeakReference weakReference2 = com.tencent.mm.plugin.sns.statistics.b0.f164830k;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getInstanceRef$cp", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInstanceRef", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter$Companion");
            com.tencent.mm.plugin.sns.statistics.b0 b0Var = (com.tencent.mm.plugin.sns.statistics.b0) weakReference2.get();
            if (b0Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportPrivacyChanged", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
                str = "(Landroid/view/View;)V";
                str2 = "onClick";
                str3 = "android/view/View$OnClickListener";
                java.util.HashMap i27 = kz5.c1.i(new jz5.l("sns_channel", java.lang.Integer.valueOf(b0Var.f164831a)), new jz5.l("befor_time_range", java.lang.Integer.valueOf(i19)), new jz5.l("snsalbumsid", b0Var.f164832b), new jz5.l("after_time_range", java.lang.Integer.valueOf(i18)), new jz5.l("sns_page_scene", java.lang.Integer.valueOf(b0Var.f164833c)));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportEvent", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useNewReporter", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useNewReporter", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
                java.util.Objects.toString(ri.l0.a(i27));
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.sns.statistics.t("sns_modify_visibility", i27));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportEvent", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportPrivacyChanged", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
            } else {
                str = "(Landroid/view/View;)V";
                str2 = "onClick";
                str3 = "android/view/View$OnClickListener";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportPrivacyChanged", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportPrivacyRangeModified", "com.tencent.mm.plugin.sns.SnsStatService");
            this.f161005e.f160678r = i18;
        } else {
            str = "(Landroid/view/View;)V";
            str2 = "onClick";
            str3 = "android/view/View$OnClickListener";
        }
        if (p94.w0.c() != null) {
            p94.j0 c18 = p94.w0.c();
            com.tencent.mm.plugin.setting.ui.setting.SettingsSnsPrivacyUI settingsSnsPrivacyUI6 = this.f161005e;
            r45.cb6 W0 = ((com.tencent.mm.plugin.sns.storage.e2) c18).W0(settingsSnsPrivacyUI6.f160672i, settingsSnsPrivacyUI6.f160674n, settingsSnsPrivacyUI6.f160675o, settingsSnsPrivacyUI6.f160676p, settingsSnsPrivacyUI6.f160677q);
            if (W0 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SettingsSnsPrivacyUI", "userinfo in null !");
                yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSnsPrivacyUI$2", str3, str2, str);
                return;
            }
            str4 = str;
            str5 = str2;
            str6 = str3;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(51, W0));
        } else {
            str4 = str;
            str5 = str2;
            str6 = str3;
        }
        view.post(new com.tencent.mm.plugin.setting.ui.setting.dm(this));
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSnsPrivacyUI$2", str6, str5, str4);
    }
}
