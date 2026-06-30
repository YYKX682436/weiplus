package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public class SettingsSnsPrivacyUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f160666v = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f160667d;

    /* renamed from: e, reason: collision with root package name */
    public int f160668e;

    /* renamed from: f, reason: collision with root package name */
    public long f160669f;

    /* renamed from: g, reason: collision with root package name */
    public long f160670g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f160671h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f160672i = "";

    /* renamed from: m, reason: collision with root package name */
    public boolean f160673m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f160674n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f160675o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f160676p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f160677q = false;

    /* renamed from: r, reason: collision with root package name */
    public int f160678r = 0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f160679s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f160680t = false;

    /* renamed from: u, reason: collision with root package name */
    public int f160681u = 0;

    public final void V6(android.widget.LinearLayout linearLayout, int i17, int i18, boolean z17, android.view.View.OnClickListener onClickListener) {
        android.widget.TextView textView = (android.widget.TextView) android.view.View.inflate(getContext(), com.tencent.mm.R.layout.cbx, null);
        textView.setText(i17);
        textView.setTag(java.lang.Integer.valueOf(i18));
        linearLayout.addView(textView);
        textView.setOnClickListener(onClickListener);
        if (!z17) {
            textView.setContentDescription(((java.lang.Object) textView.getText()) + textView.getContext().getString(com.tencent.mm.R.string.f489843db));
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.R.raw.radio_on, 0, 0, 0);
        textView.setContentDescription(((java.lang.Object) textView.getText()) + textView.getContext().getString(com.tencent.mm.R.string.d_));
    }

    public final void W6() {
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference;
        r45.cb6 cb6Var = new r45.cb6();
        if (p94.w0.c() != null) {
            cb6Var = ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).b1(this.f160672i);
        }
        if (cb6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsSnsPrivacyUI", "userinfo is null");
            return;
        }
        int i17 = cb6Var.f371431g;
        int i18 = cb6Var.f371432h;
        if (this.f160679s && (checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160667d).h("timeline_stranger_show")) != null) {
            checkBoxPreference.f197785v = false;
            boolean z17 = (i17 & 1) > 0;
            this.f160673m = z17;
            if (z17) {
                checkBoxPreference.O(false);
            } else {
                checkBoxPreference.O(true);
            }
        }
        com.tencent.mm.ui.base.preference.IconPreference iconPreference = (com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160667d).h("timeline_recent_show_select");
        if (iconPreference != null) {
            iconPreference.f197785v = false;
            boolean z18 = i18 == 4320 && (i17 & 4096) > 0;
            this.f160674n = z18;
            boolean z19 = i18 == 72 && (i17 & 4096) > 0;
            this.f160675o = z19;
            boolean z27 = i18 == 720 && (i17 & 4096) > 0;
            this.f160677q = z27;
            this.f160676p = (i17 & 2048) > 0;
            if (z18) {
                iconPreference.G(com.tencent.mm.R.string.bdp);
                this.f160678r = 1;
            } else if (z19) {
                iconPreference.G(com.tencent.mm.R.string.bdr);
                this.f160678r = 3;
            } else if (z27) {
                iconPreference.G(com.tencent.mm.R.string.bdq);
                this.f160678r = 2;
            } else {
                iconPreference.G(com.tencent.mm.R.string.bdo);
                this.f160678r = 4;
            }
            int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_RECENT_RED_DOT_WILL_SHOW_ID_INT, 0)).intValue();
            int intValue2 = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_RECENT_RED_DOT_DID_SHOW_ID_INT, 0)).intValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSnsPrivacyUI", "willShowRecentRedCodeId  %d, currentRecentRedCodeId %d", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2));
            if (intValue > intValue2) {
                iconPreference.c0(0);
            } else {
                iconPreference.c0(8);
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f160667d).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public com.tencent.mm.ui.base.preference.h0 createAdapter(android.content.SharedPreferences sharedPreferences) {
        return new com.tencent.mm.ui.base.preference.b(this, getListView(), sharedPreferences);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494927bt;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.ioz);
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.fm(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSnsPrivacyUI", "init function status: " + java.lang.Integer.toBinaryString(this.f160668e) + "extStatus: " + java.lang.Long.toBinaryString(this.f160669f) + " FinderSetting: " + java.lang.Long.toBinaryString(this.f160670g));
        if (!((java.lang.Boolean) gm0.j1.u().c().l(335873, java.lang.Boolean.TRUE)).booleanValue() || !((com.tencent.mm.plugin.sns.storage.r2) p94.w0.f()).W0()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160667d).m("edit_timeline_group", true);
        }
        if (c01.e2.a0() && ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            this.f160679s = false;
        } else {
            this.f160679s = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ForbidSnsStranger", 0) == 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSnsPrivacyUI", "showStranger:%s", java.lang.Boolean.valueOf(this.f160679s));
        if (this.f160679s) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160667d).m("timeline_stranger_show", false);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f160667d).m("timeline_stranger_show", true);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f160667d).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f160667d = getPreferenceScreen();
        this.f160668e = c01.z1.p();
        this.f160669f = c01.z1.j();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        this.f160670g = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_USER_INFO_FINDER_SETTING_LONG_SYNC, 0L);
        this.f160672i = c01.z1.r();
        this.f160681u = getIntent().getIntExtra("enter_scene", 0);
        initView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.u().c().w(7, java.lang.Integer.valueOf(this.f160668e));
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(this.f160669f));
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_USER_INFO_FINDER_SETTING_LONG_SYNC, java.lang.Long.valueOf(this.f160670g));
        java.util.HashMap hashMap = this.f160671h;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            int intValue2 = ((java.lang.Integer) entry.getValue()).intValue();
            r45.p53 p53Var = new r45.p53();
            p53Var.f382761d = intValue;
            p53Var.f382762e = intValue2;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        }
        hashMap.clear();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSnsPrivacyUI", str + " item has been clicked!");
        getDefaultSharedPreferences();
        if (str.equals("timline_outside_permiss")) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("k_sns_tag_id", 4L);
            intent.putExtra("k_sns_from_settings_about_sns", 1);
            intent.addFlags(268435456);
            intent.setClassName(this, "com.tencent.mm.ui.contact.privacy.SnsTagDetailUI");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSnsPrivacyUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSnsPrivacyUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("edit_timeline_group")) {
            j45.l.h(this, "sns", ".ui.SnsTagPartlyUI");
        } else if (str.equals("timeline_black_permiss")) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("k_sns_tag_id", 5L);
            intent2.putExtra("k_sns_from_settings_about_sns", 2);
            intent2.putExtra("k_tag_detail_sns_block_scene", 8);
            intent2.addFlags(268435456);
            intent2.setClassName(this, "com.tencent.mm.ui.contact.privacy.SnsTagDetailUI");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSnsPrivacyUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSnsPrivacyUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("timeline_stranger_show")) {
            this.f160673m = !this.f160673m;
            if (p94.w0.c() != null) {
                ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).C1(this.f160672i, this.f160673m);
            }
            if (p94.w0.c() != null) {
                r45.cb6 P0 = ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).P0(this.f160672i, this.f160673m);
                ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).z1(this.f160672i, P0);
                if (P0 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SettingsSnsPrivacyUI", "userinfo in null !");
                    return false;
                }
                ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(51, P0));
            }
        } else if (str.equals("timeline_recent_show_select")) {
            r45.cb6 cb6Var = new r45.cb6();
            if (p94.w0.c() != null) {
                cb6Var = ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).b1(this.f160672i);
            }
            if (cb6Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SettingsSnsPrivacyUI", "userinfo is null");
            } else {
                int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_RECENT_RED_DOT_WILL_SHOW_ID_INT, 0)).intValue();
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_RECENT_RED_DOT_DID_SHOW_ID_INT;
                if (intValue > ((java.lang.Integer) c17.m(u3Var, 0)).intValue()) {
                    gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(intValue));
                    W6();
                }
                androidx.appcompat.app.AppCompatActivity context = getContext();
                com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
                aVar.f211733w = of5.b.a(context).getString(com.tencent.mm.R.string.f490347sg);
                aVar.f211709a = of5.b.a(context).getString(com.tencent.mm.R.string.bdn);
                android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.bxx, null);
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.nua);
                android.view.View.OnClickListener emVar = new com.tencent.mm.plugin.setting.ui.setting.em(this, linearLayout);
                V6(linearLayout, com.tencent.mm.R.string.bdp, 1, this.f160674n, emVar);
                V6(linearLayout, com.tencent.mm.R.string.bdq, 3, this.f160677q, emVar);
                V6(linearLayout, com.tencent.mm.R.string.bdr, 0, this.f160675o, emVar);
                V6(linearLayout, com.tencent.mm.R.string.bdo, 2, (this.f160674n || this.f160675o || this.f160677q) ? false : true, emVar);
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
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f160668e = c01.z1.p();
        this.f160669f = c01.z1.j();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        this.f160670g = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_USER_INFO_FINDER_SETTING_LONG_SYNC, 0L);
        W6();
        if (this.f160680t) {
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("need_matte_high_light_item");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            int o17 = ((com.tencent.mm.ui.base.preference.h0) this.f160667d).o(stringExtra);
            setSelection(o17 - 3);
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.setting.ui.setting.cm(this, o17), 10L);
        }
        this.f160680t = true;
    }
}
