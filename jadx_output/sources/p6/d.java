package p6;

/* loaded from: classes16.dex */
public class d implements p6.f {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Vibrator f352125a;

    /* renamed from: b, reason: collision with root package name */
    public l6.b f352126b;

    /* renamed from: c, reason: collision with root package name */
    public android.os.Handler f352127c;

    /* renamed from: d, reason: collision with root package name */
    public android.os.HandlerThread f352128d;

    /* renamed from: e, reason: collision with root package name */
    public q6.d f352129e;

    /* renamed from: f, reason: collision with root package name */
    public q6.a f352130f;

    /* renamed from: g, reason: collision with root package name */
    public final p6.a f352131g = new p6.a();

    /* renamed from: h, reason: collision with root package name */
    public l6.l f352132h;

    public d(android.content.Context context) {
        this.f352125a = (android.os.Vibrator) context.getSystemService("vibrator");
        l6.b bVar = new l6.b(context);
        this.f352126b = bVar;
        bVar.start();
    }

    public void a(java.lang.String str, int i17, int i18, int i19, int i27) {
        try {
            int i28 = new org.json.JSONObject(str).getJSONObject("Metadata").getInt("Version");
            if (i28 == 1) {
                g();
                this.f352126b.a(new l6.a(str, i17, i18, i19, i27));
                return;
            }
            if (i28 == 2) {
                f();
                java.lang.String k17 = l6.m.k(l6.m.j(str));
                l6.l lVar = new l6.l();
                this.f352132h = lVar;
                synchronized (lVar) {
                    if (i18 >= 0) {
                        try {
                            lVar.f316732a = i18;
                        } finally {
                        }
                    }
                    if (i19 >= 0 && i19 <= 255) {
                        lVar.f316734c = i19;
                    }
                }
                l6.l lVar2 = this.f352132h;
                o6.a f17 = l6.m.f(k17);
                lVar2.a(i17, i18, f17 != null ? f17.getDuration() : 0, new p6.b(this, k17, i19, i27));
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // p6.f
    public void b(boolean z17) {
        p6.a aVar = this.f352131g;
        if (z17) {
            aVar.f352109c = Integer.MAX_VALUE;
        } else {
            aVar.f352109c = 0;
        }
    }

    @Override // p6.f
    public void c() {
        this.f352131g.b();
        f();
        g();
    }

    @Override // p6.f
    public void d(java.io.File file, int i17, int i18, q6.a aVar) {
        p6.a aVar2 = this.f352131g;
        aVar2.b();
        aVar2.f352116j = file;
        aVar2.f352110d = i17;
        aVar2.f352111e = i18;
        aVar2.f352113g = aVar;
    }

    public final void e(java.lang.String str, int i17, int i18, q6.a aVar) {
        this.f352130f = aVar;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("Richtap-Sync");
        this.f352128d = handlerThread;
        handlerThread.start();
        p6.c cVar = new p6.c(this, this.f352128d.getLooper(), i17, i18);
        this.f352127c = cVar;
        p6.a aVar2 = this.f352131g;
        q6.d dVar = new q6.d(cVar, str, aVar2);
        this.f352129e = dVar;
        q6.a aVar3 = aVar2.f352113g;
        if (aVar3 == null) {
            if (aVar != null) {
                dVar.f360220a = aVar.getCurrentPosition();
                this.f352129e.a(aVar.getCurrentPosition(), 0L);
                return;
            } else {
                synchronized (dVar) {
                    dVar.c(0L, 0L);
                }
                dVar.b();
                return;
            }
        }
        if (aVar3.getCurrentPosition() < 0) {
            this.f352129e.f360220a = aVar2.f352113g.getCurrentPosition();
            this.f352129e.a(aVar2.f352113g.getCurrentPosition(), aVar2.f352114h);
        } else {
            q6.d dVar2 = this.f352129e;
            long j17 = aVar2.f352114h;
            dVar2.f360220a = j17;
            dVar2.a(j17, j17);
        }
    }

    public final void f() {
        android.os.HandlerThread handlerThread = this.f352128d;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f352128d = null;
            this.f352127c = null;
            this.f352129e = null;
        }
        l6.l lVar = this.f352132h;
        if (lVar != null) {
            synchronized (lVar) {
                try {
                    android.os.HandlerThread handlerThread2 = lVar.f316736e;
                    if (handlerThread2 != null) {
                        handlerThread2.quit();
                        lVar.f316736e = null;
                    }
                    lVar.f316737f = null;
                } catch (java.lang.Throwable unused) {
                }
            }
            this.f352132h = null;
        }
    }

    public final void g() {
        l6.b bVar = this.f352126b;
        if (bVar != null) {
            synchronized (bVar.f316708d) {
                try {
                } catch (java.lang.Exception unused) {
                }
                synchronized (bVar.f316709e) {
                    if (!((java.util.ArrayList) bVar.f316712h).isEmpty()) {
                        l6.a aVar = (l6.a) ((java.util.ArrayList) bVar.f316712h).get(0);
                        if (aVar.f316705g) {
                            aVar.f316705g = false;
                        }
                        bVar.f316708d.notify();
                    }
                }
            }
        }
        this.f352125a.cancel();
    }

    @Override // p6.f
    public int getCurrentPosition() {
        m6.c cVar;
        p6.a aVar = this.f352131g;
        q6.a aVar2 = aVar.f352113g;
        if (aVar2 != null) {
            return aVar2.getCurrentPosition();
        }
        int i17 = aVar.f352115i;
        if (i17 == 6) {
            return (int) ((android.os.SystemClock.elapsedRealtime() - aVar.f352108b) + aVar.f352114h);
        }
        if (i17 == 7) {
            return aVar.f352114h;
        }
        if (i17 == 9 && (cVar = aVar.f352112f) != null) {
            return cVar.getDuration();
        }
        return 0;
    }

    @Override // p6.f
    public void pause() {
        p6.a aVar = this.f352131g;
        if (6 != aVar.f352115i) {
            return;
        }
        f();
        g();
        aVar.f352115i = 7;
        if (!p6.a.a(aVar.f352112f)) {
            aVar.f352114h = 0;
            return;
        }
        q6.a aVar2 = aVar.f352113g;
        if (aVar2 != null) {
            aVar.f352114h = aVar2.getCurrentPosition();
            return;
        }
        int elapsedRealtime = (int) (android.os.SystemClock.elapsedRealtime() - aVar.f352108b);
        if (elapsedRealtime < 0) {
            aVar.f352114h = 0;
        } else {
            aVar.f352114h += elapsedRealtime;
        }
    }

    @Override // p6.f
    public boolean prepare() {
        p6.a aVar = this.f352131g;
        java.io.File file = aVar.f352116j;
        if (file != null) {
            aVar.f352107a = l6.m.h(file);
        }
        if (1 == l6.m.i(aVar.f352107a)) {
            aVar.f352107a = l6.m.a(aVar.f352107a);
        }
        aVar.f352107a = l6.m.j(aVar.f352107a);
        aVar.f352107a = l6.m.k(aVar.f352107a);
        m6.c g17 = l6.m.g(aVar.f352107a);
        if (p6.a.a(g17)) {
            aVar.f352112f = g17;
            return true;
        }
        aVar.b();
        return false;
    }

    @Override // p6.f
    public void release() {
        this.f352131g.b();
        f();
        l6.b bVar = this.f352126b;
        if (bVar != null) {
            bVar.f316711g = true;
            synchronized (bVar.f316708d) {
                try {
                    synchronized (bVar.f316709e) {
                        ((java.util.ArrayList) bVar.f316712h).clear();
                        bVar.f316712h = null;
                    }
                    bVar.f316708d.notify();
                } catch (java.lang.Exception unused) {
                }
            }
            this.f352126b = null;
        }
    }

    @Override // p6.f
    public boolean seekTo(int i17) {
        p6.a aVar = this.f352131g;
        if (p6.a.a(aVar.f352112f) && i17 >= 0 && i17 <= aVar.f352112f.getDuration()) {
            f();
            g();
            aVar.f352114h = i17;
            java.lang.String c17 = l6.m.c(aVar.f352107a, i17);
            if (c17 == null || "".equals(c17)) {
                if (aVar.f352109c > 0) {
                    c17 = aVar.f352107a;
                    aVar.f352114h = 0;
                } else {
                    aVar.f352115i = 9;
                }
            }
            if (6 != aVar.f352115i) {
                return true;
            }
            aVar.f352108b = android.os.SystemClock.elapsedRealtime();
            q6.a aVar2 = aVar.f352113g;
            if (aVar2 != null) {
                e(aVar.f352107a, aVar.f352110d, aVar.f352111e, aVar2);
            } else {
                e(c17, aVar.f352110d, aVar.f352111e, null);
            }
            return true;
        }
        return false;
    }

    @Override // p6.f
    public boolean start() {
        p6.a aVar = this.f352131g;
        if (6 == aVar.f352115i || !p6.a.a(aVar.f352112f) || aVar.f352114h < 0) {
            return false;
        }
        if (9 == aVar.f352115i) {
            aVar.f352114h = 0;
        }
        java.lang.String c17 = l6.m.c(aVar.f352107a, aVar.f352114h);
        if (c17 == null || "".equals(c17)) {
            aVar.f352115i = 9;
            return false;
        }
        aVar.f352108b = android.os.SystemClock.elapsedRealtime();
        aVar.f352115i = 6;
        q6.a aVar2 = aVar.f352113g;
        if (aVar2 != null) {
            e(aVar.f352107a, aVar.f352110d, aVar.f352111e, aVar2);
            return true;
        }
        e(c17, aVar.f352110d, aVar.f352111e, null);
        return true;
    }
}
