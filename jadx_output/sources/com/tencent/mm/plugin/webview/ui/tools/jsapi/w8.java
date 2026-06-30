package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class w8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.e9 f185504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185505e;

    public w8(com.tencent.mm.plugin.webview.ui.tools.jsapi.e9 e9Var, nw4.y2 y2Var) {
        this.f185504d = e9Var;
        this.f185505e = y2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f185504d.f185084a.i5(this.f185505e, "cancel", kz5.b1.e(new jz5.l("err_msg", "cancel")));
    }
}
