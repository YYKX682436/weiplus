package rn2;

/* loaded from: classes15.dex */
public final class r2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f397834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f397835e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397836f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(rn2.t2 t2Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f397835e = t2Var;
        this.f397836f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rn2.r2(this.f397835e, this.f397836f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rn2.r2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f397834d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gk2.e eVar = gk2.e.f272471n;
            if (eVar == null) {
                return f0Var;
            }
            ld2.i iVar = ld2.i.f318103a;
            rn2.t2 t2Var = this.f397835e;
            com.tencent.mm.ui.MMActivity mMActivity = t2Var.f397853e;
            java.lang.String str = this.f397836f;
            ml2.l1 l1Var = ml2.l1.f327689p;
            rn2.q2 q2Var = new rn2.q2(t2Var);
            this.f397834d = 1;
            if (iVar.b(mMActivity, eVar, str, l1Var, q2Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
