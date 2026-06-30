package dr0;

/* loaded from: classes12.dex */
public final class c2 extends dr0.j2 {
    public c2() {
        super(7);
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
        ph.c c17 = tVar.c();
        if (c17.c()) {
            return true;
        }
        c17.f();
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "abort: not-battRestrict");
        return false;
    }

    @Override // dr0.j2
    public dr0.t2 b() {
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "#recyclingBatteryRestrict");
        if (a()) {
            return dr0.a3.b(dr0.a3.f242403d.a(), this.f242449a);
        }
        return null;
    }
}
