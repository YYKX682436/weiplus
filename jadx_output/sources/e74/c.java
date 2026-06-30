package e74;

/* loaded from: classes4.dex */
public class c implements e74.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f249959a;

    public c(e74.i iVar, java.lang.String str) {
        this.f249959a = str;
    }

    @Override // e74.j
    public void a(int i17, java.lang.String str, java.util.List list) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$3");
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.w("SnsAd.DynamicUpdate", "doUpdateAdFinderLivingProduct, resp failed, respSnsId=" + str + ", errCode=" + i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$3");
            return;
        }
        if (list == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.DynamicUpdate", "doUpdateAdFinderLivingProduct, data==null, respSnsId=" + str + ", errCode=" + i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$3");
            return;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            r45.a3 a3Var = (r45.a3) it.next();
            if (a3Var.f369690d == 10) {
                java.lang.String str2 = a3Var.f369691e;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str2 == null) {
                    str2 = "";
                }
                com.tencent.mars.xlog.Log.i("SnsAd.DynamicUpdate", "doUpdateAdFinderLivingProduct, respSnsId=" + str + ", resp=" + str2);
                if (str != null) {
                    i64.y.f289357d.a(str, str2);
                }
                z17 = true;
            }
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.e("SnsAd.DynamicUpdate", "doUpdateAdFinderLivingProduct, resp no productItem, snsId=" + this.f249959a);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$3");
    }
}
