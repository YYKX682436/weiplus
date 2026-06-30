package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ve implements com.tencent.mm.pluginsdk.model.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsBrowseUI f170631d;

    public ve(com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI) {
        this.f170631d = snsBrowseUI;
    }

    @Override // com.tencent.mm.pluginsdk.model.a4
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScreenshotTaken", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$1");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsBrowseUI.Q1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI = this.f170631d;
        java.lang.String str2 = snsBrowseUI.S;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        if (str2.equals("")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScreenshotTaken", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$1");
            return;
        }
        ha4.b.a(44);
        com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        java.lang.String str3 = snsBrowseUI.S;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        ia4.a.a(4, Fj.k1(str3));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScreenshotTaken", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$1");
    }
}
