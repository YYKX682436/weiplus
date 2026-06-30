package df2;

/* loaded from: classes3.dex */
public final class e00 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f230015d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f230016e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f230017f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f230018g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f230019h;

    /* renamed from: i, reason: collision with root package name */
    public int f230020i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f230021m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ df2.m00 f230022n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e00(kotlinx.coroutines.q qVar, df2.m00 m00Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230021m = qVar;
        this.f230022n = m00Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.e00(this.f230021m, this.f230022n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.e00) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        v65.n nVar;
        com.tencent.mm.view.MMPAGView c76;
        com.tencent.mm.view.MMPAGView mMPAGView;
        df2.m00 m00Var;
        com.tencent.mm.view.MMPAGView mMPAGView2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230020i;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            nVar = new v65.n(this.f230021m);
            df2.m00 m00Var2 = this.f230022n;
            if (m00Var2.f230741n.size() > 1) {
                c76 = m00Var2.c7();
                if (c76 != null) {
                    if (c76.getUseRfx()) {
                        this.f230015d = nVar;
                        this.f230016e = c76;
                        this.f230017f = m00Var2;
                        this.f230018g = c76;
                        this.f230019h = c76;
                        this.f230020i = 1;
                        java.lang.Object a76 = df2.m00.a7(m00Var2, 1, this);
                        if (a76 == aVar) {
                            return aVar;
                        }
                        mMPAGView2 = c76;
                        m00Var = m00Var2;
                        obj = a76;
                        mMPAGView2.setComposition((com.tencent.mm.rfx.RfxPagFile) obj);
                    } else {
                        this.f230015d = nVar;
                        this.f230016e = c76;
                        this.f230017f = m00Var2;
                        this.f230018g = c76;
                        this.f230019h = c76;
                        this.f230020i = 2;
                        java.lang.Object Z6 = df2.m00.Z6(m00Var2, 1, this);
                        if (Z6 == aVar) {
                            return aVar;
                        }
                        mMPAGView = c76;
                        m00Var = m00Var2;
                        obj = Z6;
                        mMPAGView.setComposition((org.libpag.PAGFile) obj);
                    }
                }
            } else {
                df2.m00.b7(m00Var2);
                nVar.a(f0Var);
            }
            return f0Var;
        }
        if (i17 == 1) {
            mMPAGView2 = (com.tencent.mm.view.MMPAGView) this.f230019h;
            c76 = (com.tencent.mm.view.MMPAGView) this.f230018g;
            m00Var = (df2.m00) this.f230017f;
            nVar = (v65.n) this.f230015d;
            kotlin.ResultKt.throwOnFailure(obj);
            mMPAGView2.setComposition((com.tencent.mm.rfx.RfxPagFile) obj);
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mMPAGView = (com.tencent.mm.view.MMPAGView) this.f230019h;
            c76 = (com.tencent.mm.view.MMPAGView) this.f230018g;
            m00Var = (df2.m00) this.f230017f;
            nVar = (v65.n) this.f230015d;
            kotlin.ResultKt.throwOnFailure(obj);
            mMPAGView.setComposition((org.libpag.PAGFile) obj);
        }
        c76.d();
        c76.setRepeatCount(1);
        c76.setProgress(0.0d);
        c76.g();
        c76.a(new df2.d00(c76, m00Var, nVar));
        return f0Var;
    }
}
