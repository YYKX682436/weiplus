package p6;

/* loaded from: classes16.dex */
public class j implements p6.f {

    /* renamed from: a, reason: collision with root package name */
    public android.os.HapticPlayer f352148a;

    /* renamed from: b, reason: collision with root package name */
    public android.os.Handler f352149b;

    /* renamed from: c, reason: collision with root package name */
    public android.os.HandlerThread f352150c;

    /* renamed from: d, reason: collision with root package name */
    public q6.d f352151d;

    /* renamed from: e, reason: collision with root package name */
    public q6.a f352152e;

    /* renamed from: f, reason: collision with root package name */
    public final p6.a f352153f = new p6.a();

    public j(android.content.Context context) {
    }

    public final void a(java.lang.String str, int i17, int i18, q6.a aVar) {
        this.f352152e = aVar;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("Tencent-Sync");
        this.f352150c = handlerThread;
        handlerThread.start();
        p6.i iVar = new p6.i(this, this.f352150c.getLooper(), i17, i18);
        this.f352149b = iVar;
        p6.a aVar2 = this.f352153f;
        q6.d dVar = new q6.d(iVar, str, aVar2);
        this.f352151d = dVar;
        q6.a aVar3 = aVar2.f352113g;
        if (aVar3 == null) {
            if (aVar != null) {
                dVar.f360220a = aVar.getCurrentPosition();
                this.f352151d.a(aVar.getCurrentPosition(), 0L);
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
            this.f352151d.f360220a = aVar2.f352113g.getCurrentPosition();
            this.f352151d.a(aVar2.f352113g.getCurrentPosition(), aVar2.f352114h);
        } else {
            q6.d dVar2 = this.f352151d;
            long j17 = aVar2.f352114h;
            dVar2.f360220a = j17;
            dVar2.a(j17, j17);
        }
    }

    @Override // p6.f
    public void b(boolean z17) {
        p6.a aVar = this.f352153f;
        if (z17) {
            aVar.f352109c = Integer.MAX_VALUE;
        } else {
            aVar.f352109c = 0;
        }
    }

    @Override // p6.f
    public void c() {
        try {
            this.f352153f.b();
            if (this.f352148a == null) {
                return;
            }
            e();
            this.f352148a.stop();
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // p6.f
    public void d(java.io.File file, int i17, int i18, q6.a aVar) {
        p6.a aVar2 = this.f352153f;
        aVar2.b();
        aVar2.f352116j = file;
        aVar2.f352110d = i17;
        aVar2.f352111e = i18;
        aVar2.f352113g = aVar;
    }

    public final void e() {
        android.os.HandlerThread handlerThread = this.f352150c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f352150c = null;
            this.f352149b = null;
            this.f352151d = null;
        }
    }

    @Override // p6.f
    public int getCurrentPosition() {
        m6.c cVar;
        p6.a aVar = this.f352153f;
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
        p6.a aVar = this.f352153f;
        if (6 != aVar.f352115i) {
            return;
        }
        android.os.HapticPlayer hapticPlayer = this.f352148a;
        if (hapticPlayer != null) {
            hapticPlayer.stop();
        }
        e();
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
        p6.a aVar = this.f352153f;
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
        this.f352153f.b();
        e();
        android.os.HapticPlayer hapticPlayer = this.f352148a;
        if (hapticPlayer != null) {
            hapticPlayer.stop();
        }
        this.f352148a = null;
    }

    @Override // p6.f
    public boolean seekTo(int i17) {
        p6.a aVar = this.f352153f;
        if (p6.a.a(aVar.f352112f) && i17 >= 0 && i17 <= aVar.f352112f.getDuration()) {
            android.os.HapticPlayer hapticPlayer = this.f352148a;
            if (hapticPlayer != null) {
                hapticPlayer.stop();
            }
            e();
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
                a(aVar.f352107a, aVar.f352110d, aVar.f352111e, aVar2);
            } else {
                a(c17, aVar.f352110d, aVar.f352111e, null);
            }
            return true;
        }
        return false;
    }

    @Override // p6.f
    public boolean start() {
        p6.a aVar = this.f352153f;
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
            a(aVar.f352107a, aVar.f352110d, aVar.f352111e, aVar2);
            return true;
        }
        a(c17, aVar.f352110d, aVar.f352111e, null);
        return true;
    }
}
