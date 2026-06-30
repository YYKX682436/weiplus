package gx0;

/* loaded from: classes5.dex */
public final class j9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.p9 f276578e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.o f276579f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f276580g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(gx0.p9 p9Var, ex0.o oVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276578e = p9Var;
        this.f276579f = oVar;
        this.f276580g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.j9(this.f276578e, this.f276579f, this.f276580g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.j9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276577d;
        gx0.p9 p9Var = this.f276578e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            du0.t0 Q6 = p9Var.Q6();
            this.f276577d = 1;
            if (Q6.V6(this) == aVar) {
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
        java.lang.String defaultLyricStyleID = this.f276580g;
        kotlin.jvm.internal.o.f(defaultLyricStyleID, "$defaultLyricStyleID");
        this.f276579f.I(defaultLyricStyleID);
        gx0.bf t76 = p9Var.t7();
        this.f276577d = 2;
        if (gx0.bf.d7(t76, null, null, false, this, 7, null) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
