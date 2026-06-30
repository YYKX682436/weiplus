package zd4;

/* loaded from: classes4.dex */
public class m implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f471638d;

    public m(java.lang.ref.WeakReference weakReference) {
        this.f471638d = weakReference;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$BaseSelectVisibleRangeNetCallback");
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "dz:[onSceneEnd]errType:%d errCode:%d errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        java.lang.ref.WeakReference weakReference = this.f471638d;
        if (weakReference == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "[onSceneEnd] WeakRef null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$BaseSelectVisibleRangeNetCallback");
            return;
        }
        com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI baseSelectVisibleRangeUI = (com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI) weakReference.get();
        if (baseSelectVisibleRangeUI == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "[onSceneEnd] activity null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$BaseSelectVisibleRangeNetCallback");
            return;
        }
        int i19 = com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI.D;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        boolean z17 = baseSelectVisibleRangeUI.f170687u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$BaseSelectVisibleRangeNetCallback");
            return;
        }
        int type = m1Var.getType();
        if (type != 290) {
            if (type != 635) {
                if (type == 638) {
                    if (i17 == 0 && i18 == 0) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                        throw null;
                    }
                    com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI.U6(baseSelectVisibleRangeUI);
                    com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "dz: error at modify label list!");
                }
            } else if (i17 == 0 && i18 == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addContactToLabels", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                java.util.ArrayList arrayList = baseSelectVisibleRangeUI.B;
                if (arrayList != null && arrayList.size() != 0) {
                    baseSelectVisibleRangeUI.B.iterator();
                    throw null;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addContactToLabels", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            } else {
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI.U6(baseSelectVisibleRangeUI);
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "dz: error at add contact label!");
            }
        } else if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "[onSceneEnd] delete tag list success");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "dz: error at delete tag list!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$BaseSelectVisibleRangeNetCallback");
    }
}
