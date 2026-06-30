package com.tencent.mm.ui.chatting;

/* loaded from: classes8.dex */
public class ImageDownloadUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0, com.tencent.mm.modelbase.v0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ProgressBar f198285d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f198286e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f198287f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f198288g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f198289h;

    /* renamed from: i, reason: collision with root package name */
    public m11.b0 f198290i;

    /* renamed from: m, reason: collision with root package name */
    public m11.t0 f198291m;

    /* renamed from: n, reason: collision with root package name */
    public int f198292n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f198293o;

    /* renamed from: p, reason: collision with root package name */
    public long f198294p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f198295q = 0;

    @Override // com.tencent.mm.modelbase.v0
    public void S(long j17, long j18, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() == 109) {
            T6(java.lang.Math.max(0, j18 != 0 ? (int) (((j17 * 100) / j18) - 1) : 0));
        }
    }

    public final void T6(int i17) {
        this.f198285d.setProgress(i17);
        this.f198286e.setText(getString(com.tencent.mm.R.string.fcy, java.lang.Integer.valueOf(i17)));
        if (i17 < this.f198285d.getMax()) {
            return;
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b0 C1 = m11.b1.Di().C1(java.lang.Long.valueOf(this.f198291m.f322781h));
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(this.f198293o, C1.f322647o);
        java.lang.String aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(Li, bm5.c0.f22550a.d(C1.l()), C1.f322637e, null, null);
        if (this.f198292n == 1) {
            ((j70.e) ((k70.z) i95.n0.c(k70.z.class))).getClass();
            java.lang.String b17 = m11.c0.b(C1);
            aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(Li, bm5.f0.f22562g, b17, null, null);
        }
        if (aj6 == null || aj6.equals("") || !com.tencent.mm.vfs.w6.j(aj6)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("ImageDownloadUI", "[ImageGalleryUI] showImg");
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.class);
        intent.putExtra("key_message_id", this.f198294p);
        intent.putExtra("key_message_talker", this.f198293o);
        intent.putExtra("key_image_path", aj6);
        intent.putExtra("key_compress_type", this.f198292n);
        intent.putExtra("key_favorite", true);
        intent.putExtra("img_gallery_msg_id", this.f198294p);
        intent.putExtra("img_gallery_talker", this.f198293o);
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d3b;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f198286e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h97);
        this.f198287f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.oyo);
        this.f198288g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.oyp);
        this.f198289h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.oym);
        ((android.widget.ImageView) findViewById(com.tencent.mm.R.id.d2o)).setImageResource(com.tencent.mm.R.raw.download_image_icon);
        this.f198286e.setVisibility(0);
        this.f198287f.setVisibility(8);
        this.f198288g.setVisibility(8);
        this.f198289h.setVisibility(8);
        setBackBtn(new com.tencent.mm.ui.chatting.hb(this));
        this.f198285d = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.oyn);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f198294p = getIntent().getLongExtra("img_msg_id", 0L);
        this.f198295q = getIntent().getLongExtra("img_server_id", 0L);
        this.f198292n = getIntent().getIntExtra("img_download_compress_type", 0);
        this.f198293o = getIntent().getStringExtra("img_download_username");
        initView();
        if (this.f198294p > 0) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            this.f198290i = m11.b1.Di().T1(this.f198293o, this.f198294p);
        }
        m11.b0 b0Var = this.f198290i;
        if ((b0Var == null || b0Var.f322633a <= 0) && this.f198295q > 0) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            this.f198290i = m11.b1.Di().b2(this.f198293o, this.f198295q);
        }
        m11.b0 b0Var2 = this.f198290i;
        if (b0Var2 == null || b0Var2.f322633a <= 0) {
            com.tencent.mars.xlog.Log.e("ImageDownloadUI", "onCreate : on such imginfo, with msgLocalId = " + this.f198294p + ", or msgSvrId = " + this.f198295q);
            return;
        }
        if (this.f198294p <= 0 && this.f198295q > 0) {
            this.f198294p = ((com.tencent.mm.storage.g9) c01.d9.b().u()).o2(this.f198293o, this.f198295q).getMsgId();
        }
        this.f198291m = new m11.t0(this.f198290i.f322633a, this.f198294p, this.f198293o, this.f198292n, this);
        c01.d9.e().g(this.f198291m);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        c01.d9.e().q(109, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        c01.d9.e().a(109, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() != 109) {
            return;
        }
        if (i17 == 0 && i18 == 0) {
            T6(this.f198285d.getMax());
            return;
        }
        com.tencent.mars.xlog.Log.e("ImageDownloadUI", "onSceneEnd : fail, errType = " + i17 + ", errCode = " + i18);
        dp.a.makeText(this, com.tencent.mm.R.string.g09, 1).show();
    }
}
