package ri1;

/* loaded from: classes7.dex */
public final class p implements ri1.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f396035d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f396036e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f396037f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f396038g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f396039h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f396040i;

    public p(com.tencent.mm.plugin.appbrand.o6 o6Var, kotlin.jvm.internal.i iVar) {
        this.f396035d = o6Var;
        java.lang.String Y0 = o6Var.S2(false).Y0();
        kotlin.jvm.internal.o.f(Y0, "versionBuildInfo(...)");
        this.f396037f = Y0;
        int i17 = o6Var.f74805p.f77281g;
        java.lang.String valueOf = i17 != 1 ? i17 != 2 ? java.lang.String.valueOf(o6Var.d2()) : "DEMO" : "TEST";
        this.f396038g = valueOf;
        com.tencent.mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheDirectoryDescriptor webRenderingCacheDirectoryDescriptor = o6Var.u0().f77297j2;
        java.lang.String str = webRenderingCacheDirectoryDescriptor != null ? webRenderingCacheDirectoryDescriptor.f87233d : null;
        if (str == null || str.length() == 0) {
            this.f396036e = false;
            this.f396039h = "";
        } else {
            this.f396036e = true;
            this.f396039h = str + '_' + Y0.hashCode() + '_' + valueOf;
        }
        this.f396040i = new java.util.concurrent.ConcurrentHashMap();
    }

    public final r45.o8 a(java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f396040i;
        r45.o8 o8Var = (r45.o8) concurrentHashMap.get(str);
        if (o8Var == null) {
            java.lang.String c17 = c(str);
            long k17 = com.tencent.mm.vfs.w6.k(c17);
            if (k17 > 0) {
                o8Var = new r45.o8();
                try {
                    o8Var.parseFrom(com.tencent.mm.vfs.w6.N(c17, 0, (int) k17));
                } catch (java.io.IOException unused) {
                    com.tencent.mm.vfs.w6.h(c17);
                }
                concurrentHashMap.put(str, o8Var);
            }
        }
        return o8Var;
    }

    public final com.tencent.mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel b(java.lang.String str) {
        java.lang.String str2 = this.f396035d.f74803n;
        kotlin.jvm.internal.o.f(str2, "getAppId(...)");
        return new com.tencent.mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel(str2, this.f396037f, this.f396038g, str, null);
    }

    public final java.lang.String c(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f396039h);
        sb6.append('_');
        java.lang.String encode = java.net.URLEncoder.encode(str, com.tencent.mapsdk.internal.rv.f51270c);
        kotlin.jvm.internal.o.f(encode, "encode(...)");
        sb6.append(encode);
        sb6.append(".rc");
        return sb6.toString();
    }
}
