package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class SnsMsgUIWithRelevance extends com.tencent.mm.plugin.sns.ui.SnsMsgUI {
    @Override // com.tencent.mm.plugin.sns.ui.SnsMsgUI
    public void d7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addRightOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addRightOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsMsgUI
    public com.tencent.mm.plugin.sns.ui.bm e7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSnsMsgAdapter", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
        com.tencent.mm.plugin.sns.ui.rm rmVar = new com.tencent.mm.plugin.sns.ui.rm(this, this, new com.tencent.mm.plugin.sns.storage.v1());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSnsMsgAdapter", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
        return rmVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsMsgUI
    public int h7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackGroundColorResource", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackGroundColorResource", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
        return com.tencent.mm.R.color.f478489a;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsMsgUI
    public int j7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getListFooterLayoutId", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getListFooterLayoutId", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
        return com.tencent.mm.R.layout.ep7;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsMsgUI
    public int k7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMMtitleStringId", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMMtitleStringId", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
        return com.tencent.mm.R.string.jcy;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsMsgUI
    public boolean m7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAllMsgFooter", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAllMsgFooter", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsMsgUI
    public boolean o7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEnableUpdateToReadOnDestroy", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnableUpdateToReadOnDestroy", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsMsgUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
        super.onActivityResult(i17, i18, intent);
        if (i17 == 24 && i18 == -1) {
            if (intent == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
                return;
            } else if (intent.getBooleanExtra("is_clear_all_msg", false)) {
                com.tencent.mm.plugin.appbrand.utils.d5.b(new com.tencent.mm.plugin.sns.ui.pm(this));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsMsgUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
        if (this.B && com.tencent.mm.plugin.sns.model.l4.Aj().f1() > 0) {
            com.tencent.mm.plugin.sns.model.l4.Aj().p1();
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_cmd_list", this.f167280t);
        setResult(-1, intent);
        finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsMsgUI
    public void p7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onListFooterClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showSnsMsgWithAll", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this, com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll.class);
        intent.putExtra("sns_msg_force_show_all", true);
        intent.putExtra("sns_msg_comment_list_scene", 1);
        intent.putExtra("sns_msg_can_update_to_read", false);
        intent.putStringArrayListExtra("sns_msg_forbid_access_snsid_list", new java.util.ArrayList<>(i7()));
        startActivityForResult(intent, 24);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showSnsMsgWithAll", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onListFooterClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsMsgUI
    public void r7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBackBtnListener", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
        setBackBtn(new com.tencent.mm.plugin.sns.ui.om(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBackBtnListener", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsMsgUI
    public void t7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMsgListBackground", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
        android.widget.ListView listView = this.f167267d;
        if (listView != null) {
            listView.setBackgroundColor(getColor(com.tencent.mm.R.color.f478489a));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMsgListBackground", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
    }
}
