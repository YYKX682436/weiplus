package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes7.dex */
public final class m implements com.tencent.mm.vfs.t6 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.webcompt.m f187860a = new com.tencent.mm.plugin.webview.webcompt.m();

    @Override // com.tencent.mm.vfs.t6
    public final boolean accept(com.tencent.mm.vfs.r6 filter) {
        kotlin.jvm.internal.o.g(filter, "filter");
        if (!filter.A()) {
            return false;
        }
        java.lang.String name = filter.getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        if (!r26.i0.n(name, ".js", false)) {
            java.lang.String name2 = filter.getName();
            kotlin.jvm.internal.o.f(name2, "getName(...)");
            if (!r26.i0.n(name2, ".json", false)) {
                return false;
            }
        }
        return true;
    }
}
