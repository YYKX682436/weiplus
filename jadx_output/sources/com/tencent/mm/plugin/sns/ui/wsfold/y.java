package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes3.dex */
public final class y implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3 f171458d;

    public y(com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3 snsWsFoldDetailUIV3) {
        this.f171458d = snsWsFoldDetailUIV3;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3$initActionBar$1");
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3 snsWsFoldDetailUIV3 = this.f171458d;
        snsWsFoldDetailUIV3.hideVKB();
        snsWsFoldDetailUIV3.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3$initActionBar$1");
        return false;
    }
}
