package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class l2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185247f;

    public l2(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.lang.String str, nw4.y2 y2Var) {
        this.f185247f = c1Var;
        this.f185245d = str;
        this.f185246e = y2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).aj(this.f185245d);
        this.f185247f.i5(this.f185246e, "send_service_app_msg:fail", null);
    }
}
