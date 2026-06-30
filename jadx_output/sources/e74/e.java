package e74;

/* loaded from: classes4.dex */
public class e implements e74.j {
    public e(e74.i iVar) {
    }

    @Override // e74.j
    public void a(int i17, java.lang.String str, java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$5");
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.w("SnsAd.DynamicUpdate", "doUpdateDynamicFeedInfo, resp failed, respSnsId=" + str + ", errCode=" + i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$5");
            return;
        }
        if (list == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.DynamicUpdate", "doUpdateDynamicFeedInfo, data==null, respSnsId=" + str + ", errCode=" + i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$5");
            return;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.a3 a3Var = (r45.a3) it.next();
            if (a3Var.f369690d == 13) {
                java.lang.String str2 = a3Var.f369691e;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str2 == null) {
                    str2 = "";
                }
                com.tencent.mars.xlog.Log.i("SnsAd.DynamicUpdate", "doUpdateDynamicFeedInfo, respSnsId=" + str + ", resp=" + str2);
                if (str != null) {
                    i64.u.f289322d.a(str, str2);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$5");
    }
}
