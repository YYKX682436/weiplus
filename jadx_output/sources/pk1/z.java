package pk1;

/* loaded from: classes12.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final pk1.z f355530a = new pk1.z();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f355531b = jz5.h.b(pk1.w.f355527d);

    public final void a(pk1.u uVar) {
        com.tencent.mm.vfs.r6 r6Var;
        boolean z17 = uVar.f355525d;
        java.lang.String str = uVar.f355523b;
        if (z17) {
            r6Var = new com.tencent.mm.vfs.r6(c(), str + ".mark");
            if (!r6Var.m()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnCacheManager", "doMark, markFile is not exists");
                com.tencent.mm.vfs.r6 c17 = c();
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str + ".temp.mark", false, true);
                com.tencent.mm.vfs.z7 z7Var = c17 == null ? com.tencent.mm.vfs.z7.f213276i : c17.f213166d;
                if (l17 != null && !l17.isEmpty()) {
                    java.lang.String str2 = z7Var.f213279f;
                    z7Var = new com.tencent.mm.vfs.z7(z7Var.f213277d, z7Var.f213278e, str2 + '/' + l17, z7Var.f213280g, z7Var.f213281h);
                }
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(z7Var, null);
                com.tencent.mm.vfs.z2 M = r6Var.M();
                if (m17.a() && M.a()) {
                    try {
                        M.f213266a.t(M.f213267b, m17.f213266a, m17.f213267b);
                    } catch (java.io.IOException unused) {
                    }
                }
            }
        } else {
            r6Var = new com.tencent.mm.vfs.r6(c(), str + ".temp.mark");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnCacheManager", "doMark, needDoMarkFile(virtual): " + r6Var);
        com.tencent.mm.vfs.w6.S(r6Var.o(), new byte[]{0}, 0, 1);
    }

    public final pk1.v b(java.lang.String srcUrl) {
        kotlin.jvm.internal.o.g(srcUrl, "srcUrl");
        byte[] bytes = srcUrl.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(c(), g17 + ".res");
        com.tencent.mm.vfs.r6 c17 = c();
        boolean z17 = false;
        java.lang.String l17 = com.tencent.mm.vfs.e8.l(g17 + ".mark", false, true);
        com.tencent.mm.vfs.z7 z7Var = c17 == null ? com.tencent.mm.vfs.z7.f213276i : c17.f213166d;
        if (l17 != null && !l17.isEmpty()) {
            java.lang.String str = z7Var.f213279f;
            z7Var = new com.tencent.mm.vfs.z7(z7Var.f213277d, z7Var.f213278e, str + '/' + l17, z7Var.f213280g, z7Var.f213281h);
        }
        if (r6Var.m()) {
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(z7Var, null);
            if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                z17 = true;
            }
        }
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(r6Var.o(), !z17);
        if (i17 == null) {
            i17 = "";
        }
        kotlin.jvm.internal.o.d(g17);
        pk1.u uVar = new pk1.u(srcUrl, g17, i17, z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnCacheManager", "getCacheInfo, cacheInfo: " + uVar);
        return new pk1.v(uVar);
    }

    public final com.tencent.mm.vfs.r6 c() {
        return (com.tencent.mm.vfs.r6) ((jz5.n) f355531b).getValue();
    }

    public final void d(pk1.v cacheInfoHolder) {
        kotlin.jvm.internal.o.g(cacheInfoHolder, "cacheInfoHolder");
        pk1.u uVar = cacheInfoHolder.f355526a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnCacheManager", "onCacheFinish, cacheInfo: " + uVar);
        pk1.u a17 = pk1.u.a(uVar, null, null, null, true, 7, null);
        cacheInfoHolder.f355526a = a17;
        a(a17);
    }

    public final void e(pk1.v cacheInfoHolder) {
        kotlin.jvm.internal.o.g(cacheInfoHolder, "cacheInfoHolder");
        pk1.u uVar = cacheInfoHolder.f355526a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnCacheManager", "onCacheTouch, cacheInfo: " + uVar);
        a(uVar);
    }
}
