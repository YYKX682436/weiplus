package lc3;

/* loaded from: classes7.dex */
public final class h implements lc3.f {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo f317897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc3.o f317898b;

    public h(lc3.o oVar, com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo bootsPkgInfo) {
        kotlin.jvm.internal.o.g(bootsPkgInfo, "bootsPkgInfo");
        this.f317898b = oVar;
        this.f317897a = bootsPkgInfo;
    }

    @Override // lc3.f
    public int a() {
        java.lang.String version = this.f317897a.f147866o;
        kotlin.jvm.internal.o.f(version, "version");
        return java.lang.Integer.parseInt(version);
    }

    @Override // lc3.f
    public com.tencent.mm.plugin.appbrand.appstorage.u1 b() {
        java.lang.String wxapath = this.f317897a.f147867p;
        kotlin.jvm.internal.o.f(wxapath, "wxapath");
        return lc3.o.h(this.f317898b, new lc3.m0(wxapath));
    }

    @Override // lc3.f
    public lc3.g0 c(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        java.lang.String wxapath = this.f317897a.f147867p;
        kotlin.jvm.internal.o.f(wxapath, "wxapath");
        return new lc3.k0(wxapath, path);
    }

    @Override // lc3.f
    public java.lang.String d() {
        return this.f317897a.f147860f;
    }
}
