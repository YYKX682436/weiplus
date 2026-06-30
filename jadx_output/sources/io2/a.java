package io2;

/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f293462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io2.b f293463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.mine.FinderMemberCardListContract$FinderMemberCardListLoader f293464f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.util.LinkedList linkedList, io2.b bVar, com.tencent.mm.plugin.finder.member.mine.FinderMemberCardListContract$FinderMemberCardListLoader finderMemberCardListContract$FinderMemberCardListLoader) {
        super(0);
        this.f293462d = linkedList;
        this.f293463e = bVar;
        this.f293464f = finderMemberCardListContract$FinderMemberCardListLoader;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = this.f293462d;
        java.util.Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            so2.j5 j5Var = (so2.j5) it.next();
            kotlin.jvm.internal.o.e(j5Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderMemberCardData");
            linkedList.add(new bu2.n0(73729, (so2.j3) j5Var));
        }
        com.tencent.mars.xlog.Log.i(this.f293463e.getTAG(), "[saveData] infoList.size=" + linkedList2.size() + ", firstPage.size=" + linkedList.size());
        if (linkedList.size() > 0) {
            bu2.e0.f24498a.a(30, xy2.c.f(this.f293464f.getContextObj()), linkedList);
        }
        return jz5.f0.f302826a;
    }
}
