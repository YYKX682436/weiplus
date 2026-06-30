package com.tencent.mm.plugin.webview.ui.tools.floatball;

/* loaded from: classes8.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f184239a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f184240b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f184241c;

    /* renamed from: d, reason: collision with root package name */
    public final long f184242d;

    public y(java.lang.String rawUrl, java.lang.String str, java.lang.String key, long j17) {
        kotlin.jvm.internal.o.g(rawUrl, "rawUrl");
        kotlin.jvm.internal.o.g(key, "key");
        this.f184239a = rawUrl;
        this.f184240b = str;
        this.f184241c = key;
        this.f184242d = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.webview.ui.tools.floatball.y)) {
            return false;
        }
        com.tencent.mm.plugin.webview.ui.tools.floatball.y yVar = (com.tencent.mm.plugin.webview.ui.tools.floatball.y) obj;
        return kotlin.jvm.internal.o.b(this.f184239a, yVar.f184239a) && kotlin.jvm.internal.o.b(this.f184240b, yVar.f184240b) && kotlin.jvm.internal.o.b(this.f184241c, yVar.f184241c) && this.f184242d == yVar.f184242d;
    }

    public int hashCode() {
        int hashCode = this.f184239a.hashCode() * 31;
        java.lang.String str = this.f184240b;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f184241c.hashCode()) * 31) + java.lang.Long.hashCode(this.f184242d);
    }

    public java.lang.String toString() {
        return "WebViewFloatBallDataObject(rawUrl=" + this.f184239a + ", currentProcess=" + this.f184240b + ", key=" + this.f184241c + ", activeTime=" + this.f184242d + ')';
    }
}
