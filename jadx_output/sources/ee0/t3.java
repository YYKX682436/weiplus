package ee0;

@j95.b
/* loaded from: classes8.dex */
public final class t3 extends i95.w implements fe0.v3 {
    public void Ai(android.view.View view, fe0.a aVar, java.lang.String str, java.util.Map map, fe0.p3 p3Var) {
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processFrontEvent", "com.tencent.mm.feature.sns.LiteAppAdGeneralViewService");
        if (view == null || aVar == null || str == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.GeneralViewService", "the view or view type is null!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processFrontEvent", "com.tencent.mm.feature.sns.LiteAppAdGeneralViewService");
            return;
        }
        if (aVar == fe0.a.f261364d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeMethod", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewFactory");
            java.lang.Object tag = view.getTag(com.tencent.mm.R.id.kov);
            if (tag instanceof j54.f) {
                j54.f fVar = (j54.f) tag;
                fVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeMethod", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController");
                if (kotlin.jvm.internal.o.b("startMonitoring", str)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("register", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController");
                    com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView panoramaContainerView = fVar.f297829c;
                    if (panoramaContainerView == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registerSensor", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
                        android.hardware.SensorManager sensorManager = panoramaContainerView.f163039i;
                        if (sensorManager == null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerSensor", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
                        } else {
                            if (!panoramaContainerView.f163040m) {
                                com.tencent.mars.xlog.Log.i("SnsAd.PanoramaView", "it is going to register sensor");
                                android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                                android.hardware.Sensor defaultSensor2 = sensorManager.getDefaultSensor(2);
                                if (defaultSensor != null) {
                                    sensorManager.registerListener(panoramaContainerView, defaultSensor, 1);
                                }
                                if (defaultSensor2 != null) {
                                    sensorManager.registerListener(panoramaContainerView, defaultSensor2, 1);
                                }
                                panoramaContainerView.f163040m = true;
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerSensor", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController");
                    }
                } else if (kotlin.jvm.internal.o.b("stopMonitoring", str)) {
                    fVar.b();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeMethod", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeMethod", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewFactory");
        } else if (aVar == fe0.a.f261365e) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeMethod", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewFactory");
            if (str.length() == 0) {
                com.tencent.mars.xlog.Log.i("SnsAd.FormView", "the view or method is null!!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeMethod", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewFactory");
            } else {
                java.lang.Object tag2 = view.getTag(com.tencent.mm.R.id.r8r);
                if (tag2 instanceof h54.f) {
                    h54.f fVar2 = (h54.f) tag2;
                    fVar2.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeMethod", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
                    java.util.Map a17 = h54.i.f279096a.a(map);
                    if (kotlin.jvm.internal.o.b("performActionResult", str)) {
                        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) a17;
                        java.lang.Object obj = linkedHashMap.get("callbackId");
                        java.lang.String str3 = "";
                        if (obj != null) {
                            str2 = obj instanceof java.lang.String ? (java.lang.String) obj : "";
                        } else {
                            str2 = "";
                        }
                        java.lang.Object obj2 = linkedHashMap.get("resultData");
                        if (obj2 != null && (obj2 instanceof java.lang.String)) {
                            str3 = (java.lang.String) obj2;
                        }
                        zg0.v2 v2Var = fVar2.f279094d;
                        if (v2Var == null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeMethod", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
                        } else {
                            if (str2.length() > 0) {
                                m54.l lVar = new m54.l();
                                h54.a aVar2 = h54.b.f279079a;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEMPTY_FORM_DATA", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormDataConvertor");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEMPTY_FORM_DATA", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormDataConvertor");
                                new h54.d(v2Var, str2, lVar, "", null, h54.b.f279079a).a("ok", kz5.c1.l(new jz5.l("ret", 0), new jz5.l("err_msg", "ok"), new jz5.l("result_data", str3)));
                            }
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeMethod", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeMethod", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewFactory");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processFrontEvent", "com.tencent.mm.feature.sns.LiteAppAdGeneralViewService");
    }

    public void Bi(android.view.View view, fe0.a aVar) {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("releaseView", "com.tencent.mm.feature.sns.LiteAppAdGeneralViewService");
        if (view == null || aVar == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.GeneralViewService", "the view or view type is null!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("releaseView", "com.tencent.mm.feature.sns.LiteAppAdGeneralViewService");
            return;
        }
        if (aVar == fe0.a.f261364d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("releasePanoramaView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewFactory");
            java.lang.Object tag = view.getTag(com.tencent.mm.R.id.kov);
            if (tag instanceof j54.f) {
                j54.f fVar = (j54.f) tag;
                fVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController");
                fVar.b();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("releasePanoramaView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewFactory");
        } else if (aVar == fe0.a.f261365e) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("releaseFormView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewFactory");
            if ((view instanceof com.tencent.mm.ui.widget.MMWebView) && !((com.tencent.mm.ui.widget.MMWebView) view).f211376y) {
                try {
                    com.tencent.mars.xlog.Log.i("SnsAd.FormView", "it is going to release form view");
                    ((com.tencent.mm.ui.widget.MMWebView) view).E0();
                    ((com.tencent.mm.ui.widget.MMWebView) view).destroy();
                } catch (java.lang.Throwable th6) {
                    ca4.q.c("releaseFormView", th6);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("releaseFormView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewFactory");
        } else if (aVar == fe0.a.f261366f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("releaseWebView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory");
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            } catch (java.lang.Throwable th7) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
            }
            if (!(view instanceof com.tencent.mm.ui.widget.MMWebView) || ((com.tencent.mm.ui.widget.MMWebView) view).f211376y) {
                ym5.a1.f(new k54.q(view));
                m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
                if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                    ca4.q.c("SnsAd.WebView", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
                }
                kotlin.Result.m527isFailureimpl(m521constructorimpl);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("releaseWebView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory");
            } else {
                java.lang.Object webViewClient = ((com.tencent.mm.ui.widget.MMWebView) view).getWebViewClient();
                if (webViewClient instanceof zg0.q2) {
                    com.tencent.mars.xlog.Log.i("SnsAd.WebView", "controller destroy");
                    ((com.tencent.mm.plugin.webview.core.e3) ((zg0.q2) webViewClient)).D0();
                }
                com.tencent.mars.xlog.Log.i("SnsAd.WebView", "common web view destroy");
                ((com.tencent.mm.ui.widget.MMWebView) view).destroy();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("releaseWebView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("releaseView", "com.tencent.mm.feature.sns.LiteAppAdGeneralViewService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0108  */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View wi(android.content.Context r37, fe0.a r38, int r39, java.util.Map r40, fe0.z3 r41) {
        /*
            Method dump skipped, instructions count: 1839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ee0.t3.wi(android.content.Context, fe0.a, int, java.util.Map, fe0.z3):android.view.View");
    }
}
