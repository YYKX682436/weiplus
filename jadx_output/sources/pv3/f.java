package pv3;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final pv3.f f358589a = new pv3.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f358590b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f358591c = jz5.h.b(pv3.e.f358588d);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f358592d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f358593e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static c50.x0 f358594f;

    public final void a(long j17, iv3.a aVar) {
        java.lang.Object putIfAbsent;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f358593e;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Object obj = concurrentHashMap.get(valueOf);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = new java.util.LinkedList()))) != null) {
            obj = putIfAbsent;
        }
        ((java.util.LinkedList) obj).add(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r25, iv3.a r26) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pv3.f.b(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo, iv3.a):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(long r16, java.lang.String r18, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r19) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pv3.f.c(long, java.lang.String, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo):void");
    }

    public final boolean d(java.lang.String str) {
        return o35.a.b(str) && o35.a.g(str) > 0;
    }

    public final void e(boolean z17, lv3.a aVar) {
        long j17 = aVar.f321508a;
        com.tencent.mars.xlog.Log.i("MusicCacheManager", "[notifyVideoFinish] success:" + z17 + " key:" + pm0.v.u(j17));
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f358593e;
        java.util.LinkedList linkedList = (java.util.LinkedList) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((iv3.a) it.next()).a(z17, aVar);
            }
        }
        concurrentHashMap.remove(java.lang.Long.valueOf(j17));
    }
}
