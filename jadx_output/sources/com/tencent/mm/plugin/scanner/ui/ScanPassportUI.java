package com.tencent.mm.plugin.scanner.ui;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/scanner/ui/ScanPassportUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "com/tencent/mm/plugin/scanner/ui/n1", "scan-card_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
/* loaded from: classes11.dex */
public final class ScanPassportUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f159343i = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.view.t0 f159345e;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f159347g;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f159344d = "MicroMsg.ScanPassportUI";

    /* renamed from: f, reason: collision with root package name */
    public boolean f159346f = true;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.scanner.ui.p1 f159348h = new com.tencent.mm.plugin.scanner.ui.p1(this);

    public final void T6() {
        com.tencent.mm.autogen.events.ScanPassportResultEvent scanPassportResultEvent = new com.tencent.mm.autogen.events.ScanPassportResultEvent();
        am.ws wsVar = scanPassportResultEvent.f54733g;
        wsVar.f8319a = 3;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("scan_detail", 9);
        jSONObject.put("scan_time", java.lang.System.currentTimeMillis());
        com.tencent.mm.plugin.scanner.view.t0 t0Var = this.f159345e;
        jSONObject.put("scan_session_id", t0Var != null ? t0Var.getCurSession() : 0L);
        wsVar.f8320b = jSONObject.toString();
        scanPassportResultEvent.e();
        com.tencent.mm.autogen.events.ScanPassportResultEvent scanPassportResultEvent2 = new com.tencent.mm.autogen.events.ScanPassportResultEvent();
        scanPassportResultEvent2.f54733g.f8319a = 2;
        scanPassportResultEvent2.e();
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.chq;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.util.HashMap hashMap;
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(5892);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.m7j);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.FrameLayout");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById;
        this.f159345e = new com.tencent.mm.plugin.scanner.view.t0(this);
        java.lang.String stringExtra = getIntent().getStringExtra("key_basescanui_scan_detail_msg_map");
        com.tencent.mm.plugin.scanner.view.t0 t0Var = this.f159345e;
        if (t0Var != null) {
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(stringExtra);
            java.lang.String str = this.f159344d;
            if (K0) {
                com.tencent.mars.xlog.Log.e(str, "parseHashMapFromJSONStr: objStr is null!");
            } else {
                try {
                    kotlin.jvm.internal.o.d(stringExtra);
                    org.json.JSONObject jSONObject = new org.json.JSONObject(stringExtra);
                    hashMap = new java.util.HashMap();
                    java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        java.lang.String string = jSONObject.getString(next);
                        kotlin.jvm.internal.o.d(next);
                        kotlin.jvm.internal.o.d(string);
                        hashMap.put(next, string);
                    }
                } catch (java.lang.Exception unused) {
                    com.tencent.mars.xlog.Log.e(str, "parseHashMapFromJSONStr: JSON error!");
                }
                t0Var.setScanDetailMsgMap(hashMap);
            }
            hashMap = null;
            t0Var.setScanDetailMsgMap(hashMap);
        }
        frameLayout.addView(this.f159345e, 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.tencent.mm.plugin.scanner.view.t0 t0Var2 = this.f159345e;
        if (t0Var2 != null) {
            t0Var2.setCurSession(java.lang.System.currentTimeMillis());
        }
        android.widget.Button button = new android.widget.Button(this);
        button.setWidth(i65.a.b(getContext(), 28));
        button.setHeight(i65.a.b(getContext(), 28));
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.tencent.mm.R.raw.arrow_left_circle_filled);
        com.tencent.mm.ui.uk.f(drawable, -1);
        button.setBackgroundDrawable(drawable);
        button.setContentDescription(getContext().getString(com.tencent.mm.R.string.b9a));
        button.setOnClickListener(new com.tencent.mm.plugin.scanner.ui.o1(this));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479706d1), getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn), 0, 0);
        frameLayout.addView(button, layoutParams);
        this.f159347g = button;
        com.tencent.mm.plugin.scanner.view.t0 t0Var3 = this.f159345e;
        if (t0Var3 != null) {
            com.tencent.stubs.logger.Log.i("ScanView", "onCreate");
            t0Var3.d();
        }
        setMMTitle(com.tencent.mm.R.string.i9c);
        com.tencent.mm.plugin.scanner.view.t0 t0Var4 = this.f159345e;
        if (t0Var4 != null) {
            t0Var4.setScanCallback(this.f159348h);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        T6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        android.view.WindowManager windowManager;
        android.view.Display defaultDisplay;
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        android.widget.Button button = this.f159347g;
        java.lang.Integer num = null;
        android.view.ViewGroup.LayoutParams layoutParams = button != null ? button.getLayoutParams() : null;
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        if (!(context instanceof android.app.Activity)) {
            context = null;
        }
        if (context != null && (windowManager = context.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            num = java.lang.Integer.valueOf(defaultDisplay.getRotation());
        }
        if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 2)) {
            layoutParams2.leftMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479706d1);
            layoutParams2.topMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn);
        } else {
            layoutParams2.leftMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479706d1);
            layoutParams2.topMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
        }
        android.widget.Button button2 = this.f159347g;
        if (button2 == null) {
            return;
        }
        button2.setLayoutParams(layoutParams2);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(2);
        hideTitleView();
        initView();
        java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.scanner.view.t0 t0Var = this.f159345e;
        if (t0Var != null) {
            t0Var.u();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        com.tencent.mars.xlog.Log.i(this.f159344d, "summerper onRequestPermissionsResult requestCode[%d],grantResults len[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(grantResults.length), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 16) {
            if ((!(grantResults.length == 0)) && grantResults[0] == -1) {
                this.f159346f = false;
                db5.e1.C(this, getString(com.tencent.mm.R.string.hh8), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.scanner.ui.q1(this), new com.tencent.mm.plugin.scanner.ui.r1(this));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0044  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            r10 = this;
            super.onResume()
            boolean r0 = r10.f159346f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "should check camera %s"
            java.lang.String r2 = r10.f159344d
            com.tencent.mars.xlog.Log.i(r2, r1, r0)
            boolean r0 = r10.f159346f
            r1 = 1
            if (r0 == 0) goto L41
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
            if (r0 != 0) goto L41
            r0 = 0
            goto L42
        L41:
            r0 = r1
        L42:
            if (r0 == 0) goto L7d
            boolean r0 = zo.e.d()
            if (r0 != 0) goto L76
            r0 = 2131772951(0x7f104617, float:1.9177276E38)
            java.lang.String r3 = r10.getString(r0)
            r0 = 2131772991(0x7f10463f, float:1.9177357E38)
            java.lang.String r4 = r10.getString(r0)
            r0 = 2131770054(0x7f103ac6, float:1.91714E38)
            java.lang.String r5 = r10.getString(r0)
            r0 = 2131756003(0x7f1003e3, float:1.9142901E38)
            java.lang.String r6 = r10.getString(r0)
            r7 = 0
            com.tencent.mm.plugin.scanner.ui.s1 r8 = new com.tencent.mm.plugin.scanner.ui.s1
            r8.<init>(r10)
            com.tencent.mm.plugin.scanner.ui.t1 r9 = new com.tencent.mm.plugin.scanner.ui.t1
            r9.<init>(r10)
            r2 = r10
            db5.e1.C(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L7d
        L76:
            com.tencent.mm.plugin.scanner.view.t0 r0 = r10.f159345e
            if (r0 == 0) goto L7d
            r0.f()
        L7d:
            android.content.Context r0 = r10.getApplicationContext()
            boolean r0 = iq.b.g(r0)
            if (r0 != 0) goto L9b
            android.content.Context r0 = r10.getApplicationContext()
            boolean r0 = iq.b.x(r0)
            if (r0 != 0) goto L9b
            android.content.Context r0 = r10.getApplicationContext()
            boolean r0 = iq.b.c(r0, r1)
            if (r0 == 0) goto L9e
        L9b:
            r10.T6()
        L9e:
            android.view.Window r0 = r10.getWindow()
            r1 = 128(0x80, float:1.8E-43)
            r0.addFlags(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.ui.ScanPassportUI.onResume():void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.tencent.mm.plugin.scanner.view.t0 t0Var = this.f159345e;
        if (t0Var != null) {
            t0Var.w();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(com.tencent.mm.plugin.scanner.ui.n1.class);
    }
}
