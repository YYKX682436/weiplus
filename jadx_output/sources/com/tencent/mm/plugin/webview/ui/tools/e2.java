package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes15.dex */
public class e2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f184124e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI f184125f;

    public e2(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI sDKOAuthUI, java.lang.String str, boolean z17) {
        this.f184125f = sDKOAuthUI;
        this.f184123d = str;
        this.f184124e = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI sDKOAuthUI = this.f184125f;
        if (!sDKOAuthUI.f183734w) {
            sDKOAuthUI.V6(-1, this.f184123d);
        }
        if (this.f184124e) {
            sDKOAuthUI.finish();
        }
    }
}
