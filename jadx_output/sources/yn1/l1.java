package yn1;

/* loaded from: classes9.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f463742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f463743e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(yn1.r2 r2Var, long j17) {
        super(1);
        this.f463742d = r2Var;
        this.f463743e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.w("MM.Mig.MigrationPlatformImpl", "[connectAsync] coroutine cancelled");
        com.tencent.wechat.aff.migration.g gVar = this.f463742d.f463810a;
        if (gVar != null) {
            gVar.a0(this.f463743e, false);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("callback");
        throw null;
    }
}
