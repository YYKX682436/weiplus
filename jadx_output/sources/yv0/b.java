package yv0;

/* loaded from: classes5.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f465954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yv0.h f465955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yv0.p f465956f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yv0.h hVar, yv0.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f465955e = hVar;
        this.f465956f = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yv0.b(this.f465955e, this.f465956f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yv0.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f465954d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yv0.h hVar = this.f465955e;
            dx0.n nVar = hVar.f465967f;
            yv0.p pVar = this.f465956f;
            nVar.d(pVar.f465985a);
            this.f465954d = 1;
            if (hVar.f465967f.c(pVar.f465985a, false, this) == aVar) {
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
