package s1;

/* loaded from: classes14.dex */
public abstract class v0 {
    public static s1.u0 a(s1.x0 x0Var, int i17, int i18, java.util.Map alignmentLines, yz5.l placementBlock) {
        kotlin.jvm.internal.o.g(alignmentLines, "alignmentLines");
        kotlin.jvm.internal.o.g(placementBlock, "placementBlock");
        return new s1.w0(i17, i18, alignmentLines, x0Var, placementBlock);
    }

    public static /* synthetic */ s1.u0 b(s1.x0 x0Var, int i17, int i18, java.util.Map map, yz5.l lVar, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i19 & 4) != 0) {
            map = kz5.q0.f314001d;
        }
        return x0Var.W(i17, i18, map, lVar);
    }
}
