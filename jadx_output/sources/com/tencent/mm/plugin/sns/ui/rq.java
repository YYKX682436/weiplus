package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class rq implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsStarListUI f170430d;

    public rq(com.tencent.mm.plugin.sns.ui.SnsStarListUI snsStarListUI) {
        this.f170430d = snsStarListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsStarListUI$setStarListUITitle$1");
        kotlin.jvm.internal.o.g(it, "it");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.sns.ui.SnsStarListUI activity = this.f170430d;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.sns.SnsStarListUIC snsStarListUIC = (com.tencent.mm.plugin.sns.SnsStarListUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.sns.SnsStarListUIC.class);
        snsStarListUIC.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentCmdList", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentCmdList", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        intent.putExtra("sns_cmd_list", snsStarListUIC.f162552r);
        activity.setResult(-1, intent);
        activity.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsStarListUI$setStarListUITitle$1");
        return true;
    }
}
