package vh;

/* loaded from: classes12.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final vh.t f436825a;

    /* renamed from: f, reason: collision with root package name */
    public vh.x f436830f;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Handler f436827c = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public int f436828d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f436829e = "";

    /* renamed from: b, reason: collision with root package name */
    public final int f436826b = 7;

    public y(vh.t tVar) {
        this.f436825a = tVar;
    }

    public vh.f a(int i17) {
        java.util.List list = this.f436825a.f436819d;
        for (int i18 = i17; i18 >= 0; i18--) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (i17 < arrayList.size() && (arrayList.get(i18) instanceof vh.f)) {
                return (vh.f) arrayList.get(i18);
            }
        }
        return null;
    }

    public void b() {
        if (android.text.TextUtils.isEmpty(this.f436829e)) {
            oj.j.f("Matrix.battery.loader", "Call #reset first!", new java.lang.Object[0]);
        } else {
            ph.a.b(com.tencent.matrix.batterycanary.stats.k.class, new vh.u(this, this.f436828d));
        }
    }

    public vh.h c(com.tencent.matrix.batterycanary.stats.BatteryRecord batteryRecord) {
        java.lang.String str;
        if (batteryRecord instanceof com.tencent.matrix.batterycanary.stats.BatteryRecord.ProcStatRecord) {
            com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventLevel1Item batteryStatsAdapter$Item$EventLevel1Item = new com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventLevel1Item(batteryRecord);
            com.tencent.matrix.batterycanary.stats.BatteryRecord.ProcStatRecord procStatRecord = (com.tencent.matrix.batterycanary.stats.BatteryRecord.ProcStatRecord) batteryRecord;
            int i17 = procStatRecord.f52606f;
            if (i17 == 1) {
                str = "PROCESS_INIT";
            } else if (i17 != 2) {
                str = "PROCESS_ID_" + procStatRecord.f52606f;
            } else {
                str = "PROCESS_QUIT";
            }
            batteryStatsAdapter$Item$EventLevel1Item.f52628f = str + " (pid " + procStatRecord.f52607g + "）";
            return batteryStatsAdapter$Item$EventLevel1Item;
        }
        if (batteryRecord instanceof com.tencent.matrix.batterycanary.stats.BatteryRecord.AppStatRecord) {
            com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventLevel1Item batteryStatsAdapter$Item$EventLevel1Item2 = new com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventLevel1Item(batteryRecord);
            com.tencent.matrix.batterycanary.stats.BatteryRecord.AppStatRecord appStatRecord = (com.tencent.matrix.batterycanary.stats.BatteryRecord.AppStatRecord) batteryRecord;
            int i18 = appStatRecord.f52601f;
            if (i18 == 1) {
                batteryStatsAdapter$Item$EventLevel1Item2.f52628f = "App 切换到前台";
            } else if (i18 == 2) {
                batteryStatsAdapter$Item$EventLevel1Item2.f52628f = "App 切换到后台";
            } else if (i18 == 3) {
                batteryStatsAdapter$Item$EventLevel1Item2.f52628f = "App 切换到后台 (有前台服务)";
            } else if (i18 != 4) {
                batteryStatsAdapter$Item$EventLevel1Item2.f52628f = "App 状态变化: " + appStatRecord.f52601f;
            } else {
                batteryStatsAdapter$Item$EventLevel1Item2.f52628f = "App 切换到后台 (有浮窗)";
            }
            return batteryStatsAdapter$Item$EventLevel1Item2;
        }
        if (!(batteryRecord instanceof com.tencent.matrix.batterycanary.stats.BatteryRecord.DevStatRecord)) {
            if (batteryRecord instanceof com.tencent.matrix.batterycanary.stats.BatteryRecord.SceneStatRecord) {
                com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventLevel2Item batteryStatsAdapter$Item$EventLevel2Item = new com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventLevel2Item(batteryRecord);
                batteryStatsAdapter$Item$EventLevel2Item.f52629f = "UI: " + ((com.tencent.matrix.batterycanary.stats.BatteryRecord.SceneStatRecord) batteryRecord).f52620f;
                return batteryStatsAdapter$Item$EventLevel2Item;
            }
            if (batteryRecord instanceof com.tencent.matrix.batterycanary.stats.BatteryRecord.ReportRecord) {
                return new com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventDumpItem((com.tencent.matrix.batterycanary.stats.BatteryRecord.ReportRecord) batteryRecord);
            }
            if (batteryRecord instanceof com.tencent.matrix.batterycanary.stats.BatteryRecord.EventStatRecord) {
                com.tencent.matrix.batterycanary.stats.BatteryRecord.EventStatRecord eventStatRecord = (com.tencent.matrix.batterycanary.stats.BatteryRecord.EventStatRecord) batteryRecord;
                return "BATTERY_STAT".equals(eventStatRecord.f52604g) ? new com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventBatteryItem(eventStatRecord) : new com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventSimpleItem(eventStatRecord);
            }
            com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventLevel2Item batteryStatsAdapter$Item$EventLevel2Item2 = new com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventLevel2Item(batteryRecord);
            batteryStatsAdapter$Item$EventLevel2Item2.f52629f = "Unknown: ".concat(batteryRecord.getClass().getName());
            return batteryStatsAdapter$Item$EventLevel2Item2;
        }
        com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventLevel2Item batteryStatsAdapter$Item$EventLevel2Item3 = new com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventLevel2Item(batteryRecord);
        com.tencent.matrix.batterycanary.stats.BatteryRecord.DevStatRecord devStatRecord = (com.tencent.matrix.batterycanary.stats.BatteryRecord.DevStatRecord) batteryRecord;
        switch (devStatRecord.f52602f) {
            case 1:
                batteryStatsAdapter$Item$EventLevel2Item3.f52629f = "CHARGE_ON";
                return batteryStatsAdapter$Item$EventLevel2Item3;
            case 2:
                batteryStatsAdapter$Item$EventLevel2Item3.f52629f = "CHARGE_OFF";
                return batteryStatsAdapter$Item$EventLevel2Item3;
            case 3:
                batteryStatsAdapter$Item$EventLevel2Item3.f52629f = "SCREEN_OFF";
                return batteryStatsAdapter$Item$EventLevel2Item3;
            case 4:
                batteryStatsAdapter$Item$EventLevel2Item3.f52629f = "待机模式(Standby) ON";
                return batteryStatsAdapter$Item$EventLevel2Item3;
            case 5:
                batteryStatsAdapter$Item$EventLevel2Item3.f52629f = "SCREEN_ON";
                return batteryStatsAdapter$Item$EventLevel2Item3;
            case 6:
                batteryStatsAdapter$Item$EventLevel2Item3.f52629f = "待机模式(Standby) OFF";
                return batteryStatsAdapter$Item$EventLevel2Item3;
            case 7:
                batteryStatsAdapter$Item$EventLevel2Item3.f52629f = "低电耗模式(Doze) ON";
                return batteryStatsAdapter$Item$EventLevel2Item3;
            case 8:
                batteryStatsAdapter$Item$EventLevel2Item3.f52629f = "低电耗模式(Doze) OFF";
                return batteryStatsAdapter$Item$EventLevel2Item3;
            default:
                batteryStatsAdapter$Item$EventLevel2Item3.f52629f = "设备状态变化: " + devStatRecord.f52602f;
                return batteryStatsAdapter$Item$EventLevel2Item3;
        }
    }
}
