package com.tencent.mm.plugin.record.ui;

/* loaded from: classes4.dex */
public class j0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgBaseUI f155421d;

    public j0(com.tencent.mm.plugin.record.ui.RecordMsgBaseUI recordMsgBaseUI) {
        this.f155421d = recordMsgBaseUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f155421d.finish();
        return true;
    }
}
