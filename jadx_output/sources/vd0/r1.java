package vd0;

/* loaded from: classes8.dex */
public final class r1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f435494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vd0.v1 f435495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f435496f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wd0.h2 f435497g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(vd0.v1 v1Var, kotlinx.coroutines.y0 y0Var, wd0.h2 h2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f435495e = v1Var;
        this.f435496f = y0Var;
        this.f435497g = h2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vd0.r1(this.f435495e, this.f435496f, this.f435497g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vd0.r1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f435494d;
        kotlinx.coroutines.y0 lifecycleScope = this.f435496f;
        vd0.v1 v1Var = this.f435495e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.f1 Bi = v1Var.Bi(lifecycleScope, false);
            this.f435494d = 1;
            obj = ((kotlinx.coroutines.g1) Bi).k(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.feature.setting.api.FingerprintVerifyParam fingerprintVerifyParam = (com.tencent.mm.feature.setting.api.FingerprintVerifyParam) obj;
        com.tencent.mars.xlog.Log.i("SettingFingerprintService", "[fingerprint login] initSoter getAllParam onResult errCode: " + fingerprintVerifyParam.f67820g + ", askInfo: " + fingerprintVerifyParam.f67817d);
        int i18 = fingerprintVerifyParam.f67820g;
        jz5.f0 f0Var = jz5.f0.f302826a;
        wd0.h2 h2Var = this.f435497g;
        if (i18 != 0) {
            wd0.d1[] d1VarArr = wd0.d1.f444702d;
            ((com.tencent.mm.plugin.account.ui.t6) h2Var).a(3, "");
            return f0Var;
        }
        vd0.q1 q1Var = new vd0.q1(h2Var);
        v1Var.getClass();
        kotlin.jvm.internal.o.g(lifecycleScope, "lifecycleScope");
        kotlinx.coroutines.l.d(lifecycleScope, null, null, new vd0.p1(q1Var, null), 3, null);
        return f0Var;
    }
}
