package of1;

/* loaded from: classes7.dex */
public final class c0 implements of1.w {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f344896a = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ of1.v0 f344897b;

    public c0(of1.v0 v0Var) {
        this.f344897b = v0Var;
    }

    @Override // of1.w
    public boolean a(int i17, boolean z17, java.lang.String reqUrl, java.lang.String fullUrl) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        kotlin.jvm.internal.o.g(fullUrl, "fullUrl");
        if (!this.f344896a.remove(reqUrl)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i(this.f344897b.D1(), "overrideUrlRedirect(reason:" + i17 + ", forceRedirect:" + z17 + ", reqUrl:" + reqUrl + ", fullUrl:" + fullUrl + ") INGORED");
        return true;
    }

    @Override // of1.w
    public void b(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        pm0.v.X(new of1.b0(this.f344897b, url, this));
    }

    @Override // of1.w
    public boolean c(java.lang.String url, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(url, "url");
        if (i17 != 0 || !this.f344896a.remove(url)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i(this.f344897b.D1(), "overrideGetA8Key(url:" + url + ", force:" + z17 + ", reason:" + i17 + ") IGNORED");
        return true;
    }
}
