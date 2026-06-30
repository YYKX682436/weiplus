package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class q0 implements com.tencent.mm.plugin.webview.permission.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.r0 f181911a;

    public q0(com.tencent.mm.plugin.webview.core.r0 r0Var) {
        this.f181911a = r0Var;
    }

    @Override // com.tencent.mm.plugin.webview.permission.v
    public java.lang.String a() {
        com.tencent.mm.plugin.webview.core.r0 r0Var = this.f181911a;
        java.lang.String str = r26.n0.N(r0Var.G) ? r0Var.E : r0Var.G;
        boolean z17 = false;
        if (str != null) {
            if (str.length() > 0) {
                z17 = true;
            }
        }
        if (!z17) {
            java.lang.String url = r0Var.f181916a.getUrl();
            return url == null ? com.tencent.mm.plugin.webview.core.r0.Q0.a(r0Var.d0()) : url;
        }
        java.lang.String str2 = r26.n0.N(r0Var.G) ? r0Var.E : r0Var.G;
        kotlin.jvm.internal.o.d(str2);
        return str2;
    }

    @Override // com.tencent.mm.plugin.webview.permission.v
    public java.lang.String b() {
        return this.f181911a.E;
    }
}
