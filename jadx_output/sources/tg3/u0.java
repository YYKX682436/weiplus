package tg3;

/* loaded from: classes12.dex */
public interface u0 extends i95.m {
    static /* synthetic */ java.lang.String Af(tg3.u0 u0Var, oi3.g gVar, bm5.f0 f0Var, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVideoFullPathWithSimpleMsg");
        }
        if ((i17 & 1) != 0) {
            gVar = null;
        }
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        return ((k90.b) u0Var).sj(gVar, f0Var, str, z17);
    }

    static /* synthetic */ java.lang.String I5(tg3.u0 u0Var, bm5.y yVar, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFileFullPath");
        }
        if ((i17 & 1) != 0) {
            yVar = null;
        }
        if ((i17 & 2) != 0) {
            str = null;
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        return ((k90.b) u0Var).Ui(yVar, str, z17);
    }

    static /* synthetic */ java.lang.String L4(tg3.u0 u0Var, com.tencent.mm.storage.f9 f9Var, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVideoThumbFullPath");
        }
        if ((i17 & 1) != 0) {
            f9Var = null;
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        return ((k90.b) u0Var).tj(f9Var, str, z17);
    }

    static /* synthetic */ java.lang.String Q8(tg3.u0 u0Var, oi3.g gVar, java.lang.String str, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFullThumbPath");
        }
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        if ((i17 & 8) != 0) {
            z18 = false;
        }
        return ((k90.b) u0Var).oj(gVar, str, z17, z18);
    }

    static /* synthetic */ java.lang.String Qf(tg3.u0 u0Var, oi3.g gVar, bm5.f0 f0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj == null) {
            return ((k90.b) u0Var).ij(gVar, f0Var, str, str2, str3, (i17 & 32) != 0 ? true : z17, (i17 & 64) != 0 ? false : z18);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFullPathWithSimpleMsg");
    }

    static java.lang.String Z1(tg3.u0 u0Var, com.tencent.mm.storage.f9 f9Var, java.lang.String str, int i17, java.lang.Object obj) {
        java.lang.String str2;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFileFullPath");
        }
        if ((i17 & 1) != 0) {
            f9Var = null;
        }
        if ((i17 & 2) != 0) {
            str = null;
        }
        k90.b bVar = (k90.b) u0Var;
        bVar.getClass();
        if (str == null || r26.n0.N(str)) {
            if (f9Var != null) {
                v05.b bVar2 = new v05.b();
                java.lang.String j17 = f9Var.j();
                kotlin.jvm.internal.o.f(j17, "getContent(...)");
                bVar2.fromXml(j17);
                v05.a aVar = (v05.a) bVar2.getCustom(bVar2.f432315e + 8);
                java.lang.String r17 = aVar != null ? aVar.r() : null;
                if (r17 != null) {
                    str2 = r17;
                    return I5(bVar, bm5.y.f22756i.a(f9Var, bm5.f0.f22575w), str2, false, 4, null);
                }
            }
            str = "";
        }
        str2 = str;
        return I5(bVar, bm5.y.f22756i.a(f9Var, bm5.f0.f22575w), str2, false, 4, null);
    }

    static /* synthetic */ java.lang.String Z6(tg3.u0 u0Var, oi3.g gVar, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVideoThumbFullPathWithSimpleMsg");
        }
        if ((i17 & 1) != 0) {
            gVar = null;
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        return ((k90.b) u0Var).uj(gVar, str, z17);
    }

    static /* synthetic */ java.lang.String e8(tg3.u0 u0Var, com.tencent.mm.storage.f9 f9Var, bm5.f0 f0Var, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVideoFullPath");
        }
        if ((i17 & 1) != 0) {
            f9Var = null;
        }
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        return ((k90.b) u0Var).rj(f9Var, f0Var, str, z17);
    }

    static /* synthetic */ java.lang.String ga(tg3.u0 u0Var, com.tencent.mm.storage.f9 f9Var, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFullThumbPath");
        }
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        return ((k90.b) u0Var).mj(f9Var, str, z17);
    }

    static java.lang.String k3(tg3.u0 u0Var, oi3.g gVar, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFullThumbPath");
        }
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        return ((k90.b) u0Var).oj(gVar, str, z17, false);
    }

    static /* synthetic */ java.lang.String ob(tg3.u0 u0Var, com.tencent.mm.storage.f9 f9Var, bm5.f0 f0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj == null) {
            return ((k90.b) u0Var).bj(f9Var, f0Var, str, str2, str3, (i17 & 32) != 0 ? true : z17, (i17 & 64) != 0 ? false : z18);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFullPath");
    }
}
