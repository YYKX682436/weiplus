package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class s2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.g1 f185394d;

    public s2(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, com.tencent.mm.plugin.webview.model.g1 g1Var) {
        this.f185394d = g1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f185394d);
    }
}
