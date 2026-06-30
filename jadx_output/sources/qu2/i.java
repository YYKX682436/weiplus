package qu2;

/* loaded from: classes12.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f366783d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f366784e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qu2.k f366785f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(qu2.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f366785f = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        qu2.i iVar = new qu2.i(this.f366785f, continuation);
        iVar.f366784e = obj;
        return iVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qu2.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f366783d;
        qu2.k kVar = this.f366785f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            y0Var = (kotlinx.coroutines.y0) this.f366784e;
            ts5.n nVar = (ts5.n) i95.n0.c(ts5.n.class);
            ts5.a collectWhat = kVar.f366788a;
            qu2.h hVar = qu2.h.f366782d;
            nu2.i iVar = (nu2.i) nVar;
            iVar.getClass();
            kotlin.jvm.internal.o.g(collectWhat, "collectWhat");
            nu2.f fVar = new nu2.f(hVar);
            ou2.d dVar = iVar.f340181d;
            dVar.getClass();
            kVar.f366790c = new ou2.c(collectWhat, dVar, fVar);
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (kotlinx.coroutines.y0) this.f366784e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (kotlinx.coroutines.z0.h(y0Var)) {
            ((com.tencent.mm.feature.performance.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
            int i18 = com.tencent.mm.plugin.performance.watchdogs.b0.B.g().f343968y;
            ts5.b bVar = kVar.f366790c;
            if (bVar != null) {
                qu2.g gVar = new qu2.g(i18 / 1024.0f);
                ou2.c cVar = (ou2.c) bVar;
                ou2.d dVar2 = cVar.f348929b;
                dVar2.getClass();
                ts5.p uniqueTag = cVar.f348928a;
                kotlin.jvm.internal.o.g(uniqueTag, "uniqueTag");
                ts5.m calculator = cVar.f348930c;
                kotlin.jvm.internal.o.g(calculator, "calculator");
                if (uniqueTag.f421741a.f421731d || ou2.a.a(ou2.d.f348931d)) {
                    ou2.e eVar = dVar2.f348932a;
                    eVar.getClass();
                    com.tencent.mars.xlog.Log.e("TraceWorker", "#collect uniqueTag=" + uniqueTag + " currentData=" + gVar);
                    java.util.Map map = eVar.f348936b;
                    java.util.List list = (java.util.List) ((java.util.LinkedHashMap) map).get(uniqueTag);
                    if (list == null) {
                        list = new java.util.ArrayList();
                        map.put(uniqueTag, list);
                    }
                    list.add(gVar);
                    if (list.size() >= 1800) {
                        nu2.e.a(dVar2, calculator, uniqueTag, false, 4, null);
                    }
                }
            }
            this.f366784e = y0Var;
            this.f366783d = 1;
            if (kotlinx.coroutines.k1.b(60000L, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
