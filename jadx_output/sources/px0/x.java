package px0;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment f358813d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment) {
        super(0);
        this.f358813d = materialImportPreviewFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment = this.f358813d;
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo = (com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo) ((jz5.n) materialImportPreviewFragment.f69659w).getValue();
        if (videoCaptureReportInfo != null) {
            linkedHashMap.put("source_feedid", pm0.v.u(videoCaptureReportInfo.f155694h));
            java.lang.String finderContextId = videoCaptureReportInfo.f155697n;
            kotlin.jvm.internal.o.f(finderContextId, "finderContextId");
            linkedHashMap.put("finder_context_id", finderContextId);
            java.lang.String finderTabContextId = videoCaptureReportInfo.f155698o;
            kotlin.jvm.internal.o.f(finderTabContextId, "finderTabContextId");
            linkedHashMap.put("finder_tab_context_id", finderTabContextId);
            linkedHashMap.put("comment_scene", 379);
            java.lang.String str = (java.lang.String) ((jz5.n) materialImportPreviewFragment.f69660x).getValue();
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("templateid", str);
            i95.m c17 = i95.n0.c(zy2.pa.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            long j17 = videoCaptureReportInfo.f155694h;
            java.lang.String str2 = videoCaptureReportInfo.f155695i;
            int i17 = videoCaptureReportInfo.f155700q;
            i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            linkedHashMap.put("session_buffer", ((com.tencent.mm.plugin.finder.report.o3) c18).ek(j17, str2, i17));
        }
        return linkedHashMap;
    }
}
