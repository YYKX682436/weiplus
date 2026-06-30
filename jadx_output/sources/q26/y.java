package q26;

/* loaded from: classes12.dex */
public abstract class y extends q26.s {
    public static final q26.n a(java.util.Iterator it) {
        kotlin.jvm.internal.o.g(it, "<this>");
        return b(new q26.t(it));
    }

    public static final q26.n b(q26.n nVar) {
        kotlin.jvm.internal.o.g(nVar, "<this>");
        return nVar instanceof q26.a ? nVar : new q26.a(nVar);
    }

    public static final q26.n c(q26.n nVar) {
        kotlin.jvm.internal.o.g(nVar, "<this>");
        q26.u uVar = q26.u.f359893d;
        if (!(nVar instanceof q26.r0)) {
            return new q26.k(nVar, q26.v.f359894d, uVar);
        }
        q26.r0 r0Var = (q26.r0) nVar;
        return new q26.k(r0Var.f359890a, r0Var.f359891b, uVar);
    }

    public static final q26.n d(java.lang.Object obj, yz5.l nextFunction) {
        kotlin.jvm.internal.o.g(nextFunction, "nextFunction");
        return obj == null ? q26.g.f359840a : new q26.m(new q26.x(obj), nextFunction);
    }

    public static final q26.n e(yz5.a nextFunction) {
        kotlin.jvm.internal.o.g(nextFunction, "nextFunction");
        return b(new q26.m(nextFunction, new q26.w(nextFunction)));
    }
}
