package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ka extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123897d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        super(0);
        this.f123897d = obVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f123897d;
        com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = obVar.D1;
        if (s4Var == null) {
            kotlin.jvm.internal.o.o("moreLiveListWidget");
            throw null;
        }
        kk.l lVar = com.tencent.mm.plugin.finder.profile.uic.p2.f124101r;
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar.get(obVar.getUsername());
        r45.j32 j32Var = l2Var != null ? l2Var.f123923l : null;
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var2 = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar.get(obVar.getUsername());
        zy2.ic.a(s4Var, j32Var, null, false, obVar.L1, 0, 0, l2Var2 != null ? l2Var2.B : null, 54, null);
        return jz5.f0.f302826a;
    }
}
