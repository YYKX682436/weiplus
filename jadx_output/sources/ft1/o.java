package ft1;

/* loaded from: classes10.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f266505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ft1.q f266506e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266507f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f266508g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c01.o8 f266509h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ft1.q qVar, java.lang.String str, int i17, c01.o8 o8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f266506e = qVar;
        this.f266507f = str;
        this.f266508g = i17;
        this.f266509h = o8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ft1.o(this.f266506e, this.f266507f, this.f266508g, this.f266509h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ft1.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f266505d;
        java.lang.String str = this.f266507f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f266505d = 1;
            obj = ft1.q.b(this.f266506e, str, this.f266508g, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.BypGetContactInterceptor", "getContact result: %s, success: %s", str, java.lang.Boolean.valueOf(booleanValue));
        c01.o8 o8Var = this.f266509h;
        if (o8Var != null) {
            o8Var.a(str, booleanValue);
        }
        return jz5.f0.f302826a;
    }
}
