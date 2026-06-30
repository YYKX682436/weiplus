package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes15.dex */
public class lk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsLabelUI f169869d;

    public lk(com.tencent.mm.plugin.sns.ui.SnsLabelUI snsLabelUI) {
        this.f169869d = snsLabelUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$11");
        com.tencent.mm.plugin.sns.ui.SnsLabelUI snsLabelUI = this.f169869d;
        com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(snsLabelUI).f4360h = com.tencent.mm.plugin.sns.ui.SnsLabelUI.Y6(snsLabelUI);
        if (com.tencent.mm.plugin.sns.ui.SnsLabelUI.X6(snsLabelUI) != null) {
            if (com.tencent.mm.plugin.sns.ui.SnsLabelUI.V6(snsLabelUI) == null) {
                com.tencent.mm.plugin.sns.ui.SnsLabelUI.W6(snsLabelUI, com.tencent.mm.plugin.sns.ui.SnsLabelUI.X6(snsLabelUI));
            } else {
                com.tencent.mm.plugin.sns.ui.SnsLabelUI.V6(snsLabelUI).addAll(com.tencent.mm.plugin.sns.ui.SnsLabelUI.X6(snsLabelUI));
            }
            java.util.Iterator it = com.tencent.mm.plugin.sns.ui.SnsLabelUI.X6(snsLabelUI).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(snsLabelUI).d((java.lang.String) it.next());
            }
            java.util.HashSet hashSet = new java.util.HashSet(com.tencent.mm.plugin.sns.ui.SnsLabelUI.V6(snsLabelUI));
            com.tencent.mm.plugin.sns.ui.SnsLabelUI.V6(snsLabelUI).clear();
            com.tencent.mm.plugin.sns.ui.SnsLabelUI.V6(snsLabelUI).addAll(hashSet);
            com.tencent.mm.plugin.sns.ui.SnsLabelUI.X6(snsLabelUI).clear();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            snsLabelUI.f167238z = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            hashSet.clear();
        }
        com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(snsLabelUI).h(com.tencent.mm.plugin.sns.ui.SnsLabelUI.V6(snsLabelUI));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        snsLabelUI.b7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(snsLabelUI).notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.SnsLabelUI.a7(snsLabelUI).d(com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(snsLabelUI).f4360h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = snsLabelUI.f167232t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        if (u3Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = snsLabelUI.f167232t;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            if (u3Var2.isShowing()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                com.tencent.mm.ui.widget.dialog.u3 u3Var3 = snsLabelUI.f167232t;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                u3Var3.dismiss();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$11");
    }
}
