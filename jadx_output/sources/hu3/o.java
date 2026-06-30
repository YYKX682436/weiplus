package hu3;

/* loaded from: classes5.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f285180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f285181e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f285182f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(int i17, hu3.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f285181e = i17;
        this.f285182f = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hu3.o(this.f285181e, this.f285182f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hu3.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f285180d;
        hu3.n0 n0Var = this.f285182f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select beauty >> ");
            int i18 = this.f285181e;
            sb6.append(i18);
            com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", sb6.toString());
            this.f285180d = 1;
            obj = hu3.n0.c(n0Var, i18, true, this);
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
        android.view.Surface surface = (android.view.Surface) obj;
        if (surface != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "switch beauty success");
            if (n0Var.f285165i == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "no select filter , goto toggle render");
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
                hu3.n nVar = new hu3.n(n0Var, surface, null);
                this.f285180d = 2;
                if (kotlinx.coroutines.l.g(g3Var, nVar, this) == aVar) {
                    return aVar;
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
