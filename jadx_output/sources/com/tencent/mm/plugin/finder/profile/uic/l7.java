package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class l7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123942d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        super(1);
        this.f123942d = obVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.vr0 resp = (r45.vr0) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        kk.l lVar = com.tencent.mm.plugin.finder.profile.uic.p2.f124101r;
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f123942d;
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar.get(obVar.getUsername());
        if (l2Var == null) {
            java.lang.String username = obVar.getUsername();
            com.tencent.mm.plugin.finder.profile.uic.l2 l2Var2 = new com.tencent.mm.plugin.finder.profile.uic.l2(0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, -1, 1, null);
            l2Var2.f123932u = resp;
            lVar.put(username, l2Var2);
        } else {
            l2Var.f123932u = resp;
        }
        com.tencent.mm.plugin.finder.profile.widget.d2 d2Var = obVar.H1;
        if (d2Var == null) {
            kotlin.jvm.internal.o.o("memberWidget");
            throw null;
        }
        d2Var.b(obVar.getUsername());
        obVar.o7();
        pf5.u uVar = pf5.u.f353936a;
        ((com.tencent.mm.plugin.finder.profile.uic.ie) uVar.c(obVar.getActivity()).a(com.tencent.mm.plugin.finder.profile.uic.ie.class)).O6(obVar.getProfileContact());
        obVar.E7();
        boolean isSelfFlag = ((com.tencent.mm.plugin.finder.profile.uic.p2) uVar.b(obVar.getContext()).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).isSelfFlag();
        obVar.i7().post(new com.tencent.mm.plugin.finder.profile.uic.k8(((com.tencent.mm.plugin.finder.profile.uic.p2) uVar.b(obVar.getContext()).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).isSelf(), isSelfFlag, obVar));
        return jz5.f0.f302826a;
    }
}
