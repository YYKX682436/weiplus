package yn1;

/* loaded from: classes9.dex */
public final class o2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f463781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f463782e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(yn1.r2 r2Var, long j17) {
        super(1);
        this.f463781d = r2Var;
        this.f463782e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.w("MM.Mig.MigrationPlatformImpl", "[startBLEScanningAsync] coroutine cancelled");
        com.tencent.wechat.aff.migration.g gVar = this.f463781d.f463810a;
        if (gVar != null) {
            gVar.x(this.f463782e, false);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("callback");
        throw null;
    }
}
