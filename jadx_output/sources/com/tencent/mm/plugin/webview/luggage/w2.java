package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class w2 implements td.c {

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.luggage.e0 f182657c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.permission.d f182658d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f182659e = new java.util.HashSet();

    public w2(com.tencent.mm.plugin.webview.luggage.e0 e0Var, com.tencent.mm.plugin.webview.permission.d dVar) {
        this.f182657c = e0Var;
        this.f182658d = dVar;
    }

    @Override // td.c
    public void a(java.lang.String str, td.e eVar) {
        eVar.a(td.d.PASS);
    }

    @Override // td.c
    public void b(java.lang.String str, td.e eVar) {
        java.util.HashSet hashSet = (java.util.HashSet) this.f182659e;
        boolean contains = hashSet.contains(str);
        td.d dVar = td.d.PASS;
        if (contains) {
            hashSet.remove(str);
            eVar.a(dVar);
            return;
        }
        java.lang.String u17 = this.f182657c.u();
        com.tencent.mm.plugin.webview.permission.d dVar2 = this.f182658d;
        dVar2.getClass();
        o45.m b17 = o45.vf.b(str);
        if (!(dVar2.h(u17).d(b17 == null ? -1 : b17.f342978c) == 1)) {
            dVar = td.d.REJECT;
        }
        eVar.a(dVar);
    }
}
