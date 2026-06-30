package er0;

/* loaded from: classes12.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats f255958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f255959e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats, long j17) {
        super(0);
        this.f255958d = accProcLifeStats;
        this.f255959e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats = this.f255958d;
        long accCheckAliveCount = accProcLifeStats.getAccCheckAliveCount();
        long j17 = this.f255959e;
        if (accCheckAliveCount < j17) {
            accProcLifeStats.setAccCheckAliveCount(j17);
        }
        return jz5.f0.f302826a;
    }
}
