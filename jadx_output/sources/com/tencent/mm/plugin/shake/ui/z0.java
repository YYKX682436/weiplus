package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class z0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI f162360d;

    public z0(com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI shakeTvHistoryListUI) {
        this.f162360d = shakeTvHistoryListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI shakeTvHistoryListUI = this.f162360d;
        db5.e1.K(shakeTvHistoryListUI.getContext(), true, shakeTvHistoryListUI.getString(com.tencent.mm.R.string.j3l), "", shakeTvHistoryListUI.getString(com.tencent.mm.R.string.i8e), shakeTvHistoryListUI.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.shake.ui.x0(this), new com.tencent.mm.plugin.shake.ui.y0(this));
        return true;
    }
}
