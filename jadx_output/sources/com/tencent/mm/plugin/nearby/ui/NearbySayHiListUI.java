package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes11.dex */
public class NearbySayHiListUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.nearby.ui.n1 f152111e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f152112f;

    /* renamed from: o, reason: collision with root package name */
    public an3.f f152118o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f152119p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f152120q;

    /* renamed from: r, reason: collision with root package name */
    public long f152121r;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.storage.u8 f152110d = null;

    /* renamed from: g, reason: collision with root package name */
    public int f152113g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f152114h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f152115i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f152116m = 0;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f152117n = null;

    /* renamed from: s, reason: collision with root package name */
    public final db5.t4 f152122s = new com.tencent.mm.plugin.nearby.ui.x0(this);

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bps;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        int i17;
        this.f152112f = (android.widget.ListView) findViewById(com.tencent.mm.R.id.m_0);
        if (!m25.a.c()) {
            android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.chj, (android.view.ViewGroup) null);
            inflate.setOnClickListener(new com.tencent.mm.plugin.nearby.ui.z0(this, inflate));
            int i18 = this.f152114h;
            if (i18 > 0 && this.f152113g < i18) {
                this.f152112f.addFooterView(inflate);
            }
        }
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490353sl), new com.tencent.mm.plugin.nearby.ui.c1(this));
        if (this.f152114h == 0) {
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dfo);
            textView.setText(com.tencent.mm.R.string.i8k);
            textView.setVisibility(0);
            enableOptionMenu(false);
        }
        if (this.f152120q && (i17 = this.f152116m) != 0 && this.f152115i >= i17 && com.tencent.mm.sdk.platformtools.t8.P0(this)) {
            com.tencent.mm.plugin.nearby.ui.CleanLocationHeaderView cleanLocationHeaderView = new com.tencent.mm.plugin.nearby.ui.CleanLocationHeaderView(this);
            this.f152119p = cleanLocationHeaderView;
            cleanLocationHeaderView.setOnClickListener(new com.tencent.mm.plugin.nearby.ui.e1(this));
            this.f152112f.addHeaderView(this.f152119p);
        }
        com.tencent.mm.plugin.nearby.ui.n1 n1Var = new com.tencent.mm.plugin.nearby.ui.n1(this, this, this.f152110d, this.f152113g);
        this.f152111e = n1Var;
        n1Var.f152190s = new com.tencent.mm.plugin.nearby.ui.f1(this);
        n1Var.f152189r = new com.tencent.mm.plugin.nearby.ui.g1(this);
        n1Var.f152191t = new com.tencent.mm.plugin.nearby.ui.h1(this);
        this.f152112f.setAdapter((android.widget.ListAdapter) n1Var);
        this.f152112f.setOnItemLongClickListener(new com.tencent.mm.plugin.nearby.ui.i1(this, new com.tencent.mm.ui.tools.s6(this)));
        this.f152112f.setOnItemClickListener(new com.tencent.mm.plugin.nearby.ui.j1(this));
        setBackBtn(new com.tencent.mm.plugin.nearby.ui.k1(this));
        setToTop(new com.tencent.mm.plugin.nearby.ui.w0(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        setResult(0);
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f152116m = com.tencent.mm.sdk.platformtools.t8.D1(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ThresholdToCleanLocation"), 0);
        this.f152120q = getIntent().getBooleanExtra("show_clear_header", false);
        gm0.j1.b().c();
        this.f152110d = (com.tencent.mm.storage.u8) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi();
        setMMTitle(com.tencent.mm.R.string.i8h);
        this.f152115i = this.f152110d.f();
        this.f152114h = this.f152110d.getCount();
        if (m25.a.c()) {
            this.f152113g = this.f152114h;
        } else {
            int i17 = this.f152115i;
            if (i17 == 0) {
                i17 = 8;
            }
            this.f152113g = i17;
        }
        com.tencent.mm.storage.u8 u8Var = this.f152110d;
        u8Var.getClass();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("status", (java.lang.Integer) 4);
        if (u8Var.f196265d.p(u8Var.getTableName(), contentValues, "status!=? ", new java.lang.String[]{"4"}) != 0) {
            u8Var.doNotify();
        }
        initView();
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        com.tencent.mm.storage.t8 t8Var = (com.tencent.mm.storage.t8) this.f152111e.getItem(adapterContextMenuInfo.position);
        if (t8Var != null) {
            contextMenu.add(0, 0, 0, com.tencent.mm.R.string.f490367t0);
            this.f152121r = t8Var.field_svrid;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SayHiListUI", "onItemLongClick, item is null, pos = " + adapterContextMenuInfo.position);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f152111e.c();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        gm0.j1.d().q(148, this);
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f152114h != this.f152110d.getCount()) {
            int count = this.f152110d.getCount();
            this.f152114h = count;
            if (count == 0) {
                android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dfo);
                textView.setText(com.tencent.mm.R.string.i8k);
                textView.setVisibility(0);
                enableOptionMenu(false);
            }
            this.f152111e.q();
        }
        this.f152111e.notifyDataSetChanged();
        gm0.j1.d().a(148, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiListUI", "onSceneEnd: errType=%d, errCode=%d, errMsg=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f152117n;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f152117n = null;
        }
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SayHiListUI", "[cpan] clear location failed.");
        } else if (((an3.f) m1Var).I() == 2) {
            db5.e1.t(getContext(), getString(com.tencent.mm.R.string.h5y), "", new com.tencent.mm.plugin.nearby.ui.y0(this));
            this.f152118o = null;
        }
    }
}
