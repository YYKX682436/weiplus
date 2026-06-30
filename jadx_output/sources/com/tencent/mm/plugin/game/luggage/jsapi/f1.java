package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.g1 f139636e;

    public f1(com.tencent.mm.plugin.game.luggage.jsapi.g1 g1Var, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f139636e = g1Var;
        this.f139635d = q5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wepkg.event.h.b(this.f139636e.f139645e);
        this.f139635d.a("expired", null);
    }
}
