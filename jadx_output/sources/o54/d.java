package o54;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public int f343123a;

    /* renamed from: b, reason: collision with root package name */
    public int f343124b;

    /* renamed from: c, reason: collision with root package name */
    public int f343125c;

    /* renamed from: d, reason: collision with root package name */
    public int f343126d;

    /* renamed from: e, reason: collision with root package name */
    public int f343127e;

    /* renamed from: f, reason: collision with root package name */
    public int f343128f;

    /* renamed from: g, reason: collision with root package name */
    public int f343129g;

    /* renamed from: h, reason: collision with root package name */
    public int f343130h;

    /* renamed from: i, reason: collision with root package name */
    public int f343131i;

    /* renamed from: j, reason: collision with root package name */
    public int f343132j;

    /* renamed from: k, reason: collision with root package name */
    public int f343133k;

    /* renamed from: l, reason: collision with root package name */
    public int f343134l;

    public o54.d a(java.util.List list, java.lang.String str) {
        int i17;
        int i18;
        int i19;
        int i27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("build", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$ComponentStaticBuilder");
        if (list == null || list.size() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("build", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$ComponentStaticBuilder");
            return this;
        }
        this.f343127e = list.size();
        try {
            java.util.Iterator it = list.iterator();
            boolean z17 = false;
            while (it.hasNext()) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) it.next();
                if (a2Var != null) {
                    int m17 = a2Var.m();
                    if (a2Var.p() != null) {
                        i18 = a2Var.p().D;
                        i17 = a2Var.p().E;
                    } else {
                        i17 = -1;
                        i18 = 0;
                    }
                    int i28 = 1;
                    if (i17 == 0) {
                        this.f343133k++;
                    }
                    if (!za4.z0.s(m17)) {
                        this.f343128f++;
                        if (i17 == 0) {
                            this.f343134l++;
                        }
                    }
                    boolean z18 = z17;
                    if (m17 == 41 || m17 == 44 || m17 == 45) {
                        this.f343123a++;
                        if (i17 == 0) {
                            this.f343129g++;
                        }
                        if (i18 > 0) {
                            int i29 = o54.g.f343148a;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImageFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                            if (i18 < 20480) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                            } else if (i18 < 51200) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i28 = 2;
                            } else if (i18 < 102400) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i28 = 3;
                            } else if (i18 < 204800) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i28 = 4;
                            } else if (i18 < 512000) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i28 = 5;
                            } else if (i18 < 1048576) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i28 = 6;
                            } else {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i28 = 7;
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                            o54.g.a(1675L, i28);
                        } else {
                            o54.g.a(1675L, 19L);
                            z17 = true;
                        }
                    } else if (m17 == 61) {
                        this.f343124b++;
                        if (i17 == 0) {
                            this.f343130h++;
                        }
                        if (i18 > 0) {
                            int i37 = o54.g.f343148a;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSightVideoFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                            if (i18 < 1048576) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSightVideoFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i27 = 8;
                            } else if (i18 < 2097152) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSightVideoFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i27 = 9;
                            } else if (i18 < 3145728) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSightVideoFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i27 = 10;
                            } else if (i18 < 4194304) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSightVideoFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i27 = 11;
                            } else if (i18 < 5242880) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSightVideoFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i27 = 12;
                            } else if (i18 < 10485760) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSightVideoFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i27 = 13;
                            } else {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSightVideoFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i27 = 14;
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                            o54.g.a(1675L, i27);
                        } else {
                            o54.g.a(1675L, 20L);
                        }
                    } else if (m17 == 62) {
                        this.f343125c++;
                        if (i17 == 0) {
                            this.f343131i++;
                        }
                        if (i18 > 0) {
                            int i38 = o54.g.f343148a;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStreamVideoFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                            if (i18 < 3145728) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStreamVideoFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i19 = 15;
                            } else if (i18 < 5242880) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStreamVideoFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i19 = 16;
                            } else if (i18 < 10485760) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStreamVideoFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i19 = 17;
                            } else {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStreamVideoFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i19 = 18;
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                            o54.g.a(1675L, i19);
                        } else {
                            o54.g.a(1675L, 21L);
                        }
                    } else if (m17 == 142) {
                        this.f343126d++;
                        if (i17 == 0) {
                            this.f343132j++;
                        }
                    }
                    z17 = z18;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportComponentListAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter");
            ((ku5.t0) ku5.t0.f312615d).q(new m44.b(list));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportComponentListAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPageStaticHelper.ComponentStaticBuilder", "build exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("build", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$ComponentStaticBuilder");
        return this;
    }
}
