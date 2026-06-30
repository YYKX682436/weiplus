package eb2;

/* loaded from: classes2.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f250728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f250729e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eb2.e0 f250730f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f250731g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(boolean z17, int i17, eb2.e0 e0Var, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var) {
        super(1);
        this.f250728d = z17;
        this.f250729e = i17;
        this.f250730f = e0Var;
        this.f250731g = n0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        r45.wj2 wj2Var;
        r45.wj2 wj2Var2;
        java.util.LinkedList list;
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCgiBack errType=");
        sb6.append(fVar2 != null ? java.lang.Integer.valueOf(fVar2.f70615a) : null);
        sb6.append(", errCode=");
        sb6.append(fVar2 != null ? java.lang.Integer.valueOf(fVar2.f70616b) : null);
        sb6.append(", itemCount=");
        sb6.append((fVar2 == null || (wj2Var2 = (r45.wj2) fVar2.f70618d) == null || (list = wj2Var2.getList(1)) == null) ? null : java.lang.Integer.valueOf(list.size()));
        sb6.append(" isLoadMore ");
        sb6.append(this.f250728d);
        sb6.append(" pullType ");
        int i17 = this.f250729e;
        sb6.append(i17);
        sb6.append(" buffer ");
        sb6.append((fVar2 == null || (wj2Var = (r45.wj2) fVar2.f70618d) == null) ? null : wj2Var.getString(2));
        com.tencent.mars.xlog.Log.i("FinderNativeDramaRecommendFetcher", sb6.toString());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var = this.f250731g;
        if (fVar2 == null || fVar2.f70615a != 0 || fVar2.f70616b != 0 || (fVar = fVar2.f70618d) == null) {
            eb2.c0 c0Var = new eb2.c0(fVar2 != null ? fVar2.f70615a : -1, fVar2 != null ? fVar2.f70616b : -1, fVar2 != null ? fVar2.f70617c : null);
            c0Var.setPullType(i17);
            n0Var.onFetchDone(c0Var);
        } else {
            java.lang.String string = ((r45.wj2) fVar).getString(2);
            eb2.e0 e0Var = this.f250730f;
            e0Var.f250736e = string;
            java.lang.String string2 = ((r45.wj2) fVar2.f70618d).getString(2);
            e0Var.f250737f = !(string2 == null || string2.length() == 0);
            java.util.LinkedList<r45.jt4> list2 = ((r45.wj2) fVar2.f70618d).getList(1);
            kotlin.jvm.internal.o.f(list2, "getRecommend_item_info(...)");
            for (r45.jt4 jt4Var : list2) {
                kotlin.jvm.internal.o.d(jt4Var);
                com.tencent.mm.plugin.finder.feed.model.d5 b17 = e0Var.b(jt4Var);
                if (b17 != null) {
                    b17.f107792d.set(2, java.lang.Long.valueOf(((r45.wj2) fVar2.f70618d).getLong(3)));
                    linkedList.add(b17);
                }
            }
            eb2.c0 c0Var2 = new eb2.c0(fVar2.f70615a, fVar2.f70616b, fVar2.f70617c);
            c0Var2.setIncrementList(linkedList);
            java.lang.String string3 = ((r45.wj2) fVar2.f70618d).getString(2);
            c0Var2.setHasMore(!(string3 == null || string3.length() == 0));
            c0Var2.setPullType(i17);
            n0Var.onFetchDone(c0Var2);
        }
        return jz5.f0.f302826a;
    }
}
