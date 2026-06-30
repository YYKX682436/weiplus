package wh2;

/* loaded from: classes2.dex */
public final class m extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader f445956d;

    public m(com.tencent.mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader finderLivePurchaseContentListLoader) {
        this.f445956d = finderLivePurchaseContentListLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        r45.nw1 liveInfo;
        r45.s11 s11Var;
        com.tencent.mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader finderLivePurchaseContentListLoader = this.f445956d;
        wh2.n nVar = new wh2.n(finderLivePurchaseContentListLoader, i17, i18, str);
        if (fVar instanceof r45.t91) {
            java.util.LinkedList<r45.fh2> linkedList = new java.util.LinkedList();
            if (finderLivePurchaseContentListLoader.getDataListJustForAdapter().isEmpty()) {
                linkedList.addAll(((r45.t91) fVar).getList(1));
            } else {
                java.util.List I = kz5.j0.I(finderLivePurchaseContentListLoader.getDataListJustForAdapter(), so2.q2.class);
                java.util.LinkedList<r45.fh2> list = ((r45.t91) fVar).getList(1);
                kotlin.jvm.internal.o.f(list, "getObjects(...)");
                for (r45.fh2 fh2Var : list) {
                    java.util.Iterator it = ((java.util.ArrayList) I).iterator();
                    int i19 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i19 = -1;
                            break;
                        }
                        so2.q2 q2Var = (so2.q2) it.next();
                        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) fh2Var.getCustom(1);
                        java.lang.Long valueOf = (finderObject == null || (liveInfo = finderObject.getLiveInfo()) == null) ? null : java.lang.Long.valueOf(liveInfo.getLong(0));
                        r45.nw1 liveInfo2 = q2Var.f410549n.getLiveInfo();
                        if (kotlin.jvm.internal.o.b(valueOf, liveInfo2 != null ? java.lang.Long.valueOf(liveInfo2.getLong(0)) : null)) {
                            break;
                        }
                        i19++;
                    }
                    if (i19 != -1) {
                        java.lang.String tag = getTAG();
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("repeat feed:");
                        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) fh2Var.getCustom(1);
                        sb6.append(finderObject2 != null ? cm2.a.f43328a.x(finderObject2, -1) : null);
                        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
                    } else {
                        linkedList.add(fh2Var);
                    }
                }
            }
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            for (r45.fh2 fh2Var2 : linkedList) {
                int integer = fh2Var2.getInteger(0);
                if (integer == 1) {
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = (com.tencent.mm.protocal.protobuf.FinderObject) fh2Var2.getCustom(1);
                    if (finderObject3 != null) {
                        so2.q2 q2Var2 = new so2.q2(finderObject3, 0);
                        q2Var2.f410550o = fh2Var2.getInteger(3);
                        linkedList2.add(q2Var2);
                    }
                } else if (integer == 2 && (s11Var = (r45.s11) fh2Var2.getCustom(2)) != null) {
                    so2.g2 g2Var = new so2.g2(s11Var);
                    g2Var.f410360e = fh2Var2.getInteger(3);
                    linkedList2.add(g2Var);
                }
            }
            nVar.setIncrementList(linkedList2);
            r45.t91 t91Var = (r45.t91) fVar;
            t91Var.getInteger(4);
            nVar.setLastBuffer(t91Var.getByteString(2));
            nVar.setHasMore(t91Var.getInteger(3) == 1);
            nVar.setPullType(2);
        }
        return nVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        return new ke2.c0(this.f445956d.getLastBuffer());
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        return new ke2.c0(this.f445956d.getLastBuffer());
    }
}
