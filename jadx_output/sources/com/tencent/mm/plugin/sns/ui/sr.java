package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes11.dex */
public class sr implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI f170483d;

    public sr(com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI snsTagPartlyUI) {
        this.f170483d = snsTagPartlyUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$1");
        this.f170483d.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$1");
        return true;
    }
}
