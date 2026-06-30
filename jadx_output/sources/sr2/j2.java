package sr2;

/* loaded from: classes2.dex */
public final class j2 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f411599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f411600b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f411601c;

    public j2(android.view.View view, java.lang.String str, sr2.y2 y2Var) {
        this.f411599a = view;
        this.f411600b = str;
        this.f411601c = y2Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        android.content.Context context = this.f411599a.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6();
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        if (finderFeedReportObject == null || (str2 = finderFeedReportObject.getPostId()) == null) {
            str2 = "";
        }
        hashMap.put("finder_post_sessionid", str2);
        if (kotlin.jvm.internal.o.b("post_poi_view", this.f411600b)) {
            sr2.y2 y2Var = this.f411601c;
            int i17 = 1;
            hashMap.put("poi_exp_type", java.lang.Integer.valueOf(y2Var.T6() ? 3 : (y2Var.U6() || y2Var.R6()) ? 2 : 1));
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.ad0.f126402a.a().r()).booleanValue()) {
                com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = com.tencent.mm.plugin.finder.report.p2.f125238b;
                hashMap.put("enter_scene", java.lang.Integer.valueOf(finderFeedReportObject2 != null ? finderFeedReportObject2.getEnterScene() : 0));
                if (y2Var.getIntent().getBooleanExtra("saveLocation", false)) {
                    ya2.p1 p1Var = y2Var.f411800d;
                    if (p1Var == null) {
                        kotlin.jvm.internal.o.o("locationWidget");
                        throw null;
                    }
                    r45.ze2 ze2Var = ((yv2.b) p1Var).f466202h;
                    if (ze2Var != null && (!com.tencent.mm.sdk.platformtools.t8.K0(ze2Var.getString(3)) || !com.tencent.mm.sdk.platformtools.t8.K0(ze2Var.getString(2)))) {
                        i17 = 0;
                    }
                }
                hashMap.put("if_clk_empty", java.lang.Integer.valueOf(i17));
            }
        }
        return com.tencent.mm.plugin.finder.report.d2.f124994a.b(V6, hashMap);
    }
}
