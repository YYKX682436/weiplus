package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes3.dex */
public final class sa implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI f170447d;

    public sa(com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI snsAdLBSAuthManagerUI) {
        this.f170447d = snsAdLBSAuthManagerUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI$onCreate$1");
        kotlin.jvm.internal.o.g(it, "it");
        this.f170447d.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI$onCreate$1");
        return true;
    }
}
