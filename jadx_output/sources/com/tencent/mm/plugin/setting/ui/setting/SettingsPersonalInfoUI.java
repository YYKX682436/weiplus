package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class SettingsPersonalInfoUI extends com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference implements l75.z0 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f160601m = 0;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f160602g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f160603h;

    /* renamed from: i, reason: collision with root package name */
    public int f160604i = -1;

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference
    public int V6() {
        return 2;
    }

    public final void X6(boolean z17) {
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        if ((!((gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_USER_INFO_FINDER_SETTING_LONG_SYNC, 0L) & 1) != 0)) && z17) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160602g).m("settings_finder_recent_like", false);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f160602g).m("settings_finder_recent_like", true);
        }
    }

    public final void Y6() {
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this, com.tencent.mm.plugin.setting.ui.setting.SettingsModifyPatSuffixUI.class);
        intent.putExtras(getIntent());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI", "goToSetPatSuffix", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI", "goToSetPatSuffix", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Z6() {
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) this.f160602g).h("settings_mobile");
        if (h17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsPersonalInfoUI", "updateMobile Preference null");
            return;
        }
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
        if (str == null || str.length() <= 0) {
            h17.H(getString(com.tencent.mm.R.string.ipy));
        } else {
            h17.H(com.tencent.mm.ui.fg.a(str));
        }
    }

    public final void a7() {
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) this.f160602g).h("settings_signature");
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(12291, null);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        if (str.length() <= 0) {
            str = getString(com.tencent.mm.R.string.iy8);
        }
        ((ke0.e) xVar).getClass();
        h17.H(com.tencent.mm.pluginsdk.ui.span.c0.i(this, str));
    }

    public final void b7() {
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) this.f160602g).h("settings_username");
        java.lang.String c17 = c01.z1.c();
        java.lang.String r17 = c01.z1.r();
        if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
            if (com.tencent.mm.storage.z3.y3(r17)) {
                h17.H(getString(com.tencent.mm.R.string.ium));
            } else {
                h17.H(r17);
            }
            if (!com.tencent.mm.storage.z3.P3(c01.z1.r()) && ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) == 0) {
                h17.E(8);
            }
        } else {
            h17.H(c17);
            if (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) == 0) {
                h17.E(8);
            }
        }
        if (com.tencent.mm.sdk.platformtools.f9.MeAvatarWeChatId.n()) {
            h17.E(8);
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        int o17 = com.tencent.mm.sdk.platformtools.t8.o1(obj, 0);
        if (a1Var != gm0.j1.u().c() || o17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsPersonalInfoUI", "onNotifyChange error obj:%d stg:%s", java.lang.Integer.valueOf(o17), a1Var);
            return;
        }
        b7();
        Z6();
        if (12291 == o17) {
            a7();
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494948cg;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.ohq);
        gm0.j1.u().c().a(this);
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        this.f160602g = preferenceScreen;
        ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).h("settings_name").K = 3;
        ((com.tencent.mm.ui.base.preference.h0) this.f160602g).h("settings_sex").K = 2;
        ((com.tencent.mm.ui.base.preference.h0) this.f160602g).h("settings_district").K = 4;
        ((com.tencent.mm.ui.base.preference.h0) this.f160602g).h("settings_mobile").K = 3;
        ((com.tencent.mm.ui.base.preference.h0) this.f160602g).h("settings_username").K = 3;
        ((com.tencent.mm.ui.base.preference.h0) this.f160602g).h("settings_pat").K = 3;
        ((com.tencent.mm.ui.base.preference.h0) this.f160602g).h("settings_signature").K = 3;
        ((com.tencent.mm.ui.base.preference.h0) this.f160602g).h("settings_notification_ringtone").K = 4;
        ((com.tencent.mm.ui.base.preference.h0) this.f160602g).h("settings_address").K = 4;
        ((com.tencent.mm.ui.base.preference.h0) this.f160602g).h("settings_invoice").K = 4;
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.rk(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.vfs.x1 m17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsPersonalInfoUI", "onAcvityResult requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 != -1) {
            if (i17 == 3 || i17 == 2 || i17 == 4) {
                new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.setting.ui.setting.uk(this));
                return;
            }
            return;
        }
        if (i17 == 2) {
            if (intent == null) {
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("CropImageMode", 1);
            intent2.putExtra("CropImage_Filter", true);
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            intent2.putExtra("CropImage_OutputPath", com.tencent.mm.modelavatar.d1.Ai().i(c01.z1.r() + ".crop", true, false));
            intent2.putExtra("CropImage_ImgPath", (java.lang.String) null);
            intent2.putExtra("CropImage_from_scene", 3);
            ((com.tencent.mm.app.y7) f14.g.b()).q(this, intent, intent2, g83.a.a(), 4, null);
            return;
        }
        if (i17 == 3) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.content.Context applicationContext = getApplicationContext();
            java.lang.String a17 = g83.a.a();
            ((ub0.r) oVar).getClass();
            java.lang.String b17 = com.tencent.mm.pluginsdk.ui.tools.l7.b(applicationContext, intent, a17);
            if (b17 == null) {
                return;
            }
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("CropImageMode", 1);
            intent3.putExtra("CropImage_OutputPath", b17);
            intent3.putExtra("CropImage_ImgPath", b17);
            intent3.putExtra("CropImage_from_scene", 3);
            ((com.tencent.mm.app.y7) f14.g.b()).p(this, intent3, 4);
            return;
        }
        if (i17 != 4) {
            return;
        }
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.setting.ui.setting.vk(this));
        if (intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("CropImage_OutputPath");
        java.lang.String r17 = c01.z1.r();
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        android.graphics.Bitmap m18 = com.tencent.mm.modelavatar.d1.Ai().m(r17);
        if (stringExtra == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsPersonalInfoUI", "crop picture failed");
            return;
        }
        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(stringExtra);
        java.lang.String str = a18.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m19 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
        long j17 = 0;
        if (m19.a() && (m17 = m19.f213266a.m(m19.f213267b)) != null) {
            j17 = m17.f213233c;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsPersonalInfoUI", "onActivityResult(CONTEXT_MENU_CROP_PICTURE)  file:%s, size:%d", stringExtra, java.lang.Long.valueOf(j17));
        kv.l0 l0Var = (kv.l0) i95.n0.c(kv.l0.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        ((com.tencent.mm.feature.avatar.k0) l0Var).getClass();
        new com.tencent.mm.modelavatar.y0(context, stringExtra, false).b(1, new com.tencent.mm.plugin.setting.ui.setting.wk(this, m18), true);
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference, com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("jumptoPat", false)) {
            Y6();
        }
        c01.fb a17 = c01.fb.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsPersonalInfoUI", "[logRegionInfo] called country = %s, province = %s, city = %s,", a17.f37193g, a17.d(), a17.c());
        initView();
        if (getIntent().getBooleanExtra("intent_set_avatar", false)) {
            this.f160603h = getIntent().getBooleanExtra("KEnterFromBanner", false);
            ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Ui(this);
        }
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.SettingsPersonalInfoUI)).Rj(this, iy1.a.MyProfile);
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        if (gm0.j1.a()) {
            gm0.j1.u().c().e(this);
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        if (str.equals("settings_mobile")) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI.class);
            intent.putExtra("key_upload_scene", 4);
            com.tencent.mm.ui.MMWizardActivity.X6(this, intent);
            return true;
        }
        if (str.equals("settings_district")) {
            ((com.tencent.mm.app.y7) f14.g.b()).w(new android.content.Intent(), getContext());
            return true;
        }
        if (str.equals("settings_signature")) {
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.EditSignatureUI.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if (str.equals("settings_linkedin")) {
            android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI.class);
            intent3.putExtra("oversea_entry", true);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent3);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if (str.equals("settings_sex")) {
            android.content.Intent intent4 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SelectSexUI.class);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if (str.equals("settings_change_avatar")) {
            android.content.Intent intent5 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg.class);
            androidx.appcompat.app.AppCompatActivity context = getContext();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(intent5);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(context, arrayList4.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList4.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if (str.equals("settings_username")) {
            if (com.tencent.mm.sdk.platformtools.f9.MeAvatarWeChatId.n()) {
                return true;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(c01.z1.c()) && com.tencent.mm.storage.z3.P3(c01.z1.r()) && ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) == 0) {
                startActivity(com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI.class);
                return true;
            }
            if (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) != 0) {
                android.content.Intent intent6 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI.class);
                intent6.putExtra("WizardRootClass", com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI.class.getCanonicalName());
                com.tencent.mm.ui.MMWizardActivity.X6(this, intent6);
            }
            return true;
        }
        if (str.equals("settings_name")) {
            android.content.Intent intent7 = new android.content.Intent();
            intent7.setClass(this, com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI.class);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(intent7);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(this, arrayList5.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI", "goTosetName", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList5.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI", "goTosetName", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if (str.equals("settings_qrcode")) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11264, 2);
            kd0.i2 i2Var = (kd0.i2) i95.n0.c(kd0.i2.class);
            androidx.appcompat.app.AppCompatActivity context2 = getContext();
            c01.ka kaVar = new c01.ka(2);
            ((hs.d0) i2Var).getClass();
            kotlin.jvm.internal.o.g(context2, "context");
            e04.g2.a(context2, kaVar);
        } else if (str.equals("settings_more_info")) {
            android.content.Intent intent8 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalMoreUI.class);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(intent8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(this, arrayList6.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList6.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            if (str.equals("settings_address")) {
                if (!com.tencent.mm.sdk.platformtools.f9.MeAvatarAddress.k(getContext(), null)) {
                    return true;
                }
                android.content.Intent intent9 = new android.content.Intent();
                intent9.putExtra("launch_from_webview", false);
                intent9.putExtra("enter_scene_address", 1);
                j45.l.k(getContext(), "address", ".ui.WalletSelectAddrUI", intent9, true);
                return true;
            }
            if (str.equals("settings_invoice")) {
                if (!com.tencent.mm.sdk.platformtools.f9.MeAvatarInvoiceTitle.k(getContext(), null)) {
                    return true;
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14199, 1);
                android.content.Intent intent10 = new android.content.Intent();
                intent10.putExtra("launch_from_webview", false);
                j45.l.k(getContext(), "address", ".ui.InvoiceListUI", intent10, true);
                return true;
            }
            if (str.equals("settings_pat")) {
                Y6();
            } else if (str.equals("settings_wecoin")) {
                if (((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).c()) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21650, 0);
                    android.content.Intent intent11 = new android.content.Intent();
                    intent11.putExtra("launch_from_webview", false);
                    j45.l.k(getContext(), "wallet", ".wecoin.ui.WeCoinRechargeView", intent11, true);
                } else {
                    v24.o0.b(this, 8L, true, new com.tencent.mm.plugin.setting.ui.setting.tk(this));
                }
            } else if (str.equals("settings_finder_recent_like")) {
                java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(4, null);
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    str2 = "";
                }
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                vd2.t3.f435921a.a(this, c01.z1.r(), str2, 92);
            } else if (str.equals("settings_notification_ringtone")) {
                ((dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class))).wi(this, 7);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x019f, code lost:
    
        if (r7 == null) goto L26;
     */
    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI.onResume():void");
    }
}
