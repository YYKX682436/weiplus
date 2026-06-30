package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182676e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f182677f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.a1 f182678g;

    public x0(com.tencent.mm.plugin.webview.luggage.a1 a1Var, java.lang.String str, java.lang.String str2, java.util.Map map) {
        this.f182678g = a1Var;
        this.f182675d = str;
        this.f182676e = str2;
        this.f182677f = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f182678g.f182142a.E(this.f182675d, this.f182676e, this.f182677f);
    }
}
