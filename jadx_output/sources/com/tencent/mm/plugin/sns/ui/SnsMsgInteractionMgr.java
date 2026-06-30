package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class SnsMsgInteractionMgr extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f167263d;

    /* renamed from: e, reason: collision with root package name */
    public long f167264e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f167265f = false;

    public static java.lang.Boolean W6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEnableSnsMsgUIWithRelevance", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_msg_ui_with_relevance, true));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnableSnsMsgUIWithRelevance", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        return valueOf;
    }

    public static java.lang.Boolean X6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isOnlyReminderMyInteraction", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        if (W6().booleanValue()) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf((c01.z1.i() & 274877906944L) != 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOnlyReminderMyInteraction", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
            return valueOf;
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOnlyReminderMyInteraction", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        return bool;
    }

    public final void V6(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finishWithResult", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("is_clear_all_msg", z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finishWithResult", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        setResult(i17, intent);
        finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finishWithResult", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finishWithResult", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        return com.tencent.mm.R.xml.f494952dp;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        setMMTitle(getString(com.tencent.mm.R.string.ojr));
        this.f167263d = getPreferenceScreen();
        setBackBtn(new com.tencent.mm.plugin.sns.ui.gl(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgInteractionMgr", "onBackPressed");
        V6(-1, this.f167265f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        super.onCreate(bundle);
        this.f167264e = c01.z1.i();
        initView();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initMsgManagementPageReport", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.SNSMessageManagementPage);
        aVar.dk(this, "SNSMessageManagementPage");
        aVar.ik(this, 12, 33050);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initMsgManagementPageReport", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        super.onDestroy();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        java.lang.String str = preference.f197780q;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgInteractionMgr", "onPreferenceTreeClick key:%s", str);
        str.getClass();
        if (!str.equals("settings_mutual_interaction_switch")) {
            if (!str.equals("settings_clear_all_msg")) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
                return false;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearAllMessage", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
            this.f167265f = true;
            com.tencent.mm.plugin.sns.storage.w1 Aj = com.tencent.mm.plugin.sns.model.l4.Aj();
            Aj.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("delAll", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            Aj.f166156d.A("SnsComment", "delete from SnsComment");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("delAll", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgInteractionMgr", "clear all msg");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearAllMessage", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("goToSwitchMsgInteraction", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f167263d).h("settings_mutual_interaction_switch");
        if (checkBoxPreference != null) {
            boolean N = checkBoxPreference.N();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateMutualInteractionStatus", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgInteractionMgr", "updateMutualInteractionStatus, lastExtStatus2:" + this.f167264e + " onlyReminderMyInteraction:" + N);
            if (N) {
                this.f167264e |= 274877906944L;
            } else {
                this.f167264e &= -274877906945L;
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(this.f167264e));
            bn0.g.f22779a.g("USERINFO_EXT_STATUS2_LONG_SYNC", this.f167264e);
            int i17 = N ? 1 : 2;
            r45.p53 p53Var = new r45.p53();
            p53Var.f382761d = 98;
            p53Var.f382762e = i17;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgInteractionMgr", "switch ext change : onlyReminderMyInteraction = " + N + " item value = " + p53Var.f382762e + " functionId = " + p53Var.f382761d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateMutualInteractionStatus", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("mutual_interact_switch_type", java.lang.Integer.valueOf(checkBoxPreference.N() ? 1 : 0));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("sns_mutual_interact_switch", "view_clk", hashMap, 33050);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("goToSwitchMsgInteraction", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        super.onResume();
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f167263d).h("settings_mutual_interaction_switch");
        if (checkBoxPreference != null) {
            boolean z17 = (this.f167264e & 274877906944L) != 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgInteractionMgr", "onResume only reminder my interaction:%s", java.lang.Boolean.valueOf(z17));
            checkBoxPreference.O(z17);
            checkBoxPreference.f197785v = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
    }
}
