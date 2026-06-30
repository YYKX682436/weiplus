package zl1;

/* loaded from: classes7.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f473626a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f473627b;

    /* renamed from: c, reason: collision with root package name */
    public final zl1.w f473628c;

    /* renamed from: d, reason: collision with root package name */
    public zl1.x f473629d;

    /* renamed from: e, reason: collision with root package name */
    public int f473630e = -1;

    /* renamed from: f, reason: collision with root package name */
    public volatile zl1.z f473631f;

    public y(java.lang.String str, zl1.w wVar, com.tencent.mm.plugin.appbrand.e9 e9Var) {
        this.f473626a = str;
        this.f473627b = e9Var;
        this.f473628c = wVar;
    }

    public java.lang.String a() {
        java.lang.String str = this.f473626a;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return str;
    }

    public abstract void b();

    public y(java.lang.String str, zl1.w wVar) {
        this.f473626a = str;
        this.f473628c = wVar;
    }
}
