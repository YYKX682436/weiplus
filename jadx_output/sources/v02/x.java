package v02;

/* loaded from: classes3.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f432289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v02.f0 f432290e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f432291f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(v02.f0 f0Var, com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f432290e = f0Var;
        this.f432291f = f9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new v02.x(this.f432290e, this.f432291f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((v02.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f432289d;
        com.tencent.mm.storage.f9 f9Var = this.f432291f;
        v02.f0 f0Var = this.f432290e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f432289d = 1;
            obj = v02.f0.Zi(f0Var, f9Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        v02.f0.bj(f0Var, f9Var, (java.lang.String) obj);
        return jz5.f0.f302826a;
    }
}
