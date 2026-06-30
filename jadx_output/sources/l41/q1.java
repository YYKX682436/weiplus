package l41;

/* loaded from: classes4.dex */
public final class q1 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f315903e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f315904f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f315905g;

    public q1(java.lang.String str, boolean z17, int i17, yz5.l lVar) {
        this.f315902d = str;
        this.f315903e = z17;
        this.f315904f = i17;
        this.f315905g = lVar;
    }

    @Override // i11.c
    public final boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        ((ku5.t0) ku5.t0.f312615d).B(l41.p1.f315896d);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuLocationReqController", "LocationGet isOk = %s, talkUsername = %s, useWgs84 = %s, fromScene = %s", java.lang.Boolean.valueOf(z17), this.f315902d, java.lang.Boolean.valueOf(this.f315903e), java.lang.Integer.valueOf(this.f315904f));
        if (!z17) {
            return false;
        }
        java.lang.String str = "WGS84";
        if (i17 != 0 && i17 == 1) {
            str = "GCJ02";
        }
        java.lang.String str2 = str;
        double d27 = f17;
        double d28 = f18;
        java.lang.String kfUsername = this.f315902d;
        int i18 = this.f315904f;
        yz5.l successCallback = this.f315905g;
        kotlin.jvm.internal.o.g(kfUsername, "kfUsername");
        kotlin.jvm.internal.o.g(successCallback, "successCallback");
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            v65.i.b(lifecycleScope, null, new l41.u1(kfUsername, str2, d27, d28, d18, i18, successCallback, null), 1, null);
        }
        return false;
    }
}
