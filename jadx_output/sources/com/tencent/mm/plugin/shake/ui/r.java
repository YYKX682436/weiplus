package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes4.dex */
public class r implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.ShakeItemListUI f162328d;

    public r(com.tencent.mm.plugin.shake.ui.ShakeItemListUI shakeItemListUI) {
        this.f162328d = shakeItemListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.shake.ui.ShakeItemListUI shakeItemListUI = this.f162328d;
        shakeItemListUI.hideVKB();
        shakeItemListUI.finish();
        return true;
    }
}
