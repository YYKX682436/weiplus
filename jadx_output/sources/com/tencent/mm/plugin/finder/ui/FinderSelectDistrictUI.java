package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSelectDistrictUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public class FinderSelectDistrictUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f128689m = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f128690d = "Finder.FinderSelectDistrictUI";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f128691e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f128692f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f128693g = "";

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.widget.pref.FinderLocationPreference f128694h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.widget.pref.FinderLocationPreference f128695i;

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494879ai;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.f3b);
        java.lang.String stringExtra = getIntent().getStringExtra("SelectedCountryCode");
        kotlin.jvm.internal.o.d(stringExtra);
        this.f128691e = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("SelectedProvinceCode");
        kotlin.jvm.internal.o.d(stringExtra2);
        this.f128692f = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("SelectedCityCode");
        kotlin.jvm.internal.o.d(stringExtra3);
        this.f128693g = stringExtra3;
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("select_current_district");
        kotlin.jvm.internal.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.widget.pref.FinderLocationPreference");
        com.tencent.mm.plugin.finder.widget.pref.FinderLocationPreference finderLocationPreference = (com.tencent.mm.plugin.finder.widget.pref.FinderLocationPreference) h17;
        this.f128694h = finderLocationPreference;
        finderLocationPreference.N = false;
        finderLocationPreference.M = true;
        java.lang.String str = this.f128691e;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        finderLocationPreference.P = str;
        com.tencent.mm.plugin.finder.widget.pref.FinderLocationPreference finderLocationPreference2 = this.f128694h;
        if (finderLocationPreference2 == null) {
            kotlin.jvm.internal.o.o("currentDistrictPref");
            throw null;
        }
        java.lang.String str2 = this.f128692f;
        kotlin.jvm.internal.o.g(str2, "<set-?>");
        finderLocationPreference2.Q = str2;
        com.tencent.mm.plugin.finder.widget.pref.FinderLocationPreference finderLocationPreference3 = this.f128694h;
        if (finderLocationPreference3 == null) {
            kotlin.jvm.internal.o.o("currentDistrictPref");
            throw null;
        }
        java.lang.String str3 = this.f128693g;
        kotlin.jvm.internal.o.g(str3, "<set-?>");
        finderLocationPreference3.R = str3;
        com.tencent.mm.plugin.finder.widget.pref.FinderLocationPreference finderLocationPreference4 = this.f128694h;
        if (finderLocationPreference4 == null) {
            kotlin.jvm.internal.o.o("currentDistrictPref");
            throw null;
        }
        finderLocationPreference4.M();
        com.tencent.mm.ui.base.preference.Preference h18 = ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("select_current_location");
        kotlin.jvm.internal.o.e(h18, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.widget.pref.FinderLocationPreference");
        this.f128695i = (com.tencent.mm.plugin.finder.widget.pref.FinderLocationPreference) h18;
        r45.ae3 ae3Var = ((ey2.k0) pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class)).f257411e;
        if (ae3Var != null) {
            com.tencent.mm.plugin.finder.widget.pref.FinderLocationPreference finderLocationPreference5 = this.f128695i;
            if (finderLocationPreference5 == null) {
                kotlin.jvm.internal.o.o("currentLocationPref");
                throw null;
            }
            finderLocationPreference5.N = true;
            java.lang.String Country = ae3Var.f369966d;
            kotlin.jvm.internal.o.f(Country, "Country");
            finderLocationPreference5.P = Country;
            com.tencent.mm.plugin.finder.widget.pref.FinderLocationPreference finderLocationPreference6 = this.f128695i;
            if (finderLocationPreference6 == null) {
                kotlin.jvm.internal.o.o("currentLocationPref");
                throw null;
            }
            java.lang.String Province = ae3Var.f369967e;
            kotlin.jvm.internal.o.f(Province, "Province");
            finderLocationPreference6.Q = Province;
            com.tencent.mm.plugin.finder.widget.pref.FinderLocationPreference finderLocationPreference7 = this.f128695i;
            if (finderLocationPreference7 == null) {
                kotlin.jvm.internal.o.o("currentLocationPref");
                throw null;
            }
            java.lang.String City = ae3Var.f369968f;
            kotlin.jvm.internal.o.f(City, "City");
            finderLocationPreference7.R = City;
            com.tencent.mm.plugin.finder.widget.pref.FinderLocationPreference finderLocationPreference8 = this.f128695i;
            if (finderLocationPreference8 == null) {
                kotlin.jvm.internal.o.o("currentLocationPref");
                throw null;
            }
            finderLocationPreference8.M();
        } else {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("select_current_location_title", true);
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("select_current_location", true);
        }
        ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).notifyDataSetChanged();
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.plugin.finder.ui.wf(this), null, com.tencent.mm.ui.fb.GREEN);
        setBackBtn(new com.tencent.mm.plugin.finder.ui.xf(this));
        com.tencent.mars.xlog.Log.i(this.f128690d, "init location " + this.f128691e + ' ' + this.f128692f + ' ' + this.f128693g);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        if (preference != null) {
            java.lang.String str = preference.f197780q;
            if (kotlin.jvm.internal.o.b(str, "select_current_district")) {
                com.tencent.mm.plugin.finder.widget.pref.FinderLocationPreference finderLocationPreference = this.f128694h;
                if (finderLocationPreference == null) {
                    kotlin.jvm.internal.o.o("currentDistrictPref");
                    throw null;
                }
                finderLocationPreference.M = true;
                com.tencent.mm.plugin.finder.widget.pref.FinderLocationPreference finderLocationPreference2 = this.f128695i;
                if (finderLocationPreference2 == null) {
                    kotlin.jvm.internal.o.o("currentLocationPref");
                    throw null;
                }
                finderLocationPreference2.M = false;
                if (finderLocationPreference == null) {
                    kotlin.jvm.internal.o.o("currentDistrictPref");
                    throw null;
                }
                this.f128691e = finderLocationPreference.P;
                if (finderLocationPreference == null) {
                    kotlin.jvm.internal.o.o("currentDistrictPref");
                    throw null;
                }
                this.f128692f = finderLocationPreference.Q;
                if (finderLocationPreference == null) {
                    kotlin.jvm.internal.o.o("currentDistrictPref");
                    throw null;
                }
                this.f128693g = finderLocationPreference.R;
            } else if (kotlin.jvm.internal.o.b(str, "select_current_location")) {
                com.tencent.mm.plugin.finder.widget.pref.FinderLocationPreference finderLocationPreference3 = this.f128694h;
                if (finderLocationPreference3 == null) {
                    kotlin.jvm.internal.o.o("currentDistrictPref");
                    throw null;
                }
                finderLocationPreference3.M = false;
                com.tencent.mm.plugin.finder.widget.pref.FinderLocationPreference finderLocationPreference4 = this.f128695i;
                if (finderLocationPreference4 == null) {
                    kotlin.jvm.internal.o.o("currentLocationPref");
                    throw null;
                }
                finderLocationPreference4.M = true;
                if (finderLocationPreference4 == null) {
                    kotlin.jvm.internal.o.o("currentLocationPref");
                    throw null;
                }
                this.f128691e = finderLocationPreference4.P;
                if (finderLocationPreference4 == null) {
                    kotlin.jvm.internal.o.o("currentLocationPref");
                    throw null;
                }
                this.f128692f = finderLocationPreference4.Q;
                if (finderLocationPreference4 == null) {
                    kotlin.jvm.internal.o.o("currentLocationPref");
                    throw null;
                }
                this.f128693g = finderLocationPreference4.R;
            }
            if (rVar != null) {
                ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
            }
        }
        return true;
    }
}
