package nr0;

/* loaded from: classes14.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f339079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nr0.x f339080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f339081f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f339082g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(nr0.x xVar, byte[] bArr, kotlin.coroutines.Continuation continuation, kotlin.coroutines.Continuation continuation2) {
        super(2, continuation2);
        this.f339080e = xVar;
        this.f339081f = bArr;
        this.f339082g = continuation;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nr0.g(this.f339080e, this.f339081f, this.f339082g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nr0.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f339079d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            xr0.j jVar = this.f339080e.f339121m.f456176b;
            zr0.p pVar = this.f339080e.f339122n;
            byte[] bArr = this.f339081f;
            int i18 = jVar.f456173a;
            int i19 = jVar.f456174b;
            this.f339079d = 1;
            if (pVar.l(bArr, i18, i19, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlin.coroutines.Continuation continuation = this.f339082g;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        jz5.f0 f0Var = jz5.f0.f302826a;
        continuation.resumeWith(kotlin.Result.m521constructorimpl(f0Var));
        return f0Var;
    }
}
