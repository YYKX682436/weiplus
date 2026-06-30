package er0;

/* loaded from: classes12.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f255988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats f255989e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(long j17, com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats) {
        super(0);
        this.f255988d = j17;
        this.f255989e = accProcLifeStats;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long j17 = this.f255988d;
        if (1 <= j17 && j17 < 3600001) {
            com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats = this.f255989e;
            long accNotifyDispatchAvgCostMs = (accProcLifeStats.getAccNotifyDispatchAvgCostMs() * accProcLifeStats.getAccNotifyDispatchCount()) + j17;
            accProcLifeStats.setAccNotifyDispatchCount(accProcLifeStats.getAccNotifyDispatchCount() + 1);
            accProcLifeStats.setAccNotifyDispatchAvgCostMs(accNotifyDispatchAvgCostMs / accProcLifeStats.getAccNotifyDispatchCount());
        }
        return jz5.f0.f302826a;
    }
}
