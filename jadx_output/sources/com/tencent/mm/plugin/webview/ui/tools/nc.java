package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class nc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.z f185869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.tc f185870e;

    public nc(com.tencent.mm.plugin.webview.ui.tools.tc tcVar, com.tencent.xweb.z zVar) {
        this.f185870e = tcVar;
        this.f185869d = zVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f185869d.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onJsConfirm cancel %d", java.lang.Integer.valueOf(this.f185870e.f186913c.f183810d2));
    }
}
