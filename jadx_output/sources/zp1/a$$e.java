package zp1;

/* loaded from: classes12.dex */
public final /* synthetic */ class a$$e implements vh.x {
    @Override // vh.x
    public final java.util.List a(java.util.List list) {
        int i17 = com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity.f93827m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.matrix.batterycanary.stats.BatteryRecord batteryRecord = (com.tencent.matrix.batterycanary.stats.BatteryRecord) it.next();
            if (batteryRecord instanceof com.tencent.matrix.batterycanary.stats.BatteryRecord.EventStatRecord) {
                com.tencent.matrix.batterycanary.stats.BatteryRecord.EventStatRecord eventStatRecord = (com.tencent.matrix.batterycanary.stats.BatteryRecord.EventStatRecord) batteryRecord;
                if ("BATTERY_STAT".equals(eventStatRecord.f52604g) && eventStatRecord.f52605h.containsKey("battery-temp")) {
                    arrayList.add(batteryRecord);
                }
            }
        }
        return arrayList;
    }
}
