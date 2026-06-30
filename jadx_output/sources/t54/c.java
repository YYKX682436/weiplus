package t54;

/* loaded from: classes4.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final t54.c f415845d = new t54.c();

    public c() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$processPreload$1");
        android.os.Parcelable obj2 = (android.os.Parcelable) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$processPreload$1");
        kotlin.jvm.internal.o.g(obj2, "obj");
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("PreloadSnsAdHelper", th6, " processPreload error", new java.lang.Object[0]);
        }
        if (obj2 instanceof com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getXml", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getXml", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo");
            java.lang.String str = ((com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo) obj2).f163156d;
            if (str == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$processPreload$1");
                jz5.f0 f0Var = jz5.f0.f302826a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$processPreload$1");
                return f0Var;
            }
            t54.d dVar = t54.d.f415846a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getXmlShouldPreloadWebViewMap$p", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
            com.tencent.mm.sdk.platformtools.r2 r2Var = t54.d.f415847b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getXmlShouldPreloadWebViewMap$p", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
            if (r2Var.k(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getXmlShouldPreloadWebViewMap$p", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getXmlShouldPreloadWebViewMap$p", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
                java.lang.Object obj3 = r2Var.get(str);
                kotlin.jvm.internal.o.f(obj3, "get(...)");
                a17 = ((java.lang.Boolean) obj3).booleanValue();
                com.tencent.mars.xlog.Log.i("PreloadSnsAdHelper", "already checked! " + a17);
            } else {
                a17 = t54.d.a(t54.d.f415846a, str);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getXmlShouldPreloadWebViewMap$p", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getXmlShouldPreloadWebViewMap$p", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
            r2Var.put(str, java.lang.Boolean.valueOf(a17));
            if (a17) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0.e0();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$processPreload$1");
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$processPreload$1");
        return f0Var2;
    }
}
