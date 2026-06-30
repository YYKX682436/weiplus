package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public final class j3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f184852a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f184853b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f184854c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f184855d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f184856e;

    public j3(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        z18 = (i17 & 2) != 0 ? false : z18;
        z19 = (i17 & 4) != 0 ? false : z19;
        z27 = (i17 & 8) != 0 ? false : z27;
        z28 = (i17 & 16) != 0 ? false : z28;
        this.f184852a = z17;
        this.f184853b = z18;
        this.f184854c = z19;
        this.f184855d = z27;
        this.f184856e = z28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.webview.ui.tools.j3)) {
            return false;
        }
        com.tencent.mm.plugin.webview.ui.tools.j3 j3Var = (com.tencent.mm.plugin.webview.ui.tools.j3) obj;
        return this.f184852a == j3Var.f184852a && this.f184853b == j3Var.f184853b && this.f184854c == j3Var.f184854c && this.f184855d == j3Var.f184855d && this.f184856e == j3Var.f184856e;
    }

    public int hashCode() {
        return (((((((java.lang.Boolean.hashCode(this.f184852a) * 31) + java.lang.Boolean.hashCode(this.f184853b)) * 31) + java.lang.Boolean.hashCode(this.f184854c)) * 31) + java.lang.Boolean.hashCode(this.f184855d)) * 31) + java.lang.Boolean.hashCode(this.f184856e);
    }

    public java.lang.String toString() {
        return "UrlParams(immersiveStyle=" + this.f184852a + ", immersiveBgDark=" + this.f184853b + ", immersiveVideoStyle=" + this.f184854c + ", hideWebViewTitle=" + this.f184855d + ", fakeImmersiveStyle=" + this.f184856e + ')';
    }
}
