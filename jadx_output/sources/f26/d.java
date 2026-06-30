package f26;

/* loaded from: classes16.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final f26.d f259140a = new f26.d();

    public final boolean a(i26.o oVar, i26.j jVar, i26.j jVar2) {
        if (oVar.v(jVar) == oVar.v(jVar2) && oVar.r0(jVar) == oVar.r0(jVar2)) {
            if ((oVar.r(jVar) == null) == (oVar.r(jVar2) == null) && oVar.L(oVar.o(jVar), oVar.o(jVar2))) {
                if (oVar.x(jVar, jVar2)) {
                    return true;
                }
                int v17 = oVar.v(jVar);
                for (int i17 = 0; i17 < v17; i17++) {
                    i26.l X = oVar.X(jVar, i17);
                    i26.l X2 = oVar.X(jVar2, i17);
                    if (oVar.q0(X) != oVar.q0(X2)) {
                        return false;
                    }
                    if (!oVar.q0(X) && (oVar.n(X) != oVar.n(X2) || !b(oVar, oVar.f(X), oVar.f(X2)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean b(i26.o oVar, i26.i iVar, i26.i iVar2) {
        if (iVar == iVar2) {
            return true;
        }
        i26.j m07 = oVar.m0(iVar);
        i26.j m08 = oVar.m0(iVar2);
        if (m07 != null && m08 != null) {
            return a(oVar, m07, m08);
        }
        i26.g R = oVar.R(iVar);
        i26.g R2 = oVar.R(iVar2);
        if (R == null || R2 == null) {
            return false;
        }
        return a(oVar, oVar.M(R), oVar.M(R2)) && a(oVar, oVar.d(R), oVar.d(R2));
    }
}
