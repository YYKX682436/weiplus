package er0;

/* loaded from: classes12.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f255950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats f255951e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(java.util.Map map, com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats) {
        super(0);
        this.f255950d = map;
        this.f255951e = accProcLifeStats;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Map asMutable;
        for (java.util.Map.Entry entry : this.f255950d.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            int intValue = ((java.lang.Number) entry.getValue()).intValue();
            com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats = this.f255951e;
            asMutable = accProcLifeStats.asMutable(accProcLifeStats.getAccNetWaitingGroup());
            java.lang.Integer num = accProcLifeStats.getAccNetWaitingGroup().get(str);
            if (num == null) {
                num = 0;
            }
            asMutable.put(str, java.lang.Integer.valueOf(num.intValue() + intValue));
        }
        return jz5.f0.f302826a;
    }
}
