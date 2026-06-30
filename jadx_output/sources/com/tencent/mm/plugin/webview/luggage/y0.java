package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.a1 f182691e;

    public y0(com.tencent.mm.plugin.webview.luggage.a1 a1Var, java.lang.String str, java.lang.String str2) {
        this.f182691e = a1Var;
        this.f182690d = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f182691e.f182142a.f406655i.f406633i.loadData(this.f182690d, "text/html", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
    }
}
