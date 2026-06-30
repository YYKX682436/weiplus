package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class SightUploadUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f166633v = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.SnsEditText f166634d;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f166636f;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter f166638h;

    /* renamed from: p, reason: collision with root package name */
    public java.util.ArrayList f166643p;

    /* renamed from: u, reason: collision with root package name */
    public android.util.DisplayMetrics f166648u;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.z4 f166635e = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f166637g = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f166639i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f166640m = "";

    /* renamed from: n, reason: collision with root package name */
    public int f166641n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f166642o = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f166644q = false;

    /* renamed from: r, reason: collision with root package name */
    public int f166645r = 0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f166646s = false;

    /* renamed from: t, reason: collision with root package name */
    public long f166647t = 0;

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsEditText T6(com.tencent.mm.plugin.sns.ui.SightUploadUI sightUploadUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        com.tencent.mm.plugin.sns.ui.SnsEditText snsEditText = sightUploadUI.f166634d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        return snsEditText;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        return com.tencent.mm.R.layout.ctl;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        com.tencent.mm.plugin.sns.ui.SnsEditText snsEditText = (com.tencent.mm.plugin.sns.ui.SnsEditText) findViewById(com.tencent.mm.R.id.n7y);
        this.f166634d = snsEditText;
        snsEditText.getInputExtras(true).putInt("wechat_scene", 3);
        this.f166634d.getInputExtras(true).putBoolean("if_support_wx_emoji", true);
        this.f166634d.postDelayed(new com.tencent.mm.plugin.sns.ui.o8(this, this.f166648u.widthPixels - (this.f166634d.getPaddingLeft() + this.f166636f.getPaddingRight())), 100L);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(getIntent().getStringExtra("Kdescription"))) {
            this.f166634d.setText(getIntent().getStringExtra("Kdescription"));
        }
        this.f166634d.setBackListener(new com.tencent.mm.plugin.sns.ui.p8(this));
        com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter snsSightUploadSayFooter = (com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter) findViewById(com.tencent.mm.R.id.m9x);
        this.f166638h = snsSightUploadSayFooter;
        snsSightUploadSayFooter.setMMEditText(this.f166634d);
        this.f166638h.setVisibility(0);
        setBackBtn(new com.tencent.mm.plugin.sns.ui.q8(this));
        if (getIntent().getBooleanExtra("KSightDraftEntrance", true)) {
            addIconOptionMenu(1, com.tencent.mm.R.raw.sight_draft_menu, new com.tencent.mm.plugin.sns.ui.s8(this));
        }
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490551ya), new com.tencent.mm.plugin.sns.ui.u8(this), null, com.tencent.mm.ui.fb.BLACK);
        enableOptionMenu(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
            return;
        }
        if (i17 == 6 || i17 == 5 || i17 == 10) {
            com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter snsSightUploadSayFooter = this.f166638h;
            snsSightUploadSayFooter.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
            if (intent == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
            } else {
                if (i17 == 10) {
                    snsSightUploadSayFooter.f167394s.d(i17, i18, intent);
                } else if (i17 == 5) {
                    snsSightUploadSayFooter.f167393r.b(i17, i18, intent, null);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
            }
        }
        if (i17 == 5) {
            if (intent == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
                return;
            }
            int intExtra = intent.getIntExtra("Ktag_range_index", 0);
            if (intExtra >= 2) {
                this.f166639i = intent.getStringExtra("Klabel_name_list");
                this.f166640m = intent.getStringExtra("Kother_user_name_list");
                java.util.List asList = java.util.Arrays.asList(this.f166639i.split(","));
                java.util.List<java.lang.String> asList2 = com.tencent.mm.sdk.platformtools.t8.K0(this.f166640m) ? null : java.util.Arrays.asList(this.f166640m.split(","));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContactNamesFromLabelsAndOtherUserName", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
                this.f166643p = new java.util.ArrayList();
                if (asList != null && asList.size() > 0) {
                    java.util.Iterator it = asList.iterator();
                    while (it.hasNext()) {
                        java.util.List<java.lang.String> j17 = ((b93.b) c93.a.a()).j(((b93.b) c93.a.a()).e((java.lang.String) it.next()));
                        if (j17 == null || j17.size() == 0) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.SightUploadUI", "dz: getContactNamesFromLabels,namelist get bu label is null");
                            break;
                        }
                        for (java.lang.String str : j17) {
                            if (!this.f166643p.contains(str)) {
                                this.f166643p.add(str);
                            }
                        }
                    }
                }
                if (asList != null) {
                    java.util.Iterator it6 = asList.iterator();
                    int i19 = 0;
                    while (it6.hasNext()) {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) it6.next())) {
                            i19++;
                        }
                    }
                    this.f166641n = i19;
                }
                this.f166642o = 0;
                if (asList2 != null && asList2.size() > 0) {
                    for (java.lang.String str2 : asList2) {
                        if (!this.f166643p.contains(str2)) {
                            this.f166643p.add(str2);
                            this.f166642o++;
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContactNamesFromLabelsAndOtherUserName", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
                if (intExtra == 2) {
                    this.f166644q = false;
                } else {
                    this.f166644q = true;
                }
            }
            if (1 == intExtra) {
                this.f166645r = 1;
            } else {
                this.f166645r = 0;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        o25.n1.f(this);
        super.onCreate(bundle);
        this.f166648u = getResources().getDisplayMetrics();
        com.tencent.mm.plugin.sns.ui.j9 j9Var = new com.tencent.mm.plugin.sns.ui.j9(this);
        this.f166635e = j9Var;
        j9Var.i(bundle);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.pm_);
        this.f166636f = linearLayout;
        linearLayout.addView(this.f166635e.b());
        setMMTitle(com.tencent.mm.R.string.jg9);
        getSupportActionBar().w(getResources().getDrawable(com.tencent.mm.R.color.f478712f3));
        this.f166646s = getIntent().getBooleanExtra("KSnsPostManu", false);
        this.f166647t = getIntent().getLongExtra("KTouchCameraTime", 0L);
        initView();
        o25.n1.c(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        super.onDestroy();
        ((com.tencent.mm.plugin.sns.ui.j9) this.f166635e).e();
        com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter snsSightUploadSayFooter = this.f166638h;
        snsSightUploadSayFooter.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        com.tencent.mm.plugin.sns.ui.SightLocationWidget sightLocationWidget = snsSightUploadSayFooter.f167394s;
        sightLocationWidget.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        i11.e eVar = sightLocationWidget.E;
        if (eVar != null) {
            ((i11.h) eVar).m(sightLocationWidget.H);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter snsSightUploadSayFooter2 = this.f166638h;
        snsSightUploadSayFooter2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = snsSightUploadSayFooter2.f167390o;
        if (chatFooterPanel != null) {
            chatFooterPanel.l();
            snsSightUploadSayFooter2.f167390o.a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        super.onPause();
        hideVKB();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        super.onResume();
        com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter snsSightUploadSayFooter = this.f166638h;
        snsSightUploadSayFooter.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        if (snsSightUploadSayFooter.f167390o.getVisibility() == 8) {
            snsSightUploadSayFooter.f167389n.showVKB();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
    }
}
