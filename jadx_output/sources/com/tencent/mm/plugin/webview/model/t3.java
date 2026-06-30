package com.tencent.mm.plugin.webview.model;

/* loaded from: classes.dex */
public final class t3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f183121a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f183122b;

    public t3(java.lang.String str, java.lang.String str2) {
        this.f183121a = str;
        this.f183122b = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.webview.model.t3)) {
            return false;
        }
        com.tencent.mm.plugin.webview.model.t3 t3Var = (com.tencent.mm.plugin.webview.model.t3) obj;
        return kotlin.jvm.internal.o.b(this.f183121a, t3Var.f183121a) && kotlin.jvm.internal.o.b(this.f183122b, t3Var.f183122b);
    }

    public int hashCode() {
        java.lang.String str = this.f183121a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f183122b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "WebViewDownloadInfo(bizInfo=" + this.f183121a + ", sourceInfo=" + this.f183122b + ')';
    }
}
