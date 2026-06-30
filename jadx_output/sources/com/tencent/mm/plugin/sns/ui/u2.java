package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes5.dex */
public class u2 extends com.tencent.mm.plugin.sns.ui.x6 {
    @Override // com.tencent.mm.plugin.sns.ui.xk, android.widget.ExpandableListAdapter
    public int getGroupCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGroupCount", "com.tencent.mm.plugin.sns.ui.FinderPrivacyLabelUIAdapter");
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128059zb).getValue()).r()).intValue() == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGroupCount", "com.tencent.mm.plugin.sns.ui.FinderPrivacyLabelUIAdapter");
            return 5;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGroupCount", "com.tencent.mm.plugin.sns.ui.FinderPrivacyLabelUIAdapter");
        return 4;
    }
}
