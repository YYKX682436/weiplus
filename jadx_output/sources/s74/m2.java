package s74;

/* loaded from: classes4.dex */
public final class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.dc f404422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f404423e;

    public m2(zy2.dc dcVar, s74.o2 o2Var) {
        this.f404422d = dcVar;
        this.f404423e = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$updateAddFinderBtnInfo$1$1");
        s74.o2 o2Var = this.f404423e;
        zy2.dc dcVar = this.f404422d;
        if (dcVar != null) {
            int i17 = ((ya2.b2) dcVar).field_follow_Flag;
            com.tencent.mars.xlog.Log.i(o2Var.j(), "getFinderContact, followFlg=" + i17 + ", userName=" + ((ya2.b2) dcVar).D0());
            o2Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateAddFinderBtnText", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
            if (i17 == 0) {
                android.widget.Button T = o2Var.T();
                if (T != null) {
                    com.tencent.mm.plugin.sns.storage.ADXml.AdCardActionBtnInfo U = o2Var.U();
                    T.setText(U != null ? U.btnTitle : null);
                }
            } else {
                android.widget.Button T2 = o2Var.T();
                if (T2 != null) {
                    com.tencent.mm.plugin.sns.storage.ADXml.AdCardActionBtnInfo U2 = o2Var.U();
                    if (U2 != null && (adClickActionInfo = U2.clickActionInfo) != null) {
                        r6 = adClickActionInfo.f162588j0;
                    }
                    T2.setText(r6);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateAddFinderBtnText", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        } else {
            com.tencent.mars.xlog.Log.e(o2Var.j(), "getFinderContact, iLocalFinderContact==null");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$updateAddFinderBtnInfo$1$1");
    }
}
