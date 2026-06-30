package com.tencent.mm.plugin.scanner.ui;

@db5.a(com.tencent.mm.plugin.appbrand.jsapi.uc.CTRL_INDEX)
@gm0.a2
@ul5.d(0)
/* loaded from: classes15.dex */
public class BaseScanUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements rz3.c, com.tencent.mm.plugin.scanner.view.s, com.tencent.mm.plugin.scanner.model.u {
    public static final /* synthetic */ int Z1 = 0;
    public long A;
    public long B;
    public int C;
    public int[] I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f159142J;
    public android.os.Bundle J1;
    public boolean K;
    public boolean L;
    public boolean M;
    public java.lang.Runnable M1;
    public boolean N;
    public com.tencent.mm.plugin.scanner.api.BaseScanRequest P;
    public boolean Q;
    public boolean R;
    public int S;
    public final com.tencent.mm.sdk.event.IListener X1;
    public final com.tencent.mm.sdk.event.IListener Y1;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f159143d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.ui.ScanUIRectView f159144e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher f159145f;

    /* renamed from: g, reason: collision with root package name */
    public d04.j f159146g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f159147h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView f159148i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView f159150m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.ui.widget.ScanOpenCameraFailView f159151n;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.ui.component.ScanUITopOpButtonComponent f159153p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f159156q;

    /* renamed from: t, reason: collision with root package name */
    public rz3.g f159159t;

    /* renamed from: u, reason: collision with root package name */
    public android.os.Vibrator f159160u;

    /* renamed from: v, reason: collision with root package name */
    public d04.y2 f159161v;

    /* renamed from: o, reason: collision with root package name */
    public final e04.t1 f159152o = new e04.t1();

    /* renamed from: r, reason: collision with root package name */
    public uy3.j0 f159157r = null;

    /* renamed from: s, reason: collision with root package name */
    public int f159158s = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f159162w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f159163x = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f159166y = true;

    /* renamed from: z, reason: collision with root package name */
    public boolean f159169z = true;
    public boolean D = true;
    public boolean E = true;
    public boolean F = true;
    public boolean G = true;
    public boolean H = false;
    public boolean T = false;
    public boolean U = true;
    public boolean V = true;
    public com.tencent.wechat.aff.iam_scan.f1 W = com.tencent.wechat.aff.iam_scan.f1.DEFAULT;
    public final com.tencent.mm.plugin.scanner.model.r1 X = new com.tencent.mm.plugin.scanner.model.r1();
    public boolean Y = true;
    public final com.tencent.mm.autogen.mmdata.rpt.android_scanner_performanceStruct Z = new com.tencent.mm.autogen.mmdata.rpt.android_scanner_performanceStruct();

    /* renamed from: p0, reason: collision with root package name */
    public boolean f159154p0 = false;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f159164x0 = false;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f159167y0 = false;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f159149l1 = false;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f159155p1 = false;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f159165x1 = false;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f159168y1 = false;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f159170z1 = true;
    public boolean A1 = true;
    public int B1 = 4;
    public final java.util.ArrayList C1 = new java.util.ArrayList();
    public int D1 = 0;
    public int E1 = 0;
    public java.lang.String F1 = "";
    public java.lang.String G1 = null;
    public boolean H1 = false;
    public boolean I1 = false;
    public final et5.e K1 = new et5.e();
    public final com.tencent.mm.plugin.scanner.model.x0 L1 = new com.tencent.mm.plugin.scanner.model.x0(this);
    public final sz3.q N1 = new com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass1();
    public final com.tencent.mm.plugin.scanner.model.c2 O1 = new com.tencent.mm.plugin.scanner.model.c2(new uy3.v() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.2
        @Override // uy3.v
        public void a(android.content.DialogInterface dialogInterface, int i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "scanProductDialog onDismiss exitType: %d", java.lang.Integer.valueOf(i17));
            com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
            baseScanUI.V = true;
            if (baseScanUI.T1 == 0) {
                com.tencent.mm.plugin.scanner.ui.component.ScanUITopOpButtonComponent scanUITopOpButtonComponent = baseScanUI.f159153p;
                scanUITopOpButtonComponent.getClass();
                e04.i3.b(scanUITopOpButtonComponent, true, null);
                baseScanUI.n7();
            }
            baseScanUI.G = true;
            baseScanUI.A1 = true;
            baseScanUI.a7(true);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.scanner.model.h2 h2Var = com.tencent.mm.plugin.scanner.model.h2.f158920a;
            com.tencent.mm.plugin.scanner.model.e2 e17 = h2Var.e(12);
            if (e17 != null) {
                e17.f158895d = currentTimeMillis;
            }
            int i18 = baseScanUI.f159158s;
            com.tencent.mm.plugin.scanner.api.BaseScanRequest baseScanRequest = baseScanUI.P;
            com.tencent.mm.plugin.scanner.model.e2 e18 = h2Var.e(12);
            if (e18 == null) {
                return;
            }
            e18.f158897f = i17;
            long j17 = e18.f158895d;
            long j18 = e18.f158894c;
            if (j17 > j18) {
                e18.f158896e = j17 - j18;
            }
            if (e18.f158896e > 0) {
                jz5.l b17 = h2Var.b(baseScanRequest);
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanReporter", "reportShowScanResultTime logId: %d, reportInfo: %s, scene: %d, bizId: %s, bizInfo: %s", 18560, e18, java.lang.Integer.valueOf(i18), b17.f302833d, b17.f302834e);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18560, e18.f158892a, e18.f158893b, java.lang.Long.valueOf(e18.f158894c), java.lang.Long.valueOf(e18.f158895d), java.lang.Long.valueOf(e18.f158896e), java.lang.Integer.valueOf(e18.f158897f), java.lang.Integer.valueOf(i18), b17.f302833d, b17.f302834e, com.tencent.mm.plugin.scanner.model.h2.f158921b);
            }
            com.tencent.mm.plugin.scanner.model.h2.f158923d.put(12, "");
        }

        @Override // uy3.v
        public void onCancel(android.content.DialogInterface dialogInterface) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "scanProductDialog onCancel");
            com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
            baseScanUI.T = false;
            baseScanUI.V = true;
            baseScanUI.G = true;
            baseScanUI.A1 = true;
        }

        @Override // uy3.v
        public void onShow(android.content.DialogInterface dialogInterface) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "scanProductDialog onShow");
            com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
            com.tencent.mm.plugin.scanner.ui.component.ScanUITopOpButtonComponent scanUITopOpButtonComponent = baseScanUI.f159153p;
            scanUITopOpButtonComponent.getClass();
            e04.i3.b(scanUITopOpButtonComponent, false, null);
            baseScanUI.a7(false);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.scanner.model.e2 e17 = com.tencent.mm.plugin.scanner.model.h2.f158920a.e(12);
            if (e17 == null) {
                return;
            }
            e17.f158894c = currentTimeMillis;
        }
    });
    public com.tencent.mm.plugin.scanner.model.w1 P1 = null;
    public final com.tencent.mm.plugin.scanner.model.t1 Q1 = new com.tencent.mm.plugin.scanner.model.t1() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.3
        @Override // com.tencent.mm.plugin.scanner.model.t1
        public void a(sz3.x0 x0Var) {
            sz3.w0 w0Var;
            if (x0Var.f414151e.isEmpty()) {
                w0Var = null;
            } else {
                w0Var = (sz3.w0) x0Var.f414151e.get(0);
                sz3.a1 a1Var = w0Var.f414134e;
                com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                int i17 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.Z1;
                baseScanUI.w7(w0Var, true, -1, -1, 4, a1Var);
            }
            com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI2 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
            com.tencent.mm.plugin.scanner.model.h2.v(baseScanUI2.C, baseScanUI2.S, 15, baseScanUI2.A, x0Var.f414148b);
            com.tencent.mm.plugin.scanner.model.d.a(42, x0Var.f414152f);
            int i18 = x0Var.f414147a;
            if (i18 == 4) {
                com.tencent.mm.plugin.scanner.model.h2.x(true, i18);
            }
            int i19 = w0Var.f414144o;
            java.lang.String str = w0Var.f414141l;
            if (str == null || str.isEmpty()) {
                i19 = i19 > 0 ? 99999 : 99998;
            } else if (i19 == 0) {
                i19 = 100000;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "onScanProductExpose:2 id:" + i19);
            com.tencent.mm.plugin.scanner.model.h2.y(2, baseScanUI2.D1, baseScanUI2.S, i19);
            com.tencent.mm.plugin.scanner.model.h2.w(2, baseScanUI2.D1, baseScanUI2.S, i19, w0Var.f414143n - 1);
        }

        @Override // com.tencent.mm.plugin.scanner.model.t1
        public void b(sz3.x0 x0Var, int i17, long j17, int i18, java.lang.String str) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScanUI", "onScanFailed session: %d, source: %d, errCode: %d, errMsg: %s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
            com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
            if (K0) {
                str = baseScanUI.getResources().getString(com.tencent.mm.R.string.f492934ib4);
            }
            db5.e1.y(baseScanUI, str, "", baseScanUI.getResources().getString(com.tencent.mm.R.string.f490507x1), new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.3.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i19) {
                    com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass3 anonymousClass3 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass3.this;
                    com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.n7();
                    com.tencent.mm.plugin.scanner.model.h2.C(com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.C);
                }
            });
            com.tencent.mm.plugin.scanner.model.h2.v(baseScanUI.C, baseScanUI.S, 14, baseScanUI.A, x0Var.f414148b);
            int i19 = x0Var.f414147a;
            if (i19 == 4) {
                com.tencent.mm.plugin.scanner.model.h2.x(false, i19);
            }
        }
    };
    public final sz3.l0 R1 = new com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass6();
    public final d04.i S1 = new d04.i() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.7
        @Override // d04.i
        public void a(android.view.View view, sz3.w0 w0Var, sz3.c1 c1Var, int i17, int i18) {
            sz3.v0 v0Var;
            com.tencent.wechat.aff.iam_scan.d1 d1Var;
            com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
            if (c1Var != null) {
                rz3.g gVar = baseScanUI.f159159t;
                if ((gVar instanceof rz3.i) && (v0Var = ((rz3.i) gVar).f401815h) != null) {
                    com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = baseScanUI.f159144e;
                    if (scanUIRectView != null && (d1Var = scanUIRectView.f159410y) != null) {
                        com.tencent.wechat.aff.iam_scan.a1 a1Var = d1Var.f216994p;
                        int i19 = a1Var.f216949f + 1;
                        a1Var.f216949f = i19;
                        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "onClickProductCard %s", java.lang.Integer.valueOf(i19));
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(w0Var.f414139j)) {
                        sz3.a1 a1Var2 = c1Var.f413982i;
                        if (a1Var2 != null) {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleClickCard id: ");
                            com.tencent.mm.plugin.scanner.model.ScanProductInfo scanProductInfo = a1Var2.f413959a;
                            sb6.append(scanProductInfo.getId());
                            sb6.append(", classId: ");
                            sb6.append(scanProductInfo.getClassId());
                            com.tencent.mars.xlog.Log.i("MicroMsg.MixScanGoodsImageHandler", sb6.toString());
                            sz3.n0 n0Var = new sz3.n0(c1Var, a1Var2, v0Var, i17, i18);
                            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                            sz3.b1 b1Var = a1Var2.f413962d;
                            byte[] a17 = b1Var != null ? b1Var.a() : null;
                            h0Var.f310123d = a17;
                            if (c1Var.f413987n && a17 == null) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.MixScanGoodsImageHandler", "handleClickProductAff uploadImageData null and async retry");
                                ((ku5.t0) ku5.t0.f312615d).h(new sz3.u0(new sz3.m0(h0Var, a1Var2, n0Var)), "MicroMsg.MixScanGoodsImageHandler");
                            } else if (a17 != null) {
                                sz3.b1 b1Var2 = a1Var2.f413962d;
                                java.lang.Integer valueOf = java.lang.Integer.valueOf(b1Var2 != null ? b1Var2.f413969d : 0);
                                sz3.b1 b1Var3 = a1Var2.f413962d;
                                n0Var.invoke(a17, valueOf, java.lang.Integer.valueOf(b1Var3 != null ? b1Var3.f413970e : 0));
                            } else {
                                com.tencent.mars.xlog.Log.w("MicroMsg.MixScanGoodsImageHandler", "handleClickCard uploadImageData is null, id: " + scanProductInfo.getId() + ", classId: " + scanProductInfo.getClassId());
                            }
                        }
                    } else {
                        if (c1Var.f413976c == 1002) {
                            v0Var.q(w0Var);
                        }
                        sz3.a1 a1Var3 = c1Var.f413982i;
                        if (a1Var3 == null) {
                            a1Var3 = c1Var.a();
                        }
                        sz3.a1 a1Var4 = a1Var3;
                        baseScanUI.T = true;
                        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "pauseScan");
                        com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView2 = baseScanUI.f159144e;
                        if (scanUIRectView2 != null) {
                            scanUIRectView2.G(com.tencent.wechat.aff.iam_scan.f1.DEFAULT);
                            scanUIRectView2.e();
                            scanUIRectView2.j();
                        }
                        if (a1Var4 != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "AiScanProductHandleCallback onUploadImageSuccess trackId: %s", java.lang.Integer.valueOf(w0Var.f414138i));
                            baseScanUI.w7(w0Var, false, i17, i18, 1, a1Var4);
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.ScanUI", "onUploadImageSuccess result invalid");
                        }
                    }
                }
            }
            sz3.a1 a1Var5 = c1Var != null ? c1Var.f413982i : null;
            if (a1Var5 != null) {
                com.tencent.mm.plugin.scanner.model.c cVar = a1Var5.f413964f;
                if (cVar != null) {
                    cVar.f158826c = w0Var.f414143n;
                    cVar.f158827d = w0Var.f414144o;
                }
                com.tencent.mm.plugin.scanner.model.d.a(3, cVar);
                com.tencent.mm.plugin.scanner.model.h2.w(1, baseScanUI.D1, baseScanUI.S, w0Var.f414144o, w0Var.f414143n - 1);
            }
        }
    };
    public int T1 = 0;
    public final d04.h U1 = new d04.h() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.8
        @Override // d04.h
        public void a(int i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "onProductListStateChange:" + i17);
            com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
            baseScanUI.T1 = i17;
            if (i17 == 0) {
                baseScanUI.f159144e.F();
                return;
            }
            if (i17 == 6) {
                ku5.u0 u0Var = ku5.t0.f312615d;
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.8.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass8 anonymousClass8 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass8.this;
                        com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI2 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                        if (baseScanUI2.isFinishing() || baseScanUI2.isDestroyed()) {
                            return;
                        }
                        com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI3 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                        if (baseScanUI3.isDestroyed()) {
                            return;
                        }
                        baseScanUI3.n7();
                        baseScanUI3.r7(true);
                        com.tencent.mm.plugin.scanner.ui.component.ScanUITopOpButtonComponent scanUITopOpButtonComponent = baseScanUI3.f159153p;
                        scanUITopOpButtonComponent.getClass();
                        e04.i3.b(scanUITopOpButtonComponent, true, null);
                    }
                };
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(runnable, 250L, false);
                return;
            }
            com.tencent.wechat.aff.iam_scan.f1 f1Var = com.tencent.wechat.aff.iam_scan.f1.DEFAULT;
            if (i17 == 2) {
                baseScanUI.f159144e.G(f1Var);
                return;
            }
            if (i17 != 3) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "pauseScan");
            com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = baseScanUI.f159144e;
            if (scanUIRectView != null) {
                scanUIRectView.G(f1Var);
                scanUIRectView.e();
                scanUIRectView.j();
            }
            com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.f159144e.getScanMaskView().setScanSource(3);
            com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.f159144e.getScanMaskView().i(com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.f159144e.getTextrueView());
            com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.r7(false);
            com.tencent.mm.plugin.scanner.ui.component.ScanUITopOpButtonComponent scanUITopOpButtonComponent = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.f159153p;
            scanUITopOpButtonComponent.getClass();
            e04.i3.b(scanUITopOpButtonComponent, false, null);
        }

        @Override // d04.h
        public void b(int i17, int i18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "onScanProductExpose:" + i17 + " id:" + i18);
            com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
            if (i17 != 1) {
                com.tencent.mm.plugin.scanner.model.h2.y(1, baseScanUI.D1, baseScanUI.S, i18);
                return;
            }
            int i19 = baseScanUI.D1;
            int i27 = baseScanUI.S;
            com.tencent.mm.plugin.scanner.model.h2 h2Var = com.tencent.mm.plugin.scanner.model.h2.f158920a;
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_scan_service_new_report_close_android, false)) {
                return;
            }
            int wi6 = ((yz3.m) ((kd0.r2) i95.n0.c(kd0.r2.class))).wi();
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            com.tencent.mm.plugin.scanner.model.h2 h2Var2 = com.tencent.mm.plugin.scanner.model.h2.f158920a;
            ((cy1.a) rVar).Ej("scan_goods_kv_identify", kz5.c1.k(new jz5.l("pic_from", 2), new jz5.l("result_id", com.tencent.mm.plugin.scanner.model.h2.c(i19)), new jz5.l("entrance_start_ms", com.tencent.mm.plugin.scanner.model.h2.f158922c), new jz5.l("tab_session_id", com.tencent.mm.plugin.scanner.model.h2.d(i19)), new jz5.l("entrance_id", com.tencent.mm.plugin.scanner.model.h2.f158921b), new jz5.l("scan_entrance", java.lang.Integer.valueOf(i27)), new jz5.l("goods_type", java.lang.Integer.valueOf(i18)), new jz5.l("face2face_status", java.lang.Integer.valueOf(wi6))), 33924);
        }

        @Override // d04.h
        public void c(int i17, long j17, int i18, sz3.a1 a1Var) {
            int i19 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.Z1;
            com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
            baseScanUI.h7();
            com.tencent.mm.plugin.scanner.model.h2.s(baseScanUI.C, baseScanUI.S, 1, 1, i18, baseScanUI.A, j17, i17);
            com.tencent.mm.plugin.scanner.model.d.a(35, a1Var != null ? a1Var.f413964f : null);
            if (i18 == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, 84);
                com.tencent.mm.plugin.scanner.model.h2.s(baseScanUI.C, baseScanUI.S, 2, 1, i18, baseScanUI.A, j17, i17);
            }
        }
    };
    public final com.tencent.mm.plugin.scanner.ui.ScanUIRectView.ScanCallBack V1 = new com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass9();
    public final com.tencent.mm.network.s0 W1 = new com.tencent.mm.network.r0() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.30
        @Override // com.tencent.mm.network.s0
        public void onNetworkChange(final int i17) {
            com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.30.1
                /* JADX WARN: Removed duplicated region for block: B:37:0x00b6 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x004e  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        r8 = this;
                        com.tencent.mm.plugin.scanner.ui.BaseScanUI$30 r0 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass30.this
                        com.tencent.mm.plugin.scanner.ui.BaseScanUI r1 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this
                        int r2 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.Z1
                        boolean r2 = r1.f7()
                        r3 = 1
                        r4 = 0
                        if (r2 == 0) goto L13
                        boolean r2 = r1.f159165x1
                        if (r2 == 0) goto L13
                        goto L28
                    L13:
                        int r2 = r1.C
                        r5 = 12
                        if (r2 != r5) goto L1b
                        r2 = r3
                        goto L1c
                    L1b:
                        r2 = r4
                    L1c:
                        if (r2 == 0) goto L2a
                        uy3.j0 r1 = r1.f159157r
                        if (r1 == 0) goto L2a
                        boolean r1 = r1.isShowing()
                        if (r1 == 0) goto L2a
                    L28:
                        r1 = r4
                        goto L2b
                    L2a:
                        r1 = r3
                    L2b:
                        com.tencent.mm.modelbase.r1 r2 = gm0.j1.d()
                        int r2 = r2.n()
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                        java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                        java.lang.Object[] r2 = new java.lang.Object[]{r2, r5}
                        java.lang.String r5 = "MicroMsg.ScanUI"
                        java.lang.String r6 = "onNetWorkChange %d, canResume: %b"
                        com.tencent.mars.xlog.Log.i(r5, r6, r2)
                        com.tencent.mm.plugin.scanner.ui.BaseScanUI r0 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this
                        com.tencent.mm.plugin.scanner.ui.ScanUIRectView r2 = r0.f159144e
                        r5 = 4
                        r6 = 6
                        if (r2 == 0) goto L92
                        com.tencent.mm.modelbase.r1 r7 = gm0.j1.d()
                        int r7 = r7.n()
                        if (r7 == r6) goto L72
                        com.tencent.mm.modelbase.r1 r7 = gm0.j1.d()
                        int r7 = r7.n()
                        if (r7 != r5) goto L63
                        goto L72
                    L63:
                        boolean r1 = r2.q()
                        if (r1 != 0) goto L7d
                        com.tencent.wechat.aff.iam_scan.f1 r1 = com.tencent.wechat.aff.iam_scan.f1.DEFAULT
                        r2.G(r1)
                        r2.e()
                        goto L7d
                    L72:
                        boolean r7 = r2.q()
                        if (r7 != 0) goto L7d
                        if (r1 == 0) goto L7d
                        r2.f()
                    L7d:
                        com.tencent.mm.plugin.scanner.view.BaseScanMaskView r1 = r2.f159402s
                        if (r1 == 0) goto L86
                        int r7 = r2
                        r1.k(r7)
                    L86:
                        com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView r1 = r2.f159401r
                        if (r1 == 0) goto L92
                        r1.e()
                        int r2 = r1.f159795o
                        r1.m(r2)
                    L92:
                        com.tencent.mm.modelbase.r1 r1 = gm0.j1.d()
                        int r1 = r1.n()
                        if (r1 == r6) goto Lb2
                        com.tencent.mm.modelbase.r1 r1 = gm0.j1.d()
                        int r1 = r1.n()
                        if (r1 != r5) goto La7
                        goto Lb2
                    La7:
                        boolean r1 = r0.F
                        if (r1 != 0) goto Lac
                        return
                    Lac:
                        r0.F = r4
                        r0.y7()
                        goto Lbc
                    Lb2:
                        boolean r1 = r0.F
                        if (r1 == 0) goto Lb7
                        return
                    Lb7:
                        r0.F = r3
                        r0.y7()
                    Lbc:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass30.AnonymousClass1.run():void");
                }
            });
        }
    };

    /* renamed from: com.tencent.mm.plugin.scanner.ui.BaseScanUI$1, reason: invalid class name */
    /* loaded from: classes15.dex */
    public class AnonymousClass1 implements sz3.q {
        public AnonymousClass1() {
        }

        @Override // sz3.q
        public void a(sz3.x0 x0Var, int i17, java.lang.String str) {
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI$1$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.n7();
                }
            });
            d04.j jVar = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.f159146g;
            if (jVar != null) {
                java.util.ArrayList arrayList = x0Var.f414151e;
                int a17 = jVar.a(arrayList, true);
                com.tencent.mars.xlog.Log.w("MicroMsg.ScanUI", "AiScanProductHandleCallback onUploadImageFailed pos:" + a17);
                if (a17 <= 0 || a17 > arrayList.size()) {
                    return;
                }
                sz3.w0 w0Var = (sz3.w0) arrayList.get(a17 - 1);
                com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                com.tencent.mm.plugin.scanner.model.h2.u(baseScanUI.C, baseScanUI.S, 3, a17, baseScanUI.f159146g.getF159785y(), com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.A, x0Var.f414148b, x0Var.f414149c, w0Var.f414144o, w0Var.f414143n, w0Var.f414141l, i17);
            }
        }

        @Override // sz3.q
        public void b(sz3.x0 x0Var, int i17, java.lang.String str) {
            com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
            d04.j jVar = baseScanUI.f159146g;
            if (jVar != null) {
                java.util.ArrayList arrayList = x0Var.f414151e;
                int a17 = jVar.a(arrayList, true);
                com.tencent.mars.xlog.Log.w("MicroMsg.ScanUI", "AiScanProductHandleCallback onRetrievalImageFailed pos:" + a17);
                if (a17 <= 0 || a17 > arrayList.size()) {
                    return;
                }
                sz3.w0 w0Var = (sz3.w0) arrayList.get(a17 - 1);
                com.tencent.mm.plugin.scanner.model.h2.u(baseScanUI.C, baseScanUI.S, 3, a17, baseScanUI.f159146g.getF159785y(), baseScanUI.A, x0Var.f414148b, x0Var.f414149c, w0Var.f414144o, w0Var.f414143n, w0Var.f414141l, 1004);
            }
        }

        @Override // sz3.q
        public void c(sz3.x0 x0Var) {
            sz3.w0 w0Var;
            com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
            d04.j jVar = baseScanUI.f159146g;
            if (jVar != null) {
                java.util.ArrayList arrayList = x0Var.f414151e;
                int a17 = jVar.a(arrayList, true);
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "AiScanProductHandleCallback onRetrievalImageSuccess pos:" + a17);
                if (a17 <= 0 || a17 > arrayList.size() || (w0Var = (sz3.w0) arrayList.get(a17 - 1)) == null || w0Var.f414137h != 4) {
                    return;
                }
                com.tencent.mm.plugin.scanner.model.h2.u(baseScanUI.C, baseScanUI.S, 4, a17, baseScanUI.f159146g.getF159785y(), baseScanUI.A, x0Var.f414148b, x0Var.f414149c, w0Var.f414144o, w0Var.f414143n, w0Var.f414141l, 0);
            }
        }

        @Override // sz3.q
        public boolean d(final sz3.c1 c1Var) {
            if (!com.tencent.mm.plugin.scanner.ui.BaseScanUI.U6(com.tencent.mm.plugin.scanner.ui.BaseScanUI.this, c1Var)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ScanUI", "AiScanProductHandleCallback onAddScanProductResult can not add now");
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "AiScanProductHandleCallback onAddScanProductResult fromAff: %s", java.lang.Boolean.valueOf(c1Var.f413987n));
            if (com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.f159146g == null) {
                return false;
            }
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.1.1
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.f159146g.b(c1Var, new d04.g() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.1.1.1
                        @Override // d04.g
                        public void a() {
                            com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.f159144e.z(true);
                        }

                        @Override // d04.g
                        public void b() {
                            com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass1.RunnableC00541 runnableC00541 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass1.RunnableC00541.this;
                            com.tencent.wechat.aff.iam_scan.d1 d1Var = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.f159144e.f159410y;
                            if (d1Var != null) {
                                com.tencent.wechat.aff.iam_scan.a1 a1Var = d1Var.f216994p;
                                int i17 = a1Var.f216948e + 1;
                                a1Var.f216948e = i17;
                                com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "onAddProductCard %s", java.lang.Integer.valueOf(i17));
                            }
                            com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.f159144e;
                            scanUIRectView.f159401r.c(false, new com.tencent.mm.plugin.scanner.ui.ScanUIRectView.AnonymousClass11());
                        }
                    });
                }
            });
            return true;
        }

        @Override // sz3.q
        public boolean e(final sz3.c1 c1Var, final sz3.x0 x0Var) {
            if (!com.tencent.mm.plugin.scanner.ui.BaseScanUI.U6(com.tencent.mm.plugin.scanner.ui.BaseScanUI.this, c1Var)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ScanUI", "AiScanProductHandleCallback onAddScanProductResultForFullImage can not add now");
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "AiScanProductHandleCallback onAddScanProductResultForFullImage");
            if (com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.f159146g == null) {
                return false;
            }
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.1.2
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.f159146g.b(c1Var, new d04.g() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.1.2.1
                        @Override // d04.g
                        public void a() {
                            com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass1.AnonymousClass2 anonymousClass2 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass1.AnonymousClass2.this;
                            com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.f159144e.z(true);
                            sz3.x0 x0Var2 = x0Var;
                            if (x0Var2 != null) {
                                com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.f159146g.a(x0Var2.f414151e, true);
                            }
                        }

                        @Override // d04.g
                        public void b() {
                            com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass1.AnonymousClass2 anonymousClass2 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass1.AnonymousClass2.this;
                            com.tencent.wechat.aff.iam_scan.d1 d1Var = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.f159144e.f159410y;
                            if (d1Var != null) {
                                com.tencent.wechat.aff.iam_scan.a1 a1Var = d1Var.f216994p;
                                int i17 = a1Var.f216948e + 1;
                                a1Var.f216948e = i17;
                                com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "onAddProductCard %s", java.lang.Integer.valueOf(i17));
                            }
                            com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.f159144e;
                            scanUIRectView.f159401r.c(false, new com.tencent.mm.plugin.scanner.ui.ScanUIRectView.AnonymousClass11());
                        }
                    });
                }
            });
            return true;
        }

        @Override // sz3.q
        public void f(sz3.x0 x0Var) {
            int i17;
            boolean z17 = x0Var.f414150d == 1002;
            java.util.ArrayList arrayList = x0Var.f414151e;
            com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
            if (!z17) {
                sz3.w0 w0Var = (sz3.w0) kz5.n0.Z(arrayList);
                d04.j jVar = baseScanUI.f159146g;
                int uploadingTrackId = jVar != null ? jVar.getUploadingTrackId() : -1;
                if (w0Var != null && (i17 = w0Var.f414138i) != uploadingTrackId) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ScanUI", "onUploadImageSuccess ignore, trackId not match, trackId:%d, current:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(uploadingTrackId));
                    return;
                }
                sz3.w0 w0Var2 = (sz3.w0) kz5.n0.Z(arrayList);
                sz3.w0 w0Var3 = (sz3.w0) kz5.n0.Z(arrayList);
                sz3.a1 a1Var = w0Var3 != null ? w0Var3.f414134e : null;
                sz3.z0 z0Var = x0Var.f414154h;
                if (w0Var2 == null || a1Var == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ScanUI", "onUploadImageSuccess result invalid");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "AiScanProductHandleCallback onUploadImageSuccess trackId: %s", java.lang.Integer.valueOf(w0Var2.f414138i));
                    baseScanUI.w7(w0Var2, false, z0Var != null ? z0Var.f414179a : 0, z0Var != null ? z0Var.f414180b : -1, 1, a1Var);
                }
            }
            d04.j jVar2 = baseScanUI.f159146g;
            if (jVar2 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "AiScanProductHandleCallback onUploadImageSuccess pos:" + jVar2.a(arrayList, x0Var.f414149c != 1));
            }
            if (x0Var.f414147a == 3) {
                com.tencent.mm.plugin.scanner.model.s1.f159039t = 1;
            } else {
                boolean z18 = com.tencent.mm.plugin.scanner.model.s1.f159020a;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.BaseScanUI$6, reason: invalid class name */
    /* loaded from: classes15.dex */
    public class AnonymousClass6 implements sz3.l0 {
        public AnonymousClass6() {
        }

        @Override // sz3.l0
        public void a(java.lang.String str, java.lang.String str2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "ScanProductDistribute onPop");
            com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.x();
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.BaseScanUI$9, reason: invalid class name */
    /* loaded from: classes15.dex */
    public class AnonymousClass9 implements com.tencent.mm.plugin.scanner.ui.ScanUIRectView.ScanCallBack {
        public AnonymousClass9() {
        }
    }

    public BaseScanUI() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.X1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanDarkDetectEvent>(a0Var) { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.31
            {
                this.__eventId = -890853388;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ScanDarkDetectEvent scanDarkDetectEvent) {
                com.tencent.mm.autogen.events.ScanDarkDetectEvent scanDarkDetectEvent2 = scanDarkDetectEvent;
                int i17 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.Z1;
                com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                if ((!(baseScanUI.C == 3)) && baseScanUI.G) {
                    if (scanDarkDetectEvent2.f54729g.f7932a) {
                        baseScanUI.s7(true, true);
                    } else {
                        baseScanUI.s7(false, true);
                    }
                }
                return false;
            }
        };
        this.Y1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipEvent>(a0Var) { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.32
            {
                this.__eventId = -797557590;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoipEvent voipEvent) {
                com.tencent.mm.autogen.events.VoipEvent voipEvent2 = voipEvent;
                if (voipEvent2 instanceof com.tencent.mm.autogen.events.VoipEvent) {
                    if (!gm0.j1.a()) {
                        return false;
                    }
                    if (voipEvent2.f54945g.f8415b == 3) {
                        com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                        com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = baseScanUI.f159144e;
                        if (scanUIRectView != null) {
                            scanUIRectView.t();
                        }
                        baseScanUI.finish();
                    }
                }
                return true;
            }
        };
    }

    public static boolean U6(com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI, sz3.c1 c1Var) {
        if (!baseScanUI.A1 || baseScanUI.f159162w || (c1Var != null && c1Var.f413974a == 3 && baseScanUI.T)) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = java.lang.Integer.valueOf(c1Var != null ? c1Var.f413974a : -1);
            objArr[1] = java.lang.Boolean.valueOf(baseScanUI.f159162w);
            objArr[2] = java.lang.Boolean.valueOf(baseScanUI.T);
            objArr[3] = java.lang.Boolean.valueOf(baseScanUI.A1);
            com.tencent.mars.xlog.Log.e("MicroMsg.ScanUI", "checkCanAddScanNewProduct source:%d, isScrolling: %b or needPauseScan: %b or canAddScanProduct: %s, and ignore", objArr);
        } else {
            if (baseScanUI.f7()) {
                return true;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.ScanUI", "onScanResult not scan code mode and ignore");
        }
        return false;
    }

    public static boolean V6(com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI, final com.tencent.qbar.WxQBarResult wxQBarResult, boolean z17, final com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo) {
        final int i17 = 0;
        if (!baseScanUI.K) {
            return false;
        }
        if (wxQBarResult == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScanUI", "dealWithReturnCode qBarResult is null");
        } else {
            if (baseScanUI.f159155p1 && !z17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ScanUI", "dealWithReturnCode do not direct deal with multicode");
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "dealWithReturnCode deal with qBarResult");
            java.lang.String str = wxQBarResult.f475331e;
            com.tencent.mm.autogen.events.PublishScanCodeResultEvent publishScanCodeResultEvent = new com.tencent.mm.autogen.events.PublishScanCodeResultEvent();
            java.lang.String str2 = wxQBarResult.f475332f;
            am.yo yoVar = publishScanCodeResultEvent.f54631g;
            yoVar.f8472c = str2;
            yoVar.f8471b = str;
            yoVar.f8470a = 0;
            publishScanCodeResultEvent.e();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_scan_result", str2);
            intent.putExtra("key_scan_result_raw", wxQBarResult.f475333g);
            intent.putExtra("key_scan_result_code_name", str);
            intent.putExtra("key_scan_result_code_version", wxQBarResult.f215250m);
            intent.putExtra("result_image_source", 1);
            baseScanUI.setResult(-1, intent);
            if (baseScanUI.R) {
                ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI$$h
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i18 = i17;
                        com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo2 = scanIdentifyReportInfo;
                        int i19 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.Z1;
                        com.tencent.qbar.WxQBarResult wxQBarResult2 = com.tencent.qbar.WxQBarResult.this;
                        java.lang.String str3 = wxQBarResult2.f475331e;
                        int i27 = i18 == 0 ? 4 : 34;
                        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "handleOcrReportIfNeed qBarResult: %s, source: %s, getA8KeyScene: %s, reportInfo: %s", wxQBarResult2.f475332f, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i27), scanIdentifyReportInfo2);
                        nz3.c.a(new oz3.e(i27, 0, wxQBarResult2.f475332f, com.tencent.mm.plugin.scanner.j1.a(str3), i18, "", scanIdentifyReportInfo2, oz3.f.f350266f));
                    }
                });
            }
            baseScanUI.x();
        }
        return true;
    }

    public static void W6(com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI, long j17, android.os.Bundle bundle, com.tencent.qbar.WxQBarResult wxQBarResult) {
        if (baseScanUI.f159159t == null || wxQBarResult == null || bundle == null) {
            return;
        }
        bundle.putInt("result_code_format", wxQBarResult.f475330d);
        bundle.putString("result_content", wxQBarResult.f475332f);
        bundle.putString("result_code_name", wxQBarResult.f475331e);
        bundle.putByteArray("result_raw_data", wxQBarResult.f475333g);
        com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo = (com.tencent.qbar.ScanIdentifyReportInfo) bundle.getParcelable("ScanIdentifyReportInfo.DecodeKey");
        com.tencent.qbar.WxQBarPoint wxQBarPoint = wxQBarResult.f215252o;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScannerUtil", "rotateImage");
        if (scanIdentifyReportInfo != null) {
            int i17 = scanIdentifyReportInfo.f215244f;
            try {
                android.graphics.Point point = scanIdentifyReportInfo.f215243e;
                byte[] bArr = scanIdentifyReportInfo.f215242d;
                if (bArr != null && point != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScannerUtil", "rotateImage with " + i17);
                    if (i17 % 180 != 0) {
                        int i18 = ((point.x * point.y) * 3) / 2;
                        boolean z17 = et5.h.f256676a;
                        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i18);
                        int a17 = et5.h.a(allocateDirect, et5.h.c(bArr), point.x, point.y);
                        if (a17 != 0) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.ScannerUtil", "rotateImage failed ret: %d", java.lang.Integer.valueOf(a17));
                            bundle.putByteArray("result_image_data", null);
                        } else {
                            bundle.putByteArray("result_image_data", et5.h.f(allocateDirect));
                            bundle.putInt("result_image_format", 4);
                        }
                        e04.v3.e(bundle, wxQBarPoint, new float[]{0.0f, 0.0f, point.y, point.x});
                    } else {
                        bundle.putByteArray("result_image_data", bArr);
                        bundle.putInt("result_image_format", 4);
                        e04.v3.e(bundle, wxQBarPoint, new float[]{0.0f, 0.0f, point.x, point.y});
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScannerUtil", e17, "rotateImage exception", new java.lang.Object[0]);
            }
        }
        bundle.putInt("result_image_source", 1);
        bundle.putInt("result_code_version", wxQBarResult.f215250m);
        bundle.putBoolean("key_disable_bar_code_jump_scan_goods", baseScanUI.f159167y0);
        bundle.putIntegerArrayList("key_scan_tab_bar_type_list", baseScanUI.C1);
        rz3.h hVar = new rz3.h(1, bundle);
        baseScanUI.J1 = bundle;
        baseScanUI.f159159t.b(j17, hVar);
    }

    public static android.os.Bundle X6(com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI, java.lang.String str, kd0.c3 c3Var, com.tencent.qbar.WxQBarResult wxQBarResult, int i17, com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo) {
        baseScanUI.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        if (wxQBarResult != null) {
            bundle.putString("result_content", wxQBarResult.f475332f);
            bundle.putInt("result_code_format", wxQBarResult.f475330d);
            bundle.putString("result_code_name", wxQBarResult.f475331e);
            bundle.putInt("result_code_version", i17);
            bundle.putInt("qbar_string_scan_source", 1);
            bundle.putInt("result_image_source", 2);
            bundle.putParcelable("ScanIdentifyReportInfo.DecodeKey", scanIdentifyReportInfo);
            if (c3Var != null) {
                android.graphics.Point point = c3Var.f306624d;
                e04.v3.e(bundle, wxQBarResult.f215252o, new float[]{0.0f, 0.0f, point.x, point.y});
            }
            byte[] bArr = wxQBarResult.f475333g;
            if (bArr != null) {
                bundle.putByteArray("result_raw_data", bArr);
            }
            byte[] b17 = f04.l.b(str, 0, -1, null);
            if (b17 != null) {
                bundle.putByteArray("result_image_data", b17);
                bundle.putInt("result_image_format", 1);
            }
        }
        return bundle;
    }

    public final void Y6(int i17) {
        if (i17 == 1 && !this.f159145f.f159465g) {
            g7(i17);
        } else if (i17 == 2 && this.f159145f.f159465g) {
            g7(i17);
        }
    }

    public final void Z6() {
        if (this.f159154p0) {
            return;
        }
        if ((this.C == 12) || (f7() && this.f159167y0)) {
            this.f159154p0 = true;
            com.tencent.mm.plugin.scanner.model.d1 d1Var = com.tencent.mm.plugin.scanner.model.d1.f158843a;
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanFastFocusEngineManager", "checkAndUpdateScanEngineConfig");
            com.tencent.mm.plugin.scanner.model.d1 d1Var2 = com.tencent.mm.plugin.scanner.model.d1.f158843a;
            d1Var2.c();
            if (d1Var2.k(2)) {
                d1Var2.p(2);
            }
            if (d1Var2.k(3)) {
                d1Var2.p(3);
            }
            if (d1Var2.k(4)) {
                d1Var2.p(4);
            }
            d1Var2.p(6);
        }
    }

    public final void a7(boolean z17) {
        if (z17) {
            getController().E0(getResources().getColor(com.tencent.mm.R.color.a3p));
        } else if (com.tencent.mm.ui.bk.C()) {
            getController().E0(getResources().getColor(com.tencent.mm.R.color.a3p));
        } else {
            getController().E0(getContext().getResources().getColor(com.tencent.mm.R.color.f478490b));
        }
    }

    public final void b7() {
        yj0.a.a("com/tencent/mm/plugin/scanner/ui/BaseScanUI", "com/tencent/mm/plugin/scanner/ui/BaseScanUI", "goBack", "()V", this);
        setResult(0);
        finish();
        overridePendingTransition(0, 0);
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/BaseScanUI", "com/tencent/mm/plugin/scanner/ui/BaseScanUI", "goBack", "()V");
    }

    public final void c7() {
        com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView sharedMaskView = this.f159144e.getSharedMaskView();
        if (sharedMaskView != null) {
            this.f159145f = sharedMaskView.getFlashSwitcherView();
        }
        com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher scannerFlashSwitcher = this.f159145f;
        if (scannerFlashSwitcher != null) {
            scannerFlashSwitcher.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.20
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/scanner/ui/BaseScanUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    zs5.g0 g0Var = zs5.g0.F;
                    if (g0Var.f475382o != 2) {
                        g0Var.f475382o = 2;
                    }
                    com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                    if (baseScanUI.f159145f.f159465g) {
                        baseScanUI.g7(2);
                    } else {
                        baseScanUI.g7(1);
                    }
                    com.tencent.mm.plugin.scanner.model.h2.z(baseScanUI.C, 2, baseScanUI.f159167y0);
                    baseScanUI.I1 = true;
                    com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector.f159829l.f159840k = true;
                    yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/BaseScanUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            this.f159144e.setFlashStatus(this.f159145f.f159466h);
            if (this.C == 3) {
                Y6(2);
                this.f159145f.b();
            }
        }
    }

    public final void d7() {
        com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView sharedMaskView = this.f159144e.getSharedMaskView();
        if (sharedMaskView == null) {
            return;
        }
        if (this.M) {
            android.view.View galleryButton = sharedMaskView.getGalleryButton();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(galleryButton, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/BaseScanUI", "initGalleryButton", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            galleryButton.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(galleryButton, "com/tencent/mm/plugin/scanner/ui/BaseScanUI", "initGalleryButton", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View galleryButton2 = sharedMaskView.getGalleryButton();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(galleryButton2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/BaseScanUI", "initGalleryButton", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        galleryButton2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(galleryButton2, "com/tencent/mm/plugin/scanner/ui/BaseScanUI", "initGalleryButton", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        sharedMaskView.setOnGalleryClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.18
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(view);
                java.lang.Object[] array = arrayList3.toArray();
                arrayList3.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/BaseScanUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                com.tencent.wechat.aff.iam_scan.f1 f1Var = com.tencent.wechat.aff.iam_scan.f1.CLICK_GALLERY;
                com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                baseScanUI.W = f1Var;
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = baseScanUI.f159144e;
                if (scanUIRectView != null) {
                    e04.j1 scanCameraReporter = scanUIRectView.getScanCameraReporter();
                    e04.i1 i1Var = e04.i1.f245959g;
                    scanCameraReporter.getClass();
                    i1Var.toString();
                    scanCameraReporter.f245986u = i1Var;
                }
                com.tencent.mm.plugin.scanner.model.h2.z(baseScanUI.C, 12, baseScanUI.f159167y0);
                baseScanUI.K1.a(com.tencent.wechat.aff.iam_scan.a0.SelectGallery);
                if (baseScanUI.V) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "selectImageFromGallery currentMode: %d", java.lang.Integer.valueOf(baseScanUI.C));
                    if (baseScanUI.f7()) {
                        baseScanUI.T = true;
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("preview_ui_title", com.tencent.mm.R.string.ias);
                        ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
                        com.tencent.mm.pluginsdk.ui.tools.l7.h(baseScanUI, 4660, intent);
                        com.tencent.mm.plugin.scanner.model.h2.D(baseScanUI.C);
                        int i17 = baseScanUI.C;
                        if (com.tencent.mm.plugin.scanner.model.h2.h(i17)) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, !com.tencent.mm.plugin.scanner.model.h2.f158929j ? 55 : 73);
                        } else if (i17 == 12) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, 103);
                        }
                    } else {
                        if (baseScanUI.C == 3) {
                            ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
                            com.tencent.mm.pluginsdk.ui.tools.l7.c(baseScanUI, 561, 1, 0, 1, false, null);
                        }
                    }
                }
                yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/BaseScanUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
    }

    public final void e7() {
        com.tencent.mm.plugin.scanner.model.r1 r1Var = this.X;
        if (r1Var != null) {
            r1Var.getClass();
            r1Var.f159000a = this;
            com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = this.f159144e;
            if (scanUIRectView != null) {
                com.tencent.mm.plugin.scanner.view.BaseScanMaskView scanMaskView = scanUIRectView.getScanMaskView();
                com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView sharedMaskView = this.f159144e.getSharedMaskView();
                com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView scanInfoMaskView = this.f159150m;
                r1Var.f159001b = scanMaskView;
                r1Var.f159002c = sharedMaskView;
                r1Var.f159003d = scanInfoMaskView;
            }
        }
    }

    public final boolean f7() {
        return e04.v3.b(this.C);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "ScanUI.finish");
        if (this.H1) {
            com.tencent.mm.plugin.scanner.model.h2.z(this.C, 15, this.f159167y0);
        }
        if (this.I1) {
            com.tencent.mm.plugin.scanner.model.h2.z(this.C, 16, this.f159167y0);
        }
    }

    public final void g7(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "operateFlash operation: %d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.autogen.events.ScanFlashSwitchEvent scanFlashSwitchEvent = new com.tencent.mm.autogen.events.ScanFlashSwitchEvent();
        scanFlashSwitchEvent.f54730g.f8033a = i17;
        scanFlashSwitchEvent.e();
        com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher scannerFlashSwitcher = this.f159145f;
        if (scannerFlashSwitcher != null) {
            if (i17 != 1) {
                scannerFlashSwitcher.a();
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScannerFlashSwitcher", "openFlashStatus");
            scannerFlashSwitcher.f159465g = true;
            scannerFlashSwitcher.f159462d.setImageResource(com.tencent.mm.R.raw.scanner_flash_open_on);
            scannerFlashSwitcher.f159463e.setText(com.tencent.mm.R.string.i9j);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489428ci2;
    }

    public final void h7() {
        ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.10
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.mm.sdk.platformtools.v5.e(com.tencent.mm.plugin.scanner.ui.BaseScanUI.this, com.tencent.mm.R.string.hpq);
            }
        });
        this.f159160u.vibrate(10L);
    }

    public final boolean i7() {
        boolean z17;
        int i17;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f159165x1);
        com.tencent.mm.plugin.scanner.model.r1 r1Var = this.X;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "processCancel isShowingMultiCodeResult: %b, infoViewType: %d", valueOf, java.lang.Integer.valueOf(r1Var.f159006g));
        com.tencent.mm.plugin.scanner.ui.component.ScanUITopOpButtonComponent scanUITopOpButtonComponent = this.f159153p;
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = new android.animation.AnimatorListenerAdapter() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.26
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.n7();
            }
        };
        android.widget.TextView textView = scanUITopOpButtonComponent.f159521f;
        if (textView == null) {
            kotlin.jvm.internal.o.o("cancelButton");
            throw null;
        }
        if (textView.getVisibility() == 0) {
            scanUITopOpButtonComponent.a(true);
            scanUITopOpButtonComponent.b(false, animatorListenerAdapter);
            z17 = true;
        } else {
            z17 = false;
        }
        r7(true);
        if (f7() && this.f159165x1) {
            this.f159165x1 = false;
            java.lang.Runnable runnable = this.M1;
            if (runnable != null) {
                runnable.run();
                this.M1 = null;
            } else {
                com.tencent.mm.plugin.scanner.model.h2.n(3, -1, this.f159167y0);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, !com.tencent.mm.plugin.scanner.model.h2.f158929j ? 62 : 82);
            }
        }
        if (f7() && r1Var != null && ((i17 = r1Var.f159006g) == 3 || i17 == 4)) {
            com.tencent.mm.plugin.scanner.model.h2.o(5, this.f159167y0, this.C, this.B1);
        }
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x027e A[SYNTHETIC] */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.ui.BaseScanUI.initView():void");
    }

    public final void j7(boolean z17) {
        com.tencent.mm.plugin.scanner.model.h2 h2Var = com.tencent.mm.plugin.scanner.model.h2.f158920a;
        com.tencent.mm.plugin.scanner.model.g2 g2Var = new com.tencent.mm.plugin.scanner.model.g2(12, z17);
        com.tencent.mm.plugin.scanner.model.d1 d1Var = com.tencent.mm.plugin.scanner.model.d1.f158843a;
        ((ku5.t0) ku5.t0.f312615d).h(g2Var, "AiScanImageDecodeQueue_decode_task");
    }

    public final void k7(boolean z17, boolean z18) {
        long j17 = z17 ? 1L : 0L;
        com.tencent.mm.autogen.mmdata.rpt.android_scanner_performanceStruct android_scanner_performancestruct = this.Z;
        android_scanner_performancestruct.f63096d = j17;
        android_scanner_performancestruct.f63097e = java.lang.System.currentTimeMillis() - this.A;
        qt5.i0 i0Var = this.f159144e.f215302e;
        android_scanner_performancestruct.f63098f = i0Var != null ? "auto".equals(((qt5.c) i0Var).d(false)) : false ? 0L : 1L;
        android_scanner_performancestruct.f63100h = this.C;
        android_scanner_performancestruct.f63099g = zs5.g0.F.f475370c;
        android_scanner_performancestruct.k();
        if (f7()) {
            int i17 = e04.f2.e() == 1 ? 1722 : 1229;
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "reportScanPerformance idKey:" + i17);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            long j18 = (long) i17;
            g0Var.C(j18, 0L, 1L);
            g0Var.C(j18, 1L, z17 ? 1L : 0L);
            if (z17) {
                qt5.i0 i0Var2 = this.f159144e.f215302e;
                if (i0Var2 != null ? "auto".equals(((qt5.c) i0Var2).d(false)) : false) {
                    g0Var.C(j18, 5L, 1L);
                } else {
                    g0Var.C(j18, 3L, 1L);
                }
                g0Var.C(j18, 7L, android_scanner_performancestruct.f63097e);
                g0Var.C(j18, 9L, android_scanner_performancestruct.f63099g);
                if (z17 && z18) {
                    g0Var.C(j18, 11L, 1L);
                    g0Var.C(j18, 12L, android_scanner_performancestruct.f63097e);
                    g0Var.C(j18, 14L, android_scanner_performancestruct.f63099g);
                }
            }
        }
    }

    public final void l7(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "reportScanUIEvent eventType = %d, enterScene = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.S));
        java.lang.String str = this.F1;
        jz5.l lVar = (str == null || str.length() <= 0) ? null : new jz5.l("key_scan_shortcut_caller_string", this.F1);
        int f17 = com.tencent.mm.plugin.scanner.model.h2.f(this.P);
        int i18 = this.C;
        com.tencent.mm.plugin.scanner.api.BaseScanRequest baseScanRequest = this.P;
        int i19 = this.S;
        boolean z17 = this.f159167y0;
        com.tencent.mm.plugin.scanner.model.h2 h2Var = com.tencent.mm.plugin.scanner.model.h2.f158920a;
        int g17 = h2Var.g(i18, z17);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = 0;
        if (i17 == 1) {
            com.tencent.mm.plugin.scanner.model.h2.f158931l = currentTimeMillis;
        } else if (i17 == 2) {
            long j18 = com.tencent.mm.plugin.scanner.model.h2.f158931l;
            if (j18 > 0) {
                com.tencent.mm.plugin.scanner.model.h2.f158931l = 0L;
                j17 = currentTimeMillis - j18;
            }
        }
        jz5.l b17 = h2Var.b(baseScanRequest);
        if (((java.lang.String) b17.f302833d).length() != 0 || lVar == null || ((java.lang.String) lVar.f302833d).length() <= 0) {
            lVar = b17;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(20275, lVar.f302833d, lVar.f302834e, com.tencent.mm.plugin.scanner.model.h2.f158921b, java.lang.Integer.valueOf(f17), java.lang.Integer.valueOf(g17), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i19));
        if (i17 == 1 && (baseScanRequest instanceof com.tencent.mm.plugin.scanner.api.ScanGoodsRequest) && ((com.tencent.mm.plugin.scanner.api.ScanGoodsRequest) baseScanRequest).f158668m == 5) {
            g0Var.A(1259, 108);
        }
        if (i17 == 1) {
            int i27 = this.S;
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
            java.lang.String str2 = this.F1;
            java.lang.String str3 = this.G1;
            if (i27 == 0 || i27 == 22 || i27 == 24 || i27 == 13 || i27 == 14) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanLaunchSourceReporter", "reportLaunchSource enterScene: " + i27 + ", caller: " + str2 + ", refer: " + str3);
                ((ku5.t0) ku5.t0.f312615d).g(new qz3.a(weakReference, i27, str3, str2));
            }
        }
    }

    public final void m7(int i17, int i18) {
        int i19;
        int i27;
        boolean z17 = this.f159167y0;
        if (!(com.tencent.mm.plugin.scanner.model.h2.f158921b.length() == 0)) {
            int g17 = com.tencent.mm.plugin.scanner.model.h2.f158920a.g(i17, z17);
            if (i18 != 0) {
                i19 = 3;
                if (i18 != 1) {
                    if (i18 == 2) {
                        i19 = 2;
                    } else if (i18 != 3) {
                        i19 = 4;
                        if (i18 != 4) {
                            i27 = -1;
                            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                            java.lang.Integer valueOf = java.lang.Integer.valueOf(g17);
                            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i27);
                            java.lang.String str = com.tencent.mm.plugin.scanner.model.h2.f158921b;
                            g0Var.d(18557, 0, valueOf, valueOf2, str, str);
                        }
                    } else {
                        i19 = 1;
                    }
                }
            } else {
                i19 = 0;
            }
            i27 = i19;
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(g17);
            java.lang.Integer valueOf22 = java.lang.Integer.valueOf(i27);
            java.lang.String str2 = com.tencent.mm.plugin.scanner.model.h2.f158921b;
            g0Var2.d(18557, 0, valueOf3, valueOf22, str2, str2);
        }
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(i17);
        java.util.HashMap hashMap = com.tencent.mm.plugin.scanner.model.h2.f158924e;
        hashMap.put(valueOf4, java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        hashMap.get(java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.scanner.model.h2.a(i17);
        com.tencent.mm.plugin.scanner.model.h2.C(i17);
        if (f7() && this.f159167y0) {
            com.tencent.mm.plugin.scanner.model.d.a(0, null);
        }
    }

    public void n7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "resumeScan");
        this.E1 = 1;
        this.A = java.lang.System.currentTimeMillis();
        this.T = false;
        this.W = com.tencent.wechat.aff.iam_scan.f1.DEFAULT;
        com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = this.f159144e;
        if (scanUIRectView != null) {
            scanUIRectView.f();
        }
        p7(true);
    }

    public final void o7() {
        int i17 = this.C;
        if (i17 != 1 && i17 != 8) {
            if (i17 == 3) {
                this.f159159t = new com.tencent.mm.plugin.scanner.model.l2(this);
                return;
            } else if (i17 != 4) {
                this.f159144e.setScanCallback(null);
                return;
            }
        }
        this.f159144e.setScanCallback(this.V1);
        this.f159159t = new rz3.i(this, com.tencent.mm.plugin.scanner.model.h2.f158921b, this.C, this.S, true, this.f159144e, this, this, this.N1);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, final int i18, final android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 != 561) {
            if (i17 == 4660) {
                if (i18 != -1 || intent == null) {
                    n7();
                    if (i18 == 0 && e04.v3.b(this.C)) {
                        com.tencent.mm.plugin.scanner.model.h2.j(this.C);
                        this.K1.a(com.tencent.wechat.aff.iam_scan.a0.SelectGalleryCancel);
                        return;
                    }
                    return;
                }
                int i19 = this.C;
                if (com.tencent.mm.plugin.scanner.model.h2.h(i19)) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, !com.tencent.mm.plugin.scanner.model.h2.f158929j ? 57 : 75);
                } else if (i19 == 12) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, 105);
                }
                this.E1 = 2;
                com.tencent.mm.plugin.scanner.model.h2.z(this.C, 13, this.f159167y0);
                this.K1.a(com.tencent.wechat.aff.iam_scan.a0.SelectGalleryOk);
                final java.lang.String b17 = com.tencent.mm.ui.tools.i1.b(this, intent, g83.a.a());
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "select: [%s]", b17);
                if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                    db5.e1.y(this, getResources().getString(com.tencent.mm.R.string.og8), "", getResources().getString(com.tencent.mm.R.string.f490507x1), new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.38
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(android.content.DialogInterface dialogInterface, int i27) {
                            com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                            baseScanUI.n7();
                            com.tencent.mm.plugin.scanner.model.h2.C(baseScanUI.C);
                        }
                    });
                    return;
                }
                final int a17 = com.tencent.mm.sdk.platformtools.l.a(b17);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                android.graphics.Bitmap K = com.tencent.mm.sdk.platformtools.x.K(b17);
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                if (a17 == 90 || a17 == 270 || a17 == 180) {
                    K = com.tencent.mm.sdk.platformtools.x.w0(K, a17);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "showGallerySelectedImage decode image cost: %d, rotation: %s", java.lang.Long.valueOf(currentTimeMillis2 - currentTimeMillis), java.lang.Integer.valueOf(a17));
                if (K != null && !K.isRecycled()) {
                    com.tencent.mm.plugin.scanner.view.BaseScanMaskView scanMaskView = this.f159144e.getScanMaskView();
                    if (scanMaskView instanceof com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView) {
                        scanMaskView.setScanSource(this.f159167y0 ? 4 : 2);
                        com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView = (com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView) scanMaskView;
                        scanCodeMaskView.J(K);
                        scanCodeMaskView.D();
                    }
                }
                final long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                zs5.g0.G.f475372e = 1;
                com.tencent.mm.plugin.scanner.model.h2.v(this.C, this.S, 11, this.A, currentTimeMillis3);
                if (f7() && this.f159167y0) {
                    com.tencent.mm.plugin.scanner.model.d.a(40, null);
                }
                com.tencent.mm.plugin.scanner.model.x0 x0Var = this.L1;
                x0Var.f159095b = java.lang.Long.valueOf(currentTimeMillis3);
                x0Var.f159098e = true;
                ku5.u0 u0Var = ku5.t0.f312615d;
                com.tencent.mm.plugin.scanner.model.v0 v0Var = new com.tencent.mm.plugin.scanner.model.v0(x0Var, currentTimeMillis3);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(v0Var, 500L, false);
                kd0.b3 b3Var = new kd0.b3();
                b3Var.f306604a = currentTimeMillis3;
                b3Var.f306605b = b17;
                b3Var.f306607d = this.I;
                b3Var.f306609f = 4;
                zs5.u0.f475485h.b(b3Var, new kd0.a3() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.37
                    @Override // kd0.a3
                    public void a(final long j17, final kd0.c3 c3Var) {
                        final java.util.List list = c3Var != null ? c3Var.f306621a : null;
                        final java.util.ArrayList arrayList = c3Var != null ? c3Var.f306623c : null;
                        com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                        final int i27 = baseScanUI.f159167y0 ? 4 : 2;
                        if (j17 == currentTimeMillis3 && baseScanUI.f7()) {
                            com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.L1.a(j17, false);
                            java.lang.Long l17 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.L1.f159095b;
                            if (l17 == null || l17.longValue() != j17) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.ScanUI", "scanCodeFromGallery user has cancelled");
                            } else {
                                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.37.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        com.tencent.mm.plugin.scanner.model.w1 w1Var;
                                        java.util.List list2;
                                        com.tencent.qbar.WxQBarResult wxQBarResult;
                                        kd0.c3 c3Var2;
                                        java.util.List list3;
                                        long j18;
                                        java.lang.String str;
                                        int i28;
                                        final java.util.List list4;
                                        boolean z17;
                                        kd0.c3 c3Var3;
                                        ry3.l lVar;
                                        java.util.List list5 = list;
                                        int i29 = 0;
                                        if (list5 == null || list5.isEmpty()) {
                                            com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI2 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                                            baseScanUI2.T = true;
                                            com.tencent.mm.plugin.scanner.model.h2.r(baseScanUI2.C, false, i27, 1);
                                            com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI3 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                                            if (!baseScanUI3.f159167y0 || (w1Var = baseScanUI3.P1) == null) {
                                                baseScanUI3.v7(true);
                                                return;
                                            }
                                            long currentTimeMillis4 = java.lang.System.currentTimeMillis();
                                            com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass37 anonymousClass37 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass37.this;
                                            int i37 = i18;
                                            android.content.Intent intent2 = intent;
                                            com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI4 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                                            int i38 = baseScanUI4.C;
                                            int i39 = i27;
                                            int i47 = a17;
                                            com.tencent.mm.plugin.scanner.model.t1 callback = baseScanUI4.Q1;
                                            kotlin.jvm.internal.o.g(callback, "callback");
                                            java.lang.Object[] objArr = new java.lang.Object[2];
                                            objArr[0] = java.lang.Integer.valueOf(i37);
                                            objArr[1] = java.lang.Boolean.valueOf(intent2 == null);
                                            com.tencent.mars.xlog.Log.i("MicroMsg.ScanProductForGalleryHelper", "handleScanGalleryImage resultCode: %d, data == null: %b", objArr);
                                            w1Var.f159087c = currentTimeMillis4;
                                            if (i37 == -1) {
                                                w1Var.f159086b = callback;
                                                com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI5 = (com.tencent.mm.plugin.scanner.ui.BaseScanUI) w1Var.f159085a;
                                                baseScanUI5.getClass();
                                                java.lang.String b18 = com.tencent.mm.ui.tools.i1.b(baseScanUI5, intent2, g83.a.a());
                                                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = ((com.tencent.mm.plugin.scanner.ui.BaseScanUI) w1Var.f159085a).f159144e;
                                                com.tencent.mm.plugin.scanner.view.BaseScanMaskView scanMaskView2 = scanUIRectView != null ? scanUIRectView.getScanMaskView() : null;
                                                if (scanMaskView2 != null) {
                                                    scanMaskView2.setScanSource(i39);
                                                }
                                                w1Var.f159090f = new com.tencent.mm.plugin.scanner.model.u1(w1Var, currentTimeMillis4);
                                                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView2 = ((com.tencent.mm.plugin.scanner.ui.BaseScanUI) w1Var.f159085a).f159144e;
                                                com.tencent.mm.plugin.scanner.view.BaseScanMaskView scanMaskView3 = scanUIRectView2 != null ? scanUIRectView2.getScanMaskView() : null;
                                                if (scanMaskView3 != null) {
                                                    scanMaskView3.t(true, w1Var.f159090f);
                                                }
                                                kotlin.jvm.internal.o.d(b18);
                                                byte[] b19 = f04.l.b(b18, i47, 122880, null);
                                                boolean z18 = b19 != null && b19.length <= 122880;
                                                com.tencent.mm.plugin.scanner.model.c cVar = new com.tencent.mm.plugin.scanner.model.c(0);
                                                if (z18) {
                                                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                                                    objArr2[0] = b19 != null ? java.lang.Integer.valueOf(b19.length) : null;
                                                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanProductForGalleryHelper", "scanProductForFile compressImage success final data length: %d", objArr2);
                                                    if (w1Var.f159089e == null) {
                                                        w1Var.f159089e = new sz3.w(w1Var.f159088d);
                                                    }
                                                    sz3.w wVar = w1Var.f159089e;
                                                    if (wVar != null) {
                                                        sz3.c1 c1Var = new sz3.c1();
                                                        c1Var.f413974a = i39;
                                                        c1Var.f413975b = currentTimeMillis4;
                                                        c1Var.f413976c = 1004;
                                                        java.util.ArrayList arrayList2 = c1Var.f413981h;
                                                        com.tencent.mm.plugin.scanner.model.ScanProductInfo scanProductInfo = new com.tencent.mm.plugin.scanner.model.ScanProductInfo();
                                                        scanProductInfo.setId(-1);
                                                        sz3.a1 a1Var = new sz3.a1(scanProductInfo);
                                                        cVar.f158825b = b19.length;
                                                        cVar.f158824a = 2;
                                                        a1Var.f413964f = cVar;
                                                        sz3.b1 b1Var = new sz3.b1(b19);
                                                        b1Var.f413968c = 1;
                                                        a1Var.f413962d = b1Var;
                                                        arrayList2.add(a1Var);
                                                        wVar.b(currentTimeMillis4, c1Var);
                                                    }
                                                } else {
                                                    com.tencent.mars.xlog.Log.e("MicroMsg.ScanProductForGalleryHelper", "scanProductByFile compressImage failed");
                                                    if (w1Var.f159087c == currentTimeMillis4) {
                                                        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.og8);
                                                        kotlin.jvm.internal.o.f(string, "getString(...)");
                                                        com.tencent.mm.plugin.scanner.model.d.a(11, cVar);
                                                        com.tencent.mm.plugin.scanner.model.v1 v1Var = w1Var.f159088d;
                                                        sz3.x0 x0Var2 = new sz3.x0(i39, currentTimeMillis4, 2, 1);
                                                        x0Var2.f414152f = cVar;
                                                        v1Var.a(x0Var2, 1001, string);
                                                    }
                                                }
                                            } else {
                                                ((com.tencent.mm.plugin.scanner.ui.BaseScanUI) w1Var.f159085a).n7();
                                                if (i37 == 0) {
                                                    com.tencent.mm.plugin.scanner.model.h2.j(12);
                                                }
                                            }
                                            com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass37 anonymousClass372 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass37.this;
                                            com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI6 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                                            com.tencent.mm.plugin.scanner.model.h2.v(baseScanUI6.C, baseScanUI6.S, 13, baseScanUI6.A, currentTimeMillis3);
                                            return;
                                        }
                                        com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass37 anonymousClass373 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass37.this;
                                        final com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI7 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                                        java.lang.String str2 = b17;
                                        int i48 = a17;
                                        int i49 = i27;
                                        long j19 = j17;
                                        kd0.c3 c3Var4 = c3Var;
                                        java.util.List list6 = list;
                                        java.util.List list7 = arrayList;
                                        final long j27 = currentTimeMillis3;
                                        int i57 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.Z1;
                                        baseScanUI7.getClass();
                                        com.tencent.qbar.WxQBarResult wxQBarResult2 = list6.isEmpty() ? null : (com.tencent.qbar.WxQBarResult) list6.get(0);
                                        if (baseScanUI7.f159155p1) {
                                            list2 = list6;
                                        } else {
                                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                            list2 = arrayList3;
                                            if (wxQBarResult2 != null) {
                                                arrayList3.add(wxQBarResult2);
                                                list2 = arrayList3;
                                            }
                                        }
                                        java.util.Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            if (((com.tencent.qbar.WxQBarResult) it.next()).f215252o != null) {
                                                i29++;
                                            }
                                        }
                                        java.util.List list8 = list2;
                                        com.tencent.mm.plugin.scanner.model.h2.r(baseScanUI7.C, true, i49, list6.size());
                                        baseScanUI7.K1.a(com.tencent.wechat.aff.iam_scan.a0.SelectGalleryDecodeSuccess);
                                        com.tencent.mm.plugin.scanner.model.h2.q(com.tencent.mm.plugin.scanner.j1.b(wxQBarResult2 != null ? com.tencent.mm.plugin.scanner.j1.a(wxQBarResult2.f475331e) : 0) ? 1 : 2, 2, baseScanUI7.D1, baseScanUI7.S);
                                        com.tencent.mm.plugin.scanner.model.d.a(41, null);
                                        final long j28 = (c3Var4 == null || (lVar = c3Var4.f306628h) == null) ? 0L : lVar.f401523b;
                                        if (i29 > 0 && baseScanUI7.f159144e != null) {
                                            final long currentTimeMillis5 = java.lang.System.currentTimeMillis();
                                            baseScanUI7.M1 = null;
                                            baseScanUI7.f159165x1 = i29 > 1;
                                            if (i29 > 1) {
                                                baseScanUI7.f159153p.a(false);
                                                baseScanUI7.f159153p.b(true, null);
                                                baseScanUI7.r7(false);
                                                list4 = list8;
                                                c3Var2 = c3Var4;
                                                list3 = list7;
                                                j18 = j19;
                                                wxQBarResult = wxQBarResult2;
                                                str = str2;
                                                i28 = i48;
                                                baseScanUI7.M1 = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI$$a
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        com.tencent.mm.plugin.scanner.model.h2.k(list4, j27, 3, -1, com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.f159167y0, currentTimeMillis5, j28);
                                                    }
                                                };
                                                z17 = true;
                                            } else {
                                                wxQBarResult = wxQBarResult2;
                                                c3Var2 = c3Var4;
                                                list3 = list7;
                                                j18 = j19;
                                                str = str2;
                                                i28 = i48;
                                                list4 = list8;
                                                z17 = true;
                                            }
                                            baseScanUI7.T = z17;
                                            final com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo = new com.tencent.qbar.ScanIdentifyReportInfo(str, null, false);
                                            final java.util.List list9 = list4;
                                            final int i58 = i29;
                                            final java.lang.String str3 = str;
                                            final kd0.c3 c3Var5 = c3Var2;
                                            final java.lang.String str4 = str;
                                            final java.util.List list10 = list3;
                                            final int i59 = i29;
                                            final long j29 = j18;
                                            baseScanUI7.f159144e.setSuccessMarkClickListener(new com.tencent.mm.plugin.scanner.model.i2() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.39
                                                @Override // com.tencent.mm.plugin.scanner.model.i2
                                                public void a(int i66, android.view.View view) {
                                                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "onScanSuccess onClick mark index: %d", java.lang.Integer.valueOf(i66));
                                                    java.util.List list11 = list9;
                                                    if (i66 >= list11.size() || i58 <= 1) {
                                                        return;
                                                    }
                                                    com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI8 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                                                    baseScanUI8.T = false;
                                                    com.tencent.qbar.WxQBarResult wxQBarResult3 = (com.tencent.qbar.WxQBarResult) list11.get(i66);
                                                    if (!com.tencent.mm.plugin.scanner.ui.BaseScanUI.V6(baseScanUI8, wxQBarResult3, true, scanIdentifyReportInfo)) {
                                                        com.tencent.mm.plugin.scanner.ui.BaseScanUI.W6(baseScanUI8, j29, com.tencent.mm.plugin.scanner.ui.BaseScanUI.X6(com.tencent.mm.plugin.scanner.ui.BaseScanUI.this, str3, c3Var5, wxQBarResult3, et5.g.b(i66, list10), scanIdentifyReportInfo), wxQBarResult3);
                                                        com.tencent.mm.plugin.scanner.model.h2.k(list9, j27, 2, i66, baseScanUI8.f159167y0, currentTimeMillis5, j28);
                                                        com.tencent.mm.plugin.scanner.model.h2.v(baseScanUI8.C, baseScanUI8.S, 12, baseScanUI8.A, j27);
                                                    }
                                                    com.tencent.mm.plugin.scanner.model.h2.n(2, i66, baseScanUI8.f159167y0);
                                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, !com.tencent.mm.plugin.scanner.model.h2.f158929j ? 63 : 83);
                                                }
                                            });
                                            baseScanUI7.Y6(2);
                                            baseScanUI7.s7(false, false);
                                            baseScanUI7.h7();
                                            com.tencent.mm.plugin.scanner.view.BaseScanMaskView scanMaskView4 = baseScanUI7.f159144e.getScanMaskView();
                                            if (scanMaskView4 instanceof com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView) {
                                                scanMaskView4.setVisibleResolution(baseScanUI7.f159144e.getVisibleResolution());
                                                com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView2 = (com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView) scanMaskView4;
                                                c3Var3 = c3Var2;
                                                int i66 = c3Var3 != null ? c3Var3.f306624d.x : 0;
                                                int i67 = c3Var3 != null ? c3Var3.f306624d.y : 0;
                                                scanCodeMaskView2.F1 = i28;
                                                scanCodeMaskView2.D1 = i66;
                                                scanCodeMaskView2.E1 = i67;
                                            } else {
                                                c3Var3 = c3Var2;
                                            }
                                            com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView3 = baseScanUI7.f159144e;
                                            final java.util.List list11 = list4;
                                            final com.tencent.qbar.WxQBarResult wxQBarResult3 = wxQBarResult;
                                            final kd0.c3 c3Var6 = c3Var3;
                                            final java.util.List list12 = list3;
                                            final long j37 = j18;
                                            scanUIRectView3.v(list4, new com.tencent.mm.plugin.scanner.view.w0() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.40
                                                @Override // com.tencent.mm.plugin.scanner.view.w0
                                                public void b(boolean z19) {
                                                    com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI8 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                                                    if (!z19 && i59 != 1 && list11.size() != 1) {
                                                        baseScanUI8.f159161v.a(false);
                                                        return;
                                                    }
                                                    baseScanUI8.T = false;
                                                    com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo2 = scanIdentifyReportInfo;
                                                    com.tencent.qbar.WxQBarResult wxQBarResult4 = wxQBarResult3;
                                                    if (!com.tencent.mm.plugin.scanner.ui.BaseScanUI.V6(baseScanUI8, wxQBarResult4, true, scanIdentifyReportInfo2)) {
                                                        com.tencent.mm.plugin.scanner.ui.BaseScanUI.W6(baseScanUI8, j37, com.tencent.mm.plugin.scanner.ui.BaseScanUI.X6(com.tencent.mm.plugin.scanner.ui.BaseScanUI.this, str4, c3Var6, wxQBarResult3, et5.g.b(0, list12), scanIdentifyReportInfo), wxQBarResult4);
                                                        com.tencent.mm.plugin.scanner.model.h2.k(list11, j27, 1, 0, baseScanUI8.f159167y0, currentTimeMillis5, j28);
                                                        com.tencent.mm.plugin.scanner.model.h2.v(baseScanUI8.C, baseScanUI8.S, 12, baseScanUI8.A, j27);
                                                    }
                                                    com.tencent.mm.plugin.scanner.model.h2.n(1, 0, baseScanUI8.f159167y0);
                                                }

                                                @Override // com.tencent.mm.plugin.scanner.view.w0
                                                public void c() {
                                                }
                                            }, baseScanUI7.f159145f.f159465g, true);
                                        }
                                    }
                                });
                            }
                        }
                    }
                });
                return;
            }
            switch (i17) {
                case 1001:
                    finish();
                    break;
                case 1002:
                    finish();
                    return;
                case 1003:
                    n7();
                default:
                    return;
            }
        }
        com.tencent.mm.plugin.scanner.model.h2.z(this.C, 13, this.f159167y0);
        if (i18 == -1) {
            java.lang.String b18 = com.tencent.mm.ui.tools.i1.b(this, intent, g83.a.a());
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "scanTranslate select image: [%s]", b18);
            rz3.g gVar = this.f159159t;
            if (gVar == null || !(gVar instanceof com.tencent.mm.plugin.scanner.model.l2)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ScanUI", "scanTranslate resultHandler invalid");
            } else {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("key_translate_file_path", b18);
                this.f159159t.b(java.lang.System.currentTimeMillis(), bundle);
            }
        }
        n7();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        boolean z17;
        uy3.j0 j0Var = this.f159157r;
        if (j0Var != null && j0Var.D()) {
            this.f159157r.dismiss();
            return;
        }
        com.tencent.mm.plugin.scanner.model.r1 r1Var = this.X;
        if (r1Var == null || !r1Var.f159004e) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "cancelLoading");
            com.tencent.mm.plugin.scanner.view.r rVar = r1Var.f159005f;
            if (rVar != null) {
                rVar.a(null);
            }
            r1Var.f159005f = null;
            r1Var.a(false, false);
            z17 = true;
        }
        if (z17) {
            if (i7()) {
                return;
            }
            n7();
        } else {
            if (i7()) {
                return;
            }
            d04.j jVar = this.f159146g;
            if (jVar == null || !jVar.onBackPressed()) {
                if (this.C == 12) {
                    j7(false);
                }
                com.tencent.mm.plugin.scanner.model.h2.D(this.C);
                b7();
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "screen orientation %d", java.lang.Integer.valueOf(configuration.orientation));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x04fa, code lost:
    
        if (r1.f8496a != false) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05c4  */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 1980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.ui.BaseScanUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "ScanUI.onDestroy");
        super.onDestroy();
        this.K1.a(com.tencent.wechat.aff.iam_scan.a0.ScanPageDestroy);
        cz3.b bVar = cz3.b.f225018a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCrashManager", "exitScanUI");
        com.tencent.mm.sdk.platformtools.o4 o4Var = cz3.b.f225020c;
        if (o4Var != null) {
            ((com.tencent.mm.sdk.platformtools.o4) o4Var.putBoolean("key_last_enter_will_crash", false)).remove("key_last_enter");
        }
        this.Y1.dead();
        rz3.g gVar = this.f159159t;
        if (gVar != null) {
            gVar.destroy();
        }
        com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = this.f159144e;
        if (scanUIRectView != null) {
            scanUIRectView.t();
        }
        uy3.j0 j0Var = this.f159157r;
        if (j0Var != null && j0Var.D()) {
            this.f159157r.dismiss();
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f159156q;
        if (k0Var != null && k0Var.i()) {
            this.f159156q.u();
        }
        l7(2);
        com.tencent.mm.plugin.scanner.model.j0.f158938b = false;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.scanner.box.BaseBoxDialogView baseBoxDialogView;
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "ScanUI.onPause needPauseScan: %b", java.lang.Boolean.valueOf(this.T));
        com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = this.f159144e;
        if (scanUIRectView != null) {
            scanUIRectView.f215307m = true;
        }
        qp1.h0.b();
        com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView2 = this.f159144e;
        if (scanUIRectView2 != null) {
            scanUIRectView2.G(this.W);
            scanUIRectView2.e();
            this.W = com.tencent.wechat.aff.iam_scan.f1.DEFAULT;
            if (this.T) {
                this.f159144e.j();
            }
        }
        if (this.Z.f63096d == 0) {
            k7(false, false);
        }
        uy3.j0 j0Var = this.f159157r;
        if (j0Var != null && (baseBoxDialogView = j0Var.f431956q) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseBoxDialogView", "onPause set canMeasured false");
            baseBoxDialogView.f158681J = false;
        }
        com.tencent.mm.plugin.scanner.model.h2.A(this.D1, this.S);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults len[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr.length), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 16) {
            if (i17 != 26) {
                return;
            }
            if (iArr.length <= 0 || iArr[0] != -1) {
                ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).dk(this, new yz5.a() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI$$e
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        int i18 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.Z1;
                        com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.finish();
                        return null;
                    }
                }, true);
                return;
            } else if (z2.h.b(this, "android.permission.RECORD_AUDIO")) {
                finish();
                return;
            } else {
                db5.e1.u(this, getString(com.tencent.mm.R.string.f490566yo), getString(com.tencent.mm.R.string.f490496wq), new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI$$c
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(android.content.DialogInterface dialogInterface, int i18) {
                        int i19 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.Z1;
                        com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                        baseScanUI.getClass();
                        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                        j35.u.g(baseScanUI);
                        baseScanUI.finish();
                    }
                }, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI$$d
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(android.content.DialogInterface dialogInterface, int i18) {
                        int i19 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.Z1;
                        com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.finish();
                    }
                });
                return;
            }
        }
        this.f159144e.setRequestCameraPermission(true);
        int length = iArr.length;
        et5.e eVar = this.K1;
        if (length > 0 && iArr[0] == -1) {
            this.f159166y = false;
            eVar.a(com.tencent.wechat.aff.iam_scan.a0.CameraPermissionDeny);
            db5.e1.C(this, getString(com.tencent.mm.R.string.hh8), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.f490347sg), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.35
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                    tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                    com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                    androidx.appcompat.app.AppCompatActivity context = baseScanUI.getContext();
                    ((sb0.f) jVar).getClass();
                    j35.u.g(context);
                    baseScanUI.f159166y = true;
                    baseScanUI.finish();
                }
            }, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.36
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                    com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                    baseScanUI.f159166y = true;
                    baseScanUI.finish();
                }
            });
        } else {
            if (iArr.length <= 0 || iArr[0] != 0) {
                return;
            }
            eVar.a(com.tencent.wechat.aff.iam_scan.a0.CameraPermissionAllow);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.ui.BaseScanUI.onResume():void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "onStart()");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "onStop()");
        com.tencent.mm.plugin.scanner.model.s1.a(52);
        com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = this.f159144e;
        if (scanUIRectView != null) {
            scanUIRectView.x();
        }
        this.f159145f.a();
        gm0.j1.n().d(this.W1);
        this.X1.dead();
        getWindow().clearFlags(128);
        com.tencent.mm.autogen.events.FinderLivePauseActionEvent finderLivePauseActionEvent = new com.tencent.mm.autogen.events.FinderLivePauseActionEvent();
        finderLivePauseActionEvent.f54288g.f7891a = false;
        finderLivePauseActionEvent.e();
        if (finderLivePauseActionEvent.f54289h.f7997a) {
            finish();
        }
    }

    public final void p7(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "setEnableSwitchTab enable: %b, %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f159163x));
        d04.y2 y2Var = this.f159161v;
        if (y2Var != null) {
            if (!z17) {
                y2Var.b(false);
            } else if (this.f159163x) {
                y2Var.b(true);
            }
        }
        com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = this.f159144e;
        if (scanUIRectView != null) {
            if (!z17) {
                scanUIRectView.setEnableScrollSwitchTab(false);
            } else if (this.f159163x) {
                scanUIRectView.setEnableScrollSwitchTab(true);
            }
        }
    }

    public final void q7() {
        int i17;
        if (!e04.v3.b(this.C)) {
            int i18 = this.C;
            if (i18 == 12) {
                zs5.g0 g0Var = zs5.g0.F;
                i17 = 2;
            } else if (i18 == 3) {
                zs5.g0 g0Var2 = zs5.g0.F;
                i17 = 3;
            } else {
                i17 = 0;
            }
        } else if (this.f159167y0) {
            zs5.g0 g0Var3 = zs5.g0.F;
            i17 = 4;
        } else {
            zs5.g0 g0Var4 = zs5.g0.F;
            i17 = 1;
        }
        zs5.g0 g0Var5 = zs5.g0.F;
        g0Var5.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.QBarEngineReporter", "setReportTabType tabType: %d", java.lang.Integer.valueOf(i17));
        g0Var5.f475383p = i17;
    }

    public final void r7(boolean z17) {
        d04.y2 y2Var = this.f159161v;
        if (y2Var != null) {
            y2Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanScrollTabController", "setEnable %b", java.lang.Boolean.valueOf(z17));
            y2Var.b(z17);
            com.tencent.mm.plugin.scanner.ui.widget.ScanScrollTabView scanScrollTabView = y2Var.f225563b;
            if (scanScrollTabView == null) {
                return;
            }
            scanScrollTabView.setEnabled(z17);
        }
    }

    public final void s7(boolean z17, boolean z18) {
        if (!z17) {
            com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher scannerFlashSwitcher = this.f159145f;
            if (scannerFlashSwitcher == null || scannerFlashSwitcher.f159465g) {
                return;
            }
            com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = this.f159144e;
            com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView scanSharedMaskView = scanUIRectView.f159401r;
            if (scanSharedMaskView != null && scanUIRectView.f159403t.f159466h) {
                scanSharedMaskView.h(false);
            }
            com.tencent.mm.plugin.scanner.view.BaseScanMaskView baseScanMaskView = scanUIRectView.f159402s;
            if (baseScanMaskView != null && scanUIRectView.f159403t.f159466h) {
                baseScanMaskView.isFlashShow = false;
            }
            if (z18) {
                this.f159145f.b();
                return;
            } else {
                this.f159145f.setVisibility(8);
                return;
            }
        }
        com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher scannerFlashSwitcher2 = this.f159145f;
        if (scannerFlashSwitcher2 == null || scannerFlashSwitcher2.isShown()) {
            return;
        }
        com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView2 = this.f159144e;
        com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView scanSharedMaskView2 = scanUIRectView2.f159401r;
        if (scanSharedMaskView2 != null && !scanUIRectView2.f159403t.f159466h) {
            scanSharedMaskView2.h(true);
        }
        com.tencent.mm.plugin.scanner.view.BaseScanMaskView baseScanMaskView2 = scanUIRectView2.f159402s;
        if (baseScanMaskView2 != null && !scanUIRectView2.f159403t.f159466h) {
            baseScanMaskView2.isFlashShow = true;
        }
        if (z18) {
            this.f159145f.d();
        } else {
            this.f159145f.setVisibility(0);
        }
        zs5.g0 g0Var = zs5.g0.F;
        if (g0Var.f475382o != 2) {
            g0Var.f475382o = 1;
        }
        com.tencent.mm.plugin.scanner.model.h2.z(this.C, 1, this.f159167y0);
        this.H1 = true;
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.scanner.ui.f.class);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x00ba, code lost:
    
        if (r14 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0159, code lost:
    
        if (r0 == null) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0102 A[Catch: Exception -> 0x012b, TryCatch #1 {Exception -> 0x012b, blocks: (B:141:0x00b6, B:100:0x00c0, B:103:0x00cc, B:105:0x00da, B:107:0x00e2, B:109:0x00e8, B:111:0x00f0, B:113:0x00f6, B:118:0x0102, B:119:0x010a, B:121:0x010f, B:126:0x011b, B:127:0x0123, B:98:0x00bc), top: B:140:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x011b A[Catch: Exception -> 0x012b, TryCatch #1 {Exception -> 0x012b, blocks: (B:141:0x00b6, B:100:0x00c0, B:103:0x00cc, B:105:0x00da, B:107:0x00e2, B:109:0x00e8, B:111:0x00f0, B:113:0x00f6, B:118:0x0102, B:119:0x010a, B:121:0x010f, B:126:0x011b, B:127:0x0123, B:98:0x00bc), top: B:140:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0196 A[Catch: Exception -> 0x01bb, TryCatch #0 {Exception -> 0x01bb, blocks: (B:181:0x0155, B:146:0x015d, B:148:0x0169, B:150:0x0171, B:152:0x0177, B:154:0x017f, B:155:0x0183, B:157:0x018a, B:162:0x0196, B:163:0x019e, B:165:0x01a3, B:170:0x01af, B:171:0x01b7, B:145:0x015b), top: B:180:0x0155 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01af A[Catch: Exception -> 0x01bb, TryCatch #0 {Exception -> 0x01bb, blocks: (B:181:0x0155, B:146:0x015d, B:148:0x0169, B:150:0x0171, B:152:0x0177, B:154:0x017f, B:155:0x0183, B:157:0x018a, B:162:0x0196, B:163:0x019e, B:165:0x01a3, B:170:0x01af, B:171:0x01b7, B:145:0x015b), top: B:180:0x0155 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t7(int r26, android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.ui.BaseScanUI.t7(int, android.os.Bundle):void");
    }

    public void u7(boolean z17, boolean z18, com.tencent.mm.plugin.scanner.view.r rVar) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(z17);
        com.tencent.mm.plugin.scanner.model.r1 r1Var = this.X;
        objArr[1] = java.lang.Boolean.valueOf(r1Var != null && r1Var.f159004e);
        objArr[2] = java.lang.Boolean.valueOf(z18);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "showLoadingView show: %b, isLoadingShow: %b, withAnimation: %b", objArr);
        this.T = z17;
        if (r1Var != null) {
            r1Var.f159005f = rVar;
            if (r1Var.f159004e != z17) {
                r1Var.a(z17, z18);
                if (z17) {
                    this.f159153p.a(false);
                    this.f159153p.b(false, null);
                }
            }
        }
    }

    public final void v7(boolean z17) {
        if (!z17) {
            android.view.View view = this.f159147h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/BaseScanUI", "showNoScanContent", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/BaseScanUI", "showNoScanContent", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = this.f159144e;
            if (scanUIRectView != null) {
                com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView scanSharedMaskView = scanUIRectView.f159401r;
                if (scanSharedMaskView != null) {
                    scanSharedMaskView.b(true);
                }
                com.tencent.mm.plugin.scanner.view.BaseScanMaskView baseScanMaskView = scanUIRectView.f159402s;
                if (baseScanMaskView != null) {
                    baseScanMaskView.r(true);
                }
            }
            this.f159153p.a(true);
            return;
        }
        android.view.View view2 = this.f159147h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/BaseScanUI", "showNoScanContent", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/BaseScanUI", "showNoScanContent", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.scanner.view.BaseScanMaskView baseScanMaskView2 = this.f159144e.f159402s;
        if (baseScanMaskView2 != null && (baseScanMaskView2 instanceof com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView)) {
            ((com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView) baseScanMaskView2).Q.cancel();
        }
        this.f159147h.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.29
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view3) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(view3);
                java.lang.Object[] array = arrayList3.toArray();
                arrayList3.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/BaseScanUI$29", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                int i17 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.Z1;
                com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                baseScanUI.getClass();
                baseScanUI.v7(false);
                baseScanUI.n7();
                yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/BaseScanUI$29", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView2 = this.f159144e;
        if (scanUIRectView2 != null) {
            com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView scanSharedMaskView2 = scanUIRectView2.f159401r;
            if (scanSharedMaskView2 != null) {
                scanSharedMaskView2.b(false);
            }
            com.tencent.mm.plugin.scanner.view.BaseScanMaskView baseScanMaskView3 = scanUIRectView2.f159402s;
            if (baseScanMaskView3 != null) {
                baseScanMaskView3.r(false);
            }
        }
        this.f159153p.a(false);
        s7(false, true);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [com.tencent.mm.plugin.scanner.ui.BaseScanUI$5, com.tencent.mm.plugin.scanner.model.y1] */
    public final void w7(final sz3.w0 w0Var, final boolean z17, int i17, int i18, final int i19, sz3.a1 a1Var) {
        if (w0Var == null) {
            return;
        }
        if (i17 > 0) {
            com.tencent.mm.plugin.scanner.model.h2.u(this.C, this.S, 5, i18, i17, this.A, w0Var.f414132c, w0Var.f414133d, w0Var.f414144o, w0Var.f414143n, w0Var.f414141l, 0);
        }
        this.A1 = false;
        this.W = com.tencent.wechat.aff.iam_scan.f1.SHOW_PRODUCT_RESULT;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "showScanProductResult reqKey: %s, action: %s", w0Var.f414139j, w0Var.f414145p);
        java.lang.String str = w0Var.f414145p;
        if (str != null && str.equals("retrieval_by_req_key_circle_search")) {
            ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI$$b
                /* JADX WARN: Removed duplicated region for block: B:26:0x0202  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x0258  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x025d  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x0265  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x026b  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0271  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x0281  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x02b0  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x02ea  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x0328  */
                /* JADX WARN: Removed duplicated region for block: B:73:0x032d  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x0353  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x0331  */
                /* JADX WARN: Removed duplicated region for block: B:90:0x02b2  */
                /* JADX WARN: Removed duplicated region for block: B:91:0x0274  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x026e  */
                /* JADX WARN: Removed duplicated region for block: B:93:0x0268  */
                /* JADX WARN: Removed duplicated region for block: B:94:0x0262  */
                /* JADX WARN: Removed duplicated region for block: B:95:0x025a  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 931
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.ui.BaseScanUI$$b.run():void");
                }
            }, "MicroMsg.ScanUI");
            com.tencent.mm.plugin.scanner.view.BaseScanMaskView baseScanMaskView = this.f159144e.f159402s;
            if (baseScanMaskView != null) {
                baseScanMaskView.t(false, null);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "showScanProductResult default");
        ?? r47 = new com.tencent.mm.plugin.scanner.model.y1() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.5
            @Override // com.tencent.mm.plugin.scanner.model.y1
            public void a(uy3.j0 j0Var) {
                com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                if (baseScanUI.isFinishing()) {
                    return;
                }
                uy3.j0 j0Var2 = baseScanUI.f159157r;
                if (j0Var2 != null) {
                    j0Var2.dismissDialog(0);
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var = baseScanUI.f159156q;
                if (k0Var != null && k0Var.i()) {
                    baseScanUI.f159156q.u();
                }
                baseScanUI.f159157r = j0Var;
                android.view.ViewParent scanMaskView = baseScanUI.f159144e.getScanMaskView();
                if (scanMaskView instanceof com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView) {
                    uy3.j0 j0Var3 = baseScanUI.f159157r;
                    com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView listener = (com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView) scanMaskView;
                    j0Var3.getClass();
                    kotlin.jvm.internal.o.g(listener, "listener");
                    com.tencent.mm.plugin.scanner.box.BaseBoxDialogView baseBoxDialogView = j0Var3.f431956q;
                    if (baseBoxDialogView != null) {
                        baseBoxDialogView.setBackgroundListener(listener);
                    }
                }
                if ((scanMaskView instanceof uy3.s) && z17) {
                    uy3.j0 j0Var4 = baseScanUI.f159157r;
                    uy3.s viewModel = (uy3.s) scanMaskView;
                    j0Var4.getClass();
                    kotlin.jvm.internal.o.g(viewModel, "viewModel");
                    com.tencent.mm.plugin.scanner.box.BaseBoxDialogView baseBoxDialogView2 = j0Var4.f431956q;
                    if (baseBoxDialogView2 != null) {
                        baseBoxDialogView2.setBackgroundViewModel(viewModel);
                    }
                }
            }

            public void b(sz3.w0 w0Var2) {
                long j17 = w0Var2.f414132c;
                int i27 = w0Var2.f414131b;
                int i28 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.Z1;
                com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                baseScanUI.Y6(2);
                baseScanUI.s7(false, false);
                baseScanUI.G = false;
                baseScanUI.V = false;
                baseScanUI.T = true;
                baseScanUI.A1 = true;
                baseScanUI.p7(false);
                rz3.g gVar = baseScanUI.f159159t;
                if (gVar != null) {
                    gVar.c(j17, true);
                }
                com.tencent.mm.plugin.scanner.view.BaseScanMaskView baseScanMaskView2 = baseScanUI.f159144e.f159402s;
                if (baseScanMaskView2 != null) {
                    baseScanMaskView2.t(false, null);
                }
                baseScanUI.f159144e.setScanSource(i27);
                com.tencent.mm.plugin.scanner.model.h2.D(baseScanUI.C);
            }
        };
        com.tencent.mm.plugin.scanner.model.c2 c2Var = this.O1;
        c2Var.getClass();
        r47.b(w0Var);
        com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = this.f159144e;
        com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher scannerFlashSwitcher = this.f159145f;
        boolean z18 = scannerFlashSwitcher != null && scannerFlashSwitcher.f159465g;
        d04.f0 f0Var = new d04.f0(w0Var, z17);
        com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView2 = scanUIRectView instanceof com.tencent.mm.plugin.scanner.ui.ScanUIRectView ? scanUIRectView : null;
        if (scanUIRectView2 != null) {
            scanUIRectView2.v(f0Var, new com.tencent.mm.plugin.scanner.model.b2(this, w0Var, c2Var, r47), z18, this.T1 != 1);
        }
    }

    @Override // rz3.f
    public void x() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "finishUI");
        finish();
        overridePendingTransition(0, 0);
    }

    public void x7(final int i17) {
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator listener;
        r7(true);
        this.T = false;
        if (i17 != 12 || this.X == null) {
            return;
        }
        this.f159153p.b(false, null);
        com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView scanSharedMaskView = this.f159148i;
        if (scanSharedMaskView != null) {
            scanSharedMaskView.a(true, null);
        }
        com.tencent.mm.plugin.scanner.model.r1 r1Var = this.X;
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = new android.animation.AnimatorListenerAdapter() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.41
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                super.onAnimationEnd(animator);
                com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.f159161v.c(i17, 4);
            }
        };
        com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView scanInfoMaskView = r1Var.f159003d;
        if (scanInfoMaskView != null) {
            android.view.View view = scanInfoMaskView.f159704h;
            if (view == null) {
                kotlin.jvm.internal.o.o("infoLayout");
                throw null;
            }
            if (view.getVisibility() == 0) {
                android.view.View view2 = scanInfoMaskView.f159702f;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("loadingLayout");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "animateSwitch", "(Landroid/animation/AnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "animateSwitch", "(Landroid/animation/AnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view3 = scanInfoMaskView.f159704h;
                if (view3 == null) {
                    kotlin.jvm.internal.o.o("infoLayout");
                    throw null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "animateViewAlpha", "(Landroid/view/View;ZJLandroid/animation/AnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "animateViewAlpha", "(Landroid/view/View;ZJLandroid/animation/AnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanInfoMaskView", "animateViewAlpha view: %s, show: %b", view3, java.lang.Boolean.FALSE);
                android.view.ViewPropertyAnimator animate = view3.animate();
                if (animate != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(150L)) != null && (listener = duration.setListener(new d04.w0(view3, false, animatorListenerAdapter))) != null) {
                    listener.start();
                }
            }
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.42
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView scanSharedMaskView2;
                com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                if (baseScanUI.Y && (scanSharedMaskView2 = baseScanUI.f159148i) != null) {
                    baseScanUI.Y = false;
                    scanSharedMaskView2.a(false, new android.animation.AnimatorListenerAdapter() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.42.1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(android.animation.Animator animator) {
                            super.onAnimationEnd(animator);
                            com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI2 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                            int i18 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.Z1;
                            baseScanUI2.p7(true);
                            com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = baseScanUI2.f159144e;
                            if (scanUIRectView != null) {
                                scanUIRectView.setIgnorePreviewFrame(false);
                                baseScanUI2.f159144e.k(0L);
                            }
                        }
                    });
                    return;
                }
                baseScanUI.p7(true);
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = baseScanUI.f159144e;
                if (scanUIRectView != null) {
                    scanUIRectView.setIgnorePreviewFrame(false);
                    baseScanUI.f159144e.k(0L);
                }
            }
        };
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(runnable, 1000L, false);
    }

    public final void y7() {
        if (this.f159167y0) {
            com.tencent.mm.sdk.platformtools.o4 o4Var = com.tencent.mm.plugin.scanner.model.d1.f158851i;
            boolean z17 = o4Var != null ? o4Var.getBoolean("scan_config_disable_scan_product", false) : false;
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanFastFocusEngineManager", "disableScanProductInMergeMode: " + z17);
            if (this.F) {
                this.f159149l1 = z17 || this.f159164x0;
            } else {
                this.f159149l1 = true;
            }
            com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = this.f159144e;
            if (scanUIRectView != null) {
                scanUIRectView.setDisableScanProductInMergeMode(this.f159149l1);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "updateDisableScanProductInMergeMode config: %s, current: %s, currentNetwork: %s, willCrash: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f159149l1), java.lang.Boolean.valueOf(this.F), java.lang.Boolean.valueOf(this.f159164x0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r1 == 3) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0023, code lost:
    
        if (r5.Q == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z7() {
        /*
            r5 = this;
            com.tencent.mm.plugin.scanner.ui.component.ScanUITopOpButtonComponent r0 = r5.f159153p
            boolean r1 = r5.f7()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L1d
            int r1 = r5.C
            r4 = 12
            if (r1 != r4) goto L12
            r4 = r2
            goto L13
        L12:
            r4 = r3
        L13:
            if (r4 != 0) goto L1d
            r4 = 3
            if (r1 != r4) goto L1a
            r1 = r2
            goto L1b
        L1a:
            r1 = r3
        L1b:
            if (r1 == 0) goto L26
        L1d:
            boolean r1 = r5.L
            if (r1 != 0) goto L26
            boolean r1 = r5.Q
            if (r1 != 0) goto L26
            goto L27
        L26:
            r2 = r3
        L27:
            r0.setShowMoreButton(r2)
            com.tencent.mm.plugin.scanner.ui.component.ScanUITopOpButtonComponent r0 = r5.f159153p
            com.tencent.mm.plugin.scanner.ui.BaseScanUI$23 r1 = new com.tencent.mm.plugin.scanner.ui.BaseScanUI$23
            r1.<init>()
            r0.setOnMoreClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.ui.BaseScanUI.z7():void");
    }
}
