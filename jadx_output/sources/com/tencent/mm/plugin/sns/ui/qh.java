package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class qh implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentUI f170342d;

    public qh(com.tencent.mm.plugin.sns.ui.SnsCommentUI snsCommentUI) {
        this.f170342d = snsCommentUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$2");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsCommentUI.f167138o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        com.tencent.mm.plugin.sns.ui.SnsCommentUI snsCommentUI = this.f170342d;
        int i18 = snsCommentUI.f167142g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        if (i18 == 0) {
            ip.c.m();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        int i19 = snsCommentUI.f167142g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        int n17 = i19 == 2 ? 200 : ip.c.n();
        fl5.j g17 = fl5.j.g(com.tencent.mm.plugin.sns.ui.SnsCommentUI.T6(snsCommentUI));
        g17.f42561f = 0;
        g17.f42560e = n17;
        g17.f42556a = true;
        g17.d(new com.tencent.mm.plugin.sns.ui.ph(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$2");
        return false;
    }
}
