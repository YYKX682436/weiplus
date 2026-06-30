package zv2;

/* loaded from: classes8.dex */
public final class h implements uc0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zv2.m f476406a;

    public h(zv2.m mVar) {
        this.f476406a = mVar;
    }

    @Override // uc0.p
    public final void a(java.lang.String str) {
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject;
        zv2.m mVar = this.f476406a;
        mVar.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        if (!kotlin.jvm.internal.o.b(str, mVar.f476412h) && (finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b) != null) {
            finderFeedReportObject.setIs_change_product_title(1);
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = mVar.f476397f;
        if (finderJumpInfo != null) {
            finderJumpInfo.setWording(str);
        }
        uc0.v vVar = mVar.f476413i;
        mVar.f476414m = vVar != null ? vVar.f426286f : -1;
        mVar.f476415n = vVar != null ? vVar.f426287g : -1;
        com.tencent.mm.plugin.finder.view.FinderJumperView.c(mVar.f476396e, str, false, 2, null);
        mVar.o(str);
    }
}
