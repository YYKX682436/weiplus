package uw;

/* loaded from: classes.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f431516d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f431517e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f431518f;

    /* renamed from: g, reason: collision with root package name */
    public int f431519g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f431520h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ uw.y f431521i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(uw.y yVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f431521i = yVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        uw.x xVar = new uw.x(this.f431521i, continuation);
        xVar.f431520h = obj;
        return xVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((uw.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        uw.y yVar;
        java.lang.Object m521constructorimpl;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f431519g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f431520h;
            uw.y yVar2 = this.f431521i;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                this.f431520h = yVar2;
                this.f431516d = y0Var;
                this.f431517e = this;
                this.f431518f = yVar2;
                this.f431519g = 1;
                kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
                rVar.k();
                yVar2.getClass();
                tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                ((sb0.f) jVar).getClass();
                if (j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", false)) {
                    yVar2.f431524c = new uw.u(rVar, y0Var);
                    ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                    i11.h.e().l(yVar2.f431526e, true, false, false);
                    rVar.m(new uw.w(yVar2));
                } else {
                    rVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("No Location Permission"))));
                }
                obj = rVar.j();
                if (obj == aVar) {
                    return aVar;
                }
                yVar = yVar2;
            } catch (java.lang.Throwable th6) {
                th = th6;
                yVar = yVar2;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th));
                yVar.f431523b = kotlin.Result.m520boximpl(m521constructorimpl);
                return jz5.f0.f302826a;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar = (uw.y) this.f431518f;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.lang.Throwable th7) {
                th = th7;
                kotlin.Result.Companion companion22 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th));
                yVar.f431523b = kotlin.Result.m520boximpl(m521constructorimpl);
                return jz5.f0.f302826a;
            }
        }
        m521constructorimpl = kotlin.Result.m521constructorimpl((com.tencent.pigeon.brand_service.BSPOIInfo) obj);
        yVar.f431523b = kotlin.Result.m520boximpl(m521constructorimpl);
        return jz5.f0.f302826a;
    }
}
