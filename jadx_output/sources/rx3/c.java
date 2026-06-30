package rx3;

/* loaded from: classes10.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f401015d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f401016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ox3.a f401017f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rx3.h f401018g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ox3.a aVar, rx3.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f401017f = aVar;
        this.f401018g = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        rx3.c cVar = new rx3.c(this.f401017f, this.f401018g, continuation);
        cVar.f401016e = obj;
        return cVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rx3.c) create((kotlinx.coroutines.flow.k) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f401015d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.k kVar = (kotlinx.coroutines.flow.k) this.f401016e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindDataSource, requestExclusive is ");
            ox3.a aVar2 = this.f401017f;
            sb6.append(aVar2.f349721d.f415591g);
            com.tencent.mars.xlog.Log.i("MicroMsg.ExclusiveRemoteDataSource", sb6.toString());
            rx3.b bVar = new rx3.b(aVar2, kVar, this.f401018g, null);
            this.f401015d = 1;
            if (kotlinx.coroutines.a4.b(2000L, bVar, this) == aVar) {
                return aVar;
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
