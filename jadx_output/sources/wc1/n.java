package wc1;

/* loaded from: classes7.dex */
public class n implements ph1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444490a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f444491b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444492c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f444493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444494e;

    public n(wc1.q qVar, java.lang.String str, java.util.Set set, java.lang.String str2, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, java.lang.String str3) {
        this.f444490a = str;
        this.f444491b = set;
        this.f444492c = str2;
        this.f444493d = d0Var;
        this.f444494e = str3;
    }

    @Override // ph1.c
    public void a(com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress wxaPkgLoadProgress) {
        java.lang.String wxaPkgLoadProgress2 = wxaPkgLoadProgress.toString();
        java.lang.String str = this.f444490a;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: module name: %s progress: %s", str, wxaPkgLoadProgress2);
        java.util.Set set = this.f444491b;
        if (!set.contains(str)) {
            set.add(str);
            k91.a3 a3Var = (k91.a3) i95.n0.c(k91.a3.class);
            if (a3Var != null) {
                ((k91.u0) a3Var).Ui(this.f444492c, str, wxaPkgLoadProgress.f75394d);
            }
        }
        wc1.p.y(this.f444493d, this.f444494e, "progressUpdate", this.f444490a, wxaPkgLoadProgress.f75394d, wxaPkgLoadProgress.f75395e, wxaPkgLoadProgress.f75396f, null);
    }
}
