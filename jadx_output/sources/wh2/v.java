package wh2;

/* loaded from: classes2.dex */
public final class v extends com.tencent.mm.plugin.finder.feed.model.internal.y {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.loader.FinderProfileLiveUserPageLoader f445963e;

    public v(com.tencent.mm.plugin.finder.live.loader.FinderProfileLiveUserPageLoader finderProfileLiveUserPageLoader) {
        this.f445963e = finderProfileLiveUserPageLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse b(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        o45.ah respObj;
        o45.ah respObj2;
        o45.zg reqObj;
        kotlin.jvm.internal.o.g(scene, "scene");
        r45.xw xwVar = null;
        if (!(scene instanceof ke2.x0)) {
            return null;
        }
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        com.tencent.mm.plugin.finder.live.loader.FinderProfileLiveUserPageLoader finderProfileLiveUserPageLoader = this.f445963e;
        java.lang.String str2 = finderProfileLiveUserPageLoader.f111694d;
        java.lang.String f17 = xy2.c.f(finderProfileLiveUserPageLoader.getContextObj());
        ke2.x0 x0Var = (ke2.x0) scene;
        java.util.List M = x0Var.M();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(M, 10));
        java.util.Iterator it = M.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(((com.tencent.mm.protocal.protobuf.FinderObject) it.next()).getId()));
        }
        ((c61.p2) ybVar).Rj(str2, f17, arrayList);
        wh2.w wVar = new wh2.w(i17, i18, str);
        com.tencent.mm.modelbase.o oVar = x0Var.f306998h;
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveUserPageResponse");
        wVar.setHasMore(((r45.xd2) fVar).getInteger(4) == 1);
        java.util.List M2 = x0Var.M();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : M2) {
            r45.nw1 liveInfo = ((com.tencent.mm.protocal.protobuf.FinderObject) obj).getLiveInfo();
            if (!(liveInfo != null && liveInfo.getInteger(31) == 6)) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            so2.q2 q2Var = new so2.q2((com.tencent.mm.protocal.protobuf.FinderObject) it6.next(), 2);
            com.tencent.mm.protobuf.f fVar2 = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveUserPageResponse");
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.xd2) fVar2).getCustom(5);
            q2Var.a1(finderContact != null ? ya2.d.h(finderContact, null, false, 3, null) : null);
            arrayList3.add(q2Var);
        }
        wVar.setIncrementList(arrayList3);
        com.tencent.mm.protobuf.f fVar3 = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveUserPageResponse");
        wVar.setLastBuffer(((r45.xd2) fVar3).getByteString(3));
        wVar.setPullType(x0Var.f306997g);
        com.tencent.mm.network.v0 reqResp = x0Var.getReqResp();
        java.lang.Integer valueOf = (reqResp == null || (reqObj = reqResp.getReqObj()) == null) ? null : java.lang.Integer.valueOf((int) reqObj.getBufferSize());
        com.tencent.mm.network.v0 reqResp2 = x0Var.getReqResp();
        java.lang.Integer valueOf2 = (reqResp2 == null || (respObj2 = reqResp2.getRespObj()) == null) ? null : java.lang.Integer.valueOf((int) respObj2.getBufferSize());
        com.tencent.mm.network.v0 reqResp3 = x0Var.getReqResp();
        if (reqResp3 != null && (respObj = reqResp3.getRespObj()) != null) {
            xwVar = respObj.getProfile();
        }
        wVar.setCgiProfile(new az2.g(valueOf, valueOf2, xwVar));
        return wVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.modelbase.m1 c() {
        com.tencent.mm.plugin.finder.live.loader.FinderProfileLiveUserPageLoader finderProfileLiveUserPageLoader = this.f445963e;
        ke2.x0 x0Var = new ke2.x0(finderProfileLiveUserPageLoader.f111694d, finderProfileLiveUserPageLoader.f111695e, finderProfileLiveUserPageLoader.getLastBuffer(), finderProfileLiveUserPageLoader.getContextObj());
        x0Var.f306997g = 2;
        return x0Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        wh2.w wVar = new wh2.w(0, 0, "");
        this.f445963e.getClass();
        wVar.setIncrementList(null);
        wVar.setLastBuffer(null);
        return wVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.modelbase.m1 d() {
        com.tencent.mm.plugin.finder.live.loader.FinderProfileLiveUserPageLoader finderProfileLiveUserPageLoader = this.f445963e;
        ke2.x0 x0Var = new ke2.x0(finderProfileLiveUserPageLoader.f111694d, finderProfileLiveUserPageLoader.f111695e, null, finderProfileLiveUserPageLoader.getContextObj());
        x0Var.f306997g = 0;
        return x0Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public java.util.List e() {
        return kz5.b0.c(5870);
    }
}
