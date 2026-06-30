package jj5;

/* loaded from: classes.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f300035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f300036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym3.d f300037f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kotlinx.coroutines.flow.i2 i2Var, ym3.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f300036e = i2Var;
        this.f300037f = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jj5.b(this.f300036e, this.f300037f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jj5.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f300035d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f300035d = 1;
            if (this.f300036e.emit(this.f300037f, this) == aVar) {
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
