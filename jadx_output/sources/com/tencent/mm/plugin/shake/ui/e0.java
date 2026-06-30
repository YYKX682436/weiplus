package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class e0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.ShakeMsgListUI f162255d;

    public e0(com.tencent.mm.plugin.shake.ui.ShakeMsgListUI shakeMsgListUI) {
        this.f162255d = shakeMsgListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.shake.ui.ShakeMsgListUI shakeMsgListUI = this.f162255d;
        db5.e1.K(shakeMsgListUI.getContext(), true, shakeMsgListUI.getString(com.tencent.mm.R.string.j2x), "", shakeMsgListUI.getString(com.tencent.mm.R.string.i8e), shakeMsgListUI.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.shake.ui.c0(this), new com.tencent.mm.plugin.shake.ui.d0(this));
        return true;
    }
}
