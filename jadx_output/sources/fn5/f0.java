package fn5;

/* loaded from: classes4.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f264662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264663e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f264664f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(java.lang.String str, fn5.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f264663e = str;
        this.f264664f = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fn5.f0(this.f264663e, this.f264664f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fn5.f0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f264662d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f264662d = 1;
            obj = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new c01.xa(this.f264663e, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", "RelatedWordDataStore >> thread: " + java.lang.Thread.currentThread().getName() + ", res: " + booleanValue);
        fn5.n0 n0Var = this.f264664f;
        if (booleanValue) {
            n0Var.f264723f.setValue(fn5.o0.f264745f);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryReportProvider", "reportSearchIfDone >> 0, " + aq.o.f12920a + ", 0");
            if (!aq.o.f12920a) {
                f65.o.f259919h = 0;
                f65.o oVar = f65.o.f259912a;
                oVar.d(0);
                oVar.c(57);
            }
        } else {
            java.util.List list = fn5.n0.E;
            n0Var.O6();
        }
        return jz5.f0.f302826a;
    }
}
