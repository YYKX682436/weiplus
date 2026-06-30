package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes15.dex */
public class uk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f170585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsLabelUI f170586e;

    public uk(com.tencent.mm.plugin.sns.ui.SnsLabelUI snsLabelUI, java.lang.String str) {
        this.f170586e = snsLabelUI;
        this.f170585d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$7");
        java.util.ArrayList arrayList = (java.util.ArrayList) ((b93.b) c93.a.a()).d();
        com.tencent.mm.plugin.sns.ui.SnsLabelUI snsLabelUI = this.f170586e;
        com.tencent.mm.plugin.sns.ui.SnsLabelUI.W6(snsLabelUI, arrayList);
        if (com.tencent.mm.plugin.sns.ui.SnsLabelUI.V6(snsLabelUI) == null) {
            com.tencent.mm.plugin.sns.ui.SnsLabelUI.W6(snsLabelUI, new java.util.ArrayList());
        }
        java.lang.String str = this.f170585d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            i17 = -1;
        } else {
            if (!com.tencent.mm.plugin.sns.ui.SnsLabelUI.V6(snsLabelUI).contains(str)) {
                com.tencent.mm.plugin.sns.ui.SnsLabelUI.V6(snsLabelUI).add(str);
            }
            i17 = com.tencent.mm.plugin.sns.ui.SnsLabelUI.V6(snsLabelUI).indexOf(str);
        }
        com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(snsLabelUI).h(com.tencent.mm.plugin.sns.ui.SnsLabelUI.V6(snsLabelUI));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        snsLabelUI.b7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(snsLabelUI).f4360h = com.tencent.mm.plugin.sns.ui.SnsLabelUI.Y6(snsLabelUI);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && i17 != -1) {
            if (com.tencent.mm.plugin.sns.ui.SnsLabelUI.Y6(snsLabelUI) == 2) {
                com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(snsLabelUI).f4363k.add(str);
                ae4.a T6 = com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(snsLabelUI);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                java.util.ArrayList arrayList2 = snsLabelUI.f167234v;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                T6.f4369q = new java.util.ArrayList(arrayList2);
                com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(snsLabelUI).f4365m.clear();
            } else if (com.tencent.mm.plugin.sns.ui.SnsLabelUI.Y6(snsLabelUI) == 3) {
                com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(snsLabelUI).f4364l.add(str);
                ae4.a T62 = com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(snsLabelUI);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                java.util.ArrayList arrayList3 = snsLabelUI.f167234v;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                T62.f4370r = new java.util.ArrayList(arrayList3);
                com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(snsLabelUI).f4366n.clear();
            }
        }
        com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(snsLabelUI).notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.SnsLabelUI.a7(snsLabelUI).expandGroup(com.tencent.mm.plugin.sns.ui.SnsLabelUI.Y6(snsLabelUI));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1802", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        snsLabelUI.f167233u = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1802", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$7");
    }
}
