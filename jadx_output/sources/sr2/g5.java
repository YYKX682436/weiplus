package sr2;

/* loaded from: classes10.dex */
public final class g5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411572d;

    public g5(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC) {
        this.f411572d = postMainUIC;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str;
        this.f411572d.t7(false, 2);
        ft2.b bVar = ft2.b.f266519a;
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        if (finderFeedReportObject == null || (str = finderFeedReportObject.getFlowId()) == null) {
            str = "";
        }
        ft2.d dVar = ft2.c.f266520a;
        bVar.b(str, ft2.c.f266527h);
    }
}
