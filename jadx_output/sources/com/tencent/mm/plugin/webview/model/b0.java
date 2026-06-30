package com.tencent.mm.plugin.webview.model;

/* loaded from: classes.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182782e;

    public b0(com.tencent.mm.plugin.webview.model.c0 c0Var, java.lang.String str, java.lang.String str2) {
        this.f182781d = str;
        this.f182782e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.model.j0.a(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f182781d, this.f182782e, null);
    }
}
