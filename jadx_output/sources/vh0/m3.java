package vh0;

/* loaded from: classes8.dex */
public final class m3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f436911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh0.p3 f436912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f436913f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(vh0.p3 p3Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f436912e = p3Var;
        this.f436913f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vh0.m3(this.f436912e, this.f436913f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vh0.m3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f436911d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f436911d = 1;
            obj = vh0.p3.Zi(this.f436912e, this.f436913f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
