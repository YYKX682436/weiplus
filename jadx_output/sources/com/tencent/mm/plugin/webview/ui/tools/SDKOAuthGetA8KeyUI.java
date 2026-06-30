package com.tencent.mm.plugin.webview.ui.tools;

@db5.a(3)
@ul5.d(0)
/* loaded from: classes8.dex */
public class SDKOAuthGetA8KeyUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f183689n = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f183690d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f183691e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f183692f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f183693g;

    /* renamed from: h, reason: collision with root package name */
    public int f183694h = -1;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f183695i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f183696m;

    public final void T6(com.tencent.mm.opensdk.modelbase.BaseResp baseResp, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        baseResp.toBundle(bundle);
        com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
        args.targetPkgName = str;
        args.bundle = bundle;
        com.tencent.mm.pluginsdk.model.app.j1.g(bundle);
        com.tencent.mm.pluginsdk.model.app.j1.h(bundle);
        args.flags = 268435456;
        com.tencent.mm.opensdk.channel.MMessageActV2.send(this, args);
    }

    public final void U6() {
        com.tencent.mm.opensdk.modelbiz.WXGetA8Key.Resp resp = new com.tencent.mm.opensdk.modelbiz.WXGetA8Key.Resp();
        resp.errCode = -2;
        T6(resp, this.f183693g);
    }

    public final void V6() {
        int i17 = getResources().getConfiguration().orientation;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f485649uc1);
        if (findViewById != null) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.bottomMargin = i17 == 2 ? i65.a.b(this, 12) : i17 == 1 ? i65.a.b(this, 96) : 0;
            findViewById.setLayoutParams(layoutParams);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489435en5;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        V6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, this);
        this.f183690d = getIntent().getStringExtra("key_url");
        java.lang.String stringExtra = getIntent().getStringExtra("key_app_id");
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(stringExtra);
        if (h17 != null) {
            this.f183691e = h17.field_appName;
            this.f183692f = h17.field_appIconUrl;
            this.f183693g = h17.field_packageName;
        }
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        getController().X0(this, b3.l.getColor(this, com.tencent.mm.R.color.aaw));
        getController().E0(b3.l.getColor(this, com.tencent.mm.R.color.aaw));
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.vi8)).setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.r1(this));
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.hk8);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.u6u);
        o11.f fVar = new o11.f();
        fVar.f342091o = com.tencent.mm.R.raw.native_oauth_default_head_img;
        fVar.f342097u = getResources().getDimension(com.tencent.mm.R.dimen.a9i);
        fVar.f342096t = true;
        n11.a.b().h(this.f183692f, imageView, fVar.a());
        textView.setText(this.f183691e);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.olw);
        textView2.setText(com.tencent.mm.R.string.h8g);
        textView2.getPaint().setFakeBoldText(true);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.f483079w0)).setText(com.tencent.mm.R.string.oaq);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.slq);
        android.widget.Button button2 = (android.widget.Button) findViewById(com.tencent.mm.R.id.sm6);
        button.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.s1(this));
        button2.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.t1(this));
        V6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        U6();
        finish();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof w60.k) {
            com.tencent.mm.modelsimple.k0 k0Var = (com.tencent.mm.modelsimple.k0) ((w60.k) m1Var);
            if (k0Var.O() == this.f183694h) {
                com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f183695i;
                if (u3Var != null) {
                    u3Var.dismiss();
                }
                if (i17 == 0 && i18 == 0 && com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthGetA8KeyUI", "onGetA8KeySceneEnd, redirectUrl = " + k0Var.Q());
                    com.tencent.mm.opensdk.modelbiz.WXGetA8Key.Resp resp = new com.tencent.mm.opensdk.modelbiz.WXGetA8Key.Resp();
                    resp.redirectUrl = k0Var.Q();
                    T6(resp, this.f183693g);
                    finish();
                    return;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.SDKOAuthGetA8KeyUI", "onGetA8KeySceneEnd, errType = " + i17 + ", errCode = " + i18 + ", errMsg = " + str);
                com.tencent.mm.modelbase.o oVar = k0Var.f71356e;
                java.lang.String string = com.tencent.mm.sdk.platformtools.t8.K0(((r45.s83) oVar.f70711b.f70700a).f385563y) ? getString(com.tencent.mm.R.string.l8c) : ((r45.s83) oVar.f70711b.f70700a).f385563y;
                com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f183696m;
                if (j0Var != null) {
                    j0Var.dismiss();
                }
                this.f183696m = db5.e1.G(this, string, getString(com.tencent.mm.R.string.ooo), true, new com.tencent.mm.plugin.webview.ui.tools.v1(this, str));
            }
        }
    }
}
