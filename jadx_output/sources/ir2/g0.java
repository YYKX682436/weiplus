package ir2;

/* loaded from: classes2.dex */
public final class g0 {
    public g0(kotlin.jvm.internal.i iVar) {
    }

    public static void a(ir2.g0 g0Var, ir2.a0 source, kotlinx.coroutines.y0 y0Var, androidx.lifecycle.y yVar, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            y0Var = null;
        }
        if ((i17 & 4) != 0) {
            yVar = null;
        }
        g0Var.getClass();
        kotlin.jvm.internal.o.g(source, "source");
        ir2.y1 y1Var = (ir2.y1) ((jz5.n) ir2.a1.f294090s).getValue();
        y1Var.getClass();
        if (y0Var == null) {
            y0Var = y1Var.getLifecycleScope();
        }
        kotlinx.coroutines.l.d(y0Var, null, null, new ir2.x1(yVar, source, null), 3, null);
    }
}
