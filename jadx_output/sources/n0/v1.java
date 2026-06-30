package n0;

/* loaded from: classes14.dex */
public final class v1 extends x0.a1 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Object f333725f = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public java.util.HashSet f333726c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f333727d = f333725f;

    /* renamed from: e, reason: collision with root package name */
    public int f333728e;

    @Override // x0.a1
    public void a(x0.a1 value) {
        kotlin.jvm.internal.o.g(value, "value");
        n0.v1 v1Var = (n0.v1) value;
        this.f333726c = v1Var.f333726c;
        this.f333727d = v1Var.f333727d;
        this.f333728e = v1Var.f333728e;
    }

    @Override // x0.a1
    public x0.a1 b() {
        return new n0.v1();
    }

    public final int c(n0.y1 derivedState, x0.m snapshot) {
        java.util.HashSet hashSet;
        kotlin.jvm.internal.o.g(derivedState, "derivedState");
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
        synchronized (x0.z.f450963b) {
            hashSet = this.f333726c;
        }
        int i17 = 7;
        if (hashSet != null) {
            java.util.List list = (p0.e) n0.t4.f333707a.a();
            if (list == null) {
                list = q0.l.f359241f;
            }
            int size = list.size();
            int i18 = 0;
            for (int i19 = 0; i19 < size; i19++) {
                ((yz5.l) ((jz5.l) list.get(i19)).f302833d).invoke(derivedState);
            }
            try {
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    x0.z0 z0Var = (x0.z0) it.next();
                    x0.a1 r17 = x0.z.r(z0Var.g(), z0Var, snapshot);
                    i17 = (((i17 * 31) + java.lang.System.identityHashCode(r17)) * 31) + r17.f450861a;
                }
            } finally {
                int size2 = list.size();
                while (i18 < size2) {
                    ((yz5.l) ((jz5.l) list.get(i18)).f302834e).invoke(derivedState);
                    i18++;
                }
            }
        }
        return i17;
    }
}
