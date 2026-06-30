package sc2;

/* loaded from: classes2.dex */
public final class s3 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f406231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sc2.u3 f406232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f406233c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f406234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f406235e;

    public s3(long j17, sc2.u3 u3Var, xc2.p0 p0Var, java.lang.Object obj, r45.qt2 qt2Var) {
        this.f406231a = j17;
        this.f406232b = u3Var;
        this.f406233c = p0Var;
        this.f406234d = obj;
        this.f406235e = qt2Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(this.f406231a));
        android.util.ArrayMap arrayMap = this.f406232b.C;
        xc2.p0 p0Var = this.f406233c;
        lVarArr[1] = new jz5.l("getredbuttontype", java.lang.Integer.valueOf(kotlin.jvm.internal.o.b(arrayMap.get(p0Var.f453234a.getJump_page_id()), java.lang.Boolean.TRUE) ? 2 : 1));
        lVarArr[2] = new jz5.l("feed_report_extra_data", this.f406234d);
        r45.qt2 qt2Var = this.f406235e;
        lVarArr[3] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.getString(2) : null);
        lVarArr[4] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.getString(1) : null);
        lVarArr[5] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null);
        java.lang.String report_info = p0Var.f453234a.getReport_info();
        if (report_info == null) {
            report_info = "";
        }
        lVarArr[6] = new jz5.l("component_report_info", report_info);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = p0Var.f453244f;
        lVarArr[7] = new jz5.l("session_buffer", baseFinderFeed != null ? baseFinderFeed.g0() : "");
        return kz5.c1.k(lVarArr);
    }
}
