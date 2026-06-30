package kotlinx.coroutines.internal;

/* loaded from: classes14.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.l0 f310523a = new kotlinx.coroutines.internal.l0("NO_THREAD_ELEMENTS");

    public static final void a(oz5.l lVar, java.lang.Object obj) {
        if (obj == f310523a) {
            return;
        }
        if (!(obj instanceof kotlinx.coroutines.internal.u0)) {
            java.lang.Object fold = lVar.fold(null, kotlinx.coroutines.internal.p0.f310515d);
            if (fold == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            }
            ((kotlinx.coroutines.v0) ((kotlinx.coroutines.u3) fold)).D(lVar, obj);
            return;
        }
        kotlinx.coroutines.internal.u0 u0Var = (kotlinx.coroutines.internal.u0) obj;
        kotlinx.coroutines.u3[] u3VarArr = u0Var.f310531c;
        int length = u3VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i17 = length - 1;
            kotlinx.coroutines.u3 u3Var = u3VarArr[length];
            kotlin.jvm.internal.o.d(u3Var);
            ((kotlinx.coroutines.v0) u3Var).D(lVar, u0Var.f310530b[length]);
            if (i17 < 0) {
                return;
            } else {
                length = i17;
            }
        }
    }

    public static final java.lang.Object b(oz5.l lVar) {
        java.lang.Object fold = lVar.fold(0, kotlinx.coroutines.internal.o0.f310512d);
        kotlin.jvm.internal.o.d(fold);
        return fold;
    }

    public static final java.lang.Object c(oz5.l lVar, java.lang.Object obj) {
        if (obj == null) {
            obj = b(lVar);
        }
        return obj == 0 ? f310523a : obj instanceof java.lang.Integer ? lVar.fold(new kotlinx.coroutines.internal.u0(lVar, ((java.lang.Number) obj).intValue()), kotlinx.coroutines.internal.q0.f310519d) : ((kotlinx.coroutines.v0) ((kotlinx.coroutines.u3) obj)).F(lVar);
    }
}
