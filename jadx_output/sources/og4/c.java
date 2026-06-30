package og4;

/* loaded from: classes7.dex */
public final class c extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f345170f = "MBJsApiSetDownloadingSpeed";

    @Override // lc3.c0
    public java.lang.String f() {
        return "setDownloadingSpeed";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("appId");
        double optDouble = data.optDouble(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_NETWORK_SPEED);
        com.tencent.mars.xlog.Log.i(this.f345170f, "[gameload] setDownloadingSpeed appId:" + optString + ",speed:" + optDouble);
        oe0.r rVar = (oe0.r) i95.n0.c(oe0.r.class);
        kotlin.jvm.internal.o.d(optString);
        ne0.n nVar = (ne0.n) rVar;
        nVar.getClass();
        ((ku5.t0) ku5.t0.f312615d).h(new ne0.m(nVar, optString, optDouble), "MicroMsg.MagicGameLoadingFeatureService");
        s().invoke(k());
    }
}
