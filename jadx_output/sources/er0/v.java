package er0;

/* loaded from: classes12.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats f255994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255995e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats, java.lang.String str) {
        super(0);
        this.f255994d = accProcLifeStats;
        this.f255995e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Map asMutable;
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats = this.f255994d;
        asMutable = accProcLifeStats.asMutable(accProcLifeStats.getAccRecycleAbortGroup());
        java.util.Map<java.lang.String, java.lang.Integer> accRecycleAbortGroup = accProcLifeStats.getAccRecycleAbortGroup();
        java.lang.String str = this.f255995e;
        java.lang.Integer num = accRecycleAbortGroup.get(str);
        if (num == null) {
            num = 0;
        }
        asMutable.put(str, java.lang.Integer.valueOf(num.intValue() + 1));
        return jz5.f0.f302826a;
    }
}
