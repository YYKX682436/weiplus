package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class SettingsAboutCamera extends com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference {

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f160250g;

    /* renamed from: h, reason: collision with root package name */
    public long f160251h;

    /* renamed from: i, reason: collision with root package name */
    public int f160252i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f160253m = 0;

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference
    public int V6() {
        return 3;
    }

    public final boolean X6(long j17) {
        return (j17 & c01.z1.i()) != 0;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494936c4;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f160250g = getPreferenceScreen();
        if (com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI.Y6()) {
            setMMTitle(com.tencent.mm.R.string.iwg);
        } else {
            setMMTitle(com.tencent.mm.R.string.iwf);
        }
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.d5(this));
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WEIXIN_MUL_TERMINAL_AUTOSYNC_BOOLEAN;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        boolean booleanValue = ((java.lang.Boolean) c17.m(u3Var, bool)).booleanValue();
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160250g).h("settings_auto_mul_terminal_sync");
        boolean z17 = false;
        checkBoxPreference.f197785v = false;
        checkBoxPreference.O(booleanValue);
        boolean booleanValue2 = ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, bool)).booleanValue();
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160250g).h("settings_take_photo_auto_save_photo");
        checkBoxPreference2.f197785v = false;
        checkBoxPreference2.O(booleanValue2);
        boolean booleanValue3 = ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, bool)).booleanValue();
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference3 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160250g).h("settings_take_photo_auto_save_video");
        checkBoxPreference3.O(booleanValue3);
        checkBoxPreference3.f197785v = false;
        boolean booleanValue4 = ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WEIXIN_SNSAUTOPLAY_AUTOSYNC_BOOLEAN, bool)).booleanValue();
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference4 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160250g).h("settings_sns_auto_play_switch");
        checkBoxPreference4.O(booleanValue4);
        checkBoxPreference4.f197785v = false;
        if (((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Ni()) {
            boolean X6 = X6(1L);
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference5 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160250g).h("setting_c2c_gallery_query");
            checkBoxPreference5.O(X6);
            checkBoxPreference5.f197785v = false;
        }
        if (com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI.Y6()) {
            boolean z18 = (this.f160251h & 137438953472L) != 0;
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference6 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160250g).h("settings_voip_audio_switch_mobile_net");
            checkBoxPreference6.O(!z18);
            checkBoxPreference6.f197785v = false;
        }
        boolean z19 = !X6(137438953472L);
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference7 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160250g).h("setting_c2c_media_clear");
        checkBoxPreference7.O(!z19);
        checkBoxPreference7.f197785v = false;
        ((com.tencent.mm.ui.base.preference.h0) this.f160250g).notifyDataSetChanged();
        if (this.f160252i == 1) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160250g).m("settings_sns_auto_play_switch", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f160250g).m("settings_sns_auto_play_tip", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f160250g).m("settings_take_photo_auto_save_photo", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f160250g).m("settings_take_photo_auto_save_video", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f160250g).m("settings_auto_mul_terminal_sync", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f160250g).m("settings_auto_mul_terminal_sync_tip", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f160250g).m("settings_take_photo_auto_save_tip", true);
        } else {
            boolean z27 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_video_autoplay, 0) == 1;
            java.lang.String lowerCase = wo.w0.m().toLowerCase();
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_sns_video_autoplay_disable_device, "", true);
            if (com.tencent.mm.sdk.platformtools.t8.K0(Zi) || !Zi.contains(lowerCase)) {
                z17 = z27;
            } else {
                com.tencent.mars.xlog.Log.i("ui.settings.SettingsAboutCamera", "model %s is hit, expt:%s", lowerCase, Zi);
            }
            if (!z17) {
                ((com.tencent.mm.ui.base.preference.h0) this.f160250g).m("settings_sns_auto_play_switch", true);
                ((com.tencent.mm.ui.base.preference.h0) this.f160250g).m("settings_sns_auto_play_tip", true);
            }
            if (!com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI.Y6()) {
                ((com.tencent.mm.ui.base.preference.h0) this.f160250g).m("settings_voip_audio_switch_mobile_net", true);
                ((com.tencent.mm.ui.base.preference.h0) this.f160250g).m("settings_voip_audio_switch_mobile_net_tip", true);
            }
        }
        if (((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Ni()) {
            return;
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f160250g).m("setting_c2c_gallery_query", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f160250g).m("setting_c2c_gallery_query_tips", true);
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference, com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f160251h = c01.z1.j();
        this.f160252i = getIntent().getIntExtra("activity_caller_params", 0);
        this.f160253m = getIntent().getIntExtra("enter_scene", 0);
        initView();
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.autogen.mmdata.rpt.SightAutoDownloadAndPlaySettingStruct sightAutoDownloadAndPlaySettingStruct = new com.tencent.mm.autogen.mmdata.rpt.SightAutoDownloadAndPlaySettingStruct();
        sightAutoDownloadAndPlaySettingStruct.f60380d = 2;
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WEIXIN_MUL_TERMINAL_AUTOSYNC_BOOLEAN;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        sightAutoDownloadAndPlaySettingStruct.f60381e = ((java.lang.Boolean) c17.m(u3Var, bool)).booleanValue() ? 1 : 2;
        sightAutoDownloadAndPlaySettingStruct.f60382f = ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, bool)).booleanValue() ? 1 : 2;
        sightAutoDownloadAndPlaySettingStruct.f60383g = ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, bool)).booleanValue() ? 1 : 2;
        sightAutoDownloadAndPlaySettingStruct.f60384h = ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WEIXIN_SNSAUTOPLAY_AUTOSYNC_BOOLEAN, bool)).booleanValue() ? 1 : 2;
        sightAutoDownloadAndPlaySettingStruct.f60385i = X6(1L) ? 1 : 2;
        sightAutoDownloadAndPlaySettingStruct.k();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        int i17;
        java.lang.String str = preference.f197780q;
        if (str.equals("settings_auto_mul_terminal_sync")) {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WEIXIN_MUL_TERMINAL_AUTOSYNC_BOOLEAN, java.lang.Boolean.valueOf(!((java.lang.Boolean) c17.m(r6, java.lang.Boolean.TRUE)).booleanValue()));
        }
        if (str.equals("settings_take_photo_auto_save_photo")) {
            com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, java.lang.Boolean.valueOf(!((java.lang.Boolean) c18.m(r7, java.lang.Boolean.TRUE)).booleanValue()));
        }
        if (str.equals("settings_take_photo_auto_save_video")) {
            com.tencent.mm.storage.n3 c19 = gm0.j1.u().c();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, java.lang.Boolean.valueOf(!((java.lang.Boolean) c19.m(r8, java.lang.Boolean.TRUE)).booleanValue()));
        }
        if (str.equals("settings_sns_auto_play_switch")) {
            com.tencent.mm.storage.n3 c27 = gm0.j1.u().c();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WEIXIN_SNSAUTOPLAY_AUTOSYNC_BOOLEAN, java.lang.Boolean.valueOf(!((java.lang.Boolean) c27.m(r9, java.lang.Boolean.TRUE)).booleanValue()));
        }
        if (str.equals("settings_voip_audio_switch_mobile_net")) {
            boolean N = ((com.tencent.mm.ui.base.preference.CheckBoxPreference) preference).N();
            com.tencent.mars.xlog.Log.i("ui.settings.SettingsAboutCamera", "switch ext change : open = " + N + " item value = 137438953472 functionId = 58");
            if (N) {
                this.f160251h &= -137438953473L;
            } else {
                this.f160251h |= 137438953472L;
            }
            int i18 = N ? 1 : 2;
            r45.p53 p53Var = new r45.p53();
            p53Var.f382761d = 58;
            p53Var.f382762e = i18;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
            gm0.j1.u().c().w(147457, java.lang.Long.valueOf(this.f160251h));
        }
        if (str.equals("setting_c2c_gallery_query")) {
            ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).bj(((com.tencent.mm.ui.base.preference.CheckBoxPreference) preference).N());
            ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Di(3);
        }
        if (str.equals("setting_c2c_media_clear")) {
            boolean z17 = !((com.tencent.mm.ui.base.preference.CheckBoxPreference) preference).N();
            com.tencent.mars.xlog.Log.i("ui.settings.SettingsAboutCamera", "switch ext2 change : open = " + z17 + " item value = 137438953472 functionId = 97");
            long i19 = c01.z1.i();
            long j17 = z17 ? i19 & (-137438953473L) : i19 | 137438953472L;
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(j17));
            bn0.g.f22779a.g("USERINFO_EXT_STATUS2_LONG_SYNC", j17);
            int i27 = z17 ? 2 : 1;
            r45.p53 p53Var2 = new r45.p53();
            p53Var2.f382761d = 97;
            p53Var2.f382762e = i27;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var2));
            i17 = 1;
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).qj(z17, this.f160253m == 1);
        } else {
            i17 = 1;
        }
        com.tencent.mm.autogen.mmdata.rpt.SightAutoDownloadAndPlaySettingStruct sightAutoDownloadAndPlaySettingStruct = new com.tencent.mm.autogen.mmdata.rpt.SightAutoDownloadAndPlaySettingStruct();
        sightAutoDownloadAndPlaySettingStruct.f60380d = 3;
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "settings_auto_mul_terminal_sync")) {
            sightAutoDownloadAndPlaySettingStruct.f60381e = ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WEIXIN_MUL_TERMINAL_AUTOSYNC_BOOLEAN, java.lang.Boolean.TRUE)).booleanValue() ? i17 : 2;
        } else if (com.tencent.mm.sdk.platformtools.t8.D0(str, "settings_take_photo_auto_save_photo")) {
            sightAutoDownloadAndPlaySettingStruct.f60382f = ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, java.lang.Boolean.TRUE)).booleanValue() ? i17 : 2;
        } else if (com.tencent.mm.sdk.platformtools.t8.D0(str, "settings_take_photo_auto_save_video")) {
            sightAutoDownloadAndPlaySettingStruct.f60383g = ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, java.lang.Boolean.TRUE)).booleanValue() ? i17 : 2;
        } else if (com.tencent.mm.sdk.platformtools.t8.D0(str, "settings_sns_auto_play_switch")) {
            sightAutoDownloadAndPlaySettingStruct.f60384h = ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WEIXIN_SNSAUTOPLAY_AUTOSYNC_BOOLEAN, java.lang.Boolean.TRUE)).booleanValue() ? i17 : 2;
        } else if (com.tencent.mm.sdk.platformtools.t8.D0(str, "setting_c2c_gallery_query")) {
            sightAutoDownloadAndPlaySettingStruct.f60385i = X6(1L) ? i17 : 2;
        }
        sightAutoDownloadAndPlaySettingStruct.k();
        W6(this.f160250g, preference.f197780q);
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f160252i == 1) {
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().X(true);
            qp1.h0.a(true, false, true);
        }
        W6(this.f160250g, "settings_auto_mul_terminal_sync");
        W6(this.f160250g, "settings_take_photo_auto_save_photo");
        W6(this.f160250g, "settings_take_photo_auto_save_video");
        W6(this.f160250g, "settings_sns_auto_play_switch");
        W6(this.f160250g, "settings_voip_audio_switch_mobile_net");
        W6(this.f160250g, "setting_c2c_gallery_query");
        W6(this.f160250g, "setting_c2c_media_clear");
    }
}
