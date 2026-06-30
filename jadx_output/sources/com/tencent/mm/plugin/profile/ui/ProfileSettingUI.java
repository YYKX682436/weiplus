package com.tencent.mm.plugin.profile.ui;

/* loaded from: classes11.dex */
public class ProfileSettingUI extends com.tencent.mm.ui.base.preference.MMPreference implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f153785d;

    /* renamed from: e, reason: collision with root package name */
    public cr3.d0 f153786e;

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) obj;
            if (this.f153785d.d1().equals(str)) {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
                this.f153785d = n17;
                if (n17 != null) {
                    this.f153786e.f221932e = n17;
                    initView();
                    ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).notifyDataSetChanged();
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494913bf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x012c, code lost:
    
        if (com.tencent.mm.storage.z3.L3(r8.f153785d.d1()) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x010c, code lost:
    
        if ("3552365301".equals(r8.f153785d.Q0()) != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x036c  */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.ui.ProfileSettingUI.initView():void");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("Contact_User");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProfileSettingUI", "username is null %s", stringExtra);
            finish();
            return;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(stringExtra, true);
        this.f153785d = n17;
        this.f153786e = new cr3.d0(this, n17);
        if (com.tencent.mm.storage.z3.L4(this.f153785d.d1())) {
            setMMTitle(com.tencent.mm.R.string.pgq);
        } else {
            setMMTitle(com.tencent.mm.R.string.hni);
        }
        setBackBtn(new hr3.jc(this));
        initView();
        ((l75.a1) c01.d9.b().q()).a(this);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        cr3.d0 d0Var = this.f153786e;
        d0Var.getClass();
        ((aq1.n) ((i35.g) gm0.j1.s(i35.g.class))).c(d0Var);
        ((l75.a1) c01.d9.b().q()).e(this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfileSettingUI", str + " item has been clicked!");
        if (str.equals("setting_remark")) {
            this.f153786e.j(1);
            return true;
        }
        if (str.equals("avatar_setting")) {
            this.f153786e.j(14);
            return true;
        }
        if (str.equals("setting_permission")) {
            this.f153786e.j(3);
            return true;
        }
        if (str.equals("setting_send_card")) {
            this.f153786e.j(4);
            return true;
        }
        if (str.equals("setting_send_card_by_card")) {
            this.f153786e.j(13);
            return true;
        }
        if (str.equals("setting_shortcut")) {
            this.f153786e.j(7);
            return true;
        }
        if (str.equals("setting_star")) {
            this.f153786e.j(2);
            return true;
        }
        if (str.equals("setting_blacklist")) {
            this.f153786e.j(5);
            return true;
        }
        if (str.equals("setting_report")) {
            this.f153786e.j(9);
            return true;
        }
        if (str.equals("setting_delete")) {
            this.f153786e.j(6);
            return true;
        }
        if (str.equals("clear_chatbot_msg")) {
            this.f153786e.j(15);
            return true;
        }
        if (!str.equals("shortcut_command")) {
            return false;
        }
        this.f153786e.j(16);
        return true;
    }
}
