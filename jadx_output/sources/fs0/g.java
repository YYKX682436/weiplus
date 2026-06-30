package fs0;

/* loaded from: classes10.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f266231a;

    /* renamed from: b, reason: collision with root package name */
    public final long f266232b;

    /* renamed from: c, reason: collision with root package name */
    public final hs0.a f266233c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.Surface f266234d;

    /* renamed from: f, reason: collision with root package name */
    public wo.i1 f266236f;

    /* renamed from: g, reason: collision with root package name */
    public android.media.MediaFormat f266237g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.r f266238h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f266239i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.l f266240j;

    /* renamed from: k, reason: collision with root package name */
    public yz5.a f266241k;

    /* renamed from: l, reason: collision with root package name */
    public int f266242l;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f266245o;

    /* renamed from: p, reason: collision with root package name */
    public int f266246p;

    /* renamed from: q, reason: collision with root package name */
    public float f266247q;

    /* renamed from: r, reason: collision with root package name */
    public final fs0.c f266248r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f266249s;

    /* renamed from: v, reason: collision with root package name */
    public volatile int f266252v;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f266235e = "MicroMsg.IMediaCodecTransDecoder";

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.Semaphore f266243m = new java.util.concurrent.Semaphore(1);

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Object f266244n = new java.lang.Object();

    /* renamed from: t, reason: collision with root package name */
    public long f266250t = -1;

    /* renamed from: u, reason: collision with root package name */
    public long f266251u = -1;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.ArrayList f266253w = new java.util.ArrayList();

    public g(long j17, long j18, hs0.a aVar, android.view.Surface surface, int i17, boolean z17) {
        this.f266231a = j17;
        this.f266232b = j18;
        this.f266233c = aVar;
        this.f266234d = surface;
        com.tencent.mars.xlog.Log.i("MicroMsg.IMediaCodecTransDecoder", "create IMediaCodecTransDecoder, startTimeMs:" + j17 + ", endTimeMs:" + j18);
        if (aVar != null) {
            aVar.g();
        }
        if (j17 >= 0 && aVar != null) {
            aVar.e(1000 * j17);
        }
        this.f266248r = new fs0.c(aVar != null ? aVar.f284547a : null, i17, j17 * 1000, z17);
        this.f266252v = 0;
    }

    public final void a(long j17, long j18, android.media.MediaCodec.BufferInfo bufferInfo) {
        java.util.ArrayList arrayList = this.f266253w;
        if (arrayList.contains(java.lang.Long.valueOf(j17))) {
            yz5.r rVar = this.f266238h;
            if (rVar != null) {
                return;
            }
            return;
        }
        arrayList.add(java.lang.Long.valueOf(j17));
        yz5.r rVar2 = this.f266238h;
        if (rVar2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01df, code lost:
    
        if (r7.longValue() != r8) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0297 A[EDGE_INSN: B:101:0x0297->B:61:0x0297 BREAK  A[LOOP:0: B:73:0x01a7->B:99:0x01a7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r13, android.media.MediaCodec.BufferInfo r14) {
        /*
            Method dump skipped, instructions count: 723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fs0.g.b(int, android.media.MediaCodec$BufferInfo):void");
    }

    public void c() {
        com.tencent.mars.xlog.Log.i(this.f266235e, "releaseDecoder  " + hashCode());
        synchronized (this.f266244n) {
            try {
                this.f266248r.f266205g.clear();
                wo.i1 i1Var = this.f266236f;
                if (i1Var != null) {
                    i1Var.y();
                }
                com.tencent.mars.xlog.Log.i(this.f266235e, "decoder?.stop()");
                wo.i1 i1Var2 = this.f266236f;
                if (i1Var2 != null) {
                    i1Var2.q();
                }
                com.tencent.mars.xlog.Log.i(this.f266235e, "decoder?.release()");
                this.f266245o = true;
                android.view.Surface surface = this.f266234d;
                if (surface != null) {
                    surface.release();
                }
                com.tencent.mars.xlog.Log.i(this.f266235e, "releaseDecoder end");
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public void d(boolean z17) {
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        java.util.concurrent.Semaphore semaphore = this.f266243m;
        semaphore.availablePermits();
        java.util.Objects.toString(java.lang.Thread.currentThread());
        if (z17) {
            java.util.Objects.toString(java.lang.Thread.currentThread());
            semaphore.acquire();
        } else {
            java.util.Objects.toString(java.lang.Thread.currentThread());
            semaphore.release();
        }
        semaphore.availablePermits();
        java.util.Objects.toString(java.lang.Thread.currentThread());
    }

    public abstract void e();
}
