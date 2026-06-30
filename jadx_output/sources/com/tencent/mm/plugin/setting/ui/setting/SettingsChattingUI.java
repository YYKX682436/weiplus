package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class SettingsChattingUI extends com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference {

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f160369g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.setting.ui.setting.b f160370h;

    public SettingsChattingUI() {
        new com.tencent.wcdb.support.CancellationSignal();
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference
    public int V6() {
        return 2;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494937c5;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.iq6);
        this.f160369g = getPreferenceScreen();
        if (gm0.j1.u().c().q(89, 0) != 2) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160369g).w("settings_recovery");
        }
        ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Ui();
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) this.f160369g).h("settings_bak_chat");
        if (h17 != null) {
            h17.J(com.tencent.mm.R.string.f493034oh4);
        }
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.w9(this));
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference, com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (gm0.j1.b().m()) {
            initView();
        } else {
            finish();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.setting.ui.setting.g gVar = com.tencent.mm.plugin.setting.ui.setting.g.f161052a;
        if (this.f160370h == null) {
            this.f160370h = new com.tencent.mm.plugin.setting.ui.setting.e(this.f160369g, "settings_bak_chat");
        }
        gVar.d(this.f160370h);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        str.getClass();
        boolean z17 = true;
        char c17 = 65535;
        switch (str.hashCode()) {
            case -1776646462:
                if (str.equals("settings_chatting_bg")) {
                    c17 = 0;
                    break;
                }
                break;
            case -1565531065:
                if (str.equals("settings_bak_chat")) {
                    c17 = 1;
                    break;
                }
                break;
            case -1550690765:
                if (str.equals("settings_reset")) {
                    c17 = 2;
                    break;
                }
                break;
            case -1439483675:
                if (str.equals("settings_voice_play_mode")) {
                    c17 = 3;
                    break;
                }
                break;
            case -409015247:
                if (str.equals("settings_recovery")) {
                    c17 = 4;
                    break;
                }
                break;
            case 624882802:
                if (str.equals("settings_enter_button_send")) {
                    c17 = 5;
                    break;
                }
                break;
            case 1789437336:
                if (str.equals("settings_emoji_manager")) {
                    c17 = 6;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                android.content.Intent intent = new android.content.Intent();
                intent.setClass(this, com.tencent.mm.plugin.setting.ui.setting.SettingsChattingBackgroundUI.class);
                androidx.appcompat.app.AppCompatActivity context = getContext();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsChattingUI", "goTosetChattingBackground", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/setting/ui/setting/SettingsChattingUI", "goTosetChattingBackground", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                break;
            case 1:
                ((com.tencent.mm.ui.base.preference.h0) this.f160369g).notifyDataSetChanged();
                android.content.Intent className = new android.content.Intent().setClassName(getContext(), "com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(className);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsChattingUI", "goToBackup", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsChattingUI", "goToBackup", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                break;
            case 2:
                com.tencent.mars.xlog.Log.i("MicroMsg.SettingsChattingUI", "Clean all messages do confirm.");
                androidx.appcompat.app.AppCompatActivity context2 = getContext();
                android.content.Intent className2 = new android.content.Intent().setClassName(this, "com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI");
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(className2);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(context2, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsChattingUI", "goTosetReset", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList3.get(0));
                yj0.a.f(context2, "com/tencent/mm/plugin/setting/ui/setting/SettingsChattingUI", "goTosetReset", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                break;
            case 3:
                gm0.j1.u().c().w(26, java.lang.Boolean.valueOf(!((java.lang.Boolean) gm0.j1.u().c().l(26, java.lang.Boolean.FALSE)).booleanValue()));
                break;
            case 4:
                android.content.Intent className3 = new android.content.Intent().setClassName(getContext(), "com.tencent.mm.plugin.dbbackup.DBRecoveryUI");
                className3.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
                androidx.appcompat.app.AppCompatActivity context3 = getContext();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(className3);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(context3, arrayList4.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsChattingUI", "goToRecovery", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context3.startActivity((android.content.Intent) arrayList4.get(0));
                yj0.a.f(context3, "com/tencent/mm/plugin/setting/ui/setting/SettingsChattingUI", "goToRecovery", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                break;
            case 5:
                com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160369g).h("settings_enter_button_send");
                if (checkBoxPreference != null) {
                    gm0.j1.u().c().w(66832, java.lang.Boolean.valueOf(!checkBoxPreference.N()));
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, java.lang.Boolean.valueOf(checkBoxPreference.N()));
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("independent_send_msg_setting_btn", "view_clk", hashMap, 30529);
                    break;
                }
                break;
            case 6:
                android.content.Intent intent2 = new android.content.Intent();
                if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_emoticon_new_personal_center_andr, false)) {
                    intent2.putExtra(java.lang.String.valueOf(10931), 2);
                    j45.l.j(getContext(), "emoji", ".ui.EmojiMineUI", intent2, null);
                    break;
                } else {
                    intent2.putExtra(java.lang.String.valueOf(10931), 3);
                    j45.l.j(getContext(), "emoji", ".ui.EmoticonNewPersonCenterManagerActivity", intent2, null);
                    break;
                }
            default:
                z17 = false;
                break;
        }
        W6(this.f160369g, preference.f197780q);
        return z17;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160369g).h("settings_voice_play_mode");
        if (checkBoxPreference != null) {
            checkBoxPreference.O(((java.lang.Boolean) gm0.j1.u().c().l(26, java.lang.Boolean.FALSE)).booleanValue());
            checkBoxPreference.f197785v = false;
        }
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160369g).h("settings_enter_button_send");
        if (checkBoxPreference2 != null) {
            boolean z17 = !((java.lang.Boolean) gm0.j1.u().c().l(66832, java.lang.Boolean.FALSE)).booleanValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsChattingUI", "onResume enterButtonSend:%s", java.lang.Boolean.valueOf(z17));
            checkBoxPreference2.O(z17);
            checkBoxPreference2.f197785v = false;
        }
        com.tencent.mm.plugin.setting.ui.setting.g gVar = com.tencent.mm.plugin.setting.ui.setting.g.f161052a;
        if (this.f160370h == null) {
            this.f160370h = new com.tencent.mm.plugin.setting.ui.setting.e(this.f160369g, "settings_bak_chat");
        }
        gVar.c(this.f160370h);
        W6(this.f160369g, "settings_voice_play_mode");
        W6(this.f160369g, "settings_enter_button_send");
        W6(this.f160369g, "settings_bak_chat");
        W6(this.f160369g, "settings_chatting_bg");
        W6(this.f160369g, "settings_emoji_manager");
        W6(this.f160369g, "settings_reset");
        W6(this.f160369g, "settings_recovery");
    }
}
