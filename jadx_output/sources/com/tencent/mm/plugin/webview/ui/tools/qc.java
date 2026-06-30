package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class qc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f186780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.z f186781e;

    public qc(com.tencent.mm.plugin.webview.ui.tools.tc tcVar, com.tencent.mm.pointers.PBool pBool, com.tencent.xweb.z zVar) {
        this.f186780d = pBool;
        this.f186781e = zVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onJsAlert, onConfirm");
        this.f186780d.value = true;
        this.f186781e.b();
    }
}
