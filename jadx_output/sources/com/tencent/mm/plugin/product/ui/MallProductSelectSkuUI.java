package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class MallProductSelectSkuUI extends com.tencent.mm.plugin.product.ui.MallBaseUI implements y60.e {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f153215t = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f153216e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f153217f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f153218g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f153219h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f153220i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ListView f153221m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.product.ui.MallProductSelectAmountView f153222n = null;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.product.ui.r0 f153223o = null;

    /* renamed from: p, reason: collision with root package name */
    public wq3.j f153224p;

    /* renamed from: q, reason: collision with root package name */
    public wq3.t f153225q;

    /* renamed from: r, reason: collision with root package name */
    public wq3.l f153226r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.product.ui.w f153227s;

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f153224p.e())) {
            return;
        }
        this.f153216e.post(new com.tencent.mm.plugin.product.ui.p0(this, bitmap));
    }

    public final void T6() {
        xq3.c cVar;
        wq3.t tVar = this.f153225q;
        if (tVar != null) {
            wq3.l lVar = this.f153226r;
            if (lVar == null || (cVar = tVar.f448599e) == null) {
                android.widget.TextView textView = this.f153218g;
                xq3.c cVar2 = tVar.f448599e;
                textView.setText(wq3.h.c(cVar2.f456062g, cVar2.f456063h, cVar2.f456075w));
            } else {
                this.f153218g.setText(wq3.h.c(lVar.f448569i, lVar.f448570m, cVar.f456075w));
            }
            xq3.c cVar3 = this.f153225q.f448599e;
            if (cVar3 != null) {
                this.f153217f.setText(cVar3.f456059d);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f153224p.e())) {
            y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
            com.tencent.mm.plugin.product.ui.o oVar = new com.tencent.mm.plugin.product.ui.o(this.f153224p.e());
            ((x60.e) fVar).getClass();
            this.f153216e.setImageBitmap(x51.w0.d(oVar));
            ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(this);
        }
        this.f153219h.setVisibility(8);
        com.tencent.mm.plugin.product.ui.MallProductSelectAmountView mallProductSelectAmountView = this.f153222n;
        int g17 = this.f153224p.g();
        int i17 = this.f153224p.f448549b.f448598d;
        if (g17 > i17) {
            mallProductSelectAmountView.f153211h = 3;
            mallProductSelectAmountView.f153210g = i17;
        } else {
            mallProductSelectAmountView.f153211h = 1;
            mallProductSelectAmountView.f153210g = g17;
        }
        mallProductSelectAmountView.a();
        com.tencent.mm.plugin.product.ui.k0 k0Var = mallProductSelectAmountView.f153214n;
        if (k0Var != null) {
            ((com.tencent.mm.plugin.product.ui.n0) k0Var).a(mallProductSelectAmountView.f153213m);
        }
        this.f153223o.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.caj;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        xq3.c cVar;
        java.util.LinkedList linkedList;
        setMMTitle(com.tencent.mm.R.string.grz);
        this.f153216e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j_x);
        this.f153217f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485842ja1);
        this.f153218g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j_z);
        this.f153219h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j_w);
        this.f153220i = (android.widget.Button) findViewById(com.tencent.mm.R.id.j_y);
        this.f153221m = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f485845ja4);
        com.tencent.mm.plugin.product.ui.MallProductSelectAmountView mallProductSelectAmountView = (com.tencent.mm.plugin.product.ui.MallProductSelectAmountView) findViewById(com.tencent.mm.R.id.f486801mi2);
        this.f153222n = mallProductSelectAmountView;
        mallProductSelectAmountView.setAmount(this.f153224p.f448553f);
        com.tencent.mm.plugin.product.ui.r0 r0Var = new com.tencent.mm.plugin.product.ui.r0(this);
        this.f153223o = r0Var;
        wq3.t tVar = this.f153225q;
        if (tVar == null || (cVar = tVar.f448599e) == null || (linkedList = cVar.f456072t) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MallProductSelectSkuUI", "Illage mProductInfo.base_attr.sku_table");
        } else {
            r0Var.f153341e = linkedList;
        }
        com.tencent.mm.plugin.product.ui.r0 r0Var2 = this.f153223o;
        r0Var2.f153342f = new com.tencent.mm.plugin.product.ui.m0(this);
        this.f153221m.setAdapter((android.widget.ListAdapter) r0Var2);
        this.f153222n.setOnAmountChangeListener(new com.tencent.mm.plugin.product.ui.n0(this));
        this.f153220i.setOnClickListener(new com.tencent.mm.plugin.product.ui.o0(this));
        this.f153216e.setFocusable(true);
        this.f153216e.setFocusableInTouchMode(true);
        this.f153216e.requestFocus();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        this.f153227s.b(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.product.ui.MallBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f153227s = new com.tencent.mm.plugin.product.ui.w(getContext(), new com.tencent.mm.plugin.product.ui.l0(this));
        wq3.j Ai = vq3.e.wi().Ai();
        this.f153224p = Ai;
        this.f153225q = Ai.f448549b;
        initView();
        T6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        this.f153227s.c();
        super.onStart();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        this.f153227s.d();
        super.onStop();
    }
}
