package wx0;

/* loaded from: classes5.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f450549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wx0.c0 f450550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f450551f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(wx0.c0 c0Var, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f450550e = c0Var;
        this.f450551f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wx0.u(this.f450550e, this.f450551f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wx0.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f450549d;
        wx0.c0 c0Var = this.f450550e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            c0Var.d().setOnDismissListener(new wx0.s(this.f450551f));
            c0Var.d().setOnFaceEffectSwitch(new wx0.t(c0Var, null));
            yx0.b8 b8Var = c0Var.f450459g;
            this.f450549d = 1;
            obj = b8Var.N(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        nx0.s1 s1Var = (nx0.s1) obj;
        if (c0Var.f450459g.f467188p0 != yx0.n.f467465g || s1Var != c0Var.d().getF69597i()) {
            c0Var.d().setFaceEffectModel(s1Var);
        }
        c0Var.d().b();
        return jz5.f0.f302826a;
    }
}
