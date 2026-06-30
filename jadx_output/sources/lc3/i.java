package lc3;

/* loaded from: classes7.dex */
public final class i implements lc3.f {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.udr.x f317899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc3.o f317900b;

    public i(lc3.o oVar, com.tencent.wechat.aff.udr.x udrInfo) {
        kotlin.jvm.internal.o.g(udrInfo, "udrInfo");
        this.f317900b = oVar;
        this.f317899a = udrInfo;
    }

    @Override // lc3.f
    public int a() {
        return (int) this.f317899a.f217590e;
    }

    @Override // lc3.f
    public com.tencent.mm.plugin.appbrand.appstorage.u1 b() {
        java.lang.String path = this.f317899a.getPath();
        kotlin.jvm.internal.o.f(path, "getPath(...)");
        return lc3.o.h(this.f317900b, new lc3.m0(path));
    }

    @Override // lc3.f
    public lc3.g0 c(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        java.lang.String path2 = this.f317899a.getPath();
        kotlin.jvm.internal.o.f(path2, "getPath(...)");
        return new lc3.k0(path2, path);
    }

    @Override // lc3.f
    public java.lang.String d() {
        return this.f317899a.getMd5();
    }
}
