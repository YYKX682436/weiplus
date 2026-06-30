package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class yf implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f124397d;

    public yf(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC) {
        this.f124397d = finderProfileTabUIC;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.i66 i66Var;
        java.util.LinkedList linkedList;
        com.tencent.mm.network.v0 reqResp;
        o45.ah respObj;
        com.tencent.mm.network.v0 reqResp2;
        o45.ah respObj2;
        com.tencent.mm.network.v0 reqResp3;
        o45.zg reqObj;
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f124397d;
        android.app.Activity context = finderProfileTabUIC.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.profile.uic.p2 p2Var = (com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.profile.uic.p2.class);
        com.tencent.mm.protobuf.g gVar = null;
        if (p2Var != null) {
            p2Var.Q6(11732, i18, new az2.g((m1Var == null || (reqResp3 = m1Var.getReqResp()) == null || (reqObj = reqResp3.getReqObj()) == null) ? null : java.lang.Integer.valueOf((int) reqObj.getBufferSize()), (m1Var == null || (reqResp2 = m1Var.getReqResp()) == null || (respObj2 = reqResp2.getRespObj()) == null) ? null : java.lang.Integer.valueOf((int) respObj2.getBufferSize()), (m1Var == null || (reqResp = m1Var.getReqResp()) == null || (respObj = reqResp.getRespObj()) == null) ? null : respObj.getProfile()));
        }
        gm0.j1.d().q(11732, this);
        if (m1Var instanceof db2.f6) {
            db2.f6 f6Var = (db2.f6) m1Var;
            if (kotlin.jvm.internal.o.b(f6Var.f227974g, finderProfileTabUIC.F7()) && i17 == 0 && i18 == 0) {
                com.tencent.mm.modelbase.o oVar = f6Var.f227976i;
                com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
                kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderMusicAlbumUserPageResponse");
                r45.fc6 fc6Var = ((r45.xi2) fVar).f390133h;
                if ((fc6Var == null || (linkedList = fc6Var.f374209e) == null) ? true : linkedList.isEmpty()) {
                    pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.jg(finderProfileTabUIC, false));
                    return;
                }
                com.tencent.mm.plugin.finder.feed.model.f7 f7Var = new com.tencent.mm.plugin.finder.feed.model.f7(i17, i18, str);
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                linkedList2.addAll(f6Var.K());
                f7Var.setIncrementList(linkedList2);
                f7Var.setPullType(f6Var.f227977m);
                f7Var.setHasMore(f6Var.L());
                com.tencent.mm.protobuf.f fVar2 = oVar.f70711b.f70700a;
                kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderMusicAlbumUserPageResponse");
                r45.fc6 fc6Var2 = ((r45.xi2) fVar2).f390133h;
                if (fc6Var2 != null && (i66Var = fc6Var2.f374208d) != null) {
                    gVar = i66Var.f376768e;
                }
                f7Var.setLastBuffer(gVar);
                finderProfileTabUIC.I7(6, new com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingSongListFragment(f6Var, f7Var));
            }
        }
    }
}
