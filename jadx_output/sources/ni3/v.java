package ni3;

/* loaded from: classes10.dex */
public final class v implements vr2.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.monitor.FinderStreamMonitorView f337745a;

    public v(com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView) {
        this.f337745a = finderStreamMonitorView;
    }

    @Override // vr2.i
    public void a(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
    }

    @Override // vr2.i
    public void b(java.lang.String mediaId, cs2.p task, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(task, "task");
    }

    @Override // vr2.i
    public void c(java.lang.String mediaId, int i17, long j17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView = this.f337745a;
        ni3.q a17 = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.a(finderStreamMonitorView, com.tencent.mm.plugin.monitor.FinderStreamMonitorView.d(finderStreamMonitorView, mediaId));
        a17.f337688c = i17;
        a17.f337686a = j17;
        a17.f337689d = 2;
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView.f(finderStreamMonitorView);
    }

    @Override // vr2.i
    public void d(java.lang.String mediaId, boolean z17, int i17, cs2.p task, long j17, int i18, int i19) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView = this.f337745a;
        ni3.q a17 = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.a(finderStreamMonitorView, com.tencent.mm.plugin.monitor.FinderStreamMonitorView.d(finderStreamMonitorView, mediaId));
        a17.f337686a = j17;
        a17.f337688c = i17;
        a17.f337689d = 3;
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView.f(finderStreamMonitorView);
    }

    @Override // vr2.i
    public void e(java.lang.String mediaId, java.lang.String msg, cs2.p task, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(task, "task");
    }

    @Override // vr2.i
    public void f(java.lang.String mediaId, cs2.p task, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(task, "task");
    }

    @Override // vr2.i
    public void g(java.lang.String mediaId, int i17, int i18, java.lang.String fileFormat, java.lang.String codingFormat, cs2.p task) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(fileFormat, "fileFormat");
        kotlin.jvm.internal.o.g(codingFormat, "codingFormat");
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView = this.f337745a;
        ni3.q a17 = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.a(finderStreamMonitorView, com.tencent.mm.plugin.monitor.FinderStreamMonitorView.d(finderStreamMonitorView, mediaId));
        a17.f337688c = i17;
        a17.f337689d = 2;
        a17.f337691f = codingFormat;
        a17.f337690e = fileFormat;
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView.f(finderStreamMonitorView);
    }

    @Override // vr2.i
    public void h(java.lang.String mediaId, cs2.p task) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(task, "task");
    }
}
