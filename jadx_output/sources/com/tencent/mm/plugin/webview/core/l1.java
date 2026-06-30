package com.tencent.mm.plugin.webview.core;

/* loaded from: classes7.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.core.l1 f181867d = new com.tencent.mm.plugin.webview.core.l1();

    public l1() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString it = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String str = it.f68406d;
        if (str == null || r26.n0.N(str)) {
            com.tencent.mm.plugin.webview.core.n1.f181895e = false;
        } else {
            com.tencent.mm.plugin.webview.core.n1 n1Var = com.tencent.mm.plugin.webview.core.n1.f181891a;
            java.lang.String value = it.f68406d;
            kotlin.jvm.internal.o.f(value, "value");
            ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) com.tencent.mm.plugin.webview.core.n1.f181894d).getValue()).D("AdWUID", value);
        }
        return jz5.f0.f302826a;
    }
}
