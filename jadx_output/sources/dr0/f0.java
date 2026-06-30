package dr0;

/* loaded from: classes12.dex */
public final class f0 extends com.tencent.matrix.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dr0.t0 f242422b;

    public f0(dr0.t0 t0Var) {
        this.f242422b = t0Var;
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.AccMonitor", "bg, curr=".concat(dr0.t0.g(this.f242422b, currentTimeMillis)));
        dr0.t0 t0Var = this.f242422b;
        t0Var.f242547g = currentTimeMillis;
        long j17 = t0Var.f242548h;
        if (1 <= j17 && j17 < currentTimeMillis) {
            long j18 = currentTimeMillis - j17;
            t0Var.i().setAccFgMs(this.f242422b.i().getAccFgMs() + j18);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("acc fgMin: ");
            long accFgMs = this.f242422b.i().getAccFgMs();
            long j19 = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
            sb6.append(accFgMs / j19);
            sb6.append(", last=");
            dr0.t0 t0Var2 = this.f242422b;
            sb6.append(dr0.t0.g(t0Var2, t0Var2.f242548h));
            sb6.append(", delta=");
            sb6.append(j18 / j19);
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.AccMonitor", sb6.toString());
        }
        dr0.t0 t0Var3 = this.f242422b;
        t0Var3.f242548h = 0L;
        t0Var3.b(false);
        if (this.f242422b.f242541a) {
            dr0.a3 a17 = dr0.a3.f242403d.a();
            a17.getClass();
            if (dr0.j2.f242440b.a()) {
                ((ku5.t0) ku5.t0.f312615d).g(new dr0.u2(a17));
            }
        }
        if (com.tencent.mm.sdk.platformtools.x2.p()) {
            this.f242422b.i().collectAppExpStat(false);
            this.f242422b.k();
        }
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.AccMonitor", "fg, curr=".concat(dr0.t0.g(this.f242422b, currentTimeMillis)));
        this.f242422b.f242541a = true;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            dr0.a3.f242403d.a().d("fg");
            ((com.tencent.mm.feature.performance.r4) ((uq3.h) i95.n0.c(uq3.h.class))).getClass();
            dr0.h1 h1Var = dr0.p1.f242489d;
            h1Var.a().k(false);
            if (h1Var.a().f242493c) {
                h1Var.a().m(false);
            }
            if (q01.a1.f359259a.b()) {
                ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.NetSceneTracker");
                ((ku5.t0) ku5.t0.f312615d).l(q01.v0.f359340d, 60000L, "MicroMsg.NetSceneTracker");
            }
            cr0.k4.f221669a.a();
        }
        if (com.tencent.mm.sdk.platformtools.x2.p()) {
            dr0.t0 t0Var = this.f242422b;
            t0Var.f242542b = 0;
            t0Var.i().collectAppExpStat(true);
            dr0.q3.f242513t.h();
            dr0.q3.f242512s.h();
            this.f242422b.f242545e = 0L;
        }
        dr0.t0 t0Var2 = this.f242422b;
        t0Var2.f242548h = currentTimeMillis;
        long j17 = t0Var2.f242547g;
        if (1 <= j17 && j17 < currentTimeMillis) {
            long j18 = currentTimeMillis - j17;
            t0Var2.i().collectBgMs(j18);
            this.f242422b.i().setAccBgMs(this.f242422b.i().getAccBgMs() + j18);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("acc bgMin: ");
            long accBgMs = this.f242422b.i().getAccBgMs();
            long j19 = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
            sb6.append(accBgMs / j19);
            sb6.append(", last=");
            dr0.t0 t0Var3 = this.f242422b;
            sb6.append(dr0.t0.g(t0Var3, t0Var3.f242547g));
            sb6.append(", delta=");
            sb6.append(j18 / j19);
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.AccMonitor", sb6.toString());
        }
        dr0.t0 t0Var4 = this.f242422b;
        t0Var4.f242547g = 0L;
        t0Var4.b(false);
    }
}
