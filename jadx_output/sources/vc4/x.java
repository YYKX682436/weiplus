package vc4;

/* loaded from: classes4.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter f435309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435310e;

    public x(com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter improveItemFooter, java.lang.String str) {
        this.f435309d = improveItemFooter;
        this.f435310e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc4.p n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$sightPostSuccessListener$1$callback$1");
        com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter improveItemFooter = this.f435309d;
        com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView c17 = com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter.c(improveItemFooter);
        java.lang.String localId = this.f435310e;
        kotlin.jvm.internal.o.f(localId, "$localId");
        zc4.b b17 = com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter.b(improveItemFooter);
        java.lang.String t07 = ca4.z0.t0((b17 == null || (n17 = b17.n()) == null) ? 0L : n17.y0());
        kotlin.jvm.internal.o.f(t07, "longToString(...)");
        c17.f(localId, t07);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$sightPostSuccessListener$1$callback$1");
    }
}
