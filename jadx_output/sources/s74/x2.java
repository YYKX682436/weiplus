package s74;

/* loaded from: classes4.dex */
public final class x2 {

    /* renamed from: a, reason: collision with root package name */
    public static final s74.x2 f404589a = new s74.x2();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f404590b = kz5.c0.k(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "image", "button", "layout", "mainElement", "easyBuyIconContainer", "separator", "tagContainer", "tagElement", "downloadComplianceContainer", "gridElementContainer", "gridElement", "liveStatusContainer", "liveLikeAnimationContainer", "promotionContainer", "rollContainer", "adBulletScreenContainer");

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f404591c = kz5.c0.k("color", "background-color", "hover-color", "hover-background-color", "scalex", "scaley", "translatex", "translatey", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, "rotatex", "rotatey", "alpha");

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f404592d = new java.util.LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f404593e = new java.util.LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f404594f = new java.util.LinkedHashMap();

    public static final boolean a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
        boolean z17 = false;
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
            return false;
        }
        java.util.Map map = f404593e;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    boolean b17 = kotlin.jvm.internal.o.b(((java.util.LinkedHashMap) map).get(str), java.lang.Boolean.TRUE);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
                    return b17;
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                org.json.JSONObject c17 = f404589a.c(str);
                if (c17 == null) {
                    com.tencent.mars.xlog.Log.e("DynamicView.DynamicInfoChecker", "parse json error!!");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
                    return false;
                }
                s74.t2 t2Var = new s74.t2(c17);
                s74.u2 u2Var = new s74.u2(c17);
                s74.s2 s2Var = new s74.s2(c17);
                if (((java.lang.Boolean) t2Var.invoke()).booleanValue() && ((java.lang.Boolean) u2Var.invoke()).booleanValue() && ((java.lang.Boolean) s2Var.invoke()).booleanValue()) {
                    z17 = true;
                }
                synchronized (map) {
                    try {
                        map.put(str, java.lang.Boolean.valueOf(z17));
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
                        throw th6;
                    }
                }
                com.tencent.mars.xlog.Log.i("DynamicView.DynamicInfoChecker", "checkLayoutDynamicInfo end! cost = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
                return z17;
            } catch (java.lang.Throwable th7) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
                throw th7;
            }
        }
    }

    public static final void d(com.tencent.mm.plugin.sns.storage.ADXml aDXml) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleDebugDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
        if (aDXml == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleDebugDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
            return;
        }
        if (!ca4.m0.d0()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleDebugDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
            return;
        }
        try {
            int h17 = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.ad.RepairerConfigDynamicAd());
            com.tencent.mars.xlog.Log.i("DynamicView.DynamicInfoChecker.debug", "debug, RepairerConfigDynamicAd value=" + h17);
            if (h17 == 1) {
                java.lang.String b17 = n84.y.b(new com.tencent.mm.vfs.r6(com.tencent.mm.sdk.platformtools.x2.f193071a.getExternalFilesDir(""), "json"));
                if (android.text.TextUtils.isEmpty(b17)) {
                    com.tencent.mars.xlog.Log.w("DynamicView.DynamicInfoChecker.debug", "debug, local dynamicInfo empty");
                } else {
                    aDXml.adDynamicInfo = b17;
                    com.tencent.mars.xlog.Log.w("DynamicView.DynamicInfoChecker.debug", "debug, overwrite dynamicInfo");
                }
            } else if (h17 == 2) {
                aDXml.adDynamicInfo = "";
                com.tencent.mars.xlog.Log.w("DynamicView.DynamicInfoChecker.debug", "debug, forbid dynamic ad");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("DynamicView.DynamicInfoChecker.debug", "debug, handleDebugDynamicInfo, exp=" + th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleDebugDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean e() {
        /*
            java.lang.String r0 = "DynamicView.DynamicInfoChecker"
            java.lang.String r1 = "isCacheDynamicViewDisabled called "
            java.lang.String r2 = "isCacheDynamicViewDisabled"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r4 = 0
            java.lang.Class<e42.e0> r5 = e42.e0.class
            i95.m r5 = i95.n0.c(r5)     // Catch: java.lang.Throwable -> L30
            e42.e0 r5 = (e42.e0) r5     // Catch: java.lang.Throwable -> L30
            e42.c0 r6 = e42.c0.clicfg_ad_timeline_dynamic_feed_cache_view_disbaled_android     // Catch: java.lang.Throwable -> L30
            h62.d r5 = (h62.d) r5     // Catch: java.lang.Throwable -> L30
            int r5 = r5.Ni(r6, r4)     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            r6.append(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L2e
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L2e
            goto L44
        L2e:
            r1 = move-exception
            goto L32
        L30:
            r1 = move-exception
            r5 = r4
        L32:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "isCacheDynamicViewDisabled, exp="
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            com.tencent.mars.xlog.Log.e(r0, r1)
        L44:
            if (r5 <= 0) goto L47
            r4 = 1
        L47:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.x2.e():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean g() {
        /*
            java.lang.String r0 = "the cover end support value is "
            java.lang.String r1 = "supportDynamicViewEndCover"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = 0
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<e42.e0> r4 = e42.e0.class
            i95.m r4 = i95.n0.c(r4)     // Catch: java.lang.Throwable -> L3c
            e42.e0 r4 = (e42.e0) r4     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L21
            e42.c0 r5 = e42.c0.clicfg_sns_ad_dynamic_template_end_cover_support     // Catch: java.lang.Throwable -> L3c
            h62.d r4 = (h62.d) r4     // Catch: java.lang.Throwable -> L3c
            int r4 = r4.Ni(r5, r3)     // Catch: java.lang.Throwable -> L3c
            goto L22
        L21:
            r4 = r3
        L22:
            java.lang.String r5 = "DynamicView.DynamicInfoChecker"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L3a
            r6.append(r4)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L3a
            com.tencent.mars.xlog.Log.i(r5, r0)     // Catch: java.lang.Throwable -> L3a
            jz5.f0 r0 = jz5.f0.f302826a     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r0 = kotlin.Result.m521constructorimpl(r0)     // Catch: java.lang.Throwable -> L3a
            goto L48
        L3a:
            r0 = move-exception
            goto L3e
        L3c:
            r0 = move-exception
            r4 = r3
        L3e:
            kotlin.Result$Companion r5 = kotlin.Result.INSTANCE
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m521constructorimpl(r0)
        L48:
            boolean r5 = kotlin.Result.m527isFailureimpl(r0)
            if (r5 == 0) goto L57
            java.lang.Throwable r5 = kotlin.Result.m524exceptionOrNullimpl(r0)
            java.lang.String r6 = "catching_tag"
            ca4.q.c(r6, r5)
        L57:
            kotlin.Result.m527isFailureimpl(r0)
            if (r4 <= 0) goto L5d
            r3 = 1
        L5d:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.x2.g():boolean");
    }

    public final boolean b(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("DynamicView.DynamicInfoChecker", "error obj is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
            return false;
        }
        if (!f404590b.contains(jSONObject.optString("type"))) {
            com.tencent.mars.xlog.Log.e("DynamicView.DynamicInfoChecker", "error type " + jSONObject.optString("type") + ", id=" + jSONObject.optString(dm.i4.COL_ID));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
            return false;
        }
        if (jSONObject.has("children")) {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("children");
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                if (optJSONObject == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
                    return false;
                }
                if (!b(optJSONObject)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
                    return false;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
        return true;
    }

    public final org.json.JSONObject c(java.lang.String str) {
        org.json.JSONObject jSONObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
            return null;
        }
        java.util.Map map = f404592d;
        synchronized (map) {
            try {
                jSONObject = ((java.util.LinkedHashMap) map).get(str) != null ? (org.json.JSONObject) ((java.util.LinkedHashMap) map).get(str) : null;
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
                throw th6;
            }
        }
        if (jSONObject == null) {
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
                synchronized (map) {
                    try {
                        if (((java.util.LinkedHashMap) map).get(str) != null) {
                            jSONObject2 = (org.json.JSONObject) ((java.util.LinkedHashMap) map).get(str);
                        } else {
                            map.put(str, jSONObject2);
                        }
                    } catch (java.lang.Throwable th7) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
                        throw th7;
                    }
                }
                jSONObject = jSONObject2;
            } catch (java.lang.Throwable th8) {
                com.tencent.mars.xlog.Log.printErrStackTrace("DynamicView.DynamicInfoChecker", th8, "json error!", new java.lang.Object[0]);
            }
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("DynamicView.DynamicInfoChecker", "parse json error!!");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2008, 10);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
        return jSONObject;
    }

    public final java.lang.String f(org.json.JSONObject jSONObject, java.lang.String jsonKey, i64.q adDataModel) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseStringValue", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
        kotlin.jvm.internal.o.g(jSONObject, "<this>");
        kotlin.jvm.internal.o.g(jsonKey, "jsonKey");
        kotlin.jvm.internal.o.g(adDataModel, "adDataModel");
        java.lang.String optString = jSONObject.optString(jsonKey);
        s74.q4 q4Var = s74.q4.f404513a;
        kotlin.jvm.internal.o.d(optString);
        java.lang.String w17 = q4Var.w(adDataModel, optString);
        if (w17 != null) {
            optString = w17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseStringValue", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
        return optString;
    }

    public final void h(org.json.JSONObject jSONObject, i64.q qVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("traversalObjAndPreload", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("DynamicView.DynamicInfoChecker", "error obj is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("traversalObjAndPreload", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
            return;
        }
        com.tencent.mm.plugin.sns.storage.ADXml aDXml = qVar.f289288b;
        if (jSONObject.has("bind-click-action-info")) {
            java.lang.String optString = jSONObject.optString("bind-click-action-info");
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo.f(aDXml.mValuesMap, aDXml.mKeyPrefix + '.' + optString).g(qVar.f289287a);
        }
        if (kotlin.jvm.internal.o.b(jSONObject.optString("type"), "image")) {
            java.lang.String f17 = f(jSONObject, "url", qVar);
            a84.m.d(f17, new s74.v2(f17));
            java.lang.String f18 = f(jSONObject, "url-dark", qVar);
            if ((!r26.n0.N(f18)) && !kotlin.jvm.internal.o.b(f18, f17)) {
                a84.m.d(f18, new s74.w2(f18));
            }
        }
        if (jSONObject.has("children")) {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("children");
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                h(jSONArray.optJSONObject(i17), qVar);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("traversalObjAndPreload", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
    }
}
