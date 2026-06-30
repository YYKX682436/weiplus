package k64;

/* loaded from: classes4.dex */
public class p extends k64.a {
    public p(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        J(new r45.do3(), new r45.eo3(), "/cgi-bin/mmoc-bin/adplayinfo/send_ad_coupon", 4743, str, str2, str3, str4);
    }

    @Override // k64.a
    public void H(r45.mr5 mr5Var, java.lang.Object[] objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillRequestParam", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdCouponCard");
        r45.do3 do3Var = (r45.do3) mr5Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillRequestParam", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdCouponCard");
        if (do3Var == null || a84.b0.d(objArr)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillRequestParam", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdCouponCard");
        } else {
            for (int i17 = 0; i17 < objArr.length; i17++) {
                java.lang.Object obj = objArr[i17];
                if (obj instanceof java.lang.String) {
                    if (i17 == 0) {
                        do3Var.f372616d = (java.lang.String) obj;
                    } else if (i17 == 1) {
                        do3Var.f372617e = (java.lang.String) obj;
                    } else if (i17 == 2) {
                        do3Var.f372618f = (java.lang.String) obj;
                    } else if (i17 == 3) {
                        do3Var.f372619g = (java.lang.String) obj;
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestPrintOut", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdCouponCard");
            android.text.TextUtils.isEmpty(do3Var.f372616d);
            android.text.TextUtils.isEmpty(do3Var.f372617e);
            android.text.TextUtils.isEmpty(do3Var.f372618f);
            android.text.TextUtils.isEmpty(do3Var.f372619g);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestPrintOut", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdCouponCard");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillRequestParam", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdCouponCard");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillRequestParam", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdCouponCard");
    }
}
