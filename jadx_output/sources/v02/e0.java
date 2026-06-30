package v02;

/* loaded from: classes8.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f432246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v02.f0 f432247e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(v02.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f432247e = f0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new v02.e0(this.f432247e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((v02.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f432246d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.z zVar = this.f432247e.f432249n;
            this.f432246d = 1;
            obj = ((kotlinx.coroutines.a0) zVar).k(this);
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
