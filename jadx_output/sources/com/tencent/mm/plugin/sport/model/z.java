package com.tencent.mm.plugin.sport.model;

/* loaded from: classes12.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sport.model.z f171826a = new com.tencent.mm.plugin.sport.model.z();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f171827b = jz5.h.b(com.tencent.mm.plugin.sport.model.y.f171825d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f171828c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f171829d;

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = com.tencent.mm.storage.v3.f196273a;
        sb6.append(str);
        sb6.append("stepcounter.cfg");
        f171828c = sb6.toString();
        f171829d = str + "PUSH_stepcounter.cfg";
    }

    public final long a(java.lang.String key, long j17) {
        kotlin.jvm.internal.o.g(key, "key");
        return c().q(key, j17);
    }

    public final com.tencent.mm.plugin.sport.model.x b() {
        java.lang.String u17 = c().u("KEY_STEP_DETAIL_INFO", "");
        com.tencent.mm.plugin.sport.model.x xVar = new com.tencent.mm.plugin.sport.model.x();
        kotlin.jvm.internal.o.d(u17);
        xVar.a(u17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.SportKvStorage", "getSportDetailInfo detailInfo:".concat(u17));
        return xVar;
    }

    public final com.tencent.mm.sdk.platformtools.o4 c() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f171827b).getValue();
    }

    public final void d(java.lang.String key, long j17) {
        kotlin.jvm.internal.o.g(key, "key");
        c().B(key, j17);
    }

    public final void e(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        c().D(key, value);
    }
}
