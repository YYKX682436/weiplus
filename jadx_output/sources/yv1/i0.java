package yv1;

/* loaded from: classes12.dex */
public final class i0 implements aw1.f0 {

    /* renamed from: a */
    public volatile yv1.g1 f466069a;

    /* renamed from: c */
    public bw1.f f466071c;

    /* renamed from: f */
    public long f466074f;

    /* renamed from: g */
    public long f466075g;

    /* renamed from: h */
    public long f466076h;

    /* renamed from: i */
    public long f466077i;

    /* renamed from: j */
    public long f466078j;

    /* renamed from: k */
    public long f466079k;

    /* renamed from: o */
    public boolean f466083o;

    /* renamed from: q */
    public final /* synthetic */ yv1.b1 f466085q;

    /* renamed from: b */
    public final java.util.ArrayList f466070b = new java.util.ArrayList();

    /* renamed from: d */
    public final com.tencent.wcdb.support.CancellationSignal f466072d = new com.tencent.wcdb.support.CancellationSignal();

    /* renamed from: e */
    public final java.util.HashSet f466073e = new java.util.HashSet();

    /* renamed from: l */
    public java.lang.String f466080l = "";

    /* renamed from: m */
    public java.lang.String f466081m = "";

    /* renamed from: n */
    public final java.util.concurrent.atomic.AtomicBoolean f466082n = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: p */
    public final com.tencent.mm.sdk.platformtools.o4 f466084p = com.tencent.mm.sdk.platformtools.o4.J("mmkv_compress_original_media_unfinished", gm0.j1.b().h(), 1);

    public i0(yv1.b1 b1Var) {
        this.f466085q = b1Var;
    }

    public static /* synthetic */ void e(yv1.i0 i0Var, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        i0Var.d(z17, z18);
    }

    @Override // aw1.f0
    public void a(float f17, long j17, long j18, long j19, long j27, long j28, boolean z17) {
        yv1.h1.g(2, null, 2, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "progress from CompressOriginalMediaService: compressedSize: " + j17 + ", finished: " + z17);
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "CleanPersistOriginalMedia task done.");
            bw1.f fVar = this.f466071c;
            if (fVar != null) {
                fVar.a(jz5.f0.f302826a);
            }
            aw1.l0 l0Var = aw1.l0.f14568a;
            aw1.l0.f14576i.remove(this);
            this.f466071c = null;
        }
        synchronized (this) {
            long j29 = j27 - this.f466077i;
            long j37 = j28 - this.f466078j;
            long j38 = j29 + j37;
            this.f466075g = j18;
            this.f466076h = j19;
            this.f466077i = j27;
            this.f466078j = j28;
            yv1.g1 g1Var = this.f466069a;
            if (g1Var != null) {
                synchronized (g1Var) {
                    g1Var.f466044c -= j38;
                    g1Var.f466046e -= j38;
                    g1Var.f466051j -= j29;
                    g1Var.f466052k -= j37;
                    if (z17) {
                        g1Var.f466056o = null;
                    }
                }
            }
        }
        d(z17, false);
    }

    public final void b(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        bw1.f fVar = new bw1.f();
        ((ku5.t0) ku5.t0.f312615d).a(new yv1.d0(cancellationSignal, fVar, this));
        synchronized (this.f466070b) {
            this.f466070b.add(fVar);
        }
    }

    public final boolean c() {
        boolean z17;
        synchronized (this.f466070b) {
            java.util.ArrayList arrayList = this.f466070b;
            z17 = true;
            if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!((java.util.concurrent.Future) it.next()).isDone()) {
                        z17 = false;
                        break;
                    }
                }
            }
        }
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01c0 A[LOOP:0: B:41:0x01ba->B:43:0x01c0, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yv1.i0.d(boolean, boolean):void");
    }

    public final void f() {
        synchronized (this) {
            this.f466082n.set(this.f466084p.h("clean_cache_reported"));
            this.f466074f = this.f466084p.q("clean_cache_last_clean_size", 0L);
            this.f466079k = this.f466084p.q("clean_cache_estimated_size", 0L);
            aw1.o0 h17 = aw1.l0.f14568a.h();
            this.f466075g = h17.f14625b;
            this.f466076h = h17.f14626c;
            this.f466077i = h17.f14627d;
            this.f466078j = h17.f14628e;
            java.lang.String t17 = this.f466084p.t("clean_cache_session_id");
            if (t17 == null) {
                t17 = "";
            }
            this.f466081m = t17;
            java.lang.String t18 = this.f466084p.t("storage_session_id");
            if (t18 == null) {
                t18 = "";
            }
            this.f466080l = t18;
            this.f466083o = false;
        }
        bw1.f fVar = new bw1.f();
        this.f466071c = fVar;
        synchronized (this.f466070b) {
            this.f466070b.add(fVar);
        }
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = aw1.l0.f14576i;
        concurrentLinkedDeque.add(this);
        if (aw1.l0.f14574g) {
            return;
        }
        concurrentLinkedDeque.remove(this);
        this.f466071c = null;
        fVar.a(jz5.f0.f302826a);
        d(true, true);
    }
}
