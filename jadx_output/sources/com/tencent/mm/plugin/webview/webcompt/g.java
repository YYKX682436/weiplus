package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f187815a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.webcompt.f f187816b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.webcompt.d f187817c;

    public g(java.lang.String uri, com.tencent.mm.plugin.webview.webcompt.f resType, com.tencent.mm.plugin.webview.webcompt.d debugType) {
        kotlin.jvm.internal.o.g(uri, "uri");
        kotlin.jvm.internal.o.g(resType, "resType");
        kotlin.jvm.internal.o.g(debugType, "debugType");
        this.f187815a = uri;
        this.f187816b = resType;
        this.f187817c = debugType;
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[script]\n                ");
        com.tencent.mm.plugin.webview.webcompt.f fVar = com.tencent.mm.plugin.webview.webcompt.f.f187791d;
        com.tencent.mm.plugin.webview.webcompt.f fVar2 = this.f187816b;
        if (fVar2 != fVar) {
            str = "resType: " + fVar2;
        } else {
            str = "debugType: " + this.f187817c;
        }
        sb6.append(str);
        sb6.append("\n                ");
        sb6.append(this.f187815a);
        sb6.append("\n                ");
        return r26.b0.b(sb6.toString());
    }

    public /* synthetic */ g(java.lang.String str, com.tencent.mm.plugin.webview.webcompt.f fVar, com.tencent.mm.plugin.webview.webcompt.d dVar, int i17, kotlin.jvm.internal.i iVar) {
        this(str, (i17 & 2) != 0 ? com.tencent.mm.plugin.webview.webcompt.f.f187791d : fVar, (i17 & 4) != 0 ? com.tencent.mm.plugin.webview.webcompt.d.f187772d : dVar);
    }
}
