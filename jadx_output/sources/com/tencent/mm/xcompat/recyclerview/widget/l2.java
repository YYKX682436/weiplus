package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final x.n f214572a = new x.n();

    /* renamed from: b, reason: collision with root package name */
    public final x.f f214573b = new x.f();

    public void a(com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var, com.tencent.mm.xcompat.recyclerview.widget.a1 a1Var) {
        x.n nVar = this.f214572a;
        com.tencent.mm.xcompat.recyclerview.widget.j2 j2Var = (com.tencent.mm.xcompat.recyclerview.widget.j2) nVar.getOrDefault(y1Var, null);
        if (j2Var == null) {
            j2Var = com.tencent.mm.xcompat.recyclerview.widget.j2.a();
            nVar.put(y1Var, j2Var);
        }
        j2Var.f214553c = a1Var;
        j2Var.f214551a |= 8;
    }

    public final com.tencent.mm.xcompat.recyclerview.widget.a1 b(com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var, int i17) {
        com.tencent.mm.xcompat.recyclerview.widget.j2 j2Var;
        com.tencent.mm.xcompat.recyclerview.widget.a1 a1Var;
        x.n nVar = this.f214572a;
        int e17 = nVar.e(y1Var);
        if (e17 >= 0 && (j2Var = (com.tencent.mm.xcompat.recyclerview.widget.j2) nVar.l(e17)) != null) {
            int i18 = j2Var.f214551a;
            if ((i18 & i17) != 0) {
                int i19 = i18 & (~i17);
                j2Var.f214551a = i19;
                if (i17 == 4) {
                    a1Var = j2Var.f214552b;
                } else {
                    if (i17 != 8) {
                        throw new java.lang.IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    a1Var = j2Var.f214553c;
                }
                if ((i19 & 12) == 0) {
                    nVar.j(e17);
                    j2Var.f214551a = 0;
                    j2Var.f214552b = null;
                    j2Var.f214553c = null;
                    ((m3.f) com.tencent.mm.xcompat.recyclerview.widget.j2.f214550d).b(j2Var);
                }
                return a1Var;
            }
        }
        return null;
    }

    public void c(com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var) {
        com.tencent.mm.xcompat.recyclerview.widget.j2 j2Var = (com.tencent.mm.xcompat.recyclerview.widget.j2) this.f214572a.getOrDefault(y1Var, null);
        if (j2Var == null) {
            return;
        }
        j2Var.f214551a &= -2;
    }

    public void d(com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var) {
        x.f fVar = this.f214573b;
        int e17 = fVar.e();
        while (true) {
            e17--;
            if (e17 < 0) {
                break;
            }
            if (y1Var == fVar.f(e17)) {
                java.lang.Object[] objArr = fVar.f450823f;
                java.lang.Object obj = objArr[e17];
                java.lang.Object obj2 = x.f.f450820h;
                if (obj != obj2) {
                    objArr[e17] = obj2;
                    fVar.f450821d = true;
                }
            }
        }
        com.tencent.mm.xcompat.recyclerview.widget.j2 j2Var = (com.tencent.mm.xcompat.recyclerview.widget.j2) this.f214572a.remove(y1Var);
        if (j2Var != null) {
            j2Var.f214551a = 0;
            j2Var.f214552b = null;
            j2Var.f214553c = null;
            ((m3.f) com.tencent.mm.xcompat.recyclerview.widget.j2.f214550d).b(j2Var);
        }
    }
}
