package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ArtistUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f166201r = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.y f166202d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f166203e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.ArtistHeader f166204f;

    /* renamed from: i, reason: collision with root package name */
    public android.content.SharedPreferences f166207i;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f166205g = "";

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f166206h = null;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f166208m = com.tencent.mm.plugin.sns.model.l4.Tj();

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.model.i1 f166209n = com.tencent.mm.plugin.sns.model.l4.hj();

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.model.m0 f166210o = com.tencent.mm.plugin.sns.model.l4.Cj();

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f166211p = new com.tencent.mm.plugin.sns.ui.l0(this);

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Runnable f166212q = new com.tencent.mm.plugin.sns.ui.m0(this);

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.y T6(com.tencent.mm.plugin.sns.ui.ArtistUI artistUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        com.tencent.mm.plugin.sns.ui.y yVar = artistUI.f166202d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        return yVar;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.ArtistHeader U6(com.tencent.mm.plugin.sns.ui.ArtistUI artistUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        com.tencent.mm.plugin.sns.ui.ArtistHeader artistHeader = artistUI.f166204f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        return artistHeader;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        return com.tencent.mm.R.layout.cqs;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        setMMTitle(com.tencent.mm.R.string.iyk);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.a5o));
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.a5o));
        this.f166203e = (android.widget.ListView) findViewById(com.tencent.mm.R.id.n6m);
        this.f166206h = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490469vy), true, true, new com.tencent.mm.plugin.sns.ui.n0(this));
        this.f166202d = new com.tencent.mm.plugin.sns.ui.y(this, this.f166205g, new com.tencent.mm.plugin.sns.ui.o0(this), new com.tencent.mm.plugin.sns.ui.p0(this));
        this.f166203e.setOnScrollListener(new com.tencent.mm.plugin.sns.ui.q0(this));
        com.tencent.mm.plugin.sns.ui.ArtistHeader artistHeader = new com.tencent.mm.plugin.sns.ui.ArtistHeader(this);
        this.f166204f = artistHeader;
        this.f166203e.addHeaderView(artistHeader);
        this.f166203e.setAdapter((android.widget.ListAdapter) this.f166202d);
        this.f166202d.notifyDataSetChanged();
        this.f166204f.setVisibility(8);
        setBackBtn(new com.tencent.mm.plugin.sns.ui.r0(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.ArtistUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        super.onCreate(bundle);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("filterLan", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        java.lang.String o17 = com.tencent.mm.sdk.platformtools.m2.o(getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), this);
        if (o17.equals("zh_CN") || o17.equals("en") || o17.equals("zh_TW")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("filterLan", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        } else {
            o17 = o17.equals("zh_HK") ? "zh_TW" : "en";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("filterLan", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        }
        this.f166205g = o17;
        gm0.j1.i();
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX, this);
        this.f166207i = getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0);
        initView();
        com.tencent.mm.plugin.sns.ui.ArtistHeader artistHeader = this.f166204f;
        artistHeader.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttach", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        com.tencent.mm.plugin.sns.model.l4.Cj().c(artistHeader);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttach", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.ArtistUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        super.onDestroy();
        if (this.f166206h != null) {
            this.f166206h = null;
        }
        com.tencent.mm.plugin.sns.ui.ArtistHeader artistHeader = this.f166204f;
        if (artistHeader != null) {
            artistHeader.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetch", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            com.tencent.mm.plugin.sns.model.l4.Cj().v(artistHeader);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetch", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        }
        com.tencent.mm.plugin.sns.model.l4.hj().N(this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.ArtistUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        super.onPause();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.ArtistUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        super.onResume();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.ArtistUI");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        com.tencent.mm.plugin.sns.ui.y yVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        if (!(m1Var instanceof com.tencent.mm.modelbase.q1) || ((com.tencent.mm.modelbase.q1) m1Var).u() != 4) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.ArtistUI");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ArtistUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " type = " + m1Var.getType() + " @" + hashCode());
        if (i17 == 0 && i18 == 0) {
            if (m1Var.getType() == 159 && (yVar = this.f166202d) != null) {
                yVar.a();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.ArtistUI");
            return;
        }
        if (m1Var.getType() == 159 && (u3Var = this.f166206h) != null) {
            u3Var.dismiss();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.ArtistUI");
    }
}
