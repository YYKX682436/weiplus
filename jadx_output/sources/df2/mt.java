package df2;

/* loaded from: classes3.dex */
public final class mt extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.x42 f230804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.nt f230805f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt(r45.x42 x42Var, df2.nt ntVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230804e = x42Var;
        this.f230805f = ntVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.mt(this.f230804e, this.f230805f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.mt) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230803d;
        r45.x42 x42Var = this.f230804e;
        df2.nt ntVar = this.f230805f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long integer = x42Var.getInteger(1) * 1000;
            com.tencent.mars.xlog.Log.i(ntVar.f230882m, "launch delay job, delay = " + integer);
            this.f230803d = 1;
            if (kotlinx.coroutines.k1.b(integer, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i(ntVar.f230882m, "doReportInternal after " + x42Var.getInteger(1) + "s, report size = " + ntVar.f230883n.size());
        ntVar.b7("after delay");
        return jz5.f0.f302826a;
    }
}
