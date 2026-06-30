package hd3;

/* loaded from: classes.dex */
public final class d implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hd3.e f280550a;

    public d(hd3.e eVar) {
        this.f280550a = eVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.MBJsApiStartCpuProfile", "hy: already start profiling. token is " + str);
        ((ku5.t0) ku5.t0.f312615d).B(new hd3.c(this.f280550a));
        this.f280550a.s().invoke(this.f280550a.l(kz5.c1.i(new jz5.l("token", str))));
    }
}
