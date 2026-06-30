package eg2;

/* loaded from: classes3.dex */
public final class z0 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f252652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eg2.b1 f252653e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f252654f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(eg2.b1 b1Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f252653e = b1Var;
        this.f252654f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new eg2.z0(this.f252653e, this.f252654f, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((eg2.z0) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f252652d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            eg2.o0 o0Var = eg2.o0.f252605a;
            eg2.b1 b1Var = this.f252653e;
            java.lang.String str = b1Var.f252538f;
            java.lang.String str2 = this.f252654f;
            int i18 = b1Var.f252541i;
            this.f252652d = 1;
            obj = o0Var.a(str, str2, null, i18, 2, this);
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
