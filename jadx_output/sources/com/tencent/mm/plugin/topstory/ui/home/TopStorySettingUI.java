package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes11.dex */
public class TopStorySettingUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f174890p = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f174891d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.IconPreference f174892e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.IconPreference f174893f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f174894g;

    /* renamed from: h, reason: collision with root package name */
    public int f174895h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f174896i = -1;

    /* renamed from: m, reason: collision with root package name */
    public boolean f174897m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f174898n = true;

    /* renamed from: o, reason: collision with root package name */
    public final mf0.g0 f174899o = (mf0.g0) i95.n0.c(mf0.g0.class);

    public final boolean V6(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingUI", "goDetailSettingUI, type:%s", java.lang.Integer.valueOf(i17));
        if (i17 != 1 && i17 != 2) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        if (i17 == 1) {
            java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(rm4.c.b().f397443e, ",");
            intent.putExtra("k_topstory_type", 1);
            intent.putExtra("k_topstory_user_list", c17);
            intent.setClassName(this, "com.tencent.mm.ui.contact.privacy.TopStorySettingVisibilityDetailUI");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/home/TopStorySettingUI", "goDetailPrivacySettingUI", "(I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/topstory/ui/home/TopStorySettingUI", "goDetailPrivacySettingUI", "(I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            java.lang.String c18 = com.tencent.mm.sdk.platformtools.t8.c1(rm4.c.b().f397442d, ",");
            intent.putExtra("k_topstory_type", 2);
            intent.putExtra("k_topstory_user_list", c18);
            intent.setClassName(this, "com.tencent.mm.ui.contact.privacy.TopStorySettingVisibilityDetailUI");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/home/TopStorySettingUI", "goDetailPrivacySettingUI", "(I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/topstory/ui/home/TopStorySettingUI", "goDetailPrivacySettingUI", "(I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return true;
    }

    public final boolean W6(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingUI", "goDetailSettingUI, type:%s", java.lang.Integer.valueOf(i17));
        if (i17 != 1 && i17 != 2) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        if (i17 == 1) {
            java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(rm4.c.b().f397443e, ",");
            intent.putExtra("k_topstory_type", 1);
            intent.putExtra("k_topstory_user_list", c17);
            com.tencent.mm.plugin.websearch.l2.i(this, ".ui.home.TopStorySettingVisibilityDetailUI", intent);
        } else {
            java.lang.String c18 = com.tencent.mm.sdk.platformtools.t8.c1(rm4.c.b().f397442d, ",");
            intent.putExtra("k_topstory_type", 2);
            intent.putExtra("k_topstory_user_list", c18);
            com.tencent.mm.plugin.websearch.l2.i(this, ".ui.home.TopStorySettingVisibilityDetailUI", intent);
        }
        return true;
    }

    public final void X6() {
        this.f174896i = rm4.c.b().f397442d.size();
        this.f174895h = rm4.c.b().f397443e.size();
    }

    public final void Y6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingUI", "updateSummary %s, %s", java.lang.Integer.valueOf(this.f174895h), java.lang.Integer.valueOf(this.f174896i));
        if (this.f174895h <= 0) {
            this.f174892e.H("");
        } else {
            this.f174892e.H("" + this.f174895h);
        }
        if (this.f174896i <= 0) {
            this.f174893f.H("");
        } else {
            this.f174893f.H("" + this.f174896i);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f174891d).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return ((lf0.h0) this.f174899o).Ai() ? com.tencent.mm.R.xml.f494964dq : com.tencent.mm.R.xml.f494963ct;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("setting_mode");
        if (stringExtra == null) {
            stringExtra = "normal";
        }
        boolean equals = "heartLike".equals(stringExtra);
        mf0.f0 f0Var = mf0.f0.Medium;
        if (equals) {
            setMMTitle(((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).wi(this, getString(com.tencent.mm.R.string.omw), "#", getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479559b), f0Var, getColor(com.tencent.mm.R.color.a0c)));
        } else {
            setMMTitle(getString(com.tencent.mm.R.string.k0w));
        }
        setBackBtn(new com.tencent.mm.plugin.topstory.ui.home.f1(this));
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        this.f174891d = preferenceScreen;
        this.f174892e = (com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).h("unlike");
        this.f174893f = (com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f174891d).h("black");
        if (((lf0.h0) this.f174899o).Ai()) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479575r);
            int color = getColor(com.tencent.mm.R.color.a0c);
            this.f174892e.L(((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).wi(this, this.f174892e.f197774h.toString(), "#", dimensionPixelSize, f0Var, color));
            this.f174893f.L(((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).wi(this, this.f174893f.f197774h.toString(), "#", dimensionPixelSize, f0Var, color));
        }
        this.f174897m = getIntent().getBooleanExtra("intent_status_from_privacy_to_tophistory_setting", false);
        rm4.c b17 = rm4.c.b();
        b17.e(b17.f397444f, 0);
        rm4.c b18 = rm4.c.b();
        b18.f(b18.f397445g, 0);
        X6();
        Y6();
        rm4.c.b().f397450o = new com.tencent.mm.plugin.topstory.ui.home.g1(this);
        rm4.c.b().f397451p = new com.tencent.mm.plugin.topstory.ui.home.h1(this);
        if (this.f174897m) {
            ((com.tencent.mm.ui.base.preference.h0) this.f174891d).m("feedback", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f174891d).m("not_be_seen_desc", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f174891d).m("unlike_desc", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f174891d).m("unlike_empty", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f174891d).m("black_empty", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f174891d).m("settings_top_story_setting_recommend", true);
        }
        if ("heartLike".equals(stringExtra)) {
            ((com.tencent.mm.ui.base.preference.h0) this.f174891d).m("feedback", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f174891d).m("settings_top_story_setting_recommend", true);
        }
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f174891d).h("settings_top_story_setting_recommend");
        this.f174894g = checkBoxPreference;
        if (this.f174897m || checkBoxPreference == null) {
            return;
        }
        this.f174894g.S(com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).getBoolean("TopStorySettingUI_settings_top_story_recommend", true));
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingUI", "onCreate, KEY_TOP_STORY_RECOMMEND = " + this.f174894g.N());
        this.f174898n = this.f174894g.N();
        om4.u uVar = new om4.u(this, new com.tencent.mm.plugin.topstory.ui.home.i1(this));
        synchronized (om4.w.class) {
            om4.e eVar = new om4.e(this, 0, uVar);
            eVar.f346417g = true;
            eVar.a();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        rm4.c.b().f397451p = null;
        rm4.c.b().f397450o = null;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        if ("unlike".equals(str)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17080, 1, 2, "" + this.f174895h);
            return this.f174897m ? V6(1) : W6(1);
        }
        if ("black".equals(str)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17080, 2, 2, "" + this.f174896i);
            return this.f174897m ? V6(2) : W6(2);
        }
        if ("settings_top_story_setting_recommend".equals(str)) {
            boolean z17 = !((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("settings_top_story_setting_recommend")).N();
            this.f174898n = z17;
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingUI", "onPreferenceTreeClick, lastRecommendSwithIsChecked = %s, isCheck = %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(!this.f174898n));
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = this.f174894g;
            if (checkBoxPreference == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingUI", "doRecommandStateAction, checkBoxRcmPreference checkBoxRcmPreference, lastRecommendSwithIsChecked = " + this.f174898n);
            } else {
                int i17 = checkBoxPreference.N() ? 2 : 1;
                om4.u uVar = new om4.u(this, new com.tencent.mm.plugin.topstory.ui.home.e1(this));
                synchronized (om4.w.class) {
                    om4.e eVar = new om4.e(this, i17, uVar);
                    eVar.f346417g = true;
                    eVar.a();
                }
            }
        } else if ("feedback".equals(str)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17080, 18, 2, "0");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?t=feedback/index");
            try {
                sb6.append("&deviceName=");
                sb6.append(fp.s0.b(o45.wf.f343026d, com.tencent.mapsdk.internal.rv.f51270c));
            } catch (java.lang.Exception unused) {
            }
            sb6.append("&imei=");
            try {
                sb6.append("&deviceBrand=");
                sb6.append(fp.s0.b(android.os.Build.BRAND, com.tencent.mapsdk.internal.rv.f51270c));
            } catch (java.lang.Exception unused2) {
            }
            try {
                sb6.append("&deviceModel=");
                sb6.append(fp.s0.b(wo.w0.m(), com.tencent.mapsdk.internal.rv.f51270c));
            } catch (java.lang.Exception unused3) {
            }
            sb6.append("&from=settingPage&uin=");
            sb6.append(gm0.j1.b().j());
            sb6.append("&version=");
            sb6.append(o45.wf.f343029g);
            sb6.append("&rev=");
            sb6.append(java.lang.String.valueOf(com.tencent.mm.sdk.platformtools.z.f193109e).trim());
            try {
                sb6.append("&lang=");
                sb6.append(fp.s0.b(com.tencent.mm.sdk.platformtools.m2.d(), com.tencent.mapsdk.internal.rv.f51270c));
            } catch (java.lang.Exception unused4) {
            }
            try {
                sb6.append("&ostype=");
                sb6.append(fp.s0.b(wo.q.f447784e, com.tencent.mapsdk.internal.rv.f51270c));
            } catch (java.lang.Exception unused5) {
            }
            sb6.append("&scene=32&timeZone=");
            sb6.append(com.tencent.mm.sdk.platformtools.t8.k0());
            sb6.append("&templateVersion=");
            sb6.append(com.tencent.mm.plugin.websearch.l2.a(1));
            sb6.append("#/list/4155");
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingUI", "url is:" + sb6.toString());
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", sb6.toString());
            intent.putExtra("convertActivityFromTranslucent", false);
            intent.putExtra("customize_status_bar_color", 0);
            intent.putExtra("status_bar_style", (java.lang.String) null);
            intent.putExtra("prePublishId", "wes##2##1");
            intent.putExtra("KPublisherId", "wes##2##1");
            intent.putExtra("preChatTYPE", 10);
            j45.l.j(getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
            return true;
        }
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        X6();
        Y6();
    }
}
