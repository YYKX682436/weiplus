package yn1;

/* loaded from: classes9.dex */
public final class k1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f463730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f463731e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f463732f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f463733g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f463734h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(java.lang.String str, java.lang.String str2, yn1.r2 r2Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463731e = str;
        this.f463732f = str2;
        this.f463733g = r2Var;
        this.f463734h = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.k1(this.f463731e, this.f463732f, this.f463733g, this.f463734h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yn1.k1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean booleanValue;
        com.tencent.wechat.aff.migration.g gVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f463730d;
        long j17 = this.f463734h;
        yn1.r2 r2Var = this.f463733g;
        boolean z17 = true;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                yn1.z0 z0Var = yn1.z0.f463933a;
                java.lang.String str = this.f463731e;
                java.lang.String str2 = this.f463732f;
                this.f463730d = 1;
                obj = z0Var.c(str, str2, this);
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
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[connectAsync] success=");
            sb6.append(booleanValue);
            com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", sb6.toString());
            gVar = r2Var.f463810a;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationPlatformImpl", "[connectAsync] error", e17);
            com.tencent.wechat.aff.migration.g gVar2 = r2Var.f463810a;
            if (gVar2 == null) {
                kotlin.jvm.internal.o.o("callback");
                throw null;
            }
            gVar2.a0(j17, false);
        }
        if (gVar == null) {
            kotlin.jvm.internal.o.o("callback");
            throw null;
        }
        if (!booleanValue) {
            z17 = false;
        }
        gVar.a0(j17, z17);
        return jz5.f0.f302826a;
    }
}
