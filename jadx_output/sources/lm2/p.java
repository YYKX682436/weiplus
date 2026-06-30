package lm2;

/* loaded from: classes3.dex */
public final class p {
    public p(kotlin.jvm.internal.i iVar) {
    }

    public static lm2.j0 a(lm2.p pVar, r45.qn qnVar, java.lang.String str, int i17, java.lang.Object obj) {
        java.util.List list;
        java.lang.String str2;
        java.lang.String str3 = (i17 & 1) != 0 ? null : str;
        pVar.getClass();
        kotlin.jvm.internal.o.g(qnVar, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList<r45.wn> linkedList = qnVar.f384104g;
        if (linkedList != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (r45.wn wnVar : linkedList) {
                lm2.p pVar2 = lm2.h0.f319392i;
                kotlin.jvm.internal.o.d(wnVar);
                r45.ch1 ch1Var = wnVar.f389302d;
                lm2.c b17 = ch1Var != null ? pVar2.b(ch1Var) : null;
                if (b17 != null) {
                    b17.f319371d = wnVar.f389303e;
                }
                if (b17 != null) {
                    b17.f319373f = wnVar.f389304f;
                }
                if (b17 != null) {
                    b17.f319374g = wnVar.f389305g;
                }
                if (b17 != null) {
                    b17.f319375h = wnVar.f389306h;
                }
                arrayList2.add(b17);
            }
            list = kz5.n0.V(arrayList2);
        } else {
            list = kz5.p0.f313996d;
        }
        arrayList.addAll(list);
        r45.qm1 qm1Var = qnVar.f384101d;
        if (qm1Var == null || (str2 = qm1Var.getString(1)) == null) {
            str2 = "";
        }
        return new lm2.j0(str2, arrayList, qnVar.f384105h, qnVar, str3);
    }

    public final lm2.c b(r45.ch1 ch1Var) {
        lm2.c m0Var;
        kotlin.jvm.internal.o.g(ch1Var, "<this>");
        int integer = ch1Var.getInteger(1);
        if (integer != 20002) {
            if (integer != 20032) {
                if (integer == 20057) {
                    m0Var = new lm2.o0(false, ch1Var);
                } else if (integer != 20034) {
                    if (integer != 20035) {
                        return null;
                    }
                    m0Var = new lm2.l0(false, ch1Var);
                }
            }
            m0Var = new lm2.b(false, ch1Var);
        } else {
            m0Var = new lm2.m0(false, ch1Var);
        }
        return m0Var;
    }
}
