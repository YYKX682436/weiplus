package yn1;

/* loaded from: classes11.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f463698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f463699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f463700f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f463701g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(yn1.r2 r2Var, java.lang.String str, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463699e = r2Var;
        this.f463700f = str;
        this.f463701g = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.i1(this.f463699e, this.f463700f, this.f463701g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yn1.i1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean booleanValue;
        com.tencent.wechat.aff.migration.g gVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f463698d;
        long j17 = this.f463701g;
        yn1.r2 r2Var = this.f463699e;
        boolean z17 = true;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                yn1.z0 z0Var = yn1.z0.f463933a;
                kotlinx.coroutines.flow.i2 i2Var = yn1.r2.f463809f;
                vn1.m a17 = r2Var.a();
                java.lang.String str = this.f463700f;
                this.f463698d = 1;
                obj = z0Var.b(a17, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            booleanValue = ((java.lang.Boolean) obj).booleanValue();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[connectToDeviceAsync] success=");
            sb6.append(booleanValue);
            com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", sb6.toString());
            gVar = r2Var.f463810a;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationPlatformImpl", "[connectToDeviceAsync] error", e17);
            com.tencent.wechat.aff.migration.g gVar2 = r2Var.f463810a;
            if (gVar2 == null) {
                kotlin.jvm.internal.o.o("callback");
                throw null;
            }
            gVar2.C(j17, false);
        }
        if (gVar == null) {
            kotlin.jvm.internal.o.o("callback");
            throw null;
        }
        if (!booleanValue) {
            z17 = false;
        }
        gVar.C(j17, z17);
        return jz5.f0.f302826a;
    }
}
