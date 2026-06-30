package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class d implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f187141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.z f187142e;

    public d(com.tencent.mm.pointers.PBool pBool, com.tencent.xweb.z zVar) {
        this.f187141d = pBool;
        this.f187142e = zVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CommWebChromeClient", "onJsAlert, onDismiss");
        if (this.f187141d.value) {
            return;
        }
        this.f187142e.a();
    }
}
