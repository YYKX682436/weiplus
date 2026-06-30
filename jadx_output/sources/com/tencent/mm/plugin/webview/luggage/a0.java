package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes7.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.LuggageMMLocalResourceProvider$GetLocalResourceInfoTask f182140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.io.PipedOutputStream f182141e;

    public a0(com.tencent.mm.plugin.webview.luggage.c0 c0Var, com.tencent.mm.plugin.webview.luggage.LuggageMMLocalResourceProvider$GetLocalResourceInfoTask luggageMMLocalResourceProvider$GetLocalResourceInfoTask, java.io.PipedOutputStream pipedOutputStream) {
        this.f182140d = luggageMMLocalResourceProvider$GetLocalResourceInfoTask;
        this.f182141e = pipedOutputStream;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.webview.luggage.z(this));
    }
}
