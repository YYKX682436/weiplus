package wx0;

/* loaded from: classes5.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f450451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wx0.c0 f450452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f450453f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(wx0.c0 c0Var, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f450452e = c0Var;
        this.f450453f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wx0.a0(this.f450452e, this.f450453f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wx0.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f450451d;
        wx0.c0 c0Var = this.f450452e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            c0Var.f().setOnDismissListener(new wx0.y(this.f450453f));
            c0Var.f().setOnMakeupSwitch(new wx0.z(c0Var, null));
            yx0.b8 b8Var = c0Var.f450459g;
            this.f450451d = 1;
            obj = b8Var.P(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        nx0.c3 c3Var = (nx0.c3) obj;
        if (c0Var.f450459g.f467188p0 != yx0.n.f467464f || c3Var != c0Var.f().getF69613i()) {
            c0Var.f().setMakeupModel(c3Var);
        }
        c0Var.f().b();
        return jz5.f0.f302826a;
    }
}
