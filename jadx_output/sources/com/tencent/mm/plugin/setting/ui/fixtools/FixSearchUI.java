package com.tencent.mm.plugin.setting.ui.fixtools;

/* loaded from: classes11.dex */
public class FixSearchUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f160058h = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f160059d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f160060e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f160061f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f160062g;

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494892as;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f160059d = getPreferenceScreen();
        setMMTitle(com.tencent.mm.R.string.fa6);
        com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMMHeaderPreference settingsAboutMMHeaderPreference = (com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMMHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160059d).h("fix_tools_micromsg_header");
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.a0.a(getContext(), o45.wf.f343029g);
        if (o45.wf.f343033k) {
            a17 = a17 + " " + j65.v.b(this);
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        settingsAboutMMHeaderPreference.L = a17;
        setBackBtn(new o14.b(this));
        if (com.tencent.mars.xlog.Log.isDebug()) {
            return;
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f160059d).m("fix_tools_chatroom_nickname", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f160059d).m("fix_tools_setting_ringtone", true);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        if (preference.f197780q.equals("fix_tools_fts")) {
            com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f160060e;
            if (j0Var == null) {
                j0Var = db5.e1.H(this, getString(com.tencent.mm.R.string.f492125fa4), "", true, new o14.c(this), null);
                this.f160060e = j0Var;
            }
            j0Var.show();
            return true;
        }
        if (preference.f197780q.equals("fix_tools_websearch")) {
            if (this.f160061f == null) {
                this.f160061f = db5.e1.H(this, getString(com.tencent.mm.R.string.fak), "", true, new o14.d(this), null);
            }
            this.f160061f.show();
            return true;
        }
        if (preference.f197780q.equals("fix_tools_topstory")) {
            if (this.f160062g == null) {
                this.f160062g = db5.e1.H(this, getString(com.tencent.mm.R.string.fak), "", true, new o14.e(this), null);
            }
            this.f160062g.show();
            return true;
        }
        if (preference.f197780q.equals("fix_tools_trigger_build_message")) {
            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).Di(1);
            return true;
        }
        if (preference.f197780q.equals("fix_tools_setting_ringtone")) {
            ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).getClass();
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().getClass();
            java.lang.String c17 = com.tencent.mm.pluginsdk.res.downloader.checkresupdate.c0.c(96, 1);
            com.tencent.mm.pluginsdk.res.downloader.model.l0 l0Var = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a;
            if (l0Var.f189686e) {
                l0Var.f189682a.d(c17);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "deleteResDbRecord resType:%s subType:%s", 96, 1);
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(this);
            e4Var.f211776c = "已修复";
            e4Var.c();
            return true;
        }
        if (!preference.f197780q.equals("fix_tools_chatroom_nickname")) {
            return false;
        }
        o13.p.e(30);
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(this, "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        intent.putExtra("titile", getString(com.tencent.mm.R.string.k0l));
        intent.putExtra("key_confirm_menu_name", getString(com.tencent.mm.R.string.f490507x1));
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 82);
        intent.putExtra("max_limit_num", 1);
        bh5.c cVar = new bh5.c();
        cVar.f20922a.f20924a = this;
        cVar.d(intent);
        cVar.a("com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        cVar.b(com.tencent.mm.ui.halfscreen.custom.SelectChatroomHalfScreenDialogFragment.class);
        cVar.i(new o14.a$$a());
        return false;
    }
}
