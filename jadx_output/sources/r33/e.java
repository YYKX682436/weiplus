package r33;

/* loaded from: classes8.dex */
public class e implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m33.h1 f368972a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f368973b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f368974c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f368975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m53.t3 f368976e;

    public e(r33.f fVar, m33.h1 h1Var, int i17, java.lang.String str, java.lang.String str2, m53.t3 t3Var) {
        this.f368972a = h1Var;
        this.f368973b = i17;
        this.f368974c = str;
        this.f368975d = str2;
        this.f368976e = t3Var;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        m33.h1 h1Var = this.f368972a;
        if (i17 != 0 || i18 != 0 || oVar.f70711b.f70700a == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CgiGetLaunchGameInfo", "ReportDistributeStainId cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, oVar.f70711b.f70700a);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("error", "ReportDistributeStainId cgi failed");
            h1Var.b(hashMap);
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f368973b);
        java.lang.String str2 = this.f368974c;
        java.lang.String str3 = this.f368975d;
        m53.t3 t3Var = this.f368976e;
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetLaunchGameInfo", "ReportDistributeStainId cgi success, actionType = %d, bizAppId = %s, url = %s, gameName = %s, gameAppId = %s, gameIconUrl = %s", valueOf, str2, str3, t3Var.f324073e, t3Var.f324072d, t3Var.f324074f);
        h1Var.a(new java.util.HashMap());
    }
}
