package sr2;

/* loaded from: classes2.dex */
public final class n1 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sr2.o1 f411642a;

    public n1(sr2.o1 o1Var) {
        this.f411642a = o1Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        android.widget.TextView textView;
        jz5.l[] lVarArr = new jz5.l[3];
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        java.lang.String str4 = "";
        if (finderFeedReportObject == null || (str2 = finderFeedReportObject.getSessionId()) == null) {
            str2 = "";
        }
        jz5.l lVar = new jz5.l("finder_post_sessionid", str2);
        boolean z17 = false;
        lVarArr[0] = lVar;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = com.tencent.mm.plugin.finder.report.p2.f125238b;
        lVarArr[1] = new jz5.l("enter_scene", finderFeedReportObject2 != null ? java.lang.Integer.valueOf(finderFeedReportObject2.getEnterScene()) : "");
        sr2.o1 o1Var = this.f411642a;
        android.view.View view = o1Var.f411653d;
        if (view != null && (textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f487426vi4)) != null && textView.getVisibility() == 0) {
            z17 = true;
        }
        if (z17 && (str3 = o1Var.f411661o) != null) {
            str4 = str3;
        }
        lVarArr[2] = new jz5.l("cover_link_title", str4);
        return kz5.c1.l(lVarArr);
    }
}
