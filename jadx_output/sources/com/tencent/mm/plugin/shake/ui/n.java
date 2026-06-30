package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class n implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.ShakeItemListUI f162310d;

    public n(com.tencent.mm.plugin.shake.ui.ShakeItemListUI shakeItemListUI) {
        this.f162310d = shakeItemListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.shake.ui.ShakeItemListUI shakeItemListUI = this.f162310d;
        java.lang.String string = shakeItemListUI.getString(com.tencent.mm.R.string.i8f);
        com.tencent.mm.plugin.shake.ui.ShakeItemListUI shakeItemListUI2 = this.f162310d;
        db5.e1.K(shakeItemListUI, true, string, "", shakeItemListUI2.getString(com.tencent.mm.R.string.f490353sl), shakeItemListUI2.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.shake.ui.m(this), null);
        return true;
    }
}
