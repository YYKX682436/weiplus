package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class sb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nc f135883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f135884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f135885f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(com.tencent.mm.plugin.finder.viewmodel.component.nc ncVar, java.util.LinkedList linkedList, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f135883d = ncVar;
        this.f135884e = linkedList;
        this.f135885f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.sb(this.f135883d, this.f135884e, this.f135885f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.sb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f135883d.f135293g;
        java.util.LinkedList linkedList = this.f135884e;
        if (baseFeedLoader == null) {
            return linkedList;
        }
        java.util.List<E> listOfType = baseFeedLoader.getListOfType(com.tencent.mm.plugin.finder.model.BaseFinderFeed.class);
        listOfType.addAll(hc2.f0.d(baseFeedLoader.getDataList().getBuffer(), com.tencent.mm.plugin.finder.model.BaseFinderFeed.class));
        int i17 = this.f135885f;
        java.util.List b17 = hc2.v.b(listOfType, i17);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
        java.util.Iterator it = b17.iterator();
        while (it.hasNext()) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) it.next()).getFeedObject().getFinderObject();
            r45.e13 e13Var = new r45.e13();
            e13Var.set(0, java.lang.Long.valueOf(finderObject.getId()));
            r45.dm2 object_extend = finderObject.getObject_extend();
            e13Var.set(4, object_extend != null ? object_extend.getString(62) : null);
            e13Var.set(1, finderObject.getObjectNonceId());
            e13Var.set(2, java.lang.Integer.valueOf(i17));
            arrayList.add(e13Var);
        }
        linkedList.addAll(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : linkedList) {
            if (!r11.X6().P6(i17, ((r45.e13) obj2).getLong(0))) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }
}
