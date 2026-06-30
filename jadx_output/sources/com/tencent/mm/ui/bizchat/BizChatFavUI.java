package com.tencent.mm.ui.bizchat;

/* loaded from: classes11.dex */
public class BizChatFavUI extends com.tencent.mm.ui.MMActivity implements r01.w2 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f197915d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f197916e;

    /* renamed from: f, reason: collision with root package name */
    public hb5.o f197917f;

    /* renamed from: g, reason: collision with root package name */
    public db5.t4 f197918g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f197919h;

    /* renamed from: i, reason: collision with root package name */
    public long f197920i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f197921m;

    /* renamed from: n, reason: collision with root package name */
    public s01.f f197922n;

    /* renamed from: o, reason: collision with root package name */
    public s01.l f197923o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f197924p;

    @Override // r01.w2
    public void K1(int i17, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f197924p;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a97;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f197916e = (android.widget.ListView) findViewById(com.tencent.mm.R.id.odk);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dfo);
        this.f197915d = textView;
        textView.setText(com.tencent.mm.R.string.f490758ao2);
        this.f197916e.setOnScrollListener(new hb5.w(this));
        this.f197917f = new hb5.o(this, new hb5.x(this), this.f197919h);
        this.f197917f.getClass();
        this.f197916e.setAdapter((android.widget.ListAdapter) this.f197917f);
        this.f197918g = new hb5.y(this);
        this.f197916e.setOnItemLongClickListener(new hb5.p(this, new com.tencent.mm.ui.tools.s6(this)));
        this.f197916e.setOnItemClickListener(new hb5.q(this));
        setBackBtn(new hb5.v(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f197919h = getIntent().getStringExtra("Contact_User");
        com.tencent.mars.xlog.Log.i("MicroMsg.BizChatFavUI", "[registerListener]");
        this.f197922n = new hb5.t(this);
        this.f197923o = new hb5.u(this);
        s01.g aj6 = r01.q3.aj();
        aj6.f401872e.a(this.f197922n, getMainLooper());
        s01.m Ui = r01.q3.Ui();
        Ui.f401901e.a(this.f197923o, getMainLooper());
        initView();
        s01.y Ni = r01.q3.Ni();
        java.lang.String str = this.f197919h;
        Ni.getClass();
        gm0.j1.n().f273288b.g(new s01.l0(str));
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        this.f197920i = ((s01.h) this.f197917f.getItem(adapterContextMenuInfo.position)).field_bizChatLocalId;
        contextMenu.add(adapterContextMenuInfo.position, 0, 1, com.tencent.mm.R.string.f490759ao3);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizChatFavUI", "[unRegitListener]");
        s01.g aj6 = r01.q3.aj();
        s01.f fVar = this.f197922n;
        l75.v0 v0Var = aj6.f401872e;
        if (v0Var != null) {
            v0Var.j(fVar);
        }
        s01.m Ui = r01.q3.Ui();
        s01.l lVar = this.f197923o;
        l75.v0 v0Var2 = Ui.f401901e;
        if (v0Var2 != null) {
            v0Var2.j(lVar);
        }
        this.f197917f.c();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        db5.c6 c6Var = this.f197917f.f280243q;
        if (c6Var != null) {
            c6Var.c();
        }
        this.f197921m = false;
        ((com.tencent.mm.booter.notification.x) c01.d9.f()).f63516b = "";
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f197919h, true);
        if (n17 == null || !n17.r2()) {
            finish();
            return;
        }
        setTitleMuteIconVisibility(8);
        this.f197921m = true;
        this.f197917f.f();
        ((com.tencent.mm.booter.notification.x) c01.d9.f()).f63516b = this.f197919h;
    }
}
