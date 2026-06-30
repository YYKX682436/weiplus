package com.tencent.mm.plugin.product.ui;

@db5.a(3)
/* loaded from: classes15.dex */
public class MallProductUI extends com.tencent.mm.plugin.product.ui.MallBaseUI implements y60.e {

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f153247e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f153248f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f153249g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f153250h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f153251i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f153252m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.product.ui.HtmlTextView f153253n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.product.ui.HtmlTextView f153254o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.RelativeLayout f153255p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ListView f153256q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.product.ui.h f153257r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ListView f153258s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.product.ui.u0 f153259t = null;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.Button f153260u;

    /* renamed from: v, reason: collision with root package name */
    public wq3.j f153261v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.product.ui.w f153262w;

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (str == null || !str.equals(this.f153261v.f448558k)) {
            return;
        }
        this.f153249g.post(new com.tencent.mm.plugin.product.ui.p1(this, bitmap));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.can;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.gsi);
        setBackBtn(new com.tencent.mm.plugin.product.ui.i1(this));
        this.f153247e = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.j_p);
        this.f153248f = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.ja_);
        this.f153249g = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j_n);
        this.f153250h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j_j);
        this.f153251i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j_s);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j_q);
        this.f153252m = textView;
        textView.getPaint().setFlags(16);
        this.f153255p = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.j_l);
        this.f153253n = (com.tencent.mm.plugin.product.ui.HtmlTextView) findViewById(com.tencent.mm.R.id.j_k);
        this.f153254o = (com.tencent.mm.plugin.product.ui.HtmlTextView) findViewById(com.tencent.mm.R.id.j_r);
        this.f153256q = (android.widget.ListView) findViewById(com.tencent.mm.R.id.j_i);
        com.tencent.mm.plugin.product.ui.h hVar = new com.tencent.mm.plugin.product.ui.h(this);
        this.f153257r = hVar;
        this.f153256q.setAdapter((android.widget.ListAdapter) hVar);
        this.f153256q.setOnItemClickListener(new com.tencent.mm.plugin.product.ui.j1(this));
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.f485843ja2)).setOnClickListener(new com.tencent.mm.plugin.product.ui.k1(this));
        this.f153258s = (android.widget.ListView) findViewById(com.tencent.mm.R.id.jaa);
        com.tencent.mm.plugin.product.ui.u0 u0Var = new com.tencent.mm.plugin.product.ui.u0(this);
        this.f153259t = u0Var;
        u0Var.f153360f = new com.tencent.mm.plugin.product.ui.l1(this);
        this.f153258s.setAdapter((android.widget.ListAdapter) u0Var);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.j_m);
        this.f153260u = button;
        button.setOnClickListener(new com.tencent.mm.plugin.product.ui.m1(this));
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.product.ui.o1(this));
        showOptionMenu(false);
        this.f153249g.setFocusable(true);
        this.f153249g.setFocusableInTouchMode(true);
        this.f153249g.requestFocus();
    }

    @Override // com.tencent.mm.plugin.product.ui.MallBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentViewVisibility(8);
        boolean booleanExtra = getIntent().getBooleanExtra("key_go_finish", false);
        setResult(-1);
        if (booleanExtra) {
            finish();
            return;
        }
        initView();
        this.f153261v = vq3.e.wi().Ai();
        com.tencent.mm.plugin.product.ui.w wVar = new com.tencent.mm.plugin.product.ui.w(getContext(), new com.tencent.mm.plugin.product.ui.h1(this));
        this.f153262w = wVar;
        gm0.j1.e().g(new com.tencent.mm.plugin.product.ui.t(wVar, getIntent(), new wq3.t()));
        wVar.f153365e = true;
        com.tencent.mm.autogen.events.RcptRecentAddrEvent rcptRecentAddrEvent = new com.tencent.mm.autogen.events.RcptRecentAddrEvent();
        rcptRecentAddrEvent.f54644h.f7253a = -1;
        rcptRecentAddrEvent.f192364d = new com.tencent.mm.plugin.product.ui.u(wVar, rcptRecentAddrEvent);
        rcptRecentAddrEvent.b(android.os.Looper.getMainLooper());
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        this.f153262w.d();
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f153262w.c();
    }
}
