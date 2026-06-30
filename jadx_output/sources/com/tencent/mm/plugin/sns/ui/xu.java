package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class xu implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUserUI f171585d;

    public xu(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI) {
        this.f171585d = snsUserUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$16");
        boolean booleanValue = com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr.W6().booleanValue();
        com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI = this.f171585d;
        if (booleanValue) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(snsUserUI, com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll.class);
            intent.putExtra("sns_msg_force_show_all", true);
            intent.putExtra("sns_msg_comment_list_scene", 2);
            intent.putExtra("sns_msg_can_update_to_read", true);
            snsUserUI.startActivityForResult(intent, 8);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$16");
            return true;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setClass(snsUserUI, com.tencent.mm.plugin.sns.ui.SnsMsgUI.class);
        intent2.putExtra("sns_msg_force_show_all", false);
        intent2.putExtra("sns_msg_can_update_to_read", true);
        intent2.putExtra("sns_msg_comment_list_scene", 2);
        snsUserUI.startActivityForResult(intent2, 8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$16");
        return true;
    }
}
