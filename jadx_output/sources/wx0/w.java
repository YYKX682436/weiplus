package wx0;

/* loaded from: classes5.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f450556d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f450557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wx0.c0 f450558f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(wx0.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f450558f = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        wx0.w wVar = new wx0.w(this.f450558f, continuation);
        wVar.f450557e = obj;
        return wVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wx0.w) create((nx0.i2) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f450556d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        wx0.c0 c0Var = this.f450558f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            nx0.i2 i2Var = (nx0.i2) this.f450557e;
            yx0.b8 b8Var = c0Var.f450459g;
            this.f450556d = 1;
            kotlinx.coroutines.l.d(b8Var.M, null, null, new yx0.v6(i2Var, b8Var, null), 3, null);
            if (f0Var == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        nx0.i2 f69602g = c0Var.e().getF69602g();
        if (f69602g == null || (str = f69602g.f341132a) == null) {
            str = "";
        }
        yy0.m7 m7Var = (yy0.m7) l0Var;
        m7Var.getClass();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.v6(m7Var, str, null), 3, null);
        return f0Var;
    }
}
