package g06;

/* loaded from: classes15.dex */
public abstract class f {
    public static final java.util.Collection a(f06.d dVar) {
        kotlin.jvm.internal.o.g(dVar, "<this>");
        java.util.Collection e17 = dVar.e();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : e17) {
            if (obj instanceof f06.g) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final java.util.Collection b(f06.d dVar) {
        kotlin.jvm.internal.o.g(dVar, "<this>");
        i06.f1 f1Var = (i06.f1) ((i06.k1) dVar).f286681f.getValue();
        f1Var.getClass();
        f06.v vVar = i06.f1.f286632o[14];
        java.lang.Object invoke = f1Var.f286642l.invoke();
        kotlin.jvm.internal.o.f(invoke, "getValue(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : (java.util.Collection) invoke) {
            i06.k0 k0Var = (i06.k0) obj;
            boolean z17 = false;
            if ((!(k0Var.l().c0() != null)) && (k0Var instanceof f06.s)) {
                z17 = true;
            }
            if (z17) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean c(f06.d dVar, f06.d base) {
        kotlin.jvm.internal.o.g(dVar, "<this>");
        kotlin.jvm.internal.o.g(base, "base");
        if (!kotlin.jvm.internal.o.b(dVar, base)) {
            java.lang.Boolean d17 = o26.h.d(kz5.b0.c(dVar), new g06.c(g06.d.f267497e), new g06.e(base));
            kotlin.jvm.internal.o.f(d17, "ifAny(...)");
            if (!d17.booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
