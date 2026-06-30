package lh;

/* loaded from: classes12.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.battery.accumulate.AccPowerStats f318601d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.matrix.battery.accumulate.AccPowerStats accPowerStats) {
        super(0);
        this.f318601d = accPowerStats;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("accStatsPower ");
        com.tencent.matrix.battery.accumulate.AccPowerStats accPowerStats = this.f318601d;
        sb6.append(accPowerStats.getAccName());
        sb6.append(": ");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("accStatsMeta ");
        sb7.append(accPowerStats.getAccName());
        sb7.append(": count=");
        sb7.append(accPowerStats.getAccCount());
        sb7.append(",pidJiffies=");
        sb7.append(accPowerStats.getAccPidJiffies());
        sb7.append(",uidJiffies=");
        sb7.append(accPowerStats.getAccUidJiffies());
        sb7.append("");
        int i17 = 0;
        for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String, java.lang.Double>> entry : accPowerStats.getAccPowerStats().entrySet()) {
            java.lang.String key = entry.getKey();
            java.util.Map<java.lang.String, java.lang.Double> value = entry.getValue();
            if (r26.i0.A(key, "power-", false, 2, null)) {
                java.lang.String substring = key.substring(r26.n0.L(key, "power-", 0, false, 6, null) + 6);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                for (java.util.Map.Entry<java.lang.String, java.lang.Double> entry2 : value.entrySet()) {
                    java.lang.String key2 = entry2.getKey();
                    double doubleValue = entry2.getValue().doubleValue();
                    if (kotlin.jvm.internal.o.b(key2, "power")) {
                        sb6.append(i17 == 0 ? "" : ",");
                        sb6.append(substring);
                        sb6.append("Power=");
                        sb6.append(uh.i.p(doubleValue, 2));
                    } else {
                        sb7.append(",");
                        sb7.append(substring);
                        sb7.append(ri.i.a(key2));
                        sb7.append("=");
                        sb7.append((long) doubleValue);
                    }
                }
            }
            i17++;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PowerAccMonitor", sb6.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.PowerAccMonitor", sb7.toString());
        return jz5.f0.f302826a;
    }
}
