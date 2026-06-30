package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.core.BaseWebViewController$WebAction f181787a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f181788b;

    public e(com.tencent.mm.plugin.webview.core.BaseWebViewController$WebAction action, yz5.a block) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(block, "block");
        this.f181787a = action;
        this.f181788b = block;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.webview.core.e)) {
            return false;
        }
        com.tencent.mm.plugin.webview.core.e eVar = (com.tencent.mm.plugin.webview.core.e) obj;
        return kotlin.jvm.internal.o.b(this.f181787a, eVar.f181787a) && kotlin.jvm.internal.o.b(this.f181788b, eVar.f181788b);
    }

    public int hashCode() {
        return (this.f181787a.hashCode() * 31) + this.f181788b.hashCode();
    }

    public java.lang.String toString() {
        return "WebEvent(action=" + this.f181787a + ", block=" + this.f181788b + ')';
    }
}
