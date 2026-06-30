package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public class w1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.l2 f183165d;

    public w1(com.tencent.mm.plugin.webview.model.l2 l2Var) {
        this.f183165d = l2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OauthAuthorizeLogic", "doOauthAuthorize user cancel");
        ((com.tencent.mm.plugin.webview.core.o2) this.f183165d).a();
    }
}
