package nr0;

/* loaded from: classes14.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f339099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nr0.x f339100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nr0.c f339101f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(nr0.x xVar, nr0.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339100e = xVar;
        this.f339101f = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nr0.q(this.f339100e, this.f339101f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nr0.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f339099d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            nr0.x xVar = this.f339100e;
            zr0.p pVar = xVar.f339122n;
            nr0.c cVar = this.f339101f;
            pVar.f475170m = cVar;
            if ((xVar.f339123o != null) && cVar != null) {
                this.f339099d = 1;
                if (cVar.a(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
