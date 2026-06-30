package w21;

/* loaded from: classes14.dex */
public final class t0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.ThreadLocal f442468f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.ThreadLocal f442469g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.Object f442470h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.Object f442471i;

    /* renamed from: a, reason: collision with root package name */
    public final int f442472a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f442473b;

    /* renamed from: c, reason: collision with root package name */
    public final long f442474c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f442475d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f442476e;

    static {
        new w21.s0(null);
        f442468f = new java.lang.ThreadLocal();
        f442469g = new java.lang.ThreadLocal();
        f442470h = new java.lang.Object();
        f442471i = new java.lang.Object();
    }

    public t0(int i17, byte[] pInData, int i18) {
        long SilkDecInit;
        long j17;
        kotlin.jvm.internal.o.g(pInData, "pInData");
        this.f442472a = i17;
        long id6 = java.lang.Thread.currentThread().getId();
        java.lang.Thread.currentThread().getName();
        java.lang.String str = "thread_" + id6 + '_' + i17 + '_' + java.lang.System.nanoTime();
        this.f442473b = str;
        java.lang.ThreadLocal threadLocal = f442468f;
        java.util.Map map = (java.util.Map) threadLocal.get();
        if (map == null) {
            map = new java.util.LinkedHashMap();
            threadLocal.set(map);
        }
        java.lang.ThreadLocal threadLocal2 = f442469g;
        java.util.Map map2 = (java.util.Map) threadLocal2.get();
        if (map2 == null) {
            map2 = new java.util.LinkedHashMap();
            threadLocal2.set(map2);
        }
        java.lang.Long l17 = (java.lang.Long) map.get(str);
        if (l17 != null) {
            j17 = l17.longValue();
        } else {
            synchronized (f442470h) {
                SilkDecInit = com.tencent.mm.modelvoice.MediaRecorder.SilkDecInit(i17, pInData, i18, 0L);
                if (SilkDecInit != 0) {
                    map.put(str, java.lang.Long.valueOf(SilkDecInit));
                    map2.put(str, new java.util.concurrent.atomic.AtomicInteger(0));
                    c(SilkDecInit);
                    this.f442475d = true;
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MSP.ThreadSafeSilkDecoder", "Failed to create decoder for thread " + id6 + ", sampleRate: " + i17);
                }
            }
            j17 = SilkDecInit;
        }
        this.f442474c = j17;
        if (j17 != 0) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) map2.get(str);
            if (atomicInteger != null) {
                atomicInteger.incrementAndGet();
            }
            if (this.f442475d) {
                return;
            }
            this.f442475d = true;
        }
    }

    public final int a() {
        int SilkDecUnInit;
        if (this.f442476e) {
            return 0;
        }
        this.f442476e = true;
        if (this.f442474c == 0) {
            return 0;
        }
        java.lang.ThreadLocal threadLocal = f442468f;
        java.util.Map map = (java.util.Map) threadLocal.get();
        if (map == null) {
            map = new java.util.LinkedHashMap();
            threadLocal.set(map);
        }
        java.lang.ThreadLocal threadLocal2 = f442469g;
        java.util.Map map2 = (java.util.Map) threadLocal2.get();
        if (map2 == null) {
            map2 = new java.util.LinkedHashMap();
            threadLocal2.set(map2);
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) map2.get(this.f442473b);
        if (atomicInteger == null || atomicInteger.decrementAndGet() > 0) {
            return 0;
        }
        try {
            synchronized (f442470h) {
                SilkDecUnInit = com.tencent.mm.modelvoice.MediaRecorder.SilkDecUnInit(this.f442474c);
            }
            map.remove(this.f442473b);
            map2.remove(this.f442473b);
            return SilkDecUnInit;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MSP.ThreadSafeSilkDecoder", "Exception during release: " + e17.getMessage(), e17);
            return -1;
        }
    }

    public final int b(byte[] pOutData, short s17) {
        int SilkDoDec;
        kotlin.jvm.internal.o.g(pOutData, "pOutData");
        long id6 = java.lang.Thread.currentThread().getId();
        if (this.f442476e) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MSP.ThreadSafeSilkDecoder", "Decoder already released, thread: " + id6);
            return -1;
        }
        if (this.f442474c == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MSP.ThreadSafeSilkDecoder", "Decoder not initialized, thread: " + id6 + ", sampleRate: " + this.f442472a);
            return -2;
        }
        if (s17 <= 0 || s17 > pOutData.length) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MSP.ThreadSafeSilkDecoder", "Invalid output data length: " + ((int) s17) + ", array size: " + pOutData.length);
            return -3;
        }
        try {
            synchronized (f442471i) {
                SilkDoDec = com.tencent.mm.modelvoice.MediaRecorder.SilkDoDec(pOutData, s17, this.f442474c);
            }
            return SilkDoDec;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MSP.ThreadSafeSilkDecoder", "Exception during decode: " + e17.getMessage(), e17);
            return -6;
        }
    }

    public final void c(long j17) {
        try {
            wd0.l1 l1Var = (wd0.l1) i95.n0.c(wd0.l1.class);
            boolean bj6 = l1Var != null ? ((u14.t) l1Var).bj() : false;
            int Di = l1Var != null ? ((u14.t) l1Var).Di() : 0;
            int Ni = l1Var != null ? ((u14.t) l1Var).Ni() : 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.MSP.ThreadSafeSilkDecoder", "WaveHAid, flag:" + bj6 + ", type:" + Di + ", device:" + Ni);
            if (bj6) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MSP.ThreadSafeSilkDecoder", "WaveHAid initialized, ret:" + com.tencent.mm.modelvoice.MediaRecorder.SetVoiceSilkDecControl(300, new byte[]{(byte) (Di & 255), (byte) ((Di >> 8) & 255), (byte) ((Di >> 16) & 255), (byte) ((Di >> 24) & 255), (byte) (Ni & 255), (byte) ((Ni >> 8) & 255), (byte) ((Ni >> 16) & 255), (byte) ((Ni >> 24) & 255)}, 8, j17));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MSP.ThreadSafeSilkDecoder", "Failed to initialize hearing aid: " + e17.getMessage());
        }
    }

    public final int d(int i17, byte[] parameter, int i18) {
        kotlin.jvm.internal.o.g(parameter, "parameter");
        long j17 = this.f442474c;
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MSP.ThreadSafeSilkDecoder", "Decoder not initialized");
            return -1;
        }
        try {
            return com.tencent.mm.modelvoice.MediaRecorder.SetVoiceSilkDecControl(i17, parameter, i18, j17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MSP.ThreadSafeSilkDecoder", "Exception during setVoiceSilkDecodeControl: " + e17.getMessage(), e17);
            return -1;
        }
    }
}
