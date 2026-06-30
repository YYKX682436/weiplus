package ju5;

/* loaded from: classes15.dex */
public class n {

    /* renamed from: b, reason: collision with root package name */
    public static volatile ju5.n f302126b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile android.util.SparseArray f302127c;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f302128a = new java.lang.Object();

    public n() {
        f302127c = new android.util.SparseArray(5);
    }

    public static ju5.n c() {
        ju5.n nVar;
        if (f302126b != null) {
            return f302126b;
        }
        synchronized (ju5.n.class) {
            if (f302126b == null) {
                f302126b = new ju5.n();
            }
            nVar = f302126b;
        }
        return nVar;
    }

    public boolean a(ju5.f fVar, eu5.e eVar) {
        if (fVar == null) {
            zt5.h.b("Soter.SoterTaskManager", "soter: task is null. should not happen", new java.lang.Object[0]);
            return false;
        }
        if (eVar == null) {
            zt5.h.b("Soter.SoterTaskManager", "soter: instanceOnError is null. should not happen", new java.lang.Object[0]);
            return false;
        }
        if (fVar.g()) {
            zt5.h.a("Soter.SoterTaskManager", "soter: prepare eat execute.", new java.lang.Object[0]);
            return false;
        }
        int hashCode = fVar.hashCode();
        if (!fVar.d()) {
            zt5.h.c("Soter.SoterTaskManager", "soter: not single instance. directly execute", new java.lang.Object[0]);
            synchronized (this.f302128a) {
                f302127c.put(hashCode, fVar);
            }
            ju5.o.a().c(new ju5.i(this, fVar));
            return true;
        }
        synchronized (this.f302128a) {
            for (int i17 = 0; i17 < f302127c.size(); i17++) {
                int keyAt = f302127c.keyAt(i17);
                if (f302127c.get(keyAt) != null && ((ju5.f) f302127c.get(keyAt)).getClass().getName().equals(fVar.getClass().getName())) {
                    zt5.h.f("Soter.SoterTaskManager", "soter: already such type of task. abandon add task", new java.lang.Object[0]);
                    eVar.f475605a = 1023;
                    eVar.f475606b = "add SOTER task to queue failed. check the logcat for further information";
                    fVar.b(eVar);
                    return false;
                }
            }
            f302127c.put(hashCode, fVar);
            ju5.o.a().c(new ju5.j(this, fVar));
            return true;
        }
    }

    public void b() {
        synchronized (this.f302128a) {
            zt5.h.c("Soter.SoterTaskManager", "soter: request cancel all", new java.lang.Object[0]);
            if (f302127c.size() != 0) {
                for (int i17 = 0; i17 < f302127c.size(); i17++) {
                    ju5.o.a().c(new ju5.k(this, f302127c.keyAt(i17)));
                }
            }
            f302127c.clear();
        }
    }

    public void d() {
        synchronized (this.f302128a) {
            zt5.h.c("Soter.SoterTaskManager", "soter: request publish cancellation", new java.lang.Object[0]);
            if (f302127c.size() != 0) {
                for (int i17 = 0; i17 < f302127c.size(); i17++) {
                    ju5.o.a().c(new ju5.l(this, f302127c.keyAt(i17)));
                }
            }
        }
    }

    public void e(ju5.f fVar) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = fVar != null ? java.lang.Integer.valueOf(fVar.hashCode()) : "null";
        zt5.h.c("Soter.SoterTaskManager", "soter: removing task: %d", objArr);
        if (fVar == null) {
            zt5.h.b("Soter.SoterTaskManager", "soter: task is null", new java.lang.Object[0]);
            return;
        }
        synchronized (this.f302128a) {
            if (f302127c.get(fVar.hashCode()) == null) {
                zt5.h.c("Soter.SoterTaskManager", "soter: no such task: %d. maybe this task did not pass preExecute", java.lang.Integer.valueOf(fVar.hashCode()));
            } else {
                f302127c.remove(fVar.hashCode());
            }
        }
    }
}
