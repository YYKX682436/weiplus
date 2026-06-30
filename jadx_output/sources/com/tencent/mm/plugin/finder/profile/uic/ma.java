package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ma extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123977d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        super(4);
        this.f123977d = obVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        r45.h32 h32Var;
        ((java.lang.Number) obj).intValue();
        ((java.lang.Number) obj2).intValue();
        zy2.jc jcVar = (zy2.jc) obj4;
        kk.l lVar = com.tencent.mm.plugin.finder.profile.uic.p2.f124101r;
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f123977d;
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar.get(obVar.getUsername());
        if (l2Var == null) {
            l2Var = new com.tencent.mm.plugin.finder.profile.uic.l2(0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, -1, 1, null);
        }
        if (jcVar != null) {
            com.tencent.mm.modelbase.o oVar = ((db2.f5) jcVar).f227972h;
            if (oVar == null) {
                kotlin.jvm.internal.o.o("rr");
                throw null;
            }
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderCreateLiveNoticeResponse");
            h32Var = (r45.h32) ((r45.h01) fVar).getCustom(2);
        } else {
            h32Var = null;
        }
        if (h32Var != null) {
            r45.h32 h32Var2 = l2Var.f123916e;
            if ((h32Var2 != null ? h32Var2.getInteger(0) : Integer.MAX_VALUE) > h32Var.getInteger(0)) {
                l2Var.f123916e = h32Var;
            }
        }
        lVar.put(obVar.getUsername(), l2Var);
        com.tencent.mm.plugin.finder.profile.uic.ob.G7(obVar, "onSceneEnd:[NetSceneCreateLiveNotice]", null, 2, null);
        return jz5.f0.f302826a;
    }
}
