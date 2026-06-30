package se1;

/* loaded from: classes13.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final re1.b f406790a;

    /* renamed from: b, reason: collision with root package name */
    public final se1.p f406791b;

    /* renamed from: c, reason: collision with root package name */
    public final se1.n f406792c;

    /* renamed from: d, reason: collision with root package name */
    public final re1.d f406793d;

    /* renamed from: e, reason: collision with root package name */
    public final te1.s f406794e;

    /* renamed from: f, reason: collision with root package name */
    public final se1.d f406795f;

    public l(re1.b bVar, te1.c cVar, te1.s sVar) {
        if (this.f406795f == null) {
            this.f406795f = new se1.j(null, null);
        }
        this.f406792c = new se1.a0("com.tencent.mm.video", new ve1.f(), this.f406795f, cVar, new ve1.c(sVar.f417836p, sVar.f()), sVar);
        this.f406791b = new se1.p();
        this.f406790a = bVar;
        if (bVar != null) {
            this.f406793d = new re1.d(bVar, qe1.a.a().f362026k);
        }
        this.f406794e = sVar;
    }

    public se1.g a(java.lang.String str, java.lang.String str2) {
        se1.n nVar = this.f406792c;
        nVar.f406819u = str2;
        re1.d dVar = this.f406793d;
        if (dVar != null) {
            dVar.f394311k = str2;
        }
        se1.p pVar = this.f406791b;
        pVar.getClass();
        boolean z17 = !android.webkit.URLUtil.isNetworkUrl(str);
        int i17 = ve1.g.f436082a;
        boolean z18 = !android.text.TextUtils.isEmpty(str) && str.startsWith("file:///android_asset");
        boolean z19 = !android.text.TextUtils.isEmpty(str) && str.startsWith("android.resource://");
        if (z18) {
            se1.b bVar = new se1.b(qe1.a.a().f362016a);
            ve1.g.p(4, str2 + "DataSourceBuilder", "play asset file, dataSource:" + bVar, null);
            return bVar;
        }
        if (z19) {
            se1.c0 c0Var = new se1.c0(qe1.a.a().f362016a);
            ve1.g.p(4, str2 + "DataSourceBuilder", "play raw file, dataSource:" + c0Var, null);
            return c0Var;
        }
        if (z17) {
            ve1.g.p(4, str2 + "DataSourceBuilder", "play local file, dataSource:" + pVar, null);
            return pVar;
        }
        if (this.f406790a == null || !qe1.a.a().f362019d) {
            ve1.g.p(5, str2 + "DataSourceBuilder", "cache disabled, dataSource:" + nVar, null);
            return nVar;
        }
        re1.f fVar = new re1.f(this.f406790a, nVar, pVar, this.f406794e.f417832l ? dVar : null, false, true, new se1.k(this));
        fVar.f394333v = str2;
        ve1.g.p(4, str2 + "DataSourceBuilder", "cache enabled, dataSource:" + fVar, null);
        return fVar;
    }
}
