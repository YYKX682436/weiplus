package yu0;

/* loaded from: classes5.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f465801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yu0.m f465802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yu0.c f465803f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yu0.m mVar, yu0.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f465802e = mVar;
        this.f465803f = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yu0.k(this.f465802e, this.f465803f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yu0.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f465801d;
        yu0.c cVar = this.f465803f;
        yu0.m mVar = this.f465802e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yu0.f fVar = mVar.f465810a;
            this.f465801d = 1;
            obj = fVar.a(cVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        yu0.e eVar = (yu0.e) obj;
        if (eVar.f465788c) {
            throw new java.util.concurrent.CancellationException("submitTask false");
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) mVar.f465813d.get(cVar.f465781a);
        int incrementAndGet = atomicInteger != null ? atomicInteger.incrementAndGet() : 0;
        java.lang.Integer num = (java.lang.Integer) mVar.f465814e.get(cVar.f465781a);
        if (num != null && incrementAndGet == num.intValue()) {
            kotlinx.coroutines.l.d(mVar.f465818i, null, null, new yu0.h(mVar, cVar.f465781a, eVar, null), 3, null);
        }
        mVar.f465811b.decrementAndGet();
        this.f465801d = 2;
        if (yu0.m.a(mVar, "executor submit", this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
