package com.tencent.mm.plugin.profile.ui.newbizinfo;

/* loaded from: classes9.dex */
public class NewBizInfoSettingUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f154173y = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f154174d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f154175e;

    /* renamed from: f, reason: collision with root package name */
    public qk.o f154176f;

    /* renamed from: h, reason: collision with root package name */
    public qk.n f154178h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f154179i;

    /* renamed from: m, reason: collision with root package name */
    public int f154180m;

    /* renamed from: n, reason: collision with root package name */
    public long f154181n;

    /* renamed from: o, reason: collision with root package name */
    public long f154182o;

    /* renamed from: p, reason: collision with root package name */
    public int f154183p;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.msgsubscription.SubscribeMsgRequestResult f154187t;

    /* renamed from: x, reason: collision with root package name */
    public r45.j16 f154191x;

    /* renamed from: g, reason: collision with root package name */
    public android.content.SharedPreferences f154177g = null;

    /* renamed from: q, reason: collision with root package name */
    public int f154184q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f154185r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final e31.k f154186s = e31.n.f247087a.a("name_biz");

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f154188u = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f154189v = null;

    /* renamed from: w, reason: collision with root package name */
    public boolean f154190w = false;

    static {
        com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9);
    }

    public static void V6(com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI newBizInfoSettingUI) {
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) newBizInfoSettingUI.f154174d).h("contact_info_block_like");
        if (checkBoxPreference != null) {
            checkBoxPreference.O(newBizInfoSettingUI.f154185r == 2);
            checkBoxPreference.L(newBizInfoSettingUI.X6());
        }
    }

    public final void W6(qk.o oVar, boolean z17) {
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f154174d).h("contact_info_subscribe_bizinfo");
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f154174d).h("contact_info_locate");
        r45.ln4 ln4Var = new r45.ln4();
        ln4Var.f379659d = oVar.field_brandFlag;
        ln4Var.f379660e = this.f154175e.d1();
        if (Z6(this.f154180m)) {
            ((e21.z0) c01.d9.b().w()).c(new xg3.p0(58, ln4Var));
        } else {
            ((e21.z0) c01.d9.b().w()).c(new xg3.p0(47, ln4Var));
        }
        r01.q3.cj().update(oVar, new java.lang.String[0]);
        checkBoxPreference.O(oVar.W0());
        if (checkBoxPreference2 != null) {
            checkBoxPreference2.O(oVar.u0());
        }
        if (z17) {
            initView();
            ((com.tencent.mm.ui.base.preference.h0) this.f154174d).notifyDataSetChanged();
        }
    }

    public final java.lang.CharSequence X6() {
        if (this.f154185r == 0) {
            return "";
        }
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.tencent.mm.R.raw.heart_medium);
        if (drawable == null) {
            return getString(com.tencent.mm.R.string.f492576oa4) + getString(com.tencent.mm.R.string.o_y);
        }
        int b17 = i65.a.b(this, 18);
        drawable.setBounds(0, 0, b17, b17);
        al5.w wVar = new al5.w(drawable, 1);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) getString(com.tencent.mm.R.string.f492576oa4));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) " ");
        spannableStringBuilder.setSpan(wVar, length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final r45.wl Y6() {
        com.tencent.mm.storage.z3 z3Var = this.f154175e;
        if (z3Var == null) {
            return null;
        }
        java.lang.String d17 = z3Var.d1();
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            return null;
        }
        return qr3.c0.a(d17);
    }

    public final boolean Z6(int i17) {
        return i17 == 81 || i17 == 92 || i17 == 93 || i17 == 94;
    }

    public final void a7() {
        com.tencent.mm.storage.z3 z3Var = this.f154175e;
        if (z3Var == null || !z3Var.r2() || com.tencent.mm.storage.z3.z4(this.f154175e.d1()) || c01.e2.c0(this.f154175e.d1())) {
            ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_is_mute", true);
        } else {
            qk.o oVar = this.f154176f;
            if (oVar == null || !oVar.Q0()) {
                ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_is_mute", true);
            } else {
                ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_is_mute", false);
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_verifyuser_weibo", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_subscribe_bizinfo", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_template_recv", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_locate", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_block_finder", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_block_like", true);
    }

    public final void b7(boolean z17) {
        qk.o oVar;
        if (this.f154175e == null || (oVar = this.f154176f) == null || !oVar.Q0()) {
            return;
        }
        r45.l36 l36Var = new r45.l36();
        l36Var.f379115e = c01.e2.P(this.f154175e) ? 1 : 0;
        l36Var.f379114d = getIntent().getIntExtra("key_start_biz_profile_setting_from_scene", 0);
        r01.q3.Zi().b(this.f154175e.d1(), z17 ? 15 : 16, 0, 0.0f, 0.0f, 0, null, 0, null, l36Var);
    }

    public final void c7(boolean z17) {
        qk.o oVar;
        if (this.f154175e != null) {
            if (this.f154177g == null) {
                this.f154177g = getSharedPreferences(getPackageName() + "_preferences", 0);
            }
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f154174d).h("contact_is_mute");
            if (z17 && (oVar = this.f154176f) != null && oVar.Q0()) {
                setTitleMuteIconVisibility(0);
                if (checkBoxPreference != null) {
                    this.f154177g.edit().putBoolean("contact_is_mute", true).commit();
                }
            } else {
                setTitleMuteIconVisibility(8);
                if (checkBoxPreference != null) {
                    this.f154177g.edit().putBoolean("contact_is_mute", false).commit();
                }
            }
            if (checkBoxPreference != null) {
                checkBoxPreference.O(z17);
                ((com.tencent.mm.ui.base.preference.h0) this.f154174d).notifyDataSetChanged();
            }
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.b_;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(qr3.o.class);
        return hashSet;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        boolean z17;
        qk.o oVar;
        boolean z18;
        qk.o oVar2;
        qk.o oVar3;
        e31.k kVar;
        qk.o oVar4 = this.f154176f;
        if (oVar4 != null) {
            this.f154178h = oVar4.D0(false);
        }
        qk.o oVar5 = this.f154176f;
        if (oVar5 == null) {
            ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_is_mute", true);
        } else if (oVar5.Q0()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_is_mute", false);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_is_mute", true);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_subscribe_msg", true);
        com.tencent.mm.storage.z3 z3Var = this.f154175e;
        if (z3Var != null && z3Var.r2() && (oVar3 = this.f154176f) != null && oVar3.Q0() && (kVar = this.f154186s) != null) {
            ((g31.l) kVar).p(this.f154176f.field_username, new qr3.b0(this));
        }
        boolean P = c01.e2.P(this.f154175e);
        this.f154179i = P;
        c7(P);
        getIntent().getBooleanExtra("KIsHardDevice", false);
        if (getIntent() != null && getIntent().getBooleanExtra("KIsHardDevice", false)) {
            if (getIntent() == null) {
                z18 = false;
            } else {
                java.lang.String stringExtra = getIntent().getStringExtra(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID);
                java.lang.String stringExtra2 = getIntent().getStringExtra("device_type");
                com.tencent.mm.autogen.events.ExDeviceCheckDeviceIsBoundEvent exDeviceCheckDeviceIsBoundEvent = new com.tencent.mm.autogen.events.ExDeviceCheckDeviceIsBoundEvent();
                am.f5 f5Var = exDeviceCheckDeviceIsBoundEvent.f54119g;
                f5Var.f6638b = stringExtra;
                f5Var.f6637a = stringExtra2;
                exDeviceCheckDeviceIsBoundEvent.e();
                z18 = exDeviceCheckDeviceIsBoundEvent.f54120h.f6739a;
            }
            this.f154175e.r2();
            if (!this.f154175e.r2() || !z18) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NewBizInfoSettingUI", "%s is not my hard biz contact", this.f154175e.d1());
                a7();
                if (Z6(this.f154180m)) {
                    if (this.f154176f == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.NewBizInfoSettingUI", "bizinfo is null in temp session");
                        return;
                    } else {
                        ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f154174d).h("contact_info_subscribe_bizinfo")).O(this.f154176f.W0());
                        ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_subscribe_bizinfo", false);
                        return;
                    }
                }
                return;
            }
            if (this.f154176f == null) {
                ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_subscribe_bizinfo", true);
                ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_locate", true);
                ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_template_recv", true);
                ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_subscribe_msg", true);
                return;
            }
            ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f154174d).h("contact_info_subscribe_bizinfo")).O(this.f154176f.W0());
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f154174d).h("contact_info_locate");
            if (this.f154176f.D0(false).o()) {
                checkBoxPreference.O(this.f154176f.u0());
            } else {
                ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_locate", true);
                checkBoxPreference.O(this.f154176f.u0());
            }
            if (!this.f154176f.W0()) {
                ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_template_recv", true);
                return;
            }
            if (this.f154178h == null && (oVar2 = this.f154176f) != null) {
                this.f154178h = oVar2.D0(false);
            }
            qk.n nVar = this.f154178h;
            if (nVar == null || !nVar.q()) {
                ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_template_recv", true);
                return;
            } else {
                j45.l.g("brandservice");
                ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_template_recv", false);
                return;
            }
        }
        if (!this.f154175e.r2()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NewBizInfoSettingUI", "%s is not my contact", this.f154175e.d1());
            a7();
            if (Z6(this.f154180m)) {
                if (this.f154176f == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NewBizInfoSettingUI", "bizinfo is null in temp session");
                } else {
                    ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f154174d).h("contact_info_subscribe_bizinfo")).O(this.f154176f.W0());
                    ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_subscribe_bizinfo", false);
                }
            }
        } else if (this.f154176f != null) {
            ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f154174d).h("contact_info_subscribe_bizinfo")).O(this.f154176f.W0());
            if (this.f154176f.W0()) {
                if (this.f154178h == null && (oVar = this.f154176f) != null) {
                    this.f154178h = oVar.D0(false);
                }
                qk.n nVar2 = this.f154178h;
                if (nVar2 == null || !nVar2.q()) {
                    ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_template_recv", true);
                } else {
                    j45.l.g("brandservice");
                    ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_template_recv", false);
                }
            } else {
                ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_template_recv", true);
            }
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f154174d).h("contact_info_locate");
            if (this.f154176f.D0(false).o()) {
                checkBoxPreference2.O(this.f154176f.u0());
            } else {
                ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_locate", true);
                checkBoxPreference2.O(this.f154176f.u0());
            }
        }
        qk.o oVar6 = this.f154176f;
        if (oVar6 != null && oVar6.Q0()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f154174d).h("contact_info_desc").J(com.tencent.mm.R.string.nax);
        }
        com.tencent.mm.storage.z3 z3Var2 = this.f154175e;
        if (z3Var2 != null && z3Var2.l2()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_is_mute", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_subscribe_bizinfo", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_desc", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_block_finder", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_locate", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_template_recv", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_add_shortcut_btn", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_clear_msg", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_subscribe_msg", true);
        }
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference3 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f154174d).h("contact_info_block_like");
        com.tencent.mm.storage.z3 z3Var3 = this.f154175e;
        if (!((z3Var3 == null || this.f154176f == null || !z3Var3.r2() || com.tencent.mm.sdk.platformtools.t8.K0(this.f154175e.d1()) || r01.z.n(this.f154175e.d1()) || this.f154185r == 0) ? false : true) || checkBoxPreference3 == null) {
            ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_block_like", true);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_block_like", false);
            checkBoxPreference3.O(this.f154185r == 2);
            checkBoxPreference3.L(X6());
        }
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference4 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f154174d).h("contact_info_block_finder");
        com.tencent.mm.storage.z3 z3Var4 = this.f154175e;
        if (z3Var4 != null && this.f154176f != null && z3Var4.r2() && !this.f154175e.l2()) {
            r45.wl Y6 = Y6();
            boolean z19 = Y6 != null && Y6.f389246t == 1;
            boolean z27 = this.f154184q != 0;
            if (z19 && z27) {
                z17 = true;
                if (z17 || checkBoxPreference4 == null) {
                    ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_block_finder", true);
                } else {
                    ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_block_finder", false);
                    checkBoxPreference4.O(this.f154184q == 1);
                    return;
                }
            }
        }
        z17 = false;
        if (z17) {
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f154174d).m("contact_info_block_finder", true);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        e31.k kVar;
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.NewBizInfoSettingUI", "onActivityResult requestCode: %d, resultCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 1001 || intent == null) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("key_need_update", false);
        com.tencent.mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper iSubscribeMsgService$Companion$SubscribeMsgListWrapper = (com.tencent.mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper) intent.getParcelableExtra("key_biz_data");
        if (!booleanExtra || iSubscribeMsgService$Companion$SubscribeMsgListWrapper == null || this.f154176f == null || (kVar = this.f154186s) == null) {
            return;
        }
        e31.o oVar = new e31.o();
        java.lang.String str = this.f154176f.field_username;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        oVar.f247089a = str;
        ((java.util.ArrayList) oVar.f247091c).addAll(iSubscribeMsgService$Companion$SubscribeMsgListWrapper.f71832d);
        oVar.f247092d = iSubscribeMsgService$Companion$SubscribeMsgListWrapper.f71833e;
        oVar.f247097i = new qr3.v(this);
        ((g31.l) kVar).x(oVar);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        r45.el elVar;
        r45.td5 td5Var;
        super.onCreate(bundle);
        this.f154174d = getPreferenceScreen();
        this.f154182o = java.lang.System.currentTimeMillis() / 1000;
        setMMTitle(com.tencent.mm.R.string.bcp);
        setTitleDividerVis(false);
        hideActionbarLine();
        setBackBtn(new qr3.r(this));
        java.lang.String stringExtra = getIntent().getStringExtra("Contact_User");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f154175e = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(stringExtra, true);
        this.f154176f = r01.z.b(stringExtra);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = stringExtra;
        objArr[1] = java.lang.Boolean.valueOf(this.f154175e != null);
        objArr[2] = java.lang.Boolean.valueOf(this.f154176f != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.NewBizInfoSettingUI", "user:%s contact:%b, bizInfo:%b", objArr);
        this.f154180m = getIntent().getIntExtra("Contact_Scene", 9);
        this.f154181n = getIntent().getLongExtra("key_profile_enter_timestamp", 0L);
        this.f154183p = getIntent().getIntExtra("key_start_biz_profile_setting_service_type", 0);
        r45.wl Y6 = Y6();
        if (Y6 == null || (td5Var = Y6.f389249w) == null) {
            this.f154184q = 0;
        } else {
            this.f154184q = td5Var.f386327d;
        }
        if (Y6 == null || (elVar = Y6.M) == null) {
            this.f154185r = 0;
        } else {
            this.f154185r = elVar.f373591d;
        }
        initView();
        b7(true);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f154188u.clear();
        b7(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd A[SYNTHETIC] */
    @Override // com.tencent.mm.ui.base.preference.MMPreference
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r r23, com.tencent.mm.ui.base.preference.Preference r24) {
        /*
            Method dump skipped, instructions count: 1155
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI.onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r, com.tencent.mm.ui.base.preference.Preference):boolean");
    }
}
