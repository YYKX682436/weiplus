package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class d4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f182297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f182298e;

    public d4(com.tencent.mm.plugin.webview.luggage.jsapi.e4 e4Var, sd.b bVar, int i17) {
        this.f182297d = bVar;
        this.f182298e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        sd.d dVar;
        sd.b bVar = this.f182297d;
        if (bVar == null || (dVar = bVar.f406596a) == null) {
            return;
        }
        ((com.tencent.mm.plugin.webview.luggage.e0) dVar).z(this.f182298e);
    }
}
