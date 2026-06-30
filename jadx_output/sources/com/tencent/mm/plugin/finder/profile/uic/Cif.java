package com.tencent.mm.plugin.finder.profile.uic;

/* renamed from: com.tencent.mm.plugin.finder.profile.uic.if, reason: invalid class name */
/* loaded from: classes2.dex */
public final class Cif implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f123812a;

    public Cif(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC) {
        this.f123812a = finderProfileTabUIC;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.modelbase.i iVar = fVar.f70620f;
        bq.g0 g0Var = iVar instanceof bq.g0 ? (bq.g0) iVar : null;
        if (g0Var != null) {
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            boolean z17 = !cq.n1.a((cq.k) c17, null, null).isEmpty();
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f123812a;
            if (z17) {
                finderProfileTabUIC.getClass();
                com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", "addDraftFragment");
                pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.ue(finderProfileTabUIC, false));
            } else if (fVar.f70615a == 0 && fVar.f70616b == 0) {
                com.tencent.mm.protobuf.f fVar2 = g0Var.f70646f.f70711b.f70700a;
                kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetDraftResponse");
                java.util.LinkedList list = ((r45.r51) fVar2).getList(1);
                kotlin.jvm.internal.o.f(list, "getObject(...)");
                if (list.isEmpty()) {
                    finderProfileTabUIC.getClass();
                    com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", "removeDraftFragment");
                    pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.eg(finderProfileTabUIC));
                } else {
                    com.tencent.mm.protobuf.f fVar3 = g0Var.f70646f.f70711b.f70700a;
                    kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetDraftResponse");
                    boolean z18 = ((r45.r51) fVar3).getInteger(4) == 1;
                    finderProfileTabUIC.getClass();
                    com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", "addDraftFragment");
                    pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.ue(finderProfileTabUIC, z18));
                }
            } else {
                finderProfileTabUIC.getClass();
                com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", "removeDraftFragment");
                pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.eg(finderProfileTabUIC));
            }
        }
        return jz5.f0.f302826a;
    }
}
