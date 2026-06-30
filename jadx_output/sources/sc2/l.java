package sc2;

/* loaded from: classes2.dex */
public final class l implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f406029a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f406030b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f406031c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f406032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f406033e;

    public l(r45.qt2 qt2Var, long j17, xc2.p0 p0Var, java.lang.Object obj, boolean z17) {
        this.f406029a = qt2Var;
        this.f406030b = j17;
        this.f406031c = p0Var;
        this.f406032d = obj;
        this.f406033e = z17;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[7];
        r45.qt2 qt2Var = this.f406029a;
        lVarArr[0] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.getString(2) : null);
        lVarArr[1] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.getString(1) : null);
        lVarArr[2] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null);
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(this.f406030b));
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f406031c.f453244f;
        lVarArr[4] = new jz5.l("session_buffer", baseFinderFeed != null ? baseFinderFeed.g0() : null);
        lVarArr[5] = new jz5.l("biz_bypass_data", this.f406032d);
        lVarArr[6] = new jz5.l("button_status", java.lang.Boolean.valueOf(this.f406033e));
        return kz5.c1.k(lVarArr);
    }
}
