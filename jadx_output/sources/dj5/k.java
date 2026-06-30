package dj5;

/* loaded from: classes.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f233074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f233075e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f233076f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dj5.m f233077g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wi5.z f233078h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kotlinx.coroutines.flow.i2 i2Var, java.util.HashMap hashMap, dj5.m mVar, wi5.z zVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f233075e = i2Var;
        this.f233076f = hashMap;
        this.f233077g = mVar;
        this.f233078h = zVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dj5.k(this.f233075e, this.f233076f, this.f233077g, this.f233078h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((dj5.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f233074d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dj5.j jVar = new dj5.j(this.f233076f, this.f233077g, this.f233078h);
            this.f233074d = 1;
            if (this.f233075e.a(jVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
