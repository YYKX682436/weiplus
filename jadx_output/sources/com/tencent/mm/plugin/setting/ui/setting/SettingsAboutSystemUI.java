package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class SettingsAboutSystemUI extends com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f160275o = 0;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f160276g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f160277h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f160278i;

    /* renamed from: m, reason: collision with root package name */
    public int f160279m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f160280n;

    public SettingsAboutSystemUI() {
        new com.tencent.wcdb.support.CancellationSignal();
        this.f160278i = -1;
        this.f160279m = -1;
        this.f160280n = false;
    }

    public static boolean Y6() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.mmvoip_multipath_switch, false);
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference
    public int V6() {
        return 2;
    }

    public final void X6(android.widget.LinearLayout linearLayout, int i17, int i18, boolean z17, android.view.View.OnClickListener onClickListener) {
        android.widget.TextView textView = (android.widget.TextView) android.view.View.inflate(getContext(), com.tencent.mm.R.layout.cbx, null);
        textView.setText(i17);
        textView.setTag(java.lang.Integer.valueOf(i18));
        linearLayout.addView(textView);
        textView.setOnClickListener(onClickListener);
        if (z17) {
            textView.setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.R.raw.radio_on, 0, 0, 0);
        }
    }

    public final void Z6(boolean z17) {
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160276g).h("settings_nfc_switch");
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).edit().putBoolean("settings_nfc_switch", z17).commit();
        checkBoxPreference.O(z17);
        ((com.tencent.mm.ui.base.preference.h0) this.f160276g).notifyDataSetChanged();
    }

    public final void a7(boolean z17) {
        if (z17) {
            getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 1, 1);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_NFC_OPEN_SWITCH_INT_SYNC, 1);
        } else {
            getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 2, 1);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_NFC_OPEN_SWITCH_INT_SYNC, 2);
        }
    }

    public final boolean b7() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetTextSize", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetTextSize", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }

    public final void c7() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.D1(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SilentDownloadApkAtWiFi"), 0) != 0;
        if ((com.tencent.mm.sdk.platformtools.a0.f192438a & 1) != 0) {
            z17 = true;
        }
        if (z17) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160276g).m("settings_silence_update_mode", true);
            return;
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f160276g).m("settings_silence_update_mode", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f160276g).h("settings_silence_update_mode").H(getString((((java.lang.Integer) gm0.j1.u().c().l(7, 0)).intValue() & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) == 0 ? com.tencent.mm.R.string.iya : com.tencent.mm.R.string.iy_));
        ((com.tencent.mm.ui.base.preference.h0) this.f160276g).notifyDataSetChanged();
    }

    public final void d7() {
        int P = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SIGHTAutoLoadNetwork"), 1);
        int j17 = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(327686, null), P);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAboutSystemUI", "auto getSightViewSummary %d, %d", java.lang.Integer.valueOf(P), java.lang.Integer.valueOf(j17));
        if (this.f160278i == -1) {
            this.f160278i = j17;
        }
        this.f160279m = j17;
        int i17 = 3 == j17 ? com.tencent.mm.R.string.iyn : 2 == j17 ? com.tencent.mm.R.string.iyp : com.tencent.mm.R.string.iym;
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) this.f160276g).h("settings_sns_sight_auto_download");
        if (h17 != null && i17 != 0) {
            h17.H(getString(i17));
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f160276g).notifyDataSetChanged();
    }

    public final void e7() {
        com.tencent.mm.plugin.newtips.NormalIconNewTipPreference normalIconNewTipPreference = (com.tencent.mm.plugin.newtips.NormalIconNewTipPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160276g).h("settings_plugins");
        rn3.i.Di().k(normalIconNewTipPreference);
        normalIconNewTipPreference.n0(this.f160276g);
        normalIconNewTipPreference.h0();
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean b17 = bk0.a.g().b(262158, 266266);
        boolean e17 = rn3.i.Ai().e(1);
        if (normalIconNewTipPreference.o0(b17 || e17)) {
            return;
        }
        normalIconNewTipPreference.a0(8);
        normalIconNewTipPreference.V = "";
        normalIconNewTipPreference.W = -1;
        if (b17 || e17) {
            normalIconNewTipPreference.c0(0);
            normalIconNewTipPreference.e5(com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT, true);
        } else {
            normalIconNewTipPreference.c0(8);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f160276g).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494950ci;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.f493018ip0);
        this.f160276g = getPreferenceScreen();
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.b6(this));
        ((com.tencent.mm.ui.base.preference.h0) this.f160276g).m("settings_swipeback_mode", !db5.f.g());
        j45.l.g("backup");
        e7();
        ((com.tencent.mm.ui.base.preference.h0) this.f160276g).m("settings_traffic_statistic", true);
        if (Y6()) {
            if (((com.tencent.mm.ui.base.preference.h0) this.f160276g).h("settings_take_photo") != null) {
                ((com.tencent.mm.ui.base.preference.h0) this.f160276g).h("settings_take_photo").J(com.tencent.mm.R.string.iwg);
            }
        } else if (((com.tencent.mm.ui.base.preference.h0) this.f160276g).h("settings_take_photo") != null) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160276g).h("settings_take_photo").J(com.tencent.mm.R.string.iwf);
        }
        boolean z17 = x51.o1.f452042a;
        if (!j65.m.a()) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (com.tencent.mm.ui.bk.G()) {
                return;
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f160276g).m("settings_dark", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f160276g).m("small_divider", true);
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference, com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f160277h = false;
        initView();
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f160280n) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(this.f160279m);
            objArr[1] = java.lang.Boolean.valueOf(this.f160278i == this.f160279m);
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAboutSystemUI", "kvstat, autodownload sight change: %d, %b", objArr);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr2 = new java.lang.Object[3];
            objArr2[0] = 1;
            objArr2[1] = java.lang.Integer.valueOf(this.f160279m);
            objArr2[2] = java.lang.Boolean.valueOf(this.f160278i == this.f160279m);
            g0Var.d(11437, objArr2);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        boolean z17;
        java.lang.String str = preference.f197780q;
        boolean z18 = true;
        if (str.equals("settings_landscape_mode")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAboutSystemUI", "set ScreenOrientation，now is ： %s", java.lang.Boolean.valueOf(getDefaultSharedPreferences().getBoolean("settings_landscape_mode", false)));
            if (getDefaultSharedPreferences().getBoolean("settings_landscape_mode", false)) {
                com.tencent.mm.ui.ee.c(1);
                setRequestedOrientation(-1);
            } else {
                com.tencent.mm.ui.ee.c(0);
                setRequestedOrientation(1);
            }
        } else if (str.equals("settings_voicerecorder_mode")) {
            if (!getDefaultSharedPreferences().getBoolean("settings_voicerecorder_mode", wo.v1.f447823c.f447605i != 1)) {
                db5.e1.n(getContext(), com.tencent.mm.R.string.f493106j16, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.setting.ui.setting.h6(this), new com.tencent.mm.plugin.setting.ui.setting.i6(this));
            }
        } else if (str.equals("settings_nfc_switch")) {
            android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(this);
            if (defaultAdapter == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAboutSystemUI", "lo-nfc-goTosetNfcSwitch phone not suppot nfc");
            } else {
                int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_NFC_OPEN_SWITCH_INT_SYNC, 0)).intValue();
                int intValue2 = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_NFC_OPEN_DEFAULT_SWITCH_INT_SYNC, 0)).intValue();
                if ((intValue == 2 || (intValue == 0 && intValue2 != 1)) && !defaultAdapter.isEnabled() && getDefaultSharedPreferences().getBoolean("settings_nfc_switch", false)) {
                    Z6(false);
                    db5.e1.A(getContext(), getString(com.tencent.mm.R.string.h9c), "", getString(com.tencent.mm.R.string.h9d), getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.setting.ui.setting.f6(this), new com.tencent.mm.plugin.setting.ui.setting.g6(this));
                } else {
                    a7(getDefaultSharedPreferences().getBoolean("settings_nfc_switch", false));
                }
            }
        } else if (str.equals("settings_voice_play_mode")) {
            gm0.j1.u().c().w(26, java.lang.Boolean.valueOf(!((java.lang.Boolean) gm0.j1.u().c().l(26, java.lang.Boolean.FALSE)).booleanValue()));
        } else if (str.equals("settings_enter_button_send")) {
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160276g).h("settings_enter_button_send");
            if (checkBoxPreference != null) {
                gm0.j1.u().c().w(66832, java.lang.Boolean.valueOf(checkBoxPreference.N()));
            }
        } else if (str.equals("settings_sns_sight_auto_download")) {
            androidx.appcompat.app.AppCompatActivity context = getContext();
            com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
            aVar.f211733w = of5.b.a(context).getString(com.tencent.mm.R.string.f490347sg);
            aVar.f211709a = of5.b.a(context).getString(com.tencent.mm.R.string.iyo);
            android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.bxx, null);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.nua);
            int j17 = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(327686, null), com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SIGHTAutoLoadNetwork"), 1));
            android.view.View.OnClickListener m6Var = new com.tencent.mm.plugin.setting.ui.setting.m6(this, linearLayout, j17);
            X6(linearLayout, com.tencent.mm.R.string.iym, 1, 1 == j17, m6Var);
            X6(linearLayout, com.tencent.mm.R.string.iyp, 2, 2 == j17, m6Var);
            X6(linearLayout, com.tencent.mm.R.string.iyn, 3, 3 == j17, m6Var);
            aVar.L = inflate;
            com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
            j0Var.e(aVar);
            com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
            if (d0Var != null) {
                d0Var.a(j0Var.f211837r);
            }
            linearLayout.setTag(j0Var);
            j0Var.show();
            addDialog(j0Var);
            this.f160280n = true;
        } else if (str.equals("settings_silence_update_mode")) {
            androidx.appcompat.app.AppCompatActivity context2 = getContext();
            com.tencent.mm.ui.widget.dialog.a aVar2 = new com.tencent.mm.ui.widget.dialog.a();
            aVar2.f211733w = of5.b.a(context2).getString(com.tencent.mm.R.string.f490347sg);
            aVar2.f211709a = of5.b.a(context2).getString(com.tencent.mm.R.string.iy9);
            android.view.View inflate2 = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.bxx, null);
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) inflate2.findViewById(com.tencent.mm.R.id.nua);
            android.view.View.OnClickListener k6Var = new com.tencent.mm.plugin.setting.ui.setting.k6(this, linearLayout2);
            boolean z19 = (((java.lang.Integer) gm0.j1.u().c().l(7, 0)).intValue() & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) == 0;
            X6(linearLayout2, com.tencent.mm.R.string.iya, 0, z19, k6Var);
            X6(linearLayout2, com.tencent.mm.R.string.iy_, 1, !z19, k6Var);
            aVar2.L = inflate2;
            com.tencent.mm.ui.widget.dialog.j0 j0Var2 = new com.tencent.mm.ui.widget.dialog.j0(context2, com.tencent.mm.R.style.f494791wd);
            j0Var2.e(aVar2);
            com.tencent.mm.ui.widget.dialog.d0 d0Var2 = aVar2.f211723m;
            if (d0Var2 != null) {
                d0Var2.a(j0Var2.f211837r);
            }
            linearLayout2.setTag(j0Var2);
            j0Var2.show();
            addDialog(j0Var2);
        } else if (str.equals("settings_language")) {
            android.content.Intent intent = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsLanguageUI.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetLanguage", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetLanguage", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("settings_translate_language_introduce")) {
            android.content.Intent intent2 = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageIntroduceUI.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goToSetTranslateLanguageIntroduce", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goToSetTranslateLanguageIntroduce", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("settings_text_size")) {
            b7();
        } else if (str.equals("settings_chatting_bg")) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.setClass(this, com.tencent.mm.plugin.setting.ui.setting.SettingsChattingBackgroundUI.class);
            androidx.appcompat.app.AppCompatActivity context3 = getContext();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent3);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(context3, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetChattingBackground", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context3.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(context3, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetChattingBackground", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("settings_manage_findmoreui")) {
            android.content.Intent intent4 = new android.content.Intent();
            intent4.setClass(this, com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreV2UI.class);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(intent4);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(this, arrayList4.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goToManageFindMoreUI", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList4.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goToManageFindMoreUI", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("settings_plugins")) {
            rn3.i.Di().a(32);
            android.content.Intent intent5 = new android.content.Intent();
            intent5.setClass(this, com.tencent.mm.plugin.setting.ui.setting.SettingsPluginsUI.class);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(intent5);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(this, arrayList5.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetPlugins", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList5.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetPlugins", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().h(262158, 266266);
        } else {
            if (!str.equals("settings_reset")) {
                if (str.equals("settings_emoji_manager")) {
                    android.content.Intent intent6 = new android.content.Intent();
                    intent6.putExtra(java.lang.String.valueOf(10931), 2);
                    j45.l.j(getContext(), "emoji", ".ui.EmojiMineUI", intent6, null);
                } else if (str.equals("settngs_clean")) {
                    if (gm0.j1.u().l()) {
                        j45.l.j(getContext(), "clean", ".ui.CleanUI", new android.content.Intent().putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1), null);
                    } else {
                        db5.t7.k(getContext(), null);
                    }
                } else if (str.equals("settings_traffic_statistic")) {
                    android.content.Intent intent7 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsNetStatUI.class);
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(intent7);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(this, arrayList6.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goToSetTrafficStatistic", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList6.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goToSetTrafficStatistic", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (str.equals("settings_text_size")) {
                    b7();
                } else if (str.equals("settings_swipeback_mode")) {
                    com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) preference;
                    boolean a17 = ep.a.a();
                    db5.e1.u(getContext(), getString(!a17 ? com.tencent.mm.R.string.iyu : com.tencent.mm.R.string.iyt), null, new com.tencent.mm.plugin.setting.ui.setting.d6(this), new com.tencent.mm.plugin.setting.ui.setting.e6(this, checkBoxPreference2, a17));
                } else if (str.equals("settings_take_photo")) {
                    android.content.Intent intent8 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsAboutCamera.class);
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    arrayList7.add(intent8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(this, arrayList7.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "doClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList7.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "doClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (str.equalsIgnoreCase("settngs_matrix_trace")) {
                    if (!ih.d.c()) {
                        dp.a.makeText(this, "Matrix is never installed", 0).show();
                        z18 = false;
                    }
                } else if (str.equals("settings_dark")) {
                    com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putBoolean("dark_mode_red_dot", false);
                    android.content.Intent intent9 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingDarkMode.class);
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    arrayList8.add(intent9);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(this, arrayList8.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetDarkMode", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList8.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetDarkMode", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (str.equals("settings_music_and_audio")) {
                    android.content.Intent intent10 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsMusicUI.class);
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    arrayList9.add(intent10);
                    java.util.Collections.reverse(arrayList9);
                    yj0.a.d(this, arrayList9.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goToSettingMusic", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    z17 = false;
                    startActivity((android.content.Intent) arrayList9.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goToSettingMusic", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    z18 = z17;
                }
            }
            z17 = false;
            z18 = z17;
        }
        W6(this.f160276g, preference.f197780q);
        return z18;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b7  */
    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI.onResume():void");
    }
}
