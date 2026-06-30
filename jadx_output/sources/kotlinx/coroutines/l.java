package kotlinx.coroutines;

/* loaded from: classes14.dex */
public abstract class l {
    public static final kotlinx.coroutines.f1 a(kotlinx.coroutines.y0 y0Var, oz5.l lVar, kotlinx.coroutines.a1 a1Var, yz5.p pVar) {
        oz5.l b17 = kotlinx.coroutines.m0.b(y0Var, lVar);
        a1Var.getClass();
        kotlinx.coroutines.g1 e3Var = a1Var == kotlinx.coroutines.a1.LAZY ? new kotlinx.coroutines.e3(b17, pVar) : new kotlinx.coroutines.g1(b17, true);
        e3Var.j0(a1Var, e3Var, pVar);
        return e3Var;
    }

    public static /* synthetic */ kotlinx.coroutines.f1 b(kotlinx.coroutines.y0 y0Var, oz5.l lVar, kotlinx.coroutines.a1 a1Var, yz5.p pVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            lVar = oz5.m.f350329d;
        }
        if ((i17 & 2) != 0) {
            a1Var = kotlinx.coroutines.a1.DEFAULT;
        }
        return a(y0Var, lVar, a1Var, pVar);
    }

    public static final kotlinx.coroutines.r2 c(kotlinx.coroutines.y0 y0Var, oz5.l lVar, kotlinx.coroutines.a1 a1Var, yz5.p pVar) {
        oz5.l b17 = kotlinx.coroutines.m0.b(y0Var, lVar);
        a1Var.getClass();
        kotlinx.coroutines.r3 f3Var = a1Var == kotlinx.coroutines.a1.LAZY ? new kotlinx.coroutines.f3(b17, pVar) : new kotlinx.coroutines.r3(b17, true);
        f3Var.j0(a1Var, f3Var, pVar);
        return f3Var;
    }

    public static /* synthetic */ kotlinx.coroutines.r2 d(kotlinx.coroutines.y0 y0Var, oz5.l lVar, kotlinx.coroutines.a1 a1Var, yz5.p pVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            lVar = oz5.m.f350329d;
        }
        if ((i17 & 2) != 0) {
            a1Var = kotlinx.coroutines.a1.DEFAULT;
        }
        return c(y0Var, lVar, a1Var, pVar);
    }

    public static final java.lang.Object e(oz5.l lVar, yz5.p pVar) {
        kotlinx.coroutines.w1 w1Var;
        oz5.l a17;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        oz5.j jVar = oz5.e.f350327d;
        oz5.f fVar = (oz5.f) lVar.get(jVar);
        oz5.m mVar = oz5.m.f350329d;
        if (fVar == null) {
            w1Var = kotlinx.coroutines.v3.f310684a.a();
            a17 = kotlinx.coroutines.m0.a(mVar, lVar.plus(w1Var), true);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            if (a17 != p0Var && a17.get(jVar) == null) {
                a17 = a17.plus(p0Var);
            }
        } else {
            if (fVar instanceof kotlinx.coroutines.w1) {
            }
            w1Var = (kotlinx.coroutines.w1) kotlinx.coroutines.v3.f310685b.get();
            a17 = kotlinx.coroutines.m0.a(mVar, lVar, true);
            kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
            if (a17 != p0Var2 && a17.get(jVar) == null) {
                a17 = a17.plus(p0Var2);
            }
        }
        kotlinx.coroutines.j jVar2 = new kotlinx.coroutines.j(a17, currentThread, w1Var);
        jVar2.j0(kotlinx.coroutines.a1.DEFAULT, jVar2, pVar);
        kotlinx.coroutines.w1 w1Var2 = jVar2.f310543g;
        if (w1Var2 != null) {
            int i17 = kotlinx.coroutines.w1.f310686h;
            w1Var2.N(false);
        }
        while (!java.lang.Thread.interrupted()) {
            try {
                long P = w1Var2 != null ? w1Var2.P() : com.tencent.wcdb.core.Database.DictDefaultMatchValue;
                if (jVar2.A()) {
                    java.lang.Object a18 = kotlinx.coroutines.d3.a(jVar2.P());
                    kotlinx.coroutines.e0 e0Var = a18 instanceof kotlinx.coroutines.e0 ? (kotlinx.coroutines.e0) a18 : null;
                    if (e0Var == null) {
                        return a18;
                    }
                    throw e0Var.f310172a;
                }
                java.util.concurrent.locks.LockSupport.parkNanos(jVar2, P);
            } finally {
                if (w1Var2 != null) {
                    int i18 = kotlinx.coroutines.w1.f310686h;
                    w1Var2.K(false);
                }
            }
        }
        java.lang.InterruptedException interruptedException = new java.lang.InterruptedException();
        jVar2.y(interruptedException);
        throw interruptedException;
    }

    public static /* synthetic */ java.lang.Object f(oz5.l lVar, yz5.p pVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            lVar = oz5.m.f350329d;
        }
        return e(lVar, pVar);
    }

    public static final java.lang.Object g(oz5.l lVar, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object k07;
        oz5.l context = continuation.getContext();
        oz5.l plus = !((java.lang.Boolean) lVar.fold(java.lang.Boolean.FALSE, kotlinx.coroutines.l0.f310550d)).booleanValue() ? context.plus(lVar) : kotlinx.coroutines.m0.a(context, lVar, false);
        kotlinx.coroutines.v2.f(plus);
        if (plus == context) {
            kotlinx.coroutines.internal.h0 h0Var = new kotlinx.coroutines.internal.h0(plus, continuation);
            k07 = w26.a.b(h0Var, h0Var, pVar);
        } else {
            oz5.e eVar = oz5.e.f350327d;
            if (kotlin.jvm.internal.o.b(plus.get(eVar), context.get(eVar))) {
                kotlinx.coroutines.c4 c4Var = new kotlinx.coroutines.c4(plus, continuation);
                java.lang.Object c17 = kotlinx.coroutines.internal.r0.c(plus, null);
                try {
                    java.lang.Object b17 = w26.a.b(c4Var, c4Var, pVar);
                    kotlinx.coroutines.internal.r0.a(plus, c17);
                    k07 = b17;
                } catch (java.lang.Throwable th6) {
                    kotlinx.coroutines.internal.r0.a(plus, c17);
                    throw th6;
                }
            } else {
                kotlinx.coroutines.m1 m1Var = new kotlinx.coroutines.m1(plus, continuation);
                try {
                    kotlin.coroutines.Continuation b18 = pz5.f.b(pz5.f.a(pVar, m1Var, m1Var));
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    kotlinx.coroutines.internal.i.a(b18, kotlin.Result.m521constructorimpl(jz5.f0.f302826a), null);
                    k07 = m1Var.k0();
                } catch (java.lang.Throwable th7) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m1Var.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7)));
                    throw th7;
                }
            }
        }
        pz5.a aVar = pz5.a.f359186d;
        return k07;
    }
}
