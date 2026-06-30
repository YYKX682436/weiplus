package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class lc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f135044d;

    /* renamed from: e, reason: collision with root package name */
    public int f135045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nc f135046f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f135047g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f135048h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f135049i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc(com.tencent.mm.plugin.finder.viewmodel.component.nc ncVar, int i17, java.util.List list, r45.qt2 qt2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f135046f = ncVar;
        this.f135047g = i17;
        this.f135048h = list;
        this.f135049i = qt2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.lc(this.f135046f, this.f135047g, this.f135048h, this.f135049i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.lc) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object P6;
        java.util.LinkedList linkedList;
        r45.qt2 qt2Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f135045e;
        int i18 = this.f135047g;
        com.tencent.mm.plugin.finder.viewmodel.component.nc ncVar = this.f135046f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            this.f135044d = linkedList2;
            this.f135045e = 1;
            P6 = com.tencent.mm.plugin.finder.viewmodel.component.nc.P6(ncVar, i18, this);
            if (P6 == aVar) {
                return aVar;
            }
            linkedList = linkedList2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            linkedList = (java.util.LinkedList) this.f135044d;
            kotlin.ResultKt.throwOnFailure(obj);
            P6 = obj;
        }
        java.util.List list = (java.util.List) P6;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list2 = this.f135048h;
        java.util.Iterator it = list2.iterator();
        while (true) {
            boolean z17 = false;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) next;
            java.util.Iterator it6 = list.iterator();
            int i19 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i19 = -1;
                    break;
                }
                if (((r45.e13) it6.next()).getLong(0) == finderObject.getId()) {
                    break;
                }
                i19++;
            }
            if (i19 < 0) {
                java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = com.tencent.mm.plugin.finder.viewmodel.component.nc.f135289z;
                if (!ncVar.X6().P6(i18, finderObject.getId())) {
                    z17 = true;
                }
            }
            if (z17) {
                arrayList.add(next);
            }
        }
        java.util.Iterator it7 = arrayList.iterator();
        while (true) {
            boolean hasNext = it7.hasNext();
            qt2Var = this.f135049i;
            if (!hasNext) {
                break;
            }
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) it7.next();
            r45.e13 e13Var = new r45.e13();
            e13Var.set(0, java.lang.Long.valueOf(finderObject2.getId()));
            r45.dm2 object_extend = finderObject2.getObject_extend();
            java.lang.String str = null;
            e13Var.set(4, object_extend != null ? object_extend.getString(62) : null);
            e13Var.set(1, finderObject2.getObjectNonceId());
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            long j17 = e13Var.getLong(0);
            r45.dm2 object_extend2 = finderObject2.getObject_extend();
            if (object_extend2 != null) {
                str = object_extend2.getString(62);
            }
            e13Var.set(3, o3Var.ek(j17, str, qt2Var.getInteger(5)));
            e13Var.set(2, 4);
            linkedList.add(e13Var);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[reportUnreadFeed] (");
        sb6.append(list2.size());
        sb6.append(" => ");
        sb6.append(linkedList.size());
        sb6.append(") list=");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it8 = linkedList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(pm0.v.u(((r45.e13) it8.next()).getLong(0)));
        }
        sb6.append(arrayList2);
        com.tencent.mars.xlog.Log.i("Finder.EnhanceFeedUIC", sb6.toString());
        if (!linkedList.isEmpty()) {
            new db2.f(linkedList, qt2Var).l();
        }
        return jz5.f0.f302826a;
    }
}
