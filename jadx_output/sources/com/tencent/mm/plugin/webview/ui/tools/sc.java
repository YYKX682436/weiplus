package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class sc implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f186874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.z f186875e;

    public sc(com.tencent.mm.plugin.webview.ui.tools.tc tcVar, com.tencent.mm.pointers.PBool pBool, com.tencent.xweb.z zVar) {
        this.f186874d = pBool;
        this.f186875e = zVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onJsAlert, onDismiss");
        if (this.f186874d.value) {
            return;
        }
        this.f186875e.a();
    }
}
