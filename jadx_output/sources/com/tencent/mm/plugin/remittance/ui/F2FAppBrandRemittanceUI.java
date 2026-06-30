package com.tencent.mm.plugin.remittance.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class F2FAppBrandRemittanceUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f157091f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f157092g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.z2 f157093h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f157094i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f157089d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f157090e = "";

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f157095m = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BusiF2fPaySuccEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.remittance.ui.F2FAppBrandRemittanceUI.1
        {
            this.__eventId = -1359897903;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.BusiF2fPaySuccEvent busiF2fPaySuccEvent) {
            com.tencent.mm.autogen.events.BusiF2fPaySuccEvent busiF2fPaySuccEvent2 = busiF2fPaySuccEvent;
            if (busiF2fPaySuccEvent2 == null) {
                return false;
            }
            am.e1 e1Var = busiF2fPaySuccEvent2.f54014g;
            if (!e1Var.f6518c) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "f2f appbrand callback data.pay_fail_reason :%s，event.data.pay_success_action: %s，event.data.pay_channel:%s ,event.data.app_id :%s ", java.lang.Integer.valueOf(e1Var.f6521f), java.lang.Integer.valueOf(e1Var.f6522g), java.lang.Integer.valueOf(e1Var.f6523h), e1Var.f6524i);
            if (e1Var.f6523h != 56) {
                com.tencent.mars.xlog.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "is not from F2FAppBrandRemittance，reutrn ");
            } else {
                com.tencent.mm.plugin.remittance.ui.F2FAppBrandRemittanceUI f2FAppBrandRemittanceUI = com.tencent.mm.plugin.remittance.ui.F2FAppBrandRemittanceUI.this;
                if (!f2FAppBrandRemittanceUI.f157089d.equals(e1Var.f6524i)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "is not the same appid ");
                } else if (e1Var.f6522g == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "event.data.pay_success_action == 1，reutrn ");
                } else {
                    int i17 = e1Var.f6521f;
                    if (i17 != 0) {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3) {
                                    com.tencent.mm.ui.o2 o2Var = com.tencent.mm.ui.o2.CANCEL;
                                    if (i17 != 4) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "unknown pay failreason");
                                        f2FAppBrandRemittanceUI.T6(o2Var, "");
                                    } else {
                                        f2FAppBrandRemittanceUI.T6(o2Var, "");
                                    }
                                } else {
                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19821, 9, f2FAppBrandRemittanceUI.f157089d, 0);
                                    f2FAppBrandRemittanceUI.T6(com.tencent.mm.ui.o2.SUCCESS, "");
                                }
                            }
                        }
                    }
                    f2FAppBrandRemittanceUI.T6(com.tencent.mm.ui.o2.FAIL, "pay fail");
                }
            }
            return true;
        }
    };

    /* renamed from: n, reason: collision with root package name */
    public final y60.e f157096n = new com.tencent.mm.plugin.remittance.ui.h(this);

    public final void T6(java.lang.Enum r47, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "setActivityResultData result :%s , errmsg : %s", r47, str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_result_pay_result", r47);
        intent.putExtra("key_result_error_msg", str);
        setResult(-1, intent);
        finish();
    }

    public final void U6(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "showErrorDialog,errMsg:%s", str);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getContext());
        u1Var.u("");
        u1Var.g(str);
        u1Var.a(true);
        u1Var.m(com.tencent.mm.R.string.l_e);
        u1Var.l(new com.tencent.mm.plugin.remittance.ui.g(this));
        u1Var.q(false);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = u1Var.f211998c;
        if (j0Var != null) {
            this.f157094i = j0Var;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        T6(com.tencent.mm.ui.o2.CANCEL, "");
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "onCreate（）");
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        getWindow().setFlags(1024, 1024);
        if (getSupportActionBar() != null) {
            getSupportActionBar().o();
        }
        this.f157089d = getIntent().getStringExtra("key_app_id");
        java.lang.String stringExtra = getIntent().getStringExtra("key_confirm_id");
        this.f157090e = stringExtra;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            T6(com.tencent.mm.ui.o2.FAIL, "confirm_id is empty");
        }
        gm0.j1.d().a(2850, this);
        gm0.j1.d().g(new com.tencent.mm.plugin.remittance.model.u(this.f157090e, this.f157089d));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "onDestroy()");
        super.onDestroy();
        android.widget.ImageView imageView = this.f157091f;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        android.graphics.Bitmap bitmap = this.f157092g;
        if (bitmap != null && !bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "bitmap recycle %s", bitmap);
            bitmap.recycle();
        }
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        y60.e eVar = this.f157096n;
        ((x60.e) fVar).getClass();
        x51.w0.e(eVar);
        this.f157095m.dead();
        gm0.j1.d().q(2850, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "onPause()");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "onResume()");
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        android.view.View view;
        com.tencent.mars.xlog.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "on Scene End：errType %s , errCode：%s，errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var instanceof com.tencent.mm.plugin.remittance.model.u) {
            if (i17 != 0 || i18 != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "NetSceneF2FMinniProgramConfirm on SceneEnd faile show error dialog ");
                U6(str);
                return;
            }
            r45.xv xvVar = ((com.tencent.mm.plugin.remittance.model.u) m1Var).f157028f;
            if (xvVar == null) {
                xvVar = new r45.xv();
            }
            r45.xv xvVar2 = xvVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "NetSceneF2FMinniProgramConfirm on SceneEnd ok，retcode:%s, retMsg：%s", java.lang.Integer.valueOf(xvVar2.f390465d), xvVar2.f390466e);
            if (xvVar2.f390465d != 0) {
                U6(xvVar2.f390466e);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "showHalfDialog");
            if (com.tencent.mm.sdk.platformtools.t8.K0(xvVar2.f390468g)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "res == null || Util.isNullOrNil(res.qrcode)");
                T6(com.tencent.mm.ui.o2.FAIL, "get qrcode fail");
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19821, 1, this.f157089d, 0);
            this.f157093h = new com.tencent.mm.ui.widget.dialog.z2(getContext(), 2, 3);
            android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.a_r, null);
            ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.aa_)).setOnClickListener(new com.tencent.mm.plugin.remittance.ui.e(this));
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.dlv);
            textView.setText(xvVar2.f390467f);
            textView.getPaint().setFakeBoldText(true);
            this.f157093h.s(inflate);
            android.view.View inflate2 = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.a_q, null);
            android.widget.ImageView imageView = (android.widget.ImageView) inflate2.findViewById(com.tencent.mm.R.id.dls);
            this.f157091f = imageView;
            imageView.setImageBitmap(null);
            if (com.tencent.mm.sdk.platformtools.t8.K0(xvVar2.f390469h)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "qrcode： res.head_img null");
                view = inflate2;
            } else {
                java.lang.String str2 = xvVar2.f390468g;
                java.lang.String str3 = xvVar2.f390469h;
                com.tencent.mars.xlog.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "contentUrl： %s ， headUrl：%s", str2, str3);
                view = inflate2;
                this.f157092g = ww1.r.a(this, str2, c01.z1.r(), 1, str3, true, com.tencent.mm.sdk.platformtools.j.d(this, 197.0f), this.f157096n, false, 1, 2.0f, false);
            }
            android.graphics.Bitmap bitmap = this.f157092g;
            if (bitmap == null || bitmap.isRecycled()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "qrcode： bmp null ");
            } else {
                this.f157091f.setImageBitmap(this.f157092g);
            }
            ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.dlu)).setText(xvVar2.f390470i);
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.dlw);
            textView2.setText(xvVar2.f390471m);
            textView2.getPaint().setFakeBoldText(true);
            this.f157093h.j(view);
            this.f157093h.y(xvVar2.f390472n);
            this.f157093h.x(0);
            com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f157093h;
            z2Var.F = new com.tencent.mm.plugin.remittance.ui.f(this, xvVar2);
            z2Var.C();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "onWindowFocusChanged");
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f157093h;
        if (z2Var != null && !z2Var.h()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "onWindowFocusChanged：mHalfBottomDialog isShowHalfDialog %s, finish Activity", java.lang.Boolean.valueOf(this.f157093h.h()));
            this.f157093h = null;
            T6(com.tencent.mm.ui.o2.CANCEL, "");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19821, 3, this.f157089d, 0);
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f157094i;
        if (j0Var != null && !j0Var.isShowing()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "onWindowFocusChanged isShowing:%s,finish Activity", java.lang.Boolean.valueOf(this.f157094i.isShowing()));
            this.f157094i = null;
            T6(com.tencent.mm.ui.o2.FAIL, "get qrcode fail");
        }
        super.onWindowFocusChanged(z17);
    }
}
