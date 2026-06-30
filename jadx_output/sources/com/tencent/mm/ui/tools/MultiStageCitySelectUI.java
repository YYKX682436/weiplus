package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class MultiStageCitySelectUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0 {
    public static java.util.List F;
    public java.lang.String B;
    public java.util.ArrayList C;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f210093d;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.storage.RegionCodeDecoder$Region[] f210102p;

    /* renamed from: v, reason: collision with root package name */
    public boolean f210108v;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.ui.tools.ZoneRecommandPreference f210110x;

    /* renamed from: y, reason: collision with root package name */
    public i11.e f210111y;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f210094e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f210095f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f210096g = null;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f210097h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f210098i = null;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f210099m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f210100n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f210101o = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f210103q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f210104r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f210105s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f210106t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f210107u = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f210109w = true;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.ui.tools.c9 f210112z = new com.tencent.mm.ui.tools.c9(true, true);
    public final com.tencent.mm.sdk.platformtools.n3 A = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    public final i11.c D = new com.tencent.mm.ui.tools.e7(this);
    public final java.lang.Runnable E = new com.tencent.mm.ui.tools.i7(this);

    public void V6() {
        com.tencent.mm.storage.RegionCodeDecoder$Region[] n17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        if (this.f210101o == 3) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mm.storage.RegionCodeDecoder$Region[] g17 = com.tencent.mm.storage.ha.k().g();
            if (g17 != null) {
                for (com.tencent.mm.storage.RegionCodeDecoder$Region regionCodeDecoder$Region : g17) {
                    if ("HK".equalsIgnoreCase(regionCodeDecoder$Region.getCode()) || "TW".equalsIgnoreCase(regionCodeDecoder$Region.getCode()) || "MO".equalsIgnoreCase(regionCodeDecoder$Region.getCode())) {
                        arrayList.add(regionCodeDecoder$Region);
                    }
                }
            }
            com.tencent.mm.storage.RegionCodeDecoder$Region[] n18 = com.tencent.mm.storage.ha.k().n("CN");
            int length = n18.length;
            n17 = (com.tencent.mm.storage.RegionCodeDecoder$Region[]) java.util.Arrays.copyOf(n18, arrayList.size() + length);
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                n17[length + i17] = (com.tencent.mm.storage.RegionCodeDecoder$Region) it.next();
                i17++;
            }
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f210094e)) {
            com.tencent.mm.storage.RegionCodeDecoder$Region[] g18 = com.tencent.mm.storage.ha.k().g();
            if (this.f210106t) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                if (g18 != null) {
                    for (com.tencent.mm.storage.RegionCodeDecoder$Region regionCodeDecoder$Region2 : g18) {
                        if (!this.C.contains(regionCodeDecoder$Region2.getCode()) && !"CN".equalsIgnoreCase(regionCodeDecoder$Region2.getCode()) && !"HK".equalsIgnoreCase(regionCodeDecoder$Region2.getCode()) && !"TW".equalsIgnoreCase(regionCodeDecoder$Region2.getCode()) && !"MO".equalsIgnoreCase(regionCodeDecoder$Region2.getCode())) {
                            arrayList2.add(regionCodeDecoder$Region2);
                        }
                    }
                }
                n17 = new com.tencent.mm.storage.RegionCodeDecoder$Region[arrayList2.size()];
                arrayList2.toArray(n17);
            } else {
                if (g18 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    for (com.tencent.mm.storage.RegionCodeDecoder$Region regionCodeDecoder$Region3 : g18) {
                        if (!this.C.contains(regionCodeDecoder$Region3.getCode())) {
                            arrayList3.add(regionCodeDecoder$Region3);
                        }
                    }
                    g18 = new com.tencent.mm.storage.RegionCodeDecoder$Region[arrayList3.size()];
                    arrayList3.toArray(g18);
                }
                n17 = g18;
            }
        } else {
            n17 = com.tencent.mm.sdk.platformtools.t8.K0(this.f210095f) ? com.tencent.mm.storage.ha.k().n(this.f210094e) : com.tencent.mm.storage.ha.k().e(this.f210094e, this.f210095f);
        }
        this.f210102p = n17;
        if (n17 == null || n17.length <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiStageCitySelectUI", "initZoneItems error ,check zone lists!");
            return;
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f210093d).t();
        if (getIntent().getBooleanExtra("SetSelectLocation", false)) {
            str = getIntent().getStringExtra("SelectedCountryCode");
            str2 = getIntent().getStringExtra("SelectedProvinceCode");
            str3 = getIntent().getStringExtra("SelectedCityCode");
        } else {
            str = (java.lang.String) c01.d9.b().p().l(12324, null);
            str2 = (java.lang.String) c01.d9.b().p().l(12325, null);
            str3 = (java.lang.String) c01.d9.b().p().l(12326, null);
        }
        this.f210105s = getIntent().getBooleanExtra("ShowSelectedLocation", true);
        if (getIntent().getBooleanExtra("NeedUnshowItem", false)) {
            com.tencent.mm.ui.tools.ZonePreference zonePreference = new com.tencent.mm.ui.tools.ZonePreference(this, null);
            com.tencent.mm.storage.RegionCodeDecoder$Region regionCodeDecoder$Region4 = new com.tencent.mm.storage.RegionCodeDecoder$Region();
            regionCodeDecoder$Region4.setName(getString(com.tencent.mm.R.string.f4f));
            regionCodeDecoder$Region4.setHasChildren(false);
            regionCodeDecoder$Region4.setCountry(false);
            regionCodeDecoder$Region4.setCode("unshow");
            zonePreference.N(regionCodeDecoder$Region4);
            ((com.tencent.mm.ui.base.preference.h0) this.f210093d).d(zonePreference, -1);
            if ("unshow".equals(str)) {
                zonePreference.G(com.tencent.mm.R.string.iop);
            }
        }
        int i18 = 0;
        while (true) {
            com.tencent.mm.storage.RegionCodeDecoder$Region[] regionCodeDecoder$RegionArr = this.f210102p;
            if (i18 >= regionCodeDecoder$RegionArr.length) {
                break;
            }
            com.tencent.mm.storage.RegionCodeDecoder$Region regionCodeDecoder$Region5 = regionCodeDecoder$RegionArr[i18];
            if (regionCodeDecoder$Region5 != null && !com.tencent.mm.sdk.platformtools.t8.K0(regionCodeDecoder$Region5.getCode()) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f210102p[i18].getName())) {
                com.tencent.mm.ui.tools.ZonePreference zonePreference2 = new com.tencent.mm.ui.tools.ZonePreference(this, null);
                zonePreference2.N(this.f210102p[i18]);
                if (!this.f210105s) {
                    ((com.tencent.mm.ui.base.preference.h0) this.f210093d).d(zonePreference2, -1);
                } else if (this.f210101o == 0 && this.f210102p[i18].getCode().equalsIgnoreCase(str)) {
                    ((com.tencent.mm.ui.base.preference.h0) this.f210093d).d(zonePreference2, 0);
                    zonePreference2.G(com.tencent.mm.R.string.ioq);
                } else if (this.f210101o == 1 && this.f210102p[i18].getCode().equalsIgnoreCase(str2)) {
                    ((com.tencent.mm.ui.base.preference.h0) this.f210093d).d(zonePreference2, 0);
                    zonePreference2.G(com.tencent.mm.R.string.ioq);
                } else if (this.f210101o == 2 && this.f210102p[i18].getCode().equalsIgnoreCase(str3)) {
                    ((com.tencent.mm.ui.base.preference.h0) this.f210093d).d(zonePreference2, 0);
                    zonePreference2.G(com.tencent.mm.R.string.ioq);
                } else {
                    ((com.tencent.mm.ui.base.preference.h0) this.f210093d).d(zonePreference2, -1);
                }
            }
            i18++;
        }
        if (this.f210101o == 3) {
            com.tencent.mm.ui.tools.ZoneSelectOtherCountryPreference zoneSelectOtherCountryPreference = new com.tencent.mm.ui.tools.ZoneSelectOtherCountryPreference(this, null);
            zoneSelectOtherCountryPreference.L = getString(com.tencent.mm.R.string.iol);
            zoneSelectOtherCountryPreference.M = new com.tencent.mm.ui.tools.f7(this);
            ((com.tencent.mm.ui.base.preference.h0) this.f210093d).d(zoneSelectOtherCountryPreference, -1);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f210093d).d(new com.tencent.mm.ui.base.preference.PreferenceCategory(getContext()), -1);
        int i19 = this.f210101o;
        if (i19 == 0 || i19 == 3) {
            if (this.f210104r) {
                com.tencent.mm.ui.base.preference.PreferenceTitleCategory preferenceTitleCategory = new com.tencent.mm.ui.base.preference.PreferenceTitleCategory(this, null);
                preferenceTitleCategory.J(com.tencent.mm.R.string.ioj);
                ((com.tencent.mm.ui.base.preference.h0) this.f210093d).d(preferenceTitleCategory, 0);
                com.tencent.mm.ui.tools.ZoneRecommandPreference zoneRecommandPreference = new com.tencent.mm.ui.tools.ZoneRecommandPreference(this, null);
                this.f210110x = zoneRecommandPreference;
                zoneRecommandPreference.C("current_location");
                ((com.tencent.mm.ui.base.preference.h0) this.f210093d).d(this.f210110x, 1);
            }
            com.tencent.mm.ui.base.preference.PreferenceTitleCategory preferenceTitleCategory2 = new com.tencent.mm.ui.base.preference.PreferenceTitleCategory(this, null);
            preferenceTitleCategory2.J(com.tencent.mm.R.string.ioi);
            if (this.f210104r) {
                ((com.tencent.mm.ui.base.preference.h0) this.f210093d).d(preferenceTitleCategory2, 2);
            } else {
                ((com.tencent.mm.ui.base.preference.h0) this.f210093d).d(preferenceTitleCategory2, 0);
            }
        }
    }

    public final void W6() {
        c01.fb a17 = c01.fb.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiStageCitySelectUI", "oplog: " + a17);
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(1, c01.fb.e(a17)));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.layout.da8;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.h5u);
        setBackBtn(new com.tencent.mm.ui.tools.j7(this));
        this.f210103q = getIntent().getBooleanExtra("GetAddress", false);
        this.f210094e = getIntent().getStringExtra("Country");
        this.f210095f = getIntent().getStringExtra("Provice");
        this.f210097h = getIntent().getStringExtra("CountryName");
        this.f210098i = getIntent().getStringExtra("ProviceName");
        this.f210104r = getIntent().getBooleanExtra("IsAutoPosition", !com.tencent.mm.sdk.platformtools.t8.P0(this));
        this.f210100n = getIntent().getBooleanExtra("IsRealNameVerifyScene", false);
        this.f210106t = getIntent().getBooleanExtra("IsSelectNonChinaCountry", false);
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("BlockedCountries");
        this.C = stringArrayListExtra;
        if (stringArrayListExtra == null) {
            this.C = new java.util.ArrayList();
        }
        this.f210107u = getIntent().getBooleanExtra("IsNeedShowSearchBar", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiStageCitySelectUI", " country = " + this.f210094e + " province =" + this.f210095f + " city = " + this.f210096g + " " + this.f210097h + " " + this.f210098i + " " + this.f210100n + " " + this.f210106t);
        if (this.f210100n) {
            this.f210101o = 3;
        } else if (this.f210094e == null) {
            this.f210101o = 0;
            this.f210095f = null;
            this.f210096g = null;
        } else if (this.f210095f == null) {
            this.f210101o = 1;
            this.f210096g = null;
        } else {
            this.f210101o = 2;
        }
        V6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == -1) {
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i17 = this.f210101o;
        if (i17 == 0) {
            this.f210094e = null;
        } else if (i17 == 1) {
            this.f210095f = null;
        } else if (i17 == 2) {
            this.f210096g = null;
        }
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onBusinessPermissionDenied(java.lang.String str) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x017c, code lost:
    
        if (r11 == null) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0186  */
    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.MultiStageCitySelectUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(665, this);
        i11.e eVar = this.f210111y;
        if (eVar != null) {
            ((i11.h) eVar).m(this.D);
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        if (!(preference instanceof com.tencent.mm.ui.tools.ZonePreference)) {
            if (!preference.f197780q.equals("current_location")) {
                return false;
            }
            com.tencent.mm.ui.tools.ZoneRecommandPreference zoneRecommandPreference = this.f210110x;
            if (!(zoneRecommandPreference.P == 1)) {
                return false;
            }
            com.tencent.mm.storage.RegionCodeDecoder$Region[] regionCodeDecoder$RegionArr = {zoneRecommandPreference.L, zoneRecommandPreference.M, zoneRecommandPreference.N};
            if (!this.f210103q) {
                com.tencent.mm.storage.n3 p17 = c01.d9.b().p();
                com.tencent.mm.storage.RegionCodeDecoder$Region regionCodeDecoder$Region = regionCodeDecoder$RegionArr[0];
                p17.w(12324, regionCodeDecoder$Region == null ? null : regionCodeDecoder$Region.getCode());
                com.tencent.mm.storage.n3 p18 = c01.d9.b().p();
                com.tencent.mm.storage.RegionCodeDecoder$Region regionCodeDecoder$Region2 = regionCodeDecoder$RegionArr[1];
                p18.w(12325, regionCodeDecoder$Region2 == null ? null : regionCodeDecoder$Region2.getCode());
                com.tencent.mm.storage.n3 p19 = c01.d9.b().p();
                com.tencent.mm.storage.RegionCodeDecoder$Region regionCodeDecoder$Region3 = regionCodeDecoder$RegionArr[2];
                p19.w(12326, regionCodeDecoder$Region3 == null ? null : regionCodeDecoder$Region3.getCode());
                com.tencent.mm.plugin.report.service.b1.f(4, 5);
                W6();
            }
            com.tencent.mm.storage.RegionCodeDecoder$Region regionCodeDecoder$Region4 = regionCodeDecoder$RegionArr[0];
            java.lang.String code = regionCodeDecoder$Region4 == null ? null : regionCodeDecoder$Region4.getCode();
            com.tencent.mm.storage.RegionCodeDecoder$Region regionCodeDecoder$Region5 = regionCodeDecoder$RegionArr[0];
            java.lang.String name = regionCodeDecoder$Region5 == null ? null : regionCodeDecoder$Region5.getName();
            com.tencent.mm.storage.RegionCodeDecoder$Region regionCodeDecoder$Region6 = regionCodeDecoder$RegionArr[1];
            java.lang.String code2 = regionCodeDecoder$Region6 == null ? null : regionCodeDecoder$Region6.getCode();
            com.tencent.mm.storage.RegionCodeDecoder$Region regionCodeDecoder$Region7 = regionCodeDecoder$RegionArr[1];
            java.lang.String name2 = regionCodeDecoder$Region7 == null ? null : regionCodeDecoder$Region7.getName();
            if ("CN".equalsIgnoreCase(code) || "HK".equalsIgnoreCase(code) || "MO".equalsIgnoreCase(code) || "TW".equalsIgnoreCase(code)) {
                name = null;
            } else {
                name2 = null;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("CountryName", name);
            intent.putExtra("ProviceName", name2);
            com.tencent.mm.storage.RegionCodeDecoder$Region regionCodeDecoder$Region8 = regionCodeDecoder$RegionArr[2];
            intent.putExtra("CityName", regionCodeDecoder$Region8 == null ? null : regionCodeDecoder$Region8.getName());
            intent.putExtra("Country", code);
            intent.putExtra("Contact_Province", code2);
            com.tencent.mm.storage.RegionCodeDecoder$Region regionCodeDecoder$Region9 = regionCodeDecoder$RegionArr[2];
            intent.putExtra("Contact_City", regionCodeDecoder$Region9 == null ? null : regionCodeDecoder$Region9.getCode());
            hideVKB();
            setResult(-1, intent);
            finish();
            return false;
        }
        com.tencent.mm.storage.RegionCodeDecoder$Region regionCodeDecoder$Region10 = ((com.tencent.mm.ui.tools.ZonePreference) preference).L;
        if (regionCodeDecoder$Region10 == null || com.tencent.mm.sdk.platformtools.t8.K0(regionCodeDecoder$Region10.getCode())) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPreferenceTreeClick error item, code:");
            sb6.append(regionCodeDecoder$Region10 == null ? -1 : regionCodeDecoder$Region10.getCode());
            sb6.append(" ,name:");
            sb6.append(regionCodeDecoder$Region10 == null ? "null" : regionCodeDecoder$Region10.getName());
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiStageCitySelectUI", sb6.toString());
            return false;
        }
        if (this.f210101o == 3) {
            this.f210094e = "CN";
            this.f210095f = regionCodeDecoder$Region10.getCode();
            this.f210098i = regionCodeDecoder$Region10.getName();
        }
        int i17 = this.f210101o;
        if (i17 == 0) {
            this.f210094e = regionCodeDecoder$Region10.getCode();
            this.f210097h = regionCodeDecoder$Region10.getName();
        } else if (i17 == 1) {
            this.f210095f = regionCodeDecoder$Region10.getCode();
            this.f210098i = regionCodeDecoder$Region10.getName();
        } else if (i17 == 2) {
            this.f210096g = regionCodeDecoder$Region10.getCode();
            this.f210099m = regionCodeDecoder$Region10.getName();
            if ("CN".equalsIgnoreCase(this.f210094e) || "HK".equalsIgnoreCase(this.f210094e) || "MO".equalsIgnoreCase(this.f210094e) || "TW".equalsIgnoreCase(this.f210094e)) {
                this.f210097h = null;
            } else {
                this.f210098i = null;
            }
        } else if (i17 == 4) {
            if (regionCodeDecoder$Region10.getParent() != null && !regionCodeDecoder$Region10.hasChildren()) {
                this.f210096g = regionCodeDecoder$Region10.getCode();
                this.f210099m = regionCodeDecoder$Region10.getName();
                this.f210095f = regionCodeDecoder$Region10.getParent().getCode();
                this.f210098i = regionCodeDecoder$Region10.getParent().getName();
                this.f210094e = regionCodeDecoder$Region10.getCountryCode();
                this.f210097h = null;
            } else if (!regionCodeDecoder$Region10.hasChildren() || regionCodeDecoder$Region10.getParent() == null) {
                this.f210094e = regionCodeDecoder$Region10.getCode();
                this.f210097h = regionCodeDecoder$Region10.getName();
                this.f210095f = null;
                this.f210098i = null;
                this.f210096g = null;
                this.f210099m = null;
            } else {
                this.f210095f = regionCodeDecoder$Region10.getCode();
                this.f210098i = regionCodeDecoder$Region10.getName();
                this.f210094e = regionCodeDecoder$Region10.getCountryCode();
                this.f210097h = null;
            }
        }
        if (regionCodeDecoder$Region10.hasChildren()) {
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.tools.MultiStageCitySelectUI.class);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("Country", this.f210094e);
            bundle.putString("Provice", this.f210095f);
            bundle.putString("CountryName", this.f210097h);
            bundle.putString("ProviceName", this.f210098i);
            bundle.putBoolean("GetAddress", this.f210103q);
            bundle.putBoolean("ShowSelectedLocation", this.f210105s);
            bundle.putString("SelectedCountryCode", getIntent().getStringExtra("SelectedCountryCode"));
            bundle.putString("SelectedProvinceCode", getIntent().getStringExtra("SelectedProvinceCode"));
            bundle.putString("SelectedCityCode", getIntent().getStringExtra("SelectedCityCode"));
            bundle.putBoolean("IsAutoPosition", false);
            if (this.f210100n) {
                java.lang.String countryCode = regionCodeDecoder$Region10.getCountryCode();
                if (com.tencent.mm.sdk.platformtools.t8.K0(countryCode)) {
                    countryCode = this.f210094e;
                }
                if ("CN".equalsIgnoreCase(countryCode) || "HK".equalsIgnoreCase(countryCode) || "MO".equalsIgnoreCase(countryCode) || "TW".equalsIgnoreCase(countryCode)) {
                    bundle.putBoolean("IsNeedShowSearchBar", true);
                }
                java.lang.String code3 = regionCodeDecoder$Region10.getCode();
                if ("HK".equalsIgnoreCase(code3) || "MO".equalsIgnoreCase(code3) || "TW".equalsIgnoreCase(code3)) {
                    bundle.putString("Country", code3);
                    bundle.putString("CountryName", regionCodeDecoder$Region10.getName());
                    bundle.remove("Provice");
                }
            }
            intent2.putExtras(bundle);
            hideVKB();
            startActivityForResult(intent2, 1);
        } else {
            if (!this.f210103q) {
                c01.d9.b().p().w(12324, this.f210094e);
                c01.d9.b().p().w(12325, this.f210095f);
                c01.d9.b().p().w(12326, this.f210096g);
                com.tencent.mm.plugin.report.service.b1.f(4, 5);
                W6();
            }
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("CountryName", this.f210097h);
            intent3.putExtra("ProviceName", this.f210098i);
            intent3.putExtra("CityName", this.f210099m);
            intent3.putExtra("Country", this.f210094e);
            intent3.putExtra("Contact_Province", this.f210095f);
            intent3.putExtra("Contact_City", this.f210096g);
            hideVKB();
            setResult(-1, intent3);
            finish();
        }
        return true;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiStageCitySelectUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiStageCitySelectUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (iArr.length == 0 || i17 != 64 || iArr[0] == 0) {
            return;
        }
        com.tencent.mm.ui.tools.ZoneRecommandPreference zoneRecommandPreference = this.f210110x;
        if (zoneRecommandPreference != null) {
            zoneRecommandPreference.P = 2;
            zoneRecommandPreference.M();
        }
        this.f210109w = false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f210109w && this.f210104r) {
            boolean Di = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 64, null, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiStageCitySelectUI", "settings district,checkPermission checkLocation[%b]", java.lang.Boolean.valueOf(Di));
            if (Di) {
                if (this.f210111y == null) {
                    ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                    this.f210111y = i11.h.e();
                }
                if (this.f210104r) {
                    if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ni(d85.g0.LOCAION, new com.tencent.mm.ui.tools.g7(this))) {
                        return;
                    }
                    ((i11.h) this.f210111y).l(this.D, true, false, false);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r8, int r9, java.lang.String r10, com.tencent.mm.modelbase.m1 r11) {
        /*
            r7 = this;
            r10 = 2
            if (r8 != 0) goto La9
            if (r9 != 0) goto La9
            int r8 = r11.getType()
            r9 = 665(0x299, float:9.32E-43)
            if (r8 != r9) goto Lb2
            va3.y r11 = (va3.y) r11
            java.lang.String r8 = r11.f434386f
            java.lang.String r9 = r11.f434387g
            java.lang.String r11 = r11.f434388h
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r9, r11}
            java.lang.String r1 = "MicroMsg.MultiStageCitySelectUI"
            java.lang.String r2 = "current location country %s, province %s, city %s"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            com.tencent.mm.storage.ha r0 = com.tencent.mm.storage.ha.k()
            com.tencent.mm.storage.RegionCodeDecoder$Region[] r0 = r0.g()
            r1 = 0
            if (r0 == 0) goto L86
            int r2 = r0.length
            r3 = 0
            r4 = r3
        L2e:
            if (r4 >= r2) goto L86
            r5 = r0[r4]
            java.lang.String r6 = r5.getCode()
            boolean r6 = r6.equalsIgnoreCase(r8)
            if (r6 == 0) goto L83
            com.tencent.mm.storage.ha r8 = com.tencent.mm.storage.ha.k()
            java.lang.String r0 = r5.getCode()
            com.tencent.mm.storage.RegionCodeDecoder$Region[] r8 = r8.n(r0)
            int r0 = r8.length
            r2 = r3
        L4a:
            if (r2 >= r0) goto L7f
            r4 = r8[r2]
            java.lang.String r6 = r4.getCode()
            boolean r6 = r6.equalsIgnoreCase(r9)
            if (r6 == 0) goto L7c
            com.tencent.mm.storage.ha r8 = com.tencent.mm.storage.ha.k()
            java.lang.String r9 = r5.getCode()
            java.lang.String r0 = r4.getCode()
            com.tencent.mm.storage.RegionCodeDecoder$Region[] r8 = r8.e(r9, r0)
            int r9 = r8.length
        L69:
            if (r3 >= r9) goto L80
            r0 = r8[r3]
            java.lang.String r2 = r0.getCode()
            boolean r2 = r2.equalsIgnoreCase(r11)
            if (r2 == 0) goto L79
            r1 = r0
            goto L80
        L79:
            int r3 = r3 + 1
            goto L69
        L7c:
            int r2 = r2 + 1
            goto L4a
        L7f:
            r4 = r1
        L80:
            r8 = r1
            r1 = r5
            goto L88
        L83:
            int r4 = r4 + 1
            goto L2e
        L86:
            r8 = r1
            r4 = r8
        L88:
            if (r1 != 0) goto L98
            if (r4 != 0) goto L98
            if (r8 != 0) goto L98
            com.tencent.mm.ui.tools.ZoneRecommandPreference r8 = r7.f210110x
            if (r8 == 0) goto La8
            r8.P = r10
            r8.M()
            goto La8
        L98:
            com.tencent.mm.ui.tools.ZoneRecommandPreference r9 = r7.f210110x
            if (r9 == 0) goto La8
            r10 = 1
            r9.P = r10
            r9.L = r1
            r9.M = r4
            r9.N = r8
            r9.M()
        La8:
            return
        La9:
            com.tencent.mm.ui.tools.ZoneRecommandPreference r8 = r7.f210110x
            if (r8 == 0) goto Lb2
            r8.P = r10
            r8.M()
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.MultiStageCitySelectUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
