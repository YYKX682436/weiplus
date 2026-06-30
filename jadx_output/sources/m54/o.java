package m54;

/* loaded from: classes4.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f324296d;

    public o(java.lang.String str) {
        this.f324296d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3 = "run";
        java.lang.String str4 = "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$preload$1";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$preload$1");
        m54.s sVar = m54.s.f324305a;
        java.lang.String str5 = this.f324296d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$preloadInternal", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preloadInternal", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader");
        try {
            com.tencent.mars.xlog.Log.i("SnsAd.VangoghResPreloader", "it is going to preload some res!");
            java.util.List b17 = sVar.b(str5);
            if (!b17.isEmpty()) {
                boolean z17 = ca4.m0.u0(e42.c0.clicfg_vangogh_page_expand_preload_resources_number, 0) == 1;
                int size = b17.size();
                boolean isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a);
                int i17 = z17 ? isWifi ? size : 20 : isWifi ? 20 : 5;
                com.tencent.mars.xlog.Log.i("SnsAd.VangoghResPreloader", "the preload node size is " + size + ", iswifi = " + isWifi + ", max count is " + i17 + ", expandPreloadResourcesNumber is " + z17);
                int i18 = 0;
                while (i18 < size && i18 < i17) {
                    m54.n nVar = (m54.n) b17.get(i18);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append("node type is ");
                    nVar.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                    int i19 = nVar.f324293b;
                    java.util.List list = b17;
                    java.lang.String str6 = nVar.f324292a;
                    sb6.append(i19);
                    sb6.append(", url is ");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                    sb6.append(str6);
                    sb6.append(", md5 is ");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMd5", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMd5", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                    sb6.append(nVar.f324294c);
                    sb6.append(", size is ");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSize", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSize", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                    str = str3;
                    str2 = str4;
                    try {
                        sb6.append(nVar.f324295d);
                        com.tencent.mars.xlog.Log.i("SnsAd.VangoghResPreloader", sb6.toString());
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                        int i27 = nVar.f324293b;
                        if (i27 == 3) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.a(str6);
                        } else {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                            if (i27 == 1) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
                                za4.t0.d("adId", str6, new m54.m(nVar));
                            }
                        }
                        i18++;
                        str3 = str;
                        b17 = list;
                        str4 = str2;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        com.tencent.mars.xlog.Log.i("SnsAd.VangoghResPreloader", "there is an exception: " + th.getMessage());
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadInternal", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$preloadInternal", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
                    }
                }
            }
            str = str3;
            str2 = str4;
        } catch (java.lang.Throwable th7) {
            th = th7;
            str = str3;
            str2 = str4;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadInternal", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$preloadInternal", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }
}
