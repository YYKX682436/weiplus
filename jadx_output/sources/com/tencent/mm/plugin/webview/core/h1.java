package com.tencent.mm.plugin.webview.core;

/* loaded from: classes7.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f181839a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f181840b = jz5.h.b(new com.tencent.mm.plugin.webview.core.b1(this));

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f181841c = jz5.h.b(com.tencent.mm.plugin.webview.core.g1.f181836d);

    public h1(long j17) {
        this.f181839a = j17;
    }

    public static final java.lang.String a(com.tencent.mm.plugin.webview.core.h1 h1Var, java.lang.String str) {
        h1Var.getClass();
        if (str == null) {
            return "";
        }
        if (str.length() > 1000) {
            str = str.substring(0, 1000);
            kotlin.jvm.internal.o.f(str, "substring(...)");
        }
        java.lang.String encode = java.net.URLEncoder.encode(str, com.tencent.mapsdk.internal.rv.f51270c);
        kotlin.jvm.internal.o.f(encode, "encode(...)");
        return encode;
    }

    public final long b() {
        return ((java.lang.Number) ((jz5.n) this.f181840b).getValue()).longValue();
    }

    public final void c(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, int i19, boolean z17) {
        if (d() && str2 != null) {
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.webview.core.d1(str2, i17, this, str, z17, str3, i18, i19), "MicroMsg.WebPageErrorMonitor");
        }
    }

    public final boolean d() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if ((com.tencent.mars.xlog.Log.getLogLevel() <= 1 && z65.c.a()) || b() == 0 || b() == -1) {
            return true;
        }
        if (b() > 0) {
            jz5.g gVar = this.f181841c;
            return ((java.lang.Number) ((jz5.n) gVar).getValue()).longValue() > 0 && b() % ((java.lang.Number) ((jz5.n) gVar).getValue()).longValue() == 0;
        }
        return false;
    }
}
