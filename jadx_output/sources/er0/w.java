package er0;

/* loaded from: classes12.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats f255996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f255997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f255998f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats, int i17, long j17) {
        super(0);
        this.f255996d = accProcLifeStats;
        this.f255997e = i17;
        this.f255998f = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List asMutable;
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats = this.f255996d;
        asMutable = accProcLifeStats.asMutable(accProcLifeStats.getAccRecycleAbortCostList());
        return java.lang.Boolean.valueOf(asMutable.add(new jz5.l(java.lang.Integer.valueOf(this.f255997e), java.lang.Long.valueOf(this.f255998f))));
    }
}
