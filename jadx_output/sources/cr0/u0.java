package cr0;

/* loaded from: classes12.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f221757a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f221758b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f221759c;

    public u0() {
        jz5.i iVar = jz5.i.f302829d;
        this.f221758b = jz5.h.a(iVar, cr0.l0.f221674d);
        this.f221759c = jz5.h.a(iVar, cr0.t0.f221750d);
    }

    public static final void a(cr0.u0 u0Var, cr0.d1 d1Var) {
        cr0.d1 d1Var2;
        java.util.Map map = (java.util.Map) ((java.lang.ThreadLocal) u0Var.f221759c.getValue()).get();
        if (map == null || (d1Var2 = (cr0.d1) map.remove(java.lang.Integer.valueOf(d1Var.f221611d))) == null) {
            return;
        }
        java.lang.String str = d1Var2.f221608a;
        java.lang.String str2 = d1Var2.f221609b;
        long j17 = d1Var2.f221610c;
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        jz5.g gVar = cr0.d1.f221606e;
        pj.g gVar2 = (pj.g) cr0.d1.f221607f.getValue();
        yz5.l lVar = gVar2.f354907c;
        if (lVar != null) {
            lVar.invoke(d1Var2);
        }
        synchronized (gVar2.a()) {
            if (gVar2.a().size() < gVar2.f354905a) {
                gVar2.a().add(d1Var2);
            }
        }
        ((ku5.t0) ku5.t0.f312615d).g(new cr0.s0(u0Var, str, str2, uptimeMillis, j17));
    }

    public static final cr0.d1 b(cr0.u0 u0Var, java.lang.String binderName, java.lang.String code) {
        u0Var.getClass();
        jz5.g gVar = cr0.d1.f221606e;
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        kotlin.jvm.internal.o.g(binderName, "binderName");
        kotlin.jvm.internal.o.g(code, "code");
        cr0.d1 d1Var = (cr0.d1) ((pj.g) cr0.d1.f221607f.getValue()).b();
        d1Var.f221611d = ((java.util.concurrent.atomic.AtomicInteger) cr0.d1.f221606e.getValue()).getAndIncrement();
        d1Var.f221608a = binderName;
        d1Var.f221609b = code;
        d1Var.f221610c = uptimeMillis;
        java.lang.ThreadLocal threadLocal = (java.lang.ThreadLocal) u0Var.f221759c.getValue();
        java.lang.Object obj = threadLocal.get();
        if (obj == null) {
            obj = new java.util.LinkedHashMap();
            threadLocal.set(obj);
        }
        ((java.util.Map) obj).put(java.lang.Integer.valueOf(d1Var.f221611d), d1Var);
        return d1Var;
    }

    public final com.tencent.mm.matrix.battery.AccBinderCallsStats c() {
        return (com.tencent.mm.matrix.battery.AccBinderCallsStats) this.f221758b.getValue();
    }
}
