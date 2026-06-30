package g75;

/* loaded from: classes11.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f269353d;

    /* renamed from: e, reason: collision with root package name */
    public int f269354e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g75.f0 f269355f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g75.z f269356g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j75.d f269357h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(g75.f0 f0Var, g75.z zVar, j75.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f269355f = f0Var;
        this.f269356g = zVar;
        this.f269357h = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new g75.c0(this.f269355f, this.f269356g, this.f269357h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g75.c0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        g75.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f269354e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            j75.d dVar = this.f269357h;
            kotlin.jvm.internal.o.e(dVar, "null cannot be cast to non-null type InAction of com.tencent.mm.sdk.pipeline.ProcessorPipelineComponent.onCreate.<no name provided>.invoke$lambda$0");
            g75.f0 f0Var2 = this.f269355f;
            this.f269353d = f0Var2;
            this.f269354e = 1;
            java.lang.Object i18 = f0Var2.i(this.f269356g, (j75.b) dVar, this);
            if (i18 == aVar) {
                return aVar;
            }
            f0Var = f0Var2;
            obj = i18;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f0Var = (g75.f0) this.f269353d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        f0Var.a((j75.d) obj);
        return jz5.f0.f302826a;
    }
}
