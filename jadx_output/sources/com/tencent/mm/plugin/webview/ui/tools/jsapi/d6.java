package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class d6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185055f;

    public d6(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var, java.lang.String str) {
        this.f185055f = c1Var;
        this.f185053d = y2Var;
        this.f185054e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f185055f.i5(this.f185053d, this.f185054e + ":cancel", null);
    }
}
