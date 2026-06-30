package mm1;

/* loaded from: classes3.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f328678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f328679e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f328680f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(long j17, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f328679e = j17;
        this.f328680f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mm1.n(this.f328679e, this.f328680f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm1.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f328678d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mm1.m mVar = new mm1.m(this.f328680f, null);
            this.f328678d = 1;
            if (kotlinx.coroutines.a4.b(this.f328679e, mVar, this) == aVar) {
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
