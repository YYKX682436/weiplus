package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes3.dex */
public abstract class oa {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f170091a = new java.util.HashMap();

    public static int a(int i17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAnimChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnimInfo");
        java.lang.Integer num = (java.lang.Integer) f170091a.get(i17 + "_" + j17);
        if (num == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAnimChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnimInfo");
            return 0;
        }
        int intValue = num.intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAnimChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnimInfo");
        return intValue;
    }

    public static void b(int i17, long j17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("putAnimChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnimInfo");
        f170091a.put(i17 + "_" + j17, java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putAnimChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnimInfo");
    }
}
