package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public final class k5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f139702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139703e;

    public k5(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f139702d = u3Var;
        this.f139703e = q5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f139702d.dismiss();
        this.f139703e.a(null, null);
    }
}
