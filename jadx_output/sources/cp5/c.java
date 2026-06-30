package cp5;

/* loaded from: classes14.dex */
public final class c implements com.tencent.mm.plugin.vqm.g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f221119a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f221120b;

    /* renamed from: c, reason: collision with root package name */
    public final long f221121c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.vqm.f f221122d;

    /* renamed from: e, reason: collision with root package name */
    public final long f221123e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f221124f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f221125g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f221126h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f221127i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f221128j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f221129k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f221130l;

    public c(java.lang.String tag, boolean z17, long j17) {
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f221119a = tag;
        this.f221120b = z17;
        this.f221121c = j17;
        com.tencent.mm.plugin.vqm.a aVar = com.tencent.mm.plugin.vqm.a.f177293b;
        this.f221123e = aVar.d();
        this.f221124f = new java.util.concurrent.atomic.AtomicLong(0L);
        this.f221125g = new java.util.concurrent.atomic.AtomicLong(0L);
        this.f221126h = new java.util.concurrent.atomic.AtomicLong(0L);
        this.f221127i = new java.util.concurrent.atomic.AtomicLong(0L);
        this.f221128j = new java.util.concurrent.atomic.AtomicLong(0L);
        this.f221129k = new java.util.concurrent.atomic.AtomicLong(0L);
        this.f221130l = new java.util.concurrent.atomic.AtomicLong(0L);
        if (com.tencent.mm.plugin.vqm.b.f177316b.a()) {
            com.tencent.mm.plugin.vqm.f fVar = new com.tencent.mm.plugin.vqm.f(this);
            this.f221122d = fVar;
            aVar.a(fVar);
        }
    }

    public final void a(int i17) {
        java.util.concurrent.atomic.AtomicLong atomicLong = this.f221126h;
        atomicLong.incrementAndGet();
        this.f221127i.addAndGet(i17);
        long j17 = atomicLong.get();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = this.f221130l;
        long j18 = atomicLong2.get();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = this.f221129k;
        if (this.f221120b) {
            if (atomicLong3.get() >= 1 || j17 <= this.f221121c) {
                return;
            }
            h(false);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2139, 1);
            atomicLong3.incrementAndGet();
            return;
        }
        long j19 = atomicLong3.get();
        if (j17 - j18 < (j19 < 5 ? 1000L : j19 < 8 ? 5000L : 20000L) || !atomicLong2.compareAndSet(j18, j17)) {
            return;
        }
        h(false);
        i();
        atomicLong3.incrementAndGet();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2139, 1);
    }

    @Override // com.tencent.mm.plugin.vqm.g
    public long b() {
        return this.f221123e;
    }

    @Override // com.tencent.mm.plugin.vqm.g
    public void c() {
        i();
    }

    @Override // com.tencent.mm.plugin.vqm.g
    public void d() {
    }

    @Override // com.tencent.mm.plugin.vqm.g
    public void e() {
        i();
    }

    @Override // com.tencent.mm.plugin.vqm.g
    public void f(com.tencent.mm.plugin.vqm.b0 b0Var, byte[] bArr, byte[] bArr2) {
    }

    @Override // com.tencent.mm.plugin.vqm.g
    public void g(com.tencent.mm.plugin.vqm.l lVar, com.tencent.mm.plugin.vqm.h hVar, com.tencent.mm.plugin.vqm.p pVar, com.tencent.mm.plugin.vqm.j jVar, com.tencent.mm.plugin.vqm.z zVar, com.tencent.mm.plugin.vqm.t tVar, com.tencent.mm.plugin.vqm.a0 a0Var, com.tencent.mm.plugin.vqm.y yVar) {
    }

    public final void h(boolean z17) {
        long j17 = this.f221126h.get();
        java.lang.String str = this.f221119a + "_Report";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[BufferReport(Stopped: ");
        sb6.append(z17);
        sb6.append(")] AllocCount:");
        sb6.append(j17);
        sb6.append(" | Phys:");
        java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf((this.f221127i.get() / 1024.0d) / 1024.0d)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        sb6.append(format);
        sb6.append("MB | Virt:");
        java.lang.String format2 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf((this.f221128j.get() / 1024.0d) / 1024.0d)}, 1));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        sb6.append(format2);
        sb6.append("MB");
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
    }

    public final void i() {
        if (this.f221122d == null) {
            return;
        }
        com.tencent.mm.plugin.vqm.a aVar = com.tencent.mm.plugin.vqm.a.f177293b;
        com.tencent.mm.plugin.vqm.b0 b0Var = com.tencent.mm.plugin.vqm.b0.Matrix;
        com.tencent.mm.plugin.vqm.p pVar = new com.tencent.mm.plugin.vqm.p();
        pVar.K = this.f221128j.get();
        pVar.W[31] = true;
        pVar.f177423J = this.f221127i.get();
        pVar.W[30] = true;
        aVar.f(b0Var, pVar.toByteArrayOrNull());
    }
}
