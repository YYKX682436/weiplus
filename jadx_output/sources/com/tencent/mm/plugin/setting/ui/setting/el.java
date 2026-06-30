package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public class el implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f161002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI f161003e;

    public el(com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI settingsPrivacyUI, android.widget.LinearLayout linearLayout) {
        this.f161003e = settingsPrivacyUI;
        this.f161002d = linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = 0;
        while (true) {
            android.widget.LinearLayout linearLayout = this.f161002d;
            if (i17 >= linearLayout.getChildCount()) {
                break;
            }
            android.widget.TextView textView = (android.widget.TextView) linearLayout.getChildAt(i17);
            if (com.tencent.mm.R.id.f487334ob5 != textView.getId()) {
                textView.setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.R.raw.radio_off, 0, 0, 0);
            }
            i17++;
        }
        ((android.widget.TextView) view).setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.R.raw.radio_on, 0, 0, 0);
        r45.cb6 cb6Var = new r45.cb6();
        p94.j0 c17 = p94.w0.c();
        com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI settingsPrivacyUI = this.f161003e;
        if (c17 != null) {
            cb6Var = ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).b1(settingsPrivacyUI.f160616o);
        }
        if (cb6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingPrivacy", "userinfo is null");
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingPrivacy", "settings_silence_update_mode choice: %d", java.lang.Integer.valueOf(intValue));
        if (intValue == 0) {
            if (settingsPrivacyUI.f160625x == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14090, 4);
            }
            settingsPrivacyUI.f160618q = false;
            settingsPrivacyUI.f160619r = true;
            settingsPrivacyUI.f160621t = false;
            settingsPrivacyUI.f160620s = true;
        } else if (intValue == 1) {
            if (settingsPrivacyUI.f160625x == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14090, 5);
            }
            settingsPrivacyUI.f160618q = true;
            settingsPrivacyUI.f160619r = false;
            settingsPrivacyUI.f160621t = false;
            settingsPrivacyUI.f160620s = true;
        } else if (intValue == 3) {
            settingsPrivacyUI.f160618q = false;
            settingsPrivacyUI.f160619r = false;
            settingsPrivacyUI.f160621t = true;
            settingsPrivacyUI.f160620s = true;
        } else {
            if (settingsPrivacyUI.f160625x == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14090, 6);
            }
            settingsPrivacyUI.f160618q = false;
            settingsPrivacyUI.f160619r = false;
            settingsPrivacyUI.f160621t = false;
            settingsPrivacyUI.f160620s = true;
        }
        if (p94.w0.c() != null) {
            ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).K1(settingsPrivacyUI.f160616o, settingsPrivacyUI.f160618q, settingsPrivacyUI.f160619r, settingsPrivacyUI.f160620s, settingsPrivacyUI.f160621t);
        }
        if (p94.w0.c() != null) {
            r45.cb6 W0 = ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).W0(settingsPrivacyUI.f160616o, settingsPrivacyUI.f160618q, settingsPrivacyUI.f160619r, settingsPrivacyUI.f160620s, settingsPrivacyUI.f160621t);
            if (W0 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SettingPrivacy", "userinfo in null !");
                yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(51, W0));
            }
        }
        view.post(new com.tencent.mm.plugin.setting.ui.setting.dl(this));
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
