package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes11.dex */
public class c1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI f152130d;

    public c1(com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI nearbySayHiListUI) {
        this.f152130d = nearbySayHiListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).Ni(8L);
        com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI nearbySayHiListUI = this.f152130d;
        db5.e1.K(nearbySayHiListUI.getContext(), true, nearbySayHiListUI.getResources().getString(com.tencent.mm.R.string.i8f), "", nearbySayHiListUI.getResources().getString(com.tencent.mm.R.string.i8e), nearbySayHiListUI.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.nearby.ui.a1(this), new com.tencent.mm.plugin.nearby.ui.b1(this));
        return true;
    }
}
