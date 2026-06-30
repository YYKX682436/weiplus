package com.tencent.mm.storage;

/* loaded from: classes10.dex */
public final class r8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f195279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f195280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f195281f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f195280e = arrayList;
        this.f195281f = arrayList2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.storage.r8(this.f195280e, this.f195281f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.storage.r8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f195279d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryStorage", "initDBWithData");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init after to insert data >> dataList: ");
            java.util.ArrayList arrayList = this.f195280e;
            sb6.append(arrayList.size());
            sb6.append(", oldNoRecData: ");
            java.util.ArrayList arrayList2 = this.f195281f;
            sb6.append(arrayList2.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryStorage", sb6.toString());
            f65.p.f259939f = arrayList.size();
            f65.p.f259940g = arrayList2.size();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.storage.s8.f195314a.c((com.tencent.mm.api.QueryImageData) it.next(), aq.o.f12921b);
            }
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            com.tencent.mm.storage.q8 q8Var = new com.tencent.mm.storage.q8(arrayList, arrayList2, null);
            this.f195279d = 1;
            obj = kotlinx.coroutines.l.g(g3Var, q8Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
