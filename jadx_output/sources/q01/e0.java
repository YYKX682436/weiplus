package q01;

/* loaded from: classes12.dex */
public final class e0 {

    /* renamed from: c, reason: collision with root package name */
    public static jz5.l f359272c;

    /* renamed from: a, reason: collision with root package name */
    public static final q01.e0 f359270a = new q01.e0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f359271b = jz5.h.a(jz5.i.f302829d, q01.d0.f359269d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f359273d = jz5.h.b(q01.a0.f359258d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f359274e = jz5.h.b(q01.c0.f359265d);

    public final java.util.Vector a() {
        if (!e()) {
            return new java.util.Vector();
        }
        q01.c1 c1Var = new q01.c1();
        q01.b0 observer = (q01.b0) ((jz5.n) f359274e).getValue();
        kotlin.jvm.internal.o.g(observer, "observer");
        java.util.ArrayList arrayList = (java.util.ArrayList) c1Var.f359266d;
        if (arrayList.contains(observer)) {
            return c1Var;
        }
        arrayList.add(observer);
        return c1Var;
    }

    public final void b() {
        c(((hr0.k0) ((q01.q0) i95.n0.c(q01.q0.class))).Bi().size(), ((hr0.k0) ((q01.q0) i95.n0.c(q01.q0.class))).Di().size());
    }

    public final void c(int i17, int i18) {
        long longValue;
        boolean z17 = i17 >= gm0.j1.d().f70766f && i18 > 0;
        jz5.l lVar = f359272c;
        if (lVar == null || ((java.lang.Boolean) lVar.f302833d).booleanValue() != z17) {
            synchronized (this) {
                jz5.l lVar2 = f359272c;
                if (lVar2 == null || ((java.lang.Boolean) lVar2.f302833d).booleanValue() != z17) {
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
                    java.lang.Long valueOf2 = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                    jz5.l lVar3 = new jz5.l(valueOf, valueOf2);
                    if (f359272c == null) {
                        longValue = -1;
                    } else {
                        long longValue2 = valueOf2.longValue();
                        jz5.l lVar4 = f359272c;
                        kotlin.jvm.internal.o.d(lVar4);
                        longValue = longValue2 - ((java.lang.Number) lVar4.f302834e).longValue();
                    }
                    long j17 = longValue;
                    f359272c = lVar3;
                    if (j17 <= 0) {
                        return;
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneQueueTracker", "dispatchWaitingChanged: jam=" + z17 + ", durationMs=" + j17);
                    if (j17 <= com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
                        return;
                    }
                    java.lang.Throwable th6 = new java.lang.Throwable();
                    com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneQueueTracker", "NetSceneInspect jam report task - clear & post");
                    ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.NetSceneQueueTracker.Jamming");
                    ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.NetSceneQueueTracker.JammingRestore");
                    ((ku5.t0) ku5.t0.f312615d).l(new q01.z(z17, j17, th6, i17, i18), z17 ? 5000L : 0L, "MicroMsg.NetSceneQueueTracker.Jamming");
                }
            }
        }
    }

    public final java.util.Set d() {
        return (java.util.Set) ((jz5.n) f359273d).getValue();
    }

    public final boolean e() {
        return ((java.lang.Boolean) f359271b.getValue()).booleanValue();
    }
}
