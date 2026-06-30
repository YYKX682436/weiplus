package com.tencent.mm.plugin.setting.ui.qrcode;

/* loaded from: classes5.dex */
public class ShowQRCodeStep1UI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f160120d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f160121e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f160122f = 1;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f160123g = null;

    public void T6() {
        ((jd0.q2) ((kd0.x2) i95.n0.c(kd0.x2.class))).getClass();
        g21.a aVar = new g21.a(c01.z1.r(), com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(66561, null)), 0);
        gm0.j1.d().g(aVar);
        this.f160120d = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f492967ih3), true, true, new p14.r0(this, aVar));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cne;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.iic);
        this.f160121e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f486841ml4);
        this.f160122f = getIntent().getIntExtra("show_to", 1);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mvq);
        int i17 = this.f160122f;
        if (i17 == 3) {
            textView.setText(getString(com.tencent.mm.R.string.ih8, getString(com.tencent.mm.R.string.ihb)));
        } else if (i17 == 4) {
            textView.setText(getString(com.tencent.mm.R.string.ih8, getString(com.tencent.mm.R.string.ih9)));
        } else if (i17 == 2) {
            textView.setText(getString(com.tencent.mm.R.string.ih8, getString(com.tencent.mm.R.string.iha)));
        } else {
            textView.setText(getString(com.tencent.mm.R.string.ih8, getString(com.tencent.mm.R.string.ih_)));
        }
        T6();
        setBackBtn(new p14.l0(this));
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new p14.m0(this));
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.f486842ml5)).setOnClickListener(new p14.n0(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        gm0.j1.d().a(be1.r0.CTRL_INDEX, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(be1.r0.CTRL_INDEX, this);
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShowQRCodeStep1UI", "onSceneEnd: errType = %d errCode = %d errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        android.app.ProgressDialog progressDialog = this.f160120d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f160120d = null;
        }
        o25.s1 a17 = f14.g.a();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        ((com.tencent.mm.app.o7) a17).getClass();
        if (com.tencent.mm.ui.pc.a(context, i17, i18, str, 7)) {
            return;
        }
        if (i17 != 0 || i18 != 0) {
            dp.a.makeText(this, getString(com.tencent.mm.R.string.fds, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
            return;
        }
        byte[] bArr = ((g21.a) ((kd0.j2) m1Var)).f267788h;
        this.f160123g = bArr;
        this.f160121e.setImageBitmap(com.tencent.mm.sdk.platformtools.x.G(bArr));
    }
}
