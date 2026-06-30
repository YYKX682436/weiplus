package kp3;

/* loaded from: classes14.dex */
public final class x extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f311048d;

    /* renamed from: e, reason: collision with root package name */
    public final jp3.s f311049e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.youtu.YTBizPalmRegister f311050f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout f311051g;

    /* renamed from: h, reason: collision with root package name */
    public android.util.Size f311052h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f311053i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f311054m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f311055n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f311056o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f311057p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f311058q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f311059r;

    /* renamed from: s, reason: collision with root package name */
    public float f311060s;

    /* renamed from: t, reason: collision with root package name */
    public float f311061t;

    /* renamed from: u, reason: collision with root package name */
    public double f311062u;

    /* renamed from: v, reason: collision with root package name */
    public double f311063v;

    /* renamed from: w, reason: collision with root package name */
    public long f311064w;

    /* renamed from: x, reason: collision with root package name */
    public long f311065x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f311048d = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c).plus(new kotlinx.coroutines.x0("PalmPrintVideoRecord")));
        this.f311049e = new jp3.s();
        this.f311053i = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f311054m = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f311055n = new java.util.concurrent.atomic.AtomicBoolean(true);
    }

    public static final void O6(kp3.x xVar, int i17, java.lang.String str) {
        if (xVar.f311054m.compareAndSet(false, true)) {
            kotlinx.coroutines.l.d(xVar.f311048d, null, null, new kp3.i(xVar, i17, str, null), 3, null);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.PalmPrintCameraSettingUIC", "[handleTimeout] ignore. isVerifyHadResult is true.");
        }
    }

    public static final void P6(kp3.x xVar) {
        com.tencent.youtu.YTBizPalmRegister yTBizPalmRegister = xVar.f311050f;
        if (yTBizPalmRegister == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintCameraSettingUIC", "[onRegisterTipSuccess] error, ytRegister is null!");
            jp3.g.f301000a.i(xVar.getActivity(), 80012, "ERR_PALM_SDK_VERIFY", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintCameraSettingUIC", "[onRegisterTipSuccess]");
        if (xVar.f311054m.compareAndSet(false, true)) {
            kotlinx.coroutines.l.d(xVar.f311048d, null, null, new kp3.n(xVar, yTBizPalmRegister, null), 3, null);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.PalmPrintCameraSettingUIC", "[onRegisterTipSuccess] ignore, isVerifyHadResult is true!");
        }
    }

    public final void Q6(int i17) {
        android.view.View decorView;
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintCameraSettingUIC", "[startPalmTimer] type: " + i17 + "  (1:focus、2：process、3：record)");
        if (i17 != 1) {
            if (i17 == 2) {
                com.tencent.mm.sdk.platformtools.b4 b4Var = this.f311057p;
                if (b4Var == null) {
                    com.tencent.mm.sdk.platformtools.b4 b4Var2 = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new kp3.u(this), false);
                    this.f311057p = b4Var2;
                    b4Var2.c(60000L, 60000L);
                    return;
                } else {
                    if (b4Var != null) {
                        b4Var.d();
                    }
                    com.tencent.mm.sdk.platformtools.b4 b4Var3 = this.f311057p;
                    if (b4Var3 != null) {
                        b4Var3.c(60000L, 60000L);
                        return;
                    }
                    return;
                }
            }
            if (i17 != 3) {
                com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintCameraSettingUIC", "[startTimer]： unknown type");
                return;
            }
            com.tencent.mm.sdk.platformtools.b4 b4Var4 = this.f311058q;
            if (b4Var4 == null) {
                com.tencent.mm.sdk.platformtools.b4 b4Var5 = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new kp3.v(this), false);
                this.f311058q = b4Var5;
                b4Var5.c(30000L, 30000L);
                return;
            } else {
                if (b4Var4 != null) {
                    b4Var4.d();
                }
                com.tencent.mm.sdk.platformtools.b4 b4Var6 = this.f311058q;
                if (b4Var6 != null) {
                    b4Var6.c(30000L, 30000L);
                    return;
                }
                return;
            }
        }
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(getContext());
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f310116d = a17.f197135a;
        kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
        int i18 = a17.f197136b;
        f0Var2.f310116d = i18;
        if (f0Var.f310116d <= 0 || i18 <= 0) {
            android.graphics.Rect rect = new android.graphics.Rect();
            android.view.Window window = getActivity().getWindow();
            if (window != null && (decorView = window.getDecorView()) != null) {
                decorView.getWindowVisibleDisplayFrame(rect);
            }
            f0Var.f310116d = rect.right - rect.left;
            f0Var2.f310116d = rect.bottom - rect.top;
        }
        if (this.f311052h != null) {
            this.f311062u = f0Var.f310116d / r10.getWidth();
            this.f311063v = f0Var2.f310116d / r10.getHeight();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintCameraSettingUIC", "[startTimer] screenWidth： " + f0Var.f310116d + ", screenHeight ：" + f0Var2.f310116d + " , xRatio: " + this.f311062u + " , yRatio : " + this.f311063v);
        com.tencent.mm.sdk.platformtools.b4 b4Var7 = this.f311056o;
        if (b4Var7 == null) {
            com.tencent.mm.sdk.platformtools.b4 b4Var8 = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new kp3.t(this, f0Var, f0Var2), true);
            this.f311056o = b4Var8;
            b4Var8.c(500L, 2500L);
        } else {
            if (b4Var7 != null) {
                b4Var7.d();
            }
            com.tencent.mm.sdk.platformtools.b4 b4Var9 = this.f311056o;
            if (b4Var9 != null) {
                b4Var9.c(500L, 2500L);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R6(int r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kp3.x.R6(int, java.lang.String, java.lang.String):void");
    }

    public final void S6() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f311057p;
        if (b4Var != null) {
            b4Var.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = this.f311058q;
        if (b4Var2 != null) {
            b4Var2.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var3 = this.f311056o;
        if (b4Var3 != null) {
            b4Var3.d();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintCameraSettingUIC", "[onDestroy]");
        com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout cameraKitRecordViewLayout = this.f311051g;
        if (cameraKitRecordViewLayout != null) {
            cameraKitRecordViewLayout.e();
        }
        kotlinx.coroutines.z0.e(this.f311048d, null, 1, null);
        S6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintCameraSettingUIC", "[onPause]");
        com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout cameraKitRecordViewLayout = this.f311051g;
        if (cameraKitRecordViewLayout != null) {
            cameraKitRecordViewLayout.f();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintCameraSettingUIC", "[onResume]");
        com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout cameraKitRecordViewLayout = this.f311051g;
        if (cameraKitRecordViewLayout != null) {
            cameraKitRecordViewLayout.h();
        }
    }
}
