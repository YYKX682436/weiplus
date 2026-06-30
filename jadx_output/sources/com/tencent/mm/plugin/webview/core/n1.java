package com.tencent.mm.plugin.webview.core;

/* loaded from: classes7.dex */
public final class n1 {

    /* renamed from: c, reason: collision with root package name */
    public static java.util.regex.Pattern f181893c;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f181895e;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.core.n1 f181891a = new com.tencent.mm.plugin.webview.core.n1();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f181892b = jz5.h.b(com.tencent.mm.plugin.webview.core.i1.f181849d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f181894d = jz5.h.b(com.tencent.mm.plugin.webview.core.m1.f181884d);

    public final java.lang.String a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        if (f181893c == null) {
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile((java.lang.String) ((jz5.n) f181892b).getValue());
            if (compile == null) {
                return null;
            }
            f181893c = compile;
        }
        java.util.regex.Pattern pattern = f181893c;
        java.util.regex.Matcher matcher = pattern != null ? pattern.matcher(str) : null;
        if (matcher != null && matcher.find()) {
            java.lang.String u17 = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f181894d).getValue()).u("AdWUID", "");
            kotlin.jvm.internal.o.f(u17, "decodeString(...)");
            if (!r26.n0.N(u17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewAdHelper", "getCustomHeaders wuid=" + u17 + ", url=" + str);
                b(6L);
                return "Wuid:".concat(u17);
            }
            b(7L);
            if (!f181895e) {
                f181895e = true;
                b(0L);
                java.lang.String PROCESS_MAIN = com.tencent.mm.sdk.platformtools.w9.f193053a;
                kotlin.jvm.internal.o.f(PROCESS_MAIN, "PROCESS_MAIN");
                com.tencent.mm.ipcinvoker.f.a(PROCESS_MAIN, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.webview.core.k1.f181859d, com.tencent.mm.plugin.webview.core.l1.f181867d);
            }
        }
        return null;
    }

    public final void b(long j17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1931L, j17, 1L, false);
    }
}
