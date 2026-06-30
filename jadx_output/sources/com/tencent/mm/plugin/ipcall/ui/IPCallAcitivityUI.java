package com.tencent.mm.plugin.ipcall.ui;

@db5.a(3)
/* loaded from: classes8.dex */
public class IPCallAcitivityUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f142528d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f142529e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f142530f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f142531g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f142532h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f142533i = false;

    /* renamed from: m, reason: collision with root package name */
    public s83.a f142534m;

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477848d6);
        if (this.f142533i) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13779, 0, 1);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13779, 0, 0);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.blv;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f142528d = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.hgi);
        this.f142529e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hgo);
        this.f142530f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hgk);
        this.f142531g = (android.widget.Button) findViewById(com.tencent.mm.R.id.hgl);
        this.f142532h = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.hgm);
        java.lang.String str = (java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERFINO_IPCALL_ACTIVITY_STRING, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallAcitivityUI", "xml is empty");
            finish();
        } else {
            s83.a a17 = s83.a.a(str);
            this.f142534m = a17;
            if (a17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.IPCallAcitivityUI", "mMsgInfo is null");
                finish();
            } else {
                this.f142529e.setText(a17.f404861a);
                this.f142530f.setText(this.f142534m.f404862b);
                this.f142531g.setText(this.f142534m.f404864d);
                this.f142532h.setUrl(this.f142534m.f404863c);
            }
        }
        this.f142528d.setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.p(this));
        this.f142531g.setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.q(this));
        setBackBtn(new com.tencent.mm.plugin.ipcall.ui.r(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(131072);
        getWindow().setFlags(1024, 1024);
        hideTitleView();
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
