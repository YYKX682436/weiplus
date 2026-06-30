package n0;

/* loaded from: classes14.dex */
public abstract class i5 {
    public static final void a(n0.o oVar, java.lang.Object obj, yz5.p block) {
        kotlin.jvm.internal.o.g(block, "block");
        n0.y0 y0Var = (n0.y0) oVar;
        if (y0Var.L || !kotlin.jvm.internal.o.b(y0Var.y(), obj)) {
            y0Var.g0(obj);
            n0.r rVar = new n0.r(block, obj);
            if (y0Var.L) {
                ((java.util.ArrayList) y0Var.K).add(rVar);
                return;
            }
            y0Var.C();
            y0Var.z();
            y0Var.G(rVar);
        }
    }
}
