package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sd.b f182461e;

    public t2(com.tencent.mm.plugin.webview.luggage.jsapi.u2 u2Var, java.lang.String str, sd.b bVar) {
        this.f182460d = str;
        this.f182461e = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str = this.f182460d;
        bundle.putString("rawUrl", str);
        sd.b bVar = this.f182461e;
        bundle.putBoolean("from_find_more_friend", ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406657n.getBoolean("from_find_more_friend", false));
        ((sd.u) ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406612f).f406653a.g(str, bundle);
    }
}
