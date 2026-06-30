package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f187119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.z f187120e;

    public c(com.tencent.mm.pointers.PBool pBool, com.tencent.xweb.z zVar) {
        this.f187119d = pBool;
        this.f187120e = zVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CommWebChromeClient", "onJsAlert, onConfirm");
        this.f187119d.value = true;
        this.f187120e.b();
    }
}
