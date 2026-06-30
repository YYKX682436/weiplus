package df2;

/* loaded from: classes3.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.j0 f230014e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(df2.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230014e = j0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.e0(this.f230014e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((df2.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230013d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            df2.j0 j0Var = this.f230014e;
            com.tencent.mars.xlog.Log.i(j0Var.f230440m, "onViewMount audienceAction collect!");
            kotlinx.coroutines.flow.j2 j2Var = ((mm2.x4) j0Var.business(mm2.x4.class)).A;
            df2.d0 d0Var = new df2.d0(j0Var);
            this.f230013d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(d0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
