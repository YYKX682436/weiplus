package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class rh implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentUI f170421d;

    public rh(com.tencent.mm.plugin.sns.ui.SnsCommentUI snsCommentUI) {
        this.f170421d = snsCommentUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$3");
        com.tencent.mm.plugin.sns.ui.SnsCommentUI snsCommentUI = this.f170421d;
        snsCommentUI.hideVKB();
        snsCommentUI.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$3");
        return true;
    }
}
