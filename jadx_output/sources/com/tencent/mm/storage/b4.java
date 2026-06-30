package com.tencent.mm.storage;

/* loaded from: classes5.dex */
public final class b4 {
    public b4(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        if (!r26.n0.B(username, "@", false)) {
            return r26.i0.y(username, "gh_", false) ? "biz" : "normal";
        }
        java.lang.String str = (java.lang.String) kz5.n0.a0(r26.n0.f0(username, new java.lang.String[]{"@"}, false, 0, 6, null), 1);
        return str != null ? str : "other.at";
    }
}
