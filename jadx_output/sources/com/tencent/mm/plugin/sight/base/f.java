package com.tencent.mm.plugin.sight.base;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sight.base.f f162410a = new com.tencent.mm.plugin.sight.base.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f162411b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f162412c = new com.tencent.mm.sdk.platformtools.r2(30);

    public final com.tencent.mm.plugin.sight.base.b a(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.sdk.platformtools.r2 r2Var = f162412c;
        com.tencent.mm.plugin.sight.base.b bVar = (com.tencent.mm.plugin.sight.base.b) r2Var.get(path);
        if (bVar != null) {
            return bVar;
        }
        if (!com.tencent.mm.vfs.w6.j(path)) {
            com.tencent.mars.xlog.Log.i("SightUtilCacheWrapper", "read media info error, file not exists:" + path + '.');
            return null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(path, true);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.i("SightUtilCacheWrapper", "read media info with ffmpeg error, path:" + path + '.');
            return null;
        }
        com.tencent.mars.xlog.Log.i("SightUtilCacheWrapper", "read media info with ffmpeg success, path:" + path + " mediaInfo:" + d17 + " cost: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", update cache");
        r2Var.put(path, d17);
        return d17;
    }
}
