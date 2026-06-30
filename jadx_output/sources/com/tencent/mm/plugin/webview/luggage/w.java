package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.o0 f182640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182641e;

    public w(sd.o0 o0Var, java.lang.String str) {
        this.f182640d = o0Var;
        this.f182641e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f182640d.c(new com.tencent.mm.plugin.webview.luggage.v(this));
    }
}
