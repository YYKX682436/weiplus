package com.tencent.mm.plugin.palm.ui;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/palm/ui/PalmPrintFrontUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "plugin-face_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class PalmPrintFrontUI extends com.tencent.mm.ui.vas.VASActivity {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f152866h = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f152867d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f152868e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Integer f152869f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f152870g = "";

    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object U6(com.tencent.mm.plugin.palm.ui.PalmPrintFrontUI r5, kotlin.coroutines.Continuation r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof kp3.y
            if (r0 == 0) goto L16
            r0 = r6
            kp3.y r0 = (kp3.y) r0
            int r1 = r0.f311068f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f311068f = r1
            goto L1b
        L16:
            kp3.y r0 = new kp3.y
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r5 = r0.f311066d
            pz5.a r6 = pz5.a.f359186d
            int r1 = r0.f311068f
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L80
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            kotlin.ResultKt.throwOnFailure(r5)
            jp3.r r5 = jp3.s.f301025b
            r0.f311068f = r2
            java.lang.String r5 = r5.b()
            java.lang.Class<e42.e0> r1 = e42.e0.class
            i95.m r1 = i95.n0.c(r1)
            e42.e0 r1 = (e42.e0) r1
            e42.c0 r2 = e42.c0.clicfg_android_palm_print_ignore_local_res
            r3 = 0
            h62.d r1 = (h62.d) r1
            boolean r1 = r1.fj(r2, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[checkResource] ignoreLocalRes： "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r3 = "， targetPath: "
            r2.append(r3)
            r2.append(r5)
            r3 = 32
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.PalmPrintSdkManager"
            com.tencent.mars.xlog.Log.i(r3, r2)
            com.tencent.mm.plugin.facedetect.e.wi()
            kotlinx.coroutines.p0 r2 = kotlinx.coroutines.q1.f310570c
            jp3.q r3 = new jp3.q
            r4 = 0
            r3.<init>(r1, r5, r4)
            java.lang.Object r5 = kotlinx.coroutines.l.g(r2, r3, r0)
            if (r5 != r6) goto L80
            goto Lad
        L80:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L8b
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            goto Lad
        L8b:
            jp3.r r5 = jp3.s.f301025b     // Catch: java.lang.Exception -> L93
            r5.e()     // Catch: java.lang.Exception -> L93
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            goto Lad
        L93:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "[doCheckSdkResource] load so crash "
            r6.<init>(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "MicroMsg.PalmPrintCameraSettingUIC"
            com.tencent.mars.xlog.Log.e(r6, r5)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
        Lad:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.palm.ui.PalmPrintFrontUI.U6(com.tencent.mm.plugin.palm.ui.PalmPrintFrontUI, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r2.equals("zh_HK") == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6(java.lang.String r11, java.lang.Integer r12) {
        /*
            r10 = this;
            jp3.t r0 = jp3.t.f301029a
            java.lang.String r1 = "checkonlineopenpalmserviceauth"
            r0.d(r1)
            ip3.b r0 = new ip3.b
            jp3.r r1 = jp3.s.f301025b
            java.lang.String r1 = r1.c()
            java.lang.String r2 = "config.ini"
            java.lang.String r5 = com.tencent.youtu.YTBizPalmRegister.getFullVersion(r1, r2)
            int r1 = o45.wf.f343029g
            java.lang.String r6 = com.tencent.mm.sdk.platformtools.a0.a(r10, r1)
            java.lang.String r1 = r10.f152870g
            java.lang.String r2 = "1"
            boolean r2 = kotlin.jvm.internal.o.b(r1, r2)
            r3 = 2
            r4 = 1
            r7 = 3
            if (r2 == 0) goto L2a
            r1 = r7
            goto L35
        L2a:
            java.lang.String r2 = "2"
            boolean r1 = kotlin.jvm.internal.o.b(r1, r2)
            if (r1 == 0) goto L34
            r1 = r3
            goto L35
        L34:
            r1 = r4
        L35:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = com.tencent.mm.sdk.platformtools.m2.f(r10)
            if (r2 == 0) goto L72
            int r8 = r2.hashCode()
            r9 = 115861276(0x6e7e71c, float:8.7232127E-35)
            if (r8 == r9) goto L67
            r4 = 115861428(0x6e7e7b4, float:8.7233E-35)
            if (r8 == r4) goto L5e
            r3 = 115861812(0x6e7e934, float:8.7235204E-35)
            if (r8 == r3) goto L53
            goto L72
        L53:
            java.lang.String r3 = "zh_TW"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L5c
            goto L72
        L5c:
            r3 = r7
            goto L73
        L5e:
            java.lang.String r4 = "zh_HK"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L73
            goto L72
        L67:
            java.lang.String r3 = "zh_CN"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L70
            goto L72
        L70:
            r3 = r4
            goto L73
        L72:
            r3 = 4
        L73:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r2 = r0
            r3 = r11
            r4 = r12
            r7 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            pq5.g r12 = r0.l()
            r12.f(r10)
            kp3.z r0 = new kp3.z
            r0.<init>(r11, r10)
            r12.K(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.palm.ui.PalmPrintFrontUI.V6(java.lang.String, java.lang.Integer):void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        jz5.f0 f0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.palmPrintFrontUI", "[onActivityResult] :" + i18 + " , (-1 is ok)");
        if (i17 == this.f152867d) {
            if (intent != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.palmPrintFrontUI", "[onActivityResult] has result data");
                setResult(-1, intent);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.palmPrintFrontUI", "[onActivityResult] no result data, default cancel");
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("palm_error_code", 1);
                intent2.putExtra("palm_error_msg", "cancel");
                setResult(-1, intent2);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.palmPrintFrontUI", "[onActivityResult] wrong result code");
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("palm_error_code", 1);
            intent3.putExtra("palm_error_msg", "cancel");
            setResult(-1, intent3);
        }
        finish();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mars.xlog.Log.i("MicroMsg.palmPrintFrontUI", "[onBackPressed]");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("palm_error_code", 1);
        intent.putExtra("palm_error_msg", "cancel");
        setResult(-1, intent);
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.b supportActionBar;
        super.onCreate(bundle);
        setTheme(com.tencent.mm.R.style.f494400m2);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        if (getSupportActionBar() != null && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.o();
        }
        setRequestedOrientation(1);
        this.f152867d = getIntent().getIntExtra("requese_code", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("sessionid");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f152868e = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("palmSideLimit");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f152870g = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("palmCaptureMode");
        java.lang.String str = stringExtra3 != null ? stringExtra3 : "";
        int h17 = r26.h0.h(str);
        if (h17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.palmPrintFrontUI", "[onCreate] paras palmCaptureModeStr: " + str + " to int failed, defVal: 1");
            h17 = 1;
        }
        this.f152869f = h17;
        kotlinx.coroutines.y0 b17 = v65.m.b(this);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(b17, kotlinx.coroutines.internal.b0.f310484a, null, new kp3.a0(this, null), 2, null);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        if (grantResults.length == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.palmPrintFrontUI", "[onRequestPermissionsResult] grantResults length 0. requestCode： " + i17 + ", tid: " + java.lang.Thread.currentThread().getId());
            jp3.g gVar = jp3.g.f301000a;
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            gVar.i(context, com.tencent.thumbplayer.tmediacodec.codec.CodecError.RESET_CODECEXCEPTION, "ERR_PALM_CAMERA_PERSSION_CHECK", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.palmPrintFrontUI", "[onRequestPermissionsResult] requestCode : " + i17 + ", grantResults: " + grantResults[0] + " tid : " + java.lang.Thread.currentThread().getId());
        if (i17 == 16) {
            if (grantResults[0] != 0) {
                db5.e1.k(getContext(), com.tencent.mm.R.string.hh8, com.tencent.mm.R.string.hht, com.tencent.mm.R.string.g6z, com.tencent.mm.R.string.f490347sg, false, new kp3.b0(this), new kp3.c0(this));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.palmPrintFrontUI", "[onRequestPermissionsResult] camera permission check success");
                V6(this.f152868e, this.f152869f);
            }
        }
    }
}
