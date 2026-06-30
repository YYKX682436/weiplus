package gx0;

/* loaded from: classes5.dex */
public final class w6 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f277107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f277108e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(gx0.w8 w8Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f277108e = w8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new gx0.w6(this.f277108e, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((gx0.w6) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f277107d;
        gx0.w8 w8Var = this.f277108e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.bf V6 = w8Var.V6();
            this.f277107d = 1;
            if (gx0.bf.d7(V6, null, null, false, this, 7, null) == aVar) {
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
        gx0.bf V62 = w8Var.V6();
        this.f277107d = 2;
        if (gx0.bf.d7(V62, null, null, false, this, 7, null) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
