package dr0;

/* loaded from: classes12.dex */
public final class i2 extends dr0.j2 {
    public i2() {
        super(6);
    }

    @Override // dr0.j2
    public boolean a() {
        if (!dr0.j2.f242440b.a() || !mm.k.j(mm.k.N, null, 1, null)) {
            return false;
        }
        if (ph.t.f354283k == null) {
            synchronized ("Matrix.battery.LifeCycle") {
                if (ph.t.f354283k == null) {
                    throw new java.lang.IllegalStateException("Call #init() first!".toString());
                }
            }
        }
        ph.t tVar = ph.t.f354283k;
        kotlin.jvm.internal.o.d(tVar);
        if (wh.m.z(tVar.c().f354256b)) {
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "abort: not-sysDoze");
        return false;
    }

    @Override // dr0.j2
    public dr0.t2 b() {
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "#recyclingSystemDoze");
        if (a()) {
            return dr0.a3.b(dr0.a3.f242403d.a(), this.f242449a);
        }
        return null;
    }
}
