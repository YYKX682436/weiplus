package ir1;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.conversation.ui.BizFansBlackListUI f294010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f294011e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.brandservice.conversation.ui.BizFansBlackListUI bizFansBlackListUI, com.tencent.mm.modelbase.m1 m1Var) {
        super(0);
        this.f294010d = bizFansBlackListUI;
        this.f294011e = m1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.protobuf.f fVar = ((ar1.j) this.f294011e).f13378d.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetBlackListResp");
        java.util.LinkedList linkedList = ((r45.qb3) fVar).f383800d;
        int i17 = com.tencent.mm.plugin.brandservice.conversation.ui.BizFansBlackListUI.f93931u;
        com.tencent.mm.plugin.brandservice.conversation.ui.BizFansBlackListUI bizFansBlackListUI = this.f294010d;
        bizFansBlackListUI.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("black contact ");
        sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        com.tencent.mars.xlog.Log.i("BizFans.BizFansBlackListUI", sb6.toString());
        if (linkedList != null) {
            java.util.ArrayList arrayList = bizFansBlackListUI.f93935g;
            arrayList.addAll(linkedList);
            bizFansBlackListUI.W6();
            ir1.d dVar = bizFansBlackListUI.f93934f;
            dVar.getClass();
            java.util.ArrayList arrayList2 = dVar.f293950e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            dVar.notifyDataSetChanged();
        } else {
            bizFansBlackListUI.W6();
        }
        return jz5.f0.f302826a;
    }
}
