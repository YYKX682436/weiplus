package er0;

/* loaded from: classes12.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f255955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats f255956e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(long j17, com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats) {
        super(0);
        this.f255955d = j17;
        this.f255956e = accProcLifeStats;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long j17 = this.f255955d;
        if (j17 >= 60000) {
            com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats = this.f255956e;
            long accBgAvgDuringMs = (accProcLifeStats.getAccBgAvgDuringMs() * accProcLifeStats.getAccBgCount()) + j17;
            accProcLifeStats.setAccBgCount(accProcLifeStats.getAccBgCount() + 1);
            accProcLifeStats.setAccBgAvgDuringMs(accBgAvgDuringMs / accProcLifeStats.getAccBgCount());
        }
        return jz5.f0.f302826a;
    }
}
