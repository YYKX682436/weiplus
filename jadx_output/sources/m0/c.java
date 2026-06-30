package m0;

/* loaded from: classes14.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f322443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0.r f322444e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m0.d f322445f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0.r f322446g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(m0.r rVar, m0.d dVar, c0.r rVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f322444e = rVar;
        this.f322445f = dVar;
        this.f322446g = rVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new m0.c(this.f322444e, this.f322445f, this.f322446g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((m0.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f322443d;
        c0.r rVar = this.f322446g;
        m0.d dVar = this.f322445f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                m0.r rVar2 = this.f322444e;
                this.f322443d = 1;
                if (rVar2.a(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            dVar.f322454i.remove(rVar);
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            dVar.f322454i.remove(rVar);
            throw th6;
        }
    }
}
