package x06;

/* loaded from: classes15.dex */
public final class e0 {
    public e0(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(o06.b superDescriptor, o06.b subDescriptor) {
        kotlin.jvm.internal.o.g(superDescriptor, "superDescriptor");
        kotlin.jvm.internal.o.g(subDescriptor, "subDescriptor");
        if ((subDescriptor instanceof z06.h) && (superDescriptor instanceof o06.n0)) {
            z06.h hVar = (z06.h) subDescriptor;
            hVar.W().size();
            o06.n0 n0Var = (o06.n0) superDescriptor;
            n0Var.W().size();
            java.util.List W = ((r06.j0) hVar.a()).W();
            kotlin.jvm.internal.o.f(W, "getValueParameters(...)");
            java.util.List W2 = n0Var.a().W();
            kotlin.jvm.internal.o.f(W2, "getValueParameters(...)");
            java.util.Iterator it = ((java.util.ArrayList) kz5.n0.a1(W, W2)).iterator();
            while (it.hasNext()) {
                jz5.l lVar = (jz5.l) it.next();
                o06.l2 l2Var = (o06.l2) lVar.f302833d;
                o06.l2 l2Var2 = (o06.l2) lVar.f302834e;
                kotlin.jvm.internal.o.d(l2Var);
                boolean z17 = b((o06.n0) subDescriptor, l2Var) instanceof g16.e0;
                kotlin.jvm.internal.o.d(l2Var2);
                if (z17 != (b(n0Var, l2Var2) instanceof g16.e0)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final g16.f0 b(o06.n0 r9, o06.l2 r10) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x06.e0.b(o06.n0, o06.l2):g16.f0");
    }
}
