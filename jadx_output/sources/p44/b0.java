package p44;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final p44.b0 f351771a = new p44.b0();

    /* renamed from: b, reason: collision with root package name */
    public static r45.d53 f351772b;

    public static final java.lang.String b(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardExtInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardExtInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            return null;
        }
        if (str2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardExtInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            return null;
        }
        java.lang.String c17 = f351771a.c(str, str2);
        java.lang.String e17 = p34.o.e(c17);
        com.tencent.mars.xlog.Log.i("RandomPickCardStorage", "getCardExtInfo, key=" + c17 + ", value=" + e17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardExtInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        return e17;
    }

    public static final void j(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveCardExtInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveCardExtInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            return;
        }
        if (str2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveCardExtInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            return;
        }
        if (str3 == null || str3.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveCardExtInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            return;
        }
        java.lang.String c17 = f351771a.c(str, str2);
        p34.o.i(c17, str3);
        com.tencent.mars.xlog.Log.i("RandomPickCardStorage", "saveCardExtInfo, key=" + c17 + ", value=" + str3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveCardExtInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
    }

    public static final void l(r45.d53 d53Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTempCardFreshInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        f351772b = d53Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setTempCardFreshInfo, freshInfo=[cardId=");
        sb6.append(d53Var != null ? d53Var.f372125d : null);
        sb6.append(", time=");
        sb6.append(d53Var != null ? java.lang.Long.valueOf(d53Var.f372126e) : null);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("RandomPickCardStorage", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTempCardFreshInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
    }

    public static final void n(java.lang.String str, java.lang.String str2, int i17) {
        p44.b0 b0Var;
        java.util.List e17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateFreshInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFreshInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            return;
        }
        com.tencent.mars.xlog.Log.i("RandomPickCardStorage", "updateFreshInfo, pageId=" + str + ", cardId=" + str2 + ", clickIndex=" + i17);
        if (android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFreshInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            return;
        }
        r45.d53 d53Var = new r45.d53();
        d53Var.f372125d = str2;
        d53Var.f372126e = c01.id.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateRandomCardList", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        try {
            b0Var = f351771a;
            e17 = b0Var.e(str);
        } catch (java.lang.Throwable th6) {
            ca4.q.c("RandomPickCardStorage", th6);
        }
        if (((java.util.ArrayList) e17).isEmpty()) {
            com.tencent.mars.xlog.Log.e("RandomPickCardStorage", "updateRandomCardList, pageId is " + str + ", no local, freshInfo card id is " + d53Var.f372125d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateRandomCardList", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFreshInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        }
        com.tencent.mars.xlog.Log.i("RandomPickCardStorage", "updateRandomCardList, pageId is " + str + ", freshInfo card id is " + d53Var.f372125d);
        java.util.List V0 = kz5.n0.V0(e17);
        b0Var.o(V0, d53Var, i17);
        b0Var.k(str, V0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateRandomCardList", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFreshInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
    }

    public final void a(java.lang.Boolean bool, java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fixPreviewModePickStatus", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE) && f351772b != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p44.s sVar = (p44.s) it.next();
                java.lang.String b17 = sVar.b();
                boolean z17 = false;
                if (b17 != null) {
                    r45.d53 d53Var = f351772b;
                    if (b17.equals(d53Var != null ? d53Var.f372125d : null)) {
                        z17 = true;
                    }
                }
                if (z17 && !sVar.g()) {
                    sVar.h(c01.id.e());
                    break;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fixPreviewModePickStatus", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
    }

    public final java.lang.String c(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardExtInfoKey", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        java.lang.String str3 = g() + '_' + str + '_' + str2 + "_cardExtInfo";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardExtInfoKey", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        return str3;
    }

    public final java.lang.String d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFreshListCacheKey", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        java.lang.String str2 = g() + '_' + str + "_pickCardList";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFreshListCacheKey", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c A[Catch: Exception -> 0x00d4, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d4, blocks: (B:12:0x004a, B:14:0x0056, B:16:0x005e, B:22:0x0069, B:24:0x008f, B:30:0x009c), top: B:11:0x004a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List e(java.lang.String r19) {
        /*
            r18 = this;
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem"
            java.lang.String r1 = "getLocalRandomCardList"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.String r3 = r18.d(r19)
            java.lang.String r4 = p34.o.e(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "getLocalRandomCardList, key is "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = ", ret is "
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            java.lang.String r5 = "RandomPickCardStorage"
            com.tencent.mars.xlog.Log.i(r5, r3)
            java.lang.String r3 = "parseRandomCardListFromJson"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r2)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r4 == 0) goto L42
            int r9 = r4.length()
            if (r9 != 0) goto L40
            goto L42
        L40:
            r9 = 0
            goto L43
        L42:
            r9 = 1
        L43:
            if (r9 == 0) goto L4a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            goto Lf2
        L4a:
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch: java.lang.Exception -> Ld4
            r9.<init>(r4)     // Catch: java.lang.Exception -> Ld4
            int r10 = r9.length()     // Catch: java.lang.Exception -> Ld4
            r11 = 0
        L54:
            if (r11 >= r10) goto Lef
            java.lang.Object r12 = r9.get(r11)     // Catch: java.lang.Exception -> Ld4
            boolean r13 = r12 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> Ld4
            if (r13 == 0) goto L61
            org.json.JSONObject r12 = (org.json.JSONObject) r12     // Catch: java.lang.Exception -> Ld4
            goto L62
        L61:
            r12 = 0
        L62:
            if (r12 != 0) goto L69
            r16 = r9
        L66:
            r17 = r10
            goto Lcd
        L69:
            java.lang.String r13 = "cardId"
            java.lang.String r13 = r12.optString(r13)     // Catch: java.lang.Exception -> Ld4
            java.lang.String r14 = "time"
            long r14 = r12.optLong(r14)     // Catch: java.lang.Exception -> Ld4
            java.lang.String r7 = "xmlIndex"
            int r7 = r12.optInt(r7)     // Catch: java.lang.Exception -> Ld4
            java.lang.String r8 = "showIndex"
            int r8 = r12.optInt(r8)     // Catch: java.lang.Exception -> Ld4
            r16 = r9
            java.lang.String r9 = "title"
            java.lang.String r9 = r12.optString(r9)     // Catch: java.lang.Exception -> Ld4
            if (r13 == 0) goto L98
            int r12 = r13.length()     // Catch: java.lang.Exception -> Ld4
            if (r12 != 0) goto L96
            goto L98
        L96:
            r12 = 0
            goto L99
        L98:
            r12 = 1
        L99:
            if (r12 == 0) goto L9c
            goto L66
        L9c:
            p44.s r12 = new p44.s     // Catch: java.lang.Exception -> Ld4
            r12.<init>()     // Catch: java.lang.Exception -> Ld4
            r17 = r10
            java.lang.String r10 = "setCardId"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r0)     // Catch: java.lang.Exception -> Ld4
            r12.f351849b = r13     // Catch: java.lang.Exception -> Ld4
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r0)     // Catch: java.lang.Exception -> Ld4
            r12.h(r14)     // Catch: java.lang.Exception -> Ld4
            java.lang.String r10 = "setXmlIndex"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r0)     // Catch: java.lang.Exception -> Ld4
            r12.f351851d = r7     // Catch: java.lang.Exception -> Ld4
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r0)     // Catch: java.lang.Exception -> Ld4
            r12.i(r8)     // Catch: java.lang.Exception -> Ld4
            java.lang.String r7 = "setTitle"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r0)     // Catch: java.lang.Exception -> Ld4
            r12.f351848a = r9     // Catch: java.lang.Exception -> Ld4
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r0)     // Catch: java.lang.Exception -> Ld4
            r6.add(r12)     // Catch: java.lang.Exception -> Ld4
        Lcd:
            int r11 = r11 + 1
            r9 = r16
            r10 = r17
            goto L54
        Ld4:
            r0 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "parseRandomCardListFromJson, exp is "
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r0 = ", str is "
            r7.append(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            com.tencent.mars.xlog.Log.e(r5, r0)
        Lef:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
        Lf2:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p44.b0.e(java.lang.String):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0024 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:60:0x0015, B:5:0x0024, B:8:0x002d, B:9:0x0036, B:11:0x003c, B:14:0x004c, B:18:0x005b, B:19:0x0064, B:21:0x006a, B:24:0x0077, B:29:0x007f, B:30:0x008e, B:31:0x00a0, B:33:0x00a6, B:34:0x00b0, B:36:0x00b6, B:38:0x00c2, B:43:0x00d1, B:50:0x00e3, B:51:0x00fe, B:53:0x0104, B:55:0x0150, B:57:0x0087), top: B:59:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:60:0x0015, B:5:0x0024, B:8:0x002d, B:9:0x0036, B:11:0x003c, B:14:0x004c, B:18:0x005b, B:19:0x0064, B:21:0x006a, B:24:0x0077, B:29:0x007f, B:30:0x008e, B:31:0x00a0, B:33:0x00a6, B:34:0x00b0, B:36:0x00b6, B:38:0x00c2, B:43:0x00d1, B:50:0x00e3, B:51:0x00fe, B:53:0x0104, B:55:0x0150, B:57:0x0087), top: B:59:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List f(java.lang.String r13, java.util.List r14, java.lang.Boolean r15) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p44.b0.f(java.lang.String, java.util.List, java.lang.Boolean):java.util.List");
    }

    public final java.lang.String g() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUin", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        try {
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                str = gm0.j1.b().j();
                kotlin.jvm.internal.o.f(str, "getUinString(...)");
            } else {
                str = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getUin();
                kotlin.jvm.internal.o.f(str, "getUin(...)");
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("RandomPickCardStorage", th6);
            str = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUin", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        return str;
    }

    public final java.util.List h(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("mergeShareHBCardFreshInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        java.util.List arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            p44.s sVar = (p44.s) it.next();
            arrayList.add(sVar.a(sVar));
        }
        r45.d53 d53Var = f351772b;
        if (d53Var != null) {
            arrayList = kz5.n0.V0(arrayList);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateTmpFreshInfo$default", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            p(arrayList, d53Var, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateTmpFreshInfo$default", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mergeShareHBCardFreshInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        return arrayList;
    }

    public final java.lang.String i(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("randomCardListToJson", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.e("RandomPickCardStorage", "randomCardListToJson, xmlList is null or empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("randomCardListToJson", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            return "";
        }
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            p44.s sVar = (p44.s) obj;
            if (sVar != null) {
                java.lang.String b17 = sVar.b();
                if (!(b17 == null || b17.length() == 0)) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    java.lang.String b18 = sVar.b();
                    if (b18 == null) {
                        b18 = "";
                    }
                    jSONObject.put("cardId", b18);
                    jSONObject.put("time", sVar.c());
                    jSONObject.put("xmlIndex", sVar.f());
                    jSONObject.put("showIndex", sVar.d());
                    jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, sVar.e());
                    jSONArray.put(jSONObject);
                }
            }
            i17 = i18;
        }
        java.lang.String jSONArray2 = jSONArray.length() > 0 ? jSONArray.toString() : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("randomCardListToJson", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        return jSONArray2;
    }

    public final void k(java.lang.String str, java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveRandomCardList", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveRandomCardList", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            return;
        }
        if (list == null || list.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveRandomCardList", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            return;
        }
        java.lang.String i17 = i(list);
        if (i17 == null || i17.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveRandomCardList", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            return;
        }
        java.lang.String d17 = d(str);
        p34.o.i(d17, i17);
        com.tencent.mars.xlog.Log.i("RandomPickCardStorage", "saveRandomCardList, key is " + d17 + ", ret is " + i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveRandomCardList", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
    }

    public final void m(p44.s sVar, r45.d53 d53Var, p44.s sVar2, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("swapShowIndex", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        sVar.h(d53Var.f372126e);
        sVar2.i(sVar.d());
        sVar.i(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("swapShowIndex", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
    }

    public final void o(java.util.List list, r45.d53 d53Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSortInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        r45.d53 d53Var2 = f351772b;
        if (d53Var2 != null) {
            p(list, d53Var2, true);
        }
        int i18 = 0;
        p44.s sVar = null;
        p44.s sVar2 = null;
        for (java.lang.Object obj : list) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            p44.s sVar3 = (p44.s) obj;
            if (i17 < 0 ? !(sVar3.g() || (sVar != null && sVar.d() <= sVar3.d())) : sVar3.d() == i17) {
                sVar = sVar3;
            }
            java.lang.String b17 = sVar3.b();
            if (b17 != null && b17.equals(d53Var.f372125d)) {
                sVar2 = sVar3;
            }
            i18 = i19;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clickIndex is ");
        sb6.append(i17);
        sb6.append(", cardItemClick is ");
        sb6.append(sVar != null ? sVar.toString() : null);
        sb6.append(", cardItemPicked is ");
        sb6.append(sVar2 != null ? sVar2.toString() : null);
        com.tencent.mars.xlog.Log.i("RandomPickCardStorage", sb6.toString());
        if (sVar2 != null && sVar != null) {
            if (i17 < 0) {
                if ((sVar2.g()) || kotlin.jvm.internal.o.b(sVar2, sVar)) {
                    sVar2.h(d53Var.f372126e);
                } else {
                    m(sVar2, d53Var, sVar, sVar.d());
                }
            } else if (kotlin.jvm.internal.o.b(sVar, sVar2)) {
                sVar.h(d53Var.f372126e);
                sVar.i(i17);
            } else {
                if (!(sVar2.g())) {
                    if (!(sVar.g())) {
                        m(sVar2, d53Var, sVar, i17);
                    }
                }
                if (sVar.g()) {
                    com.tencent.mars.xlog.Log.w("RandomPickCardStorage", "cardItemClick is picked, maybe resp slow");
                }
                sVar2.h(d53Var.f372126e);
                sVar.i(i17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("writeBack", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            p44.s sVar4 = (p44.s) it.next();
            if (sVar4.c() == 1) {
                sVar4.h(0L);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("writeBack", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSortInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
    }

    public final void p(java.util.List list, r45.d53 d53Var, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateTmpFreshInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        java.util.Iterator it = list.iterator();
        p44.s sVar = null;
        p44.s sVar2 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            p44.s sVar3 = (p44.s) it.next();
            if (!sVar3.g() && (sVar2 == null || sVar2.d() > sVar3.d())) {
                sVar2 = sVar3;
            }
            java.lang.String b17 = sVar3.b();
            if (b17 != null && b17.equals(d53Var.f372125d)) {
                sVar = sVar3;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateTmpFreshInfo, pickedItem is ");
        sb6.append(sVar != null ? sVar.toString() : null);
        sb6.append(", firstNoPickItem is ");
        sb6.append(sVar2 != null ? sVar2.toString() : null);
        com.tencent.mars.xlog.Log.i("RandomPickCardStorage", sb6.toString());
        if (sVar != null && sVar.g()) {
            sVar.h(c01.id.e());
        } else {
            if (sVar2 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateTmpFreshInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
                return;
            }
            if (sVar == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateTmpFreshInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
                return;
            }
            if (z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("swapShowIndexAndOverridePickedFlag", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
                int d17 = sVar2.d();
                sVar.h(1L);
                sVar2.i(sVar.d());
                sVar.i(d17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("swapShowIndexAndOverridePickedFlag", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            } else {
                m(sVar, d53Var, sVar2, sVar2.d());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateTmpFreshInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
    }
}
