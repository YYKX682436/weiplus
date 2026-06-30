package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class c4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f182158a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f182159b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f182160c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.luggage.e0 f182161d;

    public c4(com.tencent.mm.plugin.webview.luggage.e0 e0Var) {
        this.f182161d = e0Var;
    }

    public final java.lang.String a(java.lang.String str) {
        int indexOf;
        return (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (indexOf = str.indexOf("#")) >= 0) ? str.substring(0, indexOf) : str;
    }

    public java.lang.String b() {
        java.lang.String u17 = this.f182161d.u();
        if (com.tencent.mm.sdk.platformtools.t8.K0(u17)) {
            return null;
        }
        return (java.lang.String) this.f182158a.get(a(u17));
    }
}
