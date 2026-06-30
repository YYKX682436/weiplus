package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes9.dex */
public class SettingsManageFindMoreUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f160491q = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f160492d;

    /* renamed from: h, reason: collision with root package name */
    public int f160496h;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f160493e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f160494f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f160495g = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public boolean f160497i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f160498m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f160499n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f160500o = false;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f160501p = true;

    public void V6() {
        java.util.HashMap hashMap = this.f160495g;
        java.util.Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            java.util.HashMap hashMap2 = this.f160494f;
            if (hashMap2.containsKey(java.lang.Integer.valueOf(intValue)) && hashMap2.get(java.lang.Integer.valueOf(intValue)) != hashMap.get(java.lang.Integer.valueOf(intValue))) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15185, java.lang.Integer.valueOf(intValue), hashMap.get(java.lang.Integer.valueOf(intValue)), 1);
                if (intValue == 0) {
                    if (((java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(intValue))).intValue() == 0) {
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SNS_ENTRY_SWITCH_INT, -1);
                    } else if (((java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(intValue))).intValue() == 1) {
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SNS_ENTRY_SWITCH_INT, 1);
                    }
                }
            }
        }
    }

    public boolean W6(long j17) {
        return (j17 & this.f160492d) != 0;
    }

    public boolean X6(long j17) {
        return (j17 & ((long) this.f160496h)) == 0;
    }

    public void Y6() {
        com.tencent.mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent shouldShowAppBrandEntranceInFindMoreEvent = new com.tencent.mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent();
        shouldShowAppBrandEntranceInFindMoreEvent.f54779g.f7462a = true;
        shouldShowAppBrandEntranceInFindMoreEvent.e();
        boolean z17 = shouldShowAppBrandEntranceInFindMoreEvent.f54780h.f7576a;
        boolean z18 = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() && ((uh4.c0) i95.n0.c(uh4.c0.class)).G8() == 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "shouldShowMiniProgram %s, isTeenModeAndNotAccessRight:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_miniprogram_switch");
        checkBoxPreference.f197785v = false;
        if (!z17 || z18) {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_miniprogram_switch", true);
        } else {
            boolean W6 = W6(16777216L);
            java.util.HashMap hashMap = this.f160494f;
            if (W6) {
                checkBoxPreference.O(false);
                hashMap.put(8, 0);
            } else {
                checkBoxPreference.O(true);
                hashMap.put(8, 1);
            }
        }
        j7(com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryAppbrand, "settings_miniprogram_switch");
    }

    public void Z6() {
        boolean el6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "showFinder %s", java.lang.Boolean.valueOf(el6));
        boolean z17 = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() && ((uh4.c0) i95.n0.c(uh4.c0.class)).G8() == 2;
        if (!el6 || z17) {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_finder_switch", true);
            return;
        }
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_finder_switch");
        checkBoxPreference.f197785v = false;
        boolean W6 = W6(34359738368L);
        java.util.HashMap hashMap = this.f160494f;
        if (W6) {
            checkBoxPreference.O(false);
            hashMap.put(11, 0);
        } else {
            checkBoxPreference.O(true);
            hashMap.put(11, 1);
        }
        j7(com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryChannels, "settings_finder_switch");
    }

    public void a7() {
        m33.b1 a17 = m33.a1.a();
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_game_switch");
        checkBoxPreference.f197785v = false;
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        if (a17 == null || !((com.tencent.mm.plugin.game.h0) a17).Vi(this) || isTeenMode) {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_game_switch", true);
        } else {
            boolean W6 = W6(8388608L);
            java.util.HashMap hashMap = this.f160494f;
            if (W6) {
                checkBoxPreference.O(false);
                hashMap.put(7, 0);
            } else {
                checkBoxPreference.O(true);
                hashMap.put(7, 1);
            }
        }
        j7(com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryGame, "settings_game_switch");
    }

    public void b7() {
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        boolean f17 = vd2.t3.f435921a.f();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "showFinderLiveEntry %s", java.lang.Boolean.valueOf(f17));
        if (((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).Bi()) {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_finder_live_switch", true);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_finder_live_above_look_switch", true);
        }
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        if (!f17 || isTeenMode) {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_finder_live_switch", true);
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_finder_live_above_look_switch", true);
            return;
        }
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h(((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).wi());
        checkBoxPreference.f197785v = false;
        boolean W6 = W6(9007199254740992L);
        java.util.HashMap hashMap = this.f160494f;
        if (W6) {
            checkBoxPreference.O(false);
            hashMap.put(13, 0);
        } else {
            checkBoxPreference.O(true);
            hashMap.put(13, 1);
        }
        j7(com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryFinderLive, ((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).wi());
    }

    public void c7() {
        boolean z17;
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_look_switch");
        checkBoxPreference.f197785v = false;
        boolean z18 = !W6(67108864L);
        if (u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null))) {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_look_switch", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "european user");
            z18 = false;
            z17 = false;
        } else {
            z17 = true;
        }
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "isInExperiment %s ,openLook %s, isTeenMode:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(isTeenMode));
        java.util.HashMap hashMap = this.f160494f;
        if (z17 && z18 && !isTeenMode) {
            checkBoxPreference.O(true);
            hashMap.put(10, 1);
        } else if (!z17 || isTeenMode) {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_look_switch", true);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_look_switch", false);
            checkBoxPreference.O(false);
            hashMap.put(10, 0);
        }
        j7(com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryLooks, "settings_look_switch");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public com.tencent.mm.ui.base.preference.h0 createAdapter(android.content.SharedPreferences sharedPreferences) {
        return new com.tencent.mm.ui.base.preference.b(this, getListView(), sharedPreferences);
    }

    public void d7() {
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_search_switch");
        checkBoxPreference.f197785v = false;
        boolean W6 = W6(2097152L);
        java.util.HashMap hashMap = this.f160494f;
        if (W6) {
            checkBoxPreference.O(false);
            hashMap.put(3, 0);
        } else {
            checkBoxPreference.O(true);
            hashMap.put(3, 1);
        }
        j7(com.tencent.mm.sdk.platformtools.f9.MeSetDiscoverySearch, "settings_search_switch");
    }

    public final void e7(com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference, int i17, java.lang.String str, java.lang.String str2, wd0.o1 o1Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = getContext().getResources().getString(com.tencent.mm.R.string.f492984ik0);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = getContext().getResources().getString(com.tencent.mm.R.string.ijz);
        }
        v24.o0.g(this, str, str2, "", new com.tencent.mm.plugin.setting.ui.setting.ag(this, checkBoxPreference, i17, o1Var));
    }

    public void f7(boolean z17) {
        ((ty4.n) ((uy4.v) i95.n0.c(uy4.v.class))).Ni("labs_browse", z17);
        if (z17) {
            this.f160492d &= -67108865;
        } else {
            this.f160492d |= 67108864;
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (!(this instanceof com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "oplog extstatus:" + this.f160492d + ",pluginFlag:" + this.f160496h);
            gm0.j1.u().c().w(147457, java.lang.Long.valueOf(this.f160492d));
            gm0.j1.u().c().w(34, java.lang.Integer.valueOf(this.f160496h));
            java.util.HashMap hashMap = this.f160493e;
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                int intValue = ((java.lang.Integer) entry.getKey()).intValue();
                int intValue2 = ((java.lang.Integer) entry.getValue()).intValue();
                r45.p53 p53Var = new r45.p53();
                p53Var.f382761d = intValue;
                p53Var.f382762e = intValue2;
                ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
            }
            hashMap.clear();
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new e21.t(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", this.f160496h, "", 0, "", 0));
        }
        V6();
    }

    public void g7(boolean z17, long j17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "switch ext change : open = " + z17 + " item value = " + j17 + " functionId = " + i17);
        if (z17) {
            this.f160492d = (~j17) & this.f160492d;
        } else {
            this.f160492d = j17 | this.f160492d;
        }
        this.f160493e.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(z17 ? 1 : 2));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        boolean a07 = c01.e2.a0();
        this.f160499n = a07;
        return a07 ? com.tencent.mm.R.xml.f494941c9 : com.tencent.mm.R.xml.f494939c7;
    }

    public final void h7(boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "switch plugin flag, open %s, flag %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        if (z17) {
            this.f160496h &= ~i17;
        } else {
            this.f160496h |= i17;
        }
    }

    public void i7(com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference, boolean z17, boolean z18) {
        if (z17) {
            if (z18) {
                return;
            }
            g7(z17, 2097152L, 50);
        } else {
            su4.g1 g1Var = (su4.g1) i95.n0.c(su4.g1.class);
            com.tencent.mm.plugin.setting.ui.setting.dg dgVar = new com.tencent.mm.plugin.setting.ui.setting.dg(this, checkBoxPreference, z18, z17);
            ((com.tencent.mm.plugin.websearch.p2) g1Var).wi();
            dgVar.run();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.is_);
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.bg(this));
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_sns_switch");
        checkBoxPreference.f197785v = false;
        boolean X6 = X6(32768L);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "openSns %s", java.lang.Boolean.valueOf(X6));
        java.util.HashMap hashMap = this.f160494f;
        if (X6) {
            checkBoxPreference.O(true);
            hashMap.put(0, 1);
        } else {
            checkBoxPreference.O(false);
            hashMap.put(0, 0);
        }
        Z6();
        b7();
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_scan_switch");
        checkBoxPreference2.f197785v = false;
        if (W6(1048576L)) {
            checkBoxPreference2.O(false);
            hashMap.put(1, 0);
        } else {
            checkBoxPreference2.O(true);
            hashMap.put(1, 1);
        }
        j7(com.tencent.mm.sdk.platformtools.f9.GlobalScan, "settings_scan_switch");
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference3 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_shake_switch");
        checkBoxPreference3.f197785v = false;
        boolean X62 = X6(256L);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "openShake %s", java.lang.Boolean.valueOf(X62));
        if (X62) {
            checkBoxPreference3.O(true);
            hashMap.put(2, 1);
        } else {
            checkBoxPreference3.O(false);
            hashMap.put(2, 0);
        }
        j7(com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryShake, "settings_shake_switch");
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_shake_switch", true);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_shake_switch", false);
        }
        c7();
        d7();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        vd2.t3 t3Var = vd2.t3.f435921a;
        if (t3Var.g()) {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_nearby_switch", true);
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference4 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_nearby_live_friend_switch");
            checkBoxPreference4.f197785v = false;
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            if (t3Var.f()) {
                checkBoxPreference4.L(getContext().getResources().getString(com.tencent.mm.R.string.cfp));
            } else {
                checkBoxPreference4.L(getContext().getResources().getString(com.tencent.mm.R.string.h6s));
            }
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference5 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_nearby_live_friend_person_switch");
            checkBoxPreference5.f197785v = false;
            boolean z17 = !W6(70368744177664L);
            boolean X63 = X6(512L);
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "openNearbyLiveFriends:%s openNearbyLiveFriendsPerson:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(X63));
            if (z17) {
                checkBoxPreference4.O(true);
                hashMap.put(5, 1);
                ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_nearby_live_friend_person_switch", false);
            } else {
                checkBoxPreference4.O(false);
                hashMap.put(5, 0);
                ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_nearby_live_friend_person_switch", true);
            }
            if (X63) {
                checkBoxPreference5.O(true);
                hashMap.put(4, 1);
            } else {
                checkBoxPreference5.O(false);
                hashMap.put(4, 0);
            }
            j7(com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryNearbyLiveFriends, "settings_nearby_live_friend_switch");
            j7(com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryNearbyLiveFriendsPerson, "settings_nearby_live_friend_person_switch");
            if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
                ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_nearby_live_friend_switch", true);
                ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_nearby_live_friend_person_switch", true);
            } else {
                ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_nearby_live_friend_switch", false);
            }
        } else {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_nearby_live_friend_switch", true);
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_nearby_live_friend_person_switch", true);
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference6 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_nearby_switch");
            checkBoxPreference6.f197785v = false;
            boolean X64 = X6(512L);
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "openNearby %s", java.lang.Boolean.valueOf(X64));
            if (X64) {
                checkBoxPreference6.O(true);
                hashMap.put(4, 1);
            } else {
                checkBoxPreference6.O(false);
                hashMap.put(4, 0);
            }
            j7(com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryNearby, "settings_nearby_switch");
            if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
                ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_nearby_switch", true);
            } else {
                ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_nearby_switch", false);
            }
        }
        k35.q a17 = k35.r.a();
        boolean z18 = a17 != null && ((com.tencent.mm.plugin.subapp.jdbiz.q) a17).aj();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "showShopping %s", java.lang.Boolean.valueOf(z18));
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference7 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_shopping_switch");
        checkBoxPreference7.f197785v = false;
        if (!z18 || isTeenMode) {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_shopping_switch", true);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_shopping_switch", false);
        }
        if (W6(4194304L)) {
            checkBoxPreference7.O(false);
            hashMap.put(6, 0);
        } else {
            checkBoxPreference7.O(true);
            hashMap.put(6, 1);
        }
        j7(com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryShop, "settings_shopping_switch");
        a7();
        Y6();
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference8 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_wechatout_switch");
        boolean z19 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("WCOEntranceSwitch", 0) > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "showWeChatOut %s", java.lang.Boolean.valueOf(z19));
        if (z19) {
            checkBoxPreference8.f197785v = false;
            if (W6(33554432L)) {
                checkBoxPreference8.O(false);
                hashMap.put(9, 0);
            } else {
                checkBoxPreference8.O(true);
                hashMap.put(9, 1);
            }
        } else {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_wechatout_switch", true);
        }
        j7(com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryWeChatOut, "settings_wechatout_switch");
        if (c01.e2.a0()) {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_switch_bottom_tip", true);
        }
        ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).notifyDataSetChanged();
    }

    public final void j7(com.tencent.mm.sdk.platformtools.f9 f9Var, java.lang.String str) {
        if (f9Var.n()) {
            if (f9Var.h()) {
                ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m(str, true);
                return;
            }
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h(str);
            checkBoxPreference.w(false);
            checkBoxPreference.T();
            com.tencent.mm.plugin.setting.ui.setting.cg cgVar = new com.tencent.mm.plugin.setting.ui.setting.cg(this, f9Var);
            checkBoxPreference.T = cgVar;
            android.view.View view = checkBoxPreference.S;
            if (view != null) {
                view.setOnClickListener(cgVar);
            }
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f160498m = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ExtFunctionSwitchEntry", 0) == 1;
        this.f160497i = c01.z1.H().booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "onCreate isShowWechatUserDialog = " + this.f160498m + "， isOverseaNewUser = " + this.f160497i);
        this.f160492d = c01.z1.j();
        this.f160499n = c01.e2.a0();
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(this);
        if ("zh_CN".equals(f17) || "zh_HK".equals(f17) || "zh_TW".equals(f17)) {
            this.f160500o = true;
        } else {
            this.f160500o = false;
        }
        this.f160496h = c01.z1.n();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "onCreate extStatus %d, pluginFlag %d", java.lang.Long.valueOf(this.f160492d), java.lang.Integer.valueOf(this.f160496h));
        initView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        int i17;
        int i18;
        boolean z17;
        int i19;
        int i27;
        int i28;
        boolean z18;
        if (!(preference instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference)) {
            return true;
        }
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) preference;
        java.lang.String str = preference.f197780q;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "click pref key %s", str);
        boolean z19 = false;
        if (str.equals("settings_sns_switch")) {
            h7(checkBoxPreference.N(), 32768);
            i27 = 0;
        } else if (str.equals("settings_scan_switch")) {
            if (!com.tencent.mm.sdk.platformtools.f9.GlobalScan.k(this, null)) {
                return true;
            }
            g7(checkBoxPreference.N(), 1048576L, 49);
            i27 = 1;
        } else if (str.equals("settings_search_switch")) {
            if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoverySearch.k(this, null)) {
                return true;
            }
            if (this.f160499n && this.f160498m && checkBoxPreference.N()) {
                v24.o0.h(this, 2097152L, checkBoxPreference, new com.tencent.mm.plugin.setting.ui.setting.vf(this, checkBoxPreference), 2);
                i17 = -1;
                i27 = i17;
                z19 = false;
            } else {
                i17 = 3;
                if (this.f160499n && this.f160498m && !checkBoxPreference.N()) {
                    e7(checkBoxPreference, 3, getContext().getResources().getString(com.tencent.mm.R.string.ijy), getContext().getResources().getString(com.tencent.mm.R.string.ijx), null);
                    i27 = i17;
                    z19 = true;
                } else {
                    i7(checkBoxPreference, checkBoxPreference.N(), false);
                    i27 = 3;
                }
            }
        } else if (str.equals("settings_shopping_switch")) {
            if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryShop.k(this, null)) {
                return true;
            }
            g7(checkBoxPreference.N(), 4194304L, 51);
            i27 = 6;
        } else if (str.equals("settings_game_switch")) {
            if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryGame.k(this, null)) {
                return true;
            }
            g7(checkBoxPreference.N(), 8388608L, 52);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(848L, checkBoxPreference.N() ? 0L : 1L, 1L, false);
            i27 = 7;
        } else if (str.equals("settings_miniprogram_switch")) {
            if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryAppbrand.k(this, null)) {
                return true;
            }
            java.lang.Object[] objArr = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_oversea_close_service_dialog_enable, 0) == 1;
            if (this.f160499n && this.f160498m && checkBoxPreference.N()) {
                v24.o0.h(this, 16777216L, checkBoxPreference, new com.tencent.mm.plugin.setting.ui.setting.wf(this, checkBoxPreference), 2);
                z18 = false;
                i28 = -1;
            } else if (this.f160499n && this.f160498m && objArr == true && !checkBoxPreference.N()) {
                i28 = 8;
                e7(checkBoxPreference, 8, getContext().getResources().getString(com.tencent.mm.R.string.iju), getContext().getResources().getString(com.tencent.mm.R.string.ijt), new com.tencent.mm.plugin.setting.ui.setting.xf(this));
                z18 = true;
            } else {
                g7(checkBoxPreference.N(), 16777216L, 53);
                if (!checkBoxPreference.N()) {
                    ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).Ai();
                }
                i28 = 8;
                z18 = false;
            }
            int i29 = i28;
            z19 = z18;
            i27 = i29;
        } else if (str.equals("settings_wechatout_switch")) {
            if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryWeChatOut.k(this, null)) {
                return true;
            }
            g7(checkBoxPreference.N(), 33554432L, 54);
            i27 = 9;
        } else if (str.equals("settings_shake_switch")) {
            if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryShake.k(this, null)) {
                return true;
            }
            h7(checkBoxPreference.N(), 256);
            i27 = 2;
        } else if (!str.equals("settings_nearby_switch")) {
            if (str.equals("settings_nearby_live_friend_switch")) {
                if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryNearbyLiveFriends.k(this, null)) {
                    return true;
                }
                g7(checkBoxPreference.N(), 70368744177664L, 61);
                ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_nearby_live_friend_person_switch", !checkBoxPreference.N());
                long j17 = checkBoxPreference.N() ? 1L : 0L;
                com.tencent.mm.autogen.mmdata.rpt.DiscoverViewEntranceSettingStruct discoverViewEntranceSettingStruct = new com.tencent.mm.autogen.mmdata.rpt.DiscoverViewEntranceSettingStruct();
                discoverViewEntranceSettingStruct.f55837d = 12L;
                discoverViewEntranceSettingStruct.f55838e = j17;
                discoverViewEntranceSettingStruct.f55839f = 1L;
                discoverViewEntranceSettingStruct.k();
                com.tencent.mars.xlog.Log.i("FindMoreSettingReport", "reportSwitch " + discoverViewEntranceSettingStruct.n());
                i17 = 5;
            } else if (str.equals("settings_nearby_live_friend_person_switch")) {
                if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryNearbyLiveFriendsPerson.k(this, null)) {
                    return true;
                }
                h7(checkBoxPreference.N(), 512);
                long j18 = checkBoxPreference.N() ? 1L : 0L;
                com.tencent.mm.autogen.mmdata.rpt.DiscoverViewEntranceSettingStruct discoverViewEntranceSettingStruct2 = new com.tencent.mm.autogen.mmdata.rpt.DiscoverViewEntranceSettingStruct();
                discoverViewEntranceSettingStruct2.f55837d = 12L;
                discoverViewEntranceSettingStruct2.f55838e = j18;
                discoverViewEntranceSettingStruct2.f55839f = 1L;
                discoverViewEntranceSettingStruct2.k();
                com.tencent.mars.xlog.Log.i("FindMoreSettingReport", "reportSwitch " + discoverViewEntranceSettingStruct2.n());
                i17 = 12;
            } else if (str.equals("settings_look_switch")) {
                if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryLooks.k(this, null)) {
                    return true;
                }
                if (this.f160499n && this.f160498m && checkBoxPreference.N()) {
                    v24.o0.h(this, 67108864L, checkBoxPreference, new com.tencent.mm.plugin.setting.ui.setting.yf(this, checkBoxPreference), 2);
                    i17 = -1;
                } else {
                    i17 = 10;
                    if (this.f160501p || !this.f160499n || !this.f160498m || checkBoxPreference.N()) {
                        f7(checkBoxPreference.N());
                    } else {
                        e7(checkBoxPreference, 10, getContext().getResources().getString(com.tencent.mm.R.string.f492984ik0), getContext().getResources().getString(com.tencent.mm.R.string.ijz), null);
                        i27 = i17;
                        z19 = true;
                    }
                }
            } else if (!str.equals("settings_finder_switch")) {
                if (str.equals(((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).wi())) {
                    if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryFinderLive.k(this, null)) {
                        return true;
                    }
                    g7(checkBoxPreference.N(), 9007199254740992L, 65);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "switch finderlive 65");
                    long j19 = checkBoxPreference.N() ? 1L : 0L;
                    com.tencent.mm.autogen.mmdata.rpt.DiscoverViewEntranceSettingStruct discoverViewEntranceSettingStruct3 = new com.tencent.mm.autogen.mmdata.rpt.DiscoverViewEntranceSettingStruct();
                    discoverViewEntranceSettingStruct3.f55837d = 13L;
                    discoverViewEntranceSettingStruct3.f55838e = j19;
                    discoverViewEntranceSettingStruct3.f55839f = 1L;
                    discoverViewEntranceSettingStruct3.k();
                    com.tencent.mars.xlog.Log.i("FindMoreSettingReport", "reportSwitch " + discoverViewEntranceSettingStruct3.n());
                    i17 = 13;
                }
                i17 = -1;
            } else {
                if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryChannels.k(this, null)) {
                    return true;
                }
                boolean z27 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_oversea_close_service_dialog_enable, 1) == 1;
                if (this.f160499n && this.f160498m && checkBoxPreference.N()) {
                    v24.o0.h(this, 34359738368L, checkBoxPreference, new com.tencent.mm.plugin.setting.ui.setting.zf(this, checkBoxPreference), 2);
                    i18 = -1;
                } else {
                    i18 = 11;
                    if (this.f160499n && this.f160498m && z27 && !checkBoxPreference.N()) {
                        e7(checkBoxPreference, 11, getContext().getResources().getString(com.tencent.mm.R.string.ijw), getContext().getResources().getString(com.tencent.mm.R.string.ijv), null);
                        z17 = true;
                        i19 = 11;
                        i27 = i19;
                        z19 = z17;
                    } else {
                        g7(checkBoxPreference.N(), 34359738368L, 57);
                    }
                }
                i19 = i18;
                z17 = false;
                i27 = i19;
                z19 = z17;
            }
            i27 = i17;
            z19 = false;
        } else {
            if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryNearby.k(this, null)) {
                return true;
            }
            h7(checkBoxPreference.N(), 512);
            i27 = 4;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SettingsManageFindMoreUI", "needShowCloseSwitchDilaogTips = %s", java.lang.Boolean.valueOf(z19));
        if (!z19) {
            boolean N = checkBoxPreference.N();
            if (i27 >= 0) {
                this.f160495g.put(java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(N ? 1 : 0));
            }
        }
        return true;
    }
}
