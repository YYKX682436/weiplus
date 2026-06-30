package wx0;

/* loaded from: classes5.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f450521d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f450522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wx0.c0 f450523f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f450524g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nx0.w f450525h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(wx0.c0 c0Var, yz5.a aVar, nx0.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f450523f = c0Var;
        this.f450524g = aVar;
        this.f450525h = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        wx0.p pVar = new wx0.p(this.f450523f, this.f450524g, this.f450525h, continuation);
        pVar.f450522e = obj;
        return pVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wx0.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f450521d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        wx0.c0 c0Var = this.f450523f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                nx0.w wVar = this.f450525h;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                yx0.b8 b8Var = c0Var.f450459g;
                this.f450521d = 1;
                if (b8Var.s0(wVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        if (((jz5.f0) m521constructorimpl) == null) {
            db5.t7.g(c0Var.f331814d.getContext(), c0Var.f331814d.getContext().getString(com.tencent.mm.R.string.htc));
        }
        this.f450524g.invoke();
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        com.tencent.maas.camstudio.MJBeautyAdjustmentDesc beautyDesc = c0Var.f450459g.V;
        yy0.m7 m7Var = (yy0.m7) l0Var;
        m7Var.getClass();
        kotlin.jvm.internal.o.g(beautyDesc, "beautyDesc");
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.s6(m7Var, beautyDesc, null), 3, null);
        return f0Var;
    }
}
