package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f183577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f183578e;

    public w(com.tencent.mm.plugin.webview.stub.s sVar, int i17, int i18) {
        this.f183577d = i17;
        this.f183578e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        gm0.j1.u().c().w(this.f183577d, java.lang.Integer.valueOf(this.f183578e));
    }
}
