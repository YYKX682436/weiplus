package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class n0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgDetailUI f155456d;

    public n0(com.tencent.mm.plugin.record.ui.RecordMsgDetailUI recordMsgDetailUI) {
        this.f155456d = recordMsgDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f155456d.finish();
        return true;
    }
}
