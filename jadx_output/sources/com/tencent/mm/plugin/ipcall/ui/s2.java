package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes.dex */
public class s2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallMyGiftCardUI f143004d;

    public s2(com.tencent.mm.plugin.ipcall.ui.IPCallMyGiftCardUI iPCallMyGiftCardUI) {
        this.f143004d = iPCallMyGiftCardUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.ipcall.ui.IPCallMyGiftCardUI iPCallMyGiftCardUI = this.f143004d;
        intent.putExtra("rawUrl", iPCallMyGiftCardUI.getString(com.tencent.mm.R.string.g3p));
        intent.putExtra("showShare", false);
        j45.l.j(iPCallMyGiftCardUI, "webview", ".ui.tools.WebViewUI", intent, null);
        return true;
    }
}
