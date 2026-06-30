package yn1;

/* loaded from: classes11.dex */
public final class o1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f463778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f463779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f463780f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(yn1.r2 r2Var, java.lang.String str, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463778d = r2Var;
        this.f463779e = str;
        this.f463780f = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.o1(this.f463778d, this.f463779e, this.f463780f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yn1.o1 o1Var = (yn1.o1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        o1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.wechat.aff.migration.g gVar;
        long j17 = this.f463780f;
        yn1.r2 r2Var = this.f463778d;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            kotlinx.coroutines.flow.i2 i2Var = yn1.r2.f463809f;
            r2Var.a().d(this.f463779e);
            com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[disconnectDeviceAsync] success=true");
            gVar = r2Var.f463810a;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationPlatformImpl", "[disconnectDeviceAsync] error", e17);
            com.tencent.wechat.aff.migration.g gVar2 = r2Var.f463810a;
            if (gVar2 == null) {
                kotlin.jvm.internal.o.o("callback");
                throw null;
            }
            gVar2.i(j17, false);
        }
        if (gVar != null) {
            gVar.i(j17, true);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("callback");
        throw null;
    }
}
