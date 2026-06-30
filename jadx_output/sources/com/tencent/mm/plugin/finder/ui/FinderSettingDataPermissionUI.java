package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSettingDataPermissionUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderSettingDataPermissionUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.ui.d5 f128708d;

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494883dm;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.f492858of1);
        setBackBtn(new com.tencent.mm.plugin.finder.ui.jg(this));
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        kotlin.jvm.internal.o.f(preferenceScreen, "getPreferenceScreen(...)");
        com.tencent.mm.plugin.finder.ui.d5 d5Var = new com.tencent.mm.plugin.finder.ui.d5(this, preferenceScreen);
        this.f128708d = d5Var;
        android.app.Activity activity = d5Var.f129051a;
        java.lang.String stringExtra = activity.getIntent().getStringExtra("finder_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        d5Var.f129053c = stringExtra;
        if (stringExtra.length() == 0) {
            d5Var.f129053c = xy2.c.e(activity);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        az2.f fVar;
        super.onDestroy();
        com.tencent.mm.plugin.finder.ui.d5 d5Var = this.f128708d;
        if (d5Var == null || (fVar = d5Var.f129054d) == null) {
            return;
        }
        fVar.b();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference;
        com.tencent.mm.plugin.finder.ui.d5 d5Var = this.f128708d;
        if (d5Var == null) {
            return true;
        }
        java.lang.String str = preference != null ? preference.f197780q : null;
        if (str != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderDataPermissionSetting", "click ".concat(str));
            boolean y17 = r26.i0.y(str, "reference_", false);
            com.tencent.mm.ui.base.preference.r rVar2 = d5Var.f129052b;
            if (y17) {
                try {
                    int parseInt = java.lang.Integer.parseInt(r26.n0.W(str, "reference_"));
                    if (parseInt != 0) {
                        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) rVar2).h(str);
                        checkBoxPreference = h17 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h17 : null;
                        if (checkBoxPreference != null) {
                            boolean N = checkBoxPreference.N();
                            com.tencent.mars.xlog.Log.i("Finder.FinderDataPermissionSetting", "onReferencePermissionClick: referenceType=" + parseInt + ", isEnable=" + N);
                            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                            com.tencent.mm.plugin.finder.ui.c5 c5Var = d5Var.f129056f;
                            hb2.u uVar = hb2.u.f280096e;
                            uVar.getClass();
                            r45.ro4 ro4Var = new r45.ro4();
                            ro4Var.set(1, java.lang.Integer.valueOf(parseInt));
                            ro4Var.set(0, java.lang.Integer.valueOf(N ? 1 : 2));
                            com.tencent.mars.xlog.Log.i(hb2.u.f280097f, "[modifyReferenceSwitch] referenceType=" + parseInt + ", isEnable=" + N);
                            hb2.w0.m(uVar, ro4Var, c5Var, false, false, null, null, 60, null);
                        }
                    }
                } catch (java.lang.NumberFormatException e17) {
                    com.tencent.mars.xlog.Log.e("Finder.FinderDataPermissionSetting", "onReferencePermissionClick: invalid key=".concat(str), e17);
                }
            } else if (kotlin.jvm.internal.o.b(str, "feed_reproduction")) {
                com.tencent.mm.ui.base.preference.Preference h18 = ((com.tencent.mm.ui.base.preference.h0) rVar2).h("feed_reproduction");
                com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = h18 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h18 : null;
                if (checkBoxPreference2 != null) {
                    boolean N2 = checkBoxPreference2.N();
                    ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Lj(3, N2 ? 1 : 2);
                    g92.b bVar = g92.b.f269769e;
                    m92.b j37 = g92.a.j3(bVar, d5Var.f129053c, false, 2, null);
                    int i17 = j37 != null ? j37.field_extFlag : 0;
                    int i18 = N2 ? i17 & (-257) : i17 | 256;
                    m92.c cVar = new m92.c(d5Var.f129053c);
                    cVar.field_extFlag = i18;
                    bVar.C(cVar, m92.j.f324997o);
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    hb2.f fVar = hb2.f.f280040e;
                    fVar.getClass();
                    r45.vh2 vh2Var = new r45.vh2();
                    vh2Var.set(0, java.lang.Integer.valueOf(!N2 ? 1 : 0));
                    hb2.w0.m(fVar, vh2Var, null, false, false, null, null, 60, null);
                }
            } else if (kotlin.jvm.internal.o.b(str, "finder_mini_app_reference")) {
                com.tencent.mm.ui.base.preference.Preference h19 = ((com.tencent.mm.ui.base.preference.h0) rVar2).h("finder_mini_app_reference");
                checkBoxPreference = h19 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h19 : null;
                if (checkBoxPreference != null) {
                    boolean N3 = checkBoxPreference.N();
                    com.tencent.mars.xlog.Log.i("Finder.FinderDataPermissionSetting", "onMiniAppReferenceClick: isEnableMiniAppReference=" + N3);
                    ya2.g gVar = ya2.h.f460484a;
                    ya2.b2 b17 = gVar.b(d5Var.f129053c);
                    long j17 = b17 != null ? b17.field_additionalFlag : 0L;
                    long j18 = checkBoxPreference.N() ? j17 & (-17) : j17 | 16;
                    if (b17 != null) {
                        b17.field_additionalFlag = j18;
                        gVar.o(b17);
                    }
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    hb2.s0 s0Var = hb2.s0.f280090e;
                    java.lang.String str2 = d5Var.f129053c;
                    s0Var.getClass();
                    r45.ri2 ri2Var = new r45.ri2();
                    ri2Var.set(24, java.lang.Integer.valueOf(N3 ? 1 : 2));
                    if (str2 != null) {
                        hb2.w0.a(s0Var, str2, ri2Var, null, false, false, null, 56, null);
                    }
                }
            } else {
                boolean b18 = kotlin.jvm.internal.o.b(str, "material_poi_switch");
                android.app.Activity activity = d5Var.f129051a;
                if (b18) {
                    az2.f fVar2 = d5Var.f129054d;
                    if (fVar2 != null) {
                        fVar2.b();
                    }
                    az2.f a17 = az2.c.a(az2.f.f16125d, activity, activity.getString(com.tencent.mm.R.string.f490604zq), 0L, null, 8, null);
                    d5Var.f129054d = a17;
                    a17.a();
                    com.tencent.mm.ui.base.preference.Preference h27 = ((com.tencent.mm.ui.base.preference.h0) rVar2).h("material_poi_switch");
                    com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference3 = h27 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h27 : null;
                    if (checkBoxPreference3 != null) {
                        boolean N4 = checkBoxPreference3.N();
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        hb2.s0.f280090e.o(N4, d5Var.f129055e, d5Var.f129053c);
                        com.tencent.mars.xlog.Log.i("Finder.FinderDataPermissionSetting", "onMaterialPoiSwitchClick: isEnable=" + N4);
                        ((nn3.f) ((ra0.x) i95.n0.c(ra0.x.class))).Ni("view_clk", null, kz5.c1.k(new jz5.l("view_id", "grant_position_info_purview"), new jz5.l("my_finder_username", d5Var.f129053c), new jz5.l("purview_switch", java.lang.Integer.valueOf(N4 ? 1 : 0))), false);
                    }
                } else if (kotlin.jvm.internal.o.b(str, "save_edited_media_switch")) {
                    i95.m c17 = i95.n0.c(cq.k.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    cq.k kVar = (cq.k) c17;
                    boolean z17 = !cq.l1.b(kVar);
                    com.tencent.mm.sdk.platformtools.o4 o4Var = kVar.f221226g.f242285b;
                    if (o4Var != null) {
                        o4Var.G("KEY_FINDER_SAVE_EDITED_MEDIA_SWITCH", z17);
                    }
                    com.tencent.mm.ui.base.preference.Preference h28 = ((com.tencent.mm.ui.base.preference.h0) rVar2).h("save_edited_media_switch");
                    checkBoxPreference = h28 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h28 : null;
                    if (checkBoxPreference != null) {
                        com.tencent.mars.xlog.Log.i("Finder.FinderDataPermissionSetting", "onSaveEditedMediaSwitchClick: isEnable=" + checkBoxPreference.N() + " isSave:" + z17);
                    }
                } else if (kotlin.jvm.internal.o.b(str, "new_life_pic_content")) {
                    com.tencent.mm.ui.base.preference.Preference h29 = ((com.tencent.mm.ui.base.preference.h0) rVar2).h("new_life_pic_content");
                    com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference4 = h29 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h29 : null;
                    if (checkBoxPreference4 != null) {
                        boolean N5 = checkBoxPreference4.N();
                        com.tencent.mars.xlog.Log.i("Finder.FinderDataPermissionSetting", "onNewLifePicContentReferenceClick: isEnable=" + N5);
                        ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).sj(d85.g0.IMAGE_CONTENT_DATA.f227192d, d85.f0.Q.f227176d, N5);
                        ((nn3.f) ((ra0.x) i95.n0.c(ra0.x.class))).Ni("view_clk", null, kz5.c1.k(new jz5.l("view_id", "grant_picture_info_purview"), new jz5.l("my_finder_username", d5Var.f129053c), new jz5.l("purview_switch", java.lang.Integer.valueOf(N5 ? 1 : 0))), false);
                    }
                } else if (kotlin.jvm.internal.o.b(str, "settings_protect_hint")) {
                    ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).sk(activity, null);
                }
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        boolean z17;
        java.util.LinkedList<r45.dt2> list;
        boolean z18;
        super.onResume();
        com.tencent.mm.plugin.finder.ui.d5 d5Var = this.f128708d;
        if (d5Var != null) {
            com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) d5Var.f129052b;
            h0Var.m("material_poi_switch", false);
            com.tencent.mm.ui.base.preference.Preference h17 = h0Var.h("material_poi_switch");
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = h17 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h17 : null;
            if (checkBoxPreference != null) {
                boolean c17 = hc2.s.c(ya2.h.f460484a.b(d5Var.f129053c));
                checkBoxPreference.O(c17);
                checkBoxPreference.w(true);
                checkBoxPreference.f197785v = false;
                com.tencent.mars.xlog.Log.i("Finder.FinderDataPermissionSetting", "[initMaterialPoiSwitch] checked:" + c17);
            }
            h0Var.m("new_life_pic_content", true);
            d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
            d85.g0 g0Var = d85.g0.IMAGE_CONTENT_DATA;
            java.lang.String str = d85.f0.Q.f227176d;
            d85.d1 d1Var = (d85.d1) m0Var;
            d1Var.getClass();
            java.lang.String str2 = g0Var.f227192d;
            if (str2 == null) {
                str2 = "";
            }
            com.tencent.mm.sdk.platformtools.o4 Zi = d1Var.Zi(str2);
            if (Zi != null) {
                if (str == null) {
                    str = "";
                }
                z17 = Zi.getBoolean(str, false);
            } else {
                z17 = false;
            }
            com.tencent.mm.ui.base.preference.Preference h18 = h0Var.h("new_life_pic_content");
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = h18 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h18 : null;
            if (checkBoxPreference2 != null) {
                checkBoxPreference2.O(z17);
                checkBoxPreference2.f197785v = false;
            }
            h0Var.m("save_edited_media_switch", false);
            com.tencent.mm.ui.base.preference.Preference h19 = h0Var.h("save_edited_media_switch");
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference3 = h19 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h19 : null;
            if (checkBoxPreference3 != null) {
                i95.m c18 = i95.n0.c(cq.k.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                boolean b17 = cq.l1.b((cq.k) c18);
                checkBoxPreference3.O(b17);
                checkBoxPreference3.w(true);
                checkBoxPreference3.f197785v = false;
                com.tencent.mars.xlog.Log.i("Finder.FinderDataPermissionSetting", "[initSaveEditedMediaSwitch] checked:" + b17);
            }
            com.tencent.mm.ui.base.preference.Preference h27 = h0Var.h("settings_protect_hint");
            com.tencent.mm.plugin.finder.widget.pref.FinderProtectHintPreference finderProtectHintPreference = h27 instanceof com.tencent.mm.plugin.finder.widget.pref.FinderProtectHintPreference ? (com.tencent.mm.plugin.finder.widget.pref.FinderProtectHintPreference) h27 : null;
            if (finderProtectHintPreference != null) {
                if (hc2.s.g()) {
                    com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                    if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.W0).getValue()).r()).booleanValue()) {
                        z18 = true;
                        finderProtectHintPreference.L = z18;
                    }
                }
                z18 = false;
                finderProtectHintPreference.L = z18;
            }
            if (((java.lang.Boolean) ((jz5.n) com.tencent.mm.plugin.finder.ui.d5.f129050g).getValue()).booleanValue()) {
                d5Var.a("feed_reproduction");
                d5Var.a("finder_mini_app_reference");
                d5Var.a("settings_video_reference_desc");
                ya2.b2 b18 = ya2.h.f460484a.b(d5Var.f129053c);
                r45.et2 et2Var = b18 != null ? b18.field_reference_info : null;
                android.app.Activity activity = d5Var.f129051a;
                if (et2Var != null && (list = et2Var.getList(0)) != null) {
                    for (r45.dt2 dt2Var : list) {
                        com.tencent.mars.xlog.Log.i("Finder.FinderDataPermissionSetting", "initReferencePermissions type=" + dt2Var.getInteger(0) + ", name=" + dt2Var.getString(1) + ", status=" + dt2Var.getInteger(2));
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reference_");
                        sb6.append(dt2Var.getInteger(0));
                        java.lang.String sb7 = sb6.toString();
                        com.tencent.mm.ui.base.preference.Preference h28 = h0Var.h(sb7);
                        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference4 = h28 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h28 : null;
                        if (checkBoxPreference4 == null) {
                            checkBoxPreference4 = new com.tencent.mm.ui.base.preference.CheckBoxPreference(activity);
                            checkBoxPreference4.f197785v = false;
                            checkBoxPreference4.C(sb7);
                            h0Var.d(checkBoxPreference4, -1);
                        }
                        checkBoxPreference4.L(dt2Var.getString(1));
                        if (hc2.s.g()) {
                            checkBoxPreference4.O(false);
                            checkBoxPreference4.w(false);
                        } else {
                            checkBoxPreference4.O(dt2Var.getInteger(2) == 1);
                            checkBoxPreference4.w(true);
                        }
                    }
                }
                if (!hc2.s.g() && h0Var.h("settings_video_reference_desc") == null) {
                    com.tencent.mm.ui.base.preference.PreferenceFooterCategory preferenceFooterCategory = new com.tencent.mm.ui.base.preference.PreferenceFooterCategory(activity);
                    preferenceFooterCategory.C("settings_video_reference_desc");
                    preferenceFooterCategory.L(activity.getString(com.tencent.mm.R.string.p5u));
                    h0Var.d(preferenceFooterCategory, -1);
                }
            } else {
                m92.b j37 = g92.a.j3(g92.b.f269769e, d5Var.f129053c, false, 2, null);
                boolean z19 = ((j37 != null ? j37.field_extFlag : 0) & 256) == 0;
                com.tencent.mm.ui.base.preference.Preference h29 = h0Var.h("feed_reproduction");
                com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference5 = h29 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h29 : null;
                if (checkBoxPreference5 != null) {
                    if (hc2.s.g()) {
                        checkBoxPreference5.O(false);
                        checkBoxPreference5.w(false);
                    } else {
                        checkBoxPreference5.O(z19);
                        checkBoxPreference5.w(true);
                    }
                    checkBoxPreference5.f197785v = false;
                }
                h0Var.m("finder_mini_app_reference", ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.J0).getValue()).r()).intValue() == 0);
                ya2.b2 b19 = ya2.h.f460484a.b(d5Var.f129053c);
                boolean z27 = ((b19 != null ? b19.field_additionalFlag : 0L) & 16) == 0;
                com.tencent.mm.ui.base.preference.Preference h37 = h0Var.h("finder_mini_app_reference");
                com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference6 = h37 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h37 : null;
                if (checkBoxPreference6 != null) {
                    if (hc2.s.g()) {
                        checkBoxPreference6.O(false);
                        checkBoxPreference6.w(false);
                    } else {
                        checkBoxPreference6.O(z27);
                        checkBoxPreference6.w(true);
                    }
                    checkBoxPreference6.f197785v = false;
                }
            }
            h0Var.notifyDataSetChanged();
        }
    }
}
