package cr0;

/* loaded from: classes12.dex */
public final class p1 extends com.tencent.matrix.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    public cr0.k0 f221708b;

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        cr0.k0 k0Var = new cr0.k0();
        cr0.u0 g17 = cr0.u1.f221760a.g();
        if (g17.f221757a) {
            g17.c().lock(new cr0.i0(k0Var, g17));
        }
        this.f221708b = k0Var;
        cr0.u1 u1Var = cr0.u1.f221760a;
        synchronized (u1Var.c()) {
            u1Var.c().clear();
        }
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        java.lang.Throwable th6;
        cr0.k0 k0Var = this.f221708b;
        if (k0Var != null) {
            cr0.k0 k0Var2 = new cr0.k0();
            cr0.u1 u1Var = cr0.u1.f221760a;
            cr0.u0 g17 = u1Var.g();
            if (g17.f221757a) {
                g17.c().lock(new cr0.i0(k0Var2, g17));
            }
            cr0.j0 j0Var = new cr0.j0(k0Var, k0Var2);
            long j17 = j0Var.f395487d;
            if (j17 > 600000 && (!((cr0.k0) j0Var.f395486c).b().isEmpty())) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                ((com.tencent.mm.feature.performance.q) ((ob0.r2) i95.n0.c(ob0.r2.class))).Ri(j17, j0Var, linkedHashMap, new cr0.o1(j0Var, linkedHashMap, j17));
                long c17 = a06.d.c((((cr0.k0) j0Var.f395486c).f221790g.f395552a.floatValue() * 100.0f) / ((float) j17));
                long j18 = j17 / com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
                synchronized (u1Var.c()) {
                    th6 = (java.lang.Throwable) u1Var.c().get(((cr0.r) kz5.n0.X(((cr0.k0) j0Var.f395486c).b())).f221725d);
                }
                ap.a.a(1, "statsBinderProxy", th6, linkedHashMap, java.lang.String.valueOf(j18), ((cr0.r) ((cr0.k0) j0Var.f395486c).b().get(0)).f221725d, java.lang.String.valueOf(((cr0.k0) j0Var.f395486c).f221789f.f395552a.longValue() / j18), java.lang.String.valueOf(c17));
            }
        }
        cr0.u1 u1Var2 = cr0.u1.f221760a;
        synchronized (u1Var2.c()) {
            u1Var2.c().clear();
        }
        this.f221708b = null;
    }
}
