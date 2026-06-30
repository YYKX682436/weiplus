package com.tencent.xweb.debug;

/* loaded from: classes13.dex */
public class FragmentPlugin extends androidx.preference.PreferenceFragmentCompat implements androidx.preference.o {

    /* renamed from: p, reason: collision with root package name */
    public final qx5.l f220251p;

    /* renamed from: q, reason: collision with root package name */
    public final qx5.f f220252q = new qx5.f();

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f220253r = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f220254s = com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_OFFICE;

    public FragmentPlugin(qx5.l lVar) {
        this.f220251p = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.preference.PreferenceFragmentCompat, androidx.preference.b0
    public boolean H(androidx.preference.Preference preference) {
        java.lang.String str = preference.f11758r;
        by5.c4.f("FragmentPlugin", "onPreferenceTreeClick, key:" + str);
        boolean z17 = preference instanceof com.tencent.xweb.debug.XWebDebugPreference;
        qx5.l lVar = this.f220251p;
        if (z17 || (preference instanceof com.tencent.xweb.debug.XWebDebugSwitchPreference)) {
            qx5.m mVar = (qx5.m) preference;
            qx5.a b17 = mVar.b(lVar);
            by5.c4.f("FragmentPlugin", "onPreferenceTreeClick, debugKey:" + mVar.h() + ", commandResult:" + b17);
            if (lVar != null) {
                lVar.e(getContext(), b17);
            }
            return true;
        }
        boolean equals = "switch_plugin_config_url".equals(str);
        qx5.f fVar = this.f220252q;
        if (equals) {
            android.content.Context context = getContext();
            if (android.text.TextUtils.isEmpty(by5.e4.e())) {
                if (by5.e4.h("https://dldir1v6.qq.com/weixin/android/wxweb/plugin/pluginUpdateConfig_test.xml")) {
                    by5.c4.f("FragmentPlugin", "switchPluginConfigUrl, set default test url success");
                    preference.H("当前使用默认测试版");
                }
                r3 = false;
            } else {
                if (by5.e4.h("")) {
                    by5.c4.f("FragmentPlugin", "switchPluginConfigUrl, clear test url success");
                    preference.H("当前使用正式版");
                }
                r3 = false;
            }
            fVar.a(context, lVar, r3);
            return r3;
        }
        if ("use_office_reader_force_yes".equals(str)) {
            if (android.text.TextUtils.isEmpty(this.f220253r)) {
                fVar.a(getContext(), lVar, false);
                return false;
            }
            android.content.Context context2 = getContext();
            boolean c17 = qx5.u.c(this.f220253r, com.tencent.xweb.m.yes);
            fVar.a(context2, lVar, c17);
            return c17;
        }
        if ("use_office_reader_force_no".equals(str)) {
            if (android.text.TextUtils.isEmpty(this.f220253r)) {
                fVar.a(getContext(), lVar, false);
                return false;
            }
            android.content.Context context3 = getContext();
            boolean c18 = qx5.u.c(this.f220253r, com.tencent.xweb.m.no);
            fVar.a(context3, lVar, c18);
            return c18;
        }
        if ("use_office_reader_force_none".equals(str)) {
            if (android.text.TextUtils.isEmpty(this.f220253r)) {
                fVar.a(getContext(), lVar, false);
                return false;
            }
            android.content.Context context4 = getContext();
            boolean c19 = qx5.u.c(this.f220253r, com.tencent.xweb.m.none);
            fVar.a(context4, lVar, c19);
            return c19;
        }
        if ("update_plugin".equals(str)) {
            if (android.text.TextUtils.isEmpty(this.f220254s)) {
                fVar.a(getContext(), lVar, false);
                return false;
            }
            android.content.Context context5 = getContext();
            boolean b18 = qx5.u.b(getContext(), this.f220254s, "1", lVar != null);
            fVar.a(context5, lVar, b18);
            return b18;
        }
        if ("clear_plugin".equals(str)) {
            if (android.text.TextUtils.isEmpty(this.f220254s)) {
                fVar.a(getContext(), lVar, false);
                return false;
            }
            android.content.Context context6 = getContext();
            cy5.h d17 = cy5.m.d(this.f220254s);
            if (d17 != null) {
                int f17 = d17.f(true);
                if (f17 >= 0) {
                    java.lang.String o17 = d17.o(f17);
                    d17.u(-1, true);
                    if (o17 != null && !o17.isEmpty()) {
                        r3 = by5.u.h(o17);
                    }
                }
                fVar.a(context6, lVar, r3);
                return r3;
            }
            r3 = false;
            fVar.a(context6, lVar, r3);
            return r3;
        }
        if ("install_plugin_32".equals(str)) {
            if (android.text.TextUtils.isEmpty(this.f220254s)) {
                fVar.a(getContext(), lVar, false);
                return false;
            }
            android.content.Context context7 = getContext();
            boolean f18 = qx5.u.f(getContext(), this.f220254s, false, false, null);
            fVar.a(context7, lVar, f18);
            return f18;
        }
        if (!"install_plugin_64".equals(str)) {
            if ("show_file_reader_info".equals(str)) {
                new android.app.AlertDialog.Builder(getContext()).setTitle("File Reader Type").setMessage(qx5.u.e()).setPositiveButton("复制到剪贴板", new qx5.i(this)).setNegativeButton("取消", (android.content.DialogInterface.OnClickListener) null).show();
            }
            if (preference.f11760t != null) {
                getActivity();
            }
            return false;
        }
        if (android.text.TextUtils.isEmpty(this.f220254s)) {
            fVar.a(getContext(), lVar, false);
            return false;
        }
        android.content.Context context8 = getContext();
        boolean f19 = qx5.u.f(getContext(), this.f220254s, false, true, null);
        fVar.a(context8, lVar, f19);
        return f19;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.preference.o
    public boolean h0(androidx.preference.Preference preference, java.lang.Object obj) {
        java.lang.String str = preference.f11758r;
        by5.c4.f("FragmentPlugin", "onPreferenceChange, key:" + str + ", newValue:" + obj);
        if (!(preference instanceof com.tencent.xweb.debug.XWebDebugEditTextPreference) && !(preference instanceof com.tencent.xweb.debug.XWebDebugListPreference)) {
            if ("office_reader_format".equals(str)) {
                java.lang.String valueOf = java.lang.String.valueOf(obj);
                this.f220253r = valueOf;
                preference.H(valueOf);
                return false;
            }
            if (!"plugin_name".equals(str)) {
                return false;
            }
            java.lang.String valueOf2 = java.lang.String.valueOf(obj);
            this.f220254s = valueOf2;
            preference.H(valueOf2);
            return false;
        }
        qx5.m mVar = (qx5.m) preference;
        qx5.l lVar = this.f220251p;
        qx5.a a17 = mVar.a(lVar, obj);
        by5.c4.f("FragmentPlugin", "onPreferenceChange, debugKey:" + mVar.h() + ", commandResult:" + a17);
        if (lVar != null) {
            lVar.e(getContext(), a17);
        }
        n0();
        return true;
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public void l0(android.os.Bundle bundle, java.lang.String str) {
        android.content.SharedPreferences sharedPreferences;
        m0(com.tencent.xwebsdk.R.xml.fragment_plugin_preferences, str);
        androidx.preference.PreferenceScreen preferenceScreen = this.f11775d.f11800g;
        this.f220252q.b(preferenceScreen, this);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreatePreferences, SharedPreferences:");
        if (preferenceScreen.f11748e != null) {
            preferenceScreen.k();
            sharedPreferences = preferenceScreen.f11748e.b();
        } else {
            sharedPreferences = null;
        }
        sb6.append(sharedPreferences);
        by5.c4.g("FragmentPlugin", sb6.toString());
        preferenceScreen.k();
        by5.c4.g("FragmentPlugin", "onCreatePreferences, PreferenceDataStore:null");
        n0();
    }

    public final void n0() {
        androidx.preference.SwitchPreferenceCompat switchPreferenceCompat = (androidx.preference.SwitchPreferenceCompat) j0("disable_file_reader_cache");
        if (switchPreferenceCompat != null) {
            com.tencent.xweb.u0 u0Var = com.tencent.xweb.t0.f220594a;
            android.content.SharedPreferences e17 = by5.d4.e();
            switchPreferenceCompat.M(e17 == null ? false : e17.getBoolean("fr_disable_cache", false));
        }
        androidx.preference.SwitchPreferenceCompat switchPreferenceCompat2 = (androidx.preference.SwitchPreferenceCompat) j0("disable_file_reader_crash_detect");
        if (switchPreferenceCompat2 != null) {
            com.tencent.xweb.u0 u0Var2 = com.tencent.xweb.t0.f220594a;
            android.content.SharedPreferences e18 = by5.d4.e();
            switchPreferenceCompat2.M(e18 != null ? e18.getBoolean("fr_disable_crash_detect", false) : false);
        }
        androidx.preference.Preference j07 = j0("switch_plugin_config_url");
        if (j07 != null) {
            java.lang.String e19 = by5.e4.e();
            if (android.text.TextUtils.isEmpty(e19)) {
                j07.H("当前使用正式版");
            } else if (e19.equalsIgnoreCase("https://dldir1v6.qq.com/weixin/android/wxweb/plugin/pluginUpdateConfig_test.xml")) {
                j07.H("当前使用默认测试版");
            } else {
                j07.H("当前使用自定义测试版");
            }
        }
        androidx.preference.Preference j08 = j0("set_plugin_config_url");
        if (j08 != null) {
            java.lang.String e27 = by5.e4.e();
            if (android.text.TextUtils.isEmpty(e27)) {
                j08.H("");
            } else {
                j08.H(e27);
            }
        }
    }
}
