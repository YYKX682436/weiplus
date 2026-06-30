package com.tencent.mm.plugin.finder.ui.promotion;

/* loaded from: classes14.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.promotion.t f129678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f129679e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.finder.ui.promotion.t tVar, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f129678d = tVar;
        this.f129679e = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.ui.promotion.q(this.f129678d, this.f129679e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.ui.promotion.q qVar = (com.tencent.mm.plugin.finder.ui.promotion.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        qVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.ui.promotion.t tVar = this.f129678d;
        int size = tVar.f129693p.size();
        java.util.ArrayList arrayList = tVar.f129693p;
        java.util.List list = this.f129679e;
        arrayList.addAll(list);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = tVar.f129692o;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter.notifyItemRangeInserted(size, list.size());
        tVar.getRecyclerView().post(new com.tencent.mm.plugin.finder.ui.promotion.p(tVar));
        tVar.f129700w = false;
        return jz5.f0.f302826a;
    }
}
