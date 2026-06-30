package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class SnsNotInterestUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0 {

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f167289v = {"sns_expose_reason_not_fav", "sns_expose_reason_too_freq", "sns_expose_reason_too_many_same_content", "sns_expose_reason_marketing", "sns_expose_reason_content_sexy", "sns_expose_reason_rumour", "sns_expose_reason_other"};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f167290w = {1, 2, 4, 8, 16, 32, 64};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f167291x = {com.tencent.mm.R.string.j_p, com.tencent.mm.R.string.j_u, com.tencent.mm.R.string.j_v, com.tencent.mm.R.string.j_o, com.tencent.mm.R.string.j_n, com.tencent.mm.R.string.j_s, com.tencent.mm.R.string.j_q};

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f167295g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.EditText f167296h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ListView f167297i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f167298m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f167299n;

    /* renamed from: o, reason: collision with root package name */
    public int f167300o;

    /* renamed from: p, reason: collision with root package name */
    public int f167301p;

    /* renamed from: q, reason: collision with root package name */
    public long f167302q;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f167292d = new java.util.HashMap(7);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f167293e = new java.util.HashMap(7);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f167294f = new java.util.HashMap(7);

    /* renamed from: r, reason: collision with root package name */
    public boolean f167303r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f167304s = false;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f167305t = null;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.model.q2 f167306u = null;

    public final void V6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetOptionMaps", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        java.lang.String[] strArr = f167289v;
        for (int i17 = 0; i17 < 7; i17++) {
            this.f167292d.put(strArr[i17], java.lang.Boolean.FALSE);
        }
        int[] iArr = f167290w;
        for (int i18 = 0; i18 < 7; i18++) {
            this.f167293e.put(java.lang.Integer.valueOf(iArr[i18]), java.lang.Boolean.FALSE);
        }
        for (int i19 = 0; i19 < 7; i19++) {
            this.f167294f.put(strArr[i19], java.lang.Integer.valueOf(iArr[i19]));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetOptionMaps", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        return com.tencent.mm.R.layout.crh;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        super.initView();
        setMMTitle(com.tencent.mm.R.string.j_y);
        setBackBtn(new com.tencent.mm.plugin.sns.ui.an(this));
        this.f167295g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.n89);
        this.f167296h = (android.widget.EditText) findViewById(com.tencent.mm.R.id.n8_);
        this.f167297i = (android.widget.ListView) findViewById(android.R.id.list);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.dkm);
        this.f167298m = linearLayout;
        linearLayout.setOnClickListener(new com.tencent.mm.plugin.sns.ui.bn(this));
        this.f167296h.setVisibility(8);
        this.f167295g.setVisibility(8);
        this.f167299n = getPreferenceScreen();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initPref", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        com.tencent.mm.ui.base.preference.r rVar = this.f167299n;
        if (rVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsNotInterestUI", "initPref error, PreferenceScreen is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPref", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        } else {
            if (((com.tencent.mm.ui.base.preference.h0) rVar).h("sns_expose_desc") == null) {
                com.tencent.mm.ui.base.preference.PreferenceTitleCategory preferenceTitleCategory = new com.tencent.mm.ui.base.preference.PreferenceTitleCategory(this, null);
                preferenceTitleCategory.J(com.tencent.mm.R.string.j_l);
                preferenceTitleCategory.C("sns_expose_desc");
                ((com.tencent.mm.ui.base.preference.h0) this.f167299n).d(preferenceTitleCategory, -1);
            }
            for (int i17 = 0; i17 < 7; i17++) {
                java.lang.String str = f167289v[i17];
                int i18 = f167291x[i17];
                if (((com.tencent.mm.ui.base.preference.h0) this.f167299n).h(str) == null) {
                    com.tencent.mm.ui.base.preference.Preference preference = new com.tencent.mm.ui.base.preference.Preference(this);
                    preference.J(i18);
                    preference.C(str);
                    preference.G = com.tencent.mm.R.layout.byv;
                    preference.H = com.tencent.mm.R.layout.f489284bz4;
                    ((com.tencent.mm.ui.base.preference.h0) this.f167299n).d(preference, -1);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPref", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        }
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490743ak5), new com.tencent.mm.plugin.sns.ui.cn(this), null, com.tencent.mm.ui.fb.GREEN);
        enableOptionMenu(0, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String userName;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        super.onCreate(bundle);
        this.f167300o = getIntent().getIntExtra("sns_info_not_interest_scene", 0);
        long longExtra = getIntent().getLongExtra("sns_info_svr_id", 0L);
        this.f167302q = longExtra;
        if (longExtra != 0 && (userName = com.tencent.mm.plugin.sns.model.l4.Fj().W0(this.f167302q).getUserName()) != null) {
            gm0.j1.i();
            int i17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(userName).I;
            int[] iArr = f167291x;
            if (i17 == 2) {
                iArr[1] = com.tencent.mm.R.string.j_t;
            } else if (i17 == 1) {
                iArr[1] = com.tencent.mm.R.string.j_u;
            }
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.a(218, this);
        V6();
        initView();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        super.onDestroy();
        V6();
        gm0.j1.i();
        gm0.j1.n().f273288b.q(218, this);
        com.tencent.mm.autogen.events.FinishSendNotInterestSnsEvent finishSendNotInterestSnsEvent = new com.tencent.mm.autogen.events.FinishSendNotInterestSnsEvent();
        boolean z17 = this.f167303r;
        am.ud udVar = finishSendNotInterestSnsEvent.f54341g;
        udVar.f8076a = z17;
        udVar.f8077b = this.f167302q;
        finishSendNotInterestSnsEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        if (preference == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
            return false;
        }
        java.lang.String str = preference.f197780q;
        java.util.HashMap hashMap = this.f167292d;
        if (!hashMap.containsKey(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
            return false;
        }
        boolean booleanValue = ((java.lang.Boolean) hashMap.get(str)).booleanValue();
        if (booleanValue) {
            preference.H = com.tencent.mm.R.layout.f489284bz4;
        } else {
            preference.H = com.tencent.mm.R.layout.f489283bz3;
        }
        ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        boolean z18 = !booleanValue;
        hashMap.put(str, java.lang.Boolean.valueOf(z18));
        this.f167293e.put(java.lang.Integer.valueOf(((java.lang.Integer) this.f167294f.get(str)).intValue()), java.lang.Boolean.valueOf(z18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSomethingCheck", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        java.util.Iterator it = hashMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSomethingCheck", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
                z17 = false;
                break;
            }
            if (((java.lang.Boolean) it.next()).booleanValue()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSomethingCheck", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
                z17 = true;
                break;
            }
        }
        if (z17) {
            enableOptionMenu(0, true);
        } else {
            enableOptionMenu(0, false);
        }
        if (z18 && str.equals("sns_expose_reason_other")) {
            this.f167296h.setVisibility(0);
            this.f167295g.setVisibility(0);
            this.f167296h.requestFocus();
            this.f167304s = true;
            showVKB();
        } else if (((java.lang.Boolean) hashMap.get("sns_expose_reason_other")).booleanValue()) {
            this.f167297i.requestFocus();
            hideVKB();
        } else {
            this.f167296h.setVisibility(8);
            this.f167295g.setVisibility(8);
            this.f167297i.requestFocus();
            this.f167304s = false;
            hideVKB();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        return true;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        if (m1Var.getType() == 218) {
            this.f167305t.dismiss();
            this.f167305t = null;
            if (((com.tencent.mm.plugin.sns.model.q2) m1Var).L() == 9) {
                if (i17 == 0 && i18 == 0) {
                    this.f167303r = true;
                    android.widget.Toast.makeText(this, com.tencent.mm.R.string.j_x, 1).show();
                    finish();
                } else {
                    this.f167303r = false;
                    android.widget.Toast.makeText(this, com.tencent.mm.R.string.j_m, 1).show();
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
    }
}
