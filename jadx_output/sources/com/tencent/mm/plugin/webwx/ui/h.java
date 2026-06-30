package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes3.dex */
public class h implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI f188011d;

    public h(com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI extDeviceWXLoginUI) {
        this.f188011d = extDeviceWXLoginUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI extDeviceWXLoginUI = this.f188011d;
        if (extDeviceWXLoginUI.f187972r) {
            intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, extDeviceWXLoginUI.getString(com.tencent.mm.R.string.l7u));
        }
        intent.putExtra("rawUrl", extDeviceWXLoginUI.G + "&lang=" + com.tencent.mm.sdk.platformtools.m2.d());
        intent.putExtra("showShare", false);
        intent.putExtra("neverGetA8Key", false);
        j45.l.j(extDeviceWXLoginUI, "webview", ".ui.tools.WebViewUI", intent, null);
        return false;
    }
}
