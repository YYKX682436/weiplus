package com.tencent.mm.storage;

/* loaded from: classes14.dex */
public final class q8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f195247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f195248e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f195247d = arrayList;
        this.f195248e = arrayList2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.storage.q8(this.f195247d, this.f195248e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.storage.q8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f195247d.addAll(this.f195248e);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryStorage", "init after to start identify all data size: " + this.f195247d.size());
        aq.n nVar = aq.o.f12922c;
        if (nVar == null) {
            return null;
        }
        java.util.ArrayList list = this.f195247d;
        kotlin.jvm.internal.o.g(list, "list");
        if (nVar.f12910e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageDataManager", "startIdentify >> isDoingWork");
        } else {
            nVar.f12910e = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageDataManager", "initToStartIdentify >> data size: " + list.size());
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            f65.p.f259935b = currentTimeMillis;
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryConsumeTimeReporter", "setStartTimeStamp >> " + currentTimeMillis);
            f65.m.f259897b = currentTimeMillis;
            f65.p.f259941h = (long) list.size();
            f65.p.f259950q = 1;
            if (true ^ list.isEmpty()) {
                nVar.f12906a = aq.b.f12837f;
                aq.r0.f12940a.j(list);
                nVar.f12912g.postValue(aq.c.f12843e);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageDataManager", "initToStartIdentify image list is empty");
                nVar.f12906a = aq.b.f12836e;
                nVar.f12912g.postValue(aq.c.f12845g);
                f65.p.f259934a.a(6, 0, 0L);
            }
        }
        return jz5.f0.f302826a;
    }
}
