package com.tencent.mm.plugin.scanner.ui;

@db5.a(2179)
/* loaded from: classes10.dex */
public class ScanCardUI extends com.tencent.mm.ui.MMActivity implements rz3.f {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f159330r = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f159331d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.view.ScanCardRectView f159332e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f159333f;

    /* renamed from: h, reason: collision with root package name */
    public az3.b f159335h;

    /* renamed from: i, reason: collision with root package name */
    public long f159336i;

    /* renamed from: g, reason: collision with root package name */
    public boolean f159334g = true;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Boolean f159337m = java.lang.Boolean.FALSE;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f159338n = "";

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.WCPayScanBankCardNumberStruct f159339o = new com.tencent.mm.autogen.mmdata.rpt.WCPayScanBankCardNumberStruct();

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.scanner.view.q f159340p = new com.tencent.mm.plugin.scanner.ui.e1(this);

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.scanner.view.q f159341q = new com.tencent.mm.plugin.scanner.ui.f1(this);

    public final void T6() {
        com.tencent.mm.autogen.events.ScanQRCodeOprationEvent scanQRCodeOprationEvent = new com.tencent.mm.autogen.events.ScanQRCodeOprationEvent();
        scanQRCodeOprationEvent.f54734g.f8400a = 1;
        scanQRCodeOprationEvent.e();
        setResult(0);
        x();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.chq;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        getWindow().getDecorView().setSystemUiVisibility(5892);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.m7j);
        com.tencent.mm.plugin.scanner.view.ScanCardRectView scanCardRectView = new com.tencent.mm.plugin.scanner.view.ScanCardRectView(this);
        this.f159332e = scanCardRectView;
        frameLayout.addView(scanCardRectView, 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.widget.Button button = new android.widget.Button(this);
        button.setWidth(i65.a.b(getContext(), 36));
        button.setHeight(i65.a.b(getContext(), 36));
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.tencent.mm.R.raw.icons_filled_close2);
        com.tencent.mm.ui.uk.f(drawable, -1);
        button.setBackgroundDrawable(drawable);
        button.setContentDescription(getContext().getString(com.tencent.mm.R.string.b9a));
        button.setOnClickListener(new com.tencent.mm.plugin.scanner.ui.g1(this));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479706d1), getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn), 0, 0);
        frameLayout.addView(button, layoutParams);
        this.f159332e.setMode(this.f159331d);
        com.tencent.mm.plugin.scanner.view.ScanCardRectView scanCardRectView2 = this.f159332e;
        scanCardRectView2.getClass();
        com.tencent.stubs.logger.Log.i("ScanView", "onCreate");
        scanCardRectView2.d();
        int i17 = this.f159331d;
        com.tencent.mm.plugin.scanner.view.q qVar = this.f159341q;
        switch (i17) {
            case 7:
                setMMTitle(com.tencent.mm.R.string.i98);
                com.tencent.mm.autogen.mmdata.rpt.WCPayScanBankCardNumberStruct wCPayScanBankCardNumberStruct = this.f159339o;
                wCPayScanBankCardNumberStruct.f62119d = 1L;
                wCPayScanBankCardNumberStruct.k();
                this.f159332e.setScanCallback(this.f159340p);
                this.f159338n = getIntent().getStringExtra("scan_bankcard_cert_pem");
                az3.b bVar = new az3.b(this.f159331d, this.f159332e, this, this.f159339o, this.f159337m, this.f159338n, getIntent().getStringExtra("scan_bankcard_baserequest"));
                this.f159335h = bVar;
                bVar.f16165i = this.f159333f;
                return;
            case 8:
            default:
                setMMTitle("");
                return;
            case 9:
                setMMTitle(com.tencent.mm.R.string.i9b);
                this.f159332e.setScanCallback(qVar);
                return;
            case 10:
                setMMTitle(com.tencent.mm.R.string.i9_);
                this.f159332e.setScanCallback(qVar);
                return;
            case 11:
                setMMTitle(com.tencent.mm.R.string.i9c);
                this.f159332e.setScanCallback(qVar);
                return;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        T6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(getIntent().getBooleanExtra("scan_bankcard_use_http", false));
        this.f159337m = valueOf;
        if (!valueOf.booleanValue() && !gm0.j1.a()) {
            T6();
            return;
        }
        hideTitleView();
        int intExtra = getIntent().getIntExtra("BaseScanUI_select_scan_mode", -1);
        this.f159331d = intExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCardUI", "scanMode %d", java.lang.Integer.valueOf(intExtra));
        this.f159333f = getIntent().getBooleanExtra("scan_bankcard_with_confirm_ui", false);
        initView();
        this.f159336i = java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.scanner.view.ScanCardRectView scanCardRectView = this.f159332e;
        if (scanCardRectView != null) {
            scanCardRectView.m();
        }
        az3.b bVar = this.f159335h;
        if (bVar != null) {
            bVar.destroy();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCardUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults len[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr.length), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 16 && iArr.length > 0 && iArr[0] == -1) {
            this.f159334g = false;
            db5.e1.C(this, getString(com.tencent.mm.R.string.hh8), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.scanner.ui.j1(this), new com.tencent.mm.plugin.scanner.ui.k1(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0045  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            r10 = this;
            super.onResume()
            boolean r0 = r10.f159334g
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "should check camera %s"
            java.lang.String r2 = "MicroMsg.ScanCardUI"
            com.tencent.mars.xlog.Log.i(r2, r1, r0)
            boolean r0 = r10.f159334g
            r1 = 1
            if (r0 == 0) goto L42
            java.lang.Class<tb0.j> r0 = tb0.j.class
            i95.m r0 = i95.n0.c(r0)
            tb0.j r0 = (tb0.j) r0
            sb0.f r0 = (sb0.f) r0
            r0.getClass()
            r0 = 16
            r3 = 0
            java.lang.String r4 = "android.permission.CAMERA"
            boolean r0 = j35.u.a(r10, r4, r0, r3, r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "summerper checkPermission checkCamera[%b]"
            com.tencent.mars.xlog.Log.i(r2, r4, r3)
            if (r0 != 0) goto L42
            r0 = 0
            goto L43
        L42:
            r0 = r1
        L43:
            if (r0 == 0) goto L7c
            boolean r0 = zo.e.d()
            if (r0 != 0) goto L77
            r0 = 2131772951(0x7f104617, float:1.9177276E38)
            java.lang.String r3 = r10.getString(r0)
            r0 = 2131772991(0x7f10463f, float:1.9177357E38)
            java.lang.String r4 = r10.getString(r0)
            r0 = 2131770054(0x7f103ac6, float:1.91714E38)
            java.lang.String r5 = r10.getString(r0)
            r0 = 2131756003(0x7f1003e3, float:1.9142901E38)
            java.lang.String r6 = r10.getString(r0)
            r7 = 0
            com.tencent.mm.plugin.scanner.ui.h1 r8 = new com.tencent.mm.plugin.scanner.ui.h1
            r8.<init>(r10)
            com.tencent.mm.plugin.scanner.ui.i1 r9 = new com.tencent.mm.plugin.scanner.ui.i1
            r9.<init>(r10)
            r2 = r10
            db5.e1.C(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L7c
        L77:
            com.tencent.mm.plugin.scanner.view.ScanCardRectView r0 = r10.f159332e
            r0.f()
        L7c:
            android.content.Context r0 = r10.getApplicationContext()
            boolean r0 = iq.b.g(r0)
            if (r0 != 0) goto L9a
            android.content.Context r0 = r10.getApplicationContext()
            boolean r0 = iq.b.x(r0)
            if (r0 != 0) goto L9a
            android.content.Context r0 = r10.getApplicationContext()
            boolean r0 = iq.b.c(r0, r1)
            if (r0 == 0) goto L9d
        L9a:
            r10.T6()
        L9d:
            android.view.Window r0 = r10.getWindow()
            r1 = 128(0x80, float:1.8E-43)
            r0.addFlags(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.ui.ScanCardUI.onResume():void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f159332e.n();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.scanner.ui.l1.class);
    }

    @Override // rz3.f
    public void x() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCardUI", "finishUI");
        if (this.f159331d == 7) {
            com.tencent.mm.autogen.mmdata.rpt.WCPayScanBankCardNumberStruct wCPayScanBankCardNumberStruct = this.f159339o;
            if (wCPayScanBankCardNumberStruct.f62119d == 1) {
                wCPayScanBankCardNumberStruct.f62119d = 4L;
            }
            wCPayScanBankCardNumberStruct.f62120e = java.lang.System.currentTimeMillis() - this.f159336i;
            wCPayScanBankCardNumberStruct.k();
        }
        finish();
        overridePendingTransition(0, 0);
    }
}
