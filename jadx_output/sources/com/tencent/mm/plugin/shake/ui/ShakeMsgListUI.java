package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class ShakeMsgListUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.shake.ui.a0 f162103e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f162104f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f162105g;

    /* renamed from: n, reason: collision with root package name */
    public int f162109n;

    /* renamed from: o, reason: collision with root package name */
    public long f162110o;

    /* renamed from: d, reason: collision with root package name */
    public c34.u f162102d = null;

    /* renamed from: h, reason: collision with root package name */
    public int f162106h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f162107i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f162108m = 0;

    /* renamed from: p, reason: collision with root package name */
    public final db5.t4 f162111p = new com.tencent.mm.plugin.shake.ui.i0(this);

    public final void T6() {
        this.f162105g.setText(com.tencent.mm.R.string.j2y);
        this.f162105g.setVisibility(0);
        enableOptionMenu(false);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cmo;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(getIntent().getStringExtra("shake_msg_list_title"));
        setBackBtn(new com.tencent.mm.plugin.shake.ui.b0(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490353sl), new com.tencent.mm.plugin.shake.ui.e0(this));
        this.f162105g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dfo);
        if (this.f162107i == 0) {
            T6();
        }
        this.f162104f = (android.widget.ListView) findViewById(com.tencent.mm.R.id.mr8);
        android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.chj, (android.view.ViewGroup) null);
        inflate.setOnClickListener(new com.tencent.mm.plugin.shake.ui.f0(this, inflate));
        int i17 = this.f162107i;
        if (i17 > 0 && this.f162106h < i17) {
            this.f162104f.addFooterView(inflate);
        }
        com.tencent.mm.plugin.shake.ui.a0 a0Var = new com.tencent.mm.plugin.shake.ui.a0(this);
        this.f162103e = a0Var;
        a0Var.f162237q = this.f162106h;
        this.f162104f.setAdapter((android.widget.ListAdapter) a0Var);
        this.f162104f.setOnItemClickListener(new com.tencent.mm.plugin.shake.ui.g0(this));
        this.f162104f.setOnItemLongClickListener(new com.tencent.mm.plugin.shake.ui.h0(this, new com.tencent.mm.ui.tools.s6(this)));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getIntent().getIntExtra("shake_msg_type", 0);
        c34.u Ri = c34.h0.Ri();
        this.f162102d = Ri;
        int f17 = Ri.f();
        this.f162108m = f17;
        if (f17 == 0) {
            f17 = 8;
        }
        this.f162106h = f17;
        this.f162107i = this.f162102d.getCount();
        int intExtra = getIntent().getIntExtra("shake_msg_from", 1);
        this.f162109n = intExtra;
        if (intExtra == 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11313, java.lang.Integer.valueOf(this.f162108m), com.tencent.mm.plugin.shake.ui.f1.a());
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11315, java.lang.Integer.valueOf(this.f162108m), com.tencent.mm.plugin.shake.ui.f1.a());
        }
        c34.u uVar = this.f162102d;
        uVar.getClass();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("status", (java.lang.Integer) 1);
        uVar.f38243d.p(uVar.getTableName(), contentValues, "status!=? ", new java.lang.String[]{"1"});
        initView();
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        this.f162110o = ((c34.t) this.f162103e.getItem(adapterContextMenuInfo.position)).field_svrid;
        contextMenu.add(adapterContextMenuInfo.position, 0, 0, com.tencent.mm.R.string.f490367t0);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f162103e.c();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f162107i != this.f162102d.getCount()) {
            int count = this.f162102d.getCount();
            this.f162107i = count;
            if (count == 0) {
                T6();
            }
            this.f162103e.q();
        }
        this.f162103e.notifyDataSetChanged();
    }
}
