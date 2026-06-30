package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class r7 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185383e;

    public r7(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var) {
        this.f185383e = c1Var;
        this.f185382d = y2Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f185383e.i5(this.f185382d, "makePhoneCall:dialog dismiss", null);
    }
}
