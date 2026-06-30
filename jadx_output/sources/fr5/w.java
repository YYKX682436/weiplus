package fr5;

/* loaded from: classes11.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f266027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ er5.g f266028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f266029f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(er5.g gVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f266028e = gVar;
        this.f266029f = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fr5.w(this.f266028e, this.f266029f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fr5.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f266027d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j17 = this.f266029f;
            this.f266027d = 1;
            if (this.f266028e.f256242c.h(j17, true, null, this) == aVar) {
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
