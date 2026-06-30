package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class IPCallContactUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f142551f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.ui.w f142552g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f142553h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f142554i;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.base.VerticalScrollBar f142556n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f142557o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f142558p;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.tools.c9 f142549d = new com.tencent.mm.ui.tools.c9(true, true);

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f142550e = null;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.ui.IPCallAddressCountView f142555m = null;

    /* renamed from: q, reason: collision with root package name */
    public int f142559q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f142560r = -1;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.ipcall.model.f f142561s = new com.tencent.mm.plugin.ipcall.ui.a1(this);

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.Runnable f142562t = new com.tencent.mm.plugin.ipcall.ui.b1(this);

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.Runnable f142563u = new com.tencent.mm.plugin.ipcall.ui.d1(this);

    /* renamed from: v, reason: collision with root package name */
    public boolean f142564v = true;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f142565w = new com.tencent.mm.plugin.ipcall.ui.u0(this, android.os.Looper.getMainLooper());

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.blm;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onBusinessPermissionDenied(java.lang.String str) {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.g3c);
        setBackBtn(new com.tencent.mm.plugin.ipcall.ui.x0(this));
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(this, "android.permission.READ_CONTACTS", 48, null, null);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallContactUI", "summerper checkPermission checkContacts[%b],stack[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3());
        if (a17) {
            this.f142553h = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.hur);
            this.f142554i = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f482755n4);
            this.f142551f = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f482732mc);
            this.f142556n = (com.tencent.mm.ui.base.VerticalScrollBar) findViewById(com.tencent.mm.R.id.f482748mx);
            this.f142557o = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f482754n3);
            com.tencent.mm.ui.tools.c9 c9Var = this.f142549d;
            c9Var.f210324i = new com.tencent.mm.plugin.ipcall.ui.y0(this);
            c9Var.f210326k = com.tencent.mm.R.string.f490549y8;
            addSearchMenu(true, c9Var);
            this.f142552g = new com.tencent.mm.plugin.ipcall.ui.w(getContext());
            com.tencent.mm.plugin.ipcall.ui.w.f143045x = s83.b.f404867b;
            com.tencent.mm.plugin.ipcall.ui.IPCallAddressCountView iPCallAddressCountView = new com.tencent.mm.plugin.ipcall.ui.IPCallAddressCountView(getContext(), this.f142552g.t());
            this.f142555m = iPCallAddressCountView;
            this.f142551f.addFooterView(iPCallAddressCountView, null, false);
            this.f142551f.setAdapter((android.widget.ListAdapter) this.f142552g);
            this.f142551f.setOnItemClickListener(new com.tencent.mm.plugin.ipcall.ui.z0(this));
            this.f142556n.setVisibility(0);
            this.f142551f.setOnScrollListener(new com.tencent.mm.plugin.ipcall.ui.e1(this));
            this.f142556n.setOnScrollBarTouchListener(new com.tencent.mm.plugin.ipcall.ui.f1(this));
            if (this.f142552g.t() <= 0) {
                this.f142553h.setVisibility(8);
                this.f142550e = db5.e1.Q(getContext(), getContext().getString(com.tencent.mm.R.string.f490573yv), getContext().getString(com.tencent.mm.R.string.g3r), true, true, new com.tencent.mm.plugin.ipcall.ui.c1(this));
                s75.d.b(this.f142562t, "IPCall_LoadSystemAddressBook");
            } else {
                if (com.tencent.mm.plugin.ipcall.c.f142436e == null) {
                    com.tencent.mm.plugin.ipcall.c.f142436e = new com.tencent.mm.plugin.ipcall.c();
                }
                com.tencent.mm.plugin.ipcall.c.f142436e.a();
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (com.tencent.mm.plugin.ipcall.model.g.f142465d == null) {
            com.tencent.mm.plugin.ipcall.model.g.f142465d = new com.tencent.mm.plugin.ipcall.model.g();
        }
        com.tencent.mm.plugin.ipcall.model.g gVar = com.tencent.mm.plugin.ipcall.model.g.f142465d;
        com.tencent.mm.plugin.ipcall.model.f fVar = this.f142561s;
        java.util.ArrayList arrayList = gVar.f142467b;
        if (arrayList.contains(fVar)) {
            arrayList.remove(fVar);
        }
        this.f142565w.removeMessages(1);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallContactUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallContactUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 48 && iArr[0] != 0) {
            db5.e1.C(this, getString(com.tencent.mm.R.string.hhf), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.aq7), false, new com.tencent.mm.plugin.ipcall.ui.v0(this), new com.tencent.mm.plugin.ipcall.ui.w0(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        supportInvalidateOptionsMenu();
    }
}
