package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes15.dex */
public class ScanUIRectView extends com.tencent.scanlib.ui.ScanView {
    public static final int P1 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_scan_code_continuous_max_frame, 50);
    public java.lang.String A;
    public boolean A1;
    public java.lang.String B;
    public final e04.l2 B1;
    public java.lang.String C;
    public int C1;
    public com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView D;
    public long D1;
    public d04.h E;
    public final long E1;
    public d04.i F;
    public boolean F1;
    public com.tencent.mm.plugin.scanner.model.u G;
    public boolean G1;
    public d04.y2 H;
    public boolean H1;
    public boolean I;
    public boolean I1;

    /* renamed from: J, reason: collision with root package name */
    public boolean f159395J;
    public boolean J1;
    public int K;
    public java.lang.Runnable K1;
    public float L;
    public final e04.j1 L1;
    public int M;
    public final at5.b M1;
    public boolean N;
    public final com.tencent.mm.sdk.event.IListener N1;
    public final android.view.GestureDetector O1;
    public android.graphics.Point P;
    public boolean Q;
    public boolean R;
    public final e04.g1 S;
    public final e04.h1 T;
    public boolean U;
    public int V;
    public boolean W;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f159396l1;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.view.ScanRectDecorView f159397p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f159398p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f159399p1;

    /* renamed from: q, reason: collision with root package name */
    public d04.j f159400q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView f159401r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.view.BaseScanMaskView f159402s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher f159403t;

    /* renamed from: u, reason: collision with root package name */
    public int f159404u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f159405v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f159406w;

    /* renamed from: x, reason: collision with root package name */
    public long f159407x;

    /* renamed from: x0, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.api.BaseScanRequest f159408x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f159409x1;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.wechat.aff.iam_scan.d1 f159410y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f159411y0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f159412y1;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.ui.ScanUIRectView.ScanCallBack f159413z;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f159414z1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanUIRectView$1, reason: invalid class name */
    /* loaded from: classes15.dex */
    public class AnonymousClass1 extends qt5.g {
        public AnonymousClass1() {
        }

        @Override // qt5.f
        public void a() {
            com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
            int i17 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.P1;
            if (scanUIRectView.f215307m) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "onResume cameraOpened isOpen: %s, hasCameraPermission: %s, cameraFacing: %s", java.lang.Boolean.valueOf(((qt5.c) scanUIRectView.f215302e).f366657b), java.lang.Boolean.valueOf(com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.R), java.lang.Integer.valueOf(((qt5.c) com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e).f366673r));
            com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView2 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
            e04.j1 j1Var = scanUIRectView2.L1;
            qt5.i0 i0Var = scanUIRectView2.f215302e;
            j1Var.c(((qt5.c) i0Var).f366673r, ((qt5.c) i0Var).f366674s);
            if (((qt5.c) com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e).f366657b) {
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView.o(com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this);
                uo.n.f429522a.f(com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.getContext());
            } else {
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView.n(com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this);
                uo.n.f429522a.g(3, true, new yz5.a() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView$1$$a
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        boolean z17;
                        com.tencent.mm.plugin.scanner.ui.ScanUIRectView.AnonymousClass1 anonymousClass1 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.AnonymousClass1.this;
                        if ((com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.getContext() instanceof android.app.Activity) && !((android.app.Activity) com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.getContext()).isFinishing()) {
                            com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView3 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                            int i18 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.P1;
                            if (!((qt5.c) scanUIRectView3.f215302e).f366657b) {
                                z17 = false;
                                return java.lang.Boolean.valueOf(z17);
                            }
                        }
                        z17 = true;
                        return java.lang.Boolean.valueOf(z17);
                    }
                }, new yz5.p() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView$1$$b
                    @Override // yz5.p
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        final java.lang.Integer num = (java.lang.Integer) obj;
                        final yz5.l lVar = (yz5.l) obj2;
                        final com.tencent.mm.plugin.scanner.ui.ScanUIRectView.AnonymousClass1 anonymousClass1 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.AnonymousClass1.this;
                        anonymousClass1.getClass();
                        com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.g(new qt5.g() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.1.1
                            @Override // qt5.f
                            public void a() {
                                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView3 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                                int i18 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.P1;
                                if (scanUIRectView3.f215307m) {
                                    return;
                                }
                                com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "retryOpenCameraDelay %s s, cameraOpened isOpen: %s, hasCameraPermission: %s, cameraFacing: %s", java.lang.Boolean.valueOf(((qt5.c) scanUIRectView3.f215302e).f366657b), num, java.lang.Boolean.valueOf(com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.R), java.lang.Integer.valueOf(((qt5.c) com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e).f366673r));
                                lVar.invoke(java.lang.Boolean.valueOf(((qt5.c) com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e).f366657b));
                                if (((qt5.c) com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e).f366657b) {
                                    com.tencent.mm.plugin.scanner.ui.ScanUIRectView.o(com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this);
                                }
                            }
                        });
                        return null;
                    }
                });
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanUIRectView$11, reason: invalid class name */
    /* loaded from: classes15.dex */
    class AnonymousClass11 implements yz5.a {
        public AnonymousClass11() {
        }

        @Override // yz5.a
        public java.lang.Object invoke() {
            com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
            scanUIRectView.f159401r.setDisableTips(true);
            scanUIRectView.f159402s.setDisableScanTips(true);
            return null;
        }
    }

    /* loaded from: classes13.dex */
    public interface OnSingleTapListener {
    }

    /* loaded from: classes15.dex */
    public interface ScanCallBack {
    }

    public ScanUIRectView(android.content.Context context) {
        super(context);
        this.f159404u = 1;
        this.f159405v = true;
        this.f159406w = true;
        this.f159410y = null;
        this.I = true;
        this.f159395J = false;
        this.K = 0;
        this.M = 120;
        this.N = false;
        this.P = null;
        this.Q = true;
        this.R = true;
        this.S = new e04.g1();
        this.T = new e04.h1();
        this.U = false;
        this.V = 0;
        this.W = true;
        this.f159398p0 = false;
        this.f159411y0 = false;
        this.f159396l1 = false;
        this.f159399p1 = false;
        this.f159409x1 = false;
        this.f159412y1 = false;
        this.f159414z1 = true;
        this.A1 = false;
        e04.l2 l2Var = new e04.l2();
        this.B1 = l2Var;
        this.C1 = 0;
        this.D1 = 0L;
        this.E1 = l2Var.f246008b;
        this.F1 = false;
        this.G1 = true;
        this.H1 = false;
        this.I1 = false;
        this.J1 = false;
        this.K1 = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView.l(com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this);
            }
        };
        this.L1 = new e04.j1();
        this.M1 = new at5.b() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.15
            @Override // at5.b
            public void a(final long j17, final android.os.Bundle bundle) {
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.15.3
                    @Override // java.lang.Runnable
                    public void run() {
                        android.os.Bundle bundle2;
                        try {
                            long j18 = j17;
                            if (j18 != com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f159407x || j18 == 0 || (bundle2 = bundle) == null || !bundle2.containsKey("param_zoom_ratio")) {
                                return;
                            }
                            float f17 = bundle.getFloat("param_zoom_ratio", 0.0f);
                            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "zoom to scale %f", java.lang.Float.valueOf(f17));
                            if (f17 > 0.0f) {
                                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                                if (scanUIRectView.W && ((qt5.c) scanUIRectView.f215302e).f366658c) {
                                    ((qt5.c) com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e).p((int) (((qt5.c) com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e).c() * f17));
                                    zs5.g0 g0Var = zs5.g0.F;
                                    g0Var.f475384q++;
                                    g0Var.f475385r = f17 * g0Var.f475385r;
                                    g0Var.f475386s = java.lang.System.currentTimeMillis() - 0;
                                }
                            }
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanUIRectView", e17, "zoomToScale exception", new java.lang.Object[0]);
                        }
                    }
                });
            }

            @Override // at5.b
            public void b(final long j17, final java.util.List list, final java.util.List list2, java.util.List list3, final android.os.Bundle bundle) {
                java.lang.String.format("scan code after decode %d", java.lang.Long.valueOf(j17));
                final long currentTimeMillis = java.lang.System.currentTimeMillis();
                zs5.n0 n0Var = zs5.n0.f475450a;
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                n0Var.d(scanUIRectView.f159407x, scanUIRectView.f159410y);
                if (list == null || list.isEmpty()) {
                    return;
                }
                scanUIRectView.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.15.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.mm.plugin.scanner.ui.ScanUIRectView.AnonymousClass15 anonymousClass15 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.AnonymousClass15.this;
                        com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView2 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                        long j18 = scanUIRectView2.f159407x;
                        long j19 = j17;
                        if (j18 != j19 || j19 == 0) {
                            return;
                        }
                        e04.j1 j1Var = scanUIRectView2.L1;
                        j1Var.f245984s = true;
                        j1Var.f245985t = currentTimeMillis - j1Var.f245966a;
                        e04.i1 i1Var = e04.i1.f245958f;
                        i1Var.toString();
                        j1Var.f245986u = i1Var;
                        com.tencent.wechat.aff.iam_scan.f1 f1Var = com.tencent.wechat.aff.iam_scan.f1.DECODE_SUCCESS;
                        com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView3 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                        scanUIRectView3.G(f1Var);
                        java.util.List list4 = list;
                        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(list4);
                        java.util.Iterator it = list2.iterator();
                        int i17 = 0;
                        while (it.hasNext()) {
                            if (((com.tencent.qbar.QbarNative$QBarPoint) it.next()) != null) {
                                i17++;
                            }
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "onDecodeSuccess result size: %d, codePointCount: %d", java.lang.Integer.valueOf(list4.size()), java.lang.Integer.valueOf(i17));
                        final android.os.Bundle bundle2 = new android.os.Bundle();
                        bundle2.putParcelableArrayList("result_qbar_result_list", arrayList);
                        bundle2.putInt("result_code_point_count", i17);
                        if (scanUIRectView3.getScanCodeRect() != null) {
                            bundle2.putFloatArray("result_code_image_rect", new float[]{r9.left, r9.top, r9.right, r9.bottom});
                        }
                        android.os.Bundle bundle3 = bundle;
                        if (bundle3 != null) {
                            bundle2.putAll(bundle3);
                        }
                        com.tencent.mm.plugin.scanner.view.BaseScanMaskView baseScanMaskView = scanUIRectView3.f159402s;
                        if (baseScanMaskView != null && (baseScanMaskView instanceof com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView)) {
                            ((com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView) baseScanMaskView).Q.cancel();
                        }
                        com.tencent.mm.plugin.scanner.ui.ScanUIRectView.ScanCallBack scanCallBack = scanUIRectView3.f159413z;
                        if (scanCallBack != null) {
                            final long j27 = scanUIRectView3.f159407x;
                            final com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass9 anonymousClass9 = (com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass9) scanCallBack;
                            com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                            if (!baseScanUI.U) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.ScanUI", "onScanSuccess can not process code result currentMode: %d", java.lang.Integer.valueOf(baseScanUI.C));
                                return;
                            }
                            if (baseScanUI.f159159t != null) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "scan code cost time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - baseScanUI.A));
                                final java.util.ArrayList parcelableArrayList = bundle2.getParcelableArrayList("result_qbar_result_list");
                                if (parcelableArrayList == null || parcelableArrayList.size() <= 0) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.ScanUI", "onScanSuccess qbarResult invalid");
                                    return;
                                }
                                final int i18 = bundle2.getInt("result_code_point_count", 0);
                                long j28 = bundle2.getLong("decode_success_cost_time", 0L);
                                com.tencent.mm.plugin.scanner.model.h2.r(baseScanUI.C, true, baseScanUI.f159167y0 ? 3 : 1, i18);
                                com.tencent.mm.plugin.scanner.model.d.a(1, null);
                                com.tencent.mm.plugin.scanner.model.h2.D(baseScanUI.C);
                                baseScanUI.k7(true, i18 > 1);
                                baseScanUI.p7(false);
                                int i19 = baseScanUI.C;
                                com.tencent.mm.plugin.scanner.model.d2 d2Var = new com.tencent.mm.plugin.scanner.model.d2(parcelableArrayList, j28);
                                com.tencent.mm.plugin.scanner.model.h2.f158930k = d2Var;
                                try {
                                    java.lang.String d17 = com.tencent.mm.plugin.scanner.model.h2.d(i19);
                                    d2Var.f158868c = d17 != null ? java.lang.Long.parseLong(d17) : java.lang.System.currentTimeMillis();
                                    com.tencent.mm.plugin.scanner.model.d2 d2Var2 = com.tencent.mm.plugin.scanner.model.h2.f158930k;
                                    if (d2Var2 != null) {
                                        java.lang.String c17 = com.tencent.mm.plugin.scanner.model.h2.c(i19);
                                        d2Var2.f158869d = c17 != null ? java.lang.Long.parseLong(c17) : java.lang.System.currentTimeMillis();
                                    }
                                    com.tencent.mm.plugin.scanner.model.d2 d2Var3 = com.tencent.mm.plugin.scanner.model.h2.f158930k;
                                    if (d2Var3 != null) {
                                        d2Var3.f158870e = java.lang.Long.parseLong(com.tencent.mm.plugin.scanner.model.h2.f158921b);
                                    }
                                    com.tencent.mm.plugin.scanner.model.d2 d2Var4 = com.tencent.mm.plugin.scanner.model.h2.f158930k;
                                    if (d2Var4 != null) {
                                        d2Var4.f158871f = java.lang.System.currentTimeMillis();
                                    }
                                } catch (java.lang.Exception unused) {
                                }
                                boolean z17 = baseScanUI.f159145f.f159465g;
                                final com.tencent.qbar.WxQBarResult wxQBarResult = (com.tencent.qbar.WxQBarResult) parcelableArrayList.get(0);
                                if (wxQBarResult == null) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "firstQBarResult is null");
                                    return;
                                }
                                final com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo = (com.tencent.qbar.ScanIdentifyReportInfo) bundle2.getParcelable("ScanIdentifyReportInfo.DecodeKey");
                                if (com.tencent.mm.plugin.scanner.ui.BaseScanUI.V6(baseScanUI, wxQBarResult, parcelableArrayList.size() <= 1, scanIdentifyReportInfo)) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.ScanUI", "scan code has deal with");
                                    return;
                                }
                                com.tencent.mm.plugin.scanner.model.h2.q(com.tencent.mm.plugin.scanner.j1.b(com.tencent.mm.plugin.scanner.j1.a(wxQBarResult.f475331e)) ? 1 : 2, 1, baseScanUI.D1, baseScanUI.S);
                                bundle2.putInt("qbar_string_scan_source", 0);
                                if (i18 <= 0 || baseScanUI.f159144e == null) {
                                    baseScanUI.p7(true);
                                    if (com.tencent.mm.plugin.scanner.ui.BaseScanUI.V6(baseScanUI, wxQBarResult, true, scanIdentifyReportInfo)) {
                                        return;
                                    }
                                    com.tencent.mm.plugin.scanner.ui.BaseScanUI.W6(baseScanUI, j27, bundle2, wxQBarResult);
                                    return;
                                }
                                com.tencent.qbar.ScanDecodeFrameData scanDecodeFrameData = (com.tencent.qbar.ScanDecodeFrameData) bundle2.getParcelable("decode_success_frame_data");
                                if (scanDecodeFrameData != null) {
                                    baseScanUI.f159144e.setDecodeSuccessFrameData(scanDecodeFrameData);
                                }
                                baseScanUI.f159165x1 = i18 > 1;
                                baseScanUI.M1 = null;
                                if (i18 > 1) {
                                    baseScanUI.f159153p.a(false);
                                    baseScanUI.f159153p.b(true, null);
                                    baseScanUI.r7(false);
                                }
                                baseScanUI.T = true;
                                baseScanUI.f159144e.setSuccessMarkClickListener(new com.tencent.mm.plugin.scanner.model.i2() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.9.1

                                    /* renamed from: a */
                                    public final /* synthetic */ java.util.ArrayList f159272a;

                                    /* renamed from: b */
                                    public final /* synthetic */ int f159273b;

                                    /* renamed from: c */
                                    public final /* synthetic */ com.tencent.qbar.ScanIdentifyReportInfo f159274c;

                                    /* renamed from: d */
                                    public final /* synthetic */ long f159275d;

                                    /* renamed from: e */
                                    public final /* synthetic */ android.os.Bundle f159276e;

                                    public AnonymousClass1(final java.util.ArrayList parcelableArrayList2, final int i182, final com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo2, final long j272, final android.os.Bundle bundle22) {
                                        r2 = parcelableArrayList2;
                                        r3 = i182;
                                        r4 = scanIdentifyReportInfo2;
                                        r5 = j272;
                                        r7 = bundle22;
                                    }

                                    @Override // com.tencent.mm.plugin.scanner.model.i2
                                    public void a(int i27, android.view.View view) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "onScanSuccess onClick mark index: %d", java.lang.Integer.valueOf(i27));
                                        java.util.ArrayList arrayList2 = r2;
                                        if (i27 >= arrayList2.size() || r3 <= 1) {
                                            return;
                                        }
                                        com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass9 anonymousClass92 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass9.this;
                                        com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.T = false;
                                        com.tencent.qbar.WxQBarResult wxQBarResult2 = (com.tencent.qbar.WxQBarResult) arrayList2.get(i27);
                                        com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo2 = r4;
                                        com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI2 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                                        if (!com.tencent.mm.plugin.scanner.ui.BaseScanUI.V6(baseScanUI2, wxQBarResult2, true, scanIdentifyReportInfo2)) {
                                            com.tencent.mm.plugin.scanner.ui.BaseScanUI.W6(baseScanUI2, r5, r7, wxQBarResult2);
                                        }
                                        com.tencent.mm.plugin.scanner.model.h2.n(2, i27, baseScanUI2.f159167y0);
                                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, !com.tencent.mm.plugin.scanner.model.h2.f158929j ? 63 : 83);
                                    }
                                });
                                baseScanUI.Y6(2);
                                baseScanUI.s7(false, false);
                                baseScanUI.h7();
                                baseScanUI.f159144e.v(parcelableArrayList2, new com.tencent.mm.plugin.scanner.view.w0() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.9.2

                                    /* renamed from: a */
                                    public final /* synthetic */ int f159278a;

                                    /* renamed from: b */
                                    public final /* synthetic */ java.util.ArrayList f159279b;

                                    /* renamed from: c */
                                    public final /* synthetic */ com.tencent.qbar.WxQBarResult f159280c;

                                    /* renamed from: d */
                                    public final /* synthetic */ com.tencent.qbar.ScanIdentifyReportInfo f159281d;

                                    /* renamed from: e */
                                    public final /* synthetic */ long f159282e;

                                    /* renamed from: f */
                                    public final /* synthetic */ android.os.Bundle f159283f;

                                    public AnonymousClass2(final int i182, final java.util.ArrayList parcelableArrayList2, final com.tencent.qbar.WxQBarResult wxQBarResult2, final com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo2, final long j272, final android.os.Bundle bundle22) {
                                        r2 = i182;
                                        r3 = parcelableArrayList2;
                                        r4 = wxQBarResult2;
                                        r5 = scanIdentifyReportInfo2;
                                        r6 = j272;
                                        r8 = bundle22;
                                    }

                                    @Override // com.tencent.mm.plugin.scanner.view.w0
                                    public void b(boolean z18) {
                                        com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass9 anonymousClass92 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass9.this;
                                        if (!z18 && r2 != 1 && r3.size() != 1) {
                                            com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.f159161v.a(false);
                                            return;
                                        }
                                        com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI2 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                                        baseScanUI2.T = false;
                                        com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo2 = r5;
                                        com.tencent.qbar.WxQBarResult wxQBarResult2 = r4;
                                        if (!com.tencent.mm.plugin.scanner.ui.BaseScanUI.V6(baseScanUI2, wxQBarResult2, true, scanIdentifyReportInfo2)) {
                                            com.tencent.mm.plugin.scanner.ui.BaseScanUI.W6(com.tencent.mm.plugin.scanner.ui.BaseScanUI.this, r6, r8, wxQBarResult2);
                                        }
                                        com.tencent.mm.plugin.scanner.model.h2.n(1, 0, com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.f159167y0);
                                    }

                                    @Override // com.tencent.mm.plugin.scanner.view.w0
                                    public void c() {
                                    }
                                }, z17, true);
                            }
                        }
                    }
                });
            }

            @Override // at5.b
            public void c(long j17, long j18) {
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                if (j17 != scanUIRectView.f159407x || j17 == 0) {
                    return;
                }
                scanUIRectView.k(j18);
            }

            @Override // at5.b
            public void d(byte[] bArr, com.tencent.wechat.aff.iam_scan.y yVar) {
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                if (!scanUIRectView.f159396l1) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ScanUIRectView", "enableScanCodeProductMerge false, return");
                    return;
                }
                if (scanUIRectView.f159399p1) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ScanUIRectView", "disableScanProductInMergeMode true, return");
                    return;
                }
                try {
                    if (((qt5.c) scanUIRectView.f215302e).f366657b) {
                        qt5.i0 i0Var = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e;
                        android.graphics.Point point = ((qt5.c) i0Var).f366662g;
                        vz3.t.f441710a.k(yVar, new tz3.d(bArr, point.x, point.y, ((qt5.c) i0Var).f366667l, ((xy3.a) i0Var).f366656a.getParameters().getPreviewFormat(), true));
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanUIRectView", e17, "", new java.lang.Object[0]);
                }
            }
        };
        this.N1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanFlashSwitchEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.16
            {
                this.__eventId = 208336003;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ScanFlashSwitchEvent scanFlashSwitchEvent) {
                int i17 = scanFlashSwitchEvent.f54730g.f8033a;
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                if (i17 == 1) {
                    int i18 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.P1;
                    xy3.a aVar = (xy3.a) scanUIRectView.f215302e;
                    if (!aVar.f366668m) {
                        aVar.t();
                    }
                } else {
                    int i19 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.P1;
                    xy3.a aVar2 = (xy3.a) scanUIRectView.f215302e;
                    if (aVar2.f366668m) {
                        aVar2.q();
                    }
                }
                return true;
            }
        };
        this.O1 = new android.view.GestureDetector(new android.view.GestureDetector.SimpleOnGestureListener() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.17
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
            public boolean onContextClick(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onContextClick = super.onContextClick(motionEvent);
                yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
                return onContextClick;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
                motionEvent.getActionIndex();
                motionEvent.getX(motionEvent.getActionIndex());
                motionEvent.getY(motionEvent.getActionIndex());
                int i17 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.P1;
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                qt5.i0 i0Var = scanUIRectView.f215302e;
                if (((xy3.a) i0Var).f366670o != ((xy3.a) i0Var).f366671p) {
                    ((xy3.a) i0Var).o(1);
                    com.tencent.mm.plugin.scanner.model.h2.z(scanUIRectView.f159404u, 6, scanUIRectView.f159396l1);
                } else {
                    ((xy3.a) i0Var).o(4);
                    com.tencent.mm.plugin.scanner.model.h2.z(scanUIRectView.f159404u, 5, scanUIRectView.f159396l1);
                }
                yj0.a.i(true, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
                int i17;
                int i18;
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                boolean z17 = scanUIRectView.f159395J;
                boolean z18 = scanUIRectView.I;
                if (!scanUIRectView.N && z18 && java.lang.Math.abs(f17) > java.lang.Math.abs(f18)) {
                    if (f17 < -1200.0f && scanUIRectView.f159395J) {
                        d04.y2 y2Var = scanUIRectView.H;
                        if (y2Var != null && (i18 = y2Var.f225565d + 1) >= 0 && i18 < y2Var.f225564c.size()) {
                            y2Var.f225565d = i18;
                            com.tencent.mm.plugin.scanner.ui.widget.ScanScrollTabView scanScrollTabView = y2Var.f225563b;
                            if (scanScrollTabView != null) {
                                scanScrollTabView.h(i18, 3);
                            }
                        }
                        scanUIRectView.f159395J = false;
                    } else if (f17 > 1200.0f && scanUIRectView.f159395J) {
                        d04.y2 y2Var2 = scanUIRectView.H;
                        if (y2Var2 != null && y2Var2.f225565d - 1 >= 0 && i17 < y2Var2.f225564c.size()) {
                            y2Var2.f225565d = i17;
                            com.tencent.mm.plugin.scanner.ui.widget.ScanScrollTabView scanScrollTabView2 = y2Var2.f225563b;
                            if (scanScrollTabView2 != null) {
                                scanScrollTabView2.h(i17, 3);
                            }
                        }
                        scanUIRectView.f159395J = false;
                    }
                }
                return super.onFling(motionEvent, motionEvent2, f17, f18);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
                super.onLongPress(motionEvent);
                yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                boolean z17 = scanUIRectView.N;
                if (scanUIRectView.N) {
                    return true;
                }
                scanUIRectView.getClass();
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
                yj0.a.i(onSingleTapUp, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
                return onSingleTapUp;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.graphics.Rect getScanCodeRect() {
        return getDecorRect();
    }

    private int getScanCodeTabType() {
        if (this.f159396l1) {
            zs5.g0 g0Var = zs5.g0.F;
            return 4;
        }
        zs5.g0 g0Var2 = zs5.g0.F;
        return 1;
    }

    private com.tencent.wechat.aff.iam_scan.d1 getSessionInfo() {
        com.tencent.wechat.aff.iam_scan.d1 d1Var = new com.tencent.wechat.aff.iam_scan.d1();
        d1Var.f216987f = com.tencent.mm.plugin.scanner.model.h2.c(this.f159404u);
        d1Var.f216986e = com.tencent.mm.plugin.scanner.model.h2.f158921b;
        return d1Var;
    }

    public static void l(com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView) {
        e04.l2 l2Var = scanUIRectView.B1;
        boolean z17 = l2Var.f246019m;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "retryByPreviewTimeout hasRetry: %s", java.lang.Boolean.valueOf(z17));
        if (z17 || !scanUIRectView.q() || scanUIRectView.F1) {
            return;
        }
        scanUIRectView.G1 = false;
        scanUIRectView.F1 = true;
        com.tencent.mm.plugin.scanner.model.h2 h2Var = com.tencent.mm.plugin.scanner.model.h2.f158920a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanReporter", "reportOnPreviewFrameNotCalled");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, 0);
        int i17 = l2Var.f246013g;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "checkAndRetry retryType: %d, canRetry: %b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(i17 == 1 ? l2Var.f246015i : false));
        if ((i17 == 1 ? l2Var.f246015i : false) && i17 == 1) {
            l2Var.f246019m = true;
            e04.k2 k2Var = e04.k2.f246001f;
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanRetryManager", "setRetryReason reason: " + k2Var);
            l2Var.f246014h = k2Var;
            com.tencent.mm.plugin.scanner.model.h2.B(1, k2Var);
            scanUIRectView.p();
        }
    }

    public static void n(final com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView) {
        java.lang.StackTraceElement stackTraceElement;
        java.lang.StackTraceElement[] stackTrace;
        java.lang.StackTraceElement[] stackTrace2;
        if (scanUIRectView.R) {
            android.content.Context context = scanUIRectView.getContext();
            java.lang.String scanUISession = com.tencent.mm.plugin.scanner.model.h2.f158921b;
            yz5.a aVar = new yz5.a() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView$$b
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    int i17 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.P1;
                    com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView2 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                    scanUIRectView2.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "checkShowCameraOpenFailView onShow");
                    scanUIRectView2.E(true);
                    return null;
                }
            };
            boolean z17 = e04.a1.f245861a;
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(scanUISession, "scanUISession");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.sdk.platformtools.o4 o4Var = e04.a1.f245863c;
            if (o4Var != null) {
                o4Var.putLong("open_camera_error_time", currentTimeMillis);
            }
            e04.a1.f245861a = true;
            if (!kotlin.jvm.internal.o.b(e04.a1.f245862b, scanUISession)) {
                e04.a1.a(e04.y0.f246156e, currentTimeMillis);
            }
            e04.a1.f245862b = scanUISession;
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanCameraErrorHelper", "checkShowCameraOpenFailView scanUISession: " + scanUISession + ", errTimestamp: " + currentTimeMillis + ", lastOpenCameraError: " + e04.a1.f245861a);
            uo.n nVar = uo.n.f429522a;
            e04.z0 z0Var = new e04.z0(aVar, currentTimeMillis);
            com.tencent.mars.xlog.Log.w("MicroMsg.CameraCompat", "checkShowFailAlert: " + qt5.c.class + ", mLastErr=" + uo.n.f429525d + ", caller=" + qt5.c.class.getName());
            java.lang.Throwable th6 = uo.n.f429525d;
            if (th6 != null && (stackTrace2 = th6.getStackTrace()) != null) {
                int length = stackTrace2.length;
                for (int i17 = 0; i17 < length; i17++) {
                    stackTraceElement = stackTrace2[i17];
                    if (kotlin.jvm.internal.o.b(stackTraceElement.getClassName(), qt5.c.class.getName())) {
                        break;
                    }
                }
            }
            stackTraceElement = null;
            if (stackTraceElement != null) {
                com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
                if (!L.contains("last-open-camera-err-alert")) {
                    L.putLong("last-open-camera-err-alert", java.lang.System.currentTimeMillis());
                }
                if (!nVar.c()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.CameraCompat", "notShow: disabled");
                    return;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.CameraCompat", "postShow");
                android.app.Dialog dialog = uo.n.f429527f;
                if (!(dialog != null && dialog.isShowing())) {
                    nVar.d().removeCallbacksAndMessages(null);
                    nVar.d().postDelayed(new uo.e(context, z0Var), 1000L);
                }
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notShow: mLastErr=\n");
                java.lang.Throwable th7 = uo.n.f429525d;
                sb6.append((th7 == null || (stackTrace = th7.getStackTrace()) == null) ? null : kz5.z.d0(stackTrace, "\n", null, null, 0, null, uo.f.f429511d, 30, null));
                com.tencent.mars.xlog.Log.w("MicroMsg.CameraCompat", sb6.toString());
            }
            uo.n.f429525d = null;
        }
    }

    public static void o(com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView) {
        scanUIRectView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "onCameraOpenSuccess");
        boolean z17 = e04.a1.f245861a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCameraErrorHelper", "markCameraOpenSuccess lastOpenCameraError: " + e04.a1.f245861a);
        if (e04.a1.f245861a) {
            e04.a1.a(e04.y0.f246157f, java.lang.System.currentTimeMillis());
        }
        e04.a1.f245861a = false;
        com.tencent.mm.sdk.platformtools.o4 o4Var = e04.a1.f245863c;
        if (o4Var != null) {
            o4Var.d();
        }
        scanUIRectView.E(false);
    }

    public final void A() {
        this.f159401r.setScanRequest(this.f159408x0);
        int i17 = this.f159404u;
        if (i17 != 1 && i17 != 8) {
            if (i17 == 12) {
                this.f159401r.setScanTitle(getResources().getString(com.tencent.mm.R.string.i9a));
            } else if (i17 == 3) {
                this.f159401r.setScanTitle(getResources().getString(com.tencent.mm.R.string.i9e));
            } else if (i17 != 4) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ScanUIRectView", "refreshSharedMaskView unknown scan mode %d", java.lang.Integer.valueOf(i17));
            }
            post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.10
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView scanSharedMaskView;
                    com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                    com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView scanCodeProductMergeMaskView = scanUIRectView.D;
                    if (scanCodeProductMergeMaskView == null || (scanSharedMaskView = scanUIRectView.f159401r) == null) {
                        return;
                    }
                    int qrCodeButtonHeight = scanCodeProductMergeMaskView.getQrCodeButtonHeight();
                    android.view.View view = scanSharedMaskView.f159792i;
                    if (view == null || view.getHeight() <= 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ScanSharedMaskView", "updateGalleryIconBottomMarginDelta galleryButton is not init");
                        return;
                    }
                    android.view.View view2 = scanSharedMaskView.f159792i;
                    if (view2 == null) {
                        kotlin.jvm.internal.o.o("galleryButton");
                        throw null;
                    }
                    int height = qrCodeButtonHeight - view2.getHeight();
                    scanSharedMaskView.galleryIconBottomMarginDelta = height;
                    if (height < 0) {
                        scanSharedMaskView.galleryIconBottomMarginDelta = 0;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanSharedMaskView", "updateGalleryIconBottomMarginDelta: " + scanSharedMaskView.galleryIconBottomMarginDelta);
                    scanSharedMaskView.n(scanSharedMaskView.f159795o);
                }
            });
        }
        if (this.f159396l1) {
            this.f159401r.setScanTitle(getResources().getString(com.tencent.mm.R.string.i99));
        } else {
            this.f159401r.setScanTitle(getResources().getString(com.tencent.mm.R.string.i9f));
        }
        post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.10
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView scanSharedMaskView;
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView scanCodeProductMergeMaskView = scanUIRectView.D;
                if (scanCodeProductMergeMaskView == null || (scanSharedMaskView = scanUIRectView.f159401r) == null) {
                    return;
                }
                int qrCodeButtonHeight = scanCodeProductMergeMaskView.getQrCodeButtonHeight();
                android.view.View view = scanSharedMaskView.f159792i;
                if (view == null || view.getHeight() <= 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ScanSharedMaskView", "updateGalleryIconBottomMarginDelta galleryButton is not init");
                    return;
                }
                android.view.View view2 = scanSharedMaskView.f159792i;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("galleryButton");
                    throw null;
                }
                int height = qrCodeButtonHeight - view2.getHeight();
                scanSharedMaskView.galleryIconBottomMarginDelta = height;
                if (height < 0) {
                    scanSharedMaskView.galleryIconBottomMarginDelta = 0;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanSharedMaskView", "updateGalleryIconBottomMarginDelta: " + scanSharedMaskView.galleryIconBottomMarginDelta);
                scanSharedMaskView.n(scanSharedMaskView.f159795o);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void B() {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.B():void");
    }

    public final void C() {
        java.lang.Runnable runnable;
        if (this.J1 || (runnable = this.K1) == null) {
            return;
        }
        removeCallbacks(runnable);
        this.J1 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(long r24, boolean r26) {
        /*
            Method dump skipped, instructions count: 935
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.D(long, boolean):void");
    }

    public final void E(boolean z17) {
        this.f159406w = !z17;
        com.tencent.mm.plugin.scanner.model.u uVar = this.G;
        if (uVar != null) {
            com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = (com.tencent.mm.plugin.scanner.ui.BaseScanUI) uVar;
            baseScanUI.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "showOpenCameraFailView show: %s", java.lang.Boolean.valueOf(z17));
            baseScanUI.f159151n.setVisibility(z17 ? 0 : 8);
        }
        com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView scanSharedMaskView = this.f159401r;
        if (scanSharedMaskView != null) {
            scanSharedMaskView.setShowTips(!z17);
            this.f159401r.setShowTitle(!z17);
        }
    }

    public void F() {
        long j17 = this.f159407x;
        if (j17 != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScanUIRectView", "startNewSession fail  curSession:%s, focus mode:%s", java.lang.Long.valueOf(j17), ((qt5.c) this.f215302e).d(false));
            return;
        }
        this.f159407x = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "startNewSession:" + this.f159407x);
        if (!((qt5.c) this.f215302e).f366657b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "startNewSession openCamera");
            g(null);
        } else if (((qt5.c) this.f215302e).f366658c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "startNewSession camera is previewing");
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "startNewSession  focus mode %s", ((qt5.c) this.f215302e).d(false));
            k(0L);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "startNewSession startPreview");
            ((xy3.a) this.f215302e).r(false);
            i(new qt5.m() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.6
                @Override // qt5.l
                public void d() {
                    int i17 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.P1;
                    com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "cameraStartPreviewed startNewSession isUIPaused: %s", java.lang.Boolean.valueOf(scanUIRectView.f215307m));
                    if (scanUIRectView.f215307m) {
                        return;
                    }
                    ((xy3.a) scanUIRectView.f215302e).k();
                    scanUIRectView.k(0L);
                }
            });
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "startNewSession focus mode %s", ((qt5.c) this.f215302e).d(false));
        }
        this.f159410y = getSessionInfo();
        zs5.n0.f475450a.c(this.f159407x, getScanCodeTabType(), getSessionInfo(), this.M1);
        vz3.t.f441710a.g(this.f159407x);
    }

    public void G(com.tencent.wechat.aff.iam_scan.f1 f1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "stopCurrentSession %d, reason: %s", java.lang.Long.valueOf(this.f159407x), f1Var);
        if (this.f159407x == 0) {
            return;
        }
        com.tencent.wechat.aff.iam_scan.d1 d1Var = this.f159410y;
        if (d1Var != null) {
            d1Var.f216993o = f1Var;
            d04.j jVar = this.f159400q;
            if (jVar != null) {
                d1Var.f216994p.f216947d = jVar.getF159785y();
            }
        }
        zs5.n0.f475450a.a(this.f159407x, this.f159410y);
        vz3.t.f441710a.l(this.f159407x);
        this.f159407x = 0L;
    }

    public final void H() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "updateScanCodeRect visibleResolution: %s", this.P);
        android.graphics.Point point = this.P;
        if (point == null || point.x <= 0 || point.y <= 0) {
            return;
        }
        com.tencent.mm.plugin.scanner.view.ScanRectDecorView scanRectDecorView = this.f159397p;
        android.graphics.Point point2 = this.P;
        int i17 = point2.y;
        scanRectDecorView.setDecorRect(new android.graphics.Rect(0, (int) ((i17 * 1.0f) / 19.0f), point2.x, (int) ((i17 * 17.0f) / 19.0f)));
    }

    @Override // com.tencent.scanlib.ui.ScanView
    public void a() {
        if (((qt5.c) this.f215302e).f366657b) {
            this.U = true;
            super.a();
        }
    }

    @Override // com.tencent.scanlib.ui.ScanView
    public void b() {
        this.f215302e = new xy3.a();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0093 -> B:11:0x0090). Please report as a decompilation issue!!! */
    @Override // com.tencent.scanlib.ui.ScanView
    public void d() {
        java.lang.String str;
        java.lang.String optString;
        android.view.TextureView textureView = new android.view.TextureView(getContext());
        this.f215301d = textureView;
        textureView.setSurfaceTextureListener(this);
        addView(this.f215301d, new android.widget.FrameLayout.LayoutParams(-1, -1));
        b();
        this.f215304g = getResources().getConfiguration().orientation;
        g(new qt5.g() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.9
            @Override // qt5.f
            public void a() {
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                int i17 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.P1;
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "init cameraOpened isOpen: %s, hasCameraPermission: %s, cameraFacing: %s", java.lang.Boolean.valueOf(((qt5.c) scanUIRectView.f215302e).f366657b), java.lang.Boolean.valueOf(com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.R), java.lang.Integer.valueOf(((qt5.c) com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e).f366673r));
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView2 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                if (scanUIRectView2.f215307m) {
                    return;
                }
                e04.j1 j1Var = scanUIRectView2.L1;
                qt5.i0 i0Var = scanUIRectView2.f215302e;
                j1Var.c(((qt5.c) i0Var).f366673r, ((qt5.c) i0Var).f366674s);
                if (!((qt5.c) com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e).f366657b) {
                    com.tencent.mm.plugin.scanner.ui.ScanUIRectView.n(com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this);
                } else {
                    com.tencent.mm.plugin.scanner.ui.ScanUIRectView.o(com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this);
                    uo.n.f429522a.f(com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.getContext());
                }
            }
        });
        this.f159397p = new com.tencent.mm.plugin.scanner.view.ScanRectDecorView(getContext());
        boolean z17 = true;
        if (this.f159411y0) {
            com.tencent.mm.sdk.platformtools.o4 o4Var = com.tencent.mm.plugin.scanner.model.d1.f158851i;
            if (o4Var == null || (str = o4Var.getString("scan_config_guide_wording", "")) == null) {
                str = "";
            }
            if (!(str.length() == 0)) {
                try {
                    java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanFastFocusEngineManager", "getScanGoodsGuideWording currentLanguage: %s", d17);
                    if (kotlin.jvm.internal.o.b(d17, "zh_CN")) {
                        optString = jSONObject.optString("desc_chinese");
                    } else if (kotlin.jvm.internal.o.b(d17, "en")) {
                        optString = jSONObject.optString("desc_english");
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanFastFocusEngineManager", e17, "getScanGoodsGuideWording exception", new java.lang.Object[0]);
                }
                this.A = optString;
            }
            optString = null;
            this.A = optString;
        }
        if (this.f159396l1) {
            com.tencent.mm.sdk.platformtools.o4 o4Var2 = com.tencent.mm.plugin.scanner.model.d1.f158851i;
            java.lang.String string = o4Var2 != null ? o4Var2.getString("scan_config_scan_merge_wording", "") : null;
            if (string == null) {
                string = "";
            }
            this.B = string;
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.sdk.platformtools.o4 o4Var3 = com.tencent.mm.plugin.scanner.model.d1.f158851i;
            java.lang.String string2 = o4Var3 != null ? o4Var3.getString("scan_config_scan_retrieval_lite_succ_wording", "") : null;
            if (string2 != null && !r26.n0.N(string2)) {
                z17 = false;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanFastFocusEngineManager", "getScanMergeProductEducationWording , return default wording");
                string2 = context.getString(com.tencent.mm.R.string.i_c);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanFastFocusEngineManager", "getScanMergeProductEducationWording , return tips:" + string2);
            }
            this.C = string2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "initScanTips enableScanGoodsWording: %b, scanGoodsTips: %s, scanMergeTips: %s, scanMergeProductEducationTips: %s", java.lang.Boolean.valueOf(this.f159411y0), this.A, this.B, this.C);
        addView(this.f159397p, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        com.tencent.mm.plugin.scanner.ui.widget.ScanNewStyleSharedMaskView scanNewStyleSharedMaskView = new com.tencent.mm.plugin.scanner.ui.widget.ScanNewStyleSharedMaskView(context2, null);
        this.f159401r = scanNewStyleSharedMaskView;
        scanNewStyleSharedMaskView.o();
        this.f159403t = this.f159401r.getFlashSwitcherView();
        addView(this.f159401r, new android.widget.FrameLayout.LayoutParams(-1, -1));
        A();
        z(false);
    }

    @Override // com.tencent.scanlib.ui.ScanView
    public void e() {
        super.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "onPause");
        C();
        com.tencent.mm.plugin.scanner.view.BaseScanMaskView baseScanMaskView = this.f159402s;
        if (baseScanMaskView != null) {
            baseScanMaskView.l();
        }
        G(com.tencent.wechat.aff.iam_scan.f1.DEFAULT);
    }

    @Override // com.tencent.scanlib.ui.ScanView
    public void f() {
        super.f();
        if (!((qt5.c) this.f215302e).f366657b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "onResume openCamera");
            g(new com.tencent.mm.plugin.scanner.ui.ScanUIRectView.AnonymousClass1());
        } else if (((qt5.c) this.f215302e).f366658c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "onResume camera is previewing");
            k(0L);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "onResume startPreview");
            ((xy3.a) this.f215302e).r(false);
            i(new qt5.m() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.2
                @Override // qt5.l
                public void d() {
                    int i17 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.P1;
                    com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "cameraStartPreviewed onResume isUIPaused: %s", java.lang.Boolean.valueOf(scanUIRectView.f215307m));
                    if (scanUIRectView.f215307m) {
                        return;
                    }
                    ((xy3.a) scanUIRectView.f215302e).k();
                    scanUIRectView.k(0L);
                }
            });
        }
        if (this.f159407x == 0) {
            this.f159407x = java.lang.System.currentTimeMillis();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "onResume session: %d, %s", java.lang.Long.valueOf(this.f159407x), new com.tencent.mm.sdk.platformtools.z3());
        if (q()) {
            this.f159410y = getSessionInfo();
            zs5.n0.f475450a.c(this.f159407x, getScanCodeTabType(), this.f159410y, this.M1);
            vz3.t.f441710a.g(this.f159407x);
        }
        com.tencent.mm.plugin.scanner.view.BaseScanMaskView baseScanMaskView = this.f159402s;
        if (baseScanMaskView != null) {
            baseScanMaskView.n();
        }
        com.tencent.mm.sdk.platformtools.u3.i(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.3
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                com.tencent.mm.plugin.scanner.api.BaseScanRequest baseScanRequest = scanUIRectView.f159408x0;
                if (baseScanRequest == null || !baseScanRequest.f158664f) {
                    com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector scanCameraLightDetector = com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector.f159829l;
                    try {
                        scanCameraLightDetector.f159831b = ((xy3.a) scanUIRectView.f215302e).d(true);
                        scanCameraLightDetector.c();
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanCameraLightDetector", e17, "start error: %s", e17.getMessage());
                    }
                }
            }
        }, 300L);
        this.f159412y1 = true;
    }

    @Override // com.tencent.scanlib.ui.ScanView
    public void g(final qt5.f fVar) {
        if (!this.Q) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScanUIRectView", "openCamera not enable and stop");
            return;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (j35.u.h(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.CAMERA")) {
            this.U = false;
            super.g(new qt5.g() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.7

                /* renamed from: a, reason: collision with root package name */
                public long f159456a = 0;

                @Override // qt5.f
                public void a() {
                    com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "cameraOpened, ignoreCameraOpenedCallback: %s", java.lang.Boolean.valueOf(scanUIRectView.U));
                    if (scanUIRectView.U) {
                        return;
                    }
                    qt5.f fVar2 = fVar;
                    if (fVar2 != null) {
                        fVar2.a();
                    }
                    scanUIRectView.r();
                }

                @Override // qt5.g, qt5.p
                public void b(long j17) {
                    long j18 = j17 - this.f159456a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "onBeforeCameraTaskCall-open calledTimestamp: %s, threadScheduleCost: %s ms, updated: %s, opened: %s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Boolean.valueOf(com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.S.f245920d), java.lang.Boolean.valueOf(((qt5.c) com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e).f366657b));
                    e04.g1 g1Var = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.S;
                    if (g1Var.f245920d) {
                        return;
                    }
                    g1Var.f245920d = true;
                    g1Var.f245917a = java.lang.Boolean.TRUE;
                    g1Var.f245924h = false;
                    g1Var.f245921e = j18;
                    g1Var.f245922f = j17;
                }

                @Override // qt5.g, qt5.p
                public void c(qt5.d dVar) {
                    if (dVar == null || !dVar.f366680d) {
                        com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                        int i17 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.P1;
                        com.tencent.mars.xlog.Log.w("MicroMsg.ScanUIRectView", "onAfterCameraTaskCall-open not called and ignore, opened: %s", java.lang.Boolean.valueOf(((qt5.c) scanUIRectView.f215302e).f366657b));
                        if (((qt5.c) com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e).f366657b) {
                            return;
                        }
                        com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.S.a();
                        return;
                    }
                    boolean z17 = dVar.f366679c != null;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    long j17 = currentTimeMillis - this.f159456a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "onAfterCameraTaskCall-open taskExceptionOccurred: %s, current: %s, cost: %s ms, updated: %s, opened: %s", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.S.f245920d), java.lang.Boolean.valueOf(((qt5.c) com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e).f366657b));
                    com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView2 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                    scanUIRectView2.S.f245943i = ((qt5.c) scanUIRectView2.f215302e).f366657b;
                    e04.g1 g1Var = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.S;
                    g1Var.f245944j = dVar;
                    g1Var.f245923g = currentTimeMillis;
                    g1Var.f245924h = true;
                    if (z17) {
                        g1Var.f245919c = true;
                    } else {
                        g1Var.f245919c = false;
                        g1Var.f245918b = j17;
                    }
                }

                @Override // qt5.g, qt5.p
                public void e() {
                    com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                    e04.g1 g1Var = scanUIRectView.S;
                    if (g1Var.f245917a == null) {
                        g1Var.f245917a = java.lang.Boolean.FALSE;
                    }
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    this.f159456a = currentTimeMillis;
                    scanUIRectView.L1.f245979n = currentTimeMillis;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "onCameraTaskSubmit-open");
                }
            });
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ScanUIRectView", "openCamera not enable. no permission!");
        setCameraPermission(false);
        r();
        if (fVar != null) {
            fVar.a();
        }
    }

    public android.graphics.Rect getDecorRect() {
        return this.f159397p.getDecorRect();
    }

    public qt5.i0 getScanCamera() {
        return this.f215302e;
    }

    public e04.j1 getScanCameraReporter() {
        return this.L1;
    }

    public com.tencent.mm.plugin.scanner.view.BaseScanMaskView getScanMaskView() {
        return this.f159402s;
    }

    public d04.j getScanProductMaskDecorView() {
        return this.f159400q;
    }

    public com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView getSharedMaskView() {
        return this.f159401r;
    }

    public android.view.TextureView getTextrueView() {
        return this.f215301d;
    }

    public android.graphics.Point getVisibleResolution() {
        return this.P;
    }

    @Override // com.tencent.scanlib.ui.ScanView
    public void i(final qt5.l lVar) {
        super.i(new qt5.m() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.5

            /* renamed from: a, reason: collision with root package name */
            public long f159452a = 0;

            @Override // qt5.m, qt5.p
            public void b(long j17) {
                long j18 = j17 - this.f159452a;
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "onBeforeCameraTaskCall-preview calledTimestamp: %s, threadScheduleCost: %s ms, updated: %s, , previewed: %s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Boolean.valueOf(com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.T.f245920d), java.lang.Boolean.valueOf(((qt5.c) com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e).f366658c));
                e04.h1 h1Var = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.T;
                if (h1Var.f245920d) {
                    return;
                }
                h1Var.f245920d = true;
                h1Var.f245917a = java.lang.Boolean.TRUE;
                h1Var.f245924h = false;
                h1Var.f245921e = j18;
                h1Var.f245922f = j17;
            }

            @Override // qt5.m, qt5.p
            public void c(qt5.d dVar) {
                if (dVar == null || !dVar.f366680d) {
                    com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                    int i17 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.P1;
                    com.tencent.mars.xlog.Log.w("MicroMsg.ScanUIRectView", "onAfterCameraTaskCall-preview not called and ignore, previewed: %s", java.lang.Boolean.valueOf(((qt5.c) scanUIRectView.f215302e).f366658c));
                    if (((qt5.c) com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e).f366658c) {
                        return;
                    }
                    com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.T.a();
                    return;
                }
                boolean z17 = dVar.f366679c != null;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long j17 = currentTimeMillis - this.f159452a;
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "onAfterCameraTaskCall-preview taskExceptionOccurred: %s, current: %s, cost: %s ms, updated: %s, previewed: %s", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.T.f245920d), java.lang.Boolean.valueOf(((qt5.c) com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e).f366658c));
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView2 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                scanUIRectView2.T.f245949i = ((qt5.c) scanUIRectView2.f215302e).f366658c;
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView3 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                scanUIRectView3.T.f245950j = ((qt5.c) scanUIRectView3.f215302e).f366661f;
                e04.h1 h1Var = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.T;
                h1Var.f245923g = currentTimeMillis;
                h1Var.f245924h = true;
                if (z17) {
                    h1Var.f245919c = true;
                } else {
                    h1Var.f245919c = false;
                    h1Var.f245918b = j17;
                }
            }

            @Override // qt5.l
            public void d() {
                int i17;
                qt5.l lVar2 = lVar;
                if (lVar2 != null) {
                    lVar2.d();
                }
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                int i18 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.P1;
                qt5.i0 i0Var = scanUIRectView.f215302e;
                if (i0Var == null || !((qt5.c) i0Var).f366658c) {
                    return;
                }
                qt5.i0 i0Var2 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e;
                android.graphics.Point point = ((qt5.c) i0Var2).f366662g;
                vz3.t tVar = vz3.t.f441710a;
                int i19 = point.x;
                int i27 = point.y;
                try {
                    i17 = ((xy3.a) i0Var2).f366656a.getParameters().getPreviewFormat();
                } catch (java.lang.Throwable unused) {
                    i17 = 17;
                }
                tVar.d(i19, i27, i17, ((qt5.c) com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e).f366667l);
            }

            @Override // qt5.m, qt5.p
            public void e() {
                e04.h1 h1Var = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.T;
                if (h1Var.f245917a == null) {
                    h1Var.f245917a = java.lang.Boolean.FALSE;
                }
                this.f159452a = java.lang.System.currentTimeMillis();
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "onCameraTaskSubmit-preview");
            }
        });
    }

    @Override // com.tencent.scanlib.ui.ScanView
    public void j() {
        super.j();
        this.f159409x1 = true;
        this.f159412y1 = false;
    }

    @Override // com.tencent.scanlib.ui.ScanView
    public void k(long j17) {
        this.f159398p0 = true;
        if (this.I1) {
            e04.l2 l2Var = this.B1;
            if (l2Var != null) {
                int i17 = this.C1;
                if ((i17 == 1 ? l2Var.f246015i : false) && i17 == 1) {
                    super.k(j17);
                    this.D1 = java.lang.System.currentTimeMillis();
                    return;
                }
                return;
            }
            return;
        }
        super.k(j17);
        this.D1 = java.lang.System.currentTimeMillis();
        if (!this.f215307m && ((qt5.c) this.f215302e).f366658c && !this.H1 && this.G1 && q()) {
            removeCallbacks(this.K1);
            postDelayed(this.K1, this.E1);
            this.J1 = false;
        }
    }

    @Override // com.tencent.scanlib.ui.ScanView, android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z17, android.hardware.Camera camera) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "onAutoFocus %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            this.G1 = false;
            k(0L);
        }
        c(1000);
    }

    @Override // com.tencent.scanlib.ui.ScanView, android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        int i17;
        this.f215305h = 0L;
        this.H1 = true;
        e04.j1 j1Var = this.L1;
        boolean z17 = bArr != null;
        if (!j1Var.f245977l || j1Var.f245978m != z17) {
            j1Var.f245977l = true;
            j1Var.f245978m = z17;
            if (z17) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long j17 = j1Var.f245966a;
                if (j17 != 0) {
                    j1Var.f245980o = currentTimeMillis - j17;
                }
                long j18 = j1Var.f245979n;
                if (j18 != 0) {
                    j1Var.f245981p = currentTimeMillis - j18;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanCameraReporter", "setCameraFrameCalled: true, dataValid: " + z17 + ", firstDataFrameCost: " + j1Var.f245980o + ", firstCameraFrameCost: " + j1Var.f245981p);
        }
        C();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - this.D1;
        e04.j1 j1Var2 = this.L1;
        if (!j1Var2.f245983r) {
            j1Var2.f245983r = true;
            j1Var2.f245982q = currentTimeMillis2;
        }
        e04.l2 l2Var = this.B1;
        if (l2Var != null) {
            long currentTimeMillis3 = java.lang.System.currentTimeMillis() - this.D1;
            if (!l2Var.f246012f) {
                l2Var.f246012f = true;
                l2Var.f246008b = java.lang.Math.max(l2Var.f246010d, java.lang.Math.min(l2Var.f246009c, ((float) currentTimeMillis3) * l2Var.f246011e));
            }
            this.B1.f246018l = true;
        }
        if (this.f159409x1 && this.f159412y1) {
            this.f159409x1 = false;
            this.f159412y1 = false;
            y(false);
            k(100L);
            return;
        }
        if (this.A1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScanUIRectView", "onPreviewFrame ignorePreviewFrame");
            return;
        }
        if (bArr == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScanUIRectView", "onPreviewFrame data is null");
            k(0L);
            com.tencent.mm.plugin.scanner.model.h2 h2Var = com.tencent.mm.plugin.scanner.model.h2.f158920a;
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanReporter", "reportOnPreviewFrameDataNull");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, 1);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "onPreviewFrame");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "processFrame");
        if (((qt5.c) this.f215302e).f366658c && ((xy3.a) this.f215302e).s()) {
            com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector scanCameraLightDetector = com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector.f159829l;
            android.graphics.Point point = ((xy3.a) this.f215302e).f366662g;
            scanCameraLightDetector.b(bArr, point.x, point.y);
        }
        int i18 = this.f159404u;
        if (i18 != 1 && i18 != 4 && i18 != 8) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "unknown scan mode %d", java.lang.Integer.valueOf(i18));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "handleCodeData");
        android.graphics.Point resolution = ((qt5.c) this.f215302e).f366662g;
        boolean z18 = com.tencent.mm.plugin.scanner.model.s1.f159020a;
        kotlin.jvm.internal.o.g(resolution, "resolution");
        com.tencent.mm.plugin.scanner.model.s1.f159028i = 1;
        com.tencent.mm.plugin.scanner.model.s1.f159031l++;
        if (com.tencent.mm.plugin.scanner.model.s1.f159030k.length() == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(resolution.x);
            sb6.append('_');
            sb6.append(resolution.y);
            com.tencent.mm.plugin.scanner.model.s1.f159030k = sb6.toString();
        }
        if (this.f159407x == 0 || !((qt5.c) this.f215302e).f366658c) {
            return;
        }
        android.graphics.Point point2 = ((qt5.c) this.f215302e).f366662g;
        if (point2 != null) {
            android.graphics.Rect scanCodeRect = getScanCodeRect();
            if (!this.I1 || this.C1 == 1) {
                android.graphics.Rect g17 = ((xy3.a) this.f215302e).g(scanCodeRect);
                com.tencent.mm.plugin.scanner.view.BaseScanMaskView baseScanMaskView = this.f159402s;
                if (baseScanMaskView != null) {
                    baseScanMaskView.setPreviewRect(g17);
                    this.f159402s.setScanRect(scanCodeRect);
                    this.f159402s.setVisibleResolution(this.P);
                    com.tencent.mm.plugin.scanner.view.BaseScanMaskView baseScanMaskView2 = this.f159402s;
                    if (baseScanMaskView2 instanceof com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView) {
                        ((com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView) baseScanMaskView2).setNeedRotate(true);
                    }
                }
                zs5.n0 n0Var = zs5.n0.f475450a;
                qt5.i0 i0Var = this.f215302e;
                int i19 = ((qt5.c) i0Var).f366667l;
                try {
                    i17 = ((xy3.a) i0Var).f366656a.getParameters().getPreviewFormat();
                } catch (java.lang.Throwable unused) {
                    i17 = 17;
                }
                int i27 = i17;
                int i28 = ((qt5.c) this.f215302e).f366667l;
                int i29 = point2.x;
                int i37 = point2.y;
                if (i28 % 180 == 0) {
                    i37 = i29;
                    i29 = i37;
                }
                float f17 = i29;
                n0Var.h(bArr, point2, i19, i27, g17, new android.graphics.Rect(0, (int) ((1.0f * f17) / 19.0f), i37, (int) ((f17 * 17.0f) / 19.0f)));
            }
        }
        if ("auto".equals(((qt5.c) this.f215302e).d(true)) || zs5.n0.f475450a.f() <= P1) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "change to FOCUS_MODE_AUTO");
        ((qt5.c) this.f215302e).j("auto");
        c(100L);
    }

    @Override // com.tencent.scanlib.ui.ScanView, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        super.onSurfaceTextureAvailable(surfaceTexture, i17, i18);
        android.graphics.Point point = this.P;
        if (point != null && i17 == point.x && i18 == point.y) {
            return;
        }
        if (point == null) {
            this.P = new android.graphics.Point(i17, i18);
        }
        if (q()) {
            H();
        }
    }

    public final void p() {
        e04.j1 j1Var = this.L1;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "checkAndReopenCamera");
            j1Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanCameraReporter", "setOverTimeNotFrameCallback: true");
            j1Var.f245976k = true;
            D(java.lang.System.currentTimeMillis(), false);
            j1Var.b();
            j1Var.d(true, this.B1.f246014h);
            this.S.a();
            this.T.a();
            h(new qt5.j() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.8

                /* renamed from: a, reason: collision with root package name */
                public long f159459a = 0;

                @Override // qt5.i
                public void a() {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "cameraOpened, ignoreCameraOpenedCallback: %s", java.lang.Boolean.valueOf(com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.U));
                    com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                    if (scanUIRectView.U) {
                        return;
                    }
                    scanUIRectView.C1 = 1;
                    scanUIRectView.I1 = true;
                    qt5.i0 i0Var = scanUIRectView.f215302e;
                    if (i0Var != null) {
                        scanUIRectView.L1.c(((qt5.c) i0Var).f366673r, ((qt5.c) i0Var).f366674s);
                        if (((qt5.c) com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e).f366657b) {
                            com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.r();
                        }
                    }
                }

                @Override // qt5.j, qt5.p
                public void b(long j17) {
                    long j18 = j17 - this.f159459a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "onBeforeCameraTaskCall-reopen calledTimestamp: %s, threadScheduleCost: %s ms, updated: %s, opened: %s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Boolean.valueOf(com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.S.f245920d), java.lang.Boolean.valueOf(((qt5.c) com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e).f366657b));
                    e04.g1 g1Var = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.S;
                    if (g1Var.f245920d) {
                        return;
                    }
                    g1Var.f245920d = true;
                    g1Var.f245917a = java.lang.Boolean.TRUE;
                    g1Var.f245924h = false;
                    g1Var.f245921e = j18;
                    g1Var.f245922f = j17;
                }

                @Override // qt5.j, qt5.p
                public void c(qt5.d dVar) {
                    if (dVar == null || !dVar.f366680d) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.ScanUIRectView", "onAfterCameraTaskCall-reopen not called and ignore");
                        com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.S.a();
                        return;
                    }
                    boolean z17 = dVar.f366679c != null;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    long j17 = currentTimeMillis - this.f159459a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "onAfterCameraTaskCall-reopen taskExceptionOccurred: %s, current: %s, cost: %s ms, updated: %s, opened: %s", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.S.f245920d), java.lang.Boolean.valueOf(((qt5.c) com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e).f366657b));
                    com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                    scanUIRectView.S.f245943i = ((qt5.c) scanUIRectView.f215302e).f366657b;
                    e04.g1 g1Var = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.S;
                    g1Var.f245944j = dVar;
                    g1Var.f245923g = currentTimeMillis;
                    g1Var.f245924h = true;
                    if (z17) {
                        g1Var.f245919c = true;
                    } else {
                        g1Var.f245919c = false;
                        g1Var.f245918b = j17;
                    }
                }

                @Override // qt5.j, qt5.p
                public void e() {
                    com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                    e04.g1 g1Var = scanUIRectView.S;
                    if (g1Var.f245917a == null) {
                        g1Var.f245917a = java.lang.Boolean.FALSE;
                    }
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    this.f159459a = currentTimeMillis;
                    scanUIRectView.L1.f245979n = currentTimeMillis;
                }
            });
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanUIRectView", e17, "checkAnReopenCamera exception", new java.lang.Object[0]);
        }
    }

    public final boolean q() {
        return e04.v3.b(this.f159404u);
    }

    public final void r() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "onCameraOpened isUIPaused: %s", java.lang.Boolean.valueOf(this.f215307m));
        if (this.f215307m) {
            return;
        }
        ((xy3.a) this.f215302e).r(false);
        i(new qt5.m() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.4
            @Override // qt5.l
            public void d() {
                int i17 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.P1;
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "cameraStartPreviewed onCameraOpened isUIPaused: %s", java.lang.Boolean.valueOf(scanUIRectView.f215307m));
                if (scanUIRectView.f215307m) {
                    return;
                }
                scanUIRectView.k(0L);
            }
        });
    }

    public void s() {
        com.tencent.stubs.logger.Log.i("ScanView", "onCreate");
        d();
        this.M = (int) (i65.a.B(getContext()) / 4.5f);
        zs5.n0.f475450a.b(new com.tencent.mm.plugin.scanner.model.v2());
        setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.18

            /* renamed from: d, reason: collision with root package name */
            public float f159445d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f159446e = false;

            /* renamed from: f, reason: collision with root package name */
            public boolean f159447f = false;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                int i17;
                int i18;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$18", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                if (actionMasked == 0) {
                    motionEvent.getX();
                    motionEvent.getY();
                    scanUIRectView.L = motionEvent.getRawX();
                    scanUIRectView.f159395J = true;
                    this.f159446e = false;
                    this.f159447f = false;
                } else if (actionMasked == 1) {
                    motionEvent.getX();
                    motionEvent.getY();
                    if (motionEvent.getPointerCount() == 2) {
                        this.f159445d = (float) (java.lang.Math.pow(motionEvent.getX(0) - motionEvent.getX(1), 2.0d) + java.lang.Math.pow(motionEvent.getY(0) - motionEvent.getY(1), 2.0d));
                    }
                } else if (actionMasked != 2) {
                    if (actionMasked == 5) {
                        motionEvent.getX(actionIndex);
                        motionEvent.getY(actionIndex);
                        if (motionEvent.getPointerCount() == 2) {
                            this.f159445d = (float) (java.lang.Math.pow(motionEvent.getX(0) - motionEvent.getX(1), 2.0d) + java.lang.Math.pow(motionEvent.getY(0) - motionEvent.getY(1), 2.0d));
                            scanUIRectView.N = true;
                        }
                        this.f159446e = false;
                        this.f159447f = false;
                    } else if (actionMasked == 6) {
                        motionEvent.getX(actionIndex);
                        motionEvent.getY(actionIndex);
                        if (motionEvent.getPointerCount() == 2) {
                            this.f159445d = (float) (java.lang.Math.pow(motionEvent.getX(0) - motionEvent.getX(1), 2.0d) + java.lang.Math.pow(motionEvent.getY(0) - motionEvent.getY(1), 2.0d));
                            if (this.f159446e) {
                                com.tencent.mm.plugin.scanner.model.h2.z(scanUIRectView.f159404u, 7, scanUIRectView.f159396l1);
                            } else if (this.f159447f) {
                                com.tencent.mm.plugin.scanner.model.h2.z(scanUIRectView.f159404u, 8, scanUIRectView.f159396l1);
                            }
                            this.f159446e = false;
                            this.f159447f = false;
                        }
                    }
                } else if (motionEvent.getPointerCount() == 2) {
                    motionEvent.getX(0);
                    motionEvent.getY(0);
                    motionEvent.getX(1);
                    motionEvent.getY(1);
                    float pow = (float) (java.lang.Math.pow(motionEvent.getX(0) - motionEvent.getX(1), 2.0d) + java.lang.Math.pow(motionEvent.getY(0) - motionEvent.getY(1), 2.0d));
                    if (java.lang.Math.abs(pow - this.f159445d) > 400.0f) {
                        if (scanUIRectView.W) {
                            scanUIRectView.W = false;
                        }
                        if (pow - this.f159445d > 0.0f) {
                            ((qt5.c) scanUIRectView.f215302e).o(2);
                            this.f159446e = true;
                        } else {
                            ((qt5.c) scanUIRectView.f215302e).o(3);
                            this.f159447f = true;
                        }
                        this.f159445d = pow;
                    }
                } else if (motionEvent.getPointerCount() == 1 && scanUIRectView.I && !scanUIRectView.N) {
                    float rawX = motionEvent.getRawX() - scanUIRectView.L;
                    boolean z17 = scanUIRectView.f159395J;
                    if (rawX >= scanUIRectView.M && z17) {
                        d04.y2 y2Var = scanUIRectView.H;
                        if (y2Var != null && y2Var.f225565d - 1 >= 0 && i18 < y2Var.f225564c.size()) {
                            y2Var.f225565d = i18;
                            com.tencent.mm.plugin.scanner.ui.widget.ScanScrollTabView scanScrollTabView = y2Var.f225563b;
                            if (scanScrollTabView != null) {
                                scanScrollTabView.h(i18, 3);
                            }
                        }
                        scanUIRectView.f159395J = false;
                    } else if (rawX <= (-r5) && z17) {
                        d04.y2 y2Var2 = scanUIRectView.H;
                        if (y2Var2 != null && (i17 = y2Var2.f225565d + 1) >= 0 && i17 < y2Var2.f225564c.size()) {
                            y2Var2.f225565d = i17;
                            com.tencent.mm.plugin.scanner.ui.widget.ScanScrollTabView scanScrollTabView2 = y2Var2.f225563b;
                            if (scanScrollTabView2 != null) {
                                scanScrollTabView2.h(i17, 3);
                            }
                        }
                        scanUIRectView.f159395J = false;
                    }
                }
                android.view.GestureDetector gestureDetector = scanUIRectView.O1;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(motionEvent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(gestureDetector, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$18", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList2.get(0)), "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$18", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                if (motionEvent.getAction() == 1) {
                    scanUIRectView.N = false;
                }
                yj0.a.i(true, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$18", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            }
        });
        this.N1.alive();
        e04.l2 l2Var = this.B1;
        if (l2Var != null) {
            l2Var.f246016j = java.lang.System.currentTimeMillis();
        }
        long j17 = ((com.tencent.mm.plugin.scanner.ui.BaseScanUI) this.G).B;
        e04.j1 j1Var = this.L1;
        j1Var.f245966a = j17;
        j1Var.f245967b = java.lang.System.currentTimeMillis();
    }

    public void setActivity(android.app.Activity activity) {
    }

    public void setBottomExtraHeight(int i17) {
        this.K = i17;
    }

    public void setCameraPermission(boolean z17) {
        this.R = z17;
        e04.j1 j1Var = this.L1;
        j1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCameraReporter", "setCameraPermission: " + z17);
        j1Var.f245970e = z17;
    }

    public void setDecodeSuccessFrameData(com.tencent.qbar.ScanDecodeFrameData scanDecodeFrameData) {
        com.tencent.mm.plugin.scanner.view.BaseScanMaskView baseScanMaskView = this.f159402s;
        if (baseScanMaskView != null) {
            baseScanMaskView.setDecodeSuccessFrameData(scanDecodeFrameData);
        }
    }

    public void setDecorRect(android.graphics.Rect rect) {
        this.f159397p.setDecorRect(rect);
    }

    public void setDisableScanProductInMergeMode(boolean z17) {
        this.f159399p1 = z17;
    }

    public void setEnableOpenCamera(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "setEnableOpenCamera: %b", java.lang.Boolean.valueOf(z17));
        this.Q = z17;
    }

    public void setEnableScanCodeProductMerge(boolean z17) {
        this.f159396l1 = z17;
    }

    public void setEnableScanGoodsDynamicWording(boolean z17) {
        this.f159411y0 = z17;
    }

    public void setEnableScrollSwitchTab(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "setEnableScrollSwitchTab: %b", java.lang.Boolean.valueOf(z17));
        this.I = z17;
    }

    public void setFlashStatus(boolean z17) {
        com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView scanSharedMaskView = this.f159401r;
        if (scanSharedMaskView != null) {
            scanSharedMaskView.setFlashStatus(z17);
        }
    }

    public void setIgnorePreviewFrame(boolean z17) {
        this.A1 = z17;
    }

    public void setMyQrCodeVisible(boolean z17) {
        com.tencent.mm.plugin.scanner.view.BaseScanMaskView baseScanMaskView = this.f159402s;
        if (baseScanMaskView instanceof com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView) {
            ((com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView) baseScanMaskView).setMyQrCodeButtonVisible(z17);
        }
    }

    public void setNetworkAvailable(boolean z17) {
    }

    public void setOnSingleTapListener(com.tencent.mm.plugin.scanner.ui.ScanUIRectView.OnSingleTapListener onSingleTapListener) {
    }

    public void setRequestCameraPermission(boolean z17) {
        e04.j1 j1Var = this.L1;
        j1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCameraReporter", "setHasRequestCameraPermission: " + z17);
        j1Var.f245971f = z17;
    }

    public void setScanCallback(com.tencent.mm.plugin.scanner.ui.ScanUIRectView.ScanCallBack scanCallBack) {
        this.f159413z = scanCallBack;
    }

    public void setScanMode(int i17) {
        this.f159404u = i17;
    }

    public void setScanProductCallback(d04.h hVar) {
        this.E = hVar;
    }

    public void setScanProductOnItemClickListener(d04.i iVar) {
        this.F = iVar;
    }

    public void setScanRequest(com.tencent.mm.plugin.scanner.api.BaseScanRequest baseScanRequest) {
        this.f159408x0 = baseScanRequest;
    }

    public void setScanSource(int i17) {
        com.tencent.mm.plugin.scanner.view.BaseScanMaskView baseScanMaskView = this.f159402s;
        if (baseScanMaskView != null) {
            baseScanMaskView.setScanSource(i17);
        }
    }

    public void setScrollTabController(d04.y2 y2Var) {
        this.H = y2Var;
    }

    public void setShowScanTips(boolean z17) {
        this.f159405v = z17;
    }

    public void setSuccessMarkClickListener(com.tencent.mm.plugin.scanner.model.i2 i2Var) {
        com.tencent.mm.plugin.scanner.view.BaseScanMaskView baseScanMaskView = this.f159402s;
        if (baseScanMaskView instanceof com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView) {
            ((com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView) baseScanMaskView).setSuccessMarkClickListener(i2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0201, code lost:
    
        if (r2 >= 3000) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0203, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0210, code lost:
    
        if ((r6 - r10) >= 3000) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0239 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t() {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.t():void");
    }

    public final void u(boolean z17) {
        com.tencent.mm.plugin.scanner.model.r1 r1Var;
        com.tencent.mm.plugin.scanner.view.BaseScanMaskView baseScanMaskView = this.f159402s;
        if (baseScanMaskView != null) {
            baseScanMaskView.m(z17);
        }
        com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView scanSharedMaskView = this.f159401r;
        if (scanSharedMaskView != null) {
            android.view.View view = scanSharedMaskView.f159792i;
            if (view == null) {
                kotlin.jvm.internal.o.o("galleryButton");
                throw null;
            }
            view.getAlpha();
            if (!z17) {
                android.view.View view2 = scanSharedMaskView.f159792i;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("galleryButton");
                    throw null;
                }
                if (view2.getVisibility() == 0) {
                    android.view.View view3 = scanSharedMaskView.f159792i;
                    if (view3 == null) {
                        kotlin.jvm.internal.o.o("galleryButton");
                        throw null;
                    }
                    if (view3.getAlpha() < 1.0f) {
                        android.view.View view4 = scanSharedMaskView.f159792i;
                        if (view4 == null) {
                            kotlin.jvm.internal.o.o("galleryButton");
                            throw null;
                        }
                        e04.i3.a(view4, 0.0f, 1.0f, 200L, null);
                    }
                }
            }
            android.view.View view5 = scanSharedMaskView.f159792i;
            if (view5 == null) {
                kotlin.jvm.internal.o.o("galleryButton");
                throw null;
            }
            view5.setEnabled(true);
        }
        com.tencent.mm.plugin.scanner.model.u uVar = this.G;
        if (uVar != null && (r1Var = ((com.tencent.mm.plugin.scanner.ui.BaseScanUI) uVar).X) != null) {
            com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView scanInfoMaskView = r1Var.f159003d;
            if (scanInfoMaskView != null) {
                scanInfoMaskView.getVisibility();
                scanInfoMaskView.setVisibility(8);
                scanInfoMaskView.f159718y = true;
            }
            if (r1Var.f159006g == 4) {
                java.lang.String str = r1Var.f159007h;
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = zs5.h0.f475402a;
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeNotRecognizeHelper", "[scanDecode] markCodeNotRecognizeTemp:" + str);
                if (!(str == null || str.length() == 0)) {
                    com.tencent.wechat.aff.iam_scan.h0 h0Var = com.tencent.wechat.aff.iam_scan.h0.f217048b;
                    e04.f2 f2Var = e04.f2.f245925a;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getNoRecognizeDuration:");
                    e04.f2 f2Var2 = e04.f2.f245925a;
                    jz5.g gVar = e04.f2.f245935k;
                    sb6.append(((java.lang.Number) ((jz5.n) gVar).getValue()).intValue());
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanDebugUtil", sb6.toString());
                    h0Var.d(str, ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue());
                }
            }
            r1Var.f159006g = 0;
            r1Var.f159007h = "";
        }
        d04.y2 y2Var = this.H;
        if (y2Var != null) {
            y2Var.a(true);
        }
    }

    public void v(final java.lang.Object obj, final com.tencent.mm.plugin.scanner.view.w0 w0Var, boolean z17, final boolean z18) {
        if (!z17) {
            w(obj, w0Var, z18);
            return;
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.13
            @Override // java.lang.Runnable
            public void run() {
                int i17 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.P1;
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.w(obj, w0Var, z18);
            }
        };
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(runnable, 200L, false);
    }

    public final void w(java.lang.Object obj, com.tencent.mm.plugin.scanner.view.w0 w0Var, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "onScanSuccess");
        C();
        G(com.tencent.wechat.aff.iam_scan.f1.DEFAULT);
        e();
        j();
        com.tencent.mm.plugin.scanner.view.BaseScanMaskView baseScanMaskView = this.f159402s;
        if (baseScanMaskView != null) {
            baseScanMaskView.o(obj, w0Var);
            this.f159402s.i(this.f215301d);
        }
        com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView scanSharedMaskView = this.f159401r;
        if (scanSharedMaskView != null) {
            if (z17) {
                android.view.View view = scanSharedMaskView.f159792i;
                if (view == null) {
                    kotlin.jvm.internal.o.o("galleryButton");
                    throw null;
                }
                view.setEnabled(false);
                android.view.View view2 = scanSharedMaskView.f159792i;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("galleryButton");
                    throw null;
                }
                e04.i3.a(view2, 1.0f, 0.0f, 200L, null);
            }
            e04.c3 c3Var = scanSharedMaskView.f159802v;
            if (c3Var != null) {
                c3Var.a();
            }
            e04.c3 c3Var2 = scanSharedMaskView.f159801u;
            if (c3Var2 != null) {
                c3Var2.a();
            }
            android.widget.TextView textView = scanSharedMaskView.f159788e;
            if (textView == null) {
                kotlin.jvm.internal.o.o("scanTitle");
                throw null;
            }
            textView.setVisibility(8);
            android.widget.TextView textView2 = scanSharedMaskView.f159790g;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("scanToast");
                throw null;
            }
            textView2.setVisibility(8);
            scanSharedMaskView.f159803w = false;
            scanSharedMaskView.f159804x = false;
            com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher scannerFlashSwitcher = scanSharedMaskView.f159791h;
            if (scannerFlashSwitcher != null) {
                scannerFlashSwitcher.setVisibility(8);
            } else {
                kotlin.jvm.internal.o.o("flashSwitcher");
                throw null;
            }
        }
    }

    public void x() {
        com.tencent.stubs.logger.Log.i("ScanView", "onStop");
        a();
        com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector.f159829l.d();
        uo.n.f429522a.b();
        D(java.lang.System.currentTimeMillis(), true);
    }

    public void y(final boolean z17) {
        com.tencent.mm.plugin.scanner.model.h2.a(this.f159404u);
        if (this.f159404u == 12) {
            java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.scanner.model.h2.f158920a.e(12);
        }
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            u(z17);
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.14
                @Override // java.lang.Runnable
                public void run() {
                    int i17 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.P1;
                    com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.u(z17);
                }
            });
        }
    }

    public void z(boolean z17) {
        int i17;
        java.lang.String str = "";
        if (this.f159405v) {
            if (this.f159396l1 && ((i17 = this.f159404u) == 1 || i17 == 4 || i17 == 8)) {
                str = (!z17 || com.tencent.mm.sdk.platformtools.t8.K0(this.C)) ? !com.tencent.mm.sdk.platformtools.t8.K0(this.B) ? this.B : getResources().getString(com.tencent.mm.R.string.i97) : this.C;
            } else {
                int i18 = this.f159404u;
                if (i18 == 1) {
                    str = getResources().getString(com.tencent.mm.R.string.ian);
                } else if (i18 == 8) {
                    str = getResources().getString(com.tencent.mm.R.string.ho8);
                } else if (i18 == 12) {
                    str = !com.tencent.mm.sdk.platformtools.t8.K0(this.A) ? this.A : getResources().getString(com.tencent.mm.R.string.i9t);
                } else if (i18 == 3) {
                    str = getResources().getString(com.tencent.mm.R.string.iay);
                } else if (i18 == 4) {
                    str = getResources().getString(com.tencent.mm.R.string.ho9);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "refreshScanTips:" + str);
        this.f159401r.setScanTips(str);
    }

    public ScanUIRectView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f159404u = 1;
        this.f159405v = true;
        this.f159406w = true;
        this.f159410y = null;
        this.I = true;
        this.f159395J = false;
        this.K = 0;
        this.M = 120;
        this.N = false;
        this.P = null;
        this.Q = true;
        this.R = true;
        this.S = new e04.g1();
        this.T = new e04.h1();
        this.U = false;
        this.V = 0;
        this.W = true;
        this.f159398p0 = false;
        this.f159411y0 = false;
        this.f159396l1 = false;
        this.f159399p1 = false;
        this.f159409x1 = false;
        this.f159412y1 = false;
        this.f159414z1 = true;
        this.A1 = false;
        e04.l2 l2Var = new e04.l2();
        this.B1 = l2Var;
        this.C1 = 0;
        this.D1 = 0L;
        this.E1 = l2Var.f246008b;
        this.F1 = false;
        this.G1 = true;
        this.H1 = false;
        this.I1 = false;
        this.J1 = false;
        this.K1 = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView.l(com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this);
            }
        };
        this.L1 = new e04.j1();
        this.M1 = new at5.b() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.15
            @Override // at5.b
            public void a(final long j17, final android.os.Bundle bundle) {
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.15.3
                    @Override // java.lang.Runnable
                    public void run() {
                        android.os.Bundle bundle2;
                        try {
                            long j18 = j17;
                            if (j18 != com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f159407x || j18 == 0 || (bundle2 = bundle) == null || !bundle2.containsKey("param_zoom_ratio")) {
                                return;
                            }
                            float f17 = bundle.getFloat("param_zoom_ratio", 0.0f);
                            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "zoom to scale %f", java.lang.Float.valueOf(f17));
                            if (f17 > 0.0f) {
                                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                                if (scanUIRectView.W && ((qt5.c) scanUIRectView.f215302e).f366658c) {
                                    ((qt5.c) com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e).p((int) (((qt5.c) com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e).c() * f17));
                                    zs5.g0 g0Var = zs5.g0.F;
                                    g0Var.f475384q++;
                                    g0Var.f475385r = f17 * g0Var.f475385r;
                                    g0Var.f475386s = java.lang.System.currentTimeMillis() - 0;
                                }
                            }
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanUIRectView", e17, "zoomToScale exception", new java.lang.Object[0]);
                        }
                    }
                });
            }

            @Override // at5.b
            public void b(final long j17, final java.util.List list, final java.util.List list2, java.util.List list3, final android.os.Bundle bundle) {
                java.lang.String.format("scan code after decode %d", java.lang.Long.valueOf(j17));
                final long currentTimeMillis = java.lang.System.currentTimeMillis();
                zs5.n0 n0Var = zs5.n0.f475450a;
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                n0Var.d(scanUIRectView.f159407x, scanUIRectView.f159410y);
                if (list == null || list.isEmpty()) {
                    return;
                }
                scanUIRectView.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.15.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.mm.plugin.scanner.ui.ScanUIRectView.AnonymousClass15 anonymousClass15 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.AnonymousClass15.this;
                        com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView2 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                        long j18 = scanUIRectView2.f159407x;
                        long j19 = j17;
                        if (j18 != j19 || j19 == 0) {
                            return;
                        }
                        e04.j1 j1Var = scanUIRectView2.L1;
                        j1Var.f245984s = true;
                        j1Var.f245985t = currentTimeMillis - j1Var.f245966a;
                        e04.i1 i1Var = e04.i1.f245958f;
                        i1Var.toString();
                        j1Var.f245986u = i1Var;
                        com.tencent.wechat.aff.iam_scan.f1 f1Var = com.tencent.wechat.aff.iam_scan.f1.DECODE_SUCCESS;
                        com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView3 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                        scanUIRectView3.G(f1Var);
                        java.util.List list4 = list;
                        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(list4);
                        java.util.Iterator it = list2.iterator();
                        int i17 = 0;
                        while (it.hasNext()) {
                            if (((com.tencent.qbar.QbarNative$QBarPoint) it.next()) != null) {
                                i17++;
                            }
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "onDecodeSuccess result size: %d, codePointCount: %d", java.lang.Integer.valueOf(list4.size()), java.lang.Integer.valueOf(i17));
                        final android.os.Bundle bundle22 = new android.os.Bundle();
                        bundle22.putParcelableArrayList("result_qbar_result_list", arrayList);
                        bundle22.putInt("result_code_point_count", i17);
                        if (scanUIRectView3.getScanCodeRect() != null) {
                            bundle22.putFloatArray("result_code_image_rect", new float[]{r9.left, r9.top, r9.right, r9.bottom});
                        }
                        android.os.Bundle bundle3 = bundle;
                        if (bundle3 != null) {
                            bundle22.putAll(bundle3);
                        }
                        com.tencent.mm.plugin.scanner.view.BaseScanMaskView baseScanMaskView = scanUIRectView3.f159402s;
                        if (baseScanMaskView != null && (baseScanMaskView instanceof com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView)) {
                            ((com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView) baseScanMaskView).Q.cancel();
                        }
                        com.tencent.mm.plugin.scanner.ui.ScanUIRectView.ScanCallBack scanCallBack = scanUIRectView3.f159413z;
                        if (scanCallBack != null) {
                            final long j272 = scanUIRectView3.f159407x;
                            final com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass9 anonymousClass9 = (com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass9) scanCallBack;
                            com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                            if (!baseScanUI.U) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.ScanUI", "onScanSuccess can not process code result currentMode: %d", java.lang.Integer.valueOf(baseScanUI.C));
                                return;
                            }
                            if (baseScanUI.f159159t != null) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "scan code cost time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - baseScanUI.A));
                                final java.util.ArrayList parcelableArrayList2 = bundle22.getParcelableArrayList("result_qbar_result_list");
                                if (parcelableArrayList2 == null || parcelableArrayList2.size() <= 0) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.ScanUI", "onScanSuccess qbarResult invalid");
                                    return;
                                }
                                final int i182 = bundle22.getInt("result_code_point_count", 0);
                                long j28 = bundle22.getLong("decode_success_cost_time", 0L);
                                com.tencent.mm.plugin.scanner.model.h2.r(baseScanUI.C, true, baseScanUI.f159167y0 ? 3 : 1, i182);
                                com.tencent.mm.plugin.scanner.model.d.a(1, null);
                                com.tencent.mm.plugin.scanner.model.h2.D(baseScanUI.C);
                                baseScanUI.k7(true, i182 > 1);
                                baseScanUI.p7(false);
                                int i19 = baseScanUI.C;
                                com.tencent.mm.plugin.scanner.model.d2 d2Var = new com.tencent.mm.plugin.scanner.model.d2(parcelableArrayList2, j28);
                                com.tencent.mm.plugin.scanner.model.h2.f158930k = d2Var;
                                try {
                                    java.lang.String d17 = com.tencent.mm.plugin.scanner.model.h2.d(i19);
                                    d2Var.f158868c = d17 != null ? java.lang.Long.parseLong(d17) : java.lang.System.currentTimeMillis();
                                    com.tencent.mm.plugin.scanner.model.d2 d2Var2 = com.tencent.mm.plugin.scanner.model.h2.f158930k;
                                    if (d2Var2 != null) {
                                        java.lang.String c17 = com.tencent.mm.plugin.scanner.model.h2.c(i19);
                                        d2Var2.f158869d = c17 != null ? java.lang.Long.parseLong(c17) : java.lang.System.currentTimeMillis();
                                    }
                                    com.tencent.mm.plugin.scanner.model.d2 d2Var3 = com.tencent.mm.plugin.scanner.model.h2.f158930k;
                                    if (d2Var3 != null) {
                                        d2Var3.f158870e = java.lang.Long.parseLong(com.tencent.mm.plugin.scanner.model.h2.f158921b);
                                    }
                                    com.tencent.mm.plugin.scanner.model.d2 d2Var4 = com.tencent.mm.plugin.scanner.model.h2.f158930k;
                                    if (d2Var4 != null) {
                                        d2Var4.f158871f = java.lang.System.currentTimeMillis();
                                    }
                                } catch (java.lang.Exception unused) {
                                }
                                boolean z17 = baseScanUI.f159145f.f159465g;
                                final com.tencent.qbar.WxQBarResult wxQBarResult2 = (com.tencent.qbar.WxQBarResult) parcelableArrayList2.get(0);
                                if (wxQBarResult2 == null) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "firstQBarResult is null");
                                    return;
                                }
                                final com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo2 = (com.tencent.qbar.ScanIdentifyReportInfo) bundle22.getParcelable("ScanIdentifyReportInfo.DecodeKey");
                                if (com.tencent.mm.plugin.scanner.ui.BaseScanUI.V6(baseScanUI, wxQBarResult2, parcelableArrayList2.size() <= 1, scanIdentifyReportInfo2)) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.ScanUI", "scan code has deal with");
                                    return;
                                }
                                com.tencent.mm.plugin.scanner.model.h2.q(com.tencent.mm.plugin.scanner.j1.b(com.tencent.mm.plugin.scanner.j1.a(wxQBarResult2.f475331e)) ? 1 : 2, 1, baseScanUI.D1, baseScanUI.S);
                                bundle22.putInt("qbar_string_scan_source", 0);
                                if (i182 <= 0 || baseScanUI.f159144e == null) {
                                    baseScanUI.p7(true);
                                    if (com.tencent.mm.plugin.scanner.ui.BaseScanUI.V6(baseScanUI, wxQBarResult2, true, scanIdentifyReportInfo2)) {
                                        return;
                                    }
                                    com.tencent.mm.plugin.scanner.ui.BaseScanUI.W6(baseScanUI, j272, bundle22, wxQBarResult2);
                                    return;
                                }
                                com.tencent.qbar.ScanDecodeFrameData scanDecodeFrameData = (com.tencent.qbar.ScanDecodeFrameData) bundle22.getParcelable("decode_success_frame_data");
                                if (scanDecodeFrameData != null) {
                                    baseScanUI.f159144e.setDecodeSuccessFrameData(scanDecodeFrameData);
                                }
                                baseScanUI.f159165x1 = i182 > 1;
                                baseScanUI.M1 = null;
                                if (i182 > 1) {
                                    baseScanUI.f159153p.a(false);
                                    baseScanUI.f159153p.b(true, null);
                                    baseScanUI.r7(false);
                                }
                                baseScanUI.T = true;
                                baseScanUI.f159144e.setSuccessMarkClickListener(new com.tencent.mm.plugin.scanner.model.i2() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.9.1

                                    /* renamed from: a */
                                    public final /* synthetic */ java.util.ArrayList f159272a;

                                    /* renamed from: b */
                                    public final /* synthetic */ int f159273b;

                                    /* renamed from: c */
                                    public final /* synthetic */ com.tencent.qbar.ScanIdentifyReportInfo f159274c;

                                    /* renamed from: d */
                                    public final /* synthetic */ long f159275d;

                                    /* renamed from: e */
                                    public final /* synthetic */ android.os.Bundle f159276e;

                                    public AnonymousClass1(final java.util.ArrayList parcelableArrayList22, final int i1822, final com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo22, final long j2722, final android.os.Bundle bundle222) {
                                        r2 = parcelableArrayList22;
                                        r3 = i1822;
                                        r4 = scanIdentifyReportInfo22;
                                        r5 = j2722;
                                        r7 = bundle222;
                                    }

                                    @Override // com.tencent.mm.plugin.scanner.model.i2
                                    public void a(int i27, android.view.View view) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "onScanSuccess onClick mark index: %d", java.lang.Integer.valueOf(i27));
                                        java.util.ArrayList arrayList2 = r2;
                                        if (i27 >= arrayList2.size() || r3 <= 1) {
                                            return;
                                        }
                                        com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass9 anonymousClass92 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass9.this;
                                        com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.T = false;
                                        com.tencent.qbar.WxQBarResult wxQBarResult22 = (com.tencent.qbar.WxQBarResult) arrayList2.get(i27);
                                        com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo22 = r4;
                                        com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI2 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                                        if (!com.tencent.mm.plugin.scanner.ui.BaseScanUI.V6(baseScanUI2, wxQBarResult22, true, scanIdentifyReportInfo22)) {
                                            com.tencent.mm.plugin.scanner.ui.BaseScanUI.W6(baseScanUI2, r5, r7, wxQBarResult22);
                                        }
                                        com.tencent.mm.plugin.scanner.model.h2.n(2, i27, baseScanUI2.f159167y0);
                                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, !com.tencent.mm.plugin.scanner.model.h2.f158929j ? 63 : 83);
                                    }
                                });
                                baseScanUI.Y6(2);
                                baseScanUI.s7(false, false);
                                baseScanUI.h7();
                                baseScanUI.f159144e.v(parcelableArrayList22, new com.tencent.mm.plugin.scanner.view.w0() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.9.2

                                    /* renamed from: a */
                                    public final /* synthetic */ int f159278a;

                                    /* renamed from: b */
                                    public final /* synthetic */ java.util.ArrayList f159279b;

                                    /* renamed from: c */
                                    public final /* synthetic */ com.tencent.qbar.WxQBarResult f159280c;

                                    /* renamed from: d */
                                    public final /* synthetic */ com.tencent.qbar.ScanIdentifyReportInfo f159281d;

                                    /* renamed from: e */
                                    public final /* synthetic */ long f159282e;

                                    /* renamed from: f */
                                    public final /* synthetic */ android.os.Bundle f159283f;

                                    public AnonymousClass2(final int i1822, final java.util.ArrayList parcelableArrayList22, final com.tencent.qbar.WxQBarResult wxQBarResult22, final com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo22, final long j2722, final android.os.Bundle bundle222) {
                                        r2 = i1822;
                                        r3 = parcelableArrayList22;
                                        r4 = wxQBarResult22;
                                        r5 = scanIdentifyReportInfo22;
                                        r6 = j2722;
                                        r8 = bundle222;
                                    }

                                    @Override // com.tencent.mm.plugin.scanner.view.w0
                                    public void b(boolean z18) {
                                        com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass9 anonymousClass92 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass9.this;
                                        if (!z18 && r2 != 1 && r3.size() != 1) {
                                            com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.f159161v.a(false);
                                            return;
                                        }
                                        com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI2 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                                        baseScanUI2.T = false;
                                        com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo22 = r5;
                                        com.tencent.qbar.WxQBarResult wxQBarResult22 = r4;
                                        if (!com.tencent.mm.plugin.scanner.ui.BaseScanUI.V6(baseScanUI2, wxQBarResult22, true, scanIdentifyReportInfo22)) {
                                            com.tencent.mm.plugin.scanner.ui.BaseScanUI.W6(com.tencent.mm.plugin.scanner.ui.BaseScanUI.this, r6, r8, wxQBarResult22);
                                        }
                                        com.tencent.mm.plugin.scanner.model.h2.n(1, 0, com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.f159167y0);
                                    }

                                    @Override // com.tencent.mm.plugin.scanner.view.w0
                                    public void c() {
                                    }
                                }, z17, true);
                            }
                        }
                    }
                });
            }

            @Override // at5.b
            public void c(long j17, long j18) {
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                if (j17 != scanUIRectView.f159407x || j17 == 0) {
                    return;
                }
                scanUIRectView.k(j18);
            }

            @Override // at5.b
            public void d(byte[] bArr, com.tencent.wechat.aff.iam_scan.y yVar) {
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                if (!scanUIRectView.f159396l1) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ScanUIRectView", "enableScanCodeProductMerge false, return");
                    return;
                }
                if (scanUIRectView.f159399p1) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ScanUIRectView", "disableScanProductInMergeMode true, return");
                    return;
                }
                try {
                    if (((qt5.c) scanUIRectView.f215302e).f366657b) {
                        qt5.i0 i0Var = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e;
                        android.graphics.Point point = ((qt5.c) i0Var).f366662g;
                        vz3.t.f441710a.k(yVar, new tz3.d(bArr, point.x, point.y, ((qt5.c) i0Var).f366667l, ((xy3.a) i0Var).f366656a.getParameters().getPreviewFormat(), true));
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanUIRectView", e17, "", new java.lang.Object[0]);
                }
            }
        };
        this.N1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanFlashSwitchEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.16
            {
                this.__eventId = 208336003;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ScanFlashSwitchEvent scanFlashSwitchEvent) {
                int i17 = scanFlashSwitchEvent.f54730g.f8033a;
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                if (i17 == 1) {
                    int i18 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.P1;
                    xy3.a aVar = (xy3.a) scanUIRectView.f215302e;
                    if (!aVar.f366668m) {
                        aVar.t();
                    }
                } else {
                    int i19 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.P1;
                    xy3.a aVar2 = (xy3.a) scanUIRectView.f215302e;
                    if (aVar2.f366668m) {
                        aVar2.q();
                    }
                }
                return true;
            }
        };
        this.O1 = new android.view.GestureDetector(new android.view.GestureDetector.SimpleOnGestureListener() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.17
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
            public boolean onContextClick(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onContextClick = super.onContextClick(motionEvent);
                yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
                return onContextClick;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
                motionEvent.getActionIndex();
                motionEvent.getX(motionEvent.getActionIndex());
                motionEvent.getY(motionEvent.getActionIndex());
                int i17 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.P1;
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                qt5.i0 i0Var = scanUIRectView.f215302e;
                if (((xy3.a) i0Var).f366670o != ((xy3.a) i0Var).f366671p) {
                    ((xy3.a) i0Var).o(1);
                    com.tencent.mm.plugin.scanner.model.h2.z(scanUIRectView.f159404u, 6, scanUIRectView.f159396l1);
                } else {
                    ((xy3.a) i0Var).o(4);
                    com.tencent.mm.plugin.scanner.model.h2.z(scanUIRectView.f159404u, 5, scanUIRectView.f159396l1);
                }
                yj0.a.i(true, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
                int i17;
                int i18;
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                boolean z17 = scanUIRectView.f159395J;
                boolean z18 = scanUIRectView.I;
                if (!scanUIRectView.N && z18 && java.lang.Math.abs(f17) > java.lang.Math.abs(f18)) {
                    if (f17 < -1200.0f && scanUIRectView.f159395J) {
                        d04.y2 y2Var = scanUIRectView.H;
                        if (y2Var != null && (i18 = y2Var.f225565d + 1) >= 0 && i18 < y2Var.f225564c.size()) {
                            y2Var.f225565d = i18;
                            com.tencent.mm.plugin.scanner.ui.widget.ScanScrollTabView scanScrollTabView = y2Var.f225563b;
                            if (scanScrollTabView != null) {
                                scanScrollTabView.h(i18, 3);
                            }
                        }
                        scanUIRectView.f159395J = false;
                    } else if (f17 > 1200.0f && scanUIRectView.f159395J) {
                        d04.y2 y2Var2 = scanUIRectView.H;
                        if (y2Var2 != null && y2Var2.f225565d - 1 >= 0 && i17 < y2Var2.f225564c.size()) {
                            y2Var2.f225565d = i17;
                            com.tencent.mm.plugin.scanner.ui.widget.ScanScrollTabView scanScrollTabView2 = y2Var2.f225563b;
                            if (scanScrollTabView2 != null) {
                                scanScrollTabView2.h(i17, 3);
                            }
                        }
                        scanUIRectView.f159395J = false;
                    }
                }
                return super.onFling(motionEvent, motionEvent2, f17, f18);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
                super.onLongPress(motionEvent);
                yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                boolean z17 = scanUIRectView.N;
                if (scanUIRectView.N) {
                    return true;
                }
                scanUIRectView.getClass();
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
                yj0.a.i(onSingleTapUp, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
                return onSingleTapUp;
            }
        });
    }

    public ScanUIRectView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f159404u = 1;
        this.f159405v = true;
        this.f159406w = true;
        this.f159410y = null;
        this.I = true;
        this.f159395J = false;
        this.K = 0;
        this.M = 120;
        this.N = false;
        this.P = null;
        this.Q = true;
        this.R = true;
        this.S = new e04.g1();
        this.T = new e04.h1();
        this.U = false;
        this.V = 0;
        this.W = true;
        this.f159398p0 = false;
        this.f159411y0 = false;
        this.f159396l1 = false;
        this.f159399p1 = false;
        this.f159409x1 = false;
        this.f159412y1 = false;
        this.f159414z1 = true;
        this.A1 = false;
        e04.l2 l2Var = new e04.l2();
        this.B1 = l2Var;
        this.C1 = 0;
        this.D1 = 0L;
        this.E1 = l2Var.f246008b;
        this.F1 = false;
        this.G1 = true;
        this.H1 = false;
        this.I1 = false;
        this.J1 = false;
        this.K1 = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView.l(com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this);
            }
        };
        this.L1 = new e04.j1();
        this.M1 = new at5.b() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.15
            @Override // at5.b
            public void a(final long j17, final android.os.Bundle bundle) {
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.15.3
                    @Override // java.lang.Runnable
                    public void run() {
                        android.os.Bundle bundle2;
                        try {
                            long j18 = j17;
                            if (j18 != com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f159407x || j18 == 0 || (bundle2 = bundle) == null || !bundle2.containsKey("param_zoom_ratio")) {
                                return;
                            }
                            float f17 = bundle.getFloat("param_zoom_ratio", 0.0f);
                            com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "zoom to scale %f", java.lang.Float.valueOf(f17));
                            if (f17 > 0.0f) {
                                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                                if (scanUIRectView.W && ((qt5.c) scanUIRectView.f215302e).f366658c) {
                                    ((qt5.c) com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e).p((int) (((qt5.c) com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e).c() * f17));
                                    zs5.g0 g0Var = zs5.g0.F;
                                    g0Var.f475384q++;
                                    g0Var.f475385r = f17 * g0Var.f475385r;
                                    g0Var.f475386s = java.lang.System.currentTimeMillis() - 0;
                                }
                            }
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanUIRectView", e17, "zoomToScale exception", new java.lang.Object[0]);
                        }
                    }
                });
            }

            @Override // at5.b
            public void b(final long j17, final java.util.List list, final java.util.List list2, java.util.List list3, final android.os.Bundle bundle) {
                java.lang.String.format("scan code after decode %d", java.lang.Long.valueOf(j17));
                final long currentTimeMillis = java.lang.System.currentTimeMillis();
                zs5.n0 n0Var = zs5.n0.f475450a;
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                n0Var.d(scanUIRectView.f159407x, scanUIRectView.f159410y);
                if (list == null || list.isEmpty()) {
                    return;
                }
                scanUIRectView.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.15.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.mm.plugin.scanner.ui.ScanUIRectView.AnonymousClass15 anonymousClass15 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.AnonymousClass15.this;
                        com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView2 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                        long j18 = scanUIRectView2.f159407x;
                        long j19 = j17;
                        if (j18 != j19 || j19 == 0) {
                            return;
                        }
                        e04.j1 j1Var = scanUIRectView2.L1;
                        j1Var.f245984s = true;
                        j1Var.f245985t = currentTimeMillis - j1Var.f245966a;
                        e04.i1 i1Var = e04.i1.f245958f;
                        i1Var.toString();
                        j1Var.f245986u = i1Var;
                        com.tencent.wechat.aff.iam_scan.f1 f1Var = com.tencent.wechat.aff.iam_scan.f1.DECODE_SUCCESS;
                        com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView3 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                        scanUIRectView3.G(f1Var);
                        java.util.List list4 = list;
                        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(list4);
                        java.util.Iterator it = list2.iterator();
                        int i172 = 0;
                        while (it.hasNext()) {
                            if (((com.tencent.qbar.QbarNative$QBarPoint) it.next()) != null) {
                                i172++;
                            }
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUIRectView", "onDecodeSuccess result size: %d, codePointCount: %d", java.lang.Integer.valueOf(list4.size()), java.lang.Integer.valueOf(i172));
                        final android.os.Bundle bundle222 = new android.os.Bundle();
                        bundle222.putParcelableArrayList("result_qbar_result_list", arrayList);
                        bundle222.putInt("result_code_point_count", i172);
                        if (scanUIRectView3.getScanCodeRect() != null) {
                            bundle222.putFloatArray("result_code_image_rect", new float[]{r9.left, r9.top, r9.right, r9.bottom});
                        }
                        android.os.Bundle bundle3 = bundle;
                        if (bundle3 != null) {
                            bundle222.putAll(bundle3);
                        }
                        com.tencent.mm.plugin.scanner.view.BaseScanMaskView baseScanMaskView = scanUIRectView3.f159402s;
                        if (baseScanMaskView != null && (baseScanMaskView instanceof com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView)) {
                            ((com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView) baseScanMaskView).Q.cancel();
                        }
                        com.tencent.mm.plugin.scanner.ui.ScanUIRectView.ScanCallBack scanCallBack = scanUIRectView3.f159413z;
                        if (scanCallBack != null) {
                            final long j2722 = scanUIRectView3.f159407x;
                            final com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass9 anonymousClass9 = (com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass9) scanCallBack;
                            com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                            if (!baseScanUI.U) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.ScanUI", "onScanSuccess can not process code result currentMode: %d", java.lang.Integer.valueOf(baseScanUI.C));
                                return;
                            }
                            if (baseScanUI.f159159t != null) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "scan code cost time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - baseScanUI.A));
                                final java.util.ArrayList parcelableArrayList22 = bundle222.getParcelableArrayList("result_qbar_result_list");
                                if (parcelableArrayList22 == null || parcelableArrayList22.size() <= 0) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.ScanUI", "onScanSuccess qbarResult invalid");
                                    return;
                                }
                                final int i1822 = bundle222.getInt("result_code_point_count", 0);
                                long j28 = bundle222.getLong("decode_success_cost_time", 0L);
                                com.tencent.mm.plugin.scanner.model.h2.r(baseScanUI.C, true, baseScanUI.f159167y0 ? 3 : 1, i1822);
                                com.tencent.mm.plugin.scanner.model.d.a(1, null);
                                com.tencent.mm.plugin.scanner.model.h2.D(baseScanUI.C);
                                baseScanUI.k7(true, i1822 > 1);
                                baseScanUI.p7(false);
                                int i19 = baseScanUI.C;
                                com.tencent.mm.plugin.scanner.model.d2 d2Var = new com.tencent.mm.plugin.scanner.model.d2(parcelableArrayList22, j28);
                                com.tencent.mm.plugin.scanner.model.h2.f158930k = d2Var;
                                try {
                                    java.lang.String d17 = com.tencent.mm.plugin.scanner.model.h2.d(i19);
                                    d2Var.f158868c = d17 != null ? java.lang.Long.parseLong(d17) : java.lang.System.currentTimeMillis();
                                    com.tencent.mm.plugin.scanner.model.d2 d2Var2 = com.tencent.mm.plugin.scanner.model.h2.f158930k;
                                    if (d2Var2 != null) {
                                        java.lang.String c17 = com.tencent.mm.plugin.scanner.model.h2.c(i19);
                                        d2Var2.f158869d = c17 != null ? java.lang.Long.parseLong(c17) : java.lang.System.currentTimeMillis();
                                    }
                                    com.tencent.mm.plugin.scanner.model.d2 d2Var3 = com.tencent.mm.plugin.scanner.model.h2.f158930k;
                                    if (d2Var3 != null) {
                                        d2Var3.f158870e = java.lang.Long.parseLong(com.tencent.mm.plugin.scanner.model.h2.f158921b);
                                    }
                                    com.tencent.mm.plugin.scanner.model.d2 d2Var4 = com.tencent.mm.plugin.scanner.model.h2.f158930k;
                                    if (d2Var4 != null) {
                                        d2Var4.f158871f = java.lang.System.currentTimeMillis();
                                    }
                                } catch (java.lang.Exception unused) {
                                }
                                boolean z17 = baseScanUI.f159145f.f159465g;
                                final com.tencent.qbar.WxQBarResult wxQBarResult22 = (com.tencent.qbar.WxQBarResult) parcelableArrayList22.get(0);
                                if (wxQBarResult22 == null) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "firstQBarResult is null");
                                    return;
                                }
                                final com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo22 = (com.tencent.qbar.ScanIdentifyReportInfo) bundle222.getParcelable("ScanIdentifyReportInfo.DecodeKey");
                                if (com.tencent.mm.plugin.scanner.ui.BaseScanUI.V6(baseScanUI, wxQBarResult22, parcelableArrayList22.size() <= 1, scanIdentifyReportInfo22)) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.ScanUI", "scan code has deal with");
                                    return;
                                }
                                com.tencent.mm.plugin.scanner.model.h2.q(com.tencent.mm.plugin.scanner.j1.b(com.tencent.mm.plugin.scanner.j1.a(wxQBarResult22.f475331e)) ? 1 : 2, 1, baseScanUI.D1, baseScanUI.S);
                                bundle222.putInt("qbar_string_scan_source", 0);
                                if (i1822 <= 0 || baseScanUI.f159144e == null) {
                                    baseScanUI.p7(true);
                                    if (com.tencent.mm.plugin.scanner.ui.BaseScanUI.V6(baseScanUI, wxQBarResult22, true, scanIdentifyReportInfo22)) {
                                        return;
                                    }
                                    com.tencent.mm.plugin.scanner.ui.BaseScanUI.W6(baseScanUI, j2722, bundle222, wxQBarResult22);
                                    return;
                                }
                                com.tencent.qbar.ScanDecodeFrameData scanDecodeFrameData = (com.tencent.qbar.ScanDecodeFrameData) bundle222.getParcelable("decode_success_frame_data");
                                if (scanDecodeFrameData != null) {
                                    baseScanUI.f159144e.setDecodeSuccessFrameData(scanDecodeFrameData);
                                }
                                baseScanUI.f159165x1 = i1822 > 1;
                                baseScanUI.M1 = null;
                                if (i1822 > 1) {
                                    baseScanUI.f159153p.a(false);
                                    baseScanUI.f159153p.b(true, null);
                                    baseScanUI.r7(false);
                                }
                                baseScanUI.T = true;
                                baseScanUI.f159144e.setSuccessMarkClickListener(new com.tencent.mm.plugin.scanner.model.i2() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.9.1

                                    /* renamed from: a */
                                    public final /* synthetic */ java.util.ArrayList f159272a;

                                    /* renamed from: b */
                                    public final /* synthetic */ int f159273b;

                                    /* renamed from: c */
                                    public final /* synthetic */ com.tencent.qbar.ScanIdentifyReportInfo f159274c;

                                    /* renamed from: d */
                                    public final /* synthetic */ long f159275d;

                                    /* renamed from: e */
                                    public final /* synthetic */ android.os.Bundle f159276e;

                                    public AnonymousClass1(final java.util.ArrayList parcelableArrayList222, final int i18222, final com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo222, final long j27222, final android.os.Bundle bundle2222) {
                                        r2 = parcelableArrayList222;
                                        r3 = i18222;
                                        r4 = scanIdentifyReportInfo222;
                                        r5 = j27222;
                                        r7 = bundle2222;
                                    }

                                    @Override // com.tencent.mm.plugin.scanner.model.i2
                                    public void a(int i27, android.view.View view) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.ScanUI", "onScanSuccess onClick mark index: %d", java.lang.Integer.valueOf(i27));
                                        java.util.ArrayList arrayList2 = r2;
                                        if (i27 >= arrayList2.size() || r3 <= 1) {
                                            return;
                                        }
                                        com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass9 anonymousClass92 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass9.this;
                                        com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.T = false;
                                        com.tencent.qbar.WxQBarResult wxQBarResult222 = (com.tencent.qbar.WxQBarResult) arrayList2.get(i27);
                                        com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo222 = r4;
                                        com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI2 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                                        if (!com.tencent.mm.plugin.scanner.ui.BaseScanUI.V6(baseScanUI2, wxQBarResult222, true, scanIdentifyReportInfo222)) {
                                            com.tencent.mm.plugin.scanner.ui.BaseScanUI.W6(baseScanUI2, r5, r7, wxQBarResult222);
                                        }
                                        com.tencent.mm.plugin.scanner.model.h2.n(2, i27, baseScanUI2.f159167y0);
                                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, !com.tencent.mm.plugin.scanner.model.h2.f158929j ? 63 : 83);
                                    }
                                });
                                baseScanUI.Y6(2);
                                baseScanUI.s7(false, false);
                                baseScanUI.h7();
                                baseScanUI.f159144e.v(parcelableArrayList222, new com.tencent.mm.plugin.scanner.view.w0() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.9.2

                                    /* renamed from: a */
                                    public final /* synthetic */ int f159278a;

                                    /* renamed from: b */
                                    public final /* synthetic */ java.util.ArrayList f159279b;

                                    /* renamed from: c */
                                    public final /* synthetic */ com.tencent.qbar.WxQBarResult f159280c;

                                    /* renamed from: d */
                                    public final /* synthetic */ com.tencent.qbar.ScanIdentifyReportInfo f159281d;

                                    /* renamed from: e */
                                    public final /* synthetic */ long f159282e;

                                    /* renamed from: f */
                                    public final /* synthetic */ android.os.Bundle f159283f;

                                    public AnonymousClass2(final int i18222, final java.util.ArrayList parcelableArrayList222, final com.tencent.qbar.WxQBarResult wxQBarResult222, final com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo222, final long j27222, final android.os.Bundle bundle2222) {
                                        r2 = i18222;
                                        r3 = parcelableArrayList222;
                                        r4 = wxQBarResult222;
                                        r5 = scanIdentifyReportInfo222;
                                        r6 = j27222;
                                        r8 = bundle2222;
                                    }

                                    @Override // com.tencent.mm.plugin.scanner.view.w0
                                    public void b(boolean z18) {
                                        com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass9 anonymousClass92 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.AnonymousClass9.this;
                                        if (!z18 && r2 != 1 && r3.size() != 1) {
                                            com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.f159161v.a(false);
                                            return;
                                        }
                                        com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI2 = com.tencent.mm.plugin.scanner.ui.BaseScanUI.this;
                                        baseScanUI2.T = false;
                                        com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo222 = r5;
                                        com.tencent.qbar.WxQBarResult wxQBarResult222 = r4;
                                        if (!com.tencent.mm.plugin.scanner.ui.BaseScanUI.V6(baseScanUI2, wxQBarResult222, true, scanIdentifyReportInfo222)) {
                                            com.tencent.mm.plugin.scanner.ui.BaseScanUI.W6(com.tencent.mm.plugin.scanner.ui.BaseScanUI.this, r6, r8, wxQBarResult222);
                                        }
                                        com.tencent.mm.plugin.scanner.model.h2.n(1, 0, com.tencent.mm.plugin.scanner.ui.BaseScanUI.this.f159167y0);
                                    }

                                    @Override // com.tencent.mm.plugin.scanner.view.w0
                                    public void c() {
                                    }
                                }, z17, true);
                            }
                        }
                    }
                });
            }

            @Override // at5.b
            public void c(long j17, long j18) {
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                if (j17 != scanUIRectView.f159407x || j17 == 0) {
                    return;
                }
                scanUIRectView.k(j18);
            }

            @Override // at5.b
            public void d(byte[] bArr, com.tencent.wechat.aff.iam_scan.y yVar) {
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                if (!scanUIRectView.f159396l1) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ScanUIRectView", "enableScanCodeProductMerge false, return");
                    return;
                }
                if (scanUIRectView.f159399p1) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ScanUIRectView", "disableScanProductInMergeMode true, return");
                    return;
                }
                try {
                    if (((qt5.c) scanUIRectView.f215302e).f366657b) {
                        qt5.i0 i0Var = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this.f215302e;
                        android.graphics.Point point = ((qt5.c) i0Var).f366662g;
                        vz3.t.f441710a.k(yVar, new tz3.d(bArr, point.x, point.y, ((qt5.c) i0Var).f366667l, ((xy3.a) i0Var).f366656a.getParameters().getPreviewFormat(), true));
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanUIRectView", e17, "", new java.lang.Object[0]);
                }
            }
        };
        this.N1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanFlashSwitchEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.16
            {
                this.__eventId = 208336003;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ScanFlashSwitchEvent scanFlashSwitchEvent) {
                int i172 = scanFlashSwitchEvent.f54730g.f8033a;
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                if (i172 == 1) {
                    int i18 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.P1;
                    xy3.a aVar = (xy3.a) scanUIRectView.f215302e;
                    if (!aVar.f366668m) {
                        aVar.t();
                    }
                } else {
                    int i19 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.P1;
                    xy3.a aVar2 = (xy3.a) scanUIRectView.f215302e;
                    if (aVar2.f366668m) {
                        aVar2.q();
                    }
                }
                return true;
            }
        };
        this.O1 = new android.view.GestureDetector(new android.view.GestureDetector.SimpleOnGestureListener() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.17
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
            public boolean onContextClick(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onContextClick = super.onContextClick(motionEvent);
                yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
                return onContextClick;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
                motionEvent.getActionIndex();
                motionEvent.getX(motionEvent.getActionIndex());
                motionEvent.getY(motionEvent.getActionIndex());
                int i172 = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.P1;
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                qt5.i0 i0Var = scanUIRectView.f215302e;
                if (((xy3.a) i0Var).f366670o != ((xy3.a) i0Var).f366671p) {
                    ((xy3.a) i0Var).o(1);
                    com.tencent.mm.plugin.scanner.model.h2.z(scanUIRectView.f159404u, 6, scanUIRectView.f159396l1);
                } else {
                    ((xy3.a) i0Var).o(4);
                    com.tencent.mm.plugin.scanner.model.h2.z(scanUIRectView.f159404u, 5, scanUIRectView.f159396l1);
                }
                yj0.a.i(true, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
                int i172;
                int i18;
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                boolean z17 = scanUIRectView.f159395J;
                boolean z18 = scanUIRectView.I;
                if (!scanUIRectView.N && z18 && java.lang.Math.abs(f17) > java.lang.Math.abs(f18)) {
                    if (f17 < -1200.0f && scanUIRectView.f159395J) {
                        d04.y2 y2Var = scanUIRectView.H;
                        if (y2Var != null && (i18 = y2Var.f225565d + 1) >= 0 && i18 < y2Var.f225564c.size()) {
                            y2Var.f225565d = i18;
                            com.tencent.mm.plugin.scanner.ui.widget.ScanScrollTabView scanScrollTabView = y2Var.f225563b;
                            if (scanScrollTabView != null) {
                                scanScrollTabView.h(i18, 3);
                            }
                        }
                        scanUIRectView.f159395J = false;
                    } else if (f17 > 1200.0f && scanUIRectView.f159395J) {
                        d04.y2 y2Var2 = scanUIRectView.H;
                        if (y2Var2 != null && y2Var2.f225565d - 1 >= 0 && i172 < y2Var2.f225564c.size()) {
                            y2Var2.f225565d = i172;
                            com.tencent.mm.plugin.scanner.ui.widget.ScanScrollTabView scanScrollTabView2 = y2Var2.f225563b;
                            if (scanScrollTabView2 != null) {
                                scanScrollTabView2.h(i172, 3);
                            }
                        }
                        scanUIRectView.f159395J = false;
                    }
                }
                return super.onFling(motionEvent, motionEvent2, f17, f18);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
                super.onLongPress(motionEvent);
                yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
                com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = com.tencent.mm.plugin.scanner.ui.ScanUIRectView.this;
                boolean z17 = scanUIRectView.N;
                if (scanUIRectView.N) {
                    return true;
                }
                scanUIRectView.getClass();
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
                yj0.a.i(onSingleTapUp, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
                return onSingleTapUp;
            }
        });
    }
}
