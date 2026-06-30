package ey2;

/* loaded from: classes8.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f257365d;

    /* renamed from: e, reason: collision with root package name */
    public int f257366e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f257367f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ey2.k0 f257368g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.d0 f257369h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.d0 f257370i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ey2.k0 k0Var, kotlin.jvm.internal.d0 d0Var, kotlin.jvm.internal.d0 d0Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f257368g = k0Var;
        this.f257369h = d0Var;
        this.f257370i = d0Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ey2.f0 f0Var = new ey2.f0(this.f257368g, this.f257369h, this.f257370i, continuation);
        f0Var.f257367f = obj;
        return f0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ey2.f0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        ey2.k0 k0Var;
        java.lang.Object a17;
        ey2.k0 k0Var2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f257366e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                k0Var = this.f257368g;
                kotlin.jvm.internal.d0 d0Var = this.f257369h;
                kotlin.jvm.internal.d0 d0Var2 = this.f257370i;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                db2.e4 e4Var = new db2.e4(d0Var.f310114d, d0Var2.f310114d);
                this.f257367f = k0Var;
                this.f257365d = k0Var;
                this.f257366e = 1;
                a17 = rm0.h.a(e4Var, 0L, null, this, 3, null);
                if (a17 == aVar) {
                    return aVar;
                }
                k0Var2 = k0Var;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ey2.k0 k0Var3 = (ey2.k0) this.f257365d;
                k0Var2 = (ey2.k0) this.f257367f;
                kotlin.ResultKt.throwOnFailure(obj);
                k0Var = k0Var3;
                a17 = obj;
            }
            k0Var.f257411e = (r45.ae3) a17;
            r45.ae3 ae3Var = k0Var2.f257411e;
            jz5.f0 f0Var2 = null;
            if (ae3Var != null) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(ae3Var.f369966d)) {
                    k0Var2.f257411e = null;
                    com.tencent.mars.xlog.Log.i("Finder.GlobalLocationVM", "Get Location Fail");
                } else {
                    java.lang.String str = ae3Var.f369967e;
                    if (str == null) {
                        str = "";
                    }
                    ae3Var.f369967e = str;
                    java.lang.String str2 = ae3Var.f369968f;
                    if (str2 == null) {
                        str2 = "";
                    }
                    ae3Var.f369968f = str2;
                    com.tencent.mars.xlog.Log.i("Finder.GlobalLocationVM", "Get Location " + ae3Var.f369966d + ' ' + ae3Var.f369967e + ' ' + ae3Var.f369968f);
                }
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.tencent.mars.xlog.Log.i("Finder.GlobalLocationVM", "Get Location Fail");
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.GlobalLocationVM", m524exceptionOrNullimpl, "", new java.lang.Object[0]);
        }
        return f0Var;
    }
}
