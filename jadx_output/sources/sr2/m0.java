package sr2;

/* loaded from: classes2.dex */
public final class m0 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sr2.w0 f411632a;

    public m0(sr2.w0 w0Var) {
        this.f411632a = w0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        jz5.l[] lVarArr = new jz5.l[6];
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        sr2.w0 w0Var = this.f411632a;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(w0Var.getActivity());
        lVarArr[0] = new jz5.l("behaviour_session_id", e17 != null ? e17.f135385q : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(w0Var.getActivity());
        lVarArr[1] = new jz5.l("finder_context_id", e18 != null ? e18.f135382p : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(w0Var.getActivity());
        lVarArr[2] = new jz5.l("finder_tab_context_id", e19 != null ? e19.f135386r : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e27 = iyVar.e(w0Var.getActivity());
        lVarArr[3] = new jz5.l("comment_scene", e27 != null ? java.lang.Integer.valueOf(e27.f135380n) : null);
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        if (finderFeedReportObject == null || (str2 = finderFeedReportObject.getSessionId()) == null) {
            str2 = "";
        }
        lVarArr[4] = new jz5.l("finder_post_sessionid", str2);
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = com.tencent.mm.plugin.finder.report.p2.f125238b;
        lVarArr[5] = new jz5.l("enter_scene", java.lang.Integer.valueOf(finderFeedReportObject2 != null ? finderFeedReportObject2.getEnterScene() : 0));
        return kz5.c1.k(lVarArr);
    }
}
