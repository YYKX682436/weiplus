package vc4;

/* loaded from: classes4.dex */
public final class i implements com.tencent.mm.plugin.sns.ui.o9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zc4.b f435286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter f435287b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435288c;

    public i(zc4.b bVar, com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter improveItemFooter, java.lang.String str) {
        this.f435286a = bVar;
        this.f435287b = improveItemFooter;
        this.f435288c = str;
    }

    @Override // com.tencent.mm.plugin.sns.ui.o9
    public void c(java.lang.String workTagId, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadExportVideoLayout$2");
        kotlin.jvm.internal.o.g(workTagId, "workTagId");
        if (kotlin.jvm.internal.o.b(workTagId, ((r45.jj4) kz5.n0.X(qa4.f.a(this.f435286a.n().h1()))).f377866p0)) {
            com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter.c(this.f435287b).g(this.f435288c, (int) (i17 * 0.8d));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadExportVideoLayout$2");
    }

    @Override // com.tencent.mm.plugin.sns.ui.o9
    public void d(int i17, o55.a aVar, java.lang.String workTagId) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadExportVideoLayout$2");
        kotlin.jvm.internal.o.g(workTagId, "workTagId");
        if (kotlin.jvm.internal.o.b(workTagId, ((r45.jj4) kz5.n0.X(qa4.f.a(this.f435286a.n().h1()))).f377866p0)) {
            int i18 = com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter.f169076w;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMaasVideoHandler$p", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter");
            rd4.d dVar = this.f435287b.f169091u;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMaasVideoHandler$p", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter");
            dVar.d();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadExportVideoLayout$2");
    }
}
