package yn1;

/* loaded from: classes11.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f463740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f463741e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463741e = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.l0(this.f463741e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yn1.l0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f463740d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yn1.z0 z0Var = yn1.z0.f463933a;
            this.f463740d = 1;
            if (z0Var.v(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.f463741e.invoke(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()));
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        bp1.d dVar = bp1.e.f23040a;
        bp1.f[] fVarArr = bp1.e.f23041b;
        this.f463740d = 2;
        obj = dVar.a(fVarArr, this);
        if (obj == aVar) {
            return aVar;
        }
        this.f463741e.invoke(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()));
        return jz5.f0.f302826a;
    }
}
