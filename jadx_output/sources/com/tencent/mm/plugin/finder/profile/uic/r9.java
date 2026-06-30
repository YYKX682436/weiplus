package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class r9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f124179d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        super(0);
        this.f124179d = obVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.h32 h32Var;
        int i17;
        r45.j32 j32Var;
        java.util.LinkedList list;
        r45.j32 j32Var2;
        java.util.LinkedList list2;
        r45.j32 j32Var3;
        java.util.LinkedList list3;
        kk.l lVar = com.tencent.mm.plugin.finder.profile.uic.p2.f124101r;
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f124179d;
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar.get(obVar.getUsername());
        if (l2Var != null && (h32Var = l2Var.f123916e) != null) {
            com.tencent.mm.plugin.finder.profile.uic.l2 l2Var2 = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar.get(obVar.getUsername());
            if (l2Var2 == null || (j32Var3 = l2Var2.f123923l) == null || (list3 = j32Var3.getList(0)) == null) {
                i17 = -1;
            } else {
                i17 = -1;
                int i18 = 0;
                for (java.lang.Object obj : list3) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    if (kotlin.jvm.internal.o.b(h32Var.getString(4), ((r45.h32) obj).getString(4))) {
                        i17 = i18;
                    }
                    i18 = i19;
                }
            }
            if (i17 != -1) {
                kk.l lVar2 = com.tencent.mm.plugin.finder.profile.uic.p2.f124101r;
                com.tencent.mm.plugin.finder.profile.uic.l2 l2Var3 = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar2.get(obVar.getUsername());
                if (l2Var3 != null && (j32Var2 = l2Var3.f123923l) != null && (list2 = j32Var2.getList(0)) != null) {
                }
                com.tencent.mm.plugin.finder.profile.uic.l2 l2Var4 = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar2.get(obVar.getUsername());
                if (l2Var4 != null && (j32Var = l2Var4.f123923l) != null && (list = j32Var.getList(0)) != null) {
                    list.add(i17, h32Var);
                }
            }
        }
        com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = obVar.D1;
        if (s4Var == null) {
            kotlin.jvm.internal.o.o("moreLiveListWidget");
            throw null;
        }
        kk.l lVar3 = com.tencent.mm.plugin.finder.profile.uic.p2.f124101r;
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var5 = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar3.get(obVar.getUsername());
        r45.j32 j32Var4 = l2Var5 != null ? l2Var5.f123923l : null;
        java.lang.String str = obVar.L1;
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var6 = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar3.get(obVar.getUsername());
        zy2.ic.a(s4Var, j32Var4, null, false, str, 0, 0, l2Var6 != null ? l2Var6.B : null, 54, null);
        return jz5.f0.f302826a;
    }
}
