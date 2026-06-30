package yb1;

/* loaded from: classes.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f460659d;

    /* renamed from: e, reason: collision with root package name */
    public int f460660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ of1.w1 f460661f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(of1.w1 w1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f460661f = w1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yb1.j(this.f460661f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yb1.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f460660e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            of1.w1 w1Var = this.f460661f;
            this.f460659d = w1Var;
            this.f460660e = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            w1Var.getWebView().evaluateJavascript("document.body.innerHTML", new yb1.i(rVar));
            obj = rVar.j();
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
