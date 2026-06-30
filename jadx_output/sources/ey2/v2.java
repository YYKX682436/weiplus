package ey2;

/* loaded from: classes2.dex */
public final class v2 extends pf5.o0 {

    /* renamed from: e */
    public ey2.q2 f257555e;

    /* renamed from: f */
    public final java.util.HashMap f257556f = new java.util.HashMap();

    /* renamed from: g */
    public final java.util.HashMap f257557g = new java.util.HashMap();

    /* renamed from: h */
    public final java.util.HashMap f257558h = new java.util.HashMap();

    /* renamed from: i */
    public final java.util.HashMap f257559i = new java.util.HashMap();

    /* renamed from: m */
    public final java.util.HashMap f257560m = new java.util.HashMap();

    public static /* synthetic */ void X6(ey2.v2 v2Var, long j17, int i17, int i18, long j18, long j19, float f17, int i19, boolean z17, ey2.t2 t2Var, int i27, java.lang.Object obj) {
        v2Var.W6(j17, i17, i18, j18, j19, f17, (i27 & 64) != 0 ? 1 : i19, (i27 & 128) != 0 ? false : z17, (i27 & 256) != 0 ? ey2.t2.f257523p : t2Var);
    }

    public final void N6(long j17) {
        this.f257556f.remove(pm0.v.u(j17));
        com.tencent.mars.xlog.Log.i("Finder.VideoStateCacheVM", "clearFeedProgress: feedId=".concat(pm0.v.u(j17)));
    }

    public final int O6(long j17) {
        ey2.r2 r2Var = (ey2.r2) this.f257557g.get(java.lang.Long.valueOf(j17));
        if (r2Var != null) {
            return r2Var.f257493a;
        }
        return 0;
    }

    public final int P6(long j17) {
        ey2.r2 r2Var = (ey2.r2) this.f257557g.get(java.lang.Long.valueOf(j17));
        if (r2Var != null) {
            return r2Var.f257494b;
        }
        return 0;
    }

    public final ey2.u2 Q6(long j17) {
        return (ey2.u2) this.f257558h.get(java.lang.Long.valueOf(j17));
    }

    public final ey2.q2 R6(long j17, boolean z17, ey2.t2 invokeSource) {
        kotlin.jvm.internal.o.g(invokeSource, "invokeSource");
        java.util.HashMap hashMap = this.f257556f;
        ey2.q2 q2Var = (ey2.q2) hashMap.get(pm0.v.u(j17));
        if (z17) {
            hashMap.remove(pm0.v.u(j17));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getVideoProgress] feedId=");
        sb6.append(pm0.v.u(j17));
        sb6.append(" playTimeMs=");
        sb6.append(q2Var != null ? java.lang.Long.valueOf(q2Var.f257481d) : null);
        sb6.append(" totalTimeMs=");
        sb6.append(q2Var != null ? java.lang.Long.valueOf(q2Var.f257482e) : null);
        sb6.append(" invokeSource=");
        sb6.append(invokeSource);
        sb6.append(" progress=");
        sb6.append(q2Var != null ? java.lang.Integer.valueOf(q2Var.f257480c) : null);
        sb6.append(" needRemove=");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("Finder.VideoStateCacheVM", sb6.toString());
        return q2Var;
    }

    public final ey2.q2 S6(long j17, int i17) {
        if (((ey2.t0) pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class)).R6(i17)) {
            return null;
        }
        ey2.q2 q2Var = this.f257555e;
        boolean z17 = false;
        if (q2Var != null && q2Var.f257478a == j17) {
            z17 = true;
        }
        if (z17) {
            return q2Var;
        }
        return null;
    }

    public final void T6(long j17) {
        java.util.HashMap hashMap = this.f257557g;
        ey2.r2 r2Var = (ey2.r2) hashMap.get(java.lang.Long.valueOf(j17));
        if (r2Var == null) {
            hashMap.put(java.lang.Long.valueOf(j17), new ey2.r2(1, 1, 0));
        } else {
            r2Var.f257493a++;
            r2Var.f257494b++;
        }
    }

    public final void U6(long j17, int i17, int i18, long j18, long j19, float f17, ey2.t2 invokeSource) {
        kotlin.jvm.internal.o.g(invokeSource, "invokeSource");
        com.tencent.mars.xlog.Log.i("Finder.VideoStateCacheVM", "[store] feedId=" + pm0.v.u(j17) + " playTimeMs=" + j18 + " totalTimeMs=" + j19 + " invokeSource=" + invokeSource + " progress=" + i18 + " speedRatio=" + f17);
        ey2.q2 q2Var = new ey2.q2(j17, i17);
        q2Var.f257480c = i18;
        q2Var.f257481d = j18;
        q2Var.f257482e = j19;
        q2Var.f257483f = f17;
        this.f257555e = q2Var;
    }

    public final void V6(java.lang.Long l17, java.lang.Integer num, float f17) {
        if (num == null || num.intValue() != 356 || l17 == null || l17.longValue() == 0) {
            return;
        }
        this.f257560m.put(l17, java.lang.Float.valueOf(f17));
    }

    public final void W6(long j17, int i17, int i18, long j18, long j19, float f17, int i19, boolean z17, ey2.t2 invokeSource) {
        kotlin.jvm.internal.o.g(invokeSource, "invokeSource");
        com.tencent.mars.xlog.Log.i("Finder.VideoStateCacheVM", "[storeProgress] feedId=" + pm0.v.u(j17) + " playTimeMs=" + j18 + " totalTimeMs=" + j19 + " invokeSource=" + invokeSource + " progress=" + i18 + " speedRatio=" + f17 + " seekMode=" + i19 + " forceSeek=" + z17);
        java.util.HashMap hashMap = this.f257556f;
        java.lang.String u17 = pm0.v.u(j17);
        ey2.q2 q2Var = new ey2.q2(j17, i17);
        q2Var.f257480c = i18;
        q2Var.f257481d = j18;
        q2Var.f257482e = j19;
        q2Var.f257483f = f17;
        q2Var.f257485h = i19;
        q2Var.f257486i = z17;
        hashMap.put(u17, q2Var);
        java.util.HashMap hashMap2 = this.f257557g;
        ey2.r2 r2Var = (ey2.r2) hashMap2.get(java.lang.Long.valueOf(j17));
        if (r2Var == null) {
            hashMap2.put(java.lang.Long.valueOf(j17), new ey2.r2(0, 0, i18));
        } else if (r2Var.f257495c < i18) {
            r2Var.f257495c = i18;
        }
    }

    public final float a(java.lang.Long l17, java.lang.Integer num) {
        if (num == null || num.intValue() != 356 || l17 == null) {
            return -1.0f;
        }
        l17.longValue();
        java.lang.Float f17 = (java.lang.Float) this.f257560m.get(l17);
        if (f17 == null) {
            return -1.0f;
        }
        return f17.floatValue();
    }
}
