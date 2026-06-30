package m54;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static org.json.JSONObject f324284c;

    /* renamed from: e, reason: collision with root package name */
    public static long f324286e;

    /* renamed from: a, reason: collision with root package name */
    public static final m54.j f324282a = new m54.j();

    /* renamed from: b, reason: collision with root package name */
    public static final android.util.LruCache f324283b = new android.util.LruCache(10);

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f324285d = "";

    public static final void a(java.lang.String key) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanOldVangogh", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        kotlin.jvm.internal.o.g(key, "key");
        try {
            synchronized (f324282a) {
                try {
                } finally {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanOldVangogh", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
                }
            }
            com.tencent.mm.plugin.sns.storage.o0 o0Var = new com.tencent.mm.plugin.sns.storage.o0();
            o0Var.field_key = key;
            com.tencent.mm.plugin.sns.model.l4.Ri().get(o0Var, new java.lang.String[0]);
            com.tencent.mm.plugin.sns.model.l4.Ri().delete(o0Var, new java.lang.String[0]);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.VangoghPageLoader", "clean old data error " + th6.getMessage());
        }
    }

    public static final m54.y b(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDynamicElement", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        try {
            m54.j jVar = f324282a;
            m54.y c17 = jVar.c(d(jVar, j17, str == null ? "" : str, str2 == null ? "" : str2, null, str3, 8, null));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicElement", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
            return c17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.VangoghPageLoader", "there is an exception, " + th6.getMessage());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicElement", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
            return null;
        }
    }

    public static final java.lang.String e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVangoghLibVersion", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - f324286e > com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
            f324286e = currentTimeMillis;
            com.tencent.mars.xlog.Log.i("SnsAd.VangoghPageLoader", "it is going to check vangogh version!");
            try {
                f324285d = f324282a.f();
            } catch (java.lang.Throwable th6) {
                ca4.q.c("getVangoghLibVersion", th6);
            }
        }
        java.lang.String str = f324285d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVangoghLibVersion", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        return str;
    }

    public static final boolean g(m54.y yVar) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        boolean z18 = true;
        if (!h(yVar)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasOnetimeCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
            if (yVar == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasOnetimeCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
                z17 = false;
            } else {
                z17 = yVar.b().length() > 0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasOnetimeCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
            }
            if (!z17) {
                z18 = false;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        return z18;
    }

    public static final boolean h(m54.y yVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasDynamicCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        if (yVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasDynamicCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
            return false;
        }
        boolean z17 = yVar.a().length() > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasDynamicCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        return z17;
    }

    public final m54.y c(java.lang.String key) {
        android.util.LruCache lruCache;
        m54.y yVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDynamicElement", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        kotlin.jvm.internal.o.g(key, "key");
        synchronized (this) {
            try {
                lruCache = f324283b;
                yVar = (m54.y) lruCache.get(key);
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicElement", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
                throw th6;
            }
        }
        if (yVar == null) {
            com.tencent.mm.plugin.sns.storage.o0 o0Var = new com.tencent.mm.plugin.sns.storage.o0();
            o0Var.field_key = key;
            com.tencent.mm.plugin.sns.storage.p0 Ri = com.tencent.mm.plugin.sns.model.l4.Ri();
            if (Ri != null) {
                Ri.get(o0Var, new java.lang.String[0]);
            }
            java.lang.String str = o0Var.field_dynamicCanvas;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = o0Var.field_onetimeCanvas;
            if (str2 == null) {
                str2 = "";
            }
            m54.y yVar2 = new m54.y(str, str2, o0Var.field_createdTime);
            if (g(yVar2)) {
                synchronized (this) {
                    try {
                    } catch (java.lang.Throwable th7) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicElement", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
                        throw th7;
                    }
                }
            }
            yVar = yVar2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicElement", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        return yVar;
    }

    public final java.lang.String d(long j17, java.lang.String dynamicInfo, java.lang.String uxInfo, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDynamicKey", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        kotlin.jvm.internal.o.g(dynamicInfo, "dynamicInfo");
        kotlin.jvm.internal.o.g(uxInfo, "uxInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("ensureSupport", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        if (f324284c == null) {
            f324284c = l44.e.a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ensureSupport", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        org.json.JSONObject jSONObject = f324284c;
        if (jSONObject == null || (str3 = jSONObject.toString()) == null) {
            str3 = "";
        }
        if (str == null) {
            str = e();
        }
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(j17 + uxInfo + dynamicInfo + str3 + str + str2);
        kotlin.jvm.internal.o.f(a17, "getMD5String(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicKey", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        return a17;
    }

    public final java.lang.String f() {
        boolean z17;
        com.tencent.liteapp.storage.WxaLiteAppInfo Bj;
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVangoghVersion", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        com.tencent.mars.xlog.Log.i("SnsAd.VangoghPageLoader", "it is going to get vangogh version");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("supportVangoghVersion", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        boolean z18 = false;
        if (e0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("supportVangoghVersion", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
            z17 = false;
        } else {
            int Ni = ((h62.d) e0Var).Ni(e42.c0.clicfg_ad_vangogh_page_support_version, 1);
            com.tencent.mars.xlog.Log.i("SnsAd.DynamicCanvas", "Vangogh version needed: the switch value is " + Ni);
            z17 = Ni > 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("supportVangoghVersion", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
        }
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVangoghVersion", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
            return "";
        }
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        if (g0Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("supportNewLiteAppInfoMethod", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
            e42.e0 e0Var2 = (e42.e0) i95.n0.c(e42.e0.class);
            if (e0Var2 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("supportNewLiteAppInfoMethod", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
            } else {
                int Ni2 = ((h62.d) e0Var2).Ni(e42.c0.clicfg_sns_ad_use_new_wx_liteapp_info_method_v2, 1);
                com.tencent.mars.xlog.Log.i("SnsAd.DynamicCanvas", "use new wx liteapp info: the switch value is " + Ni2);
                boolean z19 = Ni2 > 0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("supportNewLiteAppInfoMethod", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
                z18 = z19;
            }
            if (z18) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVangoghLiteAppInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_PLAY_PREPARED, 50);
                    m521constructorimpl = kotlin.Result.m521constructorimpl(((com.tencent.mm.feature.lite.i) g0Var).Cj("wxalite0c45e912005759856ea55eb382e8c509"));
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                    ca4.q.c("sns_ad_lite_app_info", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
                }
                if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                    m521constructorimpl = null;
                }
                Bj = (com.tencent.liteapp.storage.WxaLiteAppInfo) m521constructorimpl;
                if (Bj == null) {
                    com.tencent.mars.xlog.Log.w("SnsAd.VangoghPageLoader", "the value of getLiteAppItemInfo is null");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_PLAY_PREPARED, 51);
                    Bj = ((com.tencent.mm.feature.lite.i) g0Var).Bj("wxalite0c45e912005759856ea55eb382e8c509");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVangoghLiteAppInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
            } else {
                Bj = ((com.tencent.mm.feature.lite.i) g0Var).Bj("wxalite0c45e912005759856ea55eb382e8c509");
            }
            if (Bj != null) {
                java.lang.String Ej = ((com.tencent.mm.feature.lite.i) g0Var).Ej(Bj.path, Bj.appId, Bj.signatureKey);
                java.lang.String str = Ej != null ? Ej : "";
                com.tencent.mars.xlog.Log.i("SnsAd.VangoghPageLoader", "the vangogh version is ".concat(str));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVangoghVersion", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
                return str;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVangoghVersion", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        return "";
    }

    public final void i(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("putDynamicElement", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        java.lang.String d17 = d(j17, str, str2, str5, str6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentServerTimeSecond", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        long a17 = c01.id.a() / 1000;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentServerTimeSecond", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        synchronized (this) {
            try {
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putDynamicElement", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.storage.p0 Ri = com.tencent.mm.plugin.sns.model.l4.Ri();
        if (Ri != null) {
            com.tencent.mm.plugin.sns.storage.o0 o0Var = new com.tencent.mm.plugin.sns.storage.o0();
            o0Var.field_key = d17;
            o0Var.field_pageId = java.lang.String.valueOf(j17);
            o0Var.field_dynamicInfo = str;
            o0Var.field_createdTime = a17;
            o0Var.field_dynamicCanvas = str3;
            o0Var.field_onetimeCanvas = str4;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("upsert", "com.tencent.mm.plugin.sns.storage.AdDynamicCanvasInfoStorage");
            if (!Ri.insert(o0Var)) {
                Ri.update(o0Var, new java.lang.String[0]);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("upsert", "com.tencent.mm.plugin.sns.storage.AdDynamicCanvasInfoStorage");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putDynamicElement", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
    }

    public final void j(long j17, java.lang.String str, java.lang.String str2, int i17, im5.b bVar, android.content.Intent intent, java.lang.String str3, yz5.p pVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("request", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        java.lang.String e17 = e();
        za4.a aVar = new za4.a();
        aVar.f471056d = false;
        aVar.f471057e = e17;
        aVar.f471058f = intent != null ? intent.getIntExtra("sns_landing_page_is_direct_download", 0) : 0;
        za4.s1.e(j17, 0, 0, i17, str2, str, str3 == null ? "" : str3, aVar, new m54.g(pVar), bVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("request", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
    }

    public static /* synthetic */ java.lang.String d(m54.j jVar, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDynamicKey$default", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        java.lang.String d17 = jVar.d(j17, str, str2, (i17 & 8) != 0 ? null : str3, (i17 & 16) != 0 ? null : str4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicKey$default", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        return d17;
    }
}
