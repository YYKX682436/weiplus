package gi;

/* loaded from: classes12.dex */
public class u1 implements ou5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gi.v1 f272183a;

    public u1(gi.v1 v1Var) {
        this.f272183a = v1Var;
    }

    @Override // su5.a
    public void a(wu5.l lVar, long j17, long j18) {
        gi.v1 v1Var = this.f272183a;
        v1Var.f272200a.a(lVar, j17, j18);
        v1Var.f272201b.w(i(lVar), lVar.hashCode());
    }

    @Override // su5.a
    public void b(wu5.l lVar) {
        gi.v1 v1Var = this.f272183a;
        v1Var.f272200a.b(lVar);
        v1Var.f272201b.w(i(lVar), lVar.hashCode());
    }

    @Override // su5.a
    public void c(wu5.l lVar) {
        gi.v1 v1Var = this.f272183a;
        v1Var.f272200a.c(lVar);
        v1Var.f272201b.x(i(lVar), lVar.hashCode());
    }

    @Override // su5.a
    public void d(wu5.l lVar) {
        this.f272183a.f272200a.d(lVar);
    }

    @Override // su5.a
    public void e(wu5.l lVar) {
        this.f272183a.f272200a.e(lVar);
    }

    @Override // su5.a
    public void f(wu5.l lVar) {
        gi.v1 v1Var = this.f272183a;
        v1Var.f272200a.f(lVar);
        gi.y1 y1Var = v1Var.f272201b;
        lVar.hashCode();
        y1Var.getClass();
    }

    @Override // su5.a
    public void g(wu5.l lVar) {
        this.f272183a.f272200a.g(lVar);
    }

    @Override // wu5.a
    public boolean h(java.lang.String str) {
        return this.f272183a.f272200a.h(str);
    }

    public final java.lang.String i(wu5.l lVar) {
        rh.f fVar = (rh.f) ((java.util.concurrent.ConcurrentHashMap) this.f272183a.f272201b.f395391c).get(java.lang.Integer.valueOf(lVar.hashCode()));
        if (fVar != null) {
            return fVar.f395375e;
        }
        java.lang.Object obj = lVar.f449854o;
        if (obj instanceof lu5.g) {
            obj = ((lu5.g) obj).f321465d;
            if (!(obj instanceof kotlinx.coroutines.n1)) {
                java.lang.String name = obj.getClass().getName();
                l("ERR2", name);
                return "ERR2-".concat(name);
            }
        }
        if (obj == null || !(obj instanceof kotlinx.coroutines.n1)) {
            return lVar.getKey();
        }
        java.lang.String k17 = k(obj);
        if (k17 != null) {
            return k17;
        }
        java.lang.String name2 = obj.getClass().getName();
        l("ERR1", name2);
        return "ERR1-".concat(name2);
    }

    @Override // ou5.g
    public void j() {
        this.f272183a.f272200a.j();
    }

    public final java.lang.String k(java.lang.Object obj) {
        qz5.e callerFrame;
        if ((obj instanceof qz5.e) && (callerFrame = ((qz5.e) obj).getCallerFrame()) != null) {
            return k(callerFrame);
        }
        if (obj instanceof kotlin.coroutines.Continuation) {
            return obj.getClass().getName();
        }
        return null;
    }

    public final java.lang.String l(java.lang.String str, java.lang.String str2) {
        if (str2.contains(".DispatchedContinuation") && mm.o.k(10)) {
            java.lang.Throwable th6 = new java.lang.Throwable();
            java.lang.String str3 = "";
            for (java.lang.StackTraceElement stackTraceElement : th6.getStackTrace()) {
                if (!stackTraceElement.getClassName().contains(gi.y1.class.getName())) {
                    str3 = stackTraceElement.toString();
                }
            }
            ap.a.a(1, "statTask", th6, null, "coroutineName", str, str2, str3);
        }
        return str2;
    }
}
