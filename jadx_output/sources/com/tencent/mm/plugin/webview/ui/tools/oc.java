package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class oc implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f186738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.z f186739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.tc f186740f;

    public oc(com.tencent.mm.plugin.webview.ui.tools.tc tcVar, com.tencent.mm.pointers.PBool pBool, com.tencent.xweb.z zVar) {
        this.f186740f = tcVar;
        this.f186738d = pBool;
        this.f186739e = zVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f186740f.f186913c.f183810d2);
        com.tencent.mm.pointers.PBool pBool = this.f186738d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onJsConfirm, onDismiss %d, %b", valueOf, java.lang.Boolean.valueOf(pBool.value));
        if (pBool.value) {
            return;
        }
        this.f186739e.a();
    }
}
