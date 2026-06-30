package er0;

/* loaded from: classes12.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats f255982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255983e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats, java.lang.String str) {
        super(0);
        this.f255982d = accProcLifeStats;
        this.f255983e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Map asMutable;
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats = this.f255982d;
        asMutable = accProcLifeStats.asMutable(accProcLifeStats.getAccMsgNotifyAttrs());
        java.lang.String str = this.f255983e;
        java.lang.Object obj = asMutable.get(str);
        if (obj == null) {
            obj = 0;
        }
        asMutable.put(str, java.lang.Integer.valueOf(((java.lang.Number) obj).intValue() + 1));
        return jz5.f0.f302826a;
    }
}
