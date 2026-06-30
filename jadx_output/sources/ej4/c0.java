package ej4;

/* loaded from: classes11.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ej4.c0 f253335a = new ej4.c0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f253336b;

    static {
        com.tencent.mars.xlog.Log.i("cclover_test", "[init] call, start observe");
        ai4.m0 m0Var = ai4.m0.f5173a;
        m0Var.G().d(new ej4.l());
        m0Var.J(new ej4.m(), null);
        ni4.x xVar = ni4.x.f337776d;
        xVar.h().add(ej4.n.f253371d);
        xVar.k().add(ej4.o.f253372d);
        xVar.n().add(ej4.p.f253373d);
        f253336b = new java.util.LinkedHashMap();
    }

    public static /* synthetic */ void d(ej4.c0 c0Var, java.lang.String str, java.lang.String str2, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            str2 = "";
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        c0Var.c(str, str2, z17);
    }

    public final void a(java.lang.String _key, java.lang.Object subject) {
        kotlin.jvm.internal.o.g(_key, "_key");
        kotlin.jvm.internal.o.g(subject, "subject");
        java.util.Map map = f253336b;
        synchronized (map) {
            ej4.r rVar = (ej4.r) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(subject.hashCode()));
            if (rVar != null && kotlin.jvm.internal.o.b(_key, rVar.f253374a)) {
                map.remove(java.lang.Integer.valueOf(subject.hashCode()));
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusEventCenter", "cancelListener ".concat(_key));
            }
        }
    }

    public final void b(java.lang.Object listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.Map map = f253336b;
        synchronized (map) {
            if (((ej4.r) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(listener.hashCode()))) != null) {
                map.remove(java.lang.Integer.valueOf(listener.hashCode()));
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusEventCenter", "forceCancelListener: " + listener);
            }
        }
    }

    public final void c(java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusEventCenter", "onNotify " + str + ", " + f253336b.size() + ", " + str2);
        ((ku5.t0) ku5.t0.f312615d).B(new ej4.b0(str, str2, z17));
    }
}
