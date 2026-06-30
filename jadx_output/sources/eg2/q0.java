package eg2;

/* loaded from: classes3.dex */
public final class q0 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f252615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f252616e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f252617f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f252618g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(java.lang.String str, java.lang.String str2, int i17, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f252616e = str;
        this.f252617f = str2;
        this.f252618g = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new eg2.q0(this.f252616e, this.f252617f, this.f252618g, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((eg2.q0) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f252615d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            eg2.o0 o0Var = eg2.o0.f252605a;
            java.lang.String str = this.f252616e;
            java.lang.String str2 = this.f252617f;
            int i18 = this.f252618g;
            this.f252615d = 1;
            obj = o0Var.a(str, str2, null, i18, 1, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
