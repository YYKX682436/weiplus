package s74;

/* loaded from: classes4.dex */
public final class g1 implements w64.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f404296a;

    public g1(s74.o2 o2Var) {
        this.f404296a = o2Var;
    }

    @Override // w64.k
    public final void a(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        android.widget.Button T;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIStateChange", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$mClickStateChangeListener$1");
        s74.o2 o2Var = this.f404296a;
        if (adClickActionInfo == null || o2Var.T() == null) {
            com.tencent.mars.xlog.Log.e(o2Var.j(), "adCardActionBtnInfo or mActionBtn is null, can not updateActionBtnTitle");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIStateChange", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$mClickStateChangeListener$1");
            return;
        }
        int i17 = adClickActionInfo.f162571b;
        if (i17 != 6) {
            if (i17 == 7) {
                java.lang.String str = adClickActionInfo.Q;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (T = o2Var.T()) != null) {
                    T.setText(str);
                }
            } else if (i17 == 13) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$updateAddFinderBtnInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
                o2Var.a0();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$updateAddFinderBtnInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
            } else if (i17 == 16 && o2Var.i() != null && adClickActionInfo.f162594m0 != null) {
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) o2Var.i();
                java.lang.String d17 = l44.d.d(ca4.z0.t0(snsInfo != null ? snsInfo.field_snsId : 0L), adClickActionInfo.f162594m0);
                kotlin.jvm.internal.o.d(d17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$updateNewOrderUI", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
                o2Var.d0(d17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$updateNewOrderUI", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
            }
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(adClickActionInfo.f162599p)) {
            android.widget.Button T2 = o2Var.T();
            if (T2 != null) {
                T2.setTextColor(-7829368);
            }
            android.widget.Button T3 = o2Var.T();
            if (T3 != null) {
                T3.setText(adClickActionInfo.f162599p);
            }
            android.widget.Button T4 = o2Var.T();
            if (T4 != null) {
                T4.setEnabled(false);
            }
            android.widget.Button T5 = o2Var.T();
            if (T5 != null) {
                s74.q4.f404513a.t(T5, false);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIStateChange", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$mClickStateChangeListener$1");
    }
}
