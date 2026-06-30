package gi;

/* loaded from: classes12.dex */
public final /* synthetic */ class u0$$d0 implements r.a {
    @Override // r.a
    public final java.lang.Object apply(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        java.lang.String str3;
        java.lang.String str4;
        m3.d dVar = (m3.d) obj;
        java.lang.String str5 = (java.lang.String) dVar.f323092a;
        android.os.health.HealthStats healthStats = (android.os.health.HealthStats) dVar.f323093b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int measurementKeyCount = healthStats.getMeasurementKeyCount();
        int i18 = 0;
        while (true) {
            str = "";
            str2 = ",";
            if (i18 >= measurementKeyCount) {
                break;
            }
            int measurementKeyAt = healthStats.getMeasurementKeyAt(i18);
            if (healthStats.hasMeasurement(measurementKeyAt)) {
                long measurement = healthStats.getMeasurement(measurementKeyAt);
                sb6.append(sb6.length() != 0 ? "," : "");
                sb6.append(measurementKeyAt);
                sb6.append("=");
                sb6.append(measurement);
            }
            i18++;
        }
        if (sb6.length() > 0) {
            com.tencent.mars.xlog.Log.i("HealthStatsHelper", healthStats.getDataType() + " " + str5 + " measure: " + ((java.lang.Object) sb6));
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        int measurementsKeyCount = healthStats.getMeasurementsKeyCount();
        for (int i19 = 0; i19 < measurementsKeyCount; i19++) {
            int measurementsKeyAt = healthStats.getMeasurementsKeyAt(i19);
            if (healthStats.hasMeasurements(measurementsKeyAt)) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry : healthStats.getMeasurements(measurementsKeyAt).entrySet()) {
                    sb8.append(sb8.length() == 0 ? "" : ",");
                    sb8.append(entry.getKey());
                    sb8.append("=");
                    sb8.append(entry.getValue());
                }
                sb7.append(sb7.length() == 0 ? "" : ",");
                sb7.append(measurementsKeyAt);
                sb7.append("=");
                sb7.append("[");
                sb7.append((java.lang.CharSequence) sb8);
                sb7.append("]");
            }
        }
        if (sb7.length() > 0) {
            com.tencent.mars.xlog.Log.i("HealthStatsHelper", healthStats.getDataType() + " " + str5 + " measureList: " + ((java.lang.Object) sb7));
        }
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
        int timerKeyCount = healthStats.getTimerKeyCount();
        for (int i27 = 0; i27 < timerKeyCount; i27++) {
            int timerKeyAt = healthStats.getTimerKeyAt(i27);
            if (healthStats.hasTimer(timerKeyAt)) {
                android.os.health.TimerStat timer = healthStats.getTimer(timerKeyAt);
                sb9.append(sb9.length() == 0 ? "" : ",");
                sb9.append(timerKeyAt);
                sb9.append("=");
                sb9.append(timer.getCount());
                sb9.append(":");
                sb9.append(timer.getTime());
            }
        }
        if (sb9.length() > 0) {
            com.tencent.mars.xlog.Log.i("HealthStatsHelper", healthStats.getDataType() + " " + str5 + " timer: " + ((java.lang.Object) sb9));
        }
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
        int timersKeyCount = healthStats.getTimersKeyCount();
        int i28 = 0;
        while (i28 < timersKeyCount) {
            int timersKeyAt = healthStats.getTimersKeyAt(i28);
            if (healthStats.hasTimers(timersKeyAt)) {
                java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                for (java.util.Map.Entry<java.lang.String, android.os.health.TimerStat> entry2 : healthStats.getTimers(timersKeyAt).entrySet()) {
                    int i29 = timersKeyCount;
                    sb11.append(sb11.length() == 0 ? str : str2);
                    sb11.append(entry2.getKey());
                    sb11.append("=");
                    sb11.append(entry2.getValue().getCount());
                    sb11.append(":");
                    sb11.append(entry2.getValue().getTime());
                    timersKeyCount = i29;
                    str = str;
                    str2 = str2;
                }
                i17 = timersKeyCount;
                str3 = str;
                str4 = str2;
                sb10.append(sb10.length() == 0 ? str3 : str4);
                sb10.append(timersKeyAt);
                sb10.append("=");
                sb10.append("[");
                sb10.append((java.lang.CharSequence) sb11);
                sb10.append("]");
            } else {
                i17 = timersKeyCount;
                str3 = str;
                str4 = str2;
            }
            i28++;
            timersKeyCount = i17;
            str = str3;
            str2 = str4;
        }
        if (sb10.length() > 0) {
            com.tencent.mars.xlog.Log.i("HealthStatsHelper", healthStats.getDataType() + " " + str5 + " timerList: " + ((java.lang.Object) sb10));
        }
        return java.lang.Boolean.FALSE;
    }
}
