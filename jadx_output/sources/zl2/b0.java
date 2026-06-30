package zl2;

/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a */
    public static final zl2.b0 f473663a = new zl2.b0();

    /* renamed from: b */
    public static final java.util.concurrent.ConcurrentHashMap f473664b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c */
    public static r45.br2 f473665c;

    public static /* synthetic */ java.lang.String d(zl2.b0 b0Var, r45.br2 br2Var, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, int i17, java.lang.Object obj) {
        java.lang.String str4 = (i17 & 2) != 0 ? null : str;
        java.lang.String str5 = (i17 & 4) != 0 ? null : str2;
        java.lang.Integer num2 = (i17 & 8) != 0 ? null : num;
        if ((i17 & 16) != 0) {
            str3 = "";
        }
        return b0Var.c(br2Var, str4, str5, num2, str3);
    }

    public static void i(zl2.b0 b0Var, android.content.Context context, r45.br2 shareObject, yz5.l callback, boolean z17, int i17, int i18, java.lang.Object obj) {
        boolean z18 = (i18 & 8) != 0 ? true : z17;
        int i19 = (i18 & 16) != 0 ? 0 : i17;
        b0Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(shareObject, "shareObject");
        kotlin.jvm.internal.o.g(callback, "callback");
        b0Var.f(shareObject, "Finder.FinderProductShareUtil_requestProductInfo");
        java.lang.String string = shareObject.getString(1);
        java.lang.String str = string == null ? "" : string;
        java.lang.String string2 = shareObject.getString(2);
        if (string2 == null) {
            string2 = "0";
        }
        long Z = pm0.v.Z(string2);
        java.lang.String string3 = shareObject.getString(7);
        long Z2 = pm0.v.Z(string3 != null ? string3 : "0");
        java.lang.String string4 = shareObject.getString(0);
        int i27 = (string4 == null || string4.length() == 0) ^ true ? 1 : 2;
        java.lang.String string5 = shareObject.getString(17);
        if (string5 == null) {
            string5 = "";
        }
        java.lang.String string6 = shareObject.getString(33);
        db2.r1 r1Var = new db2.r1(str, Z, Z2, i27, string5, string6 == null ? "" : string6, i19);
        if (z18) {
            r1Var.t(context, context.getResources().getString(com.tencent.mm.R.string.f9y), 500L);
        }
        r1Var.l().K(new zl2.a0(shareObject, callback));
    }

    public final void a(java.lang.String finderUsername, java.lang.String token, l81.b1 bundle) {
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(token, "token");
        kotlin.jvm.internal.o.g(bundle, "bundle");
        com.tencent.mars.xlog.Log.i("Finder.FinderProductShareUtil", "fillShareJsApiParams finderUsername:" + finderUsername + ", token:" + token);
        if (bundle.f317028i == null) {
            bundle.f317028i = new dk2.ah();
        }
        l81.p0 p0Var = bundle.f317028i;
        dk2.ah ahVar = p0Var instanceof dk2.ah ? (dk2.ah) p0Var : null;
        if (ahVar != null) {
            ahVar.f233216i = token;
            ahVar.f233217m = finderUsername;
        }
    }

    public final java.lang.String b(r45.br2 value, java.lang.String live_id, int i17) {
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(live_id, "live_id");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("live_id", live_id);
        jSONObject.put("live_status", i17);
        jSONObject.put("seckill", value.getInteger(15) > 0 ? 1 : 0);
        jSONObject.put("seckilling", value.getLong(16) <= c01.id.c() ? 0 : 1);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    public final java.lang.String c(r45.br2 value, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String gmsgId) {
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(gmsgId, "gmsgId");
        java.lang.String string = value.getString(7);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (string == null) {
            string = "";
        }
        jSONObject.put("commodity_id", string);
        if (str != null) {
            jSONObject.put("to_username", str);
        }
        if (str2 != null) {
            jSONObject.put("share_way", str2);
        }
        if (num != null) {
            num.intValue();
            jSONObject.put("commodity_status", num.intValue());
        }
        jSONObject.put("seckill", value.getInteger(15) > 0 ? 1 : 0);
        jSONObject.put("seckilling", value.getLong(16) <= c01.id.c() ? 0 : 1);
        jSONObject.put("gmsgid", gmsgId);
        jSONObject.put("promoter_key", value.getString(30));
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    public final r45.br2 e(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f473664b;
        if (((r45.br2) concurrentHashMap.get(key)) == null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderProductShareUtil", "getProduct key:" + key + ", result is null");
        }
        return (r45.br2) concurrentHashMap.get(key);
    }

    public final void f(r45.br2 br2Var, java.lang.String TAG) {
        kotlin.jvm.internal.o.g(br2Var, "<this>");
        kotlin.jvm.internal.o.g(TAG, "TAG");
        com.tencent.mars.xlog.Log.i(TAG, "FinderProductShareObject LogInfo, , liveId:" + br2Var.getString(0) + ", finderUsername:" + br2Var.getString(1) + ", finderObjectID:" + br2Var.getString(2) + ", finderNonceID: " + br2Var.getString(3));
        com.tencent.mars.xlog.Log.i(TAG, "FinderProductShareObject LogInfo, , appId:" + br2Var.getString(5) + ", pagePath:" + br2Var.getString(6) + ", productId:" + br2Var.getString(7) + ", ecSource:" + br2Var.getString(17));
        com.tencent.mars.xlog.Log.i(TAG, "FinderProductShareObject LogInfo, , productTitle:" + br2Var.getString(9) + ", marketPrice:" + br2Var.getInteger(10) + ", sellingPrice:" + br2Var.getInteger(11) + ", coverUrl:" + br2Var.getString(8));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderProductShareObject LogInfo, , platformName:");
        sb6.append(br2Var.getString(13));
        sb6.append(", shopWindowId:");
        sb6.append(br2Var.getString(14));
        sb6.append(", platformHeadImg:");
        sb6.append(br2Var.getString(12));
        com.tencent.mars.xlog.Log.i(TAG, sb6.toString());
    }

    public final void g(r45.br2 value, java.lang.String eventName, java.lang.String params) {
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(eventName, "eventName");
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mm.autogen.mmdata.rpt.LiveAudienceCommodityLogStruct liveAudienceCommodityLogStruct = new com.tencent.mm.autogen.mmdata.rpt.LiveAudienceCommodityLogStruct();
        java.lang.String string = value.getString(0);
        if (string == null) {
            string = "";
        }
        liveAudienceCommodityLogStruct.f58562d = liveAudienceCommodityLogStruct.b("LiveID", string, true);
        java.lang.String string2 = value.getString(2);
        if (string2 == null) {
            string2 = "";
        }
        liveAudienceCommodityLogStruct.f58563e = liveAudienceCommodityLogStruct.b("FeedID", string2, true);
        java.lang.String string3 = value.getString(1);
        liveAudienceCommodityLogStruct.f58564f = liveAudienceCommodityLogStruct.b("UserName", string3 != null ? string3 : "", true);
        liveAudienceCommodityLogStruct.f58570l = liveAudienceCommodityLogStruct.b("Event", eventName, true);
        liveAudienceCommodityLogStruct.f58571m = liveAudienceCommodityLogStruct.b("Params", r26.i0.t(params, ",", ";", false), true);
        liveAudienceCommodityLogStruct.k();
        j(liveAudienceCommodityLogStruct);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(android.content.Context r20, java.lang.String r21, long r22, java.lang.String r24, int r25, boolean r26, kotlin.coroutines.Continuation r27) {
        /*
            r19 = this;
            r0 = r27
            boolean r1 = r0 instanceof zl2.w
            if (r1 == 0) goto L17
            r1 = r0
            zl2.w r1 = (zl2.w) r1
            int r2 = r1.f474010h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f474010h = r2
            r2 = r19
            goto L1e
        L17:
            zl2.w r1 = new zl2.w
            r2 = r19
            r1.<init>(r2, r0)
        L1e:
            java.lang.Object r0 = r1.f474008f
            pz5.a r3 = pz5.a.f359186d
            int r4 = r1.f474010h
            r5 = 2
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L4a
            if (r4 == r7) goto L42
            if (r4 != r5) goto L3a
            java.lang.Object r3 = r1.f474007e
            xg2.h r3 = (xg2.h) r3
            java.lang.Object r1 = r1.f474006d
            kotlin.jvm.internal.h0 r1 = (kotlin.jvm.internal.h0) r1
            kotlin.ResultKt.throwOnFailure(r0)
            goto Lb0
        L3a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L42:
            java.lang.Object r4 = r1.f474006d
            kotlin.jvm.internal.h0 r4 = (kotlin.jvm.internal.h0) r4
            kotlin.ResultKt.throwOnFailure(r0)
            goto L8f
        L4a:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.jvm.internal.h0 r0 = new kotlin.jvm.internal.h0
            r0.<init>()
            db2.r1 r4 = new db2.r1
            r10 = 0
            r14 = 0
            if (r24 != 0) goto L5d
            java.lang.String r8 = ""
            r15 = r8
            goto L5f
        L5d:
            r15 = r24
        L5f:
            java.lang.String r16 = ""
            r8 = r4
            r9 = r21
            r12 = r22
            r17 = r25
            r8.<init>(r9, r10, r12, r14, r15, r16, r17)
            if (r26 == 0) goto L7f
            android.content.res.Resources r8 = r20.getResources()
            r9 = 2131768164(0x7f103364, float:1.9167567E38)
            java.lang.String r8 = r8.getString(r9)
            r9 = 500(0x1f4, double:2.47E-321)
            r11 = r20
            r4.t(r11, r8, r9)
        L7f:
            r1.f474006d = r0
            r1.f474010h = r7
            java.lang.Object r4 = xg2.g.d(r4, r6, r1, r7, r6)
            if (r4 != r3) goto L8a
            return r3
        L8a:
            r18 = r4
            r4 = r0
            r0 = r18
        L8f:
            xg2.h r0 = (xg2.h) r0
            boolean r7 = r0 instanceof xg2.i
            if (r7 == 0) goto Lb1
            oz5.l r7 = r0.f454392a
            if (r7 != 0) goto L9d
            oz5.l r7 = r1.getContext()
        L9d:
            zl2.v r8 = new zl2.v
            r8.<init>(r0, r6, r4)
            r1.f474006d = r4
            r1.f474007e = r0
            r1.f474010h = r5
            java.lang.Object r0 = kotlinx.coroutines.l.g(r7, r8, r1)
            if (r0 != r3) goto Laf
            return r3
        Laf:
            r1 = r4
        Lb0:
            r4 = r1
        Lb1:
            java.lang.Object r0 = r4.f310123d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.b0.h(android.content.Context, java.lang.String, long, java.lang.String, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(jx3.a r11) {
        /*
            r10 = this;
            java.lang.String r0 = "report18054 "
            java.lang.String r1 = "struct"
            kotlin.jvm.internal.o.g(r11, r1)
            boolean r1 = r11 instanceof com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct
            java.lang.String r2 = " "
            java.lang.String r3 = "\r\n"
            java.lang.String r4 = "toShowString(...)"
            java.lang.String r5 = "Finder.FinderProductShareUtil"
            r6 = 0
            if (r1 == 0) goto L54
            r1 = r11
            com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct r1 = (com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct) r1
            java.lang.String r7 = r1.f56783k
            r8 = r11
            com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct r8 = (com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct) r8     // Catch: java.lang.Throwable -> L4f
            r9 = r11
            com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct r9 = (com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct) r9     // Catch: java.lang.Throwable -> L4f
            java.lang.String r9 = r9.f56783k     // Catch: java.lang.Throwable -> L4f
            if (r9 == 0) goto L2c
            int r9 = r9.length()     // Catch: java.lang.Throwable -> L4f
            if (r9 != 0) goto L2a
            goto L2c
        L2a:
            r9 = r6
            goto L2d
        L2c:
            r9 = 1
        L2d:
            if (r9 != 0) goto L32
            java.lang.String r9 = "..."
            goto L33
        L32:
            r9 = r7
        L33:
            r8.p(r9)     // Catch: java.lang.Throwable -> L4f
            r8 = r11
            com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct r8 = (com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct) r8     // Catch: java.lang.Throwable -> L4f
            java.lang.String r11 = r11.n()     // Catch: java.lang.Throwable -> L4f
            kotlin.jvm.internal.o.f(r11, r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r11 = r26.i0.t(r11, r3, r2, r6)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r11 = r0.concat(r11)     // Catch: java.lang.Throwable -> L4f
            com.tencent.mars.xlog.Log.i(r5, r11)     // Catch: java.lang.Throwable -> L4f
            r1.p(r7)
            goto L7c
        L4f:
            r11 = move-exception
            r1.p(r7)
            throw r11
        L54:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "report"
            r0.<init>(r1)
            int r1 = r11.g()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            java.lang.String r11 = r11.n()
            kotlin.jvm.internal.o.f(r11, r4)
            java.lang.String r11 = r26.i0.t(r11, r3, r2, r6)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.tencent.mars.xlog.Log.i(r5, r11)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.b0.j(jx3.a):void");
    }
}
