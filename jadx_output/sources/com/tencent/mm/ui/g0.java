package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class g0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AllRemindMsgUI f208614d;

    public g0(com.tencent.mm.ui.AllRemindMsgUI allRemindMsgUI) {
        this.f208614d = allRemindMsgUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f208614d.onBackPressed();
        return true;
    }
}
