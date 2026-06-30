package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class ShakeTvHistoryListUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.shake.ui.e1 f162219d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f162220e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f162221f;

    /* renamed from: g, reason: collision with root package name */
    public final db5.t4 f162222g = new com.tencent.mm.plugin.shake.ui.c1(this);

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cmv;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.j3m);
        setBackBtn(new com.tencent.mm.plugin.shake.ui.w0(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490353sl), new com.tencent.mm.plugin.shake.ui.z0(this));
        this.f162220e = (android.widget.ListView) findViewById(com.tencent.mm.R.id.ms9);
        com.tencent.mm.plugin.shake.ui.e1 e1Var = new com.tencent.mm.plugin.shake.ui.e1(this, this);
        this.f162219d = e1Var;
        this.f162220e.setAdapter((android.widget.ListAdapter) e1Var);
        this.f162220e.setOnItemClickListener(new com.tencent.mm.plugin.shake.ui.a1(this));
        this.f162220e.setOnItemLongClickListener(new com.tencent.mm.plugin.shake.ui.b1(this, new com.tencent.mm.ui.tools.s6(this)));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        this.f162221f = ((h34.h0) this.f162219d.getItem(adapterContextMenuInfo.position)).field_username;
        contextMenu.add(adapterContextMenuInfo.position, 0, 0, com.tencent.mm.R.string.f490367t0);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f162219d.c();
        super.onDestroy();
    }
}
