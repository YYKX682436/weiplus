package com.tencent.mm.plugin.setting.ui.setting;

@gm0.a2
/* loaded from: classes11.dex */
public class SettingsAboutMicroMsgUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f160258w = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f160259d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f160260e;

    /* renamed from: i, reason: collision with root package name */
    public oq1.n f160264i;

    /* renamed from: p, reason: collision with root package name */
    public android.app.ProgressDialog f160268p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f160269q;

    /* renamed from: f, reason: collision with root package name */
    public boolean f160261f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f160262g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f160263h = false;

    /* renamed from: m, reason: collision with root package name */
    public long f160265m = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f160266n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f160267o = false;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f160270r = null;

    /* renamed from: s, reason: collision with root package name */
    public final un4.f f160271s = new com.tencent.mm.plugin.setting.ui.setting.k5(this);

    /* renamed from: t, reason: collision with root package name */
    public boolean f160272t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f160273u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f160274v = false;

    public static void V6(com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI settingsAboutMicroMsgUI) {
        settingsAboutMicroMsgUI.getClass();
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting.y5 y5Var = new com.tencent.mm.plugin.setting.ui.setting.y5(settingsAboutMicroMsgUI);
        settingsAboutMicroMsgUI.f160270r = y5Var;
        d17.a(255, y5Var);
        com.tencent.mm.modelsimple.w0 w0Var = new com.tencent.mm.modelsimple.w0(2);
        w0Var.f71444f = 1;
        gm0.j1.d().g(w0Var);
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.setting.ui.setting.z5(settingsAboutMicroMsgUI, w0Var), false);
        settingsAboutMicroMsgUI.f160269q = b4Var;
        b4Var.c(3000L, 3000L);
        settingsAboutMicroMsgUI.f160268p = db5.e1.Q(settingsAboutMicroMsgUI.getContext(), settingsAboutMicroMsgUI.getString(com.tencent.mm.R.string.f490573yv), settingsAboutMicroMsgUI.getString(com.tencent.mm.R.string.lbd), true, false, new com.tencent.mm.plugin.setting.ui.setting.a6(settingsAboutMicroMsgUI, w0Var));
    }

    public static void W6(com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI settingsAboutMicroMsgUI) {
        settingsAboutMicroMsgUI.getClass();
        com.tencent.mm.sdk.platformtools.c3.b("welcome_page_show");
        gm0.k2.a(settingsAboutMicroMsgUI, true);
        ((com.tencent.mm.app.o7) f14.g.a()).getClass();
        com.tencent.mm.ui.vb.e();
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).g();
        k35.o oVar = k35.p.f303943a;
        androidx.appcompat.app.AppCompatActivity context = settingsAboutMicroMsgUI.getContext();
        ((bt.b1) oVar).getClass();
        com.tencent.mm.ui.vb.c(context);
        settingsAboutMicroMsgUI.finish();
    }

    public final void X6(boolean z17) {
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        this.f160259d = preferenceScreen;
        ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).t();
        ((com.tencent.mm.ui.base.preference.h0) this.f160259d).g(com.tencent.mm.R.xml.f494933c1);
        com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMMHeaderPreference settingsAboutMMHeaderPreference = (com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMMHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160259d).h("settings_about_mm_header");
        int i17 = o45.wf.f343029g;
        java.lang.String a17 = (i17 < 671088896 || i17 > 671089151) ? com.tencent.mm.sdk.platformtools.a0.a(getContext(), o45.wf.f343029g) : "8.0.1";
        if (o45.wf.f343033k) {
            a17 = a17 + " " + j65.v.b(this);
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        settingsAboutMMHeaderPreference.L = a17;
        if (com.tencent.mm.sdk.platformtools.m2.m()) {
            com.tencent.mm.plugin.newtips.NormalIconNewTipPreference normalIconNewTipPreference = (com.tencent.mm.plugin.newtips.NormalIconNewTipPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160259d).h("settings_update");
            rn3.i.Di().k(normalIconNewTipPreference);
            normalIconNewTipPreference.n0(this.f160259d);
            normalIconNewTipPreference.h0();
            if (!normalIconNewTipPreference.o0(false)) {
                normalIconNewTipPreference.a0(8);
                normalIconNewTipPreference.V = "";
                normalIconNewTipPreference.W = -1;
            }
        }
        rn3.i.Di().k((com.tencent.mm.plugin.setting.ui.widget.PrivacyUpdatePreference) ((com.tencent.mm.ui.base.preference.h0) this.f160259d).h("privacy_update"));
        if (z17) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160259d).w("funtion_update");
        } else if (((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).nj()) {
            com.tencent.mm.ui.base.preference.IconPreference iconPreference = (com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160259d).h("funtion_check_update");
            android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
            kotlin.jvm.internal.o.f(sharedPreferences, "getSharedPreferences(...)");
            java.lang.String a18 = com.tencent.mm.sdk.platformtools.a0.a(null, sharedPreferences.getInt("KeyTinkerPatchVersion", 0));
            android.content.SharedPreferences sharedPreferences2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
            kotlin.jvm.internal.o.f(sharedPreferences2, "getSharedPreferences(...)");
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAboutMicroMsgUI", "updateUpdate，versionTmp = %s, version = %s， UpdaterConfig.INSTANCE.getUpdaterSharePreference().getInt(ConstantsUpdater.KeyTinkerPatchVersion, 0) = %s, ConstantsProtocal.CLIENT_VERSION = %s", a18, a17, java.lang.Integer.valueOf(sharedPreferences2.getInt("KeyTinkerPatchVersion", 0)), java.lang.Integer.valueOf(o45.wf.f343029g));
            if (com.tencent.mm.sdk.platformtools.t8.K0(a18) || com.tencent.mm.sdk.platformtools.t8.K0(a17) || a18.equals(a17) || a18.equals(androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN)) {
                iconPreference.H("");
            } else {
                oq1.n nVar = this.f160264i;
                if (nVar == null || ((com.tencent.mm.plugin.hp.util.TinkerSyncResponse) nVar).e() != 2) {
                    iconPreference.H(a18);
                } else {
                    iconPreference.H("");
                }
            }
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_update_patch_force_noshow_new_flag, 0) == 1) {
                iconPreference.a0(8);
                iconPreference.H("");
            } else {
                oq1.n nVar2 = this.f160264i;
                if (nVar2 == null || ((com.tencent.mm.plugin.hp.util.TinkerSyncResponse) nVar2).e() != 2) {
                    iconPreference.a0(0);
                    iconPreference.V = getString(com.tencent.mm.R.string.f490501wv);
                    iconPreference.W = com.tencent.mm.R.drawable.asx;
                } else {
                    iconPreference.a0(8);
                }
            }
            oq1.n nVar3 = this.f160264i;
            if (nVar3 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAboutMicroMsgUI", "updateUpdate response= %s", nVar3);
            }
            ((com.tencent.mm.ui.base.preference.h0) this.f160259d).w("funtion_update");
        } else if (((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).oj()) {
            com.tencent.mm.ui.base.preference.IconSummaryPreference iconSummaryPreference = (com.tencent.mm.ui.base.preference.IconSummaryPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160259d).h("funtion_update");
            ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).getClass();
            android.content.SharedPreferences sharedPreferences3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
            kotlin.jvm.internal.o.f(sharedPreferences3, "getSharedPreferences(...)");
            if (sharedPreferences3.getInt("RedDotCheckUpdateTab", 0) == 1) {
                iconSummaryPreference.N = 0;
                iconSummaryPreference.L = getString(com.tencent.mm.R.string.f490501wv);
                iconSummaryPreference.M = com.tencent.mm.R.drawable.asx;
                iconSummaryPreference.S = 0;
                android.widget.TextView textView = iconSummaryPreference.W;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            }
            ((com.tencent.mm.ui.base.preference.h0) this.f160259d).w("funtion_check_update");
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f160259d).w("funtion_update");
        }
        if (!com.tencent.mm.sdk.platformtools.m2.m()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160259d).m("settings_report", true);
        }
        k35.p.f303943a.getClass();
        ((com.tencent.mm.ui.base.preference.h0) this.f160259d).m("funtion_about_wechat", true);
        if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CROWDTEST_APPLY_LINK_STRING, null))) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160259d).w("funtion_crowdtest_update");
        } else {
            com.tencent.mm.ui.base.preference.IconPreference iconPreference2 = (com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160259d).h("funtion_crowdtest_update");
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            if (bk0.a.g().b(262157, 266263)) {
                iconPreference2.c0(0);
            }
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        ((com.tencent.mm.ui.base.preference.h0) this.f160259d).m("funtion_about_flavor_blue", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f160259d).m("funtion_invite_flavor_blue", true);
        if (com.tencent.mm.sdk.platformtools.f9.MeSetAboutIntros.h()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160259d).w("settings_update");
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f160259d).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public android.view.View getBottomView() {
        android.widget.LinearLayout linearLayout;
        java.lang.String str;
        int i17;
        int i18;
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.ckz, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) linearLayout2.findViewById(com.tencent.mm.R.id.o2s);
        android.widget.TextView textView2 = (android.widget.TextView) linearLayout2.findViewById(com.tencent.mm.R.id.o2q);
        android.widget.TextView textView3 = (android.widget.TextView) linearLayout2.findViewById(com.tencent.mm.R.id.o2r);
        android.widget.TextView textView4 = (android.widget.TextView) linearLayout2.findViewById(com.tencent.mm.R.id.h1s);
        android.widget.TextView textView5 = (android.widget.TextView) linearLayout2.findViewById(com.tencent.mm.R.id.a_w);
        android.widget.TextView textView6 = (android.widget.TextView) linearLayout2.findViewById(com.tencent.mm.R.id.f482793a22);
        android.widget.TextView textView7 = (android.widget.TextView) linearLayout2.findViewById(com.tencent.mm.R.id.o2p);
        android.widget.TextView textView8 = (android.widget.TextView) linearLayout2.findViewById(com.tencent.mm.R.id.cj8);
        float f17 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479930ja) * i65.a.m(getContext());
        textView.setTextSize(0, f17);
        textView2.setTextSize(0, f17);
        textView3.setTextSize(0, f17);
        textView4.setTextSize(0, f17);
        textView5.setTextSize(0, f17);
        textView6.setTextSize(0, f17);
        textView7.setTextSize(0, f17);
        textView8.setTextSize(0, f17);
        java.lang.String obj = gm0.j1.u().c().l(274436, "").toString();
        if (com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
            obj = com.tencent.mm.sdk.platformtools.m2.e();
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(obj) && !com.tencent.mm.sdk.platformtools.t8.x0(obj)) {
            obj = "";
        }
        if (obj.equalsIgnoreCase("cn")) {
            textView3.setVisibility(0);
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_about_mm_kf_phone_num_config, 1);
            if (Ni == 1) {
                i17 = 0;
                this.f160272t = true;
                this.f160273u = false;
                this.f160274v = false;
            } else if (Ni == 2) {
                i17 = 0;
                this.f160272t = true;
                this.f160273u = true;
                this.f160274v = false;
            } else if (Ni != 3) {
                i17 = 0;
                this.f160272t = false;
                this.f160273u = false;
                this.f160274v = false;
            } else {
                i17 = 0;
                this.f160272t = true;
                this.f160273u = true;
                this.f160274v = true;
            }
            if (this.f160272t) {
                textView4.setVisibility(i17);
                textView4.setText(com.tencent.mm.R.string.fyz);
                if (this.f160273u || this.f160274v) {
                    android.text.SpannableString spannableString = new android.text.SpannableString(textView4.getText());
                    linearLayout = linearLayout2;
                    str = "";
                    i18 = 0;
                    spannableString.setSpan(new com.tencent.mm.plugin.setting.ui.setting.l5(this, 1, null), 0, getString(com.tencent.mm.R.string.fyz).length(), 17);
                    textView4.setText(spannableString);
                    ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                    com.tencent.mm.pluginsdk.ui.span.c0.g(textView4, spannableString);
                } else {
                    linearLayout = linearLayout2;
                    str = "";
                    i18 = 0;
                }
            } else {
                linearLayout = linearLayout2;
                str = "";
                i18 = i17;
            }
            textView5.setVisibility(i18);
            textView6.setVisibility(i18);
            textView5.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.o5(this));
            textView5.setOnLongClickListener(new com.tencent.mm.plugin.setting.ui.setting.p5(this));
            textView6.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.q5(this));
        } else {
            linearLayout = linearLayout2;
            str = "";
        }
        java.lang.String string = getString(com.tencent.mm.R.string.gbc, com.tencent.mm.sdk.platformtools.m2.d(), obj, "setting", 0, 0);
        java.lang.String string2 = getString(com.tencent.mm.R.string.gba, "aboutpage", obj);
        java.lang.String string3 = getString(com.tencent.mm.R.string.k4f, com.tencent.mm.sdk.platformtools.m2.d(), obj);
        java.lang.String string4 = getString(com.tencent.mm.R.string.gb6, com.tencent.mm.sdk.platformtools.m2.d(), obj);
        textView.setText(java.lang.String.format("<a href='%s'>%s</a>", string3, getString(com.tencent.mm.R.string.gb8)));
        textView2.setText(java.lang.String.format("<a href='%s'>%s</a>", string, getString(com.tencent.mm.R.string.hln)));
        textView3.setText(java.lang.String.format("<a href='%s'>%s</a>", string2, getString(com.tencent.mm.R.string.hlo)));
        textView7.setText(java.lang.String.format("<a href='%s'>%s</a>", string4, getString(com.tencent.mm.R.string.f492391gb5)));
        textView5.setText(com.tencent.mm.R.string.csd);
        textView6.setText(com.tencent.mm.R.string.b5o);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).oj(textView, 1);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).oj(textView2, 1);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).oj(textView7, 1);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).oj(textView3, 1);
        if (obj.equalsIgnoreCase("KR")) {
            textView7.setVisibility(0);
        }
        if (pg5.d.f354252a != null) {
            com.tencent.mm.smiley.x1.Di().getClass();
            android.text.InputFilter[] filters = textView8.getFilters();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (android.text.InputFilter inputFilter : filters) {
                if (!(inputFilter instanceof kg5.a)) {
                    arrayList.add(inputFilter);
                }
            }
            textView8.setFilters((android.text.InputFilter[]) arrayList.toArray(new android.text.InputFilter[0]));
        }
        int i19 = 2022;
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.sdk.platformtools.z.f193107c) && !com.tencent.mm.sdk.platformtools.z.f193107c.equals("null")) {
                java.util.Date parse = new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS).parse(com.tencent.mm.sdk.platformtools.z.f193107c);
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                calendar.setTime(parse);
                i19 = calendar.get(1);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SettingsAboutMicroMsgUI", e17, str, new java.lang.Object[0]);
        }
        textView8.setText(linearLayout.getResources().getString(com.tencent.mm.R.string.f490362su, java.lang.Integer.valueOf(i19)));
        return linearLayout;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494933c1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
        setNavigationbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
        setBackGroundColorResource(com.tencent.mm.R.color.aaw);
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.r5(this));
        if (getListView() != null) {
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
            getListView().setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            getListView().setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
        }
        if (((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).nj()) {
            this.f160261f = true;
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        hideActionbarLine();
        initView();
        gm0.j1.d().a(3899, this);
        un4.e eVar = (un4.e) i95.n0.c(un4.e.class);
        ((tn4.o) eVar).f420841g.add(this.f160271s);
        java.lang.String Ui = ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).Ui(2);
        this.f160260e = Ui;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(Ui)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1429L, 32L, 1L, false);
        }
        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).Ni(false, true, true);
        if (getIntent().getBooleanExtra("mmdiff_udpate_maunal_cgi", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAboutMicroMsgUI", "start. manualCheckUpdate");
            ((un4.e) i95.n0.c(un4.e.class)).getClass();
            ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).qj(0, this);
        }
        X6(true);
        this.f160265m = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAboutMicroMsgUI", "");
        ((un4.e) i95.n0.c(un4.e.class)).getClass();
        java.lang.String hj6 = ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).hj();
        java.lang.String ij6 = ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).ij();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAboutMicroMsgUI", "NetSceneManualCheckWxUpdate，basePatchId = %s, tinkerPatchId = %s.", hj6, ij6);
        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).getClass();
        java.util.LinkedList c17 = z73.h.c();
        java.util.Iterator it = c17.iterator();
        while (it.hasNext()) {
            r45.e35 e35Var = (r45.e35) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAboutMicroMsgUI", "NetSceneManualCheckWxUpdate，item.key = %s, item.value = %s, item.op = %s, item.values = %s.", e35Var.f372968d, e35Var.f372969e, e35Var.f372970f, e35Var.f372971g);
        }
        ((qf0.q) ((rf0.o) i95.n0.c(rf0.o.class))).getClass();
        gm0.j1.d().g(new wn4.y(hj6, ij6, c17, 4));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        un4.e eVar = (un4.e) i95.n0.c(un4.e.class);
        ((tn4.o) eVar).f420841g.remove(this.f160271s);
        gm0.j1.d().q(3899, this);
        if (this.f160263h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAboutMicroMsgUI", "clear red dot for maunal when it has clicked.");
            ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).cj(true);
        }
        ((com.tencent.mm.plugin.setting.ui.widget.PrivacyUpdatePreference) ((com.tencent.mm.ui.base.preference.h0) this.f160259d).h("privacy_update")).getClass();
        if (com.tencent.mm.plugin.setting.ui.widget.PrivacyUpdatePreference.R) {
            com.tencent.mm.plugin.setting.ui.widget.PrivacyUpdatePreference.R = false;
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, na5.b
    public void onPageEnterAnimEnd() {
        if (this.f160266n) {
            X6(false);
        } else {
            this.f160266n = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0410  */
    @Override // com.tencent.mm.ui.base.preference.MMPreference
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r r27, com.tencent.mm.ui.base.preference.Preference r28) {
        /*
            Method dump skipped, instructions count: 1601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI.onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r, com.tencent.mm.ui.base.preference.Preference):boolean");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f160267o) {
            X6(false);
        } else {
            this.f160267o = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01fe  */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r12, int r13, java.lang.String r14, com.tencent.mm.modelbase.m1 r15) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public java.lang.Boolean showBottomMask() {
        return java.lang.Boolean.TRUE;
    }
}
