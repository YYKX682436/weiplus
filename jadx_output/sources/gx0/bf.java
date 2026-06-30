package gx0;

/* loaded from: classes5.dex */
public final class bf extends ou0.p implements by0.k {
    public final androidx.lifecycle.g0 A;
    public volatile com.tencent.maas.moviecomposing.PlaybackSession B;
    public com.tencent.maas.model.time.MJTimeRange C;
    public int D;
    public volatile com.tencent.maas.moviecomposing.Timeline E;
    public volatile kotlinx.coroutines.f1 F;
    public volatile java.util.Queue G;
    public volatile kotlinx.coroutines.f1 H;
    public volatile java.util.Queue I;

    /* renamed from: J */
    public final java.util.concurrent.locks.ReentrantLock f276250J;
    public final java.util.concurrent.locks.ReentrantLock K;
    public boolean L;
    public com.tencent.maas.model.time.MJTime M;

    /* renamed from: r */
    public final jz5.g f276251r;

    /* renamed from: s */
    public final oz5.l f276252s;

    /* renamed from: t */
    public final oz5.l f276253t;

    /* renamed from: u */
    public final androidx.lifecycle.j0 f276254u;

    /* renamed from: v */
    public final androidx.lifecycle.g0 f276255v;

    /* renamed from: w */
    public volatile gx0.fd f276256w;

    /* renamed from: x */
    public final androidx.lifecycle.j0 f276257x;

    /* renamed from: y */
    public final androidx.lifecycle.g0 f276258y;

    /* renamed from: z */
    public final androidx.lifecycle.j0 f276259z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f276251r = jz5.h.b(new gx0.ce(this));
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
        this.f276252s = ((kotlinx.coroutines.c3) a17).plus(p0Var.J(1));
        this.f276253t = ((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(p0Var.J(1));
        gx0.fd fdVar = gx0.fd.f276429e;
        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0(fdVar);
        this.f276254u = j0Var;
        this.f276255v = j0Var;
        this.f276256w = fdVar;
        com.tencent.maas.model.time.MJTime InvalidTime = com.tencent.maas.model.time.MJTime.InvalidTime;
        androidx.lifecycle.j0 j0Var2 = new androidx.lifecycle.j0(InvalidTime);
        this.f276257x = j0Var2;
        this.f276258y = j0Var2;
        androidx.lifecycle.j0 j0Var3 = new androidx.lifecycle.j0();
        this.f276259z = j0Var3;
        this.A = j0Var3;
        this.C = com.tencent.maas.model.time.MJTimeRange.PositiveInfiniteTimeRange;
        this.D = -1;
        this.G = new java.util.LinkedList();
        this.I = new java.util.LinkedList();
        this.f276250J = new java.util.concurrent.locks.ReentrantLock();
        this.K = new java.util.concurrent.locks.ReentrantLock();
        kotlin.jvm.internal.o.f(InvalidTime, "InvalidTime");
        this.M = InvalidTime;
    }

    public static java.lang.Object d7(gx0.bf bfVar, com.tencent.maas.moviecomposing.Timeline timeline, com.tencent.maas.model.time.MJTime InvalidTime, boolean z17, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            timeline = null;
        }
        com.tencent.maas.moviecomposing.Timeline timeline2 = timeline;
        if ((i17 & 2) != 0) {
            InvalidTime = com.tencent.maas.model.time.MJTime.InvalidTime;
            kotlin.jvm.internal.o.f(InvalidTime, "InvalidTime");
        }
        com.tencent.maas.model.time.MJTime mJTime = InvalidTime;
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        bfVar.getClass();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        return kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new gx0.sd(bfVar, timeline2, mJTime, z17, null), continuation);
    }

    public static /* synthetic */ boolean q7(gx0.bf bfVar, com.tencent.maas.model.time.MJTime mJTime, boolean z17, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            j17 = 0;
        }
        bfVar.p7(mJTime, z17, j17);
        return true;
    }

    public static java.lang.Object r7(gx0.bf bfVar, boolean z17, com.tencent.maas.model.time.MJTime mJTime, int i17, boolean z18, com.tencent.maas.model.time.MJTimeRange mJTimeRange, kotlin.coroutines.Continuation continuation, int i18, java.lang.Object obj) {
        com.tencent.maas.model.time.MJTime mJTime2;
        boolean z19 = (i18 & 1) != 0 ? true : z17;
        if ((i18 & 2) != 0) {
            com.tencent.maas.model.time.MJTime InvalidTime = com.tencent.maas.model.time.MJTime.InvalidTime;
            kotlin.jvm.internal.o.f(InvalidTime, "InvalidTime");
            mJTime2 = InvalidTime;
        } else {
            mJTime2 = mJTime;
        }
        int i19 = (i18 & 4) != 0 ? Integer.MAX_VALUE : i17;
        boolean z27 = (i18 & 8) != 0 ? true : z18;
        com.tencent.maas.model.time.MJTimeRange mJTimeRange2 = (i18 & 16) != 0 ? null : mJTimeRange;
        bfVar.getClass();
        return kotlinx.coroutines.l.g(bfVar.f276253t, new gx0.ye(z19, bfVar, mJTime2, i19, mJTimeRange2, z27, null), continuation);
    }

    public static java.lang.Object t7(gx0.bf bfVar, boolean z17, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        bfVar.getClass();
        return kotlinx.coroutines.l.g(bfVar.f276253t, new gx0.af(bfVar, z17, null), continuation);
    }

    public final void Y6(kotlinx.coroutines.f1 f1Var) {
        synchronized (this.K) {
            if (this.H != null) {
                ((java.util.LinkedList) this.I).clear();
                ((java.util.LinkedList) this.I).add(f1Var);
            } else {
                this.H = f1Var;
                kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.hd(this, null), 3, null);
            }
        }
    }

    public final java.lang.Object Z6(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, rv0.c7 c7Var, kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(this.f276253t, new gx0.ld(this, clipSegment, c7Var, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064 A[PHI: r8
  0x0064: PHI (r8v5 java.lang.Object) = (r8v4 java.lang.Object), (r8v1 java.lang.Object) binds: [B:17:0x0061, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a7(android.view.SurfaceView r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof gx0.md
            if (r0 == 0) goto L13
            r0 = r8
            gx0.md r0 = (gx0.md) r0
            int r1 = r0.f276727h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f276727h = r1
            goto L18
        L13:
            gx0.md r0 = new gx0.md
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f276725f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f276727h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L64
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.f276724e
            android.view.SurfaceView r7 = (android.view.SurfaceView) r7
            java.lang.Object r2 = r0.f276723d
            gx0.bf r2 = (gx0.bf) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L4f
        L3e:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.f276723d = r6
            r0.f276724e = r7
            r0.f276727h = r4
            java.lang.Object r8 = r6.O6(r0)
            if (r8 != r1) goto L4e
            return r1
        L4e:
            r2 = r6
        L4f:
            oz5.l r8 = r2.f276253t
            gx0.od r4 = new gx0.od
            r5 = 0
            r4.<init>(r2, r7, r5)
            r0.f276723d = r5
            r0.f276724e = r5
            r0.f276727h = r3
            java.lang.Object r8 = kotlinx.coroutines.l.g(r8, r4, r0)
            if (r8 != r1) goto L64
            return r1
        L64:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.bf.a7(android.view.SurfaceView, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean b7(com.tencent.maas.model.time.MJTime time, boolean z17) {
        kotlin.jvm.internal.o.g(time, "time");
        Y6(kotlinx.coroutines.l.a(getMainScope(), this.f276253t, kotlinx.coroutines.a1.LAZY, new gx0.qd(this, time, z17, null)));
        return true;
    }

    public final boolean c7() {
        com.tencent.maas.moviecomposing.Timeline timeline = this.E;
        if (timeline == null) {
            return false;
        }
        kotlinx.coroutines.y0 mainScope = getMainScope();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.f1 a17 = kotlinx.coroutines.l.a(mainScope, kotlinx.coroutines.internal.b0.f310484a, kotlinx.coroutines.a1.LAZY, new gx0.rd(timeline, this, null));
        synchronized (this.f276250J) {
            if (this.F != null) {
                ((java.util.LinkedList) this.G).clear();
                ((java.util.LinkedList) this.G).add(a17);
            } else {
                this.F = a17;
                kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.gd(this, null), 3, null);
            }
        }
        return true;
    }

    public final java.lang.Object e7(kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(this.f276253t, new gx0.wd(this, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f7(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof gx0.xd
            if (r0 == 0) goto L13
            r0 = r7
            gx0.xd r0 = (gx0.xd) r0
            int r1 = r0.f277178g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f277178g = r1
            goto L18
        L13:
            gx0.xd r0 = new gx0.xd
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f277176e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f277178g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L83
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            java.lang.Object r2 = r0.f277175d
            gx0.bf r2 = (gx0.bf) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L55
        L3a:
            kotlin.ResultKt.throwOnFailure(r7)
            java.util.concurrent.locks.ReentrantLock r7 = r6.f276250J
            monitor-enter(r7)
            kotlinx.coroutines.f1 r2 = r6.F     // Catch: java.lang.Throwable -> L95
            if (r2 != 0) goto L48
            jz5.f0 r0 = jz5.f0.f302826a     // Catch: java.lang.Throwable -> L95
            monitor-exit(r7)
            return r0
        L48:
            monitor-exit(r7)
            r0.f277175d = r6
            r0.f277178g = r4
            java.lang.Object r7 = r2.k(r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            java.util.concurrent.locks.ReentrantLock r7 = r2.f276250J
            monitor-enter(r7)
            r4 = 0
            java.util.Queue r5 = r2.G     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> L88
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> L88
            if (r5 == 0) goto L63
            r5 = r4
            goto L6d
        L63:
            java.util.Queue r5 = r2.G     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> L88
            java.util.LinkedList r5 = (java.util.LinkedList) r5     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> L88
            java.lang.Object r5 = r5.remove()     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> L88
            kotlinx.coroutines.f1 r5 = (kotlinx.coroutines.f1) r5     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> L88
        L6d:
            r2.F = r5     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> L88
            kotlinx.coroutines.f1 r5 = r2.F     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> L88
            if (r5 != 0) goto L77
            jz5.f0 r0 = jz5.f0.f302826a     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> L88
            monitor-exit(r7)
            return r0
        L77:
            monitor-exit(r7)
            r0.f277175d = r4
            r0.f277178g = r3
            java.lang.Object r7 = r2.f7(r0)
            if (r7 != r1) goto L83
            return r1
        L83:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        L86:
            r0 = move-exception
            goto L8a
        L88:
            r0 = move-exception
            goto L93
        L8a:
            r0.getMessage()     // Catch: java.lang.Throwable -> L88
            r2.F = r4     // Catch: java.lang.Throwable -> L88
            jz5.f0 r0 = jz5.f0.f302826a     // Catch: java.lang.Throwable -> L88
            monitor-exit(r7)
            return r0
        L93:
            monitor-exit(r7)
            throw r0
        L95:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.bf.f7(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g7(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof gx0.yd
            if (r0 == 0) goto L13
            r0 = r7
            gx0.yd r0 = (gx0.yd) r0
            int r1 = r0.f277233g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f277233g = r1
            goto L18
        L13:
            gx0.yd r0 = new gx0.yd
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f277231e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f277233g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L83
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            java.lang.Object r2 = r0.f277230d
            gx0.bf r2 = (gx0.bf) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L55
        L3a:
            kotlin.ResultKt.throwOnFailure(r7)
            java.util.concurrent.locks.ReentrantLock r7 = r6.K
            monitor-enter(r7)
            kotlinx.coroutines.f1 r2 = r6.H     // Catch: java.lang.Throwable -> L94
            if (r2 != 0) goto L48
            jz5.f0 r0 = jz5.f0.f302826a     // Catch: java.lang.Throwable -> L94
            monitor-exit(r7)
            return r0
        L48:
            monitor-exit(r7)
            r0.f277230d = r6
            r0.f277233g = r4
            java.lang.Object r7 = r2.k(r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            java.util.concurrent.locks.ReentrantLock r7 = r2.K
            monitor-enter(r7)
            r4 = 0
            java.util.Queue r5 = r2.I     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            if (r5 == 0) goto L63
            r5 = r4
            goto L6d
        L63:
            java.util.Queue r5 = r2.I     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            java.util.LinkedList r5 = (java.util.LinkedList) r5     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            java.lang.Object r5 = r5.remove()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            kotlinx.coroutines.f1 r5 = (kotlinx.coroutines.f1) r5     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
        L6d:
            r2.H = r5     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            kotlinx.coroutines.f1 r5 = r2.H     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            if (r5 != 0) goto L77
            jz5.f0 r0 = jz5.f0.f302826a     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            monitor-exit(r7)
            return r0
        L77:
            monitor-exit(r7)
            r0.f277230d = r4
            r0.f277233g = r3
            java.lang.Object r7 = r2.g7(r0)
            if (r7 != r1) goto L83
            return r1
        L83:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        L86:
            r0 = move-exception
            goto L92
        L88:
            r0 = move-exception
            r2.H = r4     // Catch: java.lang.Throwable -> L86
            r0.getMessage()     // Catch: java.lang.Throwable -> L86
            jz5.f0 r0 = jz5.f0.f302826a     // Catch: java.lang.Throwable -> L86
            monitor-exit(r7)
            return r0
        L92:
            monitor-exit(r7)
            throw r0
        L94:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.bf.g7(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public com.tencent.maas.model.time.MJTime h7() {
        ou0.g gVar = (ou0.g) this.A.getValue();
        if (gVar != null) {
            return gVar;
        }
        com.tencent.maas.model.time.MJTime ZeroTime = com.tencent.maas.model.time.MJTime.ZeroTime;
        kotlin.jvm.internal.o.f(ZeroTime, "ZeroTime");
        return ZeroTime;
    }

    public com.tencent.maas.model.time.MJTime i7() {
        ou0.g gVar = (ou0.g) this.A.getValue();
        if (gVar != null) {
            return gVar;
        }
        com.tencent.maas.model.time.MJTime InvalidTime = com.tencent.maas.model.time.MJTime.InvalidTime;
        kotlin.jvm.internal.o.f(InvalidTime, "InvalidTime");
        return InvalidTime;
    }

    public final boolean isPlaying() {
        return this.f276256w == gx0.fd.f276432h;
    }

    public final com.tencent.maas.moviecomposing.PlaybackSession k7() {
        if (((gx0.w8) ((jz5.n) this.f276251r).getValue()).f277115r == gx0.y4.f277204h) {
            return this.B;
        }
        return null;
    }

    public final com.tencent.maas.model.time.MJTime l7() {
        long j17;
        com.tencent.maas.moviecomposing.Timeline timeline;
        com.tencent.maas.model.time.MJTime l17;
        com.tencent.maas.moviecomposing.Storyline storyline;
        com.tencent.maas.moviecomposing.segments.Segment[] l18;
        java.lang.Long valueOf;
        com.tencent.maas.moviecomposing.Timeline timeline2 = this.E;
        com.tencent.maas.model.time.MJTime mJTime = null;
        if (timeline2 != null && (storyline = timeline2.f48414a) != null && (l18 = storyline.l()) != null) {
            if (l18.length == 0) {
                valueOf = null;
            } else {
                valueOf = java.lang.Long.valueOf(l18[0].B().getEndTime().getFlicks());
                kz5.x0 it = new e06.k(1, l18.length - 1).iterator();
                while (((e06.j) it).f246214f) {
                    java.lang.Long valueOf2 = java.lang.Long.valueOf(l18[it.b()].B().getEndTime().getFlicks());
                    if (valueOf.compareTo(valueOf2) < 0) {
                        valueOf = valueOf2;
                    }
                }
            }
            java.lang.Long l19 = valueOf;
            if (l19 != null) {
                j17 = l19.longValue();
                timeline = this.E;
                if (timeline != null && (l17 = timeline.l()) != null) {
                    mJTime = ou0.f.b(l17, new com.tencent.maas.model.time.MJTime(j17));
                }
                if (!(mJTime == null && mJTime.isValid()) || mJTime != null) {
                    return mJTime;
                }
                com.tencent.maas.model.time.MJTime InvalidTime = com.tencent.maas.model.time.MJTime.InvalidTime;
                kotlin.jvm.internal.o.f(InvalidTime, "InvalidTime");
                return InvalidTime;
            }
        }
        j17 = 0;
        timeline = this.E;
        if (timeline != null) {
            mJTime = ou0.f.b(l17, new com.tencent.maas.model.time.MJTime(j17));
        }
        if (!(mJTime == null && mJTime.isValid())) {
            return mJTime;
        }
        com.tencent.maas.model.time.MJTime InvalidTime2 = com.tencent.maas.model.time.MJTime.InvalidTime;
        kotlin.jvm.internal.o.f(InvalidTime2, "InvalidTime");
        return InvalidTime2;
    }

    public final boolean m7() {
        return this.f276256w == gx0.fd.f276431g || this.f276256w == gx0.fd.f276433i;
    }

    public final void n7() {
        com.tencent.maas.model.time.MJTime l76 = l7();
        if (l76.isValid()) {
            this.f276257x.postValue(l76);
        }
    }

    public final void o7(com.tencent.maas.model.time.MJTimeRange range, boolean z17) {
        kotlin.jvm.internal.o.g(range, "range");
        boolean z18 = !kotlin.jvm.internal.o.b(this.C, range);
        this.C = range;
        if (z18 && this.f276256w == gx0.fd.f276432h && z17) {
            kotlinx.coroutines.l.d(getMainScope(), this.f276253t, null, new gx0.re(this, range, null), 2, null);
        }
    }

    @Override // pf5.o, pf5.e, androidx.lifecycle.c1
    public void onCleared() {
        ((java.util.LinkedList) this.G).clear();
        ((java.util.LinkedList) this.I).clear();
        kotlinx.coroutines.v2.c(this.f276252s, null, 1, null);
        kotlinx.coroutines.v2.c(this.f276253t, null, 1, null);
        super.onCleared();
    }

    public final boolean p7(com.tencent.maas.model.time.MJTime time, boolean z17, long j17) {
        kotlin.jvm.internal.o.g(time, "time");
        Y6(kotlinx.coroutines.l.a(getMainScope(), this.f276253t, kotlinx.coroutines.a1.LAZY, new gx0.te(this, time, j17, z17, null)));
        return true;
    }

    public final java.lang.Object s7(kotlin.coroutines.Continuation continuation) {
        java.lang.Object t76;
        return (m7() || (t76 = t7(this, false, continuation, 1, null)) != pz5.a.f359186d) ? jz5.f0.f302826a : t76;
    }
}
