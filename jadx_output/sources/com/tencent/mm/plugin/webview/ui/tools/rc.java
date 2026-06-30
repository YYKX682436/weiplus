package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class rc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f186821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.z f186822e;

    public rc(com.tencent.mm.plugin.webview.ui.tools.tc tcVar, com.tencent.mm.pointers.PBool pBool, com.tencent.xweb.z zVar) {
        this.f186821d = pBool;
        this.f186822e = zVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onJsAlert, onConfirm");
        this.f186821d.value = true;
        this.f186822e.b();
    }
}
