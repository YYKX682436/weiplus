package er0;

/* loaded from: classes12.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f255992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats f255993e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(long j17, com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats) {
        super(0);
        this.f255992d = j17;
        this.f255993e = accProcLifeStats;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long j17 = this.f255992d;
        if (1 <= j17 && j17 < 3600001) {
            com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats = this.f255993e;
            long accPushStartUpAvgCostMs = (accProcLifeStats.getAccPushStartUpAvgCostMs() * accProcLifeStats.getAccPushStartUpCount()) + j17;
            accProcLifeStats.setAccPushStartUpCount(accProcLifeStats.getAccPushStartUpCount() + 1);
            accProcLifeStats.setAccPushStartUpAvgCostMs(accPushStartUpAvgCostMs / accProcLifeStats.getAccPushStartUpCount());
        }
        return jz5.f0.f302826a;
    }
}
