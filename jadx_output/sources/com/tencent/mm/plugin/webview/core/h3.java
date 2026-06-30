package com.tencent.mm.plugin.webview.core;

/* loaded from: classes7.dex */
public final class h3 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f181845a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f181846b;

    public h3(boolean z17, boolean z18) {
        this.f181845a = z17;
        this.f181846b = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.webview.core.h3)) {
            return false;
        }
        com.tencent.mm.plugin.webview.core.h3 h3Var = (com.tencent.mm.plugin.webview.core.h3) obj;
        return this.f181845a == h3Var.f181845a && this.f181846b == h3Var.f181846b;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f181845a) * 31) + java.lang.Boolean.hashCode(this.f181846b);
    }

    public java.lang.String toString() {
        return "OverrideUrlResult(override=" + this.f181845a + ", result=" + this.f181846b + ')';
    }
}
