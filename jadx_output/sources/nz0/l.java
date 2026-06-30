package nz0;

/* loaded from: classes5.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f341520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f341521e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341522f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f341521e = i17;
        this.f341522f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nz0.l(this.f341521e, this.f341522f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nz0.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f341520d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            nz0.o oVar = nz0.o.f341530a;
            this.f341520d = 1;
            if (nz0.o.a(oVar, this.f341521e, this.f341522f, this) == aVar) {
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
