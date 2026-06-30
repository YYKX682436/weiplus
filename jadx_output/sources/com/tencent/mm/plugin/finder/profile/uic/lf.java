package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class lf extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f123957d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC) {
        super(1);
        this.f123957d = finderProfileTabUIC;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.ak2 resp = (r45.ak2) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.profile.FinderProfileNativeDramaFragment finderProfileNativeDramaFragment = new com.tencent.mm.plugin.finder.profile.FinderProfileNativeDramaFragment();
        java.util.LinkedList<r45.qj2> list = resp.getList(1);
        kotlin.jvm.internal.o.f(list, "getDrama_list(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (r45.qj2 qj2Var : list) {
            kotlin.jvm.internal.o.d(qj2Var);
            arrayList.add(new zb2.a(qj2Var));
        }
        finderProfileNativeDramaFragment.f123285t = arrayList;
        finderProfileNativeDramaFragment.f123286u = resp.getByteString(3);
        finderProfileNativeDramaFragment.f123287v = resp.getBoolean(2);
        this.f123957d.I7(16, finderProfileNativeDramaFragment);
        return jz5.f0.f302826a;
    }
}
