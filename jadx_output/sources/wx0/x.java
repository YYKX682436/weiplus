package wx0;

/* loaded from: classes5.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f450562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wx0.c0 f450563e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f450564f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(wx0.c0 c0Var, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f450563e = c0Var;
        this.f450564f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wx0.x(this.f450563e, this.f450564f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wx0.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f450562d;
        wx0.c0 c0Var = this.f450563e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            c0Var.e().setOnDismissListener(new wx0.v(this.f450564f));
            c0Var.e().setOnFilterSwitch(new wx0.w(c0Var, null));
            yx0.b8 b8Var = c0Var.f450459g;
            this.f450562d = 1;
            obj = b8Var.O(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        nx0.j2 j2Var = (nx0.j2) obj;
        if (c0Var.f450459g.f467188p0 != yx0.n.f467463e || j2Var != c0Var.e().getF69605m()) {
            c0Var.e().setFilterModel(j2Var);
        }
        c0Var.e().c();
        return jz5.f0.f302826a;
    }
}
