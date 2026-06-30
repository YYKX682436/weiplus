package ni3;

/* loaded from: classes10.dex */
public final class b0 implements ek4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.monitor.FinderStreamMonitorView f337540a;

    public b0(com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView) {
        this.f337540a = finderStreamMonitorView;
    }

    @Override // ek4.a
    public void a(java.lang.String mediaId, int i17, dn.o task, dn.h hVar) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView = this.f337540a;
        ni3.q a17 = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.a(finderStreamMonitorView, com.tencent.mm.plugin.monitor.FinderStreamMonitorView.d(finderStreamMonitorView, mediaId));
        a17.f337694i = ni3.r.f337707h;
        a17.f337689d = 3;
        so2.i3 c17 = cu2.x.c(cu2.x.f222449a, mediaId, false, false, false, 14, null);
        a17.f337698m = c17.field_cacheSize;
        a17.f337699n = c17.field_totalSize;
        java.lang.String field_mediaId = c17.field_mediaId;
        kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
        a17.f337700o = field_mediaId;
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView.f(finderStreamMonitorView);
    }

    @Override // ek4.a
    public void b(java.lang.String mediaId, int i17, dn.h hVar) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView = this.f337540a;
        ni3.q a17 = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.a(finderStreamMonitorView, com.tencent.mm.plugin.monitor.FinderStreamMonitorView.d(finderStreamMonitorView, mediaId));
        a17.f337689d = 3;
        a17.f337694i = ni3.r.f337708i;
        so2.i3 c17 = cu2.x.c(cu2.x.f222449a, mediaId, false, false, false, 14, null);
        a17.f337698m = c17.field_cacheSize;
        a17.f337699n = c17.field_totalSize;
        java.lang.String field_mediaId = c17.field_mediaId;
        kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
        a17.f337700o = field_mediaId;
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView.f(finderStreamMonitorView);
    }

    @Override // ek4.a
    public void c(java.lang.String mediaId, int i17, dn.o oVar) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView = this.f337540a;
        ni3.q a17 = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.a(finderStreamMonitorView, com.tencent.mm.plugin.monitor.FinderStreamMonitorView.d(finderStreamMonitorView, mediaId));
        a17.f337694i = ni3.r.f337705f;
        a17.f337689d = 2;
        if (oVar != null) {
            a17.f337691f = oVar.field_requestVideoFormat == 1 ? "H264" : "H265";
            a17.f337690e = oVar.X1;
            java.lang.String field_mediaId = oVar.field_mediaId;
            kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
            a17.f337700o = field_mediaId;
        }
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView.f(finderStreamMonitorView);
    }

    @Override // ek4.a
    public void f(java.lang.String mediaId, long j17, long j18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView = this.f337540a;
        ni3.q a17 = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.a(finderStreamMonitorView, com.tencent.mm.plugin.monitor.FinderStreamMonitorView.d(finderStreamMonitorView, mediaId));
        a17.f337694i = ni3.r.f337706g;
        a17.f337689d = 2;
        so2.i3 c17 = cu2.x.c(cu2.x.f222449a, mediaId, false, false, false, 14, null);
        a17.f337690e = c17.field_fileFormat;
        a17.f337698m = java.lang.Math.max(j17, c17.field_cacheSize);
        a17.f337699n = c17.field_totalSize;
        java.lang.String field_mediaId = c17.field_mediaId;
        kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
        a17.f337700o = field_mediaId;
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView.f(finderStreamMonitorView);
    }
}
