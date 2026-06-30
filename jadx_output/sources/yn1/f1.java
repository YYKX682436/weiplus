package yn1;

/* loaded from: classes9.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f463663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f463664e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(yn1.r2 r2Var, long j17) {
        super(1);
        this.f463663d = r2Var;
        this.f463664e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.w("MM.Mig.MigrationPlatformImpl", "[sendBLEMessageAsync] coroutine cancelled");
        com.tencent.wechat.aff.migration.g gVar = this.f463663d.f463810a;
        if (gVar != null) {
            gVar.G(this.f463664e, false);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("callback");
        throw null;
    }
}
