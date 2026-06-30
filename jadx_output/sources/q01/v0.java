package q01;

/* loaded from: classes12.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final q01.v0 f359340d = new q01.v0();

    public static final void a(java.lang.String str, java.util.Map map) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        synchronized (q01.a1.f359261c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTracker", "clearExpired " + str + ": " + map.size());
            kz5.h0.A(map.entrySet(), new q01.t0(uptimeMillis, linkedList));
        }
        if (!linkedList.isEmpty()) {
            java.util.List<q01.s0> F0 = kz5.n0.F0(linkedList, new q01.u0());
            for (q01.s0 s0Var : F0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneTracker", "NetSceneInspect " + str + " expired: " + s0Var + '@' + s0Var.f359329a.hashCode() + ", bgnAgo=" + ((uptimeMillis - s0Var.f359331c) / com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL) + "min");
            }
            hr0.k0 k0Var = (hr0.k0) ((q01.q0) i95.n0.c(q01.q0.class));
            k0Var.getClass();
            ((ku5.t0) ku5.t0.f312615d).h(new hr0.g0(k0Var, F0, android.os.SystemClock.uptimeMillis()), "MicroMsg.NetSceneTrackFeatureService");
            int i17 = 0;
            for (java.lang.Object obj : F0) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                q01.s0 s0Var2 = (q01.s0) obj;
                long j17 = uptimeMillis - s0Var2.f359331c;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                linkedHashMap.put("durationMs", java.lang.Long.valueOf(j17));
                linkedHashMap.put(ya.b.INDEX, java.lang.Integer.valueOf(i17));
                ((hr0.k0) ((q01.q0) i95.n0.c(q01.q0.class))).wi(linkedHashMap);
                ap.a.a(10001, "longNetScene", null, linkedHashMap, str, q01.a1.f359259a.a(s0Var2.f359329a), java.lang.String.valueOf(linkedList.size()), java.lang.String.valueOf(j17 / com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL));
                i17 = i18;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        q01.a1 a1Var = q01.a1.f359259a;
        a("Enqueue", (java.util.Map) q01.a1.f359262d.getValue());
        a("Dispatch", (java.util.Map) q01.a1.f359263e.getValue());
    }
}
