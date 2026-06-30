package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class g9 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.ShareToQQWeiboUI f185142d;

    public g9(com.tencent.mm.plugin.webview.ui.tools.jsapi.ShareToQQWeiboUI shareToQQWeiboUI) {
        this.f185142d = shareToQQWeiboUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.ShareToQQWeiboUI shareToQQWeiboUI = this.f185142d;
        shareToQQWeiboUI.hideVKB();
        shareToQQWeiboUI.finish();
        return true;
    }
}
