package yx0;

/* loaded from: classes5.dex */
public final class b8 implements yt3.r2 {

    /* renamed from: c2, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f467171c2;

    /* renamed from: d2, reason: collision with root package name */
    public static final java.util.concurrent.locks.Condition f467172d2;

    /* renamed from: e2, reason: collision with root package name */
    public static final com.tencent.maas.camstudio.MJCamLyricsStyle f467173e2;
    public volatile java.lang.String A;
    public com.tencent.maas.model.time.MJTime A1;
    public final jz5.g B;
    public volatile int B1;
    public final jz5.g C;
    public java.lang.String C1;
    public final jz5.g D;
    public volatile long D1;
    public final jz5.g E;
    public volatile long E1;
    public final jz5.g F;
    public volatile boolean F1;
    public final com.tencent.maas.camstudio.d0 G;
    public volatile boolean G1;
    public final jz5.g H;
    public volatile boolean H1;
    public boolean I;
    public boolean I1;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.maas.camstudio.a0 f467174J;
    public volatile xx0.i J1;
    public volatile pp0.p0 K;
    public volatile boolean K1;
    public final kotlinx.coroutines.y0 L;
    public java.lang.Long L1;
    public final kotlinx.coroutines.y0 M;
    public java.lang.Long M1;
    public final java.lang.Object N;
    public volatile r45.q23 N1;
    public volatile java.lang.String O1;
    public final java.util.HashMap P;
    public volatile mx0.q3 P1;
    public volatile com.tencent.maas.camstudio.MJCamTemplateInfo Q;
    public int Q1;
    public volatile boolean R;
    public final jz5.g R1;
    public volatile rx0.h S;
    public final tx0.k S1;
    public volatile com.tencent.maas.camstudio.MJCamMusicDesc T;
    public yz5.l T1;
    public volatile yx0.u U;
    public yz5.p U1;
    public com.tencent.maas.camstudio.MJBeautyAdjustmentDesc V;
    public volatile com.tencent.maas.model.time.MJTime V1;
    public nx0.j2 W;
    public final yx0.q W1;
    public nx0.y X;
    public mx0.e1 X1;
    public nx0.c3 Y;
    public kotlinx.coroutines.r2 Y1;
    public nx0.s1 Z;
    public us2.c Z1;

    /* renamed from: a2, reason: collision with root package name */
    public android.view.SurfaceView f467175a2;

    /* renamed from: b2, reason: collision with root package name */
    public java.lang.String f467176b2;

    /* renamed from: d, reason: collision with root package name */
    public final mx0.z f467177d;

    /* renamed from: e, reason: collision with root package name */
    public final mx0.p3 f467178e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f467179f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f467180g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.p f467181h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f467182i;

    /* renamed from: l1, reason: collision with root package name */
    public ux0.d f467183l1;

    /* renamed from: m, reason: collision with root package name */
    public yz5.p f467184m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.r f467185n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.l f467186o;

    /* renamed from: p, reason: collision with root package name */
    public volatile yz5.p f467187p;

    /* renamed from: p0, reason: collision with root package name */
    public yx0.n f467188p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f467189p1;

    /* renamed from: q, reason: collision with root package name */
    public volatile yz5.l f467190q;

    /* renamed from: r, reason: collision with root package name */
    public volatile yz5.l f467191r;

    /* renamed from: s, reason: collision with root package name */
    public volatile yx0.v f467192s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f467193t;

    /* renamed from: u, reason: collision with root package name */
    public volatile kotlinx.coroutines.r2 f467194u;

    /* renamed from: v, reason: collision with root package name */
    public volatile kotlinx.coroutines.r2 f467195v;

    /* renamed from: w, reason: collision with root package name */
    public volatile kotlinx.coroutines.r2 f467196w;

    /* renamed from: x, reason: collision with root package name */
    public final androidx.lifecycle.j0 f467197x;

    /* renamed from: x0, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f467198x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f467199x1;

    /* renamed from: y, reason: collision with root package name */
    public final androidx.lifecycle.g0 f467200y;

    /* renamed from: y0, reason: collision with root package name */
    public final rx0.i f467201y0;

    /* renamed from: y1, reason: collision with root package name */
    public hu3.s0 f467202y1;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f467203z;

    /* renamed from: z1, reason: collision with root package name */
    public final yx0.c8 f467204z1;

    static {
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        f467171c2 = reentrantLock;
        f467172d2 = reentrantLock.newCondition();
        f467173e2 = new com.tencent.maas.camstudio.MJCamLyricsStyle("publisher_text_389", new com.tencent.maas.model.MJSpatialInfo(1.0f, 0.0f, new com.tencent.maas.base.Vec2(0.5f, 0.2f)));
    }

    public b8(android.view.ViewGroup parent, mx0.z controller, mx0.p3 p3Var) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f467177d = controller;
        this.f467178e = p3Var;
        this.f467179f = new java.lang.ref.WeakReference(parent);
        this.f467192s = yx0.v.f467693d;
        this.f467193t = new java.util.concurrent.locks.ReentrantLock();
        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0();
        this.f467197x = j0Var;
        this.f467200y = j0Var;
        this.f467203z = jz5.h.b(new yx0.z(this));
        this.B = jz5.h.b(new yx0.f2(this));
        this.C = jz5.h.b(new yx0.l0(this));
        this.D = jz5.h.b(new yx0.k0(this));
        this.E = jz5.h.b(new yx0.y(this));
        this.F = jz5.h.b(new yx0.x(this));
        this.G = new yx0.b0(this);
        this.H = jz5.h.b(new yx0.f0(this));
        this.f467174J = new yx0.d0(this);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
        kotlinx.coroutines.y0 a17 = kotlinx.coroutines.z0.a(p0Var.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        this.L = a17;
        this.M = kotlinx.coroutines.z0.a(p0Var.J(1).plus(kotlinx.coroutines.t3.a(null, 1, null)));
        this.N = new java.lang.Object();
        this.P = new java.util.HashMap();
        this.R = true;
        this.S = rx0.g.f400927a;
        this.U = yx0.r.f467598a;
        this.V = new com.tencent.maas.camstudio.MJBeautyAdjustmentDesc();
        nx0.j2 j2Var = nx0.j2.f341143b;
        this.W = nx0.j2.f341143b;
        nx0.y yVar = nx0.y.f341264b;
        this.X = nx0.y.f341264b;
        nx0.c3 c3Var = nx0.c3.f341087b;
        this.Y = nx0.c3.f341087b;
        nx0.s1 s1Var = nx0.s1.f341222b;
        this.Z = nx0.s1.f341222b;
        this.f467188p0 = yx0.n.f467462d;
        this.f467201y0 = new rx0.i(null, null, 0, 0, 0, 31, null);
        this.f467204z1 = new yx0.c8();
        this.B1 = 2;
        this.C1 = "";
        this.G1 = true;
        this.H1 = true;
        this.I1 = true;
        this.R1 = jz5.h.b(yx0.q3.f467576d);
        this.S1 = new tx0.k(a17);
        this.V1 = new com.tencent.maas.model.time.MJTime();
        this.W1 = new yx0.q(this);
        this.f467176b2 = "";
    }

    public static android.graphics.Bitmap K(yx0.b8 b8Var, android.view.SurfaceView surfaceView, long j17, int i17, java.lang.Object obj) {
        android.view.SurfaceView surfaceView2 = (i17 & 1) != 0 ? b8Var.f467175a2 : surfaceView;
        long j18 = (i17 & 2) != 0 ? 2000L : j17;
        b8Var.getClass();
        android.graphics.Bitmap bitmap = null;
        if (surfaceView2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "getCurRenderViewSnapshot start");
            android.view.SurfaceHolder holder = surfaceView2.getHolder();
            android.view.Surface surface = holder.getSurface();
            kotlin.jvm.internal.o.f(surface, "getSurface(...)");
            if (surface.isValid()) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(surfaceView2.getWidth());
                if (!(valueOf.intValue() > 0)) {
                    valueOf = null;
                }
                int intValue = valueOf != null ? valueOf.intValue() : holder.getSurfaceFrame().width();
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(surfaceView2.getHeight());
                if (!(valueOf2.intValue() > 0)) {
                    valueOf2 = null;
                }
                int intValue2 = valueOf2 != null ? valueOf2.intValue() : holder.getSurfaceFrame().height();
                if (intValue > 0 && intValue2 > 0) {
                    android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(config);
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(intValue2));
                    arrayList.add(java.lang.Integer.valueOf(intValue));
                    java.lang.Object obj2 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/viewmodel/CorePlugin", "getCurRenderViewSnapshot", "(Landroid/view/SurfaceView;J)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                    yj0.a.e(obj2, createBitmap, "com/tencent/mm/mj_publisher/finder/shoot_composing/viewmodel/CorePlugin", "getCurRenderViewSnapshot", "(Landroid/view/SurfaceView;J)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
                    android.os.HandlerThread handlerThread = new android.os.HandlerThread("PixelCopyThread-" + java.lang.System.identityHashCode(surfaceView2));
                    handlerThread.start();
                    android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
                    java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
                    kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
                    f0Var.f310116d = 1;
                    try {
                        android.view.PixelCopy.request(surface, createBitmap, new yx0.i2(f0Var, countDownLatch), handler);
                        if (countDownLatch.await(j18, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                            if (f0Var.f310116d == 0) {
                                bitmap = createBitmap;
                            }
                        }
                    } catch (java.lang.Exception unused) {
                    } catch (java.lang.Throwable th6) {
                        try {
                            handlerThread.quitSafely();
                        } catch (java.lang.Throwable unused2) {
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "getCurRenderViewSnapshot end");
                        throw th6;
                    }
                    try {
                        handlerThread.quitSafely();
                    } catch (java.lang.Throwable unused3) {
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "getCurRenderViewSnapshot end");
                }
            }
        }
        return bitmap;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(2:10|11)(2:23|24))(3:25|26|(2:28|(2:30|(2:32|33)))(1:34))|12|13|(2:15|(1:17)(1:18))|19|20))|37|6|7|(0)(0)|12|13|(0)|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006e, code lost:
    
        r5 = kotlin.Result.INSTANCE;
        r4 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(yx0.b8 r4, kotlinx.coroutines.r2 r5, java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof yx0.g0
            if (r0 == 0) goto L16
            r0 = r7
            yx0.g0 r0 = (yx0.g0) r0
            int r1 = r0.f467321h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f467321h = r1
            goto L1b
        L16:
            yx0.g0 r0 = new yx0.g0
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r4 = r0.f467319f
            pz5.a r7 = pz5.a.f359186d
            int r1 = r0.f467321h
            r2 = 1
            java.lang.String r3 = "MicroMsg.ShootComposingCorePlugin"
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L34
            java.lang.Object r5 = r0.f467318e
            kotlinx.coroutines.r2 r5 = (kotlinx.coroutines.r2) r5
            java.lang.Object r6 = r0.f467317d
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r4)     // Catch: java.lang.Throwable -> L6d
            goto L68
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            kotlin.ResultKt.throwOnFailure(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "cancelAndJoinSafely begin "
            r4.<init>(r1)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.mars.xlog.Log.i(r3, r4)
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L6d
            if (r5 == 0) goto L67
            boolean r4 = r5.a()     // Catch: java.lang.Throwable -> L6d
            if (r4 == 0) goto L68
            r0.f467317d = r6     // Catch: java.lang.Throwable -> L6d
            r0.f467318e = r5     // Catch: java.lang.Throwable -> L6d
            r0.f467321h = r2     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r4 = kotlinx.coroutines.v2.d(r5, r0)     // Catch: java.lang.Throwable -> L6d
            if (r4 != r7) goto L68
            goto Lc5
        L67:
            r5 = 0
        L68:
            java.lang.Object r4 = kotlin.Result.m521constructorimpl(r5)     // Catch: java.lang.Throwable -> L6d
            goto L78
        L6d:
            r4 = move-exception
            kotlin.Result$Companion r5 = kotlin.Result.INSTANCE
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)
            java.lang.Object r4 = kotlin.Result.m521constructorimpl(r4)
        L78:
            java.lang.Throwable r4 = kotlin.Result.m524exceptionOrNullimpl(r4)
            if (r4 == 0) goto Lb2
            boolean r5 = r4 instanceof java.util.concurrent.CancellationException
            if (r5 == 0) goto L97
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            java.lang.String r5 = " cancelAndJoinSafely"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.mars.xlog.Log.i(r3, r4)
            goto Lb2
        L97:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            java.lang.String r7 = " cancelAndJoinSafely error: "
            r5.append(r7)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.tencent.mars.xlog.Log.e(r3, r4)
        Lb2:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "cancelAndJoinSafely end "
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.mars.xlog.Log.i(r3, r4)
            jz5.f0 r7 = jz5.f0.f302826a
        Lc5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.a(yx0.b8, kotlinx.coroutines.r2, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|(2:3|(15:5|6|7|(1:(1:(1:(1:(7:13|14|15|16|(1:18)|19|20)(2:23|24))(9:25|26|27|(2:29|30)|15|16|(0)|19|20))(11:31|32|33|(2:35|36)|27|(0)|15|16|(0)|19|20))(2:37|38))(3:45|46|(3:(1:51)|52|(2:54|55)))|39|(2:41|(2:43|44))|33|(0)|27|(0)|15|16|(0)|19|20))|58|6|7|(0)(0)|39|(0)|33|(0)|27|(0)|15|16|(0)|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0123, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0124, code lost:
    
        r2 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5 A[Catch: all -> 0x0123, TryCatch #0 {all -> 0x0123, blocks: (B:14:0x0041, B:15:0x011e, B:26:0x0057, B:27:0x0106, B:32:0x0065, B:33:0x00ed, B:38:0x0073, B:39:0x00cf, B:41:0x00d5, B:46:0x008b, B:48:0x0091, B:51:0x0099, B:52:0x00bf), top: B:7:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(yx0.b8 r16, java.lang.String r17, boolean r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.b(yx0.b8, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final java.lang.String c(yx0.b8 b8Var, com.tencent.maas.camerafun.MJRecordingFinishInfo mJRecordingFinishInfo, yx0.w wVar) {
        r45.to0 to0Var;
        java.lang.String str;
        android.content.res.Resources resources;
        android.content.res.Resources resources2;
        rx0.h hVar = b8Var.S;
        rx0.f fVar = hVar instanceof rx0.f ? (rx0.f) hVar : null;
        if (fVar == null || (to0Var = fVar.f400923h) == null || !b8Var.Y(mJRecordingFinishInfo, wVar)) {
            return null;
        }
        if (wVar == yx0.w.f467725d) {
            str = to0Var.f386626g;
            if (str == null) {
                android.content.Context J2 = b8Var.J();
                if (J2 == null || (resources2 = J2.getResources()) == null) {
                    return null;
                }
                return resources2.getString(com.tencent.mm.R.string.p_r);
            }
        } else {
            str = to0Var.f386625f;
            if (str == null) {
                android.content.Context J3 = b8Var.J();
                if (J3 == null || (resources = J3.getResources()) == null) {
                    return null;
                }
                return resources.getString(com.tencent.mm.R.string.p_s);
            }
        }
        return str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|8))|139|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0036, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x015a, code lost:
    
        r11 = kotlin.Result.INSTANCE;
        r10 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x004b, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01ad, code lost:
    
        r11 = kotlin.Result.INSTANCE;
        r10 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r10));
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0026. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031 A[Catch: all -> 0x0036, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0036, blocks: (B:12:0x0031, B:13:0x0155, B:27:0x0143), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0143 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #2 {all -> 0x0036, blocks: (B:12:0x0031, B:13:0x0155, B:27:0x0143), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0046 A[Catch: all -> 0x004b, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x004b, blocks: (B:34:0x0046, B:35:0x01a8, B:47:0x0197), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0197 A[Catch: all -> 0x004b, TRY_ENTER, TryCatch #4 {all -> 0x004b, blocks: (B:34:0x0046, B:35:0x01a8, B:47:0x0197), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x01d8 -> B:51:0x01e4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0208 -> B:49:0x020d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(yx0.b8 r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.d(yx0.b8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02fe A[Catch: all -> 0x02e0, TryCatch #0 {all -> 0x02e0, blocks: (B:65:0x03a9, B:66:0x03fe, B:70:0x03d3, B:71:0x03f3, B:82:0x0324, B:87:0x0347, B:91:0x0352, B:93:0x0356, B:94:0x035a, B:96:0x0360, B:113:0x02fe, B:156:0x02bf), top: B:155:0x02bf }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03a9 A[Catch: all -> 0x02e0, TRY_ENTER, TryCatch #0 {all -> 0x02e0, blocks: (B:65:0x03a9, B:66:0x03fe, B:70:0x03d3, B:71:0x03f3, B:82:0x0324, B:87:0x0347, B:91:0x0352, B:93:0x0356, B:94:0x035a, B:96:0x0360, B:113:0x02fe, B:156:0x02bf), top: B:155:0x02bf }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03d3 A[Catch: all -> 0x02e0, TryCatch #0 {all -> 0x02e0, blocks: (B:65:0x03a9, B:66:0x03fe, B:70:0x03d3, B:71:0x03f3, B:82:0x0324, B:87:0x0347, B:91:0x0352, B:93:0x0356, B:94:0x035a, B:96:0x0360, B:113:0x02fe, B:156:0x02bf), top: B:155:0x02bf }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0352 A[Catch: all -> 0x02e0, TryCatch #0 {all -> 0x02e0, blocks: (B:65:0x03a9, B:66:0x03fe, B:70:0x03d3, B:71:0x03f3, B:82:0x0324, B:87:0x0347, B:91:0x0352, B:93:0x0356, B:94:0x035a, B:96:0x0360, B:113:0x02fe, B:156:0x02bf), top: B:155:0x02bf }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(yx0.b8 r36, pp0.p0 r37, java.lang.String r38, long r39, int r41, long r42, com.tencent.mm.protobuf.g r44, int r45, bs0.h r46, boolean r47, boolean r48, java.util.List r49, kotlin.coroutines.Continuation r50) {
        /*
            Method dump skipped, instructions count: 1199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.e(yx0.b8, pp0.p0, java.lang.String, long, int, long, com.tencent.mm.protobuf.g, int, bs0.h, boolean, boolean, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(yx0.b8 r22, bs0.h r23, java.util.List r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.f(yx0.b8, bs0.h, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final long g(yx0.b8 b8Var) {
        b8Var.getClass();
        int i17 = s26.a.f402368f;
        return s26.c.d(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.c0.clicfg_finder_maas_mj_aigc_timeout, 30.0f), s26.d.f402372g);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(yx0.b8 r9, kotlin.coroutines.Continuation r10) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof yx0.q2
            if (r0 == 0) goto L16
            r0 = r10
            yx0.q2 r0 = (yx0.q2) r0
            int r1 = r0.f467575h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f467575h = r1
            goto L1b
        L16:
            yx0.q2 r0 = new yx0.q2
            r0.<init>(r9, r10)
        L1b:
            java.lang.Object r9 = r0.f467573f
            pz5.a r10 = pz5.a.f359186d
            int r1 = r0.f467575h
            r2 = 0
            java.lang.Class<com.tencent.mm.udr.e0> r3 = com.tencent.mm.udr.e0.class
            r4 = 1
            java.lang.String r5 = "MicroMsg.ShootComposingCorePlugin"
            if (r1 == 0) goto L3f
            if (r1 != r4) goto L37
            java.lang.Object r10 = r0.f467572e
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r0 = r0.f467571d
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L93
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            kotlin.ResultKt.throwOnFailure(r9)
            i95.m r9 = i95.n0.c(r3)
            com.tencent.mm.udr.e0 r9 = (com.tencent.mm.udr.e0) r9
            com.tencent.mm.udr.a1 r9 = (com.tencent.mm.udr.a1) r9
            java.lang.String r1 = "ilinkres_d7d2cdfe"
            java.lang.String r6 = "weslam"
            com.tencent.wechat.aff.udr.x r9 = r9.Ui(r1, r6)
            if (r9 == 0) goto L78
            java.lang.String r7 = r9.getPath()
            boolean r7 = com.tencent.mm.vfs.w6.j(r7)
            if (r7 == 0) goto L78
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "weslam path: "
            r10.<init>(r0)
            java.lang.String r0 = r9.getPath()
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.tencent.mars.xlog.Log.i(r5, r10)
            java.lang.String r10 = r9.getPath()
            goto Lcc
        L78:
            java.lang.String r9 = "weslam not found, will check"
            com.tencent.mars.xlog.Log.w(r5, r9)
            yx0.s2 r9 = new yx0.s2
            r9.<init>(r1, r6, r2)
            r0.f467571d = r1
            r0.f467572e = r6
            r0.f467575h = r4
            r7 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r9 = kotlinx.coroutines.a4.c(r7, r9, r0)
            if (r9 != r10) goto L91
            goto Lcc
        L91:
            r0 = r1
            r10 = r6
        L93:
            i95.m r9 = i95.n0.c(r3)
            com.tencent.mm.udr.e0 r9 = (com.tencent.mm.udr.e0) r9
            com.tencent.mm.udr.a1 r9 = (com.tencent.mm.udr.a1) r9
            com.tencent.wechat.aff.udr.x r9 = r9.Ui(r0, r10)
            if (r9 == 0) goto Lc6
            java.lang.String r10 = r9.getPath()
            boolean r10 = com.tencent.mm.vfs.w6.j(r10)
            if (r10 == 0) goto Lc6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "weslam, check get path: "
            r10.<init>(r0)
            java.lang.String r0 = r9.getPath()
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.tencent.mars.xlog.Log.i(r5, r10)
            java.lang.String r9 = r9.getPath()
            r10 = r9
            goto Lcc
        Lc6:
            java.lang.String r9 = "weslam, check failed"
            com.tencent.mars.xlog.Log.e(r5, r9)
            r10 = r2
        Lcc:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.h(yx0.b8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(yx0.b8 r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.i(yx0.b8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(6:5|6|7|(1:(1:(1:(1:12)(2:16|17))(7:18|19|20|21|(1:23)|24|(2:26|(1:28))))(11:30|31|32|33|34|(2:36|37)|20|21|(0)|24|(0)))(10:42|43|44|(1:46)(2:48|(2:53|(1:56)(8:55|34|(0)|20|21|(0)|24|(0))))|47|20|21|(0)|24|(0))|13|14))|60|6|7|(0)(0)|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(yx0.b8 r17, kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.j(yx0.b8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(yx0.b8 r6, java.lang.String r7, pp0.p0 r8, kotlin.coroutines.Continuation r9) {
        /*
            r6.getClass()
            boolean r0 = r9 instanceof yx0.u4
            if (r0 == 0) goto L16
            r0 = r9
            yx0.u4 r0 = (yx0.u4) r0
            int r1 = r0.f467687h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f467687h = r1
            goto L1b
        L16:
            yx0.u4 r0 = new yx0.u4
            r0.<init>(r6, r9)
        L1b:
            java.lang.Object r9 = r0.f467685f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f467687h
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            kotlin.ResultKt.throwOnFailure(r9)
            goto L85
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.f467684e
            yx0.b8 r6 = (yx0.b8) r6
            java.lang.Object r7 = r0.f467683d
            r8 = r7
            pp0.p0 r8 = (pp0.p0) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L76
        L43:
            kotlin.ResultKt.throwOnFailure(r9)
            yx0.u r9 = r6.U
            yx0.t r2 = yx0.t.f467646a
            boolean r2 = kotlin.jvm.internal.o.b(r9, r2)
            if (r2 == 0) goto L61
            com.tencent.maas.camstudio.MJCamTemplateOverridingParams r6 = new com.tencent.maas.camstudio.MJCamTemplateOverridingParams
            r6.<init>()
            com.tencent.maas.camstudio.MJCamMusicDesc r7 = new com.tencent.maas.camstudio.MJCamMusicDesc
            r7.<init>()
            r8 = 0
            r7.f47883a = r8
            r6.f47909a = r7
            r1 = r6
            goto L9d
        L61:
            yx0.r r2 = yx0.r.f467598a
            boolean r2 = kotlin.jvm.internal.o.b(r9, r2)
            if (r2 == 0) goto L89
            r0.f467683d = r8
            r0.f467684e = r6
            r0.f467687h = r4
            java.lang.Object r9 = r6.p0(r5, r7, r0)
            if (r9 != r1) goto L76
            goto L9d
        L76:
            com.tencent.maas.camstudio.MJCamTemplateOverridingParams r9 = (com.tencent.maas.camstudio.MJCamTemplateOverridingParams) r9
            r0.f467683d = r5
            r0.f467684e = r5
            r0.f467687h = r3
            java.lang.Object r9 = r6.o0(r9, r8, r0)
            if (r9 != r1) goto L85
            goto L9d
        L85:
            com.tencent.maas.camstudio.MJCamTemplateOverridingParams r9 = (com.tencent.maas.camstudio.MJCamTemplateOverridingParams) r9
            r1 = r9
            goto L9d
        L89:
            boolean r7 = r9 instanceof yx0.s
            if (r7 == 0) goto L9e
            com.tencent.maas.camstudio.MJCamTemplateOverridingParams r7 = new com.tencent.maas.camstudio.MJCamTemplateOverridingParams
            r7.<init>()
            yx0.s r9 = (yx0.s) r9
            com.tencent.maas.model.MJMusicInfo r8 = r9.f467623a
            com.tencent.maas.camstudio.MJCamMusicDesc r6 = r6.w0(r8)
            r7.f47909a = r6
            r1 = r7
        L9d:
            return r1
        L9e:
            jz5.j r6 = new jz5.j
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.k(yx0.b8, java.lang.String, pp0.p0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(yx0.b8 r28, kotlinx.coroutines.y0 r29, kotlin.coroutines.Continuation r30) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.m(yx0.b8, kotlinx.coroutines.y0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void n(yx0.b8 b8Var) {
        if (b8Var.f467199x1) {
            return;
        }
        hu3.s0 s0Var = b8Var.f467202y1;
        if (s0Var != null) {
            s0Var.b();
        }
        b8Var.f467202y1 = null;
        yx0.c8 c8Var = b8Var.f467204z1;
        c8Var.f467232a.clear();
        c8Var.f467233b = 0;
        b8Var.A1 = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "stopAudioRecord");
    }

    public static final java.lang.Object o(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        boolean z17 = false;
        ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) b8Var.f467177d).Y0(b8Var.B1 == 1 && b8Var.T != null);
        if (b8Var.B1 == 1 && b8Var.T != null && b8Var.f467189p1) {
            z17 = true;
        }
        java.lang.Object x07 = b8Var.x0(z17, continuation);
        return x07 == pz5.a.f359186d ? x07 : jz5.f0.f302826a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:(4:11|12|13|14)(2:17|18))(1:19))(2:34|(2:36|37)(2:38|(1:40)(1:41)))|20|(2:21|(2:23|(1:25)(1:31))(2:32|33))|26|(4:28|(1:30)|12|13)|14))|44|6|7|(0)(0)|20|(3:21|(0)(0)|31)|26|(0)|14) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x002c, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0093, code lost:
    
        r0 = kotlin.Result.INSTANCE;
        r10 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r10));
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f A[Catch: all -> 0x002c, TRY_ENTER, TryCatch #0 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x008e, B:28:0x007f), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(kotlin.coroutines.Continuation r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof yx0.q1
            if (r0 == 0) goto L13
            r0 = r10
            yx0.q1 r0 = (yx0.q1) r0
            int r1 = r0.f467570h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f467570h = r1
            goto L18
        L13:
            yx0.q1 r0 = new yx0.q1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f467568f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f467570h
            r3 = 2
            r4 = 1
            jz5.f0 r5 = jz5.f0.f302826a
            if (r2 == 0) goto L42
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L2c
            goto L8e
        L2c:
            r10 = move-exception
            goto L93
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L36:
            java.lang.Object r2 = r0.f467567e
            pp0.p0 r2 = (pp0.p0) r2
            java.lang.Object r4 = r0.f467566d
            yx0.b8 r4 = (yx0.b8) r4
            kotlin.ResultKt.throwOnFailure(r10)
            goto L5f
        L42:
            kotlin.ResultKt.throwOnFailure(r10)
            pp0.p0 r2 = r9.K
            if (r2 != 0) goto L51
            java.lang.String r10 = "MicroMsg.ShootComposingCorePlugin"
            java.lang.String r0 = "doRestartBeauty >> but setup is error"
            com.tencent.mars.xlog.Log.e(r10, r0)
            return r5
        L51:
            r0.f467566d = r9
            r0.f467567e = r2
            r0.f467570h = r4
            java.lang.Object r10 = r9.w(r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            r4 = r9
        L5f:
            nx0.y r10 = r4.X
            java.util.List r10 = r10.f341265a
            java.util.Iterator r10 = r10.iterator()
        L67:
            boolean r6 = r10.hasNext()
            r7 = 0
            if (r6 == 0) goto L7a
            java.lang.Object r6 = r10.next()
            r8 = r6
            nx0.w r8 = (nx0.w) r8
            boolean r8 = r8.f341258a
            if (r8 == 0) goto L67
            goto L7b
        L7a:
            r6 = r7
        L7b:
            nx0.w r6 = (nx0.w) r6
            if (r6 == 0) goto La0
            kotlin.Result$Companion r10 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L2c
            r0.f467566d = r7     // Catch: java.lang.Throwable -> L2c
            r0.f467567e = r7     // Catch: java.lang.Throwable -> L2c
            r0.f467570h = r3     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r10 = r4.B(r2, r6, r0)     // Catch: java.lang.Throwable -> L2c
            if (r10 != r1) goto L8e
            return r1
        L8e:
            java.lang.Object r10 = kotlin.Result.m521constructorimpl(r5)     // Catch: java.lang.Throwable -> L2c
            goto L9d
        L93:
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r10 = kotlin.ResultKt.createFailure(r10)
            java.lang.Object r10 = kotlin.Result.m521constructorimpl(r10)
        L9d:
            kotlin.Result.m520boximpl(r10)
        La0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.A(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(pp0.p0 r25, nx0.w r26, kotlin.coroutines.Continuation r27) {
        /*
            Method dump skipped, instructions count: 1196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.B(pp0.p0, nx0.w, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(pp0.p0 r11, nx0.r1 r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.C(pp0.p0, nx0.r1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(pp0.p0 r18, nx0.i2 r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.D(pp0.p0, nx0.i2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(pp0.p0 r11, nx0.b3 r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.E(pp0.p0, nx0.b3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void F(yz5.l result) {
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "reportCancelImportPreview");
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.i5(m7Var, null), 3, null);
        m7Var.hj("UserExit", "");
        mx0.e1 e1Var = this.X1;
        if (e1Var != null) {
            yx0.e2 e2Var = new yx0.e2(result, this);
            if (e1Var.f331935b != mx0.d0.f331895f) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MaterialImportHelper", "exitImportPreview: importPreviewState " + e1Var.f331935b);
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                e2Var.invoke(bool, bool);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaterialImportHelper", "exitImportPreview: importPreviewState " + e1Var.f331935b);
            e1Var.f(mx0.d0.f331896g);
            kotlinx.coroutines.l.d(e1Var.f331938e, null, null, new mx0.q0(e1Var, e2Var, null), 3, null);
        }
    }

    public final java.lang.String G() {
        android.os.Bundle bundle;
        rx0.d dVar;
        r45.d01 d01Var;
        rx0.a aVar = (rx0.a) this.f467200y.getValue();
        boolean z17 = true;
        java.lang.String str = null;
        java.lang.String string = (aVar == null || (dVar = aVar.f400904b) == null || (d01Var = dVar.f400914c) == null) ? null : d01Var.getString(1);
        if (string != null && string.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            return string;
        }
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f467198x0;
        if (recordConfigProvider != null && (bundle = recordConfigProvider.M) != null) {
            str = bundle.getString("KEY_FINDER_POST_ASYNC_AIGC_TASK_ID");
        }
        return str;
    }

    public final com.tencent.maas.camstudio.MJAIGCBridgeService H() {
        return (com.tencent.maas.camstudio.MJAIGCBridgeService) ((jz5.n) this.F).getValue();
    }

    public final com.tencent.maas.camstudio.MJCDNBridgeService I() {
        return (com.tencent.maas.camstudio.MJCDNBridgeService) ((jz5.n) this.D).getValue();
    }

    public final android.content.Context J() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f467179f.get();
        if (viewGroup != null) {
            return viewGroup.getContext();
        }
        return null;
    }

    public final jz5.l L(pp0.p0 p0Var) {
        yx0.o oVar;
        com.tencent.maas.camstudio.MJCamMusicDesc k17 = p0Var.k();
        this.T = k17;
        if (k17 == null) {
            return null;
        }
        kotlin.jvm.internal.o.f(k17.getMusicID(), "getMusicID(...)");
        if (!(!r26.n0.N(r1))) {
            k17 = null;
        }
        if (k17 == null) {
            return null;
        }
        yx0.u uVar = this.U;
        if (kotlin.jvm.internal.o.b(uVar, yx0.r.f467598a)) {
            java.lang.String musicID = k17.getMusicID();
            mx0.q3 q3Var = this.P1;
            if (!kotlin.jvm.internal.o.b(musicID, q3Var != null ? q3Var.f332255h : null)) {
                java.lang.String musicID2 = k17.getMusicID();
                r45.q23 q23Var = this.N1;
                if (!kotlin.jvm.internal.o.b(musicID2, q23Var != null ? q23Var.f383591m : null)) {
                    oVar = yx0.o.f467486d;
                }
            }
            oVar = yx0.o.f467487e;
        } else if (uVar instanceof yx0.s) {
            yx0.u uVar2 = this.U;
            kotlin.jvm.internal.o.e(uVar2, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.shoot_composing.viewmodel.CorePlugin.SelectedMusicState.Custom");
            oVar = ((yx0.s) uVar2).f467624b;
        } else {
            if (!kotlin.jvm.internal.o.b(uVar, yx0.t.f467646a)) {
                throw new jz5.j();
            }
            oVar = yx0.o.f467486d;
        }
        return new jz5.l(k17, oVar);
    }

    public final java.lang.String M() {
        rx0.h hVar = this.S;
        rx0.f fVar = hVar instanceof rx0.f ? (rx0.f) hVar : null;
        if (fVar != null) {
            return fVar.f400916a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(kotlin.coroutines.Continuation r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof yx0.j2
            if (r0 == 0) goto L13
            r0 = r11
            yx0.j2 r0 = (yx0.j2) r0
            int r1 = r0.f467394f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f467394f = r1
            goto L18
        L13:
            yx0.j2 r0 = new yx0.j2
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f467392d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f467394f
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Exception -> L27
            goto L4f
        L27:
            r11 = move-exception
            goto L50
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L31:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlinx.coroutines.y0 r4 = r10.L     // Catch: java.lang.Exception -> L27
            r5 = 0
            r6 = 0
            yx0.k2 r7 = new yx0.k2     // Catch: java.lang.Exception -> L27
            r11 = 0
            r7.<init>(r10, r11)     // Catch: java.lang.Exception -> L27
            r8 = 3
            r9 = 0
            kotlinx.coroutines.f1 r11 = kotlinx.coroutines.l.b(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L27
            r0.f467394f = r3     // Catch: java.lang.Exception -> L27
            kotlinx.coroutines.g1 r11 = (kotlinx.coroutines.g1) r11     // Catch: java.lang.Exception -> L27
            java.lang.Object r11 = r11.k(r0)     // Catch: java.lang.Exception -> L27
            if (r11 != r1) goto L4f
            return r1
        L4f:
            return r11
        L50:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getFaceEffectModel >> error: "
            r0.<init>(r1)
            java.lang.String r11 = r11.getMessage()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.String r0 = "MicroMsg.ShootComposingCorePlugin"
            com.tencent.mars.xlog.Log.e(r0, r11)
            nx0.s1 r11 = nx0.s1.f341222b
            nx0.s1 r11 = nx0.s1.f341222b
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.N(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(kotlin.coroutines.Continuation r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof yx0.l2
            if (r0 == 0) goto L13
            r0 = r11
            yx0.l2 r0 = (yx0.l2) r0
            int r1 = r0.f467431f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f467431f = r1
            goto L18
        L13:
            yx0.l2 r0 = new yx0.l2
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f467429d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f467431f
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Exception -> L27
            goto L4f
        L27:
            r11 = move-exception
            goto L50
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L31:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlinx.coroutines.y0 r4 = r10.L     // Catch: java.lang.Exception -> L27
            r5 = 0
            r6 = 0
            yx0.m2 r7 = new yx0.m2     // Catch: java.lang.Exception -> L27
            r11 = 0
            r7.<init>(r10, r11)     // Catch: java.lang.Exception -> L27
            r8 = 3
            r9 = 0
            kotlinx.coroutines.f1 r11 = kotlinx.coroutines.l.b(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L27
            r0.f467431f = r3     // Catch: java.lang.Exception -> L27
            kotlinx.coroutines.g1 r11 = (kotlinx.coroutines.g1) r11     // Catch: java.lang.Exception -> L27
            java.lang.Object r11 = r11.k(r0)     // Catch: java.lang.Exception -> L27
            if (r11 != r1) goto L4f
            return r1
        L4f:
            return r11
        L50:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getFilterModel >> error: "
            r0.<init>(r1)
            java.lang.String r11 = r11.getMessage()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.String r0 = "MicroMsg.ShootComposingCorePlugin"
            com.tencent.mars.xlog.Log.e(r0, r11)
            nx0.j2 r11 = nx0.j2.f341143b
            nx0.j2 r11 = nx0.j2.f341143b
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.O(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(kotlin.coroutines.Continuation r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof yx0.o2
            if (r0 == 0) goto L13
            r0 = r11
            yx0.o2 r0 = (yx0.o2) r0
            int r1 = r0.f467500f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f467500f = r1
            goto L18
        L13:
            yx0.o2 r0 = new yx0.o2
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f467498d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f467500f
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Exception -> L27
            goto L4f
        L27:
            r11 = move-exception
            goto L50
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L31:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlinx.coroutines.y0 r4 = r10.L     // Catch: java.lang.Exception -> L27
            r5 = 0
            r6 = 0
            yx0.p2 r7 = new yx0.p2     // Catch: java.lang.Exception -> L27
            r11 = 0
            r7.<init>(r10, r11)     // Catch: java.lang.Exception -> L27
            r8 = 3
            r9 = 0
            kotlinx.coroutines.f1 r11 = kotlinx.coroutines.l.b(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L27
            r0.f467500f = r3     // Catch: java.lang.Exception -> L27
            kotlinx.coroutines.g1 r11 = (kotlinx.coroutines.g1) r11     // Catch: java.lang.Exception -> L27
            java.lang.Object r11 = r11.k(r0)     // Catch: java.lang.Exception -> L27
            if (r11 != r1) goto L4f
            return r1
        L4f:
            return r11
        L50:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getMakeupModel >> error: "
            r0.<init>(r1)
            java.lang.String r11 = r11.getMessage()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.String r0 = "MicroMsg.ShootComposingCorePlugin"
            com.tencent.mars.xlog.Log.e(r0, r11)
            nx0.c3 r11 = nx0.c3.f341087b
            nx0.c3 r11 = nx0.c3.f341087b
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.P(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean Q() {
        return ((java.lang.Boolean) ((jz5.n) this.R1).getValue()).booleanValue();
    }

    public final int R() {
        android.os.Bundle bundle;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f467198x0;
        int i17 = (recordConfigProvider == null || (bundle = recordConfigProvider.M) == null) ? 0 : bundle.getInt("KEY_POST_ENTERSCENE");
        return 60 == i17 || 61 == i17 ? 14 : 9;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S(xx0.i r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.S(xx0.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void T() {
        kotlinx.coroutines.l.d(this.M, null, null, new yx0.u2(this, null), 3, null);
    }

    public final void U() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f467193t;
        reentrantLock.lock();
        try {
            switch (this.f467192s.ordinal()) {
                case 0:
                    q0(yx0.v.f467694e);
                    this.f467194u = kotlinx.coroutines.l.d(this.L, null, null, new yx0.v2(this, null), 3, null);
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 15:
                case 16:
                    u(false, new yx0.x2(this));
                    break;
                case 14:
                    kotlinx.coroutines.l.f(null, new yx0.w2(this, null), 1, null);
                    U();
                    break;
                case 17:
                    com.tencent.mars.xlog.Log.e("MicroMsg.ShootComposingCorePlugin", "initializeMaasAsync but state is " + this.f467192s + ", do nothing");
                    break;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(java.lang.String r18, pp0.p0 r19, com.tencent.maas.camstudio.MJCamTemplateInfo r20, java.lang.Long r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.V(java.lang.String, pp0.p0, com.tencent.maas.camstudio.MJCamTemplateInfo, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void W(java.lang.String str, boolean z17) {
        ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).Ni("Error", str, java.lang.System.currentTimeMillis() - this.E1);
        j0();
        kotlinx.coroutines.l.f(null, new yx0.a3(this, z17, null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X(kotlin.coroutines.Continuation r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof yx0.b3
            if (r0 == 0) goto L13
            r0 = r14
            yx0.b3 r0 = (yx0.b3) r0
            int r1 = r0.f467158f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f467158f = r1
            goto L18
        L13:
            yx0.b3 r0 = new yx0.b3
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.f467156d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f467158f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            kotlin.ResultKt.throwOnFailure(r14)
            goto L81
        L28:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L30:
            kotlin.ResultKt.throwOnFailure(r14)
            mx0.e1 r14 = r13.X1
            if (r14 == 0) goto L8a
            r0.f467158f = r4
            boolean r2 = r14.d()
            java.lang.String r5 = "isBeautyAndMakeupDisabled: importPreviewState "
            java.lang.String r6 = "MicroMsg.MaterialImportHelper"
            if (r2 != 0) goto L57
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            mx0.d0 r14 = r14.f331935b
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            com.tencent.mars.xlog.Log.e(r6, r14)
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            goto L7e
        L57:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            mx0.d0 r5 = r14.f331935b
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.mars.xlog.Log.i(r6, r2)
            kotlinx.coroutines.y0 r7 = r14.f331938e
            r8 = 0
            r9 = 0
            mx0.r0 r10 = new mx0.r0
            r2 = 0
            r10.<init>(r14, r2)
            r11 = 3
            r12 = 0
            kotlinx.coroutines.f1 r14 = kotlinx.coroutines.l.b(r7, r8, r9, r10, r11, r12)
            kotlinx.coroutines.g1 r14 = (kotlinx.coroutines.g1) r14
            java.lang.Object r14 = r14.k(r0)
        L7e:
            if (r14 != r1) goto L81
            return r1
        L81:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L8a
            r3 = r4
        L8a:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.X(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean Y(com.tencent.maas.camerafun.MJRecordingFinishInfo mJRecordingFinishInfo, yx0.w wVar) {
        r45.to0 to0Var;
        if (mJRecordingFinishInfo == null) {
            return false;
        }
        rx0.h hVar = this.S;
        rx0.f fVar = hVar instanceof rx0.f ? (rx0.f) hVar : null;
        if (fVar == null || (to0Var = fVar.f400923h) == null) {
            return false;
        }
        boolean z17 = to0Var.f386623d == 1;
        int i17 = to0Var.f386624e;
        int i18 = mJRecordingFinishInfo.f47821e.f47921d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "[isConditionNotMet] videoSource:" + wVar + " isEnable:" + z17 + " minFaceFramePercent:" + i17 + " faceTimePercentage:" + i18);
        return z17 && i18 < i17;
    }

    public final boolean Z() {
        mx0.e1 e1Var = this.X1;
        return e1Var != null && e1Var.e();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(2:25|(2:27|(1:29)))(1:30))|12|13|(1:15)|16|17))|33|6|7|(0)(0)|12|13|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        r7 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a0(kotlinx.coroutines.r2 r5, java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof yx0.c3
            if (r0 == 0) goto L13
            r0 = r7
            yx0.c3 r0 = (yx0.c3) r0
            int r1 = r0.f467222h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f467222h = r1
            goto L18
        L13:
            yx0.c3 r0 = new yx0.c3
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f467220f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f467222h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f467219e
            kotlinx.coroutines.r2 r5 = (kotlinx.coroutines.r2) r5
            java.lang.Object r6 = r0.f467218d
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L57
            goto L52
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.Result$Companion r7 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L51
            boolean r7 = r5.a()     // Catch: java.lang.Throwable -> L57
            if (r7 == 0) goto L52
            r0.f467218d = r6     // Catch: java.lang.Throwable -> L57
            r0.f467219e = r5     // Catch: java.lang.Throwable -> L57
            r0.f467222h = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r7 = r5.C(r0)     // Catch: java.lang.Throwable -> L57
            if (r7 != r1) goto L52
            return r1
        L51:
            r5 = 0
        L52:
            java.lang.Object r5 = kotlin.Result.m521constructorimpl(r5)     // Catch: java.lang.Throwable -> L57
            goto L62
        L57:
            r5 = move-exception
            kotlin.Result$Companion r7 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.createFailure(r5)
            java.lang.Object r5 = kotlin.Result.m521constructorimpl(r5)
        L62:
            java.lang.Throwable r5 = kotlin.Result.m524exceptionOrNullimpl(r5)
            if (r5 == 0) goto L85
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = " joinSafely error: "
            r7.append(r6)
            java.lang.String r5 = r5.getMessage()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.lang.String r6 = "MicroMsg.ShootComposingCorePlugin"
            com.tencent.mars.xlog.Log.e(r6, r5)
        L85:
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.a0(kotlinx.coroutines.r2, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b0(pp0.p0 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof yx0.e3
            if (r0 == 0) goto L13
            r0 = r8
            yx0.e3 r0 = (yx0.e3) r0
            int r1 = r0.f467277h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f467277h = r1
            goto L18
        L13:
            yx0.e3 r0 = new yx0.e3
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f467275f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f467277h
            java.lang.String r3 = "INVALID_SELECTED_MUSIC_ID"
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r7 = r0.f467274e
            mx0.q3 r7 = (mx0.q3) r7
            java.lang.Object r0 = r0.f467273d
            mx0.q3 r0 = (mx0.q3) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L67
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            kotlin.ResultKt.throwOnFailure(r8)
            mx0.q3 r8 = r6.P1
            if (r8 == 0) goto L6f
            java.lang.String r2 = r8.f332256i
            if (r2 != 0) goto L6f
            java.lang.String r2 = r8.f332249b
            if (r2 != 0) goto L4d
            java.lang.String r7 = r8.f332255h
            r8.f332256i = r7
            goto L6f
        L4d:
            java.lang.String r5 = r8.f332255h
            java.lang.String[] r2 = new java.lang.String[]{r2, r5}
            java.util.List r2 = kz5.z.I(r2)
            r0.f467273d = r8
            r0.f467274e = r8
            r0.f467277h = r4
            java.lang.Object r7 = r7.M0(r2, r0)
            if (r7 != r1) goto L64
            return r1
        L64:
            r0 = r8
            r8 = r7
            r7 = r0
        L67:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L6c
            r8 = r3
        L6c:
            r7.f332256i = r8
            r8 = r0
        L6f:
            r7 = 0
            if (r8 == 0) goto L75
            java.lang.String r0 = r8.f332256i
            goto L76
        L75:
            r0 = r7
        L76:
            if (r0 == 0) goto L8b
            java.lang.String r0 = r8.f332256i
            boolean r0 = kotlin.jvm.internal.o.b(r0, r3)
            if (r0 != 0) goto L8b
            com.tencent.maas.camstudio.MJCamMusicDesc r7 = new com.tencent.maas.camstudio.MJCamMusicDesc
            r7.<init>()
            r7.f47883a = r4
            java.lang.String r8 = r8.f332256i
            r7.f47884b = r8
        L8b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.b0(pp0.p0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c0(pp0.p0 r5, yx0.s r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof yx0.g3
            if (r0 == 0) goto L13
            r0 = r7
            yx0.g3 r0 = (yx0.g3) r0
            int r1 = r0.f467328f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f467328f = r1
            goto L18
        L13:
            yx0.g3 r0 = new yx0.g3
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f467326d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f467328f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r7)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.throwOnFailure(r7)
            com.tencent.maas.model.MJMusicInfo r6 = r6.f467623a
            java.lang.String r6 = r6.getMusicID()
            java.lang.String r7 = "getMusicID(...)"
            kotlin.jvm.internal.o.f(r6, r7)
            yx0.j3 r7 = yx0.j3.f467395a
            r0.f467328f = r3
            java.lang.Object r7 = r5.D(r6, r7, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r5 = r7.booleanValue()
            if (r5 != 0) goto L57
            java.lang.String r5 = "MicroMsg.ShootComposingCorePlugin"
            java.lang.String r6 = "switchToMusic loadMusic error"
            com.tencent.mars.xlog.Log.e(r5, r6)
        L57:
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.c0(pp0.p0, yx0.s, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object d0(pp0.p0 p0Var, java.lang.String str, long j17, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        rVar.m(new yx0.k3(p0Var, p0Var.p(str, com.tencent.maas.camstudio.q.UserHigh, new yx0.l3(this, str), new yx0.m3(str, j17, rVar))));
        java.lang.Object j18 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final r45.q23 e0(com.tencent.maas.camerafun.MJRecordingFinishInfo mJRecordingFinishInfo, yx0.w wVar) {
        java.lang.String str;
        com.tencent.maas.camstudio.MJCamOptionResult mJCamOptionResult;
        java.util.List<com.tencent.maas.camstudio.MJRenderNodeStatsResult> renderNodeStatsResults;
        com.tencent.maas.camstudio.MJCamOptionResult mJCamOptionResult2;
        r45.q23 q23Var = new r45.q23();
        pp0.p0 p0Var = this.K;
        r45.dl6 dl6Var = null;
        com.tencent.maas.camstudio.MJCamMusicDesc k17 = p0Var != null ? p0Var.k() : null;
        int i17 = 3;
        q23Var.f383586e = 3;
        rx0.h hVar = this.S;
        rx0.f fVar = hVar instanceof rx0.f ? (rx0.f) hVar : null;
        q23Var.f383585d = fVar != null ? fVar.f400916a : null;
        if (k17 == null || (str = k17.getMusicID()) == null) {
            str = "";
        }
        q23Var.f383591m = str;
        if (k17 != null) {
            dl6Var = new r45.dl6();
            dl6Var.f372557e = (long) k17.getStartTimeOfMusic().toMilliseconds();
            dl6Var.f372556d = (long) k17.getDurationOfMusic().toMilliseconds();
        }
        q23Var.f383602x = dl6Var;
        q23Var.f383587f = com.tencent.maas.MJMaasVersion.VERSION_NUMBER_INT_VALUE;
        q23Var.f383595q = !this.f467199x1 ? 1 : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "templateName:" + q23Var.f383585d + " sdk_version:" + q23Var.f383587f + " mute: " + this.f467199x1);
        if (mJRecordingFinishInfo != null) {
            r45.iy5 iy5Var = new r45.iy5();
            java.lang.Iterable<com.tencent.mm.vfs.x1> s17 = com.tencent.mm.vfs.w6.s(this.C1, false);
            if (s17 != null) {
                for (com.tencent.mm.vfs.x1 x1Var : s17) {
                    java.lang.String relPath = x1Var.f213231a;
                    kotlin.jvm.internal.o.f(relPath, "relPath");
                    if (r26.n0.B(relPath, "mjScy", false)) {
                        java.lang.String str2 = mJRecordingFinishInfo.f47820d + '/' + x1Var.f213232b;
                        iy5Var.f377412d.add(str2);
                        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "frame_urls add path:" + str2);
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "frame_urls size:" + iy5Var.f377412d.size());
            q23Var.f383592n = iy5Var;
            r45.ko6 ko6Var = new r45.ko6();
            ko6Var.f378884i = mJRecordingFinishInfo.f47818b;
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "packageTemplateInfo checksum:" + ko6Var.f378884i + " outputPath:" + mJRecordingFinishInfo.f47817a);
            com.tencent.maas.camstudio.MJRecordingResultTraits mJRecordingResultTraits = mJRecordingFinishInfo.f47821e;
            if (mJRecordingResultTraits != null) {
                ko6Var.f378879d = mJRecordingResultTraits.f47921d;
                ko6Var.f378880e = mJRecordingResultTraits.f47918a ? 1 : 0;
                ko6Var.f378881f = mJRecordingResultTraits.f47919b ? 1 : 0;
                ko6Var.f378886n = mJRecordingResultTraits.f47920c ? 1 : 0;
                ko6Var.f378882g = mJRecordingResultTraits.f47922e;
                ko6Var.f378883h = 0;
            }
            q23Var.f383601w = ko6Var;
            q23Var.C = G();
            if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.mjpublisher.shoot_composing.RepairerConfigShootComposingMD5Check()) == 1) != false && (mJCamOptionResult2 = mJRecordingFinishInfo.f47824h) != null) {
                r45.he4 he4Var = new r45.he4();
                he4Var.f376093d = mJCamOptionResult2.getMd5String();
                q23Var.D = he4Var;
                com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "MD5 check enabled - cam_result_md5: " + mJCamOptionResult2.getMd5String());
            }
            if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.mjpublisher.shoot_composing.RepairerConfigShootComposingLayersRenderStats()) == 1) != false && (mJCamOptionResult = mJRecordingFinishInfo.f47824h) != null && (renderNodeStatsResults = mJCamOptionResult.getRenderNodeStatsResults()) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(renderNodeStatsResults, 10));
                for (com.tencent.maas.camstudio.MJRenderNodeStatsResult mJRenderNodeStatsResult : renderNodeStatsResults) {
                    r45.x54 x54Var = new r45.x54();
                    x54Var.f389791d = mJRenderNodeStatsResult.getSynthId();
                    com.tencent.maas.model.time.MJTime firstRenderTimeStamp = mJRenderNodeStatsResult.getFirstRenderTimeStamp();
                    long j17 = 0;
                    x54Var.f389792e = firstRenderTimeStamp != null ? (long) firstRenderTimeStamp.toMilliseconds() : 0L;
                    com.tencent.maas.model.time.MJTime lastRenderTimeStamp = mJRenderNodeStatsResult.getLastRenderTimeStamp();
                    if (lastRenderTimeStamp != null) {
                        j17 = (long) lastRenderTimeStamp.toMilliseconds();
                    }
                    x54Var.f389793f = j17;
                    x54Var.f389794g = mJRenderNodeStatsResult.isControlledByLua();
                    com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "LayerRenderInfo - layerId: " + x54Var.f389791d + ", firstRender: " + x54Var.f389792e + "ms, lastRender: " + x54Var.f389793f + "ms, controlledByLua: " + x54Var.f389794g);
                    arrayList.add(x54Var);
                }
                java.util.LinkedList linkedList = new java.util.LinkedList(arrayList);
                r45.y54 y54Var = new r45.y54();
                y54Var.f390801d = linkedList;
                q23Var.E = y54Var;
            }
        }
        int ordinal = wVar.ordinal();
        if (ordinal == 0) {
            q23Var.f383596r = 0;
            i17 = 1;
        } else if (ordinal == 1) {
            q23Var.f383596r = 2;
            i17 = 2;
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            q23Var.f383596r = 1;
        }
        q23Var.B = i17;
        return q23Var;
    }

    public final void f0(java.lang.String str) {
        kotlinx.coroutines.l.d(this.M, null, null, new yx0.e4(this, str, null), 3, null);
    }

    public final void g0(yx0.n nVar) {
        int ordinal = nVar.ordinal();
        if (ordinal == 1) {
            m0();
            k0();
        } else if (ordinal == 2) {
            l0();
            k0();
        } else {
            if (ordinal != 3) {
                return;
            }
            l0();
            m0();
        }
    }

    public final void h0(boolean z17) {
        kotlinx.coroutines.l.d(this.M, null, null, new yx0.s4(this, z17, null), 3, null);
    }

    public final void i0(com.tencent.maas.camstudio.MJCamMusicDesc mJCamMusicDesc) {
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[。，,.]$");
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        com.tencent.maas.model.MJLyricInfo[] lyricObjs = mJCamMusicDesc.getLyricObjs();
        kotlin.jvm.internal.o.f(lyricObjs, "getLyricObjs(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(lyricObjs.length);
        for (com.tencent.maas.model.MJLyricInfo mJLyricInfo : lyricObjs) {
            java.lang.String content = mJLyricInfo.getContent();
            kotlin.jvm.internal.o.d(content);
            if (content.length() > 0) {
                com.tencent.maas.model.time.MJTime startTime = mJLyricInfo.getStartTime();
                com.tencent.maas.model.time.MJTime endTime = mJLyricInfo.getEndTime();
                java.lang.String replaceAll = compile.matcher(content).replaceAll("");
                kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
                mJLyricInfo = new com.tencent.maas.model.MJLyricInfo(startTime, endTime, replaceAll, mJLyricInfo.getSubContent());
            }
            arrayList.add(mJLyricInfo);
        }
        mJCamMusicDesc.f47893k = (com.tencent.maas.model.MJLyricInfo[]) arrayList.toArray(new com.tencent.maas.model.MJLyricInfo[0]);
    }

    public final void j0() {
        ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).sj(false);
        rx0.h hVar = this.S;
        pp0.k0 k0Var = (pp0.k0) i95.n0.c(pp0.k0.class);
        if (hVar instanceof rx0.f) {
            rx0.f fVar = (rx0.f) hVar;
            ((yy0.o0) k0Var).Ui(fVar.f400916a, fVar.f400917b, fVar.f400918c, fVar.f400920e, 3, false, this.f467177d.getCurrentCameraIsFront(), !this.f467177d.getCurrentMicIsMute(), fVar.f400921f, fVar.f400922g);
            this.D1 = java.lang.System.currentTimeMillis();
            return;
        }
        if (hVar instanceof rx0.e) {
            ((yy0.o0) k0Var).Ui("kEmptyTemplateId", 0L, 0, null, 4, false, this.f467177d.getCurrentCameraIsFront(), !this.f467177d.getCurrentMicIsMute(), false, false);
            this.D1 = java.lang.System.currentTimeMillis();
        }
    }

    public final void k0() {
        java.util.Iterator it = this.Z.f341223a.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else if (((nx0.r1) it.next()).f341213d) {
                break;
            } else {
                i17++;
            }
        }
        if (i17 != -1) {
            nx0.r1 r1Var = (nx0.r1) this.Z.f341223a.get(i17);
            r1Var.getClass();
            if (r1Var == nx0.r1.f341209g) {
                return;
            }
            ((nx0.r1) this.Z.f341223a.get(i17)).f341213d = false;
            ((nx0.r1) kz5.n0.X(this.Z.f341223a)).f341213d = true;
        }
    }

    public final void l0() {
        java.util.Iterator it = this.W.f341144a.iterator();
        while (it.hasNext()) {
            for (nx0.i2 i2Var : ((nx0.h2) it.next()).f341127b) {
                if ((i2Var.a() && !i2Var.f341135d) || (!i2Var.a() && i2Var.f341135d)) {
                    i2Var.f341135d = !i2Var.f341135d;
                }
            }
        }
    }

    public final void m0() {
        java.util.Iterator it = this.Y.f341088a.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else if (((nx0.b3) it.next()).f341078d) {
                break;
            } else {
                i17++;
            }
        }
        if (i17 != -1) {
            nx0.b3 b3Var = (nx0.b3) this.Y.f341088a.get(i17);
            b3Var.getClass();
            if (b3Var == nx0.b3.f341074g) {
                return;
            }
            ((nx0.b3) this.Y.f341088a.get(i17)).f341078d = false;
            ((nx0.b3) kz5.n0.X(this.Y.f341088a)).f341078d = true;
        }
    }

    public final void n0() {
        kotlinx.coroutines.l.d(this.M, null, null, new yx0.d5(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o0(com.tencent.maas.camstudio.MJCamTemplateOverridingParams r5, pp0.p0 r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof yx0.e5
            if (r0 == 0) goto L13
            r0 = r7
            yx0.e5 r0 = (yx0.e5) r0
            int r1 = r0.f467283g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f467283g = r1
            goto L18
        L13:
            yx0.e5 r0 = new yx0.e5
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f467281e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f467283g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f467280d
            com.tencent.maas.camstudio.MJCamTemplateOverridingParams r5 = (com.tencent.maas.camstudio.MJCamTemplateOverridingParams) r5
            kotlin.ResultKt.throwOnFailure(r7)
            goto L41
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.f467280d = r5
            r0.f467283g = r3
            java.lang.Object r7 = r4.b0(r6, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            com.tencent.maas.camstudio.MJCamMusicDesc r7 = (com.tencent.maas.camstudio.MJCamMusicDesc) r7
            if (r5 == 0) goto L4a
            com.tencent.maas.camstudio.MJCamMusicDesc r6 = r5.getMusicDesc()
            goto L4b
        L4a:
            r6 = 0
        L4b:
            if (r6 != 0) goto L58
            if (r7 == 0) goto L58
            if (r5 != 0) goto L56
            com.tencent.maas.camstudio.MJCamTemplateOverridingParams r5 = new com.tencent.maas.camstudio.MJCamTemplateOverridingParams
            r5.<init>()
        L56:
            r5.f47909a = r7
        L58:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.o0(com.tencent.maas.camstudio.MJCamTemplateOverridingParams, pp0.p0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // yt3.r2
    public void onAttach() {
        tx0.k kVar = this.S1;
        if (!kVar.f422526c) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            ((sb0.f) jVar).getClass();
            kVar.f422526c = j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", false);
        }
        n0();
    }

    @Override // yt3.r2
    public void onDetach() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "onDetach. state: " + this.f467192s);
        this.Z1 = null;
        this.J1 = null;
        ((yy0.k8) ((pp0.q0) i95.n0.c(pp0.q0.class))).getClass();
        az0.i5 i5Var = az0.i5.f15557a;
        az0.i5.f15573q = null;
        this.S1.b();
        h0(false);
    }

    @Override // yt3.r2
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "onPause. state: " + this.f467192s + " isImportPreview " + Z());
        if (!Z()) {
            f0("APP_onPause");
            return;
        }
        mx0.e1 e1Var = this.X1;
        if (e1Var == null || e1Var.f331936c) {
            return;
        }
        e1Var.f331936c = true;
        kotlinx.coroutines.l.d(e1Var.f331938e, null, null, new mx0.v0(e1Var, null), 3, null);
    }

    @Override // yt3.r2
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        android.content.Context J2;
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        if (i17 == 79 && grantResults[0] == 0 && (J2 = J()) != null) {
            this.S1.f422526c = true;
            kotlinx.coroutines.l.d(this.M, null, null, new yx0.z3(this, com.tencent.mm.ui.widget.dialog.u3.f(J2, j65.q.b(J2, com.tencent.mm.R.string.lli), true, 0, null), null), 3, null);
        }
    }

    @Override // yt3.r2
    public void onResume() {
        com.tencent.maas.camstudio.MJCaptureSession a17 = az0.w2.f15991d.a();
        if (a17 != null) {
            a17.b();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "onResume. state: " + this.f467192s + " isImportPreview " + Z());
        tx0.k kVar = this.S1;
        if (!kVar.f422526c) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            ((sb0.f) jVar).getClass();
            kVar.f422526c = j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", false);
        }
        if (this.G1) {
            this.G1 = false;
            return;
        }
        if (!Z()) {
            n0();
            return;
        }
        mx0.e1 e1Var = this.X1;
        if (e1Var == null || !e1Var.f331936c) {
            return;
        }
        e1Var.f331936c = false;
        kotlinx.coroutines.l.d(e1Var.f331938e, null, null, new mx0.x0(e1Var, null), 3, null);
    }

    public final void p(com.tencent.maas.camstudio.MJAIGCCancelReason reasonType) {
        kotlin.jvm.internal.o.g(reasonType, "reasonType");
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "cancelAIGCTaskWithReason: reasonType=" + reasonType);
        pp0.p0 p0Var = this.K;
        if (p0Var != null) {
            p0Var.J(reasonType);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p0(com.tencent.maas.camstudio.MJCamTemplateOverridingParams r5, java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof yx0.f5
            if (r0 == 0) goto L13
            r0 = r7
            yx0.f5 r0 = (yx0.f5) r0
            int r1 = r0.f467304h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f467304h = r1
            goto L18
        L13:
            yx0.f5 r0 = new yx0.f5
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f467302f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f467304h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f467301e
            com.tencent.maas.camstudio.MJCamTemplateOverridingParams r5 = (com.tencent.maas.camstudio.MJCamTemplateOverridingParams) r5
            java.lang.Object r6 = r0.f467300d
            yx0.b8 r6 = (yx0.b8) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L7e
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.ResultKt.throwOnFailure(r7)
            r45.q23 r7 = r4.N1
            if (r7 == 0) goto Lc0
            r45.q23 r7 = r4.N1
            r2 = 0
            if (r7 == 0) goto L46
            java.lang.String r7 = r7.f383585d
            goto L47
        L46:
            r7 = r2
        L47:
            boolean r6 = kotlin.jvm.internal.o.b(r6, r7)
            if (r6 == 0) goto Lc0
            com.tencent.maas.camstudio.MJCamTemplateOverridingParams r5 = new com.tencent.maas.camstudio.MJCamTemplateOverridingParams
            r5.<init>()
            r45.q23 r6 = r4.N1
            if (r6 == 0) goto L59
            java.lang.String r6 = r6.f383591m
            goto L5a
        L59:
            r6 = r2
        L5a:
            if (r6 == 0) goto L65
            int r7 = r6.length()
            if (r7 != 0) goto L63
            goto L65
        L63:
            r7 = 0
            goto L66
        L65:
            r7 = r3
        L66:
            if (r7 != 0) goto Lc0
            pp0.p0 r7 = r4.K
            if (r7 == 0) goto L82
            java.util.List r6 = kz5.b0.c(r6)
            r0.f467300d = r4
            r0.f467301e = r5
            r0.f467304h = r3
            java.lang.Object r7 = r7.M0(r6, r0)
            if (r7 != r1) goto L7d
            return r1
        L7d:
            r6 = r4
        L7e:
            r2 = r7
            java.lang.String r2 = (java.lang.String) r2
            goto L83
        L82:
            r6 = r4
        L83:
            r6.O1 = r2
            if (r2 == 0) goto Lc0
            com.tencent.maas.camstudio.MJCamMusicDesc r7 = new com.tencent.maas.camstudio.MJCamMusicDesc
            r7.<init>()
            r7.f47883a = r3
            r7.f47884b = r2
            r45.q23 r0 = r6.N1
            if (r0 == 0) goto La0
            r45.dl6 r0 = r0.f383602x
            if (r0 == 0) goto La0
            long r0 = r0.f372557e
            com.tencent.maas.model.time.MJTime r0 = com.tencent.maas.model.time.MJTime.fromMilliseconds(r0)
            r7.f47889g = r0
        La0:
            r45.q23 r6 = r6.N1
            if (r6 == 0) goto Lb0
            r45.dl6 r6 = r6.f383602x
            if (r6 == 0) goto Lb0
            long r0 = r6.f372556d
            com.tencent.maas.model.time.MJTime r6 = com.tencent.maas.model.time.MJTime.fromMilliseconds(r0)
            r7.f47890h = r6
        Lb0:
            com.tencent.maas.model.time.MJTime r6 = r7.getStartTimeOfMusic()
            java.util.Objects.toString(r6)
            com.tencent.maas.model.time.MJTime r6 = r7.getDurationOfMusic()
            java.util.Objects.toString(r6)
            r5.f47909a = r7
        Lc0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.p0(com.tencent.maas.camstudio.MJCamTemplateOverridingParams, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void q0(yx0.v vVar) {
        if (this.f467192s == vVar) {
            return;
        }
        yx0.v vVar2 = this.f467192s;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "State changed: " + this.f467192s + " -> " + vVar);
        this.f467192s = vVar;
        this.f467194u = null;
        yz5.p pVar = this.f467184m;
        if (pVar != null) {
            pVar.invoke(vVar2, vVar);
        }
    }

    public final java.lang.Object r(boolean z17, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "clearMusic");
        java.lang.Object C = ((kotlinx.coroutines.c3) kotlinx.coroutines.l.d(this.M, null, null, new yx0.n0(this, z17, null), 3, null)).C(continuation);
        return C == pz5.a.f359186d ? C : jz5.f0.f302826a;
    }

    public final java.lang.Object r0(boolean z17, boolean z18, boolean z19, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        kotlinx.coroutines.l.d(this.M, null, null, new yx0.a6(this, z18, z17, z19, nVar, null), 3, null);
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    @Override // yt3.r2
    public void release() {
        this.S1.b();
    }

    public final com.tencent.maas.instamovie.MJRecordingSettings s() {
        boolean z17;
        java.lang.String jSONObject;
        rg.e eVar = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_maas_mj_sc_export_h265, 0) == 1 ? rg.e.HEVC : rg.e.H264;
        rg.a aVar = rg.a.MPEG4AAC;
        rg.d dVar = rg.d.MP4;
        rx0.i iVar = this.f467201y0;
        com.tencent.maas.instamovie.MJRecordingSettings mJRecordingSettings = new com.tencent.maas.instamovie.MJRecordingSettings(eVar, aVar, dVar, iVar.f400928a, iVar.f400930c, iVar.f400931d, iVar.f400932e);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "recordingSettings: level:" + this.f467201y0.f400928a + " size:" + this.f467201y0.f400929b.f456173a + 'x' + this.f467201y0.f400929b.f456174b);
        mJRecordingSettings.f48159n = rg.b.DefaultSampling;
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        m7Var.getClass();
        synchronized (yy0.m7.class) {
            com.tencent.mars.xlog.Log.i(m7Var.f468225d, "mjPublisherSelectedTemplateIsAIGC: " + m7Var.f468242x);
            z17 = m7Var.f468242x;
        }
        if (z17) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("Label", "1");
            jSONObject2.put("ContentProducer", "001191440101327598294H1M07G");
            jSONObject2.put("ProduceID", m7Var.Ri());
            jSONObject2.put("Time", new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS).format(new java.util.Date()));
            jSONObject2.put("ContentPropagator", "001191440101327598294H1M07G");
            jSONObject2.put("PropagateID", m7Var.Ri());
            jSONObject = jSONObject2.toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "generated shooting template AIGC metadata: ".concat(jSONObject));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "Selected template is not AIGC, no need to generate AIGC metadata.");
            jSONObject = null;
        }
        if (jSONObject != null) {
            mJRecordingSettings.f48154i = kz5.b1.e(new jz5.l("AIGC", jSONObject));
            mJRecordingSettings.f48155j = true;
        }
        return mJRecordingSettings;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s0(nx0.w r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof yx0.b6
            if (r0 == 0) goto L13
            r0 = r15
            yx0.b6 r0 = (yx0.b6) r0
            int r1 = r0.f467168g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f467168g = r1
            goto L18
        L13:
            yx0.b6 r0 = new yx0.b6
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f467166e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f467168g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3d
            if (r2 == r6) goto L35
            if (r2 != r5) goto L2d
            kotlin.ResultKt.throwOnFailure(r15)
            goto L6e
        L2d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L35:
            java.lang.Object r14 = r0.f467165d
            yx0.b8 r14 = (yx0.b8) r14
            kotlin.ResultKt.throwOnFailure(r15)
            goto L5d
        L3d:
            kotlin.ResultKt.throwOnFailure(r15)
            kotlinx.coroutines.y0 r7 = r13.M
            r8 = 0
            r9 = 0
            yx0.g6 r10 = new yx0.g6
            r10.<init>(r14, r13, r4)
            r11 = 3
            r12 = 0
            kotlinx.coroutines.r2 r14 = kotlinx.coroutines.l.d(r7, r8, r9, r10, r11, r12)
            r0.f467165d = r13
            r0.f467168g = r6
            kotlinx.coroutines.c3 r14 = (kotlinx.coroutines.c3) r14
            java.lang.Object r14 = r14.C(r0)
            if (r14 != r1) goto L5c
            return r1
        L5c:
            r14 = r13
        L5d:
            kotlinx.coroutines.r2 r15 = r14.f467194u
            if (r15 == 0) goto L6e
            r0.f467165d = r4
            r0.f467168g = r5
            java.lang.String r2 = "switchBeauty"
            java.lang.Object r14 = r14.a0(r15, r2, r0)
            if (r14 != r1) goto L6e
            return r1
        L6e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.s0(nx0.w, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        ux0.d bVar;
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        this.f467198x0 = configProvider;
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = configProvider.f155676n;
        if (videoTransPara == null) {
            videoTransPara = d11.s.fj().ij();
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_template_record_fps, 30);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "recordFps:" + Ni);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(Ni);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 30;
        rx0.i iVar = this.f467201y0;
        iVar.f400931d = videoTransPara.f71198n;
        iVar.f400930c = videoTransPara.f71194g / intValue;
        iVar.f400932e = videoTransPara.f71197m * intValue;
        int i17 = videoTransPara.f71191d;
        if (i17 <= 540) {
            iVar.f400928a = rg.c.DIMENSION_LEVEL_540;
            xr0.j jVar = iVar.f400929b;
            jVar.f456173a = com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_WIDTH;
            jVar.f456174b = com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT;
        } else if (i17 <= 720) {
            iVar.f400928a = rg.c.DIMENSION_LEVEL_720;
            xr0.j jVar2 = iVar.f400929b;
            jVar2.f456173a = com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH;
            jVar2.f456174b = 1280;
        } else {
            iVar.f400928a = rg.c.DIMENSION_LEVEL_1080;
            xr0.j jVar3 = iVar.f400929b;
            jVar3.f456173a = 1080;
            jVar3.f456174b = 1920;
        }
        pp0.h0 h0Var = (pp0.h0) i95.n0.c(pp0.h0.class);
        az0.w2 w2Var = az0.w2.f15991d;
        if (!w2Var.d() || w2Var.a() == null) {
            yy0.m0 m0Var = (yy0.m0) h0Var;
            m0Var.getClass();
            int h17 = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.mjpublisher.shoot_composing.RepairerConfigShootComposingTextureMode());
            if (h17 == 1 || (h17 != 2 && m0Var.Di(e42.c0.clicfg_finder_maas_shoot_composing_texture_mode, 0) == 1)) {
                int Di = m0Var.Di(e42.c0.clicfg_finder_maas_shoot_composing_texture_mode_cache_size, 3);
                com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "use TextureVideoFrameSender cacheSize:" + Di);
                bVar = new ux0.o(Di);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "use ByteBufferVideoFrameSender");
                bVar = new ux0.b();
            }
            this.f467183l1 = bVar;
        }
        tx0.k kVar = this.S1;
        kVar.getClass();
        tb0.j jVar4 = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((sb0.f) jVar4).getClass();
        kVar.f422526c = j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", false);
        u(this.f467192s == yx0.v.f467693d, null);
        T();
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "outputInfo:" + this.f467201y0);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t0(nx0.r1 r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof yx0.l6
            if (r0 == 0) goto L13
            r0 = r15
            yx0.l6 r0 = (yx0.l6) r0
            int r1 = r0.f467441g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f467441g = r1
            goto L18
        L13:
            yx0.l6 r0 = new yx0.l6
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f467439e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f467441g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L48
            if (r2 == r7) goto L40
            if (r2 == r6) goto L38
            if (r2 != r5) goto L30
            kotlin.ResultKt.throwOnFailure(r15)
            goto L80
        L30:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L38:
            java.lang.Object r14 = r0.f467438d
            yx0.b8 r14 = (yx0.b8) r14
            kotlin.ResultKt.throwOnFailure(r15)
            goto L6f
        L40:
            java.lang.Object r14 = r0.f467438d
            yx0.b8 r14 = (yx0.b8) r14
            kotlin.ResultKt.throwOnFailure(r15)
            goto L62
        L48:
            kotlin.ResultKt.throwOnFailure(r15)
            r0.f467438d = r13
            r0.f467441g = r7
            kotlinx.coroutines.y0 r7 = r13.M
            r8 = 0
            r9 = 0
            yx0.q6 r10 = new yx0.q6
            r10.<init>(r14, r13, r4)
            r11 = 3
            r12 = 0
            kotlinx.coroutines.r2 r15 = kotlinx.coroutines.l.d(r7, r8, r9, r10, r11, r12)
            if (r15 != r1) goto L61
            return r1
        L61:
            r14 = r13
        L62:
            kotlinx.coroutines.r2 r15 = (kotlinx.coroutines.r2) r15
            r0.f467438d = r14
            r0.f467441g = r6
            java.lang.Object r15 = r15.C(r0)
            if (r15 != r1) goto L6f
            return r1
        L6f:
            kotlinx.coroutines.r2 r15 = r14.f467194u
            if (r15 == 0) goto L80
            r0.f467438d = r4
            r0.f467441g = r5
            java.lang.String r2 = "switchFaceEffect"
            java.lang.Object r14 = r14.a0(r15, r2, r0)
            if (r14 != r1) goto L80
            return r1
        L80:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.t0(nx0.r1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void u(boolean z17, yz5.a aVar) {
        java.lang.String str;
        if (z17) {
            return;
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (aVar == null || (str = (java.lang.String) aVar.invoke()) == null) {
            str = "Assertion failed";
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ShootComposingCorePlugin", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u0(nx0.b3 r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof yx0.w6
            if (r0 == 0) goto L13
            r0 = r15
            yx0.w6 r0 = (yx0.w6) r0
            int r1 = r0.f467747g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f467747g = r1
            goto L18
        L13:
            yx0.w6 r0 = new yx0.w6
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f467745e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f467747g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L48
            if (r2 == r7) goto L40
            if (r2 == r6) goto L38
            if (r2 != r5) goto L30
            kotlin.ResultKt.throwOnFailure(r15)
            goto L80
        L30:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L38:
            java.lang.Object r14 = r0.f467744d
            yx0.b8 r14 = (yx0.b8) r14
            kotlin.ResultKt.throwOnFailure(r15)
            goto L6f
        L40:
            java.lang.Object r14 = r0.f467744d
            yx0.b8 r14 = (yx0.b8) r14
            kotlin.ResultKt.throwOnFailure(r15)
            goto L62
        L48:
            kotlin.ResultKt.throwOnFailure(r15)
            r0.f467744d = r13
            r0.f467747g = r7
            kotlinx.coroutines.y0 r7 = r13.M
            r8 = 0
            r9 = 0
            yx0.b7 r10 = new yx0.b7
            r10.<init>(r14, r13, r4)
            r11 = 3
            r12 = 0
            kotlinx.coroutines.r2 r15 = kotlinx.coroutines.l.d(r7, r8, r9, r10, r11, r12)
            if (r15 != r1) goto L61
            return r1
        L61:
            r14 = r13
        L62:
            kotlinx.coroutines.r2 r15 = (kotlinx.coroutines.r2) r15
            r0.f467744d = r14
            r0.f467747g = r6
            java.lang.Object r15 = r15.C(r0)
            if (r15 != r1) goto L6f
            return r1
        L6f:
            kotlinx.coroutines.r2 r15 = r14.f467194u
            if (r15 == 0) goto L80
            r0.f467744d = r4
            r0.f467747g = r5
            java.lang.String r2 = "switchMakeup"
            java.lang.Object r14 = r14.a0(r15, r2, r0)
            if (r14 != r1) goto L80
            return r1
        L80:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.u0(nx0.b3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object v0(jz5.l lVar, jz5.l lVar2, boolean z17, java.util.List list, kotlin.coroutines.Continuation continuation) {
        yz5.r rVar = this.f467185n;
        if (rVar != null) {
            rVar.C(lVar, lVar2, java.lang.Boolean.valueOf(z17), list);
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new yx0.r7(lVar, this, null), continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00af A[LOOP:0: B:15:0x00a9->B:17:0x00af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.w(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final com.tencent.maas.camstudio.MJCamMusicDesc w0(com.tencent.maas.model.MJMusicInfo mJMusicInfo) {
        com.tencent.maas.camstudio.MJCamMusicDesc mJCamMusicDesc = new com.tencent.maas.camstudio.MJCamMusicDesc();
        mJCamMusicDesc.f47883a = true;
        mJCamMusicDesc.f47884b = mJMusicInfo.getMusicID();
        com.tencent.maas.model.time.MJTime startTime = mJMusicInfo.getStartTime();
        if (startTime == null) {
            startTime = com.tencent.maas.model.time.MJTime.InvalidTime;
        }
        mJCamMusicDesc.f47889g = startTime;
        com.tencent.maas.model.time.MJTime duration = mJMusicInfo.getDuration();
        if (duration == null) {
            duration = com.tencent.maas.model.time.MJTime.InvalidTime;
        }
        mJCamMusicDesc.f47890h = duration;
        mJCamMusicDesc.f47893k = mJMusicInfo.getLyricObjs();
        return mJCamMusicDesc;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4 A[LOOP:0: B:15:0x009e->B:17:0x00a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(kotlin.coroutines.Continuation r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof yx0.p0
            if (r0 == 0) goto L13
            r0 = r15
            yx0.p0 r0 = (yx0.p0) r0
            int r1 = r0.f467536h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f467536h = r1
            goto L18
        L13:
            yx0.p0 r0 = new yx0.p0
            r0.<init>(r14, r15)
        L18:
            java.lang.Object r15 = r0.f467534f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f467536h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r1 = r0.f467533e
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.f467532d
            yx0.b8 r0 = (yx0.b8) r0
            kotlin.ResultKt.throwOnFailure(r15)
            goto L72
        L2f:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L37:
            kotlin.ResultKt.throwOnFailure(r15)
            pp0.p0 r15 = r14.K
            if (r15 != 0) goto L4a
            java.lang.String r15 = "MicroMsg.ShootComposingCorePlugin"
            java.lang.String r0 = "doLoadFaceEffectModel >> but setup is error"
            com.tencent.mars.xlog.Log.e(r15, r0)
            nx0.s1 r15 = nx0.s1.f341222b
            nx0.s1 r15 = nx0.s1.f341222b
            return r15
        L4a:
            com.tencent.maas.material.g r2 = com.tencent.maas.material.g.FaceEffect
            boolean r4 = r15.V(r2)
            if (r4 == 0) goto L55
            nx0.s1 r15 = r14.Z
            return r15
        L55:
            nx0.r1 r4 = nx0.r1.f341209g
            nx0.r1 r4 = nx0.r1.f341209g
            r4.f341213d = r3
            nx0.r1[] r4 = new nx0.r1[]{r4}
            java.util.List r4 = kz5.c0.k(r4)
            r0.f467532d = r14
            r0.f467533e = r4
            r0.f467536h = r3
            java.lang.Object r15 = r15.x(r2, r0)
            if (r15 != r1) goto L70
            return r1
        L70:
            r0 = r14
            r1 = r4
        L72:
            com.tencent.maas.material.MJMaterialPack r15 = (com.tencent.maas.material.MJMaterialPack) r15
            if (r15 == 0) goto Ld2
            java.util.List r2 = r15.a()
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r3
            if (r2 == 0) goto Ld2
            java.util.List r15 = r15.a()
            java.lang.Object r15 = kz5.n0.X(r15)
            com.tencent.maas.material.MJMaterialCategory r15 = (com.tencent.maas.material.MJMaterialCategory) r15
            java.util.List r15 = r15.a()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kz5.d0.q(r15, r3)
            r2.<init>(r3)
            java.util.Iterator r15 = r15.iterator()
        L9e:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto Lcf
            java.lang.Object r3 = r15.next()
            com.tencent.maas.material.MJMaterialInfo r3 = (com.tencent.maas.material.MJMaterialInfo) r3
            nx0.r1 r13 = new nx0.r1
            java.lang.String r5 = r3.f48224b
            java.lang.String r4 = "getMaterialID(...)"
            kotlin.jvm.internal.o.f(r5, r4)
            java.lang.String r6 = r3.f48226d
            java.lang.String r4 = "getMaterialName(...)"
            kotlin.jvm.internal.o.f(r6, r4)
            java.lang.String r7 = r3.f48227e
            java.lang.String r3 = "getPreviewImageURL(...)"
            kotlin.jvm.internal.o.f(r7, r3)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 56
            r12 = 0
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r2.add(r13)
            goto L9e
        Lcf:
            r1.addAll(r2)
        Ld2:
            nx0.s1 r15 = new nx0.s1
            r15.<init>(r1)
            r0.Z = r15
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.x(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x0(boolean r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.x0(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.y(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y0(kotlinx.coroutines.r2 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof yx0.a8
            if (r0 == 0) goto L13
            r0 = r8
            yx0.a8 r0 = (yx0.a8) r0
            int r1 = r0.f467142h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f467142h = r1
            goto L18
        L13:
            yx0.a8 r0 = new yx0.a8
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f467140f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f467142h
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.throwOnFailure(r8)
            goto L63
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.f467139e
            kotlinx.coroutines.r2 r7 = (kotlinx.coroutines.r2) r7
            java.lang.Object r2 = r0.f467138d
            yx0.b8 r2 = (yx0.b8) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L53
        L40:
            kotlin.ResultKt.throwOnFailure(r8)
            if (r7 == 0) goto L63
            r0.f467138d = r6
            r0.f467139e = r7
            r0.f467142h = r5
            java.lang.Object r8 = kotlinx.coroutines.g4.a(r0)
            if (r8 != r1) goto L52
            return r1
        L52:
            r2 = r6
        L53:
            r8 = 0
            r0.f467138d = r8
            r0.f467139e = r8
            r0.f467142h = r4
            java.lang.String r8 = "LoadTemplateListJob"
            java.lang.Object r7 = r2.a0(r7, r8, r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.y0(kotlinx.coroutines.r2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4 A[LOOP:0: B:15:0x009e->B:17:0x00a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(kotlin.coroutines.Continuation r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof yx0.r0
            if (r0 == 0) goto L13
            r0 = r15
            yx0.r0 r0 = (yx0.r0) r0
            int r1 = r0.f467603h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f467603h = r1
            goto L18
        L13:
            yx0.r0 r0 = new yx0.r0
            r0.<init>(r14, r15)
        L18:
            java.lang.Object r15 = r0.f467601f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f467603h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r1 = r0.f467600e
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.f467599d
            yx0.b8 r0 = (yx0.b8) r0
            kotlin.ResultKt.throwOnFailure(r15)
            goto L72
        L2f:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L37:
            kotlin.ResultKt.throwOnFailure(r15)
            pp0.p0 r15 = r14.K
            if (r15 != 0) goto L4a
            java.lang.String r15 = "MicroMsg.ShootComposingCorePlugin"
            java.lang.String r0 = "doLoadMakeupModel >> but setup is error"
            com.tencent.mars.xlog.Log.e(r15, r0)
            nx0.c3 r15 = nx0.c3.f341087b
            nx0.c3 r15 = nx0.c3.f341087b
            return r15
        L4a:
            com.tencent.maas.material.g r2 = com.tencent.maas.material.g.Makeup
            boolean r4 = r15.V(r2)
            if (r4 == 0) goto L55
            nx0.c3 r15 = r14.Y
            return r15
        L55:
            nx0.b3 r4 = nx0.b3.f341074g
            nx0.b3 r4 = nx0.b3.f341074g
            r4.f341078d = r3
            nx0.b3[] r4 = new nx0.b3[]{r4}
            java.util.List r4 = kz5.c0.k(r4)
            r0.f467599d = r14
            r0.f467600e = r4
            r0.f467603h = r3
            java.lang.Object r15 = r15.x(r2, r0)
            if (r15 != r1) goto L70
            return r1
        L70:
            r0 = r14
            r1 = r4
        L72:
            com.tencent.maas.material.MJMaterialPack r15 = (com.tencent.maas.material.MJMaterialPack) r15
            if (r15 == 0) goto Ld2
            java.util.List r2 = r15.a()
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r3
            if (r2 == 0) goto Ld2
            java.util.List r15 = r15.a()
            java.lang.Object r15 = kz5.n0.X(r15)
            com.tencent.maas.material.MJMaterialCategory r15 = (com.tencent.maas.material.MJMaterialCategory) r15
            java.util.List r15 = r15.a()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kz5.d0.q(r15, r3)
            r2.<init>(r3)
            java.util.Iterator r15 = r15.iterator()
        L9e:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto Lcf
            java.lang.Object r3 = r15.next()
            com.tencent.maas.material.MJMaterialInfo r3 = (com.tencent.maas.material.MJMaterialInfo) r3
            nx0.b3 r13 = new nx0.b3
            java.lang.String r5 = r3.f48224b
            java.lang.String r4 = "getMaterialID(...)"
            kotlin.jvm.internal.o.f(r5, r4)
            java.lang.String r6 = r3.f48226d
            java.lang.String r4 = "getMaterialName(...)"
            kotlin.jvm.internal.o.f(r6, r4)
            java.lang.String r7 = r3.f48227e
            java.lang.String r3 = "getPreviewImageURL(...)"
            kotlin.jvm.internal.o.f(r7, r3)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 56
            r12 = 0
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r2.add(r13)
            goto L9e
        Lcf:
            r1.addAll(r2)
        Ld2:
            nx0.c3 r15 = new nx0.c3
            r15.<init>(r1)
            r0.Y = r15
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b8.z(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
