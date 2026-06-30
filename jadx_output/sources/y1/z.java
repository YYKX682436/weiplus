package y1;

/* loaded from: classes14.dex */
public abstract class z {
    public static final u1.w a(u1.w wVar, yz5.l lVar) {
        for (u1.w p17 = wVar.p(); p17 != null; p17 = p17.p()) {
            if (((java.lang.Boolean) lVar.invoke(p17)).booleanValue()) {
                return p17;
            }
        }
        return null;
    }

    public static final java.util.List b(u1.w wVar, java.util.List list) {
        o0.i q17 = wVar.q();
        int i17 = q17.f341852f;
        if (i17 > 0) {
            java.lang.Object[] objArr = q17.f341850d;
            int i18 = 0;
            do {
                u1.w wVar2 = (u1.w) objArr[i18];
                y1.n d17 = d(wVar2);
                if (d17 != null) {
                    list.add(d17);
                } else {
                    b(wVar2, list);
                }
                i18++;
            } while (i18 < i17);
        }
        return list;
    }

    public static final y1.n c(u1.w wVar) {
        y1.n nVar;
        kotlin.jvm.internal.o.g(wVar, "<this>");
        u1.c1 c1Var = wVar.f423682J.f423640i;
        while (c1Var != null && !u1.p.a(c1Var.f423568y, 2)) {
            c1Var = c1Var.j0();
        }
        if (c1Var == null || (nVar = (y1.n) c1Var.f423568y[2]) == null) {
            return null;
        }
        u1.c1 c1Var2 = nVar.f423654d;
        while (c1Var2 != null) {
            while (nVar != null) {
                if (((y1.q) ((y1.o) nVar.f423655e)).f458787e.f458767e) {
                    return nVar;
                }
                nVar = (y1.n) nVar.f423656f;
            }
            c1Var2 = c1Var2.j0();
            nVar = c1Var2 != null ? (y1.n) c1Var2.f423568y[2] : null;
        }
        return null;
    }

    public static final y1.n d(u1.w wVar) {
        y1.n nVar;
        kotlin.jvm.internal.o.g(wVar, "<this>");
        u1.c1 c1Var = wVar.f423682J.f423640i;
        while (c1Var != null && !u1.p.a(c1Var.f423568y, 2)) {
            c1Var = c1Var.j0();
        }
        if (c1Var == null || (nVar = (y1.n) c1Var.f423568y[2]) == null) {
            return null;
        }
        u1.c1 c1Var2 = nVar.f423654d;
        while (c1Var2 != null) {
            if (nVar != null) {
                return nVar;
            }
            c1Var2 = c1Var2.j0();
            nVar = c1Var2 != null ? (y1.n) c1Var2.f423568y[2] : null;
        }
        return null;
    }
}
