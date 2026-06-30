package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes4.dex */
public class u0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI f162336d;

    public u0(com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI shakeSayHiListUI) {
        this.f162336d = shakeSayHiListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI shakeSayHiListUI = this.f162336d;
        shakeSayHiListUI.hideVKB();
        shakeSayHiListUI.finish();
        return true;
    }
}
