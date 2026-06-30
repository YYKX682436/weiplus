package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class ShakePersonalInfoUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f162112e = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f162113d;

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Vi() ? com.tencent.mm.R.xml.f494956db : com.tencent.mm.R.xml.f494955cm;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.j2r);
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        this.f162113d = preferenceScreen;
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).h("shake_item_sound");
        if (c01.d9.b().p().l(4112, null) == null) {
            c01.d9.b().p().w(4112, java.lang.Boolean.TRUE);
        }
        checkBoxPreference.O(com.tencent.mm.sdk.platformtools.t8.t1((java.lang.Boolean) c01.d9.b().p().l(4112, null)));
        setBackBtn(new com.tencent.mm.plugin.shake.ui.j0(this));
        if (b21.q.c()) {
            return;
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f162113d).w("shake_item_shake_music_list");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            if (i17 == 2 && intent != null) {
                java.lang.String stringExtra = intent.getStringExtra("CropImage_OutputPath");
                c01.d9.b().p().w(4110, java.lang.Boolean.FALSE);
                c01.d9.b().p().w(4111, stringExtra);
                db5.t7.i(this, i65.a.r(getContext(), com.tencent.mm.R.string.j3e), com.tencent.mm.R.raw.icons_filled_done);
                return;
            }
            return;
        }
        if (intent == null) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("CropImageMode", 4);
        intent2.putExtra("CropImage_Filter", true);
        intent2.putExtra("CropImage_DirectlyIntoFilter", true);
        intent2.putExtra("CropImage_OutputPath", g83.a.a() + "custom_shake_img_filename.jpg");
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.r(intent2, 2, this, intent);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        finish();
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        if ("shake_item_change_bgimg".equals(str)) {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_SHAKE_FIRST_CHANGE_BG_IMG_BOOLEAN_SYNC;
            if (!c17.o(u3Var, false)) {
                android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.cmh, (android.view.ViewGroup) null);
                com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(getContext(), 2, 0);
                z2Var.y(i65.a.r(getContext(), com.tencent.mm.R.string.jzb));
                z2Var.x(1);
                z2Var.F = new v61.a0$$a(z2Var);
                z2Var.j(inflate);
                z2Var.C();
                c01.d9.b().p().x(u3Var, java.lang.Boolean.TRUE);
            } else if (com.tencent.mm.sdk.platformtools.t8.t1((java.lang.Boolean) c01.d9.b().p().l(4110, null))) {
                ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
                com.tencent.mm.pluginsdk.ui.tools.l7.h(this, 1, null);
                overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
                ku5.u0 u0Var = ku5.t0.f312615d;
                y24.a aVar = new y24.a(null, 53);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.w(aVar, 100L, null);
            } else {
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) getContext(), 1, true);
                k0Var.s(com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.cmi, (android.view.ViewGroup) null), false);
                k0Var.Z1 = true;
                k0Var.f211872n = new db5.o4() { // from class: com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI$$a
                    @Override // db5.o4
                    public final void onCreateMMMenu(db5.g4 g4Var) {
                        int i17 = com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI.f162112e;
                        com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI shakePersonalInfoUI = com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI.this;
                        g4Var.d(1, i65.a.d(shakePersonalInfoUI.getContext(), com.tencent.mm.R.color.f478532ac), i65.a.r(shakePersonalInfoUI.getContext(), com.tencent.mm.R.string.f493108j21));
                    }
                };
                k0Var.f211881s = new db5.t4() { // from class: com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI$$b
                    @Override // db5.t4
                    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
                        int i18 = com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI.f162112e;
                        final com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI shakePersonalInfoUI = com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI.this;
                        shakePersonalInfoUI.getClass();
                        if (menuItem.getItemId() == 1) {
                            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) shakePersonalInfoUI.getContext(), 1, true);
                            android.widget.TextView textView = new android.widget.TextView(shakePersonalInfoUI.getContext());
                            textView.setGravity(17);
                            textView.setHeight(i65.a.f(shakePersonalInfoUI.getContext(), com.tencent.mm.R.dimen.f479727dj));
                            textView.setTextSize(0, i65.a.f(shakePersonalInfoUI.getContext(), com.tencent.mm.R.dimen.f479925j4));
                            textView.setTextColor(i65.a.d(shakePersonalInfoUI.getContext(), com.tencent.mm.R.color.BW_0_Alpha_0_5));
                            textView.setText(i65.a.r(shakePersonalInfoUI.getContext(), com.tencent.mm.R.string.f493107j20));
                            k0Var2.s(textView, false);
                            k0Var2.Z1 = true;
                            k0Var2.f211872n = new db5.o4() { // from class: com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI$$c
                                @Override // db5.o4
                                public final void onCreateMMMenu(db5.g4 g4Var) {
                                    int i19 = com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI.f162112e;
                                    com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI shakePersonalInfoUI2 = com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI.this;
                                    g4Var.d(2, i65.a.d(shakePersonalInfoUI2.getContext(), com.tencent.mm.R.color.f478532ac), i65.a.r(shakePersonalInfoUI2.getContext(), com.tencent.mm.R.string.j1z));
                                }
                            };
                            k0Var2.f211881s = new db5.t4() { // from class: com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI$$d
                                @Override // db5.t4
                                public final void onMMMenuItemSelected(android.view.MenuItem menuItem2, int i19) {
                                    int i27 = com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI.f162112e;
                                    com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI shakePersonalInfoUI2 = com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI.this;
                                    shakePersonalInfoUI2.getClass();
                                    if (menuItem2.getItemId() == 2) {
                                        c01.d9.b().p().w(4110, java.lang.Boolean.TRUE);
                                        db5.t7.i(shakePersonalInfoUI2, i65.a.r(shakePersonalInfoUI2.getContext(), com.tencent.mm.R.string.j3d), com.tencent.mm.R.raw.icons_filled_done);
                                    }
                                }
                            };
                            k0Var2.v();
                        }
                    }
                };
                k0Var.v();
            }
        }
        if ("shake_item_sound".equals(str)) {
            boolean t17 = com.tencent.mm.sdk.platformtools.t8.t1((java.lang.Boolean) c01.d9.b().p().l(4112, null));
            c01.d9.b().p().w(4112, java.lang.Boolean.valueOf(!t17));
            int i17 = t17 ? 55 : 54;
            ku5.u0 u0Var2 = ku5.t0.f312615d;
            y24.a aVar2 = new y24.a(null, i17);
            ku5.t0 t0Var2 = (ku5.t0) u0Var2;
            t0Var2.getClass();
            t0Var2.w(aVar2, 100L, null);
        }
        if ("say_hi_list_shake_title".equals(str)) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI.class);
            intent.putExtra("IntentSayHiType", 1);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/shake/ui/ShakePersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/shake/ui/ShakePersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ku5.u0 u0Var3 = ku5.t0.f312615d;
            y24.a aVar3 = new y24.a(null, 56);
            ku5.t0 t0Var3 = (ku5.t0) u0Var3;
            t0Var3.getClass();
            t0Var3.w(aVar3, 100L, null);
        }
        if ("shake_item_histoty_list".equals(str)) {
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.shake.ui.ShakeItemListUI.class);
            intent2.putExtra("_key_show_type_", 100);
            intent2.putExtra("_key_title_", getString(com.tencent.mm.R.string.j2q));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/shake/ui/ShakePersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/shake/ui/ShakePersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ku5.u0 u0Var4 = ku5.t0.f312615d;
            y24.a aVar4 = new y24.a(null, 57);
            ku5.t0 t0Var4 = (ku5.t0) u0Var4;
            t0Var4.getClass();
            t0Var4.w(aVar4, 100L, null);
        }
        if ("shake_msg_list".equals(str)) {
            android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.shake.ui.ShakeMsgListUI.class);
            intent3.putExtra("shake_msg_from", 2);
            intent3.putExtra("shake_msg_list_title", getString(com.tencent.mm.R.string.j3o));
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent3);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/shake/ui/ShakePersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/shake/ui/ShakePersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ku5.u0 u0Var5 = ku5.t0.f312615d;
            y24.a aVar5 = new y24.a(null, 58);
            ku5.t0 t0Var5 = (ku5.t0) u0Var5;
            t0Var5.getClass();
            t0Var5.w(aVar5, 100L, null);
        }
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (gm0.j1.a()) {
            ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        }
        if (((com.tencent.mm.ui.base.preference.h0) this.f162113d).h("shake_item_shake_tv_list") == null) {
            com.tencent.mars.xlog.Log.e(com.tencent.mm.ui.base.preference.MMPreference.TAG, "shake_tv_list preference is null");
            return;
        }
        if ((com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).a().b(1, "ShowConfig", "showShakeTV"), 0) == 1) || x51.o1.f452058k) {
            return;
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f162113d).m("shake_item_shake_tv_list", true);
    }
}
