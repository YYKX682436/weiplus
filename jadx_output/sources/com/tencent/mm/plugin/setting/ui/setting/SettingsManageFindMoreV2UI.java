package com.tencent.mm.plugin.setting.ui.setting;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsManageFindMoreV2UI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class SettingsManageFindMoreV2UI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public long f160502d;

    /* renamed from: e, reason: collision with root package name */
    public int f160503e;

    /* renamed from: f, reason: collision with root package name */
    public long f160504f;

    /* renamed from: g, reason: collision with root package name */
    public long f160505g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f160506h = new java.util.LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f160507i = jz5.h.b(com.tencent.mm.plugin.setting.ui.setting.fg.f161037d);

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f160508m = jz5.h.b(com.tencent.mm.plugin.setting.ui.setting.eg.f160998d);

    public final int V6(boolean z17, int i17) {
        return z17 ? i17 | 2 : i17 & (-3);
    }

    public final void W6(com.tencent.mm.ui.base.preference.IconPreference iconPreference) {
        iconPreference.X1 = new com.tencent.mm.plugin.setting.ui.setting.gg(iconPreference);
    }

    public final boolean X6(long j17) {
        return (j17 & this.f160502d) != 0;
    }

    public final boolean Y6(int i17, int i18) {
        return (i17 & i18) == i18;
    }

    public final boolean Z6(long j17) {
        return (this.f160504f & j17) == j17;
    }

    public final boolean a7(long j17) {
        return (j17 & ((long) this.f160503e)) == 0;
    }

    public final void b7(com.tencent.mm.ui.base.preference.IconPreference iconPreference) {
        int i17 = iconPreference.i().getInt("perf_extra_flag");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("perf_key", iconPreference.f197780q);
        intent.putExtra("perf_title", iconPreference.f197774h);
        intent.putExtra("perf_icon_res", iconPreference.f197777n);
        intent.putExtra("perf_icon_color", iconPreference.f197778o);
        intent.putExtra("is_show_in_findmore", !Y6(i17, 1));
        intent.putExtra("is_new_notify", !Y6(i17, 2));
        intent.putExtra("is_show_nearby", !Y6(i17, 4));
        intent.putExtra("KEY_ENTER_SCENE", this.f160505g);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startHalfActivity  INTENT_PERF_IS_SHOW = ");
        sb6.append(!Y6(i17, 1));
        sb6.append(" INTENT_PERF_IS_NOTIFY = ");
        sb6.append(!Y6(i17, 2));
        sb6.append(" INTENT_PERF_IS_SHOW_NEARBY = ");
        sb6.append(!Y6(i17, 4));
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsFindMoreV2UI", sb6.toString());
        bh5.c cVar = new bh5.c();
        cVar.f20922a.f20924a = getContext();
        cVar.d(intent);
        cVar.b(com.tencent.mm.plugin.setting.ui.setting.SettingHalfSceenDialogFragment.class);
        cVar.a("com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI");
        cVar.h(1);
    }

    public final void c7(com.tencent.mm.sdk.platformtools.f9 f9Var, java.lang.String str) {
        if (f9Var.n()) {
            if (f9Var.h()) {
                ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m(str, true);
                l14.b.f314994a.d(str);
                return;
            }
            com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h(str);
            kotlin.jvm.internal.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.IconPreference");
            com.tencent.mm.ui.base.preference.IconPreference iconPreference = (com.tencent.mm.ui.base.preference.IconPreference) h17;
            iconPreference.U1 = true;
            iconPreference.f197772f = new com.tencent.mm.plugin.setting.ui.setting.ig(f9Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d7(com.tencent.mm.ui.base.preference.IconPreference iconPreference, int i17) {
        java.lang.StringBuilder sb6;
        boolean Y6;
        try {
            l14.b bVar = l14.b.f314994a;
            java.lang.String str = iconPreference.f197780q;
            kotlin.jvm.internal.o.f(str, "getKey(...)");
            if (!l14.b.f314999f.contains(java.lang.Long.valueOf(bVar.a(str)))) {
                l14.b.f314998e.add(java.lang.Long.valueOf(bVar.a(str)));
                l14.b.f314996c = true;
            }
            java.lang.String str2 = "";
            if (i17 == 0) {
                iconPreference.H("");
                sb6 = new java.lang.StringBuilder("updatePreference  IS_SHOW = ");
                sb6.append(!Y6(i17, 1));
                sb6.append(" IS_NOTIFY = ");
                Y6 = Y6(i17, 2);
            } else {
                if (!Y6(i17, 1)) {
                    if (Y6(i17, 2)) {
                        java.util.Map map = v24.p0.f432942a;
                        java.lang.String str3 = iconPreference.f197780q;
                        kotlin.jvm.internal.o.f(str3, "getKey(...)");
                        java.lang.Integer num = (java.lang.Integer) v24.p0.f432942a.get(str3);
                        if (num != null ? v24.p0.f432944c.contains(java.lang.Integer.valueOf(num.intValue())) : false) {
                            str2 = getString(com.tencent.mm.R.string.isf);
                            kotlin.jvm.internal.o.f(str2, "getString(...)");
                        }
                    }
                    if (Y6(i17, 4)) {
                        java.util.Map map2 = v24.p0.f432942a;
                        java.lang.String str4 = iconPreference.f197780q;
                        kotlin.jvm.internal.o.f(str4, "getKey(...)");
                        java.lang.Integer num2 = (java.lang.Integer) v24.p0.f432942a.get(str4);
                        if (num2 != null ? v24.p0.f432945d.contains(java.lang.Integer.valueOf(num2.intValue())) : false) {
                            if (str2.length() > 0) {
                                str2 = str2.concat("\n");
                            }
                            str2 = str2 + getString(com.tencent.mm.R.string.isd);
                        }
                    }
                    iconPreference.H(str2);
                    return;
                }
                iconPreference.H(getString(com.tencent.mm.R.string.ise));
                sb6 = new java.lang.StringBuilder("updatePreference  IS_SHOW = ");
                sb6.append(!Y6(i17, 1));
                sb6.append(" IS_NOTIFY = ");
                Y6 = Y6(i17, 2);
            }
            sb6.append(!Y6);
            sb6.append(" IS_SHOW_NEARBY = ");
            sb6.append(!Y6(i17, 4));
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsFindMoreV2UI", sb6.toString());
            iconPreference.i().putInt("perf_extra_flag", i17);
        } finally {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("updatePreference  IS_SHOW = ");
            sb7.append(!Y6(i17, 1));
            sb7.append(" IS_NOTIFY = ");
            sb7.append(!Y6(i17, 2));
            sb7.append(" IS_SHOW_NEARBY = ");
            sb7.append(!Y6(i17, 4));
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsFindMoreV2UI", sb7.toString());
            iconPreference.i().putInt("perf_extra_flag", i17);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getHeaderResourceId() {
        return com.tencent.mm.R.layout.cld;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cle;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return c01.e2.a0() ? com.tencent.mm.R.xml.c_ : com.tencent.mm.R.xml.f494940c8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x056d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x067d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0705  */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 2071
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreV2UI.initView():void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1 && i18 == -1 && intent != null) {
            int i19 = !intent.getBooleanExtra("is_show_in_findmore", false) ? 1 : 0;
            if (!intent.getBooleanExtra("is_new_notify", false)) {
                i19 |= 2;
            }
            if (!intent.getBooleanExtra("is_show_nearby", false)) {
                i19 |= 4;
            }
            com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h(intent.getStringExtra("perf_key"));
            com.tencent.mm.ui.base.preference.IconPreference iconPreference = h17 instanceof com.tencent.mm.ui.base.preference.IconPreference ? (com.tencent.mm.ui.base.preference.IconPreference) h17 : null;
            if (iconPreference != null) {
                d7(iconPreference, i19);
                kc2.g1 b17 = ((com.tencent.mm.plugin.finder.extension.reddot.x2) ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk()).b1();
                if (b17 != null) {
                    kotlin.jvm.internal.o.f(iconPreference.f197780q, "getKey(...)");
                    kc2.q f17 = b17.f();
                    f17.getClass();
                    f17.f306478i.set(true);
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        setMMTitle("");
        this.mController.G0(getResources().getColor(com.tencent.mm.R.color.aaw));
        this.f160502d = c01.z1.j();
        this.f160503e = c01.z1.n();
        this.f160504f = c01.z1.h();
        android.content.Intent intent = getIntent();
        java.lang.Long NORMAL = com.tencent.mm.ui.t2.f209868b;
        kotlin.jvm.internal.o.f(NORMAL, "NORMAL");
        this.f160505g = intent.getLongExtra("KEY_ENTER_SCENE", NORMAL.longValue());
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsFindMoreV2UI", "onCreate extStatus %d, pluginFlag %d, discoveryCtrlFlag %d", java.lang.Long.valueOf(this.f160502d), java.lang.Integer.valueOf(this.f160503e), java.lang.Long.valueOf(this.f160504f));
        l14.b bVar = l14.b.f314994a;
        l14.b.f314995b = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        l14.b.f314998e.clear();
        l14.b.f314999f.clear();
        initView();
        bVar.b(1L, bVar.a("settings_ignore"), 0L, this.f160505g);
        ((vd0.o2) ((wd0.s1) i95.n0.c(wd0.s1.class))).Ni(true);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference pref) {
        kotlin.jvm.internal.o.g(pref, "pref");
        java.lang.String str = pref.f197780q;
        if (kotlin.jvm.internal.o.b(str, "settings_scan_switch")) {
            if (!com.tencent.mm.sdk.platformtools.f9.GlobalScan.k(this, null)) {
                return true;
            }
        } else if (kotlin.jvm.internal.o.b(str, "settings_search_switch")) {
            if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoverySearch.k(this, null)) {
                return true;
            }
        } else if (kotlin.jvm.internal.o.b(str, "settings_shopping_switch")) {
            if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryShop.k(this, null)) {
                return true;
            }
        } else if (kotlin.jvm.internal.o.b(str, "settings_game_switch")) {
            if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryGame.k(this, null)) {
                return true;
            }
        } else if (kotlin.jvm.internal.o.b(str, "settings_miniprogram_switch")) {
            if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryAppbrand.k(this, null)) {
                return true;
            }
        } else if (kotlin.jvm.internal.o.b(str, "settings_wechatout_switch")) {
            if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryWeChatOut.k(this, null)) {
                return true;
            }
        } else if (kotlin.jvm.internal.o.b(str, "settings_shake_switch")) {
            if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryShake.k(this, null)) {
                return true;
            }
        } else if (kotlin.jvm.internal.o.b(str, "settings_nearby_switch")) {
            if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryNearby.k(this, null)) {
                return true;
            }
        } else if (kotlin.jvm.internal.o.b(str, "settings_nearby_live_friend_switch")) {
            if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryNearbyLiveFriends.k(this, null)) {
                return true;
            }
        } else if (kotlin.jvm.internal.o.b(str, "settings_look_switch")) {
            if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryLooks.k(this, null)) {
                return true;
            }
        } else if (kotlin.jvm.internal.o.b(str, "settings_finder_switch")) {
            if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryChannels.k(this, null)) {
                return true;
            }
        } else if (kotlin.jvm.internal.o.b(str, ((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).wi())) {
            if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryFinderLive.k(this, null)) {
                return true;
            }
        } else if (kotlin.jvm.internal.o.b(str, "settings_ting_switch") && !com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryTing.k(this, null)) {
            return true;
        }
        com.tencent.mm.ui.base.preference.IconPreference iconPreference = pref instanceof com.tencent.mm.ui.base.preference.IconPreference ? (com.tencent.mm.ui.base.preference.IconPreference) pref : null;
        if (iconPreference != null) {
            l14.b bVar = l14.b.f314994a;
            kotlin.jvm.internal.o.d(str);
            bVar.b(2L, bVar.a(str), 0L, this.f160505g);
            b7(iconPreference);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f160502d = c01.z1.j();
        this.f160503e = c01.z1.n();
        this.f160504f = c01.z1.h();
    }
}
