package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class i implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI f156677d;

    public i(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI mobileRemitHistoryRecodUI) {
        this.f156677d = mobileRemitHistoryRecodUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f156677d.finish();
        return true;
    }
}
