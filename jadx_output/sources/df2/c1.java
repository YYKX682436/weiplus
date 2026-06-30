package df2;

/* loaded from: classes3.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f229843d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f229844e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f229845f;

    /* renamed from: g, reason: collision with root package name */
    public int f229846g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ df2.d1 f229847h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ in0.q f229848i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f229849m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f229850n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(df2.d1 d1Var, in0.q qVar, int i17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229847h = d1Var;
        this.f229848i = qVar;
        this.f229849m = i17;
        this.f229850n = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.c1(this.f229847h, this.f229848i, this.f229849m, this.f229850n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f229846g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            df2.d1 d1Var = this.f229847h;
            this.f229843d = d1Var;
            in0.q qVar = this.f229848i;
            this.f229844e = qVar;
            java.lang.String str = this.f229850n;
            this.f229845f = str;
            this.f229846g = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            com.tencent.mars.xlog.Log.i(d1Var.f229933m, "startPlay");
            kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
            java.lang.String i18 = com.tencent.mm.vfs.w6.i(str, false);
            if (i18 == null) {
                i18 = "";
            }
            java.lang.String i19 = com.tencent.mm.vfs.w6.i(df2.d1.f229932p + "PhysicalGiftV1", false);
            p05.m0 m0Var = new p05.m0(this.f229849m, i18, i19 != null ? i19 : "");
            df2.b1 b1Var = new df2.b1(c0Var, d1Var, rVar);
            qVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "setFallingGiftEffect " + m0Var);
            qVar.f420771r.l(new in0.j(qVar, m0Var, b1Var));
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
