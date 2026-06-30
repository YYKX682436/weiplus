package ir2;

/* loaded from: classes2.dex */
public interface y {
    static void W3(ir2.y yVar, ir2.q event, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        ir2.a1 a1Var = (ir2.a1) yVar;
        a1Var.getClass();
        kotlin.jvm.internal.o.g(event, "event");
        pf5.e.launch$default(a1Var, null, null, new ir2.i0(a1Var, event, null), 3, null);
    }

    static void X1(ir2.y yVar, long j17, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteById");
        }
        ir2.a1 a1Var = (ir2.a1) yVar;
        a1Var.getClass();
        pf5.e.launch$default(a1Var, null, null, new ir2.j0(j17, a1Var, null), 3, null);
    }
}
