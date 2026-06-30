package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes8.dex */
public class hf implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI f168503d;

    public hf(com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI snsChatRoomMemberUI) {
        this.f168503d = snsChatRoomMemberUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$3");
        com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI snsChatRoomMemberUI = this.f168503d;
        snsChatRoomMemberUI.setResult(0);
        snsChatRoomMemberUI.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$3");
        return true;
    }
}
