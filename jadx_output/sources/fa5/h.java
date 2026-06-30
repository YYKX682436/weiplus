package fa5;

/* loaded from: classes7.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f260812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fa5.j f260813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260814f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260815g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(fa5.j jVar, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f260813e = jVar;
        this.f260814f = str;
        this.f260815g = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fa5.h(this.f260813e, this.f260814f, this.f260815g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fa5.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f260812d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f260812d = 1;
            if (this.f260813e.wi(this.f260814f, this.f260815g, this) == aVar) {
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
