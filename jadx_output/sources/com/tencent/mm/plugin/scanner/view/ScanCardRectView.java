package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes13.dex */
public class ScanCardRectView extends com.tencent.scanlib.ui.ScanView {
    public static final /* synthetic */ int A = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f159888p;

    /* renamed from: q, reason: collision with root package name */
    public long f159889q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.view.ScanRectDecorView f159890r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.view.CardHighLightEdgeView f159891s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.view.q f159892t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f159893u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher f159894v;

    /* renamed from: w, reason: collision with root package name */
    public final yy3.a f159895w;

    /* renamed from: x, reason: collision with root package name */
    public final yy3.e f159896x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f159897y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f159898z;

    public ScanCardRectView(android.content.Context context) {
        super(context);
        this.f159895w = new com.tencent.mm.plugin.scanner.view.i(this);
        this.f159896x = new com.tencent.mm.plugin.scanner.view.n(this);
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f159897y = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanDarkDetectEvent>(a0Var) { // from class: com.tencent.mm.plugin.scanner.view.ScanCardRectView.9
            {
                this.__eventId = -890853388;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ScanDarkDetectEvent scanDarkDetectEvent) {
                boolean z17 = scanDarkDetectEvent.f54729g.f7932a;
                com.tencent.mm.plugin.scanner.view.ScanCardRectView scanCardRectView = com.tencent.mm.plugin.scanner.view.ScanCardRectView.this;
                if (z17) {
                    com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher scannerFlashSwitcher = scanCardRectView.f159894v;
                    if (scannerFlashSwitcher == null || scannerFlashSwitcher.isShown()) {
                        return false;
                    }
                    scanCardRectView.f159894v.d();
                    return false;
                }
                com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher scannerFlashSwitcher2 = scanCardRectView.f159894v;
                if (scannerFlashSwitcher2 == null || scannerFlashSwitcher2.f159465g) {
                    return false;
                }
                scannerFlashSwitcher2.b();
                return false;
            }
        };
        this.f159898z = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanFlashSwitchEvent>(a0Var) { // from class: com.tencent.mm.plugin.scanner.view.ScanCardRectView.10
            {
                this.__eventId = 208336003;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ScanFlashSwitchEvent scanFlashSwitchEvent) {
                int i17 = scanFlashSwitchEvent.f54730g.f8033a;
                com.tencent.mm.plugin.scanner.view.ScanCardRectView scanCardRectView = com.tencent.mm.plugin.scanner.view.ScanCardRectView.this;
                if (i17 == 1) {
                    int i18 = com.tencent.mm.plugin.scanner.view.ScanCardRectView.A;
                    xy3.a aVar = (xy3.a) scanCardRectView.f215302e;
                    if (!aVar.f366668m) {
                        aVar.t();
                    }
                } else {
                    int i19 = com.tencent.mm.plugin.scanner.view.ScanCardRectView.A;
                    xy3.a aVar2 = (xy3.a) scanCardRectView.f215302e;
                    if (aVar2.f366668m) {
                        aVar2.q();
                    }
                }
                return true;
            }
        };
    }

    @Override // com.tencent.scanlib.ui.ScanView
    public void b() {
        this.f215302e = new xy3.a();
    }

    @Override // com.tencent.scanlib.ui.ScanView
    public void d() {
        super.d();
        com.tencent.mm.plugin.scanner.view.CardHighLightEdgeView cardHighLightEdgeView = new com.tencent.mm.plugin.scanner.view.CardHighLightEdgeView(getContext());
        this.f159891s = cardHighLightEdgeView;
        addView(cardHighLightEdgeView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.tencent.mm.plugin.scanner.view.ScanRectDecorView scanRectDecorView = new com.tencent.mm.plugin.scanner.view.ScanRectDecorView(getContext());
        this.f159890r = scanRectDecorView;
        addView(scanRectDecorView, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.tencent.scanlib.ui.ScanView
    public void e() {
        super.e();
        p();
    }

    @Override // com.tencent.scanlib.ui.ScanView
    public void f() {
        super.f();
        if (!((qt5.c) this.f215302e).f366657b) {
            g(new com.tencent.mm.plugin.scanner.view.e(this));
        } else if (((qt5.c) this.f215302e).f366658c) {
            k(0L);
        } else {
            i(new com.tencent.mm.plugin.scanner.view.h(this));
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f159889q = currentTimeMillis;
        int i17 = this.f159888p;
        if (i17 == 7) {
            yy3.c cVar = yy3.c.f468448l;
            yy3.a aVar = this.f159895w;
            synchronized (cVar.f468451b) {
                cVar.f468454e = currentTimeMillis;
                cVar.f468460k = 0;
                cVar.f468455f = aVar;
            }
        } else if (i17 == 9 || i17 == 11 || i17 == 10) {
            if (i17 == 9 || i17 == 11) {
                yy3.f fVar = yy3.f.f468467m;
                yy3.e eVar = this.f159896x;
                synchronized (fVar.f468469b) {
                    fVar.f468476i = 1;
                    fVar.f468472e = currentTimeMillis;
                    fVar.f468477j = 0;
                    fVar.f468473f = eVar;
                }
            } else if (i17 == 10) {
                yy3.f fVar2 = yy3.f.f468467m;
                yy3.e eVar2 = this.f159896x;
                synchronized (fVar2.f468469b) {
                    fVar2.f468476i = 2;
                    fVar2.f468472e = currentTimeMillis;
                    fVar2.f468477j = 0;
                    fVar2.f468473f = eVar2;
                }
            }
        }
        com.tencent.mm.plugin.scanner.view.ScanRectDecorView scanRectDecorView = this.f159890r;
        if (scanRectDecorView.f159910d.isStarted()) {
            return;
        }
        scanRectDecorView.f159911e.setVisibility(0);
        scanRectDecorView.f159910d.start();
    }

    public android.graphics.Rect getDecorRect() {
        return this.f159890r.getDecorRect();
    }

    public final void l() {
        com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher scannerFlashSwitcher = (com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher) this.f159893u.findViewById(com.tencent.mm.R.id.mab);
        this.f159894v = scannerFlashSwitcher;
        if (scannerFlashSwitcher != null) {
            scannerFlashSwitcher.setOnClickListener(new com.tencent.mm.plugin.scanner.view.o(this));
        }
        this.f159897y.alive();
        this.f159898z.alive();
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.scanner.view.p(this), 300L);
    }

    public void m() {
        com.tencent.stubs.logger.Log.i("ScanView", "onDestroy");
        this.f215301d.setSurfaceTextureListener(null);
        yy3.c.f468448l.b();
        yy3.f fVar = yy3.f.f468467m;
        fVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LicenseCardDecodeQueue", "release");
        synchronized (fVar.f468470c) {
            if (fVar.f468474g) {
                com.tencent.mm.plugin.licence.model.LibCardRecog.recognizeCardRelease();
            }
            fVar.f468474g = false;
        }
    }

    public void n() {
        com.tencent.stubs.logger.Log.i("ScanView", "onStop");
        a();
        uo.n.f429522a.b();
        com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher scannerFlashSwitcher = this.f159894v;
        if (scannerFlashSwitcher != null) {
            scannerFlashSwitcher.a();
        }
        com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector.f159829l.d();
        this.f159898z.dead();
        this.f159897y.dead();
    }

    public final boolean o() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_id_card_scan_v2, 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCardRectView", "id_card_scan_v2: %s", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.graphics.Point point = new android.graphics.Point();
        getDisplay().getSize(point);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCardRectView", "screenSize %s", point);
        android.view.View view = this.f159893u;
        if (view != null) {
            removeView(view);
        }
        switch (this.f159888p) {
            case 7:
                this.f159893u = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.chp, null);
                java.lang.String stringExtra = ((android.app.Activity) getContext()).getIntent().getStringExtra("bank_card_owner");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String str = stringExtra != null ? stringExtra : "";
                java.lang.String format = java.lang.String.format(getContext().getResources().getString(com.tencent.mm.R.string.i8w), str);
                android.view.View findViewById = this.f159893u.findViewById(com.tencent.mm.R.id.ofg);
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(4);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/scanner/view/ScanCardRectView", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/scanner/view/ScanCardRectView", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    ((android.widget.TextView) this.f159893u.findViewById(com.tencent.mm.R.id.ad8)).setText(format);
                    this.f159893u.findViewById(com.tencent.mm.R.id.ad6).setOnClickListener(new com.tencent.mm.plugin.scanner.view.d(this));
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/view/ScanCardRectView", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/scanner/view/ScanCardRectView", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                addView(this.f159893u, new android.widget.FrameLayout.LayoutParams(-1, -1));
                android.graphics.Rect rect = new android.graphics.Rect();
                rect.left = i65.a.b(getContext(), 40);
                rect.right = point.x - i65.a.b(getContext(), 40);
                int width = (point.y - ((int) (rect.width() / 1.586f))) / 2;
                rect.top = width;
                rect.bottom = width + ((int) (rect.width() / 1.586f));
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanCardRectView", "scan bank card rect %s", rect);
                this.f159890r.c(rect.width(), rect.height());
                this.f159891s.setCardRect(rect);
                l();
                return;
            case 8:
            default:
                com.tencent.mars.xlog.Log.e("MicroMsg.ScanCardRectView", "unknown mode!");
                return;
            case 9:
            case 11:
                android.graphics.Rect rect2 = new android.graphics.Rect();
                rect2.left = i65.a.b(getContext(), 40);
                rect2.right = point.x - i65.a.b(getContext(), 40);
                int width2 = (point.y - ((int) (rect2.width() / 1.586f))) / 2;
                rect2.top = width2;
                rect2.bottom = width2 + ((int) (rect2.width() / 1.586f));
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanCardRectView", "scan id card rect %s", rect2);
                this.f159890r.c(rect2.width(), rect2.height());
                this.f159891s.setCardRect(rect2);
                android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.chv, null);
                this.f159893u = inflate;
                addView(inflate, new android.widget.FrameLayout.LayoutParams(-1, -1));
                android.widget.TextView textView = (android.widget.TextView) this.f159893u.findViewById(com.tencent.mm.R.id.avx);
                textView.setShadowLayer(3.0f, 0.0f, 0.0f, -16777216);
                textView.setText(getContext().getResources().getString(com.tencent.mm.R.string.i9y));
                com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                l();
                return;
            case 10:
                android.graphics.Rect rect3 = new android.graphics.Rect();
                rect3.left = i65.a.b(getContext(), 40);
                rect3.right = point.x - i65.a.b(getContext(), 40);
                int width3 = (point.y - ((int) (rect3.width() / 1.467f))) / 2;
                rect3.top = width3;
                rect3.bottom = width3 + ((int) (rect3.width() / 1.467f));
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanCardRectView", "scan driver card rect %s", rect3);
                this.f159890r.c(rect3.width(), rect3.height());
                this.f159891s.setCardRect(rect3);
                android.view.View inflate2 = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.chv, null);
                this.f159893u = inflate2;
                addView(inflate2, new android.widget.FrameLayout.LayoutParams(-1, -1));
                ((android.widget.TextView) this.f159893u.findViewById(com.tencent.mm.R.id.avx)).setText("");
                l();
                return;
        }
    }

    @Override // com.tencent.scanlib.ui.ScanView, android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z17, android.hardware.Camera camera) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCardRectView", "onAutoFocus %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            k(0L);
        }
        c(1000);
    }

    @Override // com.tencent.scanlib.ui.ScanView, android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        this.f215305h = 0L;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPreviewFrame null data:");
        sb6.append(bArr == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCardRectView", sb6.toString());
        if (((qt5.c) this.f215302e).f366658c && ((xy3.a) this.f215302e).s()) {
            com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector scanCameraLightDetector = com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector.f159829l;
            android.graphics.Point point = ((xy3.a) this.f215302e).f366662g;
            scanCameraLightDetector.b(bArr, point.x, point.y);
        }
        int i17 = this.f159888p;
        if (i17 != 7) {
            if (i17 == 11) {
                android.graphics.Rect decorRect = getDecorRect();
                double d17 = o() ? 30.0d : 0.0d;
                double d18 = decorRect.bottom - decorRect.top;
                double d19 = decorRect.right - decorRect.left;
                double d27 = ((d18 / d19) * (d19 + d17)) - d18;
                int i18 = (int) (d17 * 0.5d);
                int i19 = (int) (d27 * 0.5d);
                android.graphics.Rect g17 = ((qt5.c) this.f215302e).g(new android.graphics.Rect(decorRect.left - i18, decorRect.top - i19, decorRect.right + i18, decorRect.bottom + i19));
                yy3.f fVar = yy3.f.f468467m;
                qt5.c cVar = (qt5.c) this.f215302e;
                fVar.b(bArr, cVar.f366662g, cVar.f366667l, g17);
                if ("auto".equals(((qt5.c) this.f215302e).d(true)) || fVar.f468477j <= 10) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanCardRectView", "change to FOCUS_MODE_AUTO");
                ((qt5.c) this.f215302e).j("auto");
                c(100L);
                return;
            }
            return;
        }
        android.graphics.Rect g18 = ((qt5.c) this.f215302e).g(getDecorRect());
        yy3.c cVar2 = yy3.c.f468448l;
        qt5.c cVar3 = (qt5.c) this.f215302e;
        android.graphics.Point point2 = cVar3.f366662g;
        int i27 = cVar3.f366667l;
        synchronized (cVar2.f468451b) {
            if (g18.width() != cVar2.f468458i.width() || g18.height() != cVar2.f468458i.height()) {
                synchronized (cVar2.f468452c) {
                    try {
                        if (cVar2.f468456g) {
                            boolean z17 = et5.h.f256676a;
                            com.tencent.wechat.aff.iam_scan.c.f216974b.e();
                        }
                    } finally {
                    }
                }
                cVar2.f468456g = false;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BankCardDetectQueue", "resolution %s, rotation %d, rect %s", point2, java.lang.Integer.valueOf(i27), g18);
        if (!cVar2.f468456g) {
            synchronized (cVar2.f468452c) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BankCardDetectQueue", "rect %s", g18);
                cVar2.f468458i = g18;
                float width = g18.width();
                float f17 = yy3.c.f468449m;
                int i28 = (int) (width * f17);
                int height = (int) (g18.height() * f17);
                cVar2.f468459j.left = g18.left - ((i28 - g18.width()) / 2);
                cVar2.f468459j.top = g18.top - ((height - g18.height()) / 2);
                android.graphics.Rect rect = cVar2.f468459j;
                rect.right = rect.left + i28;
                rect.bottom = rect.top + height;
                com.tencent.mars.xlog.Log.i("MicroMsg.BankCardDetectQueue", "cropRect %s", rect);
                boolean z18 = et5.h.f256676a;
                cVar2.f468456g = com.tencent.wechat.aff.iam_scan.c.f216974b.c(i28, height, 8, false) == 0;
            }
        }
        if (cVar2.f468456g) {
            synchronized (cVar2.f468451b) {
                ((java.util.HashMap) cVar2.f468450a).clear();
                ((java.util.HashMap) cVar2.f468450a).put("param_preview_data", bArr);
                ((java.util.HashMap) cVar2.f468450a).put("param_camera_resolution", point2);
                ((java.util.HashMap) cVar2.f468450a).put("param_camera_rotation", java.lang.Integer.valueOf(i27));
                if (!cVar2.f468457h) {
                    long j17 = cVar2.f468454e;
                    if (j17 != 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BankCardDetectQueue", "%d submit decode bankcard", java.lang.Long.valueOf(j17));
                        cVar2.f468453d.execute(new yy3.b(cVar2, cVar2.f468454e));
                    }
                }
            }
        }
        if ("auto".equals(((qt5.c) this.f215302e).d(true)) || cVar2.f468460k <= 10) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCardRectView", "change to FOCUS_MODE_AUTO");
        ((qt5.c) this.f215302e).j("auto");
        c(100L);
    }

    public final void p() {
        yy3.c.f468448l.b();
        yy3.f.f468467m.d(this.f159889q);
        this.f159889q = 0L;
    }

    public void setDecorRect(android.graphics.Rect rect) {
        this.f159890r.setDecorRect(rect);
        this.f159891s.setCardRect(rect);
    }

    public void setMode(int i17) {
        this.f159888p = i17;
        this.f159889q = 0L;
    }

    public void setScanCallback(com.tencent.mm.plugin.scanner.view.q qVar) {
        this.f159892t = qVar;
    }

    public ScanCardRectView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f159895w = new com.tencent.mm.plugin.scanner.view.i(this);
        this.f159896x = new com.tencent.mm.plugin.scanner.view.n(this);
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f159897y = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanDarkDetectEvent>(a0Var) { // from class: com.tencent.mm.plugin.scanner.view.ScanCardRectView.9
            {
                this.__eventId = -890853388;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ScanDarkDetectEvent scanDarkDetectEvent) {
                boolean z17 = scanDarkDetectEvent.f54729g.f7932a;
                com.tencent.mm.plugin.scanner.view.ScanCardRectView scanCardRectView = com.tencent.mm.plugin.scanner.view.ScanCardRectView.this;
                if (z17) {
                    com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher scannerFlashSwitcher = scanCardRectView.f159894v;
                    if (scannerFlashSwitcher == null || scannerFlashSwitcher.isShown()) {
                        return false;
                    }
                    scanCardRectView.f159894v.d();
                    return false;
                }
                com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher scannerFlashSwitcher2 = scanCardRectView.f159894v;
                if (scannerFlashSwitcher2 == null || scannerFlashSwitcher2.f159465g) {
                    return false;
                }
                scannerFlashSwitcher2.b();
                return false;
            }
        };
        this.f159898z = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanFlashSwitchEvent>(a0Var) { // from class: com.tencent.mm.plugin.scanner.view.ScanCardRectView.10
            {
                this.__eventId = 208336003;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ScanFlashSwitchEvent scanFlashSwitchEvent) {
                int i17 = scanFlashSwitchEvent.f54730g.f8033a;
                com.tencent.mm.plugin.scanner.view.ScanCardRectView scanCardRectView = com.tencent.mm.plugin.scanner.view.ScanCardRectView.this;
                if (i17 == 1) {
                    int i18 = com.tencent.mm.plugin.scanner.view.ScanCardRectView.A;
                    xy3.a aVar = (xy3.a) scanCardRectView.f215302e;
                    if (!aVar.f366668m) {
                        aVar.t();
                    }
                } else {
                    int i19 = com.tencent.mm.plugin.scanner.view.ScanCardRectView.A;
                    xy3.a aVar2 = (xy3.a) scanCardRectView.f215302e;
                    if (aVar2.f366668m) {
                        aVar2.q();
                    }
                }
                return true;
            }
        };
    }

    public ScanCardRectView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f159895w = new com.tencent.mm.plugin.scanner.view.i(this);
        this.f159896x = new com.tencent.mm.plugin.scanner.view.n(this);
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f159897y = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanDarkDetectEvent>(a0Var) { // from class: com.tencent.mm.plugin.scanner.view.ScanCardRectView.9
            {
                this.__eventId = -890853388;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ScanDarkDetectEvent scanDarkDetectEvent) {
                boolean z17 = scanDarkDetectEvent.f54729g.f7932a;
                com.tencent.mm.plugin.scanner.view.ScanCardRectView scanCardRectView = com.tencent.mm.plugin.scanner.view.ScanCardRectView.this;
                if (z17) {
                    com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher scannerFlashSwitcher = scanCardRectView.f159894v;
                    if (scannerFlashSwitcher == null || scannerFlashSwitcher.isShown()) {
                        return false;
                    }
                    scanCardRectView.f159894v.d();
                    return false;
                }
                com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher scannerFlashSwitcher2 = scanCardRectView.f159894v;
                if (scannerFlashSwitcher2 == null || scannerFlashSwitcher2.f159465g) {
                    return false;
                }
                scannerFlashSwitcher2.b();
                return false;
            }
        };
        this.f159898z = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanFlashSwitchEvent>(a0Var) { // from class: com.tencent.mm.plugin.scanner.view.ScanCardRectView.10
            {
                this.__eventId = 208336003;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ScanFlashSwitchEvent scanFlashSwitchEvent) {
                int i172 = scanFlashSwitchEvent.f54730g.f8033a;
                com.tencent.mm.plugin.scanner.view.ScanCardRectView scanCardRectView = com.tencent.mm.plugin.scanner.view.ScanCardRectView.this;
                if (i172 == 1) {
                    int i18 = com.tencent.mm.plugin.scanner.view.ScanCardRectView.A;
                    xy3.a aVar = (xy3.a) scanCardRectView.f215302e;
                    if (!aVar.f366668m) {
                        aVar.t();
                    }
                } else {
                    int i19 = com.tencent.mm.plugin.scanner.view.ScanCardRectView.A;
                    xy3.a aVar2 = (xy3.a) scanCardRectView.f215302e;
                    if (aVar2.f366668m) {
                        aVar2.q();
                    }
                }
                return true;
            }
        };
    }
}
