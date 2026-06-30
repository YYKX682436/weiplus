package com.tencent.mm.sdk.platformtools;

/* loaded from: classes13.dex */
public final class l0 {
    public l0(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.sdk.platformtools.m0 a(java.lang.String bssidCache) {
        kotlin.jvm.internal.o.g(bssidCache, "bssidCache");
        com.tencent.mars.xlog.Log.i("MicroMsg.ConnectivityCompat", "parse bssidCache: ".concat(bssidCache));
        java.util.List f07 = r26.n0.f0(bssidCache, new java.lang.String[]{","}, false, 0, 6, null);
        return f07.size() == 2 ? new com.tencent.mm.sdk.platformtools.m0((java.lang.String) f07.get(0), java.lang.Long.parseLong((java.lang.String) f07.get(1))) : new com.tencent.mm.sdk.platformtools.m0("02:00:00:00:00:00", 0L);
    }
}
