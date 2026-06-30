package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.util.k0 f115585a = new com.tencent.mm.plugin.finder.live.util.k0();

    /* renamed from: b, reason: collision with root package name */
    public static final kk.l f115586b = new kk.l(1000);

    public final r45.i52 a(java.lang.String coverUrl) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(coverUrl, "coverUrl");
        r45.i52 i52Var = (r45.i52) f115586b.get(coverUrl);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getStatus] status:");
        if (i52Var == null || (obj = pm0.b0.g(i52Var)) == null) {
            obj = "null";
        }
        sb6.append(obj);
        sb6.append(", url:");
        sb6.append(coverUrl);
        com.tencent.mars.xlog.Log.i("FinderLiveRedPacketCache", sb6.toString());
        return i52Var;
    }
}
