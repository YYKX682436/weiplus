package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public final class c3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.SDKOAuthWechatUI f184028d;

    public c3(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthWechatUI sDKOAuthWechatUI) {
        this.f184028d = sDKOAuthWechatUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f184028d.finish();
        return true;
    }
}
