package com.tencent.mm.plugin.setting.ui.qrcode;

/* loaded from: classes8.dex */
public class GetQRCodeInfoUI extends com.tencent.mm.ui.MMBaseActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f160090g = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f160091e = null;

    /* renamed from: f, reason: collision with root package name */
    public tg3.r1 f160092f;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        ((com.tencent.mm.app.y7) f14.g.b()).u(new android.content.Intent(), this);
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.tencent.mm.R.layout.a8u);
        android.net.Uri data = getIntent().getData();
        if (data == null) {
            finish();
            return;
        }
        java.lang.String host = data.getHost();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (host == null) {
            host = "";
        }
        java.lang.String scheme = data.getScheme();
        java.lang.String str = scheme != null ? scheme : "";
        if (("http".equals(str) && com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt).equals(host)) || ("weixin".equals(str) && "qr".equals(host))) {
            gm0.j1.d().g(new c01.ra(new p14.a(this), null));
        } else {
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f160092f != null) {
            gm0.j1.d().d(this.f160092f);
        }
        gm0.j1.d().q(106, this);
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f160091e = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f489924fn), true, true, new p14.b(this));
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GetQRCodeInfoUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        android.app.ProgressDialog progressDialog = this.f160091e;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f160091e = null;
        }
        if (i17 == 4 && i18 == -2004) {
            db5.e1.m(this, com.tencent.mm.R.string.hpn, com.tencent.mm.R.string.f490573yv, new p14.c(this));
            return;
        }
        if (i17 != 0 || i18 != 0) {
            java.lang.String G = com.tencent.mm.sdk.platformtools.t8.G(str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(G)) {
                G = getString(com.tencent.mm.R.string.fdr, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            }
            db5.e1.t(this, G, getString(com.tencent.mm.R.string.f490573yv), new p14.d(this));
            return;
        }
        r45.iw5 H = ((tg3.r1) m1Var).H();
        java.lang.String g17 = x51.j1.g(H.f377356d);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ai().v(g17, x51.j1.d(H.f377361i));
        android.content.Intent intent = new android.content.Intent();
        ((com.tencent.mm.app.o7) ((o25.r1) i95.n0.c(o25.r1.class))).getClass();
        qk.p.a(intent, H, 30);
        if ((g17 == null ? "" : g17).length() > 0) {
            if ((H.f377366q & 8) > 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, g17 + ",30");
            }
            j45.l.m(this, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", 1);
        }
    }
}
