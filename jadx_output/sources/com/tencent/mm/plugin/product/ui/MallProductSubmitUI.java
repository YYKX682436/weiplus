package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class MallProductSubmitUI extends com.tencent.mm.plugin.product.ui.MallBaseUI implements y60.e {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f153228z = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.RelativeLayout f153229e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f153230f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f153231g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.product.ui.MallProductItemView f153232h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.product.ui.MallProductItemView f153233i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f153234m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f153235n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f153236o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f153237p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f153238q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f153239r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f153240s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ListView f153241t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.product.ui.h f153242u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.Button f153243v;

    /* renamed from: w, reason: collision with root package name */
    public wq3.j f153244w;

    /* renamed from: x, reason: collision with root package name */
    public wq3.l f153245x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.product.ui.w f153246y;

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f153244w.e())) {
            return;
        }
        this.f153234m.post(new com.tencent.mm.plugin.product.ui.e1(this, bitmap));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T6() {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.product.ui.MallProductSubmitUI.T6():void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cam;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.gsh);
        this.f153229e = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.jab);
        this.f153230f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jad);
        this.f153231g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jac);
        this.f153232h = (com.tencent.mm.plugin.product.ui.MallProductItemView) findViewById(com.tencent.mm.R.id.jaf);
        this.f153233i = (com.tencent.mm.plugin.product.ui.MallProductItemView) findViewById(com.tencent.mm.R.id.jah);
        this.f153234m = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.jag);
        this.f153235n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jao);
        this.f153236o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jai);
        this.f153237p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jam);
        this.f153238q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jal);
        this.f153239r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jak);
        this.f153240s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jap);
        this.f153241t = (android.widget.ListView) findViewById(com.tencent.mm.R.id.jaj);
        com.tencent.mm.plugin.product.ui.h hVar = new com.tencent.mm.plugin.product.ui.h(this);
        this.f153242u = hVar;
        this.f153241t.setAdapter((android.widget.ListAdapter) hVar);
        this.f153241t.setOnItemClickListener(new com.tencent.mm.plugin.product.ui.z0(this));
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.jan);
        this.f153243v = button;
        button.setOnClickListener(new com.tencent.mm.plugin.product.ui.a1(this));
        this.f153229e.setOnClickListener(new com.tencent.mm.plugin.product.ui.b1(this));
        this.f153232h.setOnClickListener(new com.tencent.mm.plugin.product.ui.c1(this));
        this.f153233i.setOnClickListener(new com.tencent.mm.plugin.product.ui.d1(this));
        this.f153233i.setVisibility((this.f153244w.d().f153345b & 2) > 0 ? 0 : 8);
        if ((this.f153244w.d().f153345b & 1) > 0) {
            this.f153232h.setEnabled(false);
            this.f153232h.setClickable(false);
            this.f153232h.setSummary(getString(com.tencent.mm.R.string.gsf));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        this.f153246y.b(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.product.ui.MallBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f153246y = new com.tencent.mm.plugin.product.ui.w(getContext(), new com.tencent.mm.plugin.product.ui.y0(this));
        wq3.j Ai = vq3.e.wi().Ai();
        this.f153244w = Ai;
        this.f153245x = Ai.f448565r;
        initView();
        T6();
    }

    @Override // com.tencent.mm.plugin.product.ui.MallBaseUI, android.app.Activity
    public android.app.Dialog onCreateDialog(int i17) {
        java.util.LinkedList linkedList;
        if (i17 != 1 || (linkedList = this.f153244w.f448563p) == null) {
            return super.onCreateDialog(i17);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(wq3.h.a(this, (r45.gm0) it.next()));
        }
        java.lang.String string = getString(com.tencent.mm.R.string.gs7);
        com.tencent.mm.plugin.product.ui.f1 f1Var = new com.tencent.mm.plugin.product.ui.f1(this);
        com.tencent.mm.plugin.product.ui.q qVar = new com.tencent.mm.plugin.product.ui.q(this, 1);
        com.tencent.mm.ui.ListViewInScrollView listViewInScrollView = (com.tencent.mm.ui.ListViewInScrollView) android.view.View.inflate(this, com.tencent.mm.R.layout.byq, null);
        listViewInScrollView.setOnItemClickListener(new com.tencent.mm.plugin.product.ui.p(f1Var, qVar));
        qVar.f153332f = arrayList;
        qVar.f153333g = 0;
        listViewInScrollView.setAdapter((android.widget.ListAdapter) qVar);
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211709a = string;
        aVar.L = listViewInScrollView;
        aVar.G = null;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(this, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
        return j0Var;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        this.f153246y.c();
        super.onStart();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        this.f153246y.d();
        super.onStop();
    }
}
