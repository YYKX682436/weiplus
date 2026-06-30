package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes11.dex */
public class or implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsTagDetailUI f170120d;

    public or(com.tencent.mm.plugin.sns.ui.SnsTagDetailUI snsTagDetailUI) {
        this.f170120d = snsTagDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$6");
        this.f170120d.X6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$6");
        return true;
    }
}
