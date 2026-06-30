package eq1;

/* loaded from: classes.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f255851d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f255852e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f255853f;

    /* renamed from: g, reason: collision with root package name */
    public int f255854g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f255855h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ eq1.u f255856i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f255857m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(eq1.u uVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f255856i = uVar;
        this.f255857m = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        eq1.r rVar = new eq1.r(this.f255856i, this.f255857m, continuation);
        rVar.f255855h = obj;
        return rVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((eq1.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        eq1.u uVar;
        eq1.u uVar2;
        java.lang.Object m521constructorimpl;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f255854g;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f255855h;
            uVar = this.f255856i;
            boolean z18 = this.f255857m;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                this.f255855h = uVar;
                this.f255851d = y0Var;
                this.f255852e = this;
                this.f255853f = uVar;
                this.f255854g = 1;
                kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
                rVar.k();
                uVar.getClass();
                tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                ((sb0.f) jVar).getClass();
                if (j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", false)) {
                    uVar.f255868c = new eq1.o(rVar, y0Var);
                    ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                    i11.h e17 = i11.h.e();
                    eq1.m mVar = uVar.f255871f;
                    if (!z18) {
                        z17 = false;
                    }
                    e17.l(mVar, z17, false, false);
                    rVar.m(new eq1.q(uVar));
                } else {
                    rVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("No Location Permission"))));
                }
                obj = rVar.j();
                if (obj == aVar) {
                    return aVar;
                }
                uVar2 = uVar;
            } catch (java.lang.Throwable th6) {
                th = th6;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th));
                uVar2 = uVar;
                uVar2.f255867b = kotlin.Result.m520boximpl(m521constructorimpl);
                return jz5.f0.f302826a;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uVar2 = (eq1.u) this.f255853f;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.lang.Throwable th7) {
                th = th7;
                uVar = uVar2;
                kotlin.Result.Companion companion22 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th));
                uVar2 = uVar;
                uVar2.f255867b = kotlin.Result.m520boximpl(m521constructorimpl);
                return jz5.f0.f302826a;
            }
        }
        m521constructorimpl = kotlin.Result.m521constructorimpl((com.tencent.pigeon.biz.BizPOIInfo) obj);
        uVar2.f255867b = kotlin.Result.m520boximpl(m521constructorimpl);
        return jz5.f0.f302826a;
    }
}
