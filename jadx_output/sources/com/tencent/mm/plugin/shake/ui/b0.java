package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class b0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.ShakeMsgListUI f162241d;

    public b0(com.tencent.mm.plugin.shake.ui.ShakeMsgListUI shakeMsgListUI) {
        this.f162241d = shakeMsgListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.shake.ui.ShakeMsgListUI shakeMsgListUI = this.f162241d;
        shakeMsgListUI.hideVKB();
        shakeMsgListUI.finish();
        return true;
    }
}
