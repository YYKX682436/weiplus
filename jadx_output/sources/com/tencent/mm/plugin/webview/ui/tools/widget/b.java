package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f187106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.z f187107e;

    public b(com.tencent.mm.pointers.PBool pBool, com.tencent.xweb.z zVar) {
        this.f187106d = pBool;
        this.f187107e = zVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CommWebChromeClient", "onJsAlert, onConfirm");
        this.f187106d.value = true;
        this.f187107e.b();
    }
}
