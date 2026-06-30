package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class mc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f185701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.z f185702e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.tc f185703f;

    public mc(com.tencent.mm.plugin.webview.ui.tools.tc tcVar, com.tencent.mm.pointers.PBool pBool, com.tencent.xweb.z zVar) {
        this.f185703f = tcVar;
        this.f185701d = pBool;
        this.f185702e = zVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f185701d.value = true;
        this.f185702e.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onJsConfirm confirm %d", java.lang.Integer.valueOf(this.f185703f.f186913c.f183810d2));
    }
}
