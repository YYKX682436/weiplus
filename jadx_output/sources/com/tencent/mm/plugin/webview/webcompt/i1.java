package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class i1 {
    public i1(kotlin.jvm.internal.i iVar) {
    }

    public static final java.lang.String a(java.net.URL url) {
        kotlin.jvm.internal.o.f(url.getRef(), "getRef(...)");
        if (!r26.n0.N(r0)) {
            return "#" + url.getRef();
        }
        java.lang.String ref = url.getRef();
        kotlin.jvm.internal.o.f(ref, "getRef(...)");
        return ref;
    }
}
