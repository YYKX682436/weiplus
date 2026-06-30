package sb4;

/* loaded from: classes4.dex */
public class d0 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter$9");
        java.util.Iterator it = sb4.z.a().entrySet().iterator();
        while (it.hasNext()) {
            sb4.e0 e0Var = (sb4.e0) ((java.util.Map.Entry) it.next()).getValue();
            android.os.Vibrator vibrator = ca4.z0.f40068a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPicReportNetworkType", "com.tencent.mm.plugin.sns.data.SnsUtil");
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (com.tencent.mars.comm.NetStatusUtil.is2G(context)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPicReportNetworkType", "com.tencent.mm.plugin.sns.data.SnsUtil");
                i17 = 1;
            } else if (com.tencent.mars.comm.NetStatusUtil.is3G(context)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPicReportNetworkType", "com.tencent.mm.plugin.sns.data.SnsUtil");
                i17 = 2;
            } else if (com.tencent.mars.comm.NetStatusUtil.is4G(context)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPicReportNetworkType", "com.tencent.mm.plugin.sns.data.SnsUtil");
                i17 = 3;
            } else if (com.tencent.mars.comm.NetStatusUtil.isWifi(context)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPicReportNetworkType", "com.tencent.mm.plugin.sns.data.SnsUtil");
                i17 = 4;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPicReportNetworkType", "com.tencent.mm.plugin.sns.data.SnsUtil");
                i17 = 0;
            }
            e0Var.f405488g = i17;
            e0Var.f405483b.size();
            java.util.Iterator it6 = e0Var.f405484c.iterator();
            java.lang.String str = "";
            java.lang.String str2 = "";
            while (it6.hasNext()) {
                str2 = str2 + ((java.lang.Integer) it6.next()) + "|";
            }
            if (str2.length() >= 2) {
                str2 = str2.substring(0, str2.length() - 1);
            }
            java.lang.String str3 = str2;
            java.util.Iterator it7 = e0Var.f405485d.iterator();
            java.lang.String str4 = "";
            while (it7.hasNext()) {
                str4 = str4 + ((java.lang.Integer) it7.next()) + "|";
            }
            java.lang.String substring = str4.length() >= 2 ? str4.substring(0, str4.length() - 1) : str4;
            java.util.Iterator it8 = e0Var.f405486e.iterator();
            while (it8.hasNext()) {
                str = str + ((java.lang.Integer) it8.next()) + "|";
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11599, java.lang.Integer.valueOf(e0Var.f405482a), java.lang.Integer.valueOf(e0Var.f405483b.size()), java.lang.Integer.valueOf(e0Var.f405487f), java.lang.Integer.valueOf(e0Var.f405488g), 0, e0Var.f405489h, java.lang.Long.valueOf(e0Var.f405490i), java.lang.Integer.valueOf(e0Var.f405491j), 0, 0, java.lang.Integer.valueOf(e0Var.f405492k), java.lang.Integer.valueOf(e0Var.f405493l), 0, str3, substring, str.length() >= 2 ? str.substring(0, str.length() - 1) : str, 0, "", java.lang.Integer.valueOf(e0Var.f405494m));
        }
        sb4.z.a().clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter$9");
    }
}
