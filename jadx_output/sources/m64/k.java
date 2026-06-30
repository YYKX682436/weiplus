package m64;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f324405a = jz5.h.b(m64.j.f324404d);

    /* renamed from: b, reason: collision with root package name */
    public m64.i f324406b;

    public final void a(java.util.List list) {
        i64.q qVar;
        r45.jj4 jj4Var;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchPreload", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
        if (list == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchPreload", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            n64.f fVar = (n64.f) it.next();
            java.util.Objects.toString(fVar);
            fVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getResourceType", "com.tencent.mm.plugin.sns.ad.preload.detector.PreloadItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResourceType", "com.tencent.mm.plugin.sns.ad.preload.detector.PreloadItem");
            int i17 = fVar.f335219a;
            java.lang.String str5 = "";
            if (i17 == 2) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1911, 5);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPreloadImage", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
                n64.g gVar = fVar instanceof n64.g ? (n64.g) fVar : null;
                if (gVar != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUrl", "com.tencent.mm.plugin.sns.ad.preload.detector.UrlPreloadItem");
                    str3 = gVar.f335223e;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUrl", "com.tencent.mm.plugin.sns.ad.preload.detector.UrlPreloadItem");
                } else {
                    str3 = null;
                }
                if (str3 != null && str3.length() != 0) {
                    r13 = false;
                }
                if (r13) {
                    com.tencent.mars.xlog.Log.w("TimelineAdPullPreloader", "doPreloadImage, imageUrl=null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadImage", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
                } else {
                    m64.i iVar = this.f324406b;
                    if (iVar != null && (str4 = iVar.f324403c) != null) {
                        str5 = str4;
                    }
                    if (fVar.b(2)) {
                        n74.v1.i(str3, str5, fVar.a());
                    } else if (fVar.b(4)) {
                        n74.v1.j(str3, fVar.a());
                    } else {
                        n74.v1.h(str3, str5, fVar.a());
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadImage", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
                }
            } else if (i17 == 3) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1911, 6);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPreloadPag", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
                n64.g gVar2 = fVar instanceof n64.g ? (n64.g) fVar : null;
                if (gVar2 != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUrl", "com.tencent.mm.plugin.sns.ad.preload.detector.UrlPreloadItem");
                    str2 = gVar2.f335223e;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUrl", "com.tencent.mm.plugin.sns.ad.preload.detector.UrlPreloadItem");
                } else {
                    str2 = null;
                }
                if (str2 != null && str2.length() != 0) {
                    r13 = false;
                }
                if (r13) {
                    com.tencent.mars.xlog.Log.w("TimelineAdPullPreloader", "doPreloadPag, pagUrl=null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadPag", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
                } else {
                    n74.v1.p(str2);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadPag", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
                }
            } else if (i17 == 4) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1911, 7);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPreloadMedia", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
                n64.e eVar = fVar instanceof n64.e ? (n64.e) fVar : null;
                if (eVar != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMedia", "com.tencent.mm.plugin.sns.ad.preload.detector.MediaPreloadItem");
                    jj4Var = eVar.f335218e;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMedia", "com.tencent.mm.plugin.sns.ad.preload.detector.MediaPreloadItem");
                } else {
                    jj4Var = null;
                }
                if (jj4Var == null) {
                    com.tencent.mars.xlog.Log.w("TimelineAdPullPreloader", "doPreloadVideoThumb, media=null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadMedia", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
                } else {
                    m64.i iVar2 = this.f324406b;
                    if (iVar2 != null && (str = iVar2.f324403c) != null) {
                        str5 = str;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isVideoMedia", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
                    int i18 = jj4Var.f377856e;
                    boolean z17 = i18 == 6 || i18 == 4;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVideoMedia", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
                    if (z17) {
                        if (fVar.b(1)) {
                            m64.i iVar3 = this.f324406b;
                            l44.c0.c(iVar3 != null ? iVar3.f324401a : null, jj4Var, str5);
                            n74.v1.t(jj4Var, str5);
                        }
                        m64.i iVar4 = this.f324406b;
                        r13 = iVar4 != null ? iVar4.f324402b : true;
                        if (fVar.b(8)) {
                            n74.v1.v(jj4Var, str5, r13);
                        } else {
                            fVar.b(16);
                        }
                    } else {
                        if (fVar.b(32)) {
                            n74.v1.s(jj4Var, str5);
                        }
                        if (fVar.b(2)) {
                            n74.v1.h(jj4Var.f377860i, str5, fVar.a());
                        }
                        if (fVar.b(4)) {
                            n74.v1.j(jj4Var.f377860i, fVar.a());
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadMedia", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
                }
            } else if (i17 == 5) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1911, 8);
                m64.i iVar5 = this.f324406b;
                com.tencent.mm.plugin.sns.storage.ADInfo aDInfo = (iVar5 == null || (qVar = iVar5.f324401a) == null) ? null : qVar.f289287a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPreloadClickInfo", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
                n64.c cVar = fVar instanceof n64.c ? (n64.c) fVar : null;
                com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo c17 = cVar != null ? cVar.c() : null;
                if (c17 != null) {
                    c17.g(aDInfo);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadClickInfo", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchPreload", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
    }

    public final void b(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preload", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
        if (obj == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preload", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMDetector", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
        n64.a aVar = (n64.a) ((jz5.n) this.f324405a).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMDetector", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
        java.util.List b17 = aVar.b(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preload, totalNum=");
        sb6.append(b17 != null ? java.lang.Integer.valueOf(((java.util.ArrayList) b17).size()) : null);
        sb6.append(", detectCost=");
        sb6.append(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
        sb6.append(", snsId=");
        m64.i iVar = this.f324406b;
        sb6.append(iVar != null ? iVar.f324403c : null);
        com.tencent.mars.xlog.Log.i("TimelineAdPullPreloader", sb6.toString());
        if (!(b17 == null || b17.isEmpty())) {
            try {
                a(b17);
            } catch (java.lang.Throwable th6) {
                ca4.q.c("TimelineAdPreloader dispatchPreload", th6);
            }
            com.tencent.mars.xlog.Log.i("TimelineAdPullPreloader", "preload, totalCost=" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preload", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
            return;
        }
        com.tencent.mars.xlog.Log.i("TimelineAdPullPreloader", "preload, empty, target=" + obj);
        if (obj instanceof com.tencent.mm.plugin.sns.storage.ADXml) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1911, 3);
        } else if (obj instanceof com.tencent.mm.plugin.sns.storage.ADInfo) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1911, 4);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preload", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
    }
}
