package l41;

/* loaded from: classes4.dex */
public final class w1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f315952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f315953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f315954f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(kotlinx.coroutines.flow.j jVar, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f315953e = jVar;
        this.f315954f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new l41.w1(this.f315953e, this.f315954f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((l41.w1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f315952d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            l41.v1 v1Var = new l41.v1(this.f315954f);
            this.f315952d = 1;
            if (this.f315953e.a(v1Var, this) == aVar) {
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
