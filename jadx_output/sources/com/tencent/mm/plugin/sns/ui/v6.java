package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class v6 extends zd4.m {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f170622e;

    public v6(java.lang.ref.WeakReference weakReference) {
        super(weakReference);
        this.f170622e = weakReference;
    }

    @Override // zd4.m, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$NewSnsLabelNetCallback");
        com.tencent.mars.xlog.Log.i("MicroMsg.NewSnsLabelUI", "[onSceneEnd]errType:%d errCode:%d errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        java.lang.ref.WeakReference weakReference = this.f170622e;
        if (weakReference == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewSnsLabelUI", "[onSceneEnd] WeakRef null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$NewSnsLabelNetCallback");
            return;
        }
        com.tencent.mm.plugin.sns.ui.NewSnsLabelUI newSnsLabelUI = (com.tencent.mm.plugin.sns.ui.NewSnsLabelUI) weakReference.get();
        if (newSnsLabelUI == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewSnsLabelUI", "[onSceneEnd] activity null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$NewSnsLabelNetCallback");
            return;
        }
        super.onSceneEnd(i17, i18, str, m1Var);
        int i19 = com.tencent.mm.plugin.sns.ui.NewSnsLabelUI.P;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isInTransforming", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        boolean z17 = newSnsLabelUI.f170687u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInTransforming", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewSnsLabelUI", "[onSceneEnd] but not isInTransform");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$NewSnsLabelNetCallback");
            return;
        }
        if (m1Var.getType() == 218) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateInTransform", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            newSnsLabelUI.f170687u = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateInTransform", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            if (m1Var instanceof com.tencent.mm.plugin.sns.model.q2) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                boolean z18 = newSnsLabelUI.E;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                if (z18) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                    newSnsLabelUI.l7();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                    if (i17 == 0 && i18 == 0) {
                        long M = ((com.tencent.mm.plugin.sns.model.q2) m1Var).M();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                        java.lang.Long l17 = newSnsLabelUI.G;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                        if (M == l17.longValue()) {
                            newSnsLabelUI.finish();
                            db5.t7.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490586z7));
                        }
                    } else {
                        newSnsLabelUI.finish();
                        db5.t7.g(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.j_d));
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$NewSnsLabelNetCallback");
    }
}
