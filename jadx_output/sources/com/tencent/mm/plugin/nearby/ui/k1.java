package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes3.dex */
public class k1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI f152154d;

    public k1(com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI nearbySayHiListUI) {
        this.f152154d = nearbySayHiListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI nearbySayHiListUI = this.f152154d;
        nearbySayHiListUI.hideVKB();
        nearbySayHiListUI.setResult(0);
        nearbySayHiListUI.finish();
        return true;
    }
}
