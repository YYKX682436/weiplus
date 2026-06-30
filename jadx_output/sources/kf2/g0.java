package kf2;

/* loaded from: classes.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f307232d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f307233e;

    /* renamed from: f, reason: collision with root package name */
    public int f307234f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f307235g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kf2.h0 f307236h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f307237i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f307238m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(java.lang.Object obj, kf2.h0 h0Var, long j17, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f307235g = obj;
        this.f307236h = h0Var;
        this.f307237i = j17;
        this.f307238m = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kf2.g0(this.f307235g, this.f307236h, this.f307237i, this.f307238m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kf2.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Integer b17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f307234f;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kf2.w wVar = kf2.x.f307310c;
            java.lang.Object obj2 = this.f307235g;
            java.lang.String c17 = wVar.c(obj2, "audience_username");
            if (c17 != null && (b17 = wVar.b(obj2, "op_type")) != null) {
                int intValue = b17.intValue();
                kf2.h0 h0Var = this.f307236h;
                long j17 = this.f307237i;
                int i18 = this.f307238m;
                this.f307232d = c17;
                this.f307233e = h0Var;
                this.f307234f = 1;
                kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
                rVar.k();
                h0Var.f307243d = new kf2.f0(h0Var, j17, i18, new v65.n(rVar));
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                hb2.y.f280114e.r(c17, intValue == 1, h0Var.f307243d);
                if (rVar.j() == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
