package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f182400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sd.b f182401e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182402f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f182403g;

    public n2(com.tencent.mm.plugin.webview.luggage.jsapi.o2 o2Var, boolean z17, sd.b bVar, java.lang.String str, android.os.Bundle bundle) {
        this.f182400d = z17;
        this.f182401e = bVar;
        this.f182402f = str;
        this.f182403g = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f182400d;
        android.os.Bundle bundle = this.f182403g;
        java.lang.String str = this.f182402f;
        sd.b bVar = this.f182401e;
        if (!z17) {
            ((sd.u) ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406612f).f406653a.g(str, bundle);
            return;
        }
        sd.w wVar = ((sd.u) ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406612f).f406653a;
        sd.v vVar = wVar.f406663d;
        sd.k kVar = vVar.size() == 0 ? null : (sd.k) vVar.pop();
        if (kVar != null) {
            wVar.j(kVar);
        }
        wVar.h(str, bundle, false);
    }
}
