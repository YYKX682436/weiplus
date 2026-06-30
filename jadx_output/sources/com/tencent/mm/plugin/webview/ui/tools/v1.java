package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class v1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.SDKOAuthGetA8KeyUI f186957e;

    public v1(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthGetA8KeyUI sDKOAuthGetA8KeyUI, java.lang.String str) {
        this.f186957e = sDKOAuthGetA8KeyUI;
        this.f186956d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.plugin.webview.ui.tools.SDKOAuthGetA8KeyUI.f183689n;
        com.tencent.mm.plugin.webview.ui.tools.SDKOAuthGetA8KeyUI sDKOAuthGetA8KeyUI = this.f186957e;
        sDKOAuthGetA8KeyUI.getClass();
        com.tencent.mm.opensdk.modelbiz.WXGetA8Key.Resp resp = new com.tencent.mm.opensdk.modelbiz.WXGetA8Key.Resp();
        resp.errStr = this.f186956d;
        resp.errCode = -1;
        sDKOAuthGetA8KeyUI.T6(resp, sDKOAuthGetA8KeyUI.f183693g);
        sDKOAuthGetA8KeyUI.finish();
    }
}
