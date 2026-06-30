package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class w0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI f162339d;

    public w0(com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI shakeTvHistoryListUI) {
        this.f162339d = shakeTvHistoryListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI shakeTvHistoryListUI = this.f162339d;
        shakeTvHistoryListUI.hideVKB();
        shakeTvHistoryListUI.finish();
        return true;
    }
}
