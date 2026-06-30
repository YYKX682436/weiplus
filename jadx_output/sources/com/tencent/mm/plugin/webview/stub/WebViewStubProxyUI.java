package com.tencent.mm.plugin.webview.stub;

@db5.a(7)
@com.tencent.mm.ui.a2
/* loaded from: classes.dex */
public class WebViewStubProxyUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f183468s = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f183472g;

    /* renamed from: d, reason: collision with root package name */
    public boolean f183469d = false;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.stub.z0 f183470e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f183471f = false;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f183473h = "";

    /* renamed from: i, reason: collision with root package name */
    public boolean f183474i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f183475m = false;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.stub.z0 f183476n = new com.tencent.mm.plugin.webview.stub.o(this);

    /* renamed from: o, reason: collision with root package name */
    public final android.content.DialogInterface.OnDismissListener f183477o = new com.tencent.mm.plugin.webview.stub.p(this);

    /* renamed from: p, reason: collision with root package name */
    public int f183478p = 0;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f183479q = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.webview.stub.q(this), true);

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f183480r = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.webview.stub.r(this), true);

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return getIntent().getIntExtra("screen_orientation", -1);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (fp.h.c(21)) {
            getWindow().setStatusBarColor(0);
        }
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        if (getIntent().getIntExtra("proxyui_darkmode_key", 0) == 1) {
            updataStatusBarIcon(true);
        }
        com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper webViewStubCallbackWrapper = (com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) getIntent().getParcelableExtra("webview_stub_callbacker_key");
        if (webViewStubCallbackWrapper != null) {
            this.f183470e = webViewStubCallbackWrapper.f183795d;
        }
        android.content.Intent intent = getIntent();
        int intExtra = intent.getIntExtra("proxyui_action_code_key", 0);
        this.f183472g = intent.getIntExtra("webview_binder_id", 0);
        this.f183473h = intent.getStringExtra("proxyui_function_key");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubProxyUI", "onCreate, actionCode = %d, binderID = %d, functionName=%s", java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(this.f183472g), this.f183473h);
        if ("startMonitoringBeacons".equals(this.f183473h)) {
            this.f183469d = true;
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f183479q;
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f183477o;
        switch (intExtra) {
            case 1:
                if (com.tencent.mm.ui.bk.w0()) {
                    this.f183475m = true;
                    com.tencent.mm.ui.fj.e("com.tencent.mm.ui.transmit.SelectConversationUI", 0);
                    com.tencent.mm.ui.fj.e("com.tencent.mm.ui.chatting.ChattingUI", 0);
                }
                if (!this.f183471f) {
                    b4Var.c(100L, 100L);
                }
                if (this.f183469d) {
                    this.f183480r.c(5000L, 5000L);
                    return;
                }
                return;
            case 2:
                runOnUiThread(new com.tencent.mm.plugin.webview.stub.i(this));
                return;
            case 3:
                com.tencent.mm.storage.ja m07 = ((com.tencent.mm.storage.ka) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj()).m0("@t.qq.com");
                com.tencent.mm.ui.widget.dialog.j0 j0Var = null;
                if (!c01.z1.s()) {
                    j0Var = db5.e1.n(this, com.tencent.mm.R.string.f490972bf0, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.webview.stub.j(this), null);
                } else if (m07 == null || com.tencent.mm.sdk.platformtools.t8.K0(m07.f195058b)) {
                    j0Var = db5.e1.i(this, com.tencent.mm.R.string.j09, com.tencent.mm.R.string.f490573yv);
                } else {
                    java.lang.String stringExtra = getIntent().getStringExtra("shortUrl");
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    int intExtra2 = getIntent().getIntExtra("type", 0);
                    ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
                    gm0.j1.d().g(new com.tencent.mm.modelsimple.e1(intExtra2, stringExtra, ""));
                    try {
                        this.f183470e.v3(0);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.WebViewStubProxyUI", "setTitlePbVisibility, ex = " + e17.getMessage());
                    }
                }
                if (j0Var == null) {
                    finish();
                    return;
                } else {
                    j0Var.setOnDismissListener(onDismissListener);
                    return;
                }
            case 4:
                b4Var.c(100L, 100L);
                return;
            case 5:
                o25.x1 x1Var = (o25.x1) i95.n0.c(o25.x1.class);
                java.lang.String stringExtra2 = intent.getStringExtra("proxyui_handle_event_url");
                ((com.tencent.mm.app.plugin.n) x1Var).getClass();
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                    return;
                }
                if (stringExtra2.endsWith("@mailto@")) {
                    com.tencent.mm.pluginsdk.ui.span.u0.c(this, stringExtra2.substring(0, stringExtra2.length() - 8), onDismissListener);
                    return;
                } else {
                    if (stringExtra2.endsWith("@tel@")) {
                        java.lang.String substring = stringExtra2.substring(0, stringExtra2.length() - 5);
                        android.os.Bundle bundle2 = new android.os.Bundle();
                        bundle2.putInt("fromScene", 3);
                        com.tencent.mm.pluginsdk.ui.span.u0.d(this, substring, onDismissListener, bundle2);
                        return;
                    }
                    return;
                }
            case 6:
                int intExtra3 = getIntent().getIntExtra("proxyui_expired_errtype", 0);
                int intExtra4 = getIntent().getIntExtra("proxyui_expired_errcode", 0);
                if (intExtra3 == 0 && intExtra4 == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubProxyUI", "PROXY_AC_VALUE_ACCOUNT_EXPIRED, errType & errCode should not both be 0");
                    return;
                }
                return;
            case 7:
            default:
                return;
            case 8:
                java.lang.String stringExtra3 = getIntent().getStringExtra("proxyui_phone");
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubProxyUI", "show phone span dialog, phone is empty");
                    finish();
                    return;
                }
                android.os.Bundle bundle3 = new android.os.Bundle();
                bundle3.putInt("fromScene", 3);
                com.tencent.mm.autogen.events.ShowPhoneMenuEvent showPhoneMenuEvent = new com.tencent.mm.autogen.events.ShowPhoneMenuEvent();
                am.ru ruVar = showPhoneMenuEvent.f54783g;
                ruVar.f7843a = this;
                ruVar.f7844b = stringExtra3;
                ruVar.f7845c = onDismissListener;
                ruVar.f7846d = bundle3;
                showPhoneMenuEvent.e();
                return;
            case 9:
                android.content.Intent intent2 = (android.content.Intent) getIntent().getExtras().getParcelable("proxyui_next_intent_key");
                intent2.setFlags(603979776);
                android.content.Intent intent3 = new android.content.Intent();
                intent3.setClassName(this, "com.tencent.mm.plugin.account.ui.SimpleLoginUI");
                com.tencent.mm.ui.MMWizardActivity.Y6(this, intent3, intent2);
                finish();
                return;
            case 10:
                java.lang.String stringExtra4 = getIntent().getStringExtra("KAppId");
                java.lang.String stringExtra5 = getIntent().getStringExtra("shortcut_user_name");
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra4) || com.tencent.mm.sdk.platformtools.t8.K0(stringExtra5)) {
                    return;
                }
                com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.webview.stub.k(this));
                Q.show();
                com.tencent.mm.plugin.webview.model.j0.a(com.tencent.mm.sdk.platformtools.x2.f193071a, stringExtra5, stringExtra4, new com.tencent.mm.plugin.webview.stub.m(this, Q));
                return;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (com.tencent.mm.ui.bk.w0() && this.f183475m) {
            com.tencent.mm.ui.fj.k("com.tencent.mm.ui.transmit.SelectConversationUI", 0);
            com.tencent.mm.ui.fj.k("com.tencent.mm.ui.chatting.ChattingUI", 0);
        }
        if (!this.f183474i) {
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(this.f183472g);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            com.tencent.mm.plugin.webview.stub.z0 z0Var = this.f183470e;
            a17.W6(context, z0Var, z0Var);
        }
        com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(this.f183472g).f6();
        if (!this.f183469d) {
            this.f183470e = null;
        }
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a18 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(this.f183472g);
        android.app.ProgressDialog progressDialog = a18.f184979h;
        if (progressDialog != null) {
            progressDialog.dismiss();
            a18.f184979h = null;
        }
        if (!this.f183474i && com.tencent.mm.sdk.platformtools.t8.D0(com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(this.f183472g).f184994w, this.f183473h)) {
            com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(this.f183472g).X6(false, this.f183473h);
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewStubProxyUI", "onDestroy setIsBusy false");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubProxyUI", "onDestroy proxyui");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (i17 != 72 && i17 != 113) {
            switch (i17) {
                case 115:
                case 116:
                case 117:
                case 118:
                case 119:
                case 120:
                    break;
                default:
                    switch (i17) {
                        case com.tencent.mm.plugin.appbrand.jsapi.pay.a2.CTRL_INDEX /* 149 */:
                        case 150:
                        case 151:
                        case 152:
                            break;
                        default:
                            return;
                    }
            }
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(this.f183472g).mmOnActivityResult(i17, 0, null);
        } else {
            com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(this.f183472g).mmOnActivityResult(i17, -1, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubProxyUI", "onRestoreInstanceState binderID = %d", java.lang.Integer.valueOf(this.f183472g));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubProxyUI", "onSaveInstanceState binderID = %d", java.lang.Integer.valueOf(this.f183472g));
    }
}
