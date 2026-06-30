package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class t0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f155485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgDetailUI f155486e;

    public t0(com.tencent.mm.plugin.record.ui.RecordMsgDetailUI recordMsgDetailUI, boolean z17) {
        this.f155486e = recordMsgDetailUI;
        this.f155485d = z17;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.record.ui.RecordMsgDetailUI recordMsgDetailUI = this.f155486e;
        com.tencent.mm.modelstat.b.b(recordMsgDetailUI.f155278w, 1);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) recordMsgDetailUI.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.record.ui.p0(this);
        k0Var.C = new com.tencent.mm.plugin.record.ui.q0(this);
        k0Var.f211881s = new com.tencent.mm.plugin.record.ui.s0(this);
        k0Var.v();
        return true;
    }
}
