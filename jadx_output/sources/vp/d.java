package vp;

/* loaded from: classes16.dex */
public class d implements vp.w0, yp.i {
    public static android.graphics.Paint V;
    public static int W;
    public static final java.lang.StringBuilder Z;

    /* renamed from: p0, reason: collision with root package name */
    public static final java.util.Formatter f438738p0;

    /* renamed from: x0, reason: collision with root package name */
    public static final android.os.Handler f438739x0;
    public int A;
    public long B;
    public long C;
    public java.lang.String D;
    public long E;
    public long F;
    public xp.d G;

    /* renamed from: J, reason: collision with root package name */
    public final vp.a f438740J;
    public vp.w K;
    public vp.g0 L;
    public int M;
    public vp.j N;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f438741d;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f438743f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f438744g;

    /* renamed from: h, reason: collision with root package name */
    public final yp.j f438745h;

    /* renamed from: i, reason: collision with root package name */
    public final vp.t f438746i;

    /* renamed from: m, reason: collision with root package name */
    public final vp.u f438747m;

    /* renamed from: n, reason: collision with root package name */
    public final vp.b f438748n;

    /* renamed from: o, reason: collision with root package name */
    public final vp.d0 f438749o;

    /* renamed from: p, reason: collision with root package name */
    public final zp.i f438750p;

    /* renamed from: q, reason: collision with root package name */
    public final zp.e f438751q;

    /* renamed from: r, reason: collision with root package name */
    public long f438752r;

    /* renamed from: s, reason: collision with root package name */
    public long f438753s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f438754t;

    /* renamed from: v, reason: collision with root package name */
    public long f438756v;

    /* renamed from: w, reason: collision with root package name */
    public long f438757w;

    /* renamed from: x, reason: collision with root package name */
    public long f438758x;

    /* renamed from: y, reason: collision with root package name */
    public int f438759y;

    /* renamed from: z, reason: collision with root package name */
    public int f438760z;
    public static final java.text.DecimalFormat T = new java.text.DecimalFormat("00.00");
    public static final java.text.DecimalFormat U = new java.text.DecimalFormat("00");
    public static final java.text.SimpleDateFormat X = new java.text.SimpleDateFormat("yy年M月d日 hh:mm:ss");
    public static final java.util.Date Y = new java.util.Date();

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f438742e = true;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f438755u = true;
    public final java.util.Queue H = new java.util.concurrent.LinkedBlockingDeque();
    public final java.util.List I = new java.util.LinkedList();
    public wp.e P = null;
    public android.graphics.Paint Q = null;
    public boolean R = false;
    public boolean S = false;

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        Z = sb6;
        f438738p0 = new java.util.Formatter(sb6, java.util.Locale.getDefault());
        new android.graphics.Paint().setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        f438739x0 = new vp.i(android.os.Looper.getMainLooper());
    }

    public d(android.view.View view, xp.d dVar) {
        boolean z17;
        boolean z18;
        this.f438741d = "";
        this.M = 0;
        this.G = dVar;
        java.lang.String str = dVar.f455841i + "_DanmakuController";
        this.f438741d = str;
        xp.a aVar = dVar.f455840h;
        if (aVar != null) {
            z17 = aVar.f455814l;
            z18 = aVar.f455816n;
        } else {
            z17 = false;
            z18 = false;
        }
        yp.j a17 = yp.g.a(view, this, z17, z18);
        this.f438745h = a17;
        if (a17 == null) {
            throw new java.lang.RuntimeException("root view not a IDanmakuView");
        }
        a17.a(this);
        a17.setOnTouchListener(this);
        zp.i iVar = new zp.i();
        this.f438750p = iVar;
        zp.e eVar = new zp.e();
        this.f438751q = eVar;
        vp.b bVar = new vp.b();
        this.f438748n = bVar;
        this.f438749o = new vp.d0(dVar);
        vp.v vVar = new vp.v();
        this.f438746i = new vp.t(iVar, vVar);
        this.f438740J = new vp.z0(dVar, bVar, vVar, iVar, eVar);
        this.f438747m = new vp.u(dVar);
        vp.g0 g0Var = new vp.g0(this);
        this.L = g0Var;
        if (a17 instanceof yp.l) {
            g0Var.f438777e = 1;
        } else {
            xp.a aVar2 = dVar.f455840h;
            if (aVar2 != null) {
                g0Var.f438777e = aVar2.f455811i;
            }
        }
        if (aVar == null || !aVar.f455817o) {
            if (a17 instanceof yp.l) {
                this.M = 0;
            } else {
                this.M = 1;
            }
            com.tencent.mars.xlog.Log.i(str, "initUpdateMethod mUpdateMethod:" + this.M);
        } else {
            this.M = 0;
        }
        if (this.M == 0) {
            this.N = new vp.j(this, null);
        }
    }

    public static java.lang.String j(long j17) {
        if (j17 >= 86400000) {
            java.util.Date date = Y;
            date.setTime(j17);
            return X.format(date);
        }
        long j18 = j17 / 1000;
        long j19 = j18 % 60;
        long j27 = (j18 / 60) % 60;
        long j28 = j18 / 3600;
        if (j19 < 0) {
            j19 = 0;
        }
        if (j27 < 0) {
            j27 = 0;
        }
        if (j28 < 0) {
            j28 = 0;
        }
        Z.setLength(0);
        java.util.Formatter formatter = f438738p0;
        return j28 > 0 ? formatter.format("%d:%02d:%02d", java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j19)).toString() : formatter.format("%02d:%02d", java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j19)).toString();
    }

    @Override // vp.w0
    public int E6() {
        vp.t tVar = this.f438746i;
        if (tVar != null) {
            return tVar.f438831b.f474921d;
        }
        return 0;
    }

    @Override // vp.w0
    public void G1(wp.a aVar) {
        vp.z0 z0Var = (vp.z0) this.f438740J;
        for (int i17 = 0; i17 < z0Var.f438876k; i17++) {
            wp.a[] aVarArr = z0Var.f438878m;
            if (aVarArr[i17] == aVar) {
                aVarArr[i17] = null;
            }
        }
        int size = ((java.util.ArrayList) z0Var.f438879n).size();
        for (int i18 = 0; i18 < size; i18++) {
            java.util.Iterator it = ((java.util.List) ((java.util.ArrayList) z0Var.f438879n).get(i18)).iterator();
            while (it.hasNext()) {
                wp.a aVar2 = (wp.a) it.next();
                if (aVar2 == aVar) {
                    it.remove();
                    z0Var.f438721a--;
                    ((java.util.LinkedList) z0Var.f438723c).add(aVar2);
                }
            }
        }
    }

    @Override // vp.w0
    public void L4(wp.e eVar) {
        vp.g0 g0Var = this.L;
        g0Var.getClass();
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 15;
        obtain.obj = eVar;
        if (g0Var.a()) {
            g0Var.f438773a.sendMessage(obtain);
        }
    }

    @Override // vp.w0
    public void N1(wp.a aVar, yp.o oVar) {
        vp.a aVar2 = this.f438740J;
        aVar2.getClass();
        aVar.f448353x = true;
        aVar.f448352w = true;
        float f17 = aVar.f448338i;
        vp.d0.e(aVar2.f438725e, aVar, oVar);
        float h17 = (aVar.f448338i + aVar.h()) / (f17 + aVar.h());
        aVar.f448334e.f474913a = ((float) r3.f474913a) * h17;
    }

    @Override // vp.w0
    public void U4() {
        vp.t tVar = this.f438746i;
        if (tVar != null) {
            tVar.b();
        }
    }

    @Override // vp.w0
    public void Z4(xp.d dVar) {
        vp.g0 g0Var = this.L;
        this.G.getClass();
        g0Var.c(0);
        vp.g0 g0Var2 = this.L;
        g0Var2.getClass();
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 7;
        obtain.obj = dVar;
        if (g0Var2.a()) {
            g0Var2.f438773a.sendMessage(obtain);
        }
    }

    @Override // yp.i
    public void a() {
        yp.b bVar = this.f438740J.f438724d;
        if (bVar.f464372a) {
            com.tencent.mars.xlog.Log.i("DanmakuDrawer", java.lang.String.format("set AsyncDrawContextValid:%b", java.lang.Boolean.FALSE));
        }
        bVar.f464372a = false;
        this.f438744g = false;
        r();
        if (!this.f438742e) {
            this.L.b(14);
        }
        com.tencent.mars.xlog.Log.i("surface_lock", "surfaceDestroyed mIsQuited:" + this.f438742e);
    }

    @Override // yp.i
    public void b() {
        com.tencent.mars.xlog.Log.i("surface_lock", "surfaceCreated");
    }

    @Override // yp.i
    public void c() {
        com.tencent.mars.xlog.Log.i("surface_lock", "surfaceChanged");
        this.f438744g = true;
        yp.b bVar = this.f438740J.f438724d;
        if (!bVar.f464372a) {
            com.tencent.mars.xlog.Log.i("DanmakuDrawer", java.lang.String.format("set AsyncDrawContextValid:%b", java.lang.Boolean.TRUE));
        }
        bVar.f464372a = true;
        if (isPlaying()) {
            vp.g0 g0Var = this.L;
            if (g0Var.a()) {
                g0Var.f438773a.removeMessages(4);
                g0Var.f438773a.sendEmptyMessage(4);
            }
        }
    }

    @Override // vp.w0
    public void clear() {
        this.L.b(9);
        U4();
    }

    public final boolean d(wp.a aVar, zp.m mVar) {
        if (aVar == null) {
            this.K.a(false);
            return false;
        }
        float e17 = aVar.e();
        float f17 = aVar.f();
        mVar.f474925d = e17;
        mVar.f474926e = f17;
        zp.d r17 = aVar.r(mVar);
        if (!((this.f438744g && !this.f438742e) && r17.f474907a != -1)) {
            this.K.a(false);
            return false;
        }
        this.K.a(true);
        r17.getClass();
        this.K.b(aVar, mVar, r17);
        return true;
    }

    public final void e() {
        java.lang.StringBuilder sb6;
        yp.j jVar = this.f438745h;
        android.graphics.Canvas canvas = null;
        try {
            canvas = jVar.lockCanvas();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("clearDrawing lockCanvas ");
            sb7.append(canvas == null ? "null" : java.lang.Integer.valueOf(canvas.hashCode()));
            com.tencent.mars.xlog.Log.i("surface_lock", sb7.toString());
            if (canvas != null) {
                canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            }
            if (canvas != null) {
                try {
                    jVar.unlockCanvasAndPost(canvas);
                    com.tencent.mars.xlog.Log.i("surface_lock", "clearDrawing unlockCanvas " + canvas.hashCode());
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    sb6 = new java.lang.StringBuilder("clearDrawing unlockCanvasAndPost exception: ");
                    sb6.append(canvas.hashCode());
                    sb6.append(th);
                    com.tencent.mars.xlog.Log.e("surface_lock", sb6.toString());
                }
            }
        } catch (java.lang.Throwable th7) {
            try {
                com.tencent.mars.xlog.Log.e("surface_lock", "clearDrawing lockCanvas exception: " + canvas.hashCode() + th7);
                try {
                    jVar.unlockCanvasAndPost(canvas);
                    com.tencent.mars.xlog.Log.i("surface_lock", "clearDrawing unlockCanvas " + canvas.hashCode());
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    sb6 = new java.lang.StringBuilder("clearDrawing unlockCanvasAndPost exception: ");
                    sb6.append(canvas.hashCode());
                    sb6.append(th);
                    com.tencent.mars.xlog.Log.e("surface_lock", sb6.toString());
                }
            } catch (java.lang.Throwable th9) {
                if (canvas != null) {
                    try {
                        jVar.unlockCanvasAndPost(canvas);
                        com.tencent.mars.xlog.Log.i("surface_lock", "clearDrawing unlockCanvas " + canvas.hashCode());
                    } catch (java.lang.Throwable th10) {
                        com.tencent.mars.xlog.Log.e("surface_lock", "clearDrawing unlockCanvasAndPost exception: " + canvas.hashCode() + th10);
                    }
                }
                throw th9;
            }
        }
    }

    @Override // vp.w0
    public void f(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f438741d, "pause(), isImmediately=" + z17);
        if (z17) {
            if (this.L.f438777e == 1) {
                l();
                return;
            }
        }
        this.L.b(3);
    }

    @Override // vp.w0
    public void f0(boolean z17) {
        this.f438755u = z17;
    }

    @Override // vp.w0
    public wp.a f5(int i17, java.lang.Object obj) {
        return this.f438747m.a(i17, obj);
    }

    public final boolean g() {
        boolean z17;
        android.graphics.Canvas canvas;
        java.lang.StringBuilder sb6;
        vp.z0 z0Var = (vp.z0) this.f438740J;
        int size = ((java.util.ArrayList) z0Var.f438879n).size();
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                z17 = false;
                break;
            }
            if (((java.util.List) ((java.util.ArrayList) z0Var.f438879n).get(i17)).size() > 0) {
                z17 = true;
                break;
            }
            i17++;
        }
        if (!z17) {
            if (this.S) {
                e();
            }
            this.S = false;
            return true;
        }
        this.S = true;
        try {
            canvas = this.f438745h.lockCanvas();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("surface_lock", "draw exception " + ((java.lang.Object) "null") + th6);
            canvas = null;
        }
        if (canvas != null) {
            try {
                if (this.f438744g) {
                    canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                    this.f438740J.b(canvas, this.f438750p.f474914a, this.f438745h.getView());
                    i(canvas);
                    h(canvas);
                }
                try {
                    q(canvas);
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    sb6 = new java.lang.StringBuilder("unlockCanvas exception ");
                    sb6.append(canvas.hashCode());
                    sb6.append(th);
                    com.tencent.mars.xlog.Log.e("surface_lock", sb6.toString());
                    return true;
                }
            } catch (java.lang.Throwable th8) {
                try {
                    com.tencent.mars.xlog.Log.e("surface_lock", "draw exception " + java.lang.Integer.valueOf(canvas.hashCode()) + th8);
                    try {
                        q(canvas);
                    } catch (java.lang.Throwable th9) {
                        th = th9;
                        sb6 = new java.lang.StringBuilder("unlockCanvas exception ");
                        sb6.append(canvas.hashCode());
                        sb6.append(th);
                        com.tencent.mars.xlog.Log.e("surface_lock", sb6.toString());
                        return true;
                    }
                } catch (java.lang.Throwable th10) {
                    try {
                        q(canvas);
                    } catch (java.lang.Throwable th11) {
                        com.tencent.mars.xlog.Log.e("surface_lock", "unlockCanvas exception " + canvas.hashCode() + th11);
                    }
                    throw th10;
                }
            }
        } else if (this.f438744g) {
            this.f438740J.b(null, this.f438750p.f474914a, this.f438745h.getView());
        }
        return true;
    }

    public final void h(android.graphics.Canvas canvas) {
        if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            long j17 = uptimeMillis - this.f438756v;
            this.f438759y++;
            this.A = (int) (this.A + j17);
            if (j17 > 17) {
                this.f438760z++;
                if (com.tencent.mars.xlog.Log.getLogLevel() <= 0) {
                    com.tencent.mars.xlog.Log.w(this.f438741d, "a draw block:" + j17);
                }
            }
            vp.t tVar = this.f438746i;
            wp.a aVar = (wp.a) tVar.f438831b.f474918a.f474916b.f474915a;
            if (this.f438759y % 60 != 1) {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            } else {
                this.C = java.lang.Math.max(this.C, this.f438757w - this.f438756v);
                this.B = java.lang.Math.max(this.B, this.f438758x - this.f438757w);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(com.tencent.mars.xlog.Log.getLogLevel());
                sb6.append(",t:");
                sb6.append(j(android.os.SystemClock.uptimeMillis()));
                sb6.append(",f:");
                long j18 = this.f438751q.f474909b;
                if (j18 == 0) {
                    j18 = 1;
                }
                sb6.append(1000 / j18);
                sb6.append(",ds:");
                sb6.append(this.f438740J.f438721a);
                sb6.append(",ts:");
                sb6.append(tVar.f438831b.f474921d);
                sb6.append(",mt:");
                java.text.DecimalFormat decimalFormat = U;
                sb6.append(decimalFormat.format(this.f438757w - this.f438756v));
                sb6.append(",lt:");
                sb6.append(decimalFormat.format(this.f438758x - this.f438757w));
                sb6.append(",dt:");
                sb6.append(decimalFormat.format(uptimeMillis - this.f438758x));
                sb6.append(",tt:");
                sb6.append(decimalFormat.format(j17));
                sb6.append(",jc:");
                sb6.append(this.f438760z);
                sb6.append(",mlt:");
                sb6.append(this.B);
                sb6.append(",mmt:");
                sb6.append(this.C);
                sb6.append(",jp:");
                java.text.DecimalFormat decimalFormat2 = T;
                sb6.append(decimalFormat2.format((this.f438760z * 100.0f) / this.f438759y));
                sb6.append("%,at:");
                sb6.append(decimalFormat2.format(this.A / this.f438759y));
                sb6.append(",fd:");
                sb6.append(aVar == null ? "null" : j(aVar.f448335f));
                sb6.append(",cs:");
                vp.b bVar = this.f438748n;
                sb6.append(decimalFormat2.format((bVar.f438732a.f474904d / 1024.0f) / 1024.0f));
                sb6.append(",uc:");
                zp.c cVar = bVar.f438732a;
                sb6.append(decimalFormat2.format((cVar.f474906f * 100.0f) / cVar.f474905e));
                this.D = sb6.toString();
            }
            java.lang.String str2 = this.D;
            if (str2 != null) {
                if (V == null) {
                    android.graphics.Paint paint = new android.graphics.Paint();
                    V = paint;
                    paint.setColor(-256);
                    V.setTextSize(xp.d.b().getResources().getDisplayMetrics().density * 12.5f);
                    android.graphics.Paint.FontMetrics fontMetrics = V.getFontMetrics();
                    W = (int) java.lang.Math.ceil(fontMetrics.descent - fontMetrics.ascent);
                }
                canvas.drawText(str2, 10.0f, canvas.getHeight() - W, V);
            }
        }
    }

    @Override // vp.w0
    public void h5() {
        com.tencent.mars.xlog.Log.i(this.f438741d, "clearDrawingCache()");
        this.L.b(11);
    }

    public final void i(android.graphics.Canvas canvas) {
        wp.e eVar;
        if (canvas == null || (eVar = this.P) == null || eVar.f448358a == null) {
            return;
        }
        if (this.Q == null) {
            android.graphics.Paint paint = new android.graphics.Paint(1);
            this.Q = paint;
            paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        }
        wp.e eVar2 = this.P;
        canvas.drawBitmap(eVar2.f448358a, eVar2.f448359b, eVar2.f448360c, this.Q);
    }

    @Override // vp.w0
    public void i6(vp.w wVar) {
        this.K = wVar;
    }

    @Override // vp.w0
    public boolean isPlaying() {
        return !this.f438742e && this.f438743f;
    }

    @Override // vp.w0
    public void j5() {
        vp.g0 g0Var = this.L;
        this.G.getClass();
        g0Var.c(0);
        this.L.b(7);
    }

    public boolean k() {
        boolean z17 = false;
        if (this.K != null) {
            while (true) {
                java.util.Queue queue = this.H;
                if (queue.isEmpty()) {
                    break;
                }
                zp.m mVar = (zp.m) ((java.util.concurrent.LinkedBlockingDeque) queue).poll();
                wp.a c17 = this.f438740J.c(mVar);
                if (com.tencent.mars.xlog.Log.getLogLevel() <= 0) {
                    java.util.Objects.toString(mVar);
                    android.os.SystemClock.uptimeMillis();
                }
                if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
                    z17 = d(c17, mVar);
                } else {
                    f438739x0.post(new vp.f(this, c17, mVar));
                }
            }
        }
        return z17;
    }

    @Override // vp.w0
    public void k0(wp.a aVar, boolean z17) {
        if (z17) {
            aVar.f448335f = this.f438750p.f474914a;
        }
        com.tencent.mars.xlog.Log.i(this.f438741d, "addNow: danmaku time = " + aVar.f448335f + " usePlayTime = " + z17);
        this.f438749o.d(aVar, new vp.g(this));
    }

    @Override // vp.w0
    public void k1(java.util.List list, boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i(this.f438741d, "addLastAll: size = " + list.size() + ", needPreMeasure = " + z17 + ", uiThreadBindInPreMeasure = " + z18);
        if (z17) {
            this.f438749o.c(list, java.lang.Boolean.valueOf(z18), new vp.h(this));
        } else {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f438746i.a((wp.a) it.next());
            }
        }
    }

    public void l() {
        com.tencent.mars.xlog.Log.i(this.f438741d, "handlePause()");
        r();
        this.f438743f = false;
        this.f438753s = this.G.g() ? this.f438750p.f474914a : this.f438751q.f474908a;
        com.tencent.mars.xlog.Log.getLogLevel();
    }

    public void m() {
        com.tencent.mars.xlog.Log.i(this.f438741d, "handleResume()");
        if (!this.f438743f) {
            this.f438752r = android.os.SystemClock.uptimeMillis() - this.f438753s;
            com.tencent.mars.xlog.Log.getLogLevel();
            zp.e eVar = this.f438751q;
            eVar.getClass();
            eVar.f474910c = android.os.SystemClock.uptimeMillis();
        }
        this.f438743f = true;
        this.D = null;
        if (isPlaying()) {
            vp.g0 g0Var = this.L;
            if (g0Var.a()) {
                g0Var.f438773a.removeMessages(4);
                g0Var.f438773a.sendEmptyMessage(4);
            }
        }
        com.tencent.mars.xlog.Log.getLogLevel();
    }

    @Override // vp.w0
    public void n(long j17) {
        vp.g0 g0Var = this.L;
        this.G.getClass();
        g0Var.c(0);
        vp.g0 g0Var2 = this.L;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        g0Var2.getClass();
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 1;
        obtain.obj = valueOf;
        if (g0Var2.a()) {
            g0Var2.f438773a.sendMessage(obtain);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vp.d.o():void");
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (this.f438755u) {
            if (com.tencent.mars.xlog.Log.getLogLevel() <= 0) {
                java.util.Objects.toString(motionEvent);
            }
            if ((motionEvent.getAction() & 255) == 0) {
                y5(new android.graphics.Point((int) motionEvent.getX(), (int) motionEvent.getY()), 0);
            }
        }
        return false;
    }

    public final void p() {
        java.util.List<wp.a> list = this.I;
        vp.a aVar = this.f438740J;
        ((java.util.LinkedList) list).addAll(aVar.f438723c);
        ((java.util.LinkedList) aVar.f438723c).clear();
        for (wp.a aVar2 : list) {
            android.graphics.Bitmap bitmap = aVar2.f448343n;
            if (bitmap != null) {
                aVar2.f448343n = null;
                aVar2.f448344o.setBitmap(null);
                this.f438748n.f438732a.b(bitmap);
            }
        }
        vp.w wVar = this.K;
        if (wVar != null) {
            wVar.c(list);
        }
        for (final wp.a aVar3 : list) {
            this.G.c(aVar3).h(aVar3, true, new java.lang.Runnable() { // from class: vp.d$$a
                @Override // java.lang.Runnable
                public final void run() {
                    vp.d.this.f438747m.b(aVar3);
                }
            });
        }
        ((java.util.LinkedList) list).clear();
    }

    @Override // vp.w0
    public void postInvalidate() {
        com.tencent.mars.xlog.Log.i(this.f438741d, "postInvalidate()");
        android.os.Handler handler = this.L.f438773a;
        if (handler != null) {
            handler.removeMessages(13);
        }
        this.L.b(13);
    }

    public final void q(android.graphics.Canvas canvas) {
        if (canvas != null) {
            if (this.f438744g) {
                this.f438745h.unlockCanvasAndPost(canvas);
            } else {
                this.f438745h.unlock();
            }
        }
    }

    @Override // vp.w0
    public void quit() {
        this.f438742e = true;
        yp.b bVar = this.f438740J.f438724d;
        if (bVar.f464372a) {
            com.tencent.mars.xlog.Log.i("DanmakuDrawer", java.lang.String.format("set AsyncDrawContextValid:%b", java.lang.Boolean.FALSE));
        }
        bVar.f464372a = false;
        this.L.b(6);
        if (this.M == 0 && this.N != null) {
            android.view.Choreographer.getInstance().removeFrameCallback(this.N);
        }
        r();
    }

    public final void r() {
        android.os.Handler handler = this.L.f438773a;
        if (handler != null) {
            handler.removeMessages(4);
        }
    }

    @Override // vp.w0
    public void release() {
        if (!this.f438742e) {
            quit();
        }
        this.L.b(8);
        this.K = null;
    }

    @Override // vp.w0
    public void resume() {
        this.L.b(2);
    }

    public final void s(long j17) {
        if (this.M == 0 && this.N != null) {
            return;
        }
        r();
        if (this.f438744g && !this.f438742e && this.f438743f) {
            vp.g0 g0Var = this.L;
            if (g0Var.a()) {
                g0Var.f438773a.removeMessages(4);
                g0Var.f438773a.sendEmptyMessageDelayed(4, j17);
            }
        }
    }

    @Override // vp.w0
    public void seek(long j17) {
        vp.g0 g0Var = this.L;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        g0Var.getClass();
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 5;
        obtain.obj = valueOf;
        if (g0Var.a()) {
            g0Var.f438773a.sendMessage(obtain);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[EDGE_INSN: B:16:0x0050->B:17:0x0050 BREAK  A[LOOP:0: B:2:0x0015->B:14:0x0048], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vp.d.t():void");
    }

    @Override // vp.w0
    public void t2() {
        this.R = true;
    }

    @Override // vp.w0
    public java.util.List t6() {
        vp.a aVar = this.f438740J;
        if (aVar instanceof vp.z0) {
            return ((vp.z0) aVar).f438879n;
        }
        return null;
    }

    @Override // vp.w0
    public void v0(wp.a aVar, boolean z17) {
    }

    @Override // vp.w0
    public boolean y5(android.graphics.Point point, int i17) {
        point.y = (int) (point.y - this.f438745h.b());
        zp.m mVar = new zp.m(this.f438751q.f474908a, point, i17);
        if (com.tencent.mars.xlog.Log.getLogLevel() <= 0) {
            mVar.toString();
        }
        ((java.util.concurrent.LinkedBlockingDeque) this.H).add(mVar);
        boolean z17 = false;
        if (this.L.f438777e == 1) {
            return k();
        }
        try {
            if (this.f438740J.c(mVar) != null) {
                z17 = true;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f438741d, "addClickPoint:" + e17);
        }
        this.L.b(10);
        return z17;
    }
}
