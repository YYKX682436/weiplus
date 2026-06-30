package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class ShakeSayHiListUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.shake.ui.g f162213e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f162214f;

    /* renamed from: i, reason: collision with root package name */
    public long f162217i;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.storage.qa f162212d = null;

    /* renamed from: g, reason: collision with root package name */
    public int f162215g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f162216h = 0;

    /* renamed from: m, reason: collision with root package name */
    public final db5.t4 f162218m = new com.tencent.mm.plugin.shake.ui.k0(this);

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bps;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.chj, (android.view.ViewGroup) null);
        this.f162214f = (android.widget.ListView) findViewById(com.tencent.mm.R.id.m_0);
        inflate.setOnClickListener(new com.tencent.mm.plugin.shake.ui.l0(this, inflate));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490353sl), new com.tencent.mm.plugin.shake.ui.o0(this));
        if (this.f162216h == 0) {
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dfo);
            textView.setText(com.tencent.mm.R.string.i8k);
            textView.setVisibility(0);
            enableOptionMenu(false);
        }
        int i17 = this.f162216h;
        if (i17 > 0 && this.f162215g < i17) {
            this.f162214f.addFooterView(inflate);
        }
        com.tencent.mm.plugin.shake.ui.g gVar = new com.tencent.mm.plugin.shake.ui.g(this, this.f162212d, this.f162215g);
        this.f162213e = gVar;
        gVar.f162268s = new com.tencent.mm.plugin.shake.ui.p0(this);
        gVar.f162267r = new com.tencent.mm.plugin.shake.ui.q0(this);
        gVar.f162269t = new com.tencent.mm.plugin.shake.ui.r0(this);
        this.f162214f.setAdapter((android.widget.ListAdapter) gVar);
        this.f162214f.setOnItemClickListener(new com.tencent.mm.plugin.shake.ui.s0(this));
        this.f162214f.setOnItemLongClickListener(new com.tencent.mm.plugin.shake.ui.t0(this, new com.tencent.mm.ui.tools.s6(this)));
        setBackBtn(new com.tencent.mm.plugin.shake.ui.u0(this));
        setToTop(new com.tencent.mm.plugin.shake.ui.v0(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getIntExtra("IntentSayHiType", 1) == 1) {
            this.f162212d = r21.w.Di();
            setMMTitle(com.tencent.mm.R.string.i8j);
        } else {
            setMMTitle(com.tencent.mm.R.string.i8h);
        }
        int f17 = this.f162212d.f();
        if (f17 == 0) {
            f17 = 8;
        }
        this.f162215g = f17;
        this.f162216h = this.f162212d.getCount();
        com.tencent.mm.storage.qa qaVar = this.f162212d;
        qaVar.getClass();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("status", (java.lang.Integer) 4);
        if (qaVar.f195251d.p(qaVar.getTableName(), contentValues, "status!=? ", new java.lang.String[]{"4"}) != 0) {
            qaVar.doNotify();
        }
        initView();
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        this.f162217i = ((com.tencent.mm.storage.pa) this.f162213e.getItem(adapterContextMenuInfo.position)).field_svrid;
        contextMenu.add(adapterContextMenuInfo.position, 0, 0, com.tencent.mm.R.string.f490367t0);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f162213e.c();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        db5.c6 c6Var = this.f162213e.f162270u;
        if (c6Var != null) {
            c6Var.c();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f162216h != this.f162212d.getCount()) {
            int count = this.f162212d.getCount();
            this.f162216h = count;
            if (count == 0) {
                android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dfo);
                textView.setText(com.tencent.mm.R.string.i8k);
                textView.setVisibility(0);
                enableOptionMenu(false);
            }
            this.f162213e.q();
        }
        this.f162213e.notifyDataSetChanged();
    }
}
