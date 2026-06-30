package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class i9 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.ShareToQQWeiboUI f185202d;

    public i9(com.tencent.mm.plugin.webview.ui.tools.jsapi.ShareToQQWeiboUI shareToQQWeiboUI) {
        this.f185202d = shareToQQWeiboUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.ShareToQQWeiboUI shareToQQWeiboUI = this.f185202d;
        int intExtra = shareToQQWeiboUI.getIntent().getIntExtra("type", 0);
        java.lang.String stringExtra = shareToQQWeiboUI.getIntent().getStringExtra("shortUrl");
        java.lang.String obj = shareToQQWeiboUI.f184897e.getText().toString();
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.tencent.mm.modelsimple.e1 e1Var = new com.tencent.mm.modelsimple.e1(intExtra, stringExtra, obj);
        gm0.j1.d().g(e1Var);
        shareToQQWeiboUI.f184896d = db5.e1.Q(shareToQQWeiboUI.getContext(), shareToQQWeiboUI.getString(com.tencent.mm.R.string.f490573yv), shareToQQWeiboUI.getString(com.tencent.mm.R.string.lb6), true, true, new com.tencent.mm.plugin.webview.ui.tools.jsapi.h9(this, e1Var));
        return true;
    }
}
