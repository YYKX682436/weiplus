package t54;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final t54.d f415846a = new t54.d();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f415847b = new com.tencent.mm.sdk.platformtools.r2(10);

    /* renamed from: c, reason: collision with root package name */
    public static final yz5.l f415848c = t54.c.f415845d;

    public static final boolean a(t54.d dVar, java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
        dVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
        boolean z17 = false;
        z17 = false;
        z17 = false;
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
        } else {
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "adCanvasInfo", null);
            if (d17 == null || d17.isEmpty()) {
                com.tencent.mars.xlog.Log.w("PreloadSnsAdHelper", "invalid landingpages xml");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
            } else {
                t54.b bVar = new t54.b();
                bVar.b(0);
                bVar.a(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(".adCanvasInfo.type"), 0));
                bVar.c(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(".adCanvasInfo.subtype"), 0));
                int i17 = 0;
                loop0: while (true) {
                    bVar.b(1);
                    java.lang.String str3 = ".adCanvasInfo.PageList.Page";
                    if (i17 != 0) {
                        str3 = ".adCanvasInfo.PageList.Page" + i17;
                    }
                    if (d17.containsKey(str3 + ".componentItemList.componentItem.type")) {
                        bVar.a(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(str3 + ".type"), z17 ? 1 : 0));
                        bVar.c(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(str3 + ".subType"), z17 ? 1 : 0));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
                        int i18 = bVar.f415843b;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
                        if (i18 == 82) {
                            com.tencent.mars.xlog.Log.i("PreloadSnsAdHelper", "get webView type!");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
                            break;
                        }
                        java.lang.String str4 = str3 + ".componentItemList.componentItem";
                        bVar.b(2);
                        int i19 = 0;
                        while (true) {
                            if (i19 == 0) {
                                str2 = str4;
                            } else {
                                str2 = str4 + i19;
                            }
                            if (!d17.containsKey(str2 + ".type")) {
                                break;
                            }
                            java.lang.String str5 = str4;
                            bVar.a(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(str2 + ".type"), 0));
                            bVar.c(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(str2 + ".subType"), 0));
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
                            int i27 = bVar.f415843b;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
                            if (i27 == 82) {
                                com.tencent.mars.xlog.Log.i("PreloadSnsAdHelper", "get webView type!");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
                                break loop0;
                            }
                            i19++;
                            str4 = str5;
                        }
                    } else {
                        bVar.b(2);
                        java.util.Iterator it = d17.entrySet().iterator();
                        while (it.hasNext()) {
                            java.lang.String str6 = (java.lang.String) ((java.util.Map.Entry) it.next()).getKey();
                            if (str6 != null) {
                                java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[\\s\\S]*\\.componentItem[0-9]*\\.type$");
                                kotlin.jvm.internal.o.f(compile, "compile(...)");
                                if (compile.matcher(str6).matches()) {
                                    java.lang.Object t17 = r26.i0.t(str6, ".type", ".subType", z17);
                                    bVar.a(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(str6), z17 ? 1 : 0));
                                    bVar.c(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(t17), z17 ? 1 : 0));
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
                                    int i28 = bVar.f415843b;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
                                    if (i28 == 82) {
                                        com.tencent.mars.xlog.Log.i("PreloadSnsAdHelper", "get webView type!");
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
                    }
                    i17++;
                    z17 = false;
                }
                z17 = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
        return z17;
    }
}
