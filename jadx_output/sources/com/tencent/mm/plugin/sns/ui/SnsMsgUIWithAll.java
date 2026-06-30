package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class SnsMsgUIWithAll extends com.tencent.mm.plugin.sns.ui.SnsMsgUI {

    /* renamed from: p0, reason: collision with root package name */
    public boolean f167288p0 = false;

    @Override // com.tencent.mm.plugin.sns.ui.SnsMsgUI
    public void d7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addRightOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.sns.ui.mm(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addRightOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsMsgUI
    public int h7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackGroundColorResource", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackGroundColorResource", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        return com.tencent.mm.R.color.f478489a;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsMsgUI
    public int k7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMMtitleStringId", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMMtitleStringId", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        return com.tencent.mm.R.string.f493198oj3;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsMsgUI
    public boolean n7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAlwaysEnableOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAlwaysEnableOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsMsgUI
    public boolean o7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEnableUpdateToReadOnDestroy", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnableUpdateToReadOnDestroy", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsMsgUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        super.onActivityResult(i17, i18, intent);
        if (i17 == 25 && i18 == -1) {
            if (intent == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
                return;
            }
            boolean booleanExtra = intent.getBooleanExtra("is_clear_all_msg", false);
            this.f167288p0 = booleanExtra;
            if (booleanExtra) {
                com.tencent.mm.plugin.appbrand.utils.d5.b(new com.tencent.mm.plugin.sns.ui.nm(this));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsMsgUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUIWithAll", "onBackPressed");
        if (this.B && com.tencent.mm.plugin.sns.model.l4.Aj().f() > 0) {
            com.tencent.mm.plugin.sns.model.l4.Aj().p1();
        }
        u7(-1, this.f167288p0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsMsgUI
    public void r7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBackBtnListener", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        setBackBtn(new com.tencent.mm.plugin.sns.ui.lm(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBackBtnListener", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsMsgUI
    public void t7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMsgListBackground", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        android.widget.ListView listView = this.f167267d;
        if (listView != null) {
            listView.setBackgroundColor(getColor(com.tencent.mm.R.color.f478489a));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMsgListBackground", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
    }

    public final void u7(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finishWithResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("is_clear_all_msg", z17);
        intent.putExtra("sns_cmd_list", this.f167280t);
        intent.putStringArrayListExtra("sns_msg_forbid_access_snsid_list", new java.util.ArrayList<>(i7()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finishWithResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        setResult(i17, intent);
        finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finishWithResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finishWithResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
    }
}
