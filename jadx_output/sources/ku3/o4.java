package ku3;

/* loaded from: classes5.dex */
public final class o4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ku3.s4 f312354e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(ku3.s4 s4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f312354e = s4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ku3.o4(this.f312354e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ku3.o4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f312353d;
        ku3.s4 s4Var = this.f312354e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            bs0.j jVar = s4Var.f312409d.f475577e;
            this.f312353d = 1;
            obj = jVar.f(2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMenuPortraitPlugin", "set portrait mode >> " + booleanValue);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        ku3.n4 n4Var = new ku3.n4(s4Var, booleanValue, null);
        this.f312353d = 2;
        if (kotlinx.coroutines.l.g(g3Var, n4Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
