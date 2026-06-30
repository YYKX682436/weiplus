package wx0;

/* loaded from: classes5.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f450571d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f450572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wx0.c0 f450573f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(wx0.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f450573f = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        wx0.z zVar = new wx0.z(this.f450573f, continuation);
        zVar.f450572e = obj;
        return zVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wx0.z) create((nx0.b3) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f450571d;
        wx0.c0 c0Var = this.f450573f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            nx0.b3 b3Var = (nx0.b3) this.f450572e;
            yx0.b8 b8Var = c0Var.f450459g;
            this.f450571d = 1;
            if (b8Var.u0(b3Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        nx0.b3 f69610f = c0Var.f().getF69610f();
        if (f69610f == null || (str = f69610f.f341075a) == null) {
            str = "";
        }
        yy0.m7 m7Var = (yy0.m7) l0Var;
        m7Var.getClass();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.x6(m7Var, str, null), 3, null);
        return jz5.f0.f302826a;
    }
}
