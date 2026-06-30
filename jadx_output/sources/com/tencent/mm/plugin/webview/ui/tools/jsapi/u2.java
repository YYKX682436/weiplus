package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class u2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.m1 f185427d;

    public u2(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, com.tencent.mm.plugin.webview.model.m1 m1Var) {
        this.f185427d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f185427d);
    }
}
