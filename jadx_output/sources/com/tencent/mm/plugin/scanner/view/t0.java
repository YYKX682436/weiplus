package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes14.dex */
public final class t0 extends com.tencent.scanlib.ui.ScanView {

    /* renamed from: p1, reason: collision with root package name */
    public static final /* synthetic */ int f159982p1 = 0;
    public final float A;
    public int B;
    public boolean C;
    public byte[] D;
    public int E;
    public boolean F;
    public boolean G;
    public byte[] H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f159983J;
    public boolean K;
    public boolean L;
    public boolean M;
    public byte[] N;
    public int P;
    public com.tencent.mm.sdk.platformtools.b4 Q;
    public boolean R;
    public android.widget.RelativeLayout S;
    public android.widget.TextView T;
    public android.animation.AnimatorSet U;
    public int V;
    public int W;

    /* renamed from: l1, reason: collision with root package name */
    public final com.tencent.mm.plugin.scanner.view.t f159984l1;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f159985p;

    /* renamed from: p0, reason: collision with root package name */
    public int f159986p0;

    /* renamed from: q, reason: collision with root package name */
    public long f159987q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.Map f159988r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.view.u f159989s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f159990t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f159991u;

    /* renamed from: v, reason: collision with root package name */
    public ny4.d f159992v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f159993w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f159994x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f159995x0;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.ArrayList f159996y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f159997y0;

    /* renamed from: z, reason: collision with root package name */
    public final float f159998z;

    public t0(android.content.Context context) {
        super(context);
        this.f159985p = "MicroMsg.ScanPassportView";
        this.f159988r = kz5.q0.f314001d;
        this.f159994x = true;
        this.f159996y = new java.util.ArrayList();
        this.f159998z = 0.33f;
        this.A = 1.4394367f;
        this.E = Integer.MAX_VALUE;
        this.I = Integer.MAX_VALUE;
        this.P = Integer.MAX_VALUE;
        this.f159984l1 = new com.tencent.mm.plugin.scanner.view.t();
    }

    private final int getScreenOrientation() {
        java.lang.Object systemService = getContext().getSystemService("window");
        android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
        if (windowManager != null) {
            return windowManager.getDefaultDisplay().getRotation();
        }
        return 0;
    }

    public static final void l(com.tencent.mm.plugin.scanner.view.t0 t0Var) {
        com.tencent.mm.sdk.platformtools.b4 b4Var = t0Var.f159993w;
        if (b4Var != null) {
            b4Var.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = t0Var.f159983J;
        if (b4Var2 != null) {
            b4Var2.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var3 = t0Var.Q;
        if (b4Var3 != null) {
            b4Var3.d();
        }
        com.tencent.mm.plugin.scanner.view.u uVar = t0Var.f159989s;
        if (uVar != null) {
            com.tencent.mm.autogen.events.ScanPassportResultEvent scanPassportResultEvent = new com.tencent.mm.autogen.events.ScanPassportResultEvent();
            scanPassportResultEvent.f54733g.f8319a = 2;
            scanPassportResultEvent.e();
            ((com.tencent.mm.plugin.scanner.ui.p1) uVar).f159609a.finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final byte[] m(com.tencent.mm.plugin.scanner.view.t0 r26, ny4.c r27, java.nio.ByteBuffer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.view.t0.m(com.tencent.mm.plugin.scanner.view.t0, ny4.c, java.nio.ByteBuffer, int, int):byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean n(com.tencent.mm.plugin.scanner.view.t0 r2, ny4.c r3, int r4) {
        /*
            r2.getClass()
            r0 = 0
            if (r4 != 0) goto L7
            goto L38
        L7:
            ny4.b r1 = r3.f341448b
            if (r1 == 0) goto L20
            ny4.b r3 = r3.f341449c
            if (r3 == 0) goto L18
            float r3 = r2.s(r1, r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L19
        L18:
            r3 = 0
        L19:
            if (r3 == 0) goto L20
            float r3 = r3.floatValue()
            goto L21
        L20:
            r3 = 0
        L21:
            android.view.View r1 = r2.f159990t
            if (r1 == 0) goto L2a
            int r1 = r1.getHeight()
            goto L2b
        L2a:
            r1 = r0
        L2b:
            float r1 = (float) r1
            float r4 = (float) r4
            float r4 = r1 / r4
            float r3 = r3 * r4
            float r3 = r3 / r1
            float r2 = r2.f159998z
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L38
            r0 = 1
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.view.t0.n(com.tencent.mm.plugin.scanner.view.t0, ny4.c, int):boolean");
    }

    public static final void o(com.tencent.mm.plugin.scanner.view.t0 t0Var) {
        android.widget.TextView textView = t0Var.f159991u;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = t0Var.T;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        android.widget.RelativeLayout relativeLayout = t0Var.S;
        if (relativeLayout != null) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(relativeLayout, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(1000L);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(relativeLayout, "rotationX", 0.0f, 10.0f);
            ofFloat2.setDuration(2000L);
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(relativeLayout, "rotationX", 10.0f);
            ofFloat3.setDuration(1000L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3);
            t0Var.U = animatorSet;
            animatorSet.addListener(new com.tencent.mm.plugin.scanner.view.q0(t0Var, relativeLayout, animatorSet));
            animatorSet.start();
        }
    }

    public static final void p(com.tencent.mm.plugin.scanner.view.t0 t0Var) {
        t0Var.getClass();
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_passport_scan_lean_front_timeout_value, 10);
        com.tencent.mm.sdk.platformtools.b4 b4Var = t0Var.f159983J;
        if (b4Var != null) {
            long j17 = Ni * 1000;
            b4Var.c(j17, j17);
        }
    }

    public static final void q(com.tencent.mm.plugin.scanner.view.t0 t0Var, java.lang.String str) {
        t0Var.getClass();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a), null, null, new com.tencent.mm.plugin.scanner.view.s0(t0Var, str, null), 3, null);
    }

    private final void setupFixedScanFrame(android.view.View view) {
        android.widget.TextView textView;
        this.S = view != null ? (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.f485004q45) : null;
        int i17 = com.tencent.mm.ui.bl.b(getContext()).x;
        int i18 = com.tencent.mm.ui.bl.b(getContext()).y;
        android.widget.RelativeLayout relativeLayout = this.S;
        android.view.ViewGroup.LayoutParams layoutParams = relativeLayout != null ? relativeLayout.getLayoutParams() : null;
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        if (t()) {
            layoutParams2.width = i17 - i65.a.b(getContext(), 64);
            layoutParams2.height = (int) ((i17 - i65.a.b(getContext(), 64)) * 0.7d);
            layoutParams2.addRule(13);
        } else {
            int identifier = getResources().getIdentifier("navigation_bar_height", "dimen", com.eclipsesource.mmv8.Platform.ANDROID);
            int i19 = 0;
            int dimensionPixelSize = identifier > 0 ? getResources().getDimensionPixelSize(identifier) : 0;
            android.widget.TextView textView2 = this.f159991u;
            if (!(textView2 != null && textView2.getVisibility() == 0) ? (textView = this.T) != null : (textView = this.f159991u) != null) {
                i19 = textView.getMeasuredHeight();
            }
            layoutParams2.height = ((i18 - i19) - dimensionPixelSize) - i65.a.b(getContext(), 72);
            layoutParams2.width = (int) ((r1 - i65.a.b(getContext(), 72)) / 0.7d);
            layoutParams2.removeRule(13);
            layoutParams2.addRule(14);
            layoutParams2.topMargin = i65.a.b(getContext(), 56) + i19;
        }
        android.widget.RelativeLayout relativeLayout2 = this.S;
        if (relativeLayout2 == null) {
            return;
        }
        relativeLayout2.setLayoutParams(layoutParams2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.CharSequence] */
    private final void setupScanTv(android.view.View view) {
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f487100ni2) : null;
        this.f159991u = textView;
        if (textView != null) {
            textView.setShadowLayer(3.0f, 0.0f, 0.0f, -16777216);
        }
        android.widget.TextView textView2 = this.f159991u;
        if (textView2 != null) {
            textView2.setTextSize(22.0f);
        }
        java.util.Map map = this.f159988r;
        java.lang.String str = map != null ? (java.lang.String) map.get("center_of_screen") : null;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        java.lang.String str2 = str;
        if (K0) {
            str2 = getContext().getResources().getString(com.tencent.mm.R.string.f493658n36);
        }
        android.widget.TextView textView3 = this.f159991u;
        java.lang.String str3 = str2;
        if (com.tencent.mm.sdk.platformtools.t8.J0(textView3 != null ? textView3.getText() : null)) {
            android.widget.TextView textView4 = this.f159991u;
            str3 = textView4 != null ? textView4.getText() : null;
        }
        android.widget.TextView textView5 = this.f159991u;
        if (textView5 != null) {
            textView5.setText(str3);
        }
        android.widget.TextView textView6 = this.f159991u;
        com.tencent.mm.ui.bk.r0(textView6 != null ? textView6.getPaint() : null, 0.8f);
        android.widget.TextView textView7 = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.r_o) : null;
        this.T = textView7;
        if (textView7 != null) {
            textView7.setShadowLayer(3.0f, 0.0f, 0.0f, -16777216);
        }
        android.widget.TextView textView8 = this.T;
        if (textView8 != null) {
            textView8.setTextSize(22.0f);
        }
        android.widget.TextView textView9 = this.T;
        com.tencent.mm.ui.bk.r0(textView9 != null ? textView9.getPaint() : null, 0.8f);
        android.widget.TextView textView10 = this.T;
        if (textView10 != null) {
            textView10.setVisibility(8);
        }
        android.widget.TextView textView11 = this.f159991u;
        android.view.ViewGroup.LayoutParams layoutParams = textView11 != null ? textView11.getLayoutParams() : null;
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        if (t()) {
            layoutParams2.topMargin = i65.a.b(getContext(), 160);
        } else {
            layoutParams2.topMargin = i65.a.b(getContext(), 24);
        }
        android.widget.TextView textView12 = this.f159991u;
        if (textView12 != null) {
            textView12.setLayoutParams(layoutParams2);
        }
        android.widget.TextView textView13 = this.T;
        if (textView13 == null) {
            return;
        }
        textView13.setLayoutParams(layoutParams2);
    }

    @Override // com.tencent.scanlib.ui.ScanView
    public void b() {
        this.f215302e = new xy3.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x01b8, code lost:
    
        if (r1 != false) goto L65;
     */
    @Override // com.tencent.scanlib.ui.ScanView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.view.t0.d():void");
    }

    @Override // com.tencent.scanlib.ui.ScanView
    public void e() {
        super.e();
        yy3.f.f468467m.d(this.f159987q);
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f159993w;
        if (b4Var != null) {
            b4Var.d();
        }
    }

    @Override // com.tencent.scanlib.ui.ScanView
    public void f() {
        super.f();
        if (!((qt5.c) this.f215302e).f366657b) {
            g(new com.tencent.mm.plugin.scanner.view.l0(this));
        } else if (((qt5.c) this.f215302e).f366658c) {
            k(0L);
        } else {
            i(new com.tencent.mm.plugin.scanner.view.m0(this));
        }
        z();
        this.C = true;
    }

    public final long getCurSession() {
        return this.f159987q;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getScanDetailMsgMap() {
        return this.f159988r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.graphics.Point point = new android.graphics.Point();
        getDisplay().getSize(point);
        com.tencent.mars.xlog.Log.i(this.f159985p, "screenSize %s", point);
    }

    @Override // com.tencent.scanlib.ui.ScanView, android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z17, android.hardware.Camera camera) {
        com.tencent.mars.xlog.Log.i(this.f159985p, "onAutoFocus %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            k(0L);
        }
        c(1000);
    }

    @Override // com.tencent.scanlib.ui.ScanView, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setupScanTv(this.f159990t);
        setupFixedScanFrame(this.f159990t);
    }

    @Override // com.tencent.scanlib.ui.ScanView, android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        byte[] bArr2;
        boolean z17;
        byte[] bArr3;
        int i17;
        android.hardware.Camera.Parameters parameters;
        android.hardware.Camera.Size previewSize;
        android.hardware.Camera.Parameters parameters2;
        android.hardware.Camera.Size previewSize2;
        android.hardware.Camera.Parameters parameters3;
        android.hardware.Camera.Size previewSize3;
        android.hardware.Camera.Parameters parameters4;
        android.hardware.Camera.Size previewSize4;
        android.hardware.Camera.Parameters parameters5;
        android.hardware.Camera.Size previewSize5;
        android.hardware.Camera.Parameters parameters6;
        android.hardware.Camera.Size previewSize6;
        byte[] bArr4 = bArr;
        this.f215305h = 0L;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPreviewFrame null data:");
        sb6.append(bArr4 == null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f159985p;
        com.tencent.mars.xlog.Log.i(str, sb7);
        if (bArr4 != null && bArr4.length == 0) {
            com.tencent.mars.xlog.Log.i(str, "onPreviewFrame empty data:");
            return;
        }
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f310116d = (camera == null || (parameters6 = camera.getParameters()) == null || (previewSize6 = parameters6.getPreviewSize()) == null) ? 0 : previewSize6.width;
        kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
        f0Var2.f310116d = (camera == null || (parameters5 = camera.getParameters()) == null || (previewSize5 = parameters5.getPreviewSize()) == null) ? 0 : previewSize5.height;
        int screenOrientation = getScreenOrientation();
        if (bArr4 != null) {
            if (screenOrientation == 0) {
                bArr4 = y(bArr4, f0Var.f310116d, f0Var2.f310116d, 90);
                f0Var.f310116d = (camera == null || (parameters2 = camera.getParameters()) == null || (previewSize2 = parameters2.getPreviewSize()) == null) ? 0 : previewSize2.height;
                f0Var2.f310116d = (camera == null || (parameters = camera.getParameters()) == null || (previewSize = parameters.getPreviewSize()) == null) ? 0 : previewSize.width;
            } else if (screenOrientation != 2) {
                if (screenOrientation == 3) {
                    bArr4 = y(bArr4, f0Var.f310116d, f0Var2.f310116d, 180);
                }
                z17 = false;
                bArr2 = bArr4;
            } else {
                bArr4 = y(bArr4, f0Var.f310116d, f0Var2.f310116d, 270);
                f0Var.f310116d = (camera == null || (parameters4 = camera.getParameters()) == null || (previewSize4 = parameters4.getPreviewSize()) == null) ? 0 : previewSize4.height;
                f0Var2.f310116d = (camera == null || (parameters3 = camera.getParameters()) == null || (previewSize3 = parameters3.getPreviewSize()) == null) ? 0 : previewSize3.width;
            }
            z17 = true;
            bArr2 = bArr4;
        } else {
            bArr2 = bArr4;
            z17 = false;
        }
        if (camera != null) {
            android.hardware.Camera.Size previewSize7 = camera.getParameters().getPreviewSize();
            int i18 = previewSize7.width;
            int i19 = previewSize7.height;
            if (z17) {
                i17 = i18;
            } else {
                i17 = i19;
                i19 = i18;
            }
            android.graphics.YuvImage yuvImage = new android.graphics.YuvImage(bArr2, 17, i19, i17, null);
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            yuvImage.compressToJpeg(new android.graphics.Rect(0, 0, i19, i17), 80, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int length = byteArray.length;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(length));
            arrayList.add(0);
            arrayList.add(byteArray);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/scanner/view/ScanPassportView", "toRGB", "([BLandroid/hardware/Camera;Z)[B", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
            yj0.a.e(obj, decodeByteArray, "com/tencent/mm/plugin/scanner/view/ScanPassportView", "toRGB", "([BLandroid/hardware/Camera;Z)[B", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(decodeByteArray.getByteCount());
            decodeByteArray.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            bArr3 = new byte[(array.length / 4) * 3];
            int a17 = sz5.b.a(0, array.length - 1, 4);
            if (a17 >= 0) {
                int i27 = 0;
                int i28 = 0;
                while (true) {
                    int i29 = i27 + 1;
                    bArr3[i27] = array[i28];
                    int i37 = i29 + 1;
                    bArr3[i29] = array[i28 + 1];
                    int i38 = i37 + 1;
                    bArr3[i37] = array[i28 + 2];
                    if (i28 == a17) {
                        break;
                    }
                    i28 += 4;
                    i27 = i38;
                }
            }
        } else {
            bArr3 = null;
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bArr3 != null ? bArr3.length : 0);
        kotlin.jvm.internal.o.f(allocateDirect, "allocateDirect(...)");
        if (bArr3 != null) {
            allocateDirect.put(bArr3);
        }
        allocateDirect.flip();
        com.tencent.mm.plugin.scanner.view.g0 g0Var = new com.tencent.mm.plugin.scanner.view.g0(this, allocateDirect, f0Var2, f0Var);
        this.B++;
        g0Var.run();
        k(0L);
        if (this.B % 10 == 9) {
            ((qt5.c) this.f215302e).j("auto");
            c(100L);
        }
    }

    public final float r(java.util.ArrayList arrayList) {
        java.lang.Float f17;
        java.util.Iterator it = arrayList.iterator();
        double d17 = 0.0d;
        while (it.hasNext()) {
            d17 += ((ny4.b) it.next()) != null ? r5.f341445a : 0.0d;
        }
        java.util.Iterator it6 = arrayList.iterator();
        double d18 = 0.0d;
        while (it6.hasNext()) {
            d18 += ((ny4.b) it6.next()) != null ? r7.f341446b : 0.0d;
        }
        float size = (float) (d17 / arrayList.size());
        float size2 = (float) (d18 / arrayList.size());
        java.util.Iterator it7 = arrayList.iterator();
        float f18 = 0.0f;
        while (it7.hasNext()) {
            if (((ny4.b) it7.next()) != null) {
                double d19 = 2;
                f17 = java.lang.Float.valueOf((float) java.lang.Math.sqrt(((float) java.lang.Math.pow(r5.f341445a - size, d19)) + ((float) java.lang.Math.pow(r5.f341446b - size2, d19))));
            } else {
                f17 = null;
            }
            f18 += f17 != null ? f17.floatValue() : 0.0f;
        }
        return f18 / arrayList.size();
    }

    public final float s(ny4.b bVar, ny4.b bVar2) {
        double d17 = 2;
        return (float) java.lang.Math.sqrt(((float) java.lang.Math.pow(bVar2.f341445a - bVar.f341445a, d17)) + ((float) java.lang.Math.pow(bVar2.f341446b - bVar.f341446b, d17)));
    }

    public final void setCurSession(long j17) {
        this.f159987q = j17;
    }

    public final void setScanCallback(com.tencent.mm.plugin.scanner.view.u uVar) {
        this.f159989s = uVar;
    }

    public final void setScanDetailMsgMap(java.util.Map<java.lang.String, java.lang.String> map) {
        this.f159988r = map;
    }

    public final boolean t() {
        return getScreenOrientation() == 0 || getScreenOrientation() == 2;
    }

    public void u() {
        com.tencent.stubs.logger.Log.i("ScanView", "onDestroy");
        this.f215301d.setSurfaceTextureListener(null);
    }

    public final void v() {
        com.tencent.mm.ui.widget.dialog.j0 E = db5.e1.E(getContext(), getContext().getString(com.tencent.mm.R.string.n38), "", getContext().getString(com.tencent.mm.R.string.n37), false, new com.tencent.mm.plugin.scanner.view.f0(this));
        if (E != null) {
            E.setCanceledOnTouchOutside(false);
        }
    }

    public void w() {
        com.tencent.stubs.logger.Log.i("ScanView", "onStop");
        a();
        uo.n.f429522a.b();
        ny4.d dVar = this.f159992v;
        if (dVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WCPayScanpassportManager", "release");
            com.tencent.wevision2.modules.ocr.CertificateDetector certificateDetector = dVar.f341455a;
            if (certificateDetector != null) {
                certificateDetector.destroy();
                dVar.f341455a = null;
            }
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f159993w;
        if (b4Var != null) {
            b4Var.d();
        }
    }

    public final void x(int i17) {
        android.os.Bundle bundle = new android.os.Bundle();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        bundle.putInt("scan_detail", i17);
        bundle.putLong("scan_time", currentTimeMillis);
        bundle.putInt("is_vertical_screen", t() ? 1 : 2);
        if (this.f159989s != null) {
            long j17 = this.f159987q;
            com.tencent.mm.autogen.events.ScanPassportResultEvent scanPassportResultEvent = new com.tencent.mm.autogen.events.ScanPassportResultEvent();
            am.ws wsVar = scanPassportResultEvent.f54733g;
            wsVar.f8319a = 3;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("scan_detail", java.lang.Integer.valueOf(bundle.getInt("scan_detail")));
            jSONObject.put("scan_time", java.lang.Long.valueOf(bundle.getLong("scan_time")));
            jSONObject.put("scan_session_id", java.lang.String.valueOf(j17));
            jSONObject.put("is_vertical_screen", java.lang.Integer.valueOf(bundle.getInt("is_vertical_screen")));
            wsVar.f8320b = jSONObject.toString();
            scanPassportResultEvent.e();
        }
    }

    public final byte[] y(byte[] nv21Data, int i17, int i18, int i19) {
        int i27;
        int i28;
        kotlin.jvm.internal.o.g(nv21Data, "nv21Data");
        int i29 = i17 * i18;
        if (i19 != 90) {
            if (i19 == 180) {
                byte[] bArr = new byte[nv21Data.length];
                for (int i37 = 0; i37 < i18; i37++) {
                    for (int i38 = 0; i38 < i17; i38++) {
                        bArr[(((i18 - i37) - 1) * i17) + ((i17 - i38) - 1)] = nv21Data[(i37 * i17) + i38];
                    }
                }
                int i39 = i18 / 2;
                for (int i47 = 0; i47 < i39; i47++) {
                    int i48 = i17 / 2;
                    for (int i49 = 0; i49 < i48; i49++) {
                        int i57 = (i47 * i17) + (i49 * 2);
                        int i58 = (((i39 - i47) - 1) * i17) + ((i17 - r10) - 2);
                        bArr[i29 + i58] = nv21Data[i29 + i57];
                        bArr[i58 + 1 + i29] = nv21Data[i57 + 1 + i29];
                    }
                }
                return bArr;
            }
            if (i19 != 270) {
                throw new java.lang.IllegalArgumentException("Rotation degrees must be 90, 180, or 270");
            }
        }
        byte[] bArr2 = new byte[nv21Data.length];
        for (int i59 = 0; i59 < i18; i59++) {
            for (int i66 = 0; i66 < i17; i66++) {
                bArr2[i19 == 90 ? (i66 * i18) + ((i18 - i59) - 1) : (((i17 - i66) - 1) * i18) + i59] = nv21Data[(i59 * i17) + i66];
            }
        }
        int i67 = i18 / 2;
        for (int i68 = 0; i68 < i67; i68++) {
            int i69 = i17 / 2;
            for (int i76 = 0; i76 < i69; i76++) {
                int i77 = (i68 * i17) + (i76 * 2);
                int i78 = i29 + i77;
                int i79 = i77 + 1 + i29;
                if (i19 == 90) {
                    i27 = i76 * i18;
                    i28 = (i18 - (i68 * 2)) - 2;
                } else {
                    i27 = ((i17 - r13) - 2) * i18;
                    i28 = i68 * 2;
                }
                int i86 = i27 + i28 + i29;
                bArr2[i86] = nv21Data[i78];
                bArr2[i86 + 1] = nv21Data[i79];
            }
        }
        return bArr2;
    }

    public final void z() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_passport_scan_image_timeout_value, 10);
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f159993w;
        if (b4Var != null) {
            long j17 = Ni * 1000;
            b4Var.c(j17, j17);
        }
    }
}
