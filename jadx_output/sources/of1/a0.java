package of1;

/* loaded from: classes7.dex */
public final class a0 implements of1.w {

    /* renamed from: a, reason: collision with root package name */
    public boolean f344884a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f344885b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ of1.v0 f344886c;

    public a0(of1.v0 v0Var) {
        this.f344886c = v0Var;
    }

    @Override // of1.w
    public boolean a(int i17, boolean z17, java.lang.String reqUrl, java.lang.String fullUrl) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        kotlin.jvm.internal.o.g(fullUrl, "fullUrl");
        if (this.f344884a || i17 != 0) {
            return false;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new of1.x(this));
        return false;
    }

    @Override // of1.w
    public void b(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        pm0.v.X(new of1.z(this.f344886c, url, this));
    }

    @Override // of1.w
    public boolean c(java.lang.String url, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(url, "url");
        return false;
    }
}
