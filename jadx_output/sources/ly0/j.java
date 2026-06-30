package ly0;

/* loaded from: classes3.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f322208d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f322209e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f322210f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f322210f = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ly0.j jVar = new ly0.j(this.f322210f, continuation);
        jVar.f322209e = obj;
        return jVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ly0.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f322208d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f322209e;
            this.f322208d = 1;
            if (this.f322210f.invoke(y0Var, this) == aVar) {
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
