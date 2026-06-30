package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class w5 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.n0 f185496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185498f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185499g;

    public w5(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, com.tencent.mm.plugin.webview.model.n0 n0Var, java.lang.String str, nw4.y2 y2Var) {
        this.f185499g = c1Var;
        this.f185496d = n0Var;
        this.f185497e = str;
        this.f185498f = y2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.webview.modeltools.z.bj().i(this.f185496d);
        com.tencent.mm.plugin.webview.modeltools.z.bj().e(this.f185497e);
        this.f185499g.i5(this.f185498f, "downloadImage:fail", null);
    }
}
