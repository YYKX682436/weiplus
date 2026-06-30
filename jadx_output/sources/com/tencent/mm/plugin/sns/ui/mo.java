package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes10.dex */
public class mo implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI f169928d;

    public mo(com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI snsSelectChatRoomUI) {
        this.f169928d = snsSelectChatRoomUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI$1");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI.F;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI snsSelectChatRoomUI = this.f169928d;
        java.util.ArrayList x76 = snsSelectChatRoomUI.x7(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        snsSelectChatRoomUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleSelect", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSelectChatRoomUI", "sns post who can see scene,users=%s", x76.toString());
        java.util.ArrayList x77 = snsSelectChatRoomUI.x7(false);
        x77.remove(c01.z1.r());
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(x77, ",");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("select_chatrooms", c17);
        snsSelectChatRoomUI.setResult(-1, intent);
        snsSelectChatRoomUI.finish();
        snsSelectChatRoomUI.b7().notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleSelect", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI$1");
        return true;
    }
}
