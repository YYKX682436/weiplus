package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class n7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.o7 f135264d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(com.tencent.mm.plugin.finder.viewmodel.component.o7 o7Var) {
        super(1);
        this.f135264d = o7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar == null || (i17 = fVar.f70615a) != 0 || i17 != 0) {
            com.tencent.mm.plugin.finder.view.FinderRefreshLayout rlLayout = this.f135264d.getRlLayout();
            rlLayout.e(false);
            return rlLayout;
        }
        this.f135264d.f135433i = ((r45.f51) fVar.f70618d).getByteString(4);
        this.f135264d.f135434m = ((r45.f51) fVar.f70618d).getInteger(3);
        com.tencent.mars.xlog.Log.i(this.f135264d.f135435n, "request CgiFinderGetCollectionWatchingList success, data: " + ((r45.f51) fVar.f70618d).getList(1).size() + ", lastBuffer: " + this.f135264d.f135433i + ", continueFlage: " + this.f135264d.f135434m);
        com.tencent.mm.plugin.finder.viewmodel.component.o7 o7Var = this.f135264d;
        com.tencent.mm.protobuf.f resp = fVar.f70618d;
        kotlin.jvm.internal.o.f(resp, "resp");
        o7Var.getClass();
        java.util.LinkedList<r45.zx0> list = ((r45.f51) resp).getList(1);
        kotlin.jvm.internal.o.f(list, "getCollection_watching_info(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (r45.zx0 zx0Var : list) {
            kotlin.jvm.internal.o.d(zx0Var);
            arrayList.add(new so2.j0(zx0Var));
        }
        int size = this.f135264d.f135431g.size();
        this.f135264d.f135431g.addAll(arrayList);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f135264d.f135430f;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter.notifyItemRangeInserted(size, arrayList.size());
        com.tencent.mm.plugin.finder.viewmodel.component.o7 o7Var2 = this.f135264d;
        o7Var2.getRlLayout().e(true);
        if (o7Var2.f135434m == 0) {
            o7Var2.getRlLayout().E(true);
        }
        return jz5.f0.f302826a;
    }
}
