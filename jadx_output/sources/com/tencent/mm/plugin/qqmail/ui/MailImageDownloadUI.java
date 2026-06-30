package com.tencent.mm.plugin.qqmail.ui;

@ul5.d(0)
/* loaded from: classes8.dex */
public class MailImageDownloadUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0, com.tencent.mm.modelbase.v0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ProgressBar f154894d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f154895e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f154896f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f154897g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f154898h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.RelativeLayout f154899i;

    /* renamed from: m, reason: collision with root package name */
    public m11.b0 f154900m;

    /* renamed from: n, reason: collision with root package name */
    public k70.b0 f154901n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f154902o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f154903p;

    /* renamed from: q, reason: collision with root package name */
    public int f154904q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f154905r;

    /* renamed from: s, reason: collision with root package name */
    public long f154906s;

    /* renamed from: t, reason: collision with root package name */
    public long f154907t;

    public MailImageDownloadUI() {
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f154906s = 0L;
        this.f154907t = 0L;
    }

    @Override // com.tencent.mm.modelbase.v0
    public void S(long j17, long j18, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() == 109) {
            T6(java.lang.Math.max(0, j18 != 0 ? (int) (((j17 * 100) / j18) - 1) : 0));
        }
    }

    public final void T6(int i17) {
        this.f154895e.setText(getString(com.tencent.mm.R.string.fcy, java.lang.Integer.valueOf(i17)));
        if (i17 < this.f154894d.getMax()) {
            return;
        }
        finish();
        android.content.Intent intent = getIntent();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/MailImageDownloadUI", "updateProgress", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/qqmail/ui/MailImageDownloadUI", "updateProgress", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bvm;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f154895e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h97);
        this.f154896f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h97);
        this.f154897g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h98);
        this.f154898h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485313h95);
        this.f154902o = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j89);
        this.f154895e.setVisibility(0);
        this.f154903p = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.h8p);
        this.f154899i = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.j8_);
        setBackGroundColorResource(com.tencent.mm.R.color.f478712f3);
        this.f154896f.setVisibility(8);
        this.f154897g.setVisibility(8);
        this.f154898h.setVisibility(8);
        setTitleVisibility(8);
        setBackBtn(new os3.w2(this));
        this.f154894d = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.h96);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.storage.f9 f9Var;
        super.onCreate(bundle);
        this.f154906s = getIntent().getLongExtra("img_msg_id", 0L);
        this.f154907t = getIntent().getLongExtra("img_server_id", 0L);
        this.f154904q = getIntent().getIntExtra("img_download_compress_type", 0);
        this.f154905r = getIntent().getStringExtra("img_download_username");
        initView();
        if (this.f154906s > 0) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            this.f154900m = m11.b1.Di().T1(this.f154905r, this.f154906s);
        }
        m11.b0 b0Var = this.f154900m;
        if ((b0Var == null || b0Var.f322633a <= 0) && this.f154907t > 0) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            this.f154900m = m11.b1.Di().b2(this.f154905r, this.f154907t);
        }
        m11.b0 b0Var2 = this.f154900m;
        if (b0Var2 == null || b0Var2.f322633a <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MailImageDownloadUI", "onCreate : on such imginfo, with msgLocalId = " + this.f154906s + ", or msgSvrId = " + this.f154907t);
            return;
        }
        if (this.f154906s > 0 || this.f154907t <= 0) {
            f9Var = null;
        } else {
            f9Var = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(this.f154905r, this.f154907t);
            this.f154906s = f9Var.getMsgId();
        }
        long j17 = this.f154906s;
        if (j17 > 0 && f9Var == null) {
            f9Var = pt0.f0.f2(this.f154905r, j17);
        }
        com.tencent.mm.storage.f9 f9Var2 = f9Var;
        java.lang.String str = this.f154900m.f322637e;
        java.lang.String aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var2, bm5.c0.f22550a.d(this.f154900m.l()), str, null, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !com.tencent.mm.vfs.w6.j(aj6)) {
            long j18 = this.f154900m.f322633a;
            long j19 = this.f154906s;
            java.lang.String str2 = this.f154905r;
            int i17 = this.f154904q;
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            this.f154901n = new m11.t0(j18, j19, str2, i17, this);
            gm0.j1.n().f273288b.g((com.tencent.mm.modelbase.m1) this.f154901n);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MailImageDownloadUI", "has big image, bigImgPath = %s, hasHDImg = %b, fullPath = %s", str, java.lang.Boolean.valueOf(this.f154900m.j()), aj6);
        this.f154900m.getClass();
        if (aj6 == null || aj6.equals("") || !com.tencent.mm.vfs.w6.j(aj6)) {
            return;
        }
        this.f154903p.setVisibility(8);
        this.f154894d.setVisibility(8);
        this.f154902o.setVisibility(0);
        this.f154902o.setImageBitmap(com.tencent.mm.sdk.platformtools.x.i0(aj6));
        this.f154899i.invalidate();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.n().f273288b.q(109, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.n().f273288b.a(109, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() != 109) {
            return;
        }
        if (i17 == 0 && i18 == 0) {
            T6(this.f154894d.getMax());
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MailImageDownloadUI", "onSceneEnd : fail, errType = " + i17 + ", errCode = " + i18);
        dp.a.makeText(this, com.tencent.mm.R.string.g09, 1).show();
    }
}
