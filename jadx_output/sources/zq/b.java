package zq;

/* loaded from: classes.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.lang.String rootPath, java.lang.String productId, java.lang.String url) {
        java.lang.String g17;
        kotlin.jvm.internal.o.g(rootPath, "rootPath");
        kotlin.jvm.internal.o.g(productId, "productId");
        kotlin.jvm.internal.o.g(url, "url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(productId) && com.tencent.mm.sdk.platformtools.t8.K0(url)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EmojiGroupDiskCache", "[cpan] get icon path failed. productid and url are null.");
            return null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(productId) && com.tencent.mm.sdk.platformtools.t8.K0(url)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EmojiGroupDiskCache", "[cpan] product id and url are null.");
            g17 = null;
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(url)) {
            byte[] bytes = productId.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            g17 = kk.k.g(bytes);
        } else {
            byte[] bytes2 = url.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
            g17 = kk.k.g(bytes2);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
            return null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(productId)) {
            kotlin.jvm.internal.o.d(g17);
            return rootPath.concat(g17);
        }
        return rootPath + productId + '/' + g17;
    }
}
