package l41;

/* loaded from: classes8.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f315873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j41.h0 f315874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j41.j0 f315875f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.s4 f315876g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315877h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(j41.h0 h0Var, j41.j0 j0Var, r45.s4 s4Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f315874e = h0Var;
        this.f315875f = j0Var;
        this.f315876g = s4Var;
        this.f315877h = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new l41.n0(this.f315874e, this.f315875f, this.f315876g, this.f315877h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((l41.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f315873d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                m41.b bVar = new m41.b(this.f315874e, this.f315875f, this.f315876g);
                this.f315873d = 1;
                if (bVar.d(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConfirmController", "asyncEnterKefuChat finished, username: %s", this.f315877h);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMKefuConfirmController", "asyncEnterKefuChat exception: " + e17.getMessage());
        }
        return jz5.f0.f302826a;
    }
}
