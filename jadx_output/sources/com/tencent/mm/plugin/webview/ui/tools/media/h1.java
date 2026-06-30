package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final bw5.lp0 f185780a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f185781b;

    public h1(bw5.lp0 tingItem, java.lang.String srcId) {
        kotlin.jvm.internal.o.g(tingItem, "tingItem");
        kotlin.jvm.internal.o.g(srcId, "srcId");
        this.f185780a = tingItem;
        this.f185781b = srcId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.webview.ui.tools.media.h1)) {
            return false;
        }
        com.tencent.mm.plugin.webview.ui.tools.media.h1 h1Var = (com.tencent.mm.plugin.webview.ui.tools.media.h1) obj;
        return kotlin.jvm.internal.o.b(this.f185780a, h1Var.f185780a) && kotlin.jvm.internal.o.b(this.f185781b, h1Var.f185781b);
    }

    public int hashCode() {
        return (this.f185780a.hashCode() * 31) + this.f185781b.hashCode();
    }

    public java.lang.String toString() {
        return "WebViewListenItem(tingItem=" + this.f185780a + ", srcId=" + this.f185781b + ')';
    }
}
