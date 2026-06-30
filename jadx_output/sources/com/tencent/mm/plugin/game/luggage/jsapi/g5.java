package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public final class g5 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139653d;

    public g5(com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f139653d = q5Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f139653d.a("cancel", null);
    }
}
