package hf2;

/* loaded from: classes5.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f281121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hf2.y0 f281122e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(hf2.y0 y0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281122e = y0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hf2.n0(this.f281122e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hf2.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f281121d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            this.f281121d = 1;
            if (kotlinx.coroutines.k1.b(60000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        hf2.y0 y0Var = this.f281122e;
        hf2.l0 l0Var = y0Var.f281209j;
        if (l0Var != null) {
            l0Var.a("release_job");
        }
        y0Var.f281209j = null;
        return jz5.f0.f302826a;
    }
}
