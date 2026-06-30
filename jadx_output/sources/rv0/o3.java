package rv0;

/* loaded from: classes5.dex */
public final class o3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f400159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400160e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(rv0.n1 n1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f400160e = n1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rv0.o3(this.f400160e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.o3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f400159d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.bf p76 = this.f400160e.p7();
            this.f400159d = 1;
            if (gx0.bf.t7(p76, false, this, 1, null) == aVar) {
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
