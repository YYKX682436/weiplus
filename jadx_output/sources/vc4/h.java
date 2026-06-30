package vc4;

/* loaded from: classes4.dex */
public final class h implements com.tencent.mm.plugin.sns.ui.o9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zc4.b f435283a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter f435284b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435285c;

    public h(zc4.b bVar, com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter improveItemFooter, java.lang.String str) {
        this.f435283a = bVar;
        this.f435284b = improveItemFooter;
        this.f435285c = str;
    }

    @Override // com.tencent.mm.plugin.sns.ui.o9
    public void c(java.lang.String workTagId, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadExportVideoLayout$1");
        kotlin.jvm.internal.o.g(workTagId, "workTagId");
        if (kotlin.jvm.internal.o.b(workTagId, ((r45.jj4) kz5.n0.X(qa4.f.a(this.f435283a.n().h1()))).f377866p0)) {
            com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter.c(this.f435284b).g(this.f435285c, (int) (i17 * 0.8d));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadExportVideoLayout$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.o9
    public void d(int i17, o55.a aVar, java.lang.String workTagId) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadExportVideoLayout$1");
        kotlin.jvm.internal.o.g(workTagId, "workTagId");
        if (kotlin.jvm.internal.o.b(workTagId, ((r45.jj4) kz5.n0.X(qa4.f.a(this.f435283a.n().h1()))).f377866p0)) {
            int i18 = com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter.f169076w;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getNormalVideoHandler$p", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter");
            com.tencent.mm.plugin.sns.ui.n9 n9Var = this.f435284b.f169092v;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getNormalVideoHandler$p", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter");
            n9Var.d();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadExportVideoLayout$1");
    }
}
