package com.tencent.mm.plugin.qqmail.ui;

/* loaded from: classes8.dex */
public class MailAddrListUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f154872f;

    /* renamed from: h, reason: collision with root package name */
    public os3.f2 f154874h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f154875i;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f154870d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f154871e = null;

    /* renamed from: g, reason: collision with root package name */
    public ks3.z f154873g = null;

    /* renamed from: m, reason: collision with root package name */
    public final ks3.y f154876m = new os3.w1(this);

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cbd;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f154872f = (android.widget.ListView) findViewById(com.tencent.mm.R.id.ldz);
        this.f154871e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dfx);
        this.f154874h = new os3.f2(this, this);
        com.tencent.mm.ui.tools.c9 c9Var = new com.tencent.mm.ui.tools.c9(true, true);
        c9Var.f210324i = new os3.x1(this);
        addSearchMenu(true, c9Var);
        this.f154872f.setAdapter((android.widget.ListAdapter) this.f154874h);
        this.f154872f.setOnItemClickListener(new os3.y1(this));
        this.f154872f.setOnScrollListener(new os3.z1(this));
        this.f154875i = this.f154873g.e(null);
        this.f154874h.notifyDataSetChanged();
        setBackBtn(new os3.a2(this));
        setToTop(new os3.b2(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.hjj), new os3.c2(this));
        enableOptionMenu(!this.f154875i.isEmpty());
        this.f154870d = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.hji), true, true, new os3.d2(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.hjk);
        this.f154875i = new java.util.ArrayList();
        this.f154873g = ((hs3.s) ((ks3.t) i95.n0.c(ks3.t.class))).wi().f311706b;
        initView();
        this.f154873g.b(this.f154876m);
        this.f154873g.d();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f154873g.f(this.f154876m);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f154874h.notifyDataSetChanged();
    }
}
