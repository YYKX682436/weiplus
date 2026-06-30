package com.tencent.mm.plugin.record.ui;

/* loaded from: classes9.dex */
public class i1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgFileUI f155419d;

    public i1(com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI) {
        this.f155419d = recordMsgFileUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f155419d.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.record.ui.g1(this);
        k0Var.f211881s = new com.tencent.mm.plugin.record.ui.h1(this);
        k0Var.v();
        return true;
    }
}
