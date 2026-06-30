package com.tencent.mm.plugin.webview.stub;

@db5.a(7)
/* loaded from: classes12.dex */
public class WebviewScanImageActivity extends com.tencent.mm.ui.MMActivity {

    /* renamed from: f, reason: collision with root package name */
    public int f183517f;

    /* renamed from: g, reason: collision with root package name */
    public int f183518g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f183519h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f183520i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f183521m;

    /* renamed from: d, reason: collision with root package name */
    public boolean f183515d = false;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f183516e = null;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f183522n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.webview.stub.WebviewScanImageActivity.1
        {
            this.__eventId = 1280295539;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent notifyDealQBarStrResultEvent) {
            com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent notifyDealQBarStrResultEvent2 = notifyDealQBarStrResultEvent;
            if (notifyDealQBarStrResultEvent2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebviewScanImageActivity", "event is null or not a instant of NotifyDealQBarStrResultEvent");
                return false;
            }
            am.kl klVar = notifyDealQBarStrResultEvent2.f54539g;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebviewScanImageActivity", "notify Event: %d", java.lang.Integer.valueOf(klVar.f7168c));
            android.app.Activity activity = klVar.f7167b;
            com.tencent.mm.plugin.webview.stub.WebviewScanImageActivity webviewScanImageActivity = com.tencent.mm.plugin.webview.stub.WebviewScanImageActivity.this;
            if (activity != webviewScanImageActivity || !klVar.f7166a.equals(webviewScanImageActivity.f183516e)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebviewScanImageActivity", "not the same, eventStr: %s, origin: %s", klVar.f7166a, webviewScanImageActivity.f183516e);
                return false;
            }
            int i17 = klVar.f7168c;
            com.tencent.mm.sdk.event.IListener iListener = webviewScanImageActivity.f183522n;
            if (i17 == 0 || i17 == 1 || i17 == 2) {
                iListener.dead();
                webviewScanImageActivity.finish();
                return false;
            }
            if (i17 != 3) {
                return false;
            }
            iListener.dead();
            webviewScanImageActivity.finish();
            return false;
        }
    };

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewScanImageActivity", "hy: on create");
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        if (com.tencent.mm.sdk.platformtools.t8.K0(getIntent().getStringExtra("img_gallery_session_id"))) {
            java.lang.String stringExtra = getIntent().getStringExtra("key_string_for_url");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                java.lang.String a17 = c01.n2.a("WebviewQrCode");
                c01.l2 c17 = c01.n2.d().c(a17, true);
                c17.i("url", stringExtra);
                c17.i("Contact_Sub_Scene", java.lang.Integer.valueOf(((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(stringExtra) ? 1 : 6));
                c17.i("Contact_Scene_Note", stringExtra);
                getIntent().putExtra("img_gallery_session_id", a17);
            }
        }
        setContentView(com.tencent.mm.R.layout.f489199bo0);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewScanImageActivity", "hy: on pause");
        com.tencent.mm.autogen.events.CancelDealQBarStrEvent cancelDealQBarStrEvent = new com.tencent.mm.autogen.events.CancelDealQBarStrEvent();
        am.p1 p1Var = cancelDealQBarStrEvent.f54025g;
        p1Var.f7594b = this;
        p1Var.f7593a = this.f183516e;
        cancelDealQBarStrEvent.e();
        this.f183522n.dead();
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewScanImageActivity", "hy: on start");
        if (!this.f183515d && getIntent() != null) {
            this.f183516e = getIntent().getStringExtra("key_string_for_scan");
            this.f183517f = getIntent().getIntExtra("key_codetype_for_scan", 0);
            this.f183518g = getIntent().getIntExtra("key_codeversion_for_scan", 0);
            this.f183519h = getIntent().getStringExtra("key_string_for_url");
            this.f183520i = getIntent().getStringExtra("key_string_for_image_url");
            this.f183521m = getIntent().getStringExtra("key_string_for_wxapp_id");
            int intExtra = getIntent().getIntExtra("geta8key_init_request_id", 0);
            if (this.f183516e != null) {
                this.f183522n.alive();
                com.tencent.mm.autogen.events.DealQBarStrEvent dealQBarStrEvent = new com.tencent.mm.autogen.events.DealQBarStrEvent();
                am.r3 r3Var = dealQBarStrEvent.f54079g;
                r3Var.f7781b = this;
                r3Var.f7780a = this.f183516e;
                r3Var.f7783d = this.f183518g;
                r3Var.f7782c = this.f183517f;
                r3Var.f7784e = 6;
                r3Var.f7789j = this.f183520i;
                r3Var.f7788i = getIntent().getIntExtra("geta8key_scene", 40);
                r3Var.f7792m = getIntent().getStringExtra("key_file_path_for_scan");
                r3Var.f7794o = true;
                boolean booleanExtra = getIntent().getBooleanExtra("key_delete_file_after_deal", false);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(r3Var.f7792m)) {
                    r3Var.f7793n = com.tencent.mm.vfs.w6.N(r3Var.f7792m, 0, -1);
                    java.lang.String str = r3Var.f7792m;
                    if (booleanExtra) {
                        com.tencent.mm.vfs.w6.h(str);
                    }
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("stat_app_id", this.f183521m);
                bundle.putString("stat_url", this.f183519h);
                bundle.putInt("stat_scene", 4);
                bundle.putInt("geta8key_init_request_id", intExtra);
                bundle.putString("stat_send_msg_user", getIntent().getStringExtra("key_string_for_from_username"));
                bundle.putString("wxappPathWithQuery", getIntent().getStringExtra("wxappPathWithQuery"));
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f183521m)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebviewScanImageActivity", "addStatInfo4AppBrand, from h5");
                    bundle.putInt("LaunchCodeScene_ScanScene", 3);
                    bundle.putInt("pay_qrcode_session_type", 4);
                    bundle.putString("pay_qrcode_session_name", this.f183519h);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebviewScanImageActivity", "addStatInfo4AppBrand, from wxapp");
                    bundle.putInt("LaunchCodeScene_ScanScene", 5);
                    bundle.putInt("pay_qrcode_session_type", 5);
                    bundle.putString("pay_qrcode_session_name", this.f183521m);
                }
                java.lang.String stringExtra = getIntent().getStringExtra("payInitRawUrl");
                long longExtra = getIntent().getLongExtra("payInitTimestamp", 0L);
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    stringExtra = this.f183519h;
                }
                if (longExtra == 0) {
                    longExtra = c01.id.a() / 1000;
                }
                bundle.putString("payInitRawUrl", stringExtra);
                bundle.putLong("payInitTimestamp", longExtra);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebviewScanImageActivity", "WebView scan initRawUrl: %s, initTimestamp: %d", stringExtra, java.lang.Long.valueOf(longExtra));
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f183521m)) {
                    java.lang.String stringExtra2 = getIntent().getStringExtra("key_string_for_url");
                    r45.nu3 nu3Var = new r45.nu3();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                        try {
                            nu3Var.f381685d = xw4.b.c(stringExtra2);
                            jd0.d2 d2Var = (jd0.d2) ((kd0.s2) i95.n0.c(kd0.s2.class));
                            d2Var.getClass();
                            d2Var.wi(dealQBarStrEvent);
                            r3Var.f7795p.f372281d.f371137i = nu3Var;
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebviewScanImageActivity", e17, "addDealQBarStrExtraInfo exception", new java.lang.Object[0]);
                        }
                    }
                } else {
                    r45.vm4 vm4Var = new r45.vm4();
                    vm4Var.f388360d = this.f183521m;
                    vm4Var.f388361e = getIntent().getIntExtra("key_int_for_wxapp_open_scene", 0);
                    ((jd0.d2) ((kd0.s2) i95.n0.c(kd0.s2.class))).Ai(dealQBarStrEvent, 0, vm4Var);
                }
                r3Var.f7791l = bundle;
                dealQBarStrEvent.e();
            }
        }
        this.f183515d = true;
    }
}
