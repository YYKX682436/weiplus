package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class n implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.FavRecordDetailUI f155455d;

    public n(com.tencent.mm.plugin.record.ui.FavRecordDetailUI favRecordDetailUI) {
        this.f155455d = favRecordDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f155455d.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.record.ui.j(this);
        k0Var.f211881s = new com.tencent.mm.plugin.record.ui.m(this);
        k0Var.v();
        return true;
    }
}
