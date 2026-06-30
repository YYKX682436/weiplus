package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class an implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsNotInterestUI f167777d;

    public an(com.tencent.mm.plugin.sns.ui.SnsNotInterestUI snsNotInterestUI) {
        this.f167777d = snsNotInterestUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI$1");
        this.f167777d.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI$1");
        return true;
    }
}
