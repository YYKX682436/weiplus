package er0;

/* loaded from: classes12.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats f255977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f255978e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats, long j17) {
        super(0);
        this.f255977d = accProcLifeStats;
        this.f255978e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats = this.f255977d;
        accProcLifeStats.setAccMainProcStandByCount(accProcLifeStats.getAccMainProcStandByCount() + 1);
        accProcLifeStats.setAccMainProcStandbyMs(accProcLifeStats.getAccMainProcStandbyMs() + this.f255978e);
        return jz5.f0.f302826a;
    }
}
