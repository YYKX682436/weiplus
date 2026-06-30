package com.tencent.mm.plugin.webview.ui.tools.floatball;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f184194a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Bundle f184195b;

    public e(int i17, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(bundle, "bundle");
        this.f184194a = i17;
        this.f184195b = bundle;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.webview.ui.tools.floatball.e)) {
            return false;
        }
        com.tencent.mm.plugin.webview.ui.tools.floatball.e eVar = (com.tencent.mm.plugin.webview.ui.tools.floatball.e) obj;
        return this.f184194a == eVar.f184194a && kotlin.jvm.internal.o.b(this.f184195b, eVar.f184195b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f184194a) * 31) + this.f184195b.hashCode();
    }

    public java.lang.String toString() {
        return "JSApiInfo(id=" + this.f184194a + ", bundle=" + this.f184195b + ')';
    }
}
