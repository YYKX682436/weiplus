package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.o0 f182240d;

    public j2(sd.o0 o0Var) {
        this.f182240d = o0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f182240d.a();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LuggageWebCoreStash", e17, "", new java.lang.Object[0]);
        }
    }
}
