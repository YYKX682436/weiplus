package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class h4 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f168488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.c4 f168489e;

    public h4(com.tencent.mm.plugin.sns.ui.c4 c4Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f168489e = c4Var;
        this.f168488d = snsInfo;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$4");
        com.tencent.mm.plugin.sns.ui.c4 c4Var = this.f168489e;
        if (com.tencent.mm.plugin.sns.ui.c4.e(c4Var) != null) {
            com.tencent.mm.plugin.sns.ui.c4.e(c4Var).b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        java.util.ArrayList arrayList = c4Var.A;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        if (arrayList.contains(1015)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GalleryTitleManager", "[OnSheetDismiss] didShow edit sns group");
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.G(3, false, ca4.z0.T(this.f168488d));
        }
        com.tencent.mm.autogen.events.CancelRecogImageFileEvent cancelRecogImageFileEvent = new com.tencent.mm.autogen.events.CancelRecogImageFileEvent();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        long j17 = c4Var.f168097q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        cancelRecogImageFileEvent.f54026g.f7686a = j17;
        com.tencent.mm.plugin.sns.ui.c4.b(c4Var);
        cancelRecogImageFileEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        c4Var.f168091h = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1002", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        c4Var.f168092i = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1002", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        c4Var.f168094n = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1102", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        c4Var.f168095o = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1102", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1202", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        c4Var.f168103w = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1202", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1302", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1302", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1502", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1502", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1602", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1602", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1702", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1702", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$4");
        return null;
    }
}
