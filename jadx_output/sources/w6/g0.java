package w6;

/* loaded from: classes13.dex */
public class g0 implements w6.n0, y6.n, w6.q0 {

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f443114h = android.util.Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    public final w6.v0 f443115a;

    /* renamed from: b, reason: collision with root package name */
    public final w6.p0 f443116b;

    /* renamed from: c, reason: collision with root package name */
    public final y6.o f443117c;

    /* renamed from: d, reason: collision with root package name */
    public final w6.d0 f443118d;

    /* renamed from: e, reason: collision with root package name */
    public final w6.d1 f443119e;

    /* renamed from: f, reason: collision with root package name */
    public final w6.b0 f443120f;

    /* renamed from: g, reason: collision with root package name */
    public final w6.e f443121g;

    public g0(y6.o oVar, y6.a aVar, z6.e eVar, z6.e eVar2, z6.e eVar3, z6.e eVar4, boolean z17) {
        this.f443117c = oVar;
        w6.e0 e0Var = new w6.e0(aVar);
        w6.e eVar5 = new w6.e(z17);
        this.f443121g = eVar5;
        synchronized (this) {
            synchronized (eVar5) {
                eVar5.f443092e = this;
            }
        }
        this.f443116b = new w6.p0();
        this.f443115a = new w6.v0();
        this.f443118d = new w6.d0(eVar, eVar2, eVar3, eVar4, this, this);
        this.f443120f = new w6.b0(e0Var);
        this.f443119e = new w6.d1();
        ((y6.m) oVar).f459601d = this;
    }

    public w6.f0 a(com.bumptech.glide.f fVar, java.lang.Object obj, t6.h hVar, int i17, int i18, java.lang.Class cls, java.lang.Class cls2, com.bumptech.glide.g gVar, w6.z zVar, java.util.Map map, boolean z17, boolean z18, t6.l lVar, boolean z19, boolean z27, boolean z28, boolean z29, m7.f fVar2, java.util.concurrent.Executor executor) {
        long j17;
        if (f443114h) {
            int i19 = q7.j.f360301b;
            j17 = android.os.SystemClock.elapsedRealtimeNanos();
        } else {
            j17 = 0;
        }
        long j18 = j17;
        this.f443116b.getClass();
        w6.o0 o0Var = new w6.o0(obj, hVar, i17, i18, map, cls, cls2, lVar);
        synchronized (this) {
            w6.r0 b17 = b(o0Var, z19, j18);
            if (b17 == null) {
                return e(fVar, obj, hVar, i17, i18, cls, cls2, gVar, zVar, map, z17, z18, lVar, z19, z27, z28, z29, fVar2, executor, o0Var, j18);
            }
            ((m7.h) fVar2).k(b17, t6.a.MEMORY_CACHE);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final w6.r0 b(w6.o0 o0Var, boolean z17, long j17) {
        w6.r0 r0Var;
        java.lang.Object remove;
        if (!z17) {
            return null;
        }
        w6.e eVar = this.f443121g;
        synchronized (eVar) {
            w6.d dVar = (w6.d) ((java.util.HashMap) eVar.f443090c).get(o0Var);
            if (dVar == null) {
                r0Var = null;
            } else {
                r0Var = (w6.r0) dVar.get();
                if (r0Var == null) {
                    eVar.b(dVar);
                }
            }
        }
        if (r0Var != null) {
            r0Var.b();
        }
        if (r0Var != null) {
            if (f443114h) {
                q7.j.a(j17);
                java.util.Objects.toString(o0Var);
            }
            return r0Var;
        }
        y6.m mVar = (y6.m) this.f443117c;
        synchronized (mVar) {
            remove = mVar.f360302a.remove(o0Var);
            if (remove != null) {
                mVar.f360304c -= mVar.a(remove);
            }
        }
        w6.z0 z0Var = (w6.z0) remove;
        w6.r0 r0Var2 = z0Var == null ? null : z0Var instanceof w6.r0 ? (w6.r0) z0Var : new w6.r0(z0Var, true, true, o0Var, this);
        if (r0Var2 != null) {
            r0Var2.b();
            this.f443121g.a(o0Var, r0Var2);
        }
        if (r0Var2 == null) {
            return null;
        }
        if (f443114h) {
            q7.j.a(j17);
            java.util.Objects.toString(o0Var);
        }
        return r0Var2;
    }

    public void c(t6.h hVar, w6.r0 r0Var) {
        w6.e eVar = this.f443121g;
        synchronized (eVar) {
            w6.d dVar = (w6.d) ((java.util.HashMap) eVar.f443090c).remove(hVar);
            if (dVar != null) {
                dVar.f443078c = null;
                dVar.clear();
            }
        }
        if (r0Var.f443193d) {
        } else {
            this.f443119e.a(r0Var);
        }
    }

    public void d(w6.z0 z0Var) {
        if (!(z0Var instanceof w6.r0)) {
            throw new java.lang.IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((w6.r0) z0Var).c();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9 A[Catch: all -> 0x0110, TryCatch #0 {, blocks: (B:23:0x00d3, B:25:0x00df, B:30:0x00e9, B:31:0x00fc, B:39:0x00ec, B:41:0x00f0, B:42:0x00f3, B:44:0x00f7, B:45:0x00fa), top: B:22:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec A[Catch: all -> 0x0110, TryCatch #0 {, blocks: (B:23:0x00d3, B:25:0x00df, B:30:0x00e9, B:31:0x00fc, B:39:0x00ec, B:41:0x00f0, B:42:0x00f3, B:44:0x00f7, B:45:0x00fa), top: B:22:0x00d3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final w6.f0 e(com.bumptech.glide.f r17, java.lang.Object r18, t6.h r19, int r20, int r21, java.lang.Class r22, java.lang.Class r23, com.bumptech.glide.g r24, w6.z r25, java.util.Map r26, boolean r27, boolean r28, t6.l r29, boolean r30, boolean r31, boolean r32, boolean r33, m7.f r34, java.util.concurrent.Executor r35, w6.o0 r36, long r37) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.g0.e(com.bumptech.glide.f, java.lang.Object, t6.h, int, int, java.lang.Class, java.lang.Class, com.bumptech.glide.g, w6.z, java.util.Map, boolean, boolean, t6.l, boolean, boolean, boolean, boolean, m7.f, java.util.concurrent.Executor, w6.o0, long):w6.f0");
    }
}
