package y21;

/* loaded from: classes14.dex */
public final class e implements x21.d {

    /* renamed from: f, reason: collision with root package name */
    public static int f459044f;

    /* renamed from: a, reason: collision with root package name */
    public final y21.b f459045a;

    /* renamed from: b, reason: collision with root package name */
    public int f459046b;

    /* renamed from: c, reason: collision with root package name */
    public y21.j f459047c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f459048d;

    /* renamed from: e, reason: collision with root package name */
    public long f459049e;

    public e(y21.b dataSource) {
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        this.f459045a = dataSource;
        this.f459048d = new byte[100];
        synchronized (kotlin.jvm.internal.i0.a(y21.e.class)) {
            f459044f++;
            com.tencent.mars.xlog.Log.i("SafeStreamSilkDecoder", "Increment reference count: " + f459044f);
        }
    }

    @Override // x21.d
    public x21.m a() {
        return (x21.m) kotlinx.coroutines.l.f(null, new y21.c(this, null), 1, null);
    }

    public final void b() {
        int StreamSilkDecUnInit;
        com.tencent.mars.xlog.Log.w("SafeStreamSilkDecoder", "uninitDecoder " + this.f459047c);
        y21.j jVar = this.f459047c;
        if (jVar != null) {
            if (jVar.f459070e) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MSP.ThreadSafeStreamSilkDecoder", "Decoder already released, thread: " + jVar.f459068c);
            } else {
                jVar.f459070e = true;
                if (jVar.f459067b == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MSP.ThreadSafeStreamSilkDecoder", "Decoder handle is 0, nothing to release");
                } else {
                    java.lang.ThreadLocal threadLocal = y21.j.f459062g;
                    java.lang.ThreadLocal threadLocal2 = y21.j.f459062g;
                    java.util.Map map = (java.util.Map) threadLocal2.get();
                    if (map == null) {
                        map = new java.util.LinkedHashMap();
                        threadLocal2.set(map);
                    }
                    java.lang.ThreadLocal threadLocal3 = y21.j.f459063h;
                    java.util.Map map2 = (java.util.Map) threadLocal3.get();
                    if (map2 == null) {
                        map2 = new java.util.LinkedHashMap();
                        threadLocal3.set(map2);
                    }
                    java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) map2.get(jVar.f459071f);
                    if (atomicInteger == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.MSP.ThreadSafeStreamSilkDecoder", "No ref count found for key: " + jVar.f459071f);
                    } else if (atomicInteger.decrementAndGet() <= 0) {
                        try {
                            synchronized (y21.j.f459064i) {
                                StreamSilkDecUnInit = com.tencent.mm.modelvoice.MediaRecorder.StreamSilkDecUnInit(jVar.f459067b);
                            }
                            map.remove(jVar.f459071f);
                            map2.remove(jVar.f459071f);
                            com.tencent.mars.xlog.Log.i("MicroMsg.MSP.ThreadSafeStreamSilkDecoder", "Native decoder released, thread: " + jVar.f459068c + ", sampleRate: " + jVar.f459066a + ", handle: " + jVar.f459067b + ", ret: " + StreamSilkDecUnInit);
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.MSP.ThreadSafeStreamSilkDecoder", "Exception during release: " + e17.getMessage() + ", key: " + jVar.f459071f, e17);
                        }
                    }
                }
            }
        }
        this.f459047c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(kotlin.coroutines.Continuation r27) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y21.e.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d() {
        com.tencent.mars.xlog.Log.i("SafeStreamSilkDecoder", "uninit");
        synchronized (kotlin.jvm.internal.i0.a(y21.e.class)) {
            f459044f--;
            com.tencent.mars.xlog.Log.i("SafeStreamSilkDecoder", "Decrement reference count: " + f459044f);
            if (f459044f == 0) {
                com.tencent.mars.xlog.Log.i("SafeStreamSilkDecoder", "Reference count is zero, releasing resources");
                b();
            }
        }
    }
}
