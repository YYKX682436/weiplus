package vp;

/* loaded from: classes16.dex */
public class k implements vp.w0, yp.i {
    public static android.graphics.Paint U;
    public static int V;
    public static final java.lang.StringBuilder Y;
    public static final java.util.Formatter Z;

    /* renamed from: p0, reason: collision with root package name */
    public static final android.os.Handler f438786p0;
    public long A;
    public long B;
    public java.lang.String C;
    public long D;
    public long E;
    public xp.d F;
    public final vp.x0 I;

    /* renamed from: J, reason: collision with root package name */
    public vp.w f438787J;
    public vp.j0 K;
    public int L;
    public vp.r M;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f438789e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f438790f;

    /* renamed from: g, reason: collision with root package name */
    public final yp.j f438791g;

    /* renamed from: h, reason: collision with root package name */
    public final vp.v0 f438792h;

    /* renamed from: i, reason: collision with root package name */
    public final vp.u f438793i;

    /* renamed from: m, reason: collision with root package name */
    public final vp.b f438794m;

    /* renamed from: n, reason: collision with root package name */
    public final vp.d0 f438795n;

    /* renamed from: o, reason: collision with root package name */
    public final zp.i f438796o;

    /* renamed from: p, reason: collision with root package name */
    public final zp.e f438797p;

    /* renamed from: q, reason: collision with root package name */
    public long f438798q;

    /* renamed from: r, reason: collision with root package name */
    public long f438799r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f438800s;

    /* renamed from: u, reason: collision with root package name */
    public long f438802u;

    /* renamed from: v, reason: collision with root package name */
    public long f438803v;

    /* renamed from: w, reason: collision with root package name */
    public long f438804w;

    /* renamed from: x, reason: collision with root package name */
    public int f438805x;

    /* renamed from: y, reason: collision with root package name */
    public int f438806y;

    /* renamed from: z, reason: collision with root package name */
    public int f438807z;
    public static final java.text.DecimalFormat S = new java.text.DecimalFormat("00.00");
    public static final java.text.DecimalFormat T = new java.text.DecimalFormat("00");
    public static final java.text.SimpleDateFormat W = new java.text.SimpleDateFormat("yy年M月d日 hh:mm:ss");
    public static final java.util.Date X = new java.util.Date();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f438788d = true;

    /* renamed from: t, reason: collision with root package name */
    public volatile boolean f438801t = true;
    public final java.util.Queue G = new java.util.concurrent.LinkedBlockingDeque();
    public final java.util.List H = new java.util.LinkedList();
    public wp.e N = null;
    public android.graphics.Paint P = null;
    public boolean Q = false;
    public boolean R = false;

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        Y = sb6;
        Z = new java.util.Formatter(sb6, java.util.Locale.getDefault());
        new android.graphics.Paint().setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        f438786p0 = new vp.q(android.os.Looper.getMainLooper());
    }

    public k(android.view.View view, xp.d dVar) {
        boolean z17;
        boolean z18;
        this.L = 0;
        this.F = dVar;
        xp.a aVar = dVar.f455840h;
        if (aVar != null) {
            z17 = aVar.f455814l;
            z18 = aVar.f455816n;
        } else {
            z17 = false;
            z18 = false;
        }
        yp.j a17 = yp.g.a(view, this, z17, z18);
        this.f438791g = a17;
        if (a17 == null) {
            throw new java.lang.RuntimeException("root view not a IDanmakuView");
        }
        a17.a(this);
        a17.setOnTouchListener(this);
        zp.i iVar = new zp.i();
        this.f438796o = iVar;
        zp.e eVar = new zp.e();
        this.f438797p = eVar;
        vp.b bVar = new vp.b();
        this.f438794m = bVar;
        this.f438795n = new vp.d0(dVar);
        this.f438792h = new vp.v0();
        this.I = new vp.y0(dVar, bVar, iVar, eVar);
        this.f438793i = new vp.u(dVar);
        vp.j0 j0Var = new vp.j0(this);
        this.K = j0Var;
        if (a17 instanceof yp.l) {
            j0Var.f438785e = 1;
        } else {
            xp.a aVar2 = dVar.f455840h;
            if (aVar2 != null) {
                j0Var.f438785e = aVar2.f455811i;
            }
        }
        if (aVar == null || !aVar.f455817o) {
            if (a17 instanceof yp.l) {
                this.L = 0;
            } else {
                this.L = 1;
            }
            com.tencent.mars.xlog.Log.i("DanmakuControllerAsync", "initUpdateMethod mUpdateMethod:" + this.L);
        } else {
            this.L = 0;
        }
        if (this.L == 0) {
            this.M = new vp.r(this, null);
        }
    }

    public static java.lang.String j(long j17) {
        if (j17 >= 86400000) {
            java.util.Date date = X;
            date.setTime(j17);
            return W.format(date);
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
        Y.setLength(0);
        java.util.Formatter formatter = Z;
        return j28 > 0 ? formatter.format("%d:%02d:%02d", java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j19)).toString() : formatter.format("%02d:%02d", java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j19)).toString();
    }

    @Override // vp.w0
    public int E6() {
        vp.v0 v0Var = this.f438792h;
        if (v0Var != null) {
            return ((java.util.ArrayList) v0Var.f438841c).size();
        }
        return 0;
    }

    @Override // vp.w0
    public void G1(wp.a danmaku) {
        java.util.List list;
        vp.v0 v0Var = this.f438792h;
        v0Var.getClass();
        kotlin.jvm.internal.o.g(danmaku, "danmaku");
        synchronized (v0Var.f438840b) {
            v0Var.f438840b.remove(danmaku);
        }
        v0Var.f438842d.writeLock().lock();
        try {
            java.util.Iterator it = ((java.util.ArrayList) v0Var.f438841c).iterator();
            while (it.hasNext()) {
                ((java.util.List) it.next()).remove(danmaku);
            }
            v0Var.f438842d.writeLock().unlock();
            vp.y0 y0Var = (vp.y0) this.I;
            int size = ((java.util.ArrayList) y0Var.f438867k).size();
            int i17 = 0;
            while (true) {
                list = y0Var.f438854b;
                if (i17 >= size) {
                    break;
                }
                java.util.Iterator it6 = ((java.util.List) ((java.util.ArrayList) y0Var.f438867k).get(i17)).iterator();
                while (it6.hasNext()) {
                    wp.a aVar = (wp.a) it6.next();
                    if (aVar == danmaku) {
                        it6.remove();
                        y0Var.f438853a--;
                        ((java.util.LinkedList) list).add(aVar);
                        aVar.x(false);
                    }
                }
                i17++;
            }
            if (y0Var.f438868l == null) {
                return;
            }
            for (int i18 = 0; i18 < ((java.util.ArrayList) y0Var.f438868l).size(); i18++) {
                java.util.Iterator it7 = ((java.util.List) ((java.util.ArrayList) y0Var.f438868l).get(i18)).iterator();
                while (it7.hasNext()) {
                    wp.a aVar2 = (wp.a) it7.next();
                    if (aVar2 == danmaku) {
                        it7.remove();
                        y0Var.f438853a--;
                        ((java.util.LinkedList) list).add(aVar2);
                        aVar2.x(false);
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            v0Var.f438842d.writeLock().unlock();
            throw th6;
        }
    }

    @Override // vp.w0
    public void L4(wp.e eVar) {
        vp.j0 j0Var = this.K;
        j0Var.getClass();
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 15;
        obtain.obj = eVar;
        if (j0Var.a()) {
            j0Var.f438781a.sendMessage(obtain);
        }
    }

    @Override // vp.w0
    public void N1(wp.a aVar, yp.o oVar) {
        vp.x0 x0Var = this.I;
        x0Var.getClass();
        aVar.f448353x = true;
        aVar.f448352w = true;
        float f17 = aVar.f448338i;
        vp.d0.e(x0Var.f438856d, aVar, oVar);
        float h17 = (aVar.f448338i + aVar.h()) / (f17 + aVar.h());
        aVar.f448334e.f474913a = ((float) r3.f474913a) * h17;
    }

    @Override // vp.w0
    public void U4() {
        vp.v0 v0Var = this.f438792h;
        if (v0Var != null) {
            kotlinx.coroutines.l.d(v0Var.f438849k, null, null, new vp.p0(v0Var, null), 3, null);
        }
    }

    @Override // vp.w0
    public void Z4(xp.d dVar) {
        vp.j0 j0Var = this.K;
        this.F.getClass();
        j0Var.c(0);
        vp.j0 j0Var2 = this.K;
        j0Var2.getClass();
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 7;
        obtain.obj = dVar;
        if (j0Var2.a()) {
            j0Var2.f438781a.sendMessage(obtain);
        }
    }

    @Override // yp.i
    public void a() {
        yp.b bVar = this.I.f438855c;
        if (bVar.f464372a) {
            com.tencent.mars.xlog.Log.i("DanmakuDrawer", java.lang.String.format("set AsyncDrawContextValid:%b", java.lang.Boolean.FALSE));
        }
        bVar.f464372a = false;
        this.f438790f = false;
        r();
        if (!this.f438788d) {
            this.K.b(14);
        }
        com.tencent.mars.xlog.Log.i("surface_lock", "surfaceDestroyed mIsQuited:" + this.f438788d);
    }

    @Override // yp.i
    public void b() {
        com.tencent.mars.xlog.Log.i("surface_lock", "surfaceCreated");
    }

    @Override // yp.i
    public void c() {
        com.tencent.mars.xlog.Log.i("surface_lock", "surfaceChanged");
        this.f438790f = true;
        yp.b bVar = this.I.f438855c;
        if (!bVar.f464372a) {
            com.tencent.mars.xlog.Log.i("DanmakuDrawer", java.lang.String.format("set AsyncDrawContextValid:%b", java.lang.Boolean.TRUE));
        }
        bVar.f464372a = true;
        if (isPlaying()) {
            vp.j0 j0Var = this.K;
            if (j0Var.a()) {
                j0Var.f438781a.removeMessages(4);
                j0Var.f438781a.sendEmptyMessage(4);
            }
        }
    }

    @Override // vp.w0
    public void clear() {
        this.K.b(9);
        U4();
    }

    public final boolean d(wp.a aVar, zp.m mVar) {
        if (aVar == null) {
            this.f438787J.a(false);
            return false;
        }
        float e17 = aVar.e();
        float f17 = aVar.f();
        mVar.f474925d = e17;
        mVar.f474926e = f17;
        zp.d r17 = aVar.r(mVar);
        if (!((this.f438790f && !this.f438788d) && r17.f474907a != -1)) {
            this.f438787J.a(false);
            return false;
        }
        this.f438787J.a(true);
        r17.getClass();
        this.f438787J.b(aVar, mVar, r17);
        return true;
    }

    public final void e() {
        java.lang.StringBuilder sb6;
        yp.j jVar = this.f438791g;
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
        com.tencent.mars.xlog.Log.i("DanmakuControllerAsync", "pause(), isImmediately=" + z17);
        if (z17) {
            if (this.K.f438785e == 1) {
                m();
                return;
            }
        }
        this.K.b(3);
    }

    @Override // vp.w0
    public void f0(boolean z17) {
        this.f438801t = z17;
    }

    @Override // vp.w0
    public wp.a f5(int i17, java.lang.Object obj) {
        return this.f438793i.a(i17, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
    
        r2 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vp.k.g():boolean");
    }

    public final void h(android.graphics.Canvas canvas) {
        if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            long j17 = uptimeMillis - this.f438802u;
            this.f438805x++;
            this.f438807z = (int) (this.f438807z + j17);
            if (j17 > 17) {
                this.f438806y++;
                if (com.tencent.mars.xlog.Log.getLogLevel() <= 0) {
                    com.tencent.mars.xlog.Log.w("DanmakuControllerAsync", "a draw block:" + j17);
                }
            }
            vp.v0 v0Var = this.f438792h;
            java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = v0Var.f438842d;
            reentrantReadWriteLock.readLock().lock();
            java.util.List list = v0Var.f438841c;
            try {
                java.util.List list2 = (java.util.List) kz5.n0.Z(list);
                wp.a aVar = list2 != null ? (wp.a) kz5.n0.Z(list2) : null;
                if (aVar == null) {
                    com.tencent.mars.xlog.Log.w("DanmakuControllerAsync", "dataSource is Empty");
                    return;
                }
                if (this.f438805x % 60 != 1) {
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                } else {
                    this.B = java.lang.Math.max(this.B, this.f438803v - this.f438802u);
                    this.A = java.lang.Math.max(this.A, this.f438804w - this.f438803v);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(com.tencent.mars.xlog.Log.getLogLevel());
                    sb6.append(",t:");
                    sb6.append(j(android.os.SystemClock.uptimeMillis()));
                    sb6.append(",f:");
                    long j18 = this.f438797p.f474909b;
                    if (j18 == 0) {
                        j18 = 1;
                    }
                    sb6.append(1000 / j18);
                    sb6.append(",ds:");
                    sb6.append(this.I.f438853a);
                    sb6.append(",ts:");
                    sb6.append(((java.util.ArrayList) list).size());
                    sb6.append(",mt:");
                    java.text.DecimalFormat decimalFormat = T;
                    sb6.append(decimalFormat.format(this.f438803v - this.f438802u));
                    sb6.append(",lt:");
                    sb6.append(decimalFormat.format(this.f438804w - this.f438803v));
                    sb6.append(",dt:");
                    sb6.append(decimalFormat.format(uptimeMillis - this.f438804w));
                    sb6.append(",tt:");
                    sb6.append(decimalFormat.format(j17));
                    sb6.append(",jc:");
                    sb6.append(this.f438806y);
                    sb6.append(",mlt:");
                    sb6.append(this.A);
                    sb6.append(",mmt:");
                    sb6.append(this.B);
                    sb6.append(",jp:");
                    java.text.DecimalFormat decimalFormat2 = S;
                    sb6.append(decimalFormat2.format((this.f438806y * 100.0f) / this.f438805x));
                    sb6.append("%,at:");
                    sb6.append(decimalFormat2.format(this.f438807z / this.f438805x));
                    sb6.append(",fd:");
                    sb6.append(j(aVar.f448335f));
                    sb6.append(",cs:");
                    vp.b bVar = this.f438794m;
                    sb6.append(decimalFormat2.format((bVar.f438732a.f474904d / 1024.0f) / 1024.0f));
                    sb6.append(",uc:");
                    zp.c cVar = bVar.f438732a;
                    sb6.append(decimalFormat2.format((cVar.f474906f * 100.0f) / cVar.f474905e));
                    this.C = sb6.toString();
                }
                java.lang.String str2 = this.C;
                if (str2 != null) {
                    if (U == null) {
                        android.graphics.Paint paint = new android.graphics.Paint();
                        U = paint;
                        paint.setColor(-256);
                        U.setTextSize(xp.d.b().getResources().getDisplayMetrics().density * 12.5f);
                        android.graphics.Paint.FontMetrics fontMetrics = U.getFontMetrics();
                        V = (int) java.lang.Math.ceil(fontMetrics.descent - fontMetrics.ascent);
                    }
                    canvas.drawText(str2, 10.0f, canvas.getHeight() - V, U);
                }
            } finally {
                reentrantReadWriteLock.readLock().unlock();
            }
        }
    }

    @Override // vp.w0
    public void h5() {
        com.tencent.mars.xlog.Log.i("DanmakuControllerAsync", "clearDrawingCache()");
        this.K.b(11);
    }

    public final void i(android.graphics.Canvas canvas) {
        wp.e eVar;
        if (canvas == null || (eVar = this.N) == null || eVar.f448358a == null) {
            return;
        }
        if (this.P == null) {
            android.graphics.Paint paint = new android.graphics.Paint(1);
            this.P = paint;
            paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        }
        wp.e eVar2 = this.N;
        canvas.drawBitmap(eVar2.f448358a, eVar2.f448359b, eVar2.f448360c, this.P);
    }

    @Override // vp.w0
    public void i6(vp.w wVar) {
        this.f438787J = wVar;
    }

    @Override // vp.w0
    public boolean isPlaying() {
        return !this.f438788d && this.f438789e;
    }

    @Override // vp.w0
    public void j5() {
        vp.j0 j0Var = this.K;
        this.F.getClass();
        j0Var.c(0);
        this.K.b(7);
    }

    public long k() {
        if (this.F.g()) {
            return android.os.SystemClock.uptimeMillis() - this.f438798q;
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        long j17 = this.D;
        if (uptimeMillis - j17 < 200 && !this.Q) {
            return (this.E + uptimeMillis) - j17;
        }
        this.Q = false;
        this.D = uptimeMillis;
        xp.g gVar = this.F.f455835c;
        long a17 = gVar == null ? -1L : gVar.a();
        this.E = a17;
        return a17;
    }

    @Override // vp.w0
    public void k0(wp.a aVar, boolean z17) {
        if (z17) {
            aVar.f448335f = this.f438796o.f474914a;
        }
        com.tencent.mars.xlog.Log.i("DanmakuControllerAsync", "addNow: danmaku time = " + aVar.f448335f + " usePlayTime = " + z17);
        this.f438795n.d(aVar, new vp.n(this));
    }

    @Override // vp.w0
    public void k1(java.util.List list, boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("DanmakuControllerAsync", "addLastAll: size = " + list.size() + ", needPreMeasure = " + z17 + ", uiThreadBindInPreMeasure = " + z18);
        this.f438795n.c(list, java.lang.Boolean.valueOf(z18), new vp.o(this));
    }

    public boolean l() {
        boolean z17 = false;
        if (this.f438787J != null) {
            while (true) {
                java.util.Queue queue = this.G;
                if (queue.isEmpty()) {
                    break;
                }
                zp.m mVar = (zp.m) ((java.util.concurrent.LinkedBlockingDeque) queue).poll();
                wp.a d17 = this.I.d(mVar);
                if (com.tencent.mars.xlog.Log.getLogLevel() <= 0) {
                    java.util.Objects.toString(mVar);
                    android.os.SystemClock.uptimeMillis();
                }
                if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
                    z17 = d(d17, mVar);
                } else {
                    f438786p0.post(new vp.m(this, d17, mVar));
                }
            }
        }
        return z17;
    }

    public void m() {
        com.tencent.mars.xlog.Log.i("DanmakuControllerAsync", "handlePause()");
        r();
        this.f438789e = false;
        this.f438799r = this.F.g() ? this.f438796o.f474914a : this.f438797p.f474908a;
        com.tencent.mars.xlog.Log.getLogLevel();
    }

    @Override // vp.w0
    public void n(long j17) {
        vp.j0 j0Var = this.K;
        this.F.getClass();
        j0Var.c(0);
        vp.j0 j0Var2 = this.K;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        j0Var2.getClass();
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 1;
        obtain.obj = valueOf;
        if (j0Var2.a()) {
            j0Var2.f438781a.sendMessage(obtain);
        }
    }

    public void o() {
        com.tencent.mars.xlog.Log.i("DanmakuControllerAsync", "handleResume()");
        if (!this.f438789e) {
            this.f438798q = android.os.SystemClock.uptimeMillis() - this.f438799r;
            com.tencent.mars.xlog.Log.getLogLevel();
            zp.e eVar = this.f438797p;
            eVar.getClass();
            eVar.f474910c = android.os.SystemClock.uptimeMillis();
        }
        this.f438789e = true;
        this.C = null;
        if (isPlaying()) {
            vp.j0 j0Var = this.K;
            if (j0Var.a()) {
                j0Var.f438781a.removeMessages(4);
                j0Var.f438781a.sendEmptyMessage(4);
            }
        }
        com.tencent.mars.xlog.Log.getLogLevel();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (this.f438801t) {
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
        java.util.List<wp.a> list = this.H;
        vp.x0 x0Var = this.I;
        ((java.util.LinkedList) list).addAll(x0Var.f438854b);
        ((java.util.LinkedList) x0Var.f438854b).clear();
        for (wp.a aVar : list) {
            android.graphics.Bitmap bitmap = aVar.f448343n;
            if (bitmap != null) {
                aVar.f448343n = null;
                aVar.f448344o.setBitmap(null);
                this.f438794m.f438732a.b(bitmap);
            }
        }
        vp.w wVar = this.f438787J;
        if (wVar != null) {
            wVar.c(list);
        }
        for (final wp.a aVar2 : list) {
            this.F.c(aVar2).h(aVar2, true, new java.lang.Runnable() { // from class: vp.k$$a
                @Override // java.lang.Runnable
                public final void run() {
                    vp.k.this.f438793i.b(aVar2);
                }
            });
        }
        ((java.util.LinkedList) list).clear();
    }

    @Override // vp.w0
    public void postInvalidate() {
        com.tencent.mars.xlog.Log.i("DanmakuControllerAsync", "postInvalidate()");
        android.os.Handler handler = this.K.f438781a;
        if (handler != null) {
            handler.removeMessages(13);
        }
        this.K.b(13);
    }

    public final void q(android.graphics.Canvas canvas) {
        if (canvas != null) {
            if (this.f438790f) {
                this.f438791g.unlockCanvasAndPost(canvas);
            } else {
                this.f438791g.unlock();
            }
        }
    }

    @Override // vp.w0
    public void quit() {
        this.f438788d = true;
        yp.b bVar = this.I.f438855c;
        if (bVar.f464372a) {
            com.tencent.mars.xlog.Log.i("DanmakuDrawer", java.lang.String.format("set AsyncDrawContextValid:%b", java.lang.Boolean.FALSE));
        }
        bVar.f464372a = false;
        this.K.b(6);
        if (this.L == 0 && this.M != null) {
            android.view.Choreographer.getInstance().removeFrameCallback(this.M);
        }
        r();
    }

    public final void r() {
        android.os.Handler handler = this.K.f438781a;
        if (handler != null) {
            handler.removeMessages(4);
        }
    }

    @Override // vp.w0
    public void release() {
        if (!this.f438788d) {
            quit();
        }
        this.K.b(8);
        this.f438787J = null;
    }

    @Override // vp.w0
    public void resume() {
        this.K.b(2);
    }

    public final void s(long j17) {
        if (this.L == 0 && this.M != null) {
            return;
        }
        r();
        if (this.f438790f && !this.f438788d && this.f438789e) {
            vp.j0 j0Var = this.K;
            if (j0Var.a()) {
                j0Var.f438781a.removeMessages(4);
                j0Var.f438781a.sendEmptyMessageDelayed(4, j17);
            }
        }
    }

    @Override // vp.w0
    public void seek(long j17) {
        vp.j0 j0Var = this.K;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        j0Var.getClass();
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 5;
        obtain.obj = valueOf;
        if (j0Var.a()) {
            j0Var.f438781a.sendMessage(obtain);
        }
    }

    public final void t() {
        java.util.List list;
        java.util.Iterator it;
        boolean z17;
        java.lang.String str;
        java.util.List list2;
        boolean z18;
        java.util.List list3;
        zp.e eVar;
        int i17;
        java.lang.String str2;
        long j17;
        long k17 = k();
        vp.v0 v0Var = this.f438792h;
        v0Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = v0Var.f438842d;
        if (reentrantReadWriteLock.readLock().tryLock()) {
            try {
                xp.i f17 = xp.d.f();
                boolean z19 = f17.f455862s;
                java.util.List list4 = v0Var.f438841c;
                int size = z19 ? ((java.util.ArrayList) list4).size() : java.lang.Math.min(f17.f455846c, ((java.util.ArrayList) list4).size());
                int i18 = 0;
                while (i18 < size) {
                    java.util.List list5 = (java.util.List) ((java.util.ArrayList) list4).get(i18);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.Iterator it6 = list5.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            list = list4;
                            break;
                        }
                        wp.a aVar = (wp.a) it6.next();
                        long j18 = aVar.B;
                        if (j18 <= k17 || j18 > k17 + 300) {
                            list = list4;
                            it = it6;
                        } else {
                            list = list4;
                            it = it6;
                            if (j18 + aVar.f448334e.f474913a > k17 && !aVar.o()) {
                                arrayList2.add(aVar);
                                list4 = list;
                                it6 = it;
                            }
                        }
                        if (aVar.B > k17 + 300) {
                            break;
                        }
                        list4 = list;
                        it6 = it;
                    }
                    arrayList.add(arrayList2);
                    i18++;
                    list4 = list;
                }
            } finally {
                reentrantReadWriteLock.readLock().unlock();
            }
        }
        java.util.Iterator it7 = arrayList.iterator();
        while (true) {
            if (it7.hasNext()) {
                if (!(it7.next() instanceof java.util.List)) {
                    z17 = false;
                    break;
                }
            } else {
                z17 = true;
                break;
            }
        }
        vp.x0 x0Var = this.I;
        java.lang.String str3 = "DanmakuControllerAsync";
        if (z17) {
            vp.y0 y0Var = (vp.y0) x0Var;
            long j19 = y0Var.f438857e.f474914a;
            int i19 = 0;
            while (i19 < arrayList.size()) {
                java.util.List<wp.a> list6 = (java.util.List) arrayList.get(i19);
                if (list6 != null && !list6.isEmpty()) {
                    for (wp.a aVar2 : list6) {
                        wp.f fVar = (wp.f) aVar2;
                        if (fVar.p(j19) || fVar.q(j19) || fVar.o()) {
                            str2 = str3;
                            j17 = j19;
                        } else {
                            if (!aVar2.n()) {
                                vp.d0.b(y0Var.f438856d, aVar2);
                            }
                            fVar.c();
                            str2 = str3;
                            j17 = j19;
                            fVar.f448333d = (aVar2.B - j19) + y0Var.f438858f.f474908a;
                            fVar.E = y0Var.f438866j[i19];
                            fVar.x(true);
                            ((java.util.List) ((java.util.ArrayList) y0Var.f438867k).get(i19)).add(fVar);
                        }
                        str3 = str2;
                        j19 = j17;
                    }
                }
                i19++;
                str3 = str3;
                j19 = j19;
            }
            str = str3;
        } else {
            str = "DanmakuControllerAsync";
            com.tencent.mars.xlog.Log.e(str, "preLayoutDanmakuMatrix contains invalid row type, expected List<BaseDanmaku>");
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock2 = v0Var.f438844f;
        if (reentrantReadWriteLock2.readLock().tryLock()) {
            try {
                xp.i f18 = xp.d.f();
                boolean z27 = f18.f455862s;
                java.util.List list7 = v0Var.f438843e;
                int size2 = z27 ? ((java.util.ArrayList) list7).size() : java.lang.Math.min(f18.f455846c, ((java.util.ArrayList) list7).size());
                int i27 = 0;
                while (i27 < size2) {
                    java.util.List list8 = (java.util.List) ((java.util.ArrayList) list7).get(i27);
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.util.Iterator it8 = list8.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            list2 = list7;
                            break;
                        }
                        wp.a aVar3 = (wp.a) it8.next();
                        long j27 = aVar3.B;
                        long j28 = k17 + 300;
                        if (j27 <= j28) {
                            list2 = list7;
                            if (j27 + aVar3.f448334e.f474913a > k17 && !aVar3.o()) {
                                arrayList4.add(aVar3);
                                list7 = list2;
                            }
                        } else {
                            list2 = list7;
                        }
                        if (aVar3.B > j28) {
                            break;
                        } else {
                            list7 = list2;
                        }
                    }
                    arrayList3.add(arrayList4);
                    i27++;
                    list7 = list2;
                }
            } finally {
                reentrantReadWriteLock2.readLock().unlock();
            }
        }
        java.util.Iterator it9 = arrayList3.iterator();
        while (true) {
            if (it9.hasNext()) {
                if (!(it9.next() instanceof java.util.List)) {
                    z18 = false;
                    break;
                }
            } else {
                z18 = true;
                break;
            }
        }
        if (z18) {
            vp.y0 y0Var2 = (vp.y0) x0Var;
            java.lang.String str4 = y0Var2.f438863g;
            java.util.List list9 = y0Var2.f438868l;
            if (list9 == null || ((java.util.ArrayList) list9).isEmpty()) {
                com.tencent.mars.xlog.Log.w(str4, "addFollowDanmaku: skip, matrix=%s, followLines=%s", arrayList3, y0Var2.f438868l);
            } else {
                long j29 = y0Var2.f438857e.f474914a;
                for (int i28 = 0; i28 < arrayList3.size() && i28 < ((java.util.ArrayList) y0Var2.f438868l).size(); i28++) {
                    java.util.List<wp.a> list10 = (java.util.List) arrayList3.get(i28);
                    if (list10 != null && !list10.isEmpty()) {
                        for (wp.a aVar4 : list10) {
                            wp.f fVar2 = (wp.f) aVar4;
                            if (!fVar2.p(j29) && !fVar2.q(j29) && !fVar2.o()) {
                                if (!aVar4.n()) {
                                    vp.d0.b(y0Var2.f438856d, aVar4);
                                }
                                fVar2.c();
                                fVar2.f448333d = (aVar4.B - j29) + y0Var2.f438858f.f474908a;
                                fVar2.E = y0Var2.f438869m[i28];
                                fVar2.x(true);
                                ((java.util.List) ((java.util.ArrayList) y0Var2.f438868l).get(i28)).add(fVar2);
                            }
                        }
                    }
                }
                java.lang.Object[] objArr = new java.lang.Object[1];
                java.util.List list11 = y0Var2.f438868l;
                if (list11 == null) {
                    i17 = 0;
                } else {
                    java.util.Iterator it10 = ((java.util.ArrayList) list11).iterator();
                    i17 = 0;
                    while (it10.hasNext()) {
                        i17 += ((java.util.List) it10.next()).size();
                    }
                }
                objArr[0] = java.lang.Integer.valueOf(i17);
                com.tencent.mars.xlog.Log.i(str4, "addFollowDanmaku: added, totalFollowSize=%d", objArr);
            }
        } else {
            com.tencent.mars.xlog.Log.e(str, "followDanmakuMatrix contains invalid row type, expected List<BaseDanmaku>");
        }
        vp.y0 y0Var3 = (vp.y0) x0Var;
        int size3 = ((java.util.ArrayList) y0Var3.f438867k).size();
        int i29 = 0;
        while (true) {
            list3 = y0Var3.f438854b;
            eVar = y0Var3.f438858f;
            if (i29 >= size3) {
                break;
            }
            java.util.Iterator it11 = ((java.util.List) ((java.util.ArrayList) y0Var3.f438867k).get(i29)).iterator();
            while (it11.hasNext()) {
                wp.a aVar5 = (wp.a) it11.next();
                if (aVar5.m(eVar.f474908a) || !aVar5.o()) {
                    it11.remove();
                    y0Var3.f438853a--;
                    ((java.util.LinkedList) list3).add(aVar5);
                    aVar5.x(false);
                }
            }
            i29++;
        }
        if (y0Var3.f438868l == null) {
            return;
        }
        for (int i37 = 0; i37 < ((java.util.ArrayList) y0Var3.f438868l).size(); i37++) {
            java.util.Iterator it12 = ((java.util.List) ((java.util.ArrayList) y0Var3.f438868l).get(i37)).iterator();
            while (it12.hasNext()) {
                wp.a aVar6 = (wp.a) it12.next();
                if (aVar6.m(eVar.f474908a) || !aVar6.o()) {
                    it12.remove();
                    y0Var3.f438853a--;
                    ((java.util.LinkedList) list3).add(aVar6);
                    aVar6.x(false);
                }
            }
        }
    }

    @Override // vp.w0
    public void t2() {
        this.Q = true;
    }

    @Override // vp.w0
    public java.util.List t6() {
        vp.x0 x0Var = this.I;
        if (x0Var instanceof vp.y0) {
            return ((vp.y0) x0Var).f438867k;
        }
        return null;
    }

    @Override // vp.w0
    public void v0(wp.a aVar, boolean z17) {
        if (z17) {
            aVar.f448335f = this.f438796o.f474914a;
        }
        com.tencent.mars.xlog.Log.i("DanmakuControllerAsync", "addFollowDanmakuNow: danmaku time = " + aVar.f448335f + " usePlayTime = " + z17);
        this.f438795n.d(aVar, new vp.p(this));
    }

    @Override // vp.w0
    public boolean y5(android.graphics.Point point, int i17) {
        point.y -= (int) this.f438791g.b();
        zp.m mVar = new zp.m(this.f438797p.f474908a, point, i17);
        if (com.tencent.mars.xlog.Log.getLogLevel() <= 0) {
            mVar.toString();
        }
        ((java.util.concurrent.LinkedBlockingDeque) this.G).add(mVar);
        boolean z17 = false;
        if (this.K.f438785e == 1) {
            return l();
        }
        try {
            if (this.I.d(mVar) != null) {
                z17 = true;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("DanmakuControllerAsync", "addClickPoint:" + e17);
        }
        this.K.b(10);
        return z17;
    }
}
