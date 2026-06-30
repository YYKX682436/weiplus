package id2;

/* loaded from: classes.dex */
public final class n3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f290684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f290685e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290686f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f290687g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f290688h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f290689i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f290690m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f290691n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f290692o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ km2.b f290693p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.l f290694q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(id2.u3 u3Var, java.lang.String str, android.content.Context context, long j17, long j18, boolean z17, boolean z18, boolean z19, km2.b bVar, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f290685e = u3Var;
        this.f290686f = str;
        this.f290687g = context;
        this.f290688h = j17;
        this.f290689i = j18;
        this.f290690m = z17;
        this.f290691n = z18;
        this.f290692o = z19;
        this.f290693p = bVar;
        this.f290694q = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new id2.n3(this.f290685e, this.f290686f, this.f290687g, this.f290688h, this.f290689i, this.f290690m, this.f290691n, this.f290692o, this.f290693p, this.f290694q, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((id2.n3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object P6;
        java.lang.Object j17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f290684d;
        id2.u3 u3Var = this.f290685e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f290684d = 1;
            P6 = id2.u3.P6(u3Var, this.f290686f, this);
            if (P6 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                j17 = obj;
                ((java.lang.Boolean) j17).booleanValue();
                id2.u3 u3Var2 = this.f290685e;
                android.content.Context context = this.f290687g;
                long j18 = this.f290688h;
                long j19 = this.f290689i;
                boolean z17 = this.f290690m;
                boolean z18 = this.f290691n;
                boolean z19 = this.f290692o;
                id2.u3.Q6(u3Var2, context, j18, j19, z17, z18, z19, false, new id2.m3(u3Var2, context, j18, j19, this.f290693p, z17, z18, z19, this.f290694q));
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            P6 = obj;
        }
        r45.lw1 lw1Var = (r45.lw1) P6;
        if (lw1Var != null) {
            long j27 = this.f290688h;
            long j28 = this.f290689i;
            this.f290684d = 2;
            u3Var.getClass();
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            v65.n nVar = new v65.n(rVar);
            pq5.g l17 = new ek2.r1(j27, j28, 8, ek2.r1.f253524u.d(lw1Var)).l();
            l17.K(new id2.j2(nVar, this.f290687g, false, u3Var));
            android.app.Activity context2 = u3Var.getContext();
            l17.f(context2 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context2 : null);
            j17 = rVar.j();
            if (j17 == aVar) {
                return aVar;
            }
            ((java.lang.Boolean) j17).booleanValue();
        }
        id2.u3 u3Var22 = this.f290685e;
        android.content.Context context3 = this.f290687g;
        long j182 = this.f290688h;
        long j192 = this.f290689i;
        boolean z172 = this.f290690m;
        boolean z182 = this.f290691n;
        boolean z192 = this.f290692o;
        id2.u3.Q6(u3Var22, context3, j182, j192, z172, z182, z192, false, new id2.m3(u3Var22, context3, j182, j192, this.f290693p, z172, z182, z192, this.f290694q));
        return jz5.f0.f302826a;
    }
}
