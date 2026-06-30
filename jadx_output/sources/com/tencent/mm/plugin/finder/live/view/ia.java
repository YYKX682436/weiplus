package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class ia extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f116385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.ka f116386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f116387f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.view.ka kaVar, int i17) {
        super(2, continuation);
        this.f116385d = hVar;
        this.f116386e = kaVar;
        this.f116387f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.view.ia(this.f116385d, continuation, this.f116386e, this.f116387f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.view.ia iaVar = (com.tencent.mm.plugin.finder.live.view.ia) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        iaVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object w2Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.lg1 lg1Var = (r45.lg1) ((xg2.i) this.f116385d).f454393b;
        com.tencent.mm.plugin.finder.live.view.ka kaVar = this.f116386e;
        java.lang.String str = kaVar.H;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[requestData] resp = ");
        kotlin.jvm.internal.o.d(lg1Var);
        sb6.append(pm0.b0.g(lg1Var));
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        java.util.LinkedList list = lg1Var.getList(1);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        kotlin.jvm.internal.o.d(list);
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            int i17 = this.f116387f;
            if (!hasNext) {
                pm0.v.X(new com.tencent.mm.plugin.finder.live.view.ga(kaVar, i17, kaVar.U));
                if (kaVar.Y == null) {
                    bm2.c6 c6Var = kaVar.Q;
                    if (c6Var != null) {
                        java.util.LinkedList linkedList2 = c6Var.f21821h;
                        linkedList2.clear();
                        linkedList2.addAll(linkedList);
                        c6Var.notifyDataSetChanged();
                    }
                } else {
                    bm2.c6 c6Var2 = kaVar.Q;
                    if (c6Var2 != null) {
                        java.util.LinkedList linkedList3 = c6Var2.f21821h;
                        int size = linkedList3.size();
                        linkedList3.addAll(linkedList);
                        c6Var2.notifyItemRangeInserted(size, linkedList.size());
                    }
                }
                if (lg1Var.getInteger(3) > 0) {
                    com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = kaVar.X;
                    if (wxRefreshLayout != null) {
                        wxRefreshLayout.e(true);
                    }
                } else {
                    com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout2 = kaVar.X;
                    if (wxRefreshLayout2 != null) {
                        wxRefreshLayout2.f();
                    }
                }
                kaVar.Y = lg1Var.getByteString(2);
                return jz5.f0.f302826a;
            }
            com.tencent.mm.protobuf.g gVar = (com.tencent.mm.protobuf.g) it.next();
            kotlin.jvm.internal.o.d(gVar);
            if (i17 == 4) {
                r45.k92 k92Var = new r45.k92();
                try {
                    k92Var.parseFrom(gVar.g());
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
                w2Var = new el2.w2(i17, k92Var);
            } else if (i17 != 7) {
                if (i17 != 15 && i17 != 999) {
                    switch (i17) {
                        case 18:
                            break;
                        case 19:
                            r45.qy1 qy1Var = new r45.qy1();
                            try {
                                qy1Var.parseFrom(gVar.g());
                            } catch (java.lang.Exception e18) {
                                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e18);
                            }
                            w2Var = new el2.a3(qy1Var);
                            break;
                        case 20:
                            r45.do2 do2Var = new r45.do2();
                            try {
                                do2Var.parseFrom(gVar.g());
                            } catch (java.lang.Exception e19) {
                                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e19);
                            }
                            w2Var = new el2.y2(do2Var);
                            break;
                        default:
                            w2Var = null;
                            break;
                    }
                }
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
                try {
                    finderJumpInfo.parseFrom(gVar.g());
                } catch (java.lang.Exception e27) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e27);
                }
                w2Var = new el2.x2(i17, finderJumpInfo);
            } else {
                r45.e52 e52Var = new r45.e52();
                try {
                    e52Var.parseFrom(gVar.g());
                } catch (java.lang.Exception e28) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e28);
                }
                java.util.LinkedList list2 = e52Var.getList(0);
                kotlin.jvm.internal.o.f(list2, "getInfos(...)");
                r45.wd5 wd5Var = (r45.wd5) kz5.n0.Z(list2);
                if (wd5Var != null) {
                    w2Var = new el2.z2(7, wd5Var);
                }
                w2Var = null;
            }
            if (w2Var != null) {
                linkedList.add(w2Var);
            }
        }
    }
}
