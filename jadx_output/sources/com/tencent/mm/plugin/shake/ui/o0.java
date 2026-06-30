package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class o0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI f162315d;

    public o0(com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI shakeSayHiListUI) {
        this.f162315d = shakeSayHiListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI shakeSayHiListUI = this.f162315d;
        db5.e1.K(shakeSayHiListUI.getContext(), true, shakeSayHiListUI.getString(com.tencent.mm.R.string.i8f), "", shakeSayHiListUI.getString(com.tencent.mm.R.string.i8e), shakeSayHiListUI.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.shake.ui.m0(this), new com.tencent.mm.plugin.shake.ui.n0(this));
        return true;
    }
}
