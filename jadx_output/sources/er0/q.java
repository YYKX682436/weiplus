package er0;

/* loaded from: classes12.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f255984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats f255985e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(long j17, com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats) {
        super(0);
        this.f255984d = j17;
        this.f255985e = accProcLifeStats;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        java.util.Map asMutable;
        long j17 = this.f255984d;
        if (1 <= j17 && j17 < 3600001) {
            com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats = this.f255985e;
            int intValue = ((java.lang.Number) accProcLifeStats.getAccMsgNotifyCost().f302833d).intValue();
            int i18 = intValue + 1;
            accProcLifeStats.setAccMsgNotifyCost(new jz5.l(java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(((((java.lang.Number) accProcLifeStats.getAccMsgNotifyCost().f302834e).longValue() * intValue) + j17) / i18)));
            if (0 <= j17 && j17 < 1001) {
                i17 = 1;
            } else {
                if (1001 <= j17 && j17 < 5001) {
                    i17 = 2;
                } else {
                    if (5001 <= j17 && j17 < 10001) {
                        i17 = 3;
                    } else {
                        if (10001 <= j17 && j17 < 30001) {
                            i17 = 4;
                        } else {
                            if (30001 <= j17 && j17 < 60001) {
                                i17 = 5;
                            } else {
                                if (60001 <= j17 && j17 < 300001) {
                                    i17 = 6;
                                } else {
                                    if (300001 <= j17 && j17 < 600001) {
                                        i17 = 7;
                                    } else {
                                        i17 = (600001L > j17 ? 1 : (600001L == j17 ? 0 : -1)) <= 0 && (j17 > 1800001L ? 1 : (j17 == 1800001L ? 0 : -1)) < 0 ? 8 : 9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            asMutable = accProcLifeStats.asMutable(accProcLifeStats.getAccMsgNotifyCostLevel());
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Integer num = accProcLifeStats.getAccMsgNotifyCostLevel().get(java.lang.Integer.valueOf(i17));
            if (num == null) {
                num = 0;
            }
            asMutable.put(valueOf, java.lang.Integer.valueOf(num.intValue() + 1));
        }
        return jz5.f0.f302826a;
    }
}
