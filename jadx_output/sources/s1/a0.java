package s1;

/* loaded from: classes14.dex */
public abstract class a0 {
    public static final d1.g a(s1.z zVar) {
        kotlin.jvm.internal.o.g(zVar, "<this>");
        u1.c1 c1Var = (u1.c1) zVar;
        s1.z i07 = c1Var.i0();
        if (i07 != null) {
            return s1.y.a(i07, zVar, false, 2, null);
        }
        long j17 = c1Var.f402052f;
        return new d1.g(0.0f, 0.0f, (int) (j17 >> 32), p2.q.b(j17));
    }

    public static final d1.g b(s1.z zVar) {
        kotlin.jvm.internal.o.g(zVar, "<this>");
        return s1.y.a(c(zVar), zVar, false, 2, null);
    }

    public static final s1.z c(s1.z zVar) {
        s1.z zVar2;
        kotlin.jvm.internal.o.g(zVar, "<this>");
        s1.z i07 = ((u1.c1) zVar).i0();
        while (true) {
            s1.z zVar3 = i07;
            zVar2 = zVar;
            zVar = zVar3;
            if (zVar == null) {
                break;
            }
            i07 = ((u1.c1) zVar).i0();
        }
        u1.c1 c1Var = zVar2 instanceof u1.c1 ? (u1.c1) zVar2 : null;
        if (c1Var == null) {
            return zVar2;
        }
        u1.c1 c1Var2 = c1Var.f423555i;
        while (true) {
            u1.c1 c1Var3 = c1Var2;
            u1.c1 c1Var4 = c1Var;
            c1Var = c1Var3;
            if (c1Var == null) {
                return c1Var4;
            }
            c1Var2 = c1Var.f423555i;
        }
    }

    public static final long d(s1.z zVar) {
        kotlin.jvm.internal.o.g(zVar, "<this>");
        int i17 = d1.e.f225626e;
        return ((u1.c1) zVar).t0(d1.e.f225623b);
    }
}
