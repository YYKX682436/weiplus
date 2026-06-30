package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class vd implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI f170630d;

    public vd(com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI) {
        this.f170630d = snsAdStreamVideoPlayUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$1");
        if (g4Var.z()) {
            g4Var.a(1002, com.tencent.mm.R.string.j8t);
            g4Var.a(1003, com.tencent.mm.R.string.j8u);
            int i17 = com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI.K;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            boolean z17 = this.f170630d.f166783p;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            if (!z17) {
                g4Var.a(1004, com.tencent.mm.R.string.j8r);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$1");
    }
}
