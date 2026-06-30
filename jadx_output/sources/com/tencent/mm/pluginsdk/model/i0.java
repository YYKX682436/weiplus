package com.tencent.mm.pluginsdk.model;

/* loaded from: classes15.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.pluginsdk.model.i0 f189340a = new com.tencent.mm.pluginsdk.model.i0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f189341b = new java.util.HashMap();

    public static void a(com.tencent.mm.pluginsdk.model.i0 i0Var, int i17, java.lang.String str, long j17, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            j17 = 0;
        }
        i0Var.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        if (j17 == 0) {
            j17 = java.lang.System.currentTimeMillis();
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.pluginsdk.model.f0(str, i17, j17));
    }

    public static void c(com.tencent.mm.pluginsdk.model.i0 i0Var, int i17, java.lang.String str, long j17, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            j17 = 0;
        }
        i0Var.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        if (j17 == 0) {
            j17 = java.lang.System.currentTimeMillis();
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.pluginsdk.model.h0(str, i17, j17));
    }

    public final java.lang.String b(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        byte[] bytes = url.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        kotlin.jvm.internal.o.f(g17, "getMessageDigest(...)");
        return g17;
    }
}
