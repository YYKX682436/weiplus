package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class b2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SelectSexUI f160853d;

    public b2(com.tencent.mm.plugin.setting.ui.setting.SelectSexUI selectSexUI) {
        this.f160853d = selectSexUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SelectSexUI selectSexUI = this.f160853d;
        selectSexUI.hideVKB();
        selectSexUI.finish();
        return true;
    }
}
