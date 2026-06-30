package f26;

/* loaded from: classes16.dex */
public abstract class d0 {
    public static final i26.i a(f26.w2 w2Var, i26.i iVar, java.util.HashSet hashSet) {
        i26.i a17;
        i26.i Z;
        i26.m S = w2Var.S(iVar);
        if (!hashSet.add(S)) {
            return null;
        }
        i26.n f07 = w2Var.f0(S);
        if (f07 != null) {
            i26.i p07 = w2Var.p0(f07);
            a17 = a(w2Var, p07, hashSet);
            if (a17 == null) {
                return null;
            }
            boolean z17 = w2Var.h0(w2Var.S(p07)) || ((p07 instanceof i26.j) && w2Var.a((i26.j) p07));
            if ((a17 instanceof i26.j) && w2Var.a((i26.j) a17) && w2Var.n0(iVar) && z17) {
                Z = w2Var.Z(p07);
            } else if (!w2Var.n0(a17) && w2Var.F(iVar)) {
                Z = w2Var.Z(a17);
            }
            return Z;
        }
        if (!w2Var.h0(S)) {
            return iVar;
        }
        i26.i i17 = w2Var.i(iVar);
        if (i17 == null || (a17 = a(w2Var, i17, hashSet)) == null) {
            return null;
        }
        if (w2Var.n0(iVar)) {
            return w2Var.n0(a17) ? iVar : ((a17 instanceof i26.j) && w2Var.a((i26.j) a17)) ? iVar : w2Var.Z(a17);
        }
        return a17;
    }
}
