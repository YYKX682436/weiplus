package kotlinx.coroutines;

/* loaded from: classes14.dex */
public abstract class m0 {
    public static final oz5.l a(oz5.l lVar, oz5.l lVar2, boolean z17) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        kotlinx.coroutines.l0 l0Var = kotlinx.coroutines.l0.f310550d;
        boolean booleanValue = ((java.lang.Boolean) lVar.fold(bool, l0Var)).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) lVar2.fold(bool, l0Var)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return lVar.plus(lVar2);
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = lVar2;
        oz5.m mVar = oz5.m.f350329d;
        oz5.l lVar3 = (oz5.l) lVar.fold(mVar, new kotlinx.coroutines.k0(h0Var, z17));
        if (booleanValue2) {
            h0Var.f310123d = ((oz5.l) h0Var.f310123d).fold(mVar, kotlinx.coroutines.j0.f310544d);
        }
        return lVar3.plus((oz5.l) h0Var.f310123d);
    }

    public static final oz5.l b(kotlinx.coroutines.y0 y0Var, oz5.l lVar) {
        oz5.l a17 = a(y0Var.getF11582e(), lVar, true);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        if (a17 == p0Var) {
            return a17;
        }
        int i17 = oz5.f.Y0;
        return a17.get(oz5.e.f350327d) == null ? a17.plus(p0Var) : a17;
    }

    public static final kotlinx.coroutines.c4 c(kotlin.coroutines.Continuation continuation, oz5.l lVar, java.lang.Object obj) {
        kotlinx.coroutines.c4 c4Var = null;
        if (!(continuation instanceof qz5.e)) {
            return null;
        }
        if (!(lVar.get(kotlinx.coroutines.d4.f310168d) != null)) {
            return null;
        }
        qz5.e eVar = (qz5.e) continuation;
        while (true) {
            if ((eVar instanceof kotlinx.coroutines.m1) || (eVar = eVar.getCallerFrame()) == null) {
                break;
            }
            if (eVar instanceof kotlinx.coroutines.c4) {
                c4Var = (kotlinx.coroutines.c4) eVar;
                break;
            }
        }
        if (c4Var != null) {
            c4Var.f310150g.set(new jz5.l(lVar, obj));
        }
        return c4Var;
    }
}
