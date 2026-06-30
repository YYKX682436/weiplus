package rn2;

/* loaded from: classes.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f397752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f397753e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.dz1 f397754f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v65.n f397755g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(android.content.Context context, r45.dz1 dz1Var, v65.n nVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f397753e = context;
        this.f397754f = dz1Var;
        this.f397755g = nVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rn2.h0(this.f397753e, this.f397754f, this.f397755g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rn2.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f397752d;
        android.content.Context context = this.f397753e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            this.f397752d = 1;
            obj = ((c61.l7) b6Var).sl(context, 0, this);
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
        if (((java.lang.Boolean) ((jz5.l) obj).f302833d).booleanValue()) {
            rn2.l0 l0Var = rn2.l0.f397792a;
            this.f397752d = 2;
            if (l0Var.e(context, this.f397754f, this) == aVar) {
                return aVar;
            }
        } else {
            this.f397755g.a(new jz5.l("not enough pay", null));
        }
        return jz5.f0.f302826a;
    }
}
