package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class cc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f134006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.db f134007e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f134008f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.cb f134009g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nc f134010h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f134011i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(java.util.List list, com.tencent.mm.plugin.finder.viewmodel.component.db dbVar, int i17, com.tencent.mm.plugin.finder.viewmodel.component.cb cbVar, com.tencent.mm.plugin.finder.viewmodel.component.nc ncVar, com.tencent.mm.protocal.protobuf.FinderObject finderObject, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f134006d = list;
        this.f134007e = dbVar;
        this.f134008f = i17;
        this.f134009g = cbVar;
        this.f134010h = ncVar;
        this.f134011i = finderObject;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.cc(this.f134006d, this.f134007e, this.f134008f, this.f134009g, this.f134010h, this.f134011i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.cc ccVar = (com.tencent.mm.plugin.finder.viewmodel.component.cc) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        ccVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.List<com.tencent.mm.protocal.protobuf.FinderObject> list = this.f134006d;
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
            java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = com.tencent.mm.plugin.finder.viewmodel.component.nc.f135289z;
            com.tencent.mm.plugin.finder.viewmodel.component.nc.f135289z.add(new java.lang.Long(finderObject.getId()));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onEventHappen] successfully insert of type=");
        sb6.append(this.f134007e);
        sb6.append(' ');
        sb6.append(this.f134008f);
        sb6.append("! ");
        sb6.append(this.f134009g);
        sb6.append(" requestObj=");
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet2 = com.tencent.mm.plugin.finder.viewmodel.component.nc.f135289z;
        com.tencent.mm.plugin.finder.viewmodel.component.nc ncVar = this.f134010h;
        sb6.append(ncVar.b7(this.f134011i));
        sb6.append(" insert=");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ncVar.b7((com.tencent.mm.protocal.protobuf.FinderObject) it.next()));
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("Finder.EnhanceFeedUIC", sb6.toString());
        return jz5.f0.f302826a;
    }
}
