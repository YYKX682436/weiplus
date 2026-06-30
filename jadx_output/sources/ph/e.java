package ph;

/* loaded from: classes12.dex */
public final class e {
    public e(kotlin.jvm.internal.i iVar) {
    }

    public final ph.t a() {
        if (ph.t.f354283k == null) {
            synchronized ("Matrix.battery.LifeCycle") {
                if (ph.t.f354283k == null) {
                    throw new java.lang.IllegalStateException("Call #init() first!".toString());
                }
            }
        }
        ph.t tVar = ph.t.f354283k;
        kotlin.jvm.internal.o.d(tVar);
        return tVar;
    }

    public final boolean b() {
        boolean z17;
        if (ph.t.f354283k != null) {
            return true;
        }
        synchronized ("Matrix.battery.LifeCycle") {
            z17 = ph.t.f354283k != null;
        }
        return z17;
    }
}
