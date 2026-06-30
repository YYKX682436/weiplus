package com.tencent.mm.plugin.masssend.ui;

/* loaded from: classes12.dex */
public class MassSendHistoryUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.sdk.platformtools.q7, com.tencent.mm.modelbase.x0, com.tencent.mm.modelbase.y0 {

    /* renamed from: q, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.SensorController f148525q;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.masssend.ui.MassSendHistoryListView f148526d;

    /* renamed from: f, reason: collision with root package name */
    public kf3.k0 f148528f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMPullDownView f148529g;

    /* renamed from: h, reason: collision with root package name */
    public sl.j f148530h;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f148532m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f148533n;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f148527e = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f148531i = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f148534o = false;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemLongClickListener f148535p = new kf3.o0(this);

    public final boolean T6(java.lang.String str) {
        iz5.a.g(null, str != null);
        f148525q.b(this);
        if3.y n07 = if3.k0.Ai().n0(str);
        if (!c01.d9.b().E() && !com.tencent.mm.sdk.platformtools.t8.K0(n07.d())) {
            db5.t7.k(this, null);
            return false;
        }
        if (this.f148530h == null) {
            this.f148530h = new sl.j(this, 0);
        }
        this.f148530h.h(false);
        if (!this.f148530h.g(n07.d(), this.f148531i, false, -1)) {
            dp.a.makeText(this, getString(com.tencent.mm.R.string.b58), 0).show();
            return false;
        }
        ym1.f.Ai("music").A(this.f148531i);
        sl.j jVar = this.f148530h;
        jVar.f409043p = this;
        jVar.f409042o = this;
        return true;
    }

    public final void U6() {
        f148525q.a();
        this.f148530h.h(false);
        kf3.k0 k0Var = this.f148528f;
        k0Var.f307378q = "";
        k0Var.notifyDataSetChanged();
        this.f148526d.setKeepScreenOn(false);
    }

    @Override // com.tencent.mm.modelbase.y0
    public void a() {
        U6();
    }

    @Override // com.tencent.mm.sdk.platformtools.q7
    public void f1(boolean z17) {
        sl.j jVar = this.f148530h;
        if (jVar == null) {
            return;
        }
        if (!jVar.c()) {
            this.f148530h.f(true);
            ym1.f.Ai("music").A(true);
            this.f148531i = true;
            return;
        }
        this.f148530h.f(z17);
        ym1.f.Ai("music").A(z17);
        this.f148531i = z17;
        if (z17) {
            return;
        }
        if (T6(this.f148528f.f307378q)) {
            kf3.k0 k0Var = this.f148528f;
            k0Var.f307378q = k0Var.f307378q;
            k0Var.notifyDataSetChanged();
        } else {
            kf3.k0 k0Var2 = this.f148528f;
            k0Var2.f307378q = "";
            k0Var2.notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bwz;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        getIntent().getBooleanExtra("finish_direct", false);
        this.f148533n = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.jcw);
        com.tencent.mm.plugin.masssend.ui.MassSendHistoryListView massSendHistoryListView = (com.tencent.mm.plugin.masssend.ui.MassSendHistoryListView) findViewById(com.tencent.mm.R.id.jcf);
        this.f148526d = massSendHistoryListView;
        massSendHistoryListView.setTranscriptMode(0);
        com.tencent.mm.ui.base.MMPullDownView mMPullDownView = (com.tencent.mm.ui.base.MMPullDownView) findViewById(com.tencent.mm.R.id.jcg);
        this.f148529g = mMPullDownView;
        mMPullDownView.setOnTopLoadDataListener(new kf3.v0(this));
        this.f148529g.setTopViewVisible(true);
        this.f148529g.setAtBottomCallBack(new kf3.w0(this));
        this.f148529g.setAtTopCallBack(new kf3.x0(this));
        this.f148529g.setIsBottomShowAll(true);
        kf3.k0 k0Var = new kf3.k0(this, this.f148527e);
        this.f148528f = k0Var;
        k0Var.f212611h = new kf3.y0(this);
        this.f148532m = findViewById(com.tencent.mm.R.id.jce);
        this.f148526d.setAdapter((android.widget.ListAdapter) this.f148528f);
        this.f148526d.setOnTouchListener(new kf3.z0(this));
        this.f148526d.setOnItemLongClickListener(this.f148535p);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jcv);
        if (textView != null) {
            com.tencent.mm.ui.bk.s0(textView.getPaint());
        }
        this.f148533n.setOnClickListener(new kf3.a1(this));
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.jcx)).setOnClickListener(new kf3.b1(this));
        setBackBtn(new kf3.m0(this));
        addIconOptionMenu(0, com.tencent.mm.R.string.f490555ye, com.tencent.mm.R.raw.actionbar_setting_icon, new kf3.n0(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.MassSendHistoryUI", "onActivityResult requestCode:%s", java.lang.Integer.valueOf(i17));
        if (i17 == 1) {
            this.f148534o = true;
        }
    }

    @Override // com.tencent.mm.modelbase.x0
    public void onCompletion() {
        U6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.gt9);
        this.f148534o = true;
        if (f148525q == null) {
            f148525q = new com.tencent.mm.sdk.platformtools.SensorController(getApplicationContext());
        }
        this.f148527e = getIntent().getStringExtra("INTENT_POSITION_MASS_INFO");
        com.tencent.mars.xlog.Log.i("MicroMsg.MassSendHistoryUI", "getIntent enterHighLightMsgId:" + this.f148527e);
        initView();
        sl.j jVar = new sl.j(this, 0);
        this.f148530h = jVar;
        jVar.f409043p = this;
        jVar.f409042o = this;
        this.f148528f.f307382u = new kf3.u0(this);
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar != null) {
            gaVar.f208643f0 = 3;
            gaVar.f208647h0 = false;
        }
        this.f148526d.postDelayed(new kf3.t0(this), 200L);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        java.lang.String[] split = ((if3.y) this.f148528f.getItem(adapterContextMenuInfo.position)).e().split(";");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.String str : split) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
            if (n17 != null) {
                sb6.append(n17.g2() + ";");
            }
        }
        contextMenu.setHeaderTitle(sb6.toString());
        contextMenu.add(adapterContextMenuInfo.position, 1, 0, getString(com.tencent.mm.R.string.b3p));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        U6();
        sl.j jVar = this.f148530h;
        if (jVar != null) {
            jVar.f409043p = null;
            jVar.f409042o = null;
            jVar.i();
            this.f148530h = null;
        }
        this.f148528f.c();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if3.k0.Ai().remove(this.f148528f);
        f148525q.a();
        sl.j jVar = this.f148530h;
        if (jVar != null && jVar.c()) {
            U6();
        }
        this.f148534o = false;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if3.k0.Ai().add(this.f148528f);
        this.f148528f.f();
        if (this.f148534o) {
            this.f148526d.setSelection(this.f148528f.getCount() - 1);
        }
    }
}
