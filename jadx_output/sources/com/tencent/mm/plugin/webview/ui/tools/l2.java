package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class l2 implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI f185627d;

    public l2(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI sDKOAuthUI) {
        this.f185627d = sDKOAuthUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI sDKOAuthUI = this.f185627d;
        android.view.View findViewById = sDKOAuthUI.f183727p.findViewById(((java.lang.Integer) obj).intValue());
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.bottomMargin = sDKOAuthUI.getResources().getDimensionPixelSize(((java.lang.Integer) obj2).intValue());
        findViewById.setLayoutParams(layoutParams);
        return null;
    }
}
