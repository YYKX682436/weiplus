package com.tencent.mm.plugin.subapp.ui.pluginapp;

/* loaded from: classes11.dex */
public class AddMoreFriendsUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f172418e = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f172419d;

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494828a;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.HashSet hashSet = new java.util.HashSet(super.importUIComponents());
        hashSet.add(ir3.a.class);
        return hashSet;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.f489834d2);
        this.f172419d = getPreferenceScreen();
        if ((com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("InviteFriendsControlFlags"), 0) & 4) > 0) {
            ((com.tencent.mm.ui.base.preference.h0) this.f172419d).m("find_friends_by_invite", false);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f172419d).m("find_friends_by_invite", true);
        }
        hideActionbarLine();
        setBackBtn(new gg4.l(this));
        setListViewBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        setShowTopLine(bool);
        setShowBottomLine(bool);
        initView();
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.AddMoreFriendsUI)).Rj(this, iy1.a.AddFriend);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        gg4.i iVar = (gg4.i) component(gg4.i.class);
        java.lang.String prefKey = preference.f197780q;
        iVar.getClass();
        kotlin.jvm.internal.o.g(prefKey, "prefKey");
        gg4.e eVar = new gg4.e(prefKey, iVar);
        android.os.Bundle bundle = null;
        pm0.v.K(null, eVar);
        if ("find_friends_by_qrcode".equals(preference.f197780q)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("BaseScanUI_select_scan_mode", 1);
            intent.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 0);
            intent.setFlags(65536);
            intent.putExtra("key_enable_multi_code", true);
            intent.putExtra("key_scan_report_enter_scene", 12);
            intent.putExtra("key_scan_goods_enable_dynamic_wording", true);
            intent.putExtra("key_enable_scan_code_product_merge", true);
            intent.putExtra("key_check_camera_using", true);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11265, 1);
            if (!iq.b.g(this) && !iq.b.x(this) && !iq.b.c(getContext(), true)) {
                j45.l.j(this, "scanner", ".ui.BaseScanUI", intent, null);
            }
            ((ty3.e) i95.n0.c(ty3.e.class)).getClass();
            int j17 = iq.b.j();
            if (j17 != 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27693, java.lang.Integer.valueOf(j17), 12);
            }
            return true;
        }
        if ("find_friends_by_other_way".equals(preference.f197780q)) {
            if (r61.q0.b() != js.x0.SUCC) {
                android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI.class);
                intent2.putExtra("key_upload_scene", 6);
                com.tencent.mm.ui.MMWizardActivity.X6(this, intent2);
                return true;
            }
            android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.MobileFriendUI.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent3);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if ("find_friends_by_web".equals(preference.f197780q) || "find_friends_by_brand_service".equals(preference.f197780q)) {
            if (!com.tencent.mm.sdk.platformtools.f9.ContactNewFriendOa.k(getContext(), null)) {
                return true;
            }
            if (com.tencent.mm.plugin.websearch.l2.h(0)) {
                ((com.tencent.mm.plugin.websearch.p2) ((su4.g1) i95.n0.c(su4.g1.class))).Bi(com.tencent.mm.sdk.platformtools.x2.f193071a, new gg4.k(this, preference));
                preference.w(false);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.AddMoreFriendsUI", "fts h5 template not avail");
            }
            return true;
        }
        if ("find_friends_by_radar".equals(preference.f197780q)) {
            ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
            if (su4.r2.l()) {
                ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(this);
                return true;
            }
            j45.l.h(this, "radar", ".ui.RadarSearchUI");
            return true;
        }
        if ("find_friends_create_pwdgroup".equals(preference.f197780q)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11140, 1);
            j45.l.h(this, "pwdgroup", ".ui.FacingCreateChatRoomAllInOneUI");
            return true;
        }
        if ("find_friends_by_invite".equals(preference.f197780q)) {
            int intExtra = getIntent().getIntExtra("invite_friend_scene", 4);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14034, java.lang.Integer.valueOf(intExtra));
            android.content.Intent intent4 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI.class);
            intent4.putExtra("Invite_friends", intExtra);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if (!"find_friends_by_ww".equals(preference.f197780q)) {
            return false;
        }
        if (!com.tencent.mm.sdk.platformtools.f9.ContactNewFriendWeWeCom.k(getContext(), null)) {
            return true;
        }
        android.content.Intent putExtra = new android.content.Intent().putExtra("Search_Scene", 2).putExtra("MMActivity.OverrideEnterAnimation", 0).putExtra("MMActivity.OverrideExitAnimation", 0);
        if (!com.tencent.mm.ui.bk.C() && !isVASValid()) {
            bundle = android.app.ActivityOptions.makeSceneTransitionAnimation(this, new android.util.Pair[0]).toBundle();
        }
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).Ai(getContext(), ".ui.FTSAddWw", putExtra, bundle);
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        boolean l17 = su4.r2.l();
        j45.l.g("brandservice");
        if (l17) {
            ((com.tencent.mm.ui.base.preference.h0) this.f172419d).m("find_friends_by_web", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f172419d).m("find_friends_by_brand_service", true);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f172419d).m("find_friends_by_web", false);
            ((com.tencent.mm.ui.base.preference.h0) this.f172419d).m("find_friends_by_brand_service", false);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f172419d).notifyDataSetChanged();
        com.tencent.mm.plugin.subapp.ui.pluginapp.AddFriendSearchPreference addFriendSearchPreference = (com.tencent.mm.plugin.subapp.ui.pluginapp.AddFriendSearchPreference) ((com.tencent.mm.ui.base.preference.h0) this.f172419d).h("find_friends_by_input");
        addFriendSearchPreference.L = getString(com.tencent.mm.R.string.bka);
        addFriendSearchPreference.M = new gg4.m(this);
        ((com.tencent.mm.plugin.subapp.ui.pluginapp.AddFriendItemPreference) ((com.tencent.mm.ui.base.preference.h0) this.f172419d).h("find_friends_create_pwdgroup")).N = 8;
        long j17 = c01.z1.j();
        com.tencent.mars.xlog.Log.i("MicroMsg.AddMoreFriendsUI", "${extStatus & ConstantsProtocal.MM_EXT_STATUS_QRCODE_VERIFY_CLOSE.toLong()},extstatus:$extStatus");
        if ((j17 & 2) != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AddMoreFriendsUI", "hide find_friends_bottom_qr_code_info");
            ((com.tencent.mm.ui.base.preference.h0) this.f172419d).m("find_friends_bottom_qr_code_info", true);
        } else {
            final com.tencent.mm.plugin.subapp.ui.pluginapp.QRCodeFooterPreference qRCodeFooterPreference = (com.tencent.mm.plugin.subapp.ui.pluginapp.QRCodeFooterPreference) ((com.tencent.mm.ui.base.preference.h0) this.f172419d).h("find_friends_bottom_qr_code_info");
            final com.tencent.mm.plugin.setting.ui.setting.i0 i0Var = (com.tencent.mm.plugin.setting.ui.setting.i0) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.setting.ui.setting.i0.class);
            qRCodeFooterPreference.R = new yz5.a() { // from class: gg4.j$$a
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    int i17 = com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI.f172418e;
                    com.tencent.mm.plugin.subapp.ui.pluginapp.QRCodeFooterPreference qRCodeFooterPreference2 = com.tencent.mm.plugin.subapp.ui.pluginapp.QRCodeFooterPreference.this;
                    qRCodeFooterPreference2.getClass();
                    com.tencent.mm.plugin.setting.ui.setting.i0 uic = i0Var;
                    kotlin.jvm.internal.o.g(uic, "uic");
                    com.tencent.mars.xlog.Log.i("MicroMsg.QRCodeFooterPreference", "attachController to ".concat(com.tencent.mm.plugin.setting.ui.setting.i0.class.getName()));
                    android.widget.ImageView imageView = qRCodeFooterPreference2.L;
                    if (imageView != null) {
                        uic.f161124g = imageView;
                        imageView.setOnClickListener(qRCodeFooterPreference2.Q);
                    }
                    android.view.View view = qRCodeFooterPreference2.N;
                    if (view != null) {
                        uic.f161128n = view;
                    }
                    android.widget.FrameLayout frameLayout = qRCodeFooterPreference2.P;
                    if (frameLayout != null) {
                        uic.f161130p = frameLayout;
                    }
                    uic.f161133s = false;
                    uic.Z6(false, 0);
                    return null;
                }
            };
            v24.e eVar = new v24.e(com.tencent.mm.plugin.setting.ui.setting.l.f161258e, java.lang.System.currentTimeMillis());
            i0Var.getClass();
            i0Var.f161306d = eVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.AddMoreFriendsUI", "show ColorfulSelfQRCode GradientFgWhiteBgUIC in AddMoreFriendsUI");
            qRCodeFooterPreference.Q = new android.view.View.OnClickListener() { // from class: gg4.j$$b
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    int i17 = com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI.f172418e;
                    com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI addMoreFriendsUI = com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI.this;
                    addMoreFriendsUI.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", addMoreFriendsUI, array);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AddMoreFriendsUI", "QRCodeFooterPreference on click QRCode");
                    gg4.i iVar = (gg4.i) addMoreFriendsUI.component(gg4.i.class);
                    iVar.getClass();
                    pm0.v.K(null, new gg4.f(iVar));
                    kd0.i2 i2Var = (kd0.i2) i95.n0.c(kd0.i2.class);
                    androidx.appcompat.app.AppCompatActivity context = addMoreFriendsUI.getContext();
                    c01.ka kaVar = new c01.ka(3);
                    ((hs.d0) i2Var).getClass();
                    kotlin.jvm.internal.o.g(context, "context");
                    e04.g2.a(context, kaVar);
                    yj0.a.h(addMoreFriendsUI, "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            };
        }
        ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
        if (getPreferenceScreen() != null) {
            com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("find_friends_by_web");
            if (h17 != null) {
                h17.w(true);
            }
            com.tencent.mm.ui.base.preference.Preference h18 = ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("find_friends_by_brand_service");
            if (h18 != null) {
                h18.w(true);
            }
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.setting.ui.setting.i0.class);
        hashSet.add(gg4.i.class);
    }
}
