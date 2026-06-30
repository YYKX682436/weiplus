package io2;

/* loaded from: classes2.dex */
public final class b extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.mine.FinderMemberCardListContract$FinderMemberCardListLoader f293465d;

    public b(com.tencent.mm.plugin.finder.member.mine.FinderMemberCardListContract$FinderMemberCardListLoader finderMemberCardListContract$FinderMemberCardListLoader) {
        this.f293465d = finderMemberCardListContract$FinderMemberCardListLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mars.xlog.Log.i(getTAG(), "fetchInit initCount ");
        io2.c cVar = new io2.c(0, 0, "");
        java.util.List<so2.j5> i17 = bu2.d0.i(bu2.e0.f24498a, 30, null, 2, null);
        for (so2.j5 j5Var : i17) {
            if (j5Var instanceof so2.j3) {
                so2.j3 j3Var = (so2.j3) j5Var;
                if (j3Var.a()) {
                    this.f293465d.f121159e = true;
                }
                j3Var.f410441d.f391038h = null;
            }
        }
        cVar.setIncrementList(i17);
        return cVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        com.tencent.mm.plugin.finder.member.mine.FinderMemberCardListContract$FinderMemberCardListLoader finderMemberCardListContract$FinderMemberCardListLoader;
        io2.c cVar = new io2.c(i17, i18, str);
        if (fVar instanceof r45.j81) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            r45.j81 j81Var = (r45.j81) fVar;
            java.util.LinkedList member_cards = j81Var.f377635d;
            kotlin.jvm.internal.o.f(member_cards, "member_cards");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(member_cards, 10));
            java.util.Iterator it = member_cards.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                finderMemberCardListContract$FinderMemberCardListLoader = this.f293465d;
                if (!hasNext) {
                    break;
                }
                r45.yf2 yf2Var = (r45.yf2) it.next();
                kotlin.jvm.internal.o.d(yf2Var);
                so2.j3 j3Var = new so2.j3(yf2Var);
                if (j3Var.a()) {
                    finderMemberCardListContract$FinderMemberCardListLoader.f121159e = true;
                }
                arrayList.add(j3Var);
            }
            linkedList.addAll(arrayList);
            cVar.setIncrementList(linkedList);
            ho2.f fVar2 = iVar instanceof ho2.f ? (ho2.f) iVar : null;
            if (!(fVar2 != null && fVar2.f282868t == 2)) {
                pm0.v.K(null, new io2.a(linkedList, this, finderMemberCardListContract$FinderMemberCardListLoader));
            }
            cVar.setLastBuffer(j81Var.f377636e);
            cVar.setHasMore(j81Var.f377637f == 1);
            kotlin.jvm.internal.o.e(iVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.member.cgi.FinderGetMemberCardListCgi");
            cVar.setPullType(((ho2.f) iVar).f282868t);
        }
        return cVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.member.mine.FinderMemberCardListContract$FinderMemberCardListLoader finderMemberCardListContract$FinderMemberCardListLoader = this.f293465d;
        ho2.f fVar = new ho2.f(finderMemberCardListContract$FinderMemberCardListLoader.getContextObj(), finderMemberCardListContract$FinderMemberCardListLoader.getLastBuffer(), xy2.c.f(finderMemberCardListContract$FinderMemberCardListLoader.getContextObj()), 0, 8, null);
        fVar.f282868t = 2;
        return fVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.member.mine.FinderMemberCardListContract$FinderMemberCardListLoader finderMemberCardListContract$FinderMemberCardListLoader = this.f293465d;
        ho2.f fVar = new ho2.f(finderMemberCardListContract$FinderMemberCardListLoader.getContextObj(), finderMemberCardListContract$FinderMemberCardListLoader.getLastBuffer(), xy2.c.f(finderMemberCardListContract$FinderMemberCardListLoader.getContextObj()), 0, 8, null);
        fVar.f282868t = 0;
        return fVar;
    }
}
