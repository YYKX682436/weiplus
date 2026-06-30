package com.tencent.mm.plugin.qqmail.ui;

/* loaded from: classes8.dex */
public class CompressPreviewUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f154856s = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f154860g;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f154863m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ListView f154864n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f154865o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ProgressBar f154866p;

    /* renamed from: q, reason: collision with root package name */
    public os3.c1 f154867q;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f154857d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f154858e = null;

    /* renamed from: f, reason: collision with root package name */
    public long f154859f = 0;

    /* renamed from: h, reason: collision with root package name */
    public final os3.p3 f154861h = new os3.p3(this);

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f154862i = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final hs3.j f154868r = new os3.z0(this);

    public final void T6() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("mailid", this.f154857d);
        hashMap.put("attachid", this.f154858e);
        hashMap.put("fun", "list");
        ks3.k0 wi6 = ((hs3.s) ((ks3.t) i95.n0.c(ks3.t.class))).wi();
        hs3.j jVar = this.f154868r;
        wi6.getClass();
        wi6.g("/cgi-bin/viewcompress", 1, hashMap, null, new hs3.k(), jVar);
    }

    public final void U6(java.lang.String str) {
        os3.a1 a1Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.CompressPreviewUI", "curPath=" + str);
        this.f154866p.setVisibility(8);
        this.f154865o.setVisibility(8);
        this.f154864n.setVisibility(0);
        java.util.List list = this.f154862i;
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (true) {
            if (it.hasNext()) {
                a1Var = (os3.a1) it.next();
                if (a1Var.f348026a.equals(str)) {
                    break;
                }
            } else {
                a1Var = null;
                break;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (a1Var != null) {
            arrayList.add(a1Var);
        }
        for (int i17 = 0; i17 < ((java.util.ArrayList) list).size(); i17++) {
            os3.a1 a1Var2 = (os3.a1) ((java.util.ArrayList) list).get(i17);
            boolean endsWith = str.endsWith(a1Var2.f348028c);
            java.lang.String str2 = a1Var2.f348028c;
            if ((endsWith && str2.length() > 0) || str2.equals(str)) {
                arrayList.add(a1Var2);
            }
        }
        os3.c1 c1Var = this.f154867q;
        c1Var.f348050d = a1Var;
        c1Var.f348051e = arrayList;
        c1Var.notifyDataSetChanged();
        this.f154864n.setSelection(0);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bvj;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f154864n = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f483860c93);
        this.f154865o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483858c91);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.f483859c92);
        this.f154866p = progressBar;
        if (this.f154857d == null || this.f154858e == null) {
            progressBar.setVisibility(8);
            this.f154865o.setText(com.tencent.mm.R.string.gps);
            return;
        }
        os3.c1 c1Var = new os3.c1(this, null);
        this.f154867q = c1Var;
        this.f154864n.setAdapter((android.widget.ListAdapter) c1Var);
        this.f154864n.setOnItemClickListener(new os3.u0(this));
        setBackBtn(new os3.v0(this));
        setToTop(new os3.w0(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490375t8), new os3.x0(this));
        T6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f154857d = getIntent().getStringExtra("mail_id");
        this.f154858e = getIntent().getStringExtra("attach_id");
        this.f154859f = getIntent().getLongExtra("attach_size", 0L);
        this.f154860g = getIntent().getStringExtra("attach_name");
        initView();
        setMMTitle(this.f154860g);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        os3.p3 p3Var = this.f154861h;
        p3Var.getClass();
        gm0.j1.n().f273288b.q(138, p3Var);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4 && this.f154867q.c() != null) {
            U6(this.f154867q.c());
            return true;
        }
        if (keyEvent != null) {
            return super.onKeyDown(i17, keyEvent);
        }
        finish();
        return true;
    }
}
