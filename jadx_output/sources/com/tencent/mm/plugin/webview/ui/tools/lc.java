package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class lc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f185646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.z f185647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.tc f185648f;

    public lc(com.tencent.mm.plugin.webview.ui.tools.tc tcVar, com.tencent.mm.pointers.PBool pBool, com.tencent.xweb.z zVar) {
        this.f185648f = tcVar;
        this.f185646d = pBool;
        this.f185647e = zVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f185646d.value = true;
        this.f185647e.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onJsConfirm confirm %d", java.lang.Integer.valueOf(this.f185648f.f186913c.f183810d2));
    }
}
