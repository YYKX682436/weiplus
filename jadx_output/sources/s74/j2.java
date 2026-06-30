package s74;

/* loaded from: classes4.dex */
public final class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f404364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f404365e;

    public j2(com.tencent.mm.storage.z3 z3Var, s74.o2 o2Var) {
        this.f404364d = z3Var;
        this.f404365e = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$updateActionBtnText$1$1");
        s74.o2 o2Var = this.f404365e;
        com.tencent.mm.storage.z3 z3Var = this.f404364d;
        if (z3Var == null || !z3Var.r2()) {
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
                    r2 = adClickActionInfo.Q;
                }
                T2.setText(r2);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$updateActionBtnText$1$1");
    }
}
