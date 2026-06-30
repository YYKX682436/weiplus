package ek2;

/* loaded from: classes3.dex */
public final class q0 {
    public q0(kotlin.jvm.internal.i iVar) {
    }

    public final r45.t12 a(java.lang.String content, int i17, int i18) {
        java.lang.String l17;
        kotlin.jvm.internal.o.g(content, "content");
        r45.t12 t12Var = new r45.t12();
        t12Var.set(2, content);
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        if (eVar == null || (l17 = zl2.r4.f473950a.m0(eVar).getNickname()) == null) {
            l17 = c01.z1.l();
        }
        t12Var.set(0, l17);
        t12Var.set(3, java.lang.Integer.valueOf(i17));
        t12Var.set(13, java.lang.Integer.valueOf(i18));
        t12Var.set(12, java.lang.Integer.valueOf(i18 > 0 ? 1 : 0));
        r45.xn1 xn1Var = new r45.xn1();
        gk2.e eVar2 = dk2.ef.I;
        xn1Var.set(0, eVar2 != null ? zl2.r4.f473950a.m0(eVar2) : null);
        gk2.e eVar3 = dk2.ef.I;
        xn1Var.set(11, eVar3 != null ? ((mm2.c1) eVar3.a(mm2.c1.class)).e7() : null);
        xn1Var.set(7, java.lang.Integer.valueOf(zl2.r4.f473950a.g0()));
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
        xn1Var.set(6, finderContact != null ? finderContact.getNickname() : null);
        t12Var.set(8, xn1Var);
        return t12Var;
    }
}
