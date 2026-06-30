package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes12.dex */
public class b6 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.n0 f182275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182276e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.f6 f182277f;

    public b6(com.tencent.mm.plugin.webview.model.n0 n0Var, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.f6 f6Var) {
        this.f182275d = n0Var;
        this.f182276e = str;
        this.f182277f = f6Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.webview.modeltools.z.bj().i(this.f182275d);
        com.tencent.mm.plugin.webview.modeltools.z.bj().f(this.f182276e);
        this.f182277f.a(false, "", "");
    }
}
