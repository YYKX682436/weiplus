package ya2;

/* loaded from: classes10.dex */
public final class e1 implements zy2.ta {

    /* renamed from: a, reason: collision with root package name */
    public static final ya2.e1 f460472a = new ya2.e1();

    /* renamed from: b, reason: collision with root package name */
    public static android.util.Pair f460473b;

    public static void P(ya2.e1 e1Var, cl0.g gVar, android.content.Context context, zy2.i5 i5Var, zy2.i5 i5Var2, int i17, java.lang.Object obj) {
        e1Var.getClass();
        java.lang.String optString = gVar.optString(dm.i4.COL_USERNAME);
        java.lang.String optString2 = gVar.optString("fromUsername");
        java.lang.String optString3 = gVar.optString("nickname");
        java.lang.String optString4 = gVar.optString("headUrl");
        java.lang.String optString5 = gVar.optString("signature");
        java.lang.String optString6 = gVar.optString("liveContactExtInfo");
        cl0.e f17 = gVar.f("badgeInfo");
        boolean optBoolean = gVar.optBoolean("isDarkMode");
        int optInt = gVar.optInt("liveIdentity", 0);
        java.lang.String optString7 = gVar.optString("liveId", "");
        java.lang.String optString8 = gVar.optString("objectId", "");
        r45.xn1 xn1Var = new r45.xn1();
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
        finderContact.setUsername(optString);
        finderContact.setHeadUrl(optString4);
        finderContact.setSignature(optString5);
        finderContact.setNickname(optString3);
        xn1Var.set(0, finderContact);
        xn1Var.set(7, java.lang.Integer.valueOf(optInt));
        if ((f17 != null ? f17.length() : 0) > 0) {
            cl0.g jSONObject = f17 != null ? f17.getJSONObject(0) : null;
            if (jSONObject != null) {
                java.util.LinkedList list = xn1Var.getList(11);
                r45.yl1 yl1Var = new r45.yl1();
                yl1Var.set(0, java.lang.Integer.valueOf(jSONObject.optInt("badgeType")));
                yl1Var.set(2, java.lang.Integer.valueOf(jSONObject.optInt("badgeLevel")));
                yl1Var.set(4, jSONObject.optString("badgeName"));
                list.add(yl1Var);
            }
        }
        kotlin.jvm.internal.o.d(optString6);
        byte[] bytes = optString6.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        xn1Var.set(9, pm0.b0.h(bytes));
        kotlin.jvm.internal.o.d(optString7);
        kotlin.jvm.internal.o.d(optString8);
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.d(optString2);
        ((com.tencent.mm.feature.finder.live.v4) w0Var).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
        android.app.Activity activity = k17 != null ? (android.app.Activity) k17.get() : null;
        if (activity != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(activity, com.tencent.mm.plugin.finder.feed.ui.FinderHalfJumpEmptyUI.class);
            intent.putExtra("isDarkMode", optBoolean);
            intent.putExtra("liveContact", xn1Var.toByteArray());
            intent.putExtra("fromUsername", optString2);
            intent.putExtra("liveId", optString7);
            intent.putExtra("objectId", optString8);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            android.app.Activity activity2 = activity;
            yj0.a.d(activity2, arrayList.toArray(), "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "openFinderLiveMemberProfileWidget", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;ZLjava/lang/String;Lcom/tencent/mm/feature/finder/live/api/IFinderLiveFeatureService$LiveParam;Lcom/tencent/mm/plugin/findersdk/api/ICallback;Lcom/tencent/mm/plugin/findersdk/api/ICallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity2, "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "openFinderLiveMemberProfileWidget", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;ZLjava/lang/String;Lcom/tencent/mm/feature/finder/live/api/IFinderLiveFeatureService$LiveParam;Lcom/tencent/mm/plugin/findersdk/api/ICallback;Lcom/tencent/mm/plugin/findersdk/api/ICallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public static void Q(ya2.e1 e1Var, cl0.g gVar, android.content.Context context, zy2.i5 i5Var, java.lang.String str, int i17, java.lang.Object obj) {
        e1Var.getClass();
        int optInt = gVar.optInt("requestScene");
        boolean optBoolean = gVar.optBoolean("useDarkStyle");
        int optInt2 = gVar.optInt("selectTabId");
        int optInt3 = gVar.optInt("selectSecondTabId");
        java.lang.String optString = gVar.optString("byPass");
        int optInt4 = gVar.optInt("entryScene");
        java.lang.String optString2 = gVar.optString("feedID");
        java.lang.String optString3 = gVar.optString("nonceID");
        java.lang.String optString4 = gVar.optString("pageTitle");
        kotlin.jvm.internal.o.d(optString);
        kotlin.jvm.internal.o.d(optString2);
        kotlin.jvm.internal.o.d(optString3);
        kotlin.jvm.internal.o.d(optString4);
        e1Var.R(context, optInt, optBoolean, optInt2, optInt3, optString, optInt4, optString2, optString3, optString4);
        if (i5Var != null) {
            i5Var.a(java.lang.Boolean.TRUE);
        }
    }

    public static void T(ya2.e1 e1Var, cl0.g gVar, android.content.Context context, zy2.i5 i5Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.Object obj) {
        java.lang.String str5 = (i17 & 8) != 0 ? "" : str;
        java.lang.String str6 = (i17 & 16) != 0 ? "" : str2;
        java.lang.String str7 = (i17 & 32) != 0 ? "" : str3;
        java.lang.String str8 = (i17 & 64) != 0 ? "" : str4;
        e1Var.getClass();
        java.lang.String optString = gVar.optString("feedID");
        int optInt = gVar.optInt("commentScene");
        java.lang.String optString2 = gVar.optString("reportExtraInfo", "");
        java.lang.String optString3 = gVar.optString(zy2.v.f477592c, "");
        int optInt2 = gVar.optInt("enterTabType");
        int optInt3 = gVar.optInt("isSelfFlag");
        int optInt4 = gVar.optInt("followScene");
        int optInt5 = gVar.optInt("KEY_JSAPI_SOURCE_TYPE");
        java.lang.String optString4 = gVar.optString("sourceBuffer");
        boolean optBoolean = gVar.optBoolean("halfPage");
        java.lang.String str9 = str5;
        com.tencent.mars.xlog.Log.i("FinderRouterApi", "openFinderProfile, lastGMsgId is " + optString3 + ", sourceBuffer is " + optString4);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", str6);
        intent.putExtra("finder_read_feed_id", optString);
        intent.putExtra("key_extra_info", optString2);
        intent.putExtra("report_scene", 18);
        intent.putExtra("key_from_comment_scene", 39);
        intent.putExtra("key_from_follow_scene", optInt4);
        intent.putExtra("KEY_JSAPI_SOURCE_TYPE", optInt5);
        intent.putExtra("KEY_JSAPI_SOURCE_BUFFER", optString4);
        intent.putExtra("key_interaction_action_type", gVar.optInt("profileEnterActionType"));
        if (optInt2 > 0) {
            intent.putExtra("key_enter_profile_tab", optInt2 != 5 ? optInt2 != 6 ? optInt2 != 7 ? 0 : 8 : 7 : 6);
        }
        boolean z17 = true;
        if (optInt3 == 1 && hc2.l.g(str6)) {
            intent.putExtra("KEY_FINDER_SELF_FLAG", true);
        }
        if (str7.length() > 0) {
            intent.putExtra("key_export_username_buffer", str7);
        }
        if (str8.length() > 0) {
            intent.putExtra("key_export_username", str8);
        }
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Cj(intent, optString3, new r45.md5());
        c50.c1 c1Var = (c50.c1) i95.n0.c(c50.c1.class);
        kotlin.jvm.internal.o.d(optString2);
        ml2.r0 r0Var = (ml2.r0) c1Var;
        r0Var.getClass();
        r0Var.H1 = optString2;
        p52.h.f352016a.f(optString2, str6);
        if (optInt > 0) {
            java.lang.String str10 = com.tencent.mm.plugin.finder.report.s0.f125339a;
            if (36 == optInt) {
                if (str10 != null && str10.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    intent.putExtra("key_context_id", str10);
                }
            }
            java.lang.String J2 = e1Var.J(optInt, hc2.l.h(optString2) ? 4 : 2, 32, intent);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str9)) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21140, J2, str9, optString, str6);
            }
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Bi(J2);
        }
        if (optBoolean) {
            pm0.v.X(new ya2.y0(context, intent));
        } else {
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(context, intent);
        }
        if (i5Var != null) {
            i5Var.a(0);
        }
    }

    public static final void h(ya2.e1 e1Var, android.content.Context context, android.content.Intent intent, java.lang.String str) {
        e1Var.getClass();
        com.tencent.mars.xlog.Log.w("FinderRouterApi", "open half profile failed: " + str);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(context, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(ya2.e1 r1, android.content.Context r2, int r3, java.lang.String r4) {
        /*
            r1.getClass()
            r1 = -4036(0xfffffffffffff03c, float:NaN)
            java.lang.String r0 = "getString(...)"
            if (r3 == r1) goto L36
            r1 = -4033(0xfffffffffffff03f, float:NaN)
            if (r3 == r1) goto L25
            r1 = -4011(0xfffffffffffff055, float:NaN)
            if (r3 == r1) goto L14
            java.lang.String r1 = ""
            goto L47
        L14:
            if (r4 != 0) goto L46
            android.content.res.Resources r1 = r2.getResources()
            r3 = 2131762355(0x7f101cb3, float:1.9155785E38)
            java.lang.String r4 = r1.getString(r3)
            kotlin.jvm.internal.o.f(r4, r0)
            goto L46
        L25:
            if (r4 != 0) goto L46
            android.content.res.Resources r1 = r2.getResources()
            r3 = 2131762486(0x7f101d36, float:1.915605E38)
            java.lang.String r4 = r1.getString(r3)
            kotlin.jvm.internal.o.f(r4, r0)
            goto L46
        L36:
            if (r4 != 0) goto L46
            android.content.res.Resources r1 = r2.getResources()
            r3 = 2131767810(0x7f103202, float:1.9166849E38)
            java.lang.String r4 = r1.getString(r3)
            kotlin.jvm.internal.o.f(r4, r0)
        L46:
            r1 = r4
        L47:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L5b
            android.content.res.Resources r1 = r2.getResources()
            r3 = 2131762086(0x7f101ba6, float:1.915524E38)
            java.lang.String r1 = r1.getString(r3)
            kotlin.jvm.internal.o.f(r1, r0)
        L5b:
            r3 = 0
            android.widget.Toast r1 = db5.t7.makeText(r2, r1, r3)
            r1.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ya2.e1.i(ya2.e1, android.content.Context, int, java.lang.String):void");
    }

    public void A(android.content.Context context, android.content.Intent intent, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        z(context, intent, -1, z17);
    }

    public void B(android.content.Context context, java.lang.String json, android.content.Intent intent) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(json, "json");
        try {
            cl0.g gVar = new cl0.g(json);
            long Z = pm0.v.Z(gVar.optString("feedId", "0"));
            cl0.g a17 = gVar.a("extInfo");
            com.tencent.mars.xlog.Log.i("FinderRouterApi", "json = ".concat(json));
            java.lang.String string = a17.getString("feedNonceId");
            int optInt = a17.optInt("reportScene", 11);
            java.lang.String optString = a17.optString("encryptedObjectId", "");
            boolean optBoolean = a17.optBoolean("getRelatedList", false);
            java.lang.String optString2 = a17.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "");
            java.lang.String optString3 = a17.optString("reportExtraInfo", "");
            java.lang.String optString4 = a17.optString("commonExtraInfo", "");
            int optInt2 = a17.optInt("requestScene", 3);
            str = "FinderRouterApi";
            try {
                double optDouble = a17.optDouble("currentTime", 0.0d);
                android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
                intent2.putExtra("report_scene", optInt);
                intent2.putExtra("from_user", c01.z1.r());
                intent2.putExtra("feed_object_id", Z);
                intent2.putExtra("feed_encrypted_object_id", optString);
                intent2.putExtra("feed_object_nonceId", string);
                intent2.putExtra("key_need_related_list", optBoolean);
                intent2.putExtra("key_session_id", optString2);
                intent2.putExtra("key_comment_scene", 39);
                intent2.putExtra("key_reuqest_scene", optInt2);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(optString4)) {
                    intent2.putExtra("key_common_extra_info", optString4);
                }
                long j17 = (long) (optDouble * 1000);
                if (j17 > 0) {
                    intent2.putExtra("KEY_VIDEO_START_PLAY_TIME_MS", j17);
                }
                java.lang.String optString5 = gVar.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, "");
                kotlin.jvm.internal.o.f(optString5, "optString(...)");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
                    intent2.putExtra("key_extra_info", optString3);
                } else if (!android.text.TextUtils.isEmpty(optString5)) {
                    intent2.putExtra("key_extra_info", optString5);
                }
                if (hz2.d.f286313a.b("entrance") != 0) {
                    ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).kl(context);
                    return;
                }
                try {
                    J(zy2.v.a(optInt), 2, 39, intent2);
                    ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).uk(context, intent2, false);
                    w04.l.INSTANCE.b(540999685);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    com.tencent.mars.xlog.Log.printErrStackTrace(str, th, "enterFinderProfileUI exception", new java.lang.Object[0]);
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            str = "FinderRouterApi";
        }
    }

    public void C(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        D(context, intent, false);
    }

    public void D(android.content.Context context, android.content.Intent intent, boolean z17) {
        boolean z18;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.report.v1.f125393a.d();
        com.tencent.mm.plugin.finder.report.q1.f125258d = null;
        com.tencent.mm.plugin.finder.report.q1.f125256b = 0L;
        com.tencent.mm.plugin.finder.report.q1.f125257c = 0L;
        com.tencent.mm.plugin.finder.report.q1.f125259e = false;
        com.tencent.mm.plugin.finder.report.q1.f125261g = true;
        com.tencent.mm.plugin.finder.report.p1 p1Var = new com.tencent.mm.plugin.finder.report.p1();
        p1Var.f125230a = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.finder.report.q1.f125258d = p1Var;
        com.tencent.mm.plugin.finder.report.q1.f125256b = 2L;
        com.tencent.mm.plugin.finder.report.q1.f125257c = 1L;
        p1Var.f125231b = 0L;
        p1Var.f125232c = 0L;
        p1Var.f125233d = 0L;
        p1Var.f125234e = 0L;
        p1Var.f125235f = 0L;
        if (intent != null) {
            if (intent.getBooleanExtra("key_form_sns", false)) {
                java.lang.String stringExtra = intent.getStringExtra("key_context_id");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                z18 = !com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.finder.extension.reddot.ga.e(com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a, stringExtra, 1, 0, null, 12, null));
            } else {
                z18 = false;
            }
            if (z18 | (!com.tencent.mm.sdk.platformtools.t8.K0(intent.getStringExtra("key_red_dot_id")))) {
                com.tencent.mm.plugin.finder.report.v1.f125395c = true;
            }
        }
        pf5.u uVar = pf5.u.f353936a;
        if (z17) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127819m4).getValue()).r()).intValue() == 1) {
                if (intent != null && intent.getBooleanExtra("KEY_ROUTE_TO_TOPIC", false)) {
                    xc2.y2.f453343a.f(intent, ya2.e0.f460471d);
                }
                com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore finderStreamTabPreloadCore = (com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) uVar.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class);
                for (bs2.n1 n1Var : finderStreamTabPreloadCore.f122543e) {
                    int T6 = finderStreamTabPreloadCore.T6();
                    com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore finderStreamTabPreloadCore2 = n1Var.f23908b;
                    ey2.t0 t0Var = (ey2.t0) ((jz5.n) finderStreamTabPreloadCore2.f122545g).getValue();
                    int i17 = n1Var.f23907a;
                    boolean R6 = t0Var.R6(i17);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[performEnterFinderLoad] targetTab=");
                    sb6.append(T6);
                    sb6.append(", cache.resp is null = ");
                    bs2.b0 b0Var = n1Var.f23925s;
                    sb6.append(b0Var.f23806b == null);
                    sb6.append(", isAutoRefresh = ");
                    sb6.append(R6);
                    com.tencent.mars.xlog.Log.i(n1Var.f23909c, sb6.toString());
                    if (i17 == T6 && b0Var.f23806b == null && R6) {
                        ((ey2.t0) ((jz5.n) finderStreamTabPreloadCore2.f122545g).getValue()).X6(0, i17);
                        n1Var.q(bs2.h0.f23851n, intent, new bs2.t0(n1Var));
                    }
                }
            }
        }
        int intExtra = intent != null ? intent.getIntExtra("FROM_SCENE_KEY", 2) : 2;
        if (intExtra == 6) {
            ey2.o0 N6 = ((ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class)).N6(4);
            N6.a(ey2.q0.f257472e);
            N6.f257449i = java.lang.System.currentTimeMillis();
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.ub.L7((c61.ub) c17, context, intent, intExtra, false, 8, null);
        } else {
            i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            c61.ub.L7((c61.ub) c18, context, intent, 0, false, 12, null);
        }
        w04.l.INSTANCE.b(540999684);
    }

    public void E(android.content.Context context, java.lang.String str, zy2.i5 i5Var) {
        java.lang.String str2;
        android.content.Context context2 = context;
        kotlin.jvm.internal.o.g(context2, "context");
        cl0.g a17 = new cl0.g(str).a("extInfo");
        java.lang.String optString = a17.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        int optInt = a17.optInt("topicType");
        java.lang.String optString2 = a17.optString("poiClassifyId");
        double optDouble = a17.optDouble("longitude");
        double optDouble2 = a17.optDouble("latitude");
        java.lang.String optString3 = a17.optString("eventEncryptedTopicId");
        int optInt2 = a17.optInt("entryScene");
        java.lang.String optString4 = a17.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO);
        java.lang.String optString5 = a17.optString("clientKVReportInfo");
        int optInt3 = a17.optInt("KEY_JSAPI_SOURCE_TYPE", 0);
        java.lang.String optString6 = a17.optString("sourceBuffer", "");
        if (optInt == 7) {
            if (android.text.TextUtils.isEmpty(optString3) || i5Var == null) {
                str2 = "";
            } else {
                com.tencent.mm.plugin.finder.assist.l0 l0Var = com.tencent.mm.plugin.finder.assist.l0.f102339b;
                l0Var.getClass();
                java.lang.String uuid = java.util.UUID.randomUUID().toString();
                kotlin.jvm.internal.o.f(uuid, "toString(...)");
                l0Var.f102303a.put(uuid, i5Var);
                str2 = uuid;
            }
            if (!(context2 instanceof android.app.Activity)) {
                context2 = com.tencent.mm.plugin.finder.assist.v1.f102611a.b();
            }
            android.content.Context context3 = context2;
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((com.tencent.mm.plugin.finder.assist.i0) c17).Di(context3, optString3, optString, "", optInt2, optString4, str2, optString5, optInt3, optString6);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_topic_title", optString);
        intent.putExtra("key_topic_type", optInt);
        intent.putExtra("KEY_JSAPI_SOURCE_TYPE", optInt3);
        intent.putExtra("KEY_JSAPI_SOURCE_BUFFER", optString6);
        r45.ze2 ze2Var = new r45.ze2();
        ze2Var.set(5, optString2);
        ze2Var.set(0, java.lang.Float.valueOf((float) optDouble));
        ze2Var.set(1, java.lang.Float.valueOf((float) optDouble2));
        try {
            intent.putExtra("key_topic_poi_location", ze2Var.toByteArray());
        } catch (java.io.IOException unused) {
            com.tencent.mars.xlog.Log.e("FinderRouterApi", "location toByteArray exception");
        }
        if (36 == optInt2) {
            java.lang.String str3 = com.tencent.mm.plugin.finder.report.s0.f125339a;
            if (!(str3 == null || str3.length() == 0)) {
                intent.putExtra("key_context_id", str3);
                intent.putExtra("KEY_IGNORE_REPORT_INIT", true);
            }
        }
        if (Y()) {
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).hl(context2, intent);
        } else {
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).kl(context2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x005f. Please report as an issue. */
    public void F(android.content.Context context, java.lang.String str, zy2.i5 i5Var, yz5.l lVar) {
        int i17;
        java.lang.String str2;
        java.lang.String str3 = "";
        kotlin.jvm.internal.o.g(context, "context");
        try {
            cl0.g gVar = new cl0.g(str);
            cl0.g a17 = gVar.a("extInfo");
            java.lang.String optString = gVar.optString("KShareTraceLastGMsgId", "");
            a17.optInt("KEY_JSAPI_SOURCE_TYPE");
            a17.h(zy2.v.f477592c, optString);
            java.lang.String string = a17.getString("action");
            com.tencent.mars.xlog.Log.i("FinderRouterApi", "json = " + str);
            java.lang.String optString2 = gVar.optString("webUrl");
            java.lang.String str4 = optString2 == null ? "" : optString2;
            try {
                if (string != null) {
                    switch (string.hashCode()) {
                        case -1852273586:
                            i17 = 0;
                            str2 = "FinderRouterApi";
                            if (!string.equals("createFinderLive")) {
                                com.tencent.mars.xlog.Log.i(str2, "unKnow action:" + string);
                            } else {
                                i95.m c17 = i95.n0.c(s40.w0.class);
                                kotlin.jvm.internal.o.f(c17, "getService(...)");
                                java.lang.String gVar2 = a17.toString();
                                kotlin.jvm.internal.o.f(gVar2, "toString(...)");
                                s40.w0.J9((s40.w0) c17, context, gVar2, 0, 4, null);
                            }
                        case -1160307446:
                            i17 = 0;
                            str2 = "FinderRouterApi";
                            if (string.equals("openFinderMultiMoreLive")) {
                                Q(this, a17, context, null, null, 8, null);
                            }
                            com.tencent.mars.xlog.Log.i(str2, "unKnow action:" + string);
                        case -891053138:
                            i17 = 0;
                            str2 = "FinderRouterApi";
                            if (!string.equals("openFinderFansList")) {
                                com.tencent.mars.xlog.Log.i(str2, "unKnow action:" + string);
                            }
                            android.content.Intent intent = new android.content.Intent();
                            a17.optString("finderUserName");
                            int optInt = a17.optInt("commentScene");
                            int optInt2 = a17.optInt("finderFansCount");
                            intent.putExtra("comment_scene", optInt);
                            intent.putExtra("fans_count", optInt2);
                            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).uj(context, intent);
                        case -505354664:
                            i17 = 0;
                            str2 = "FinderRouterApi";
                            if (!string.equals("createLuckyLive")) {
                                com.tencent.mars.xlog.Log.i(str2, "unKnow action:" + string);
                            } else {
                                java.lang.String optString3 = a17.optString("groupId");
                                if (optString3 != null) {
                                    str3 = optString3;
                                }
                                ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ij(context, str3);
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22385, 4, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                            }
                        case -412058418:
                            if (!string.equals("openFinderFeed")) {
                                break;
                            } else {
                                android.content.Context b17 = context instanceof android.app.Activity ? context : com.tencent.mm.plugin.finder.assist.v1.f102611a.b();
                                if (!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Jk()) {
                                    i17 = 0;
                                    str2 = "FinderRouterApi";
                                    zy2.ta.a(this, a17, b17, i5Var, null, false, null, lVar, 56, null);
                                } else {
                                    wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
                                    ya2.f0 f0Var = new ya2.f0(a17, b17, i5Var, lVar);
                                    ((vd0.j2) q1Var).getClass();
                                    v24.o0.h(context, 34359738368L, null, f0Var, 3);
                                    return;
                                }
                            }
                        case 50881657:
                            if (!string.equals(com.tencent.mm.plugin.appbrand.jsapi.finder.h0.NAME)) {
                                break;
                            } else {
                                S(a17, context, null, "");
                                return;
                            }
                        case 218586158:
                            if (!string.equals("openFinderNotifyCenter")) {
                                break;
                            } else {
                                java.lang.String optString4 = a17.optString("finderUserName");
                                android.content.Intent intent2 = new android.content.Intent();
                                ya2.b2 b18 = ya2.h.f460484a.b(optString4);
                                if (!(b18 != null ? b18.G0() : false)) {
                                    com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, context, intent2, 0L, null, 0, 0, false, 0, null, 508, null);
                                    ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).ck(context, intent2);
                                    return;
                                }
                                intent2.setClass(context, com.tencent.mm.plugin.finder.ui.FinderExposeUI.class);
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                arrayList.add(intent2);
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/api/FinderRouterApi", "enterFinderUI", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/plugin/findersdk/api/ICallback;Lkotlin/jvm/functions/Function1;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                context.startActivity((android.content.Intent) arrayList.get(0));
                                yj0.a.f(context, "com/tencent/mm/plugin/finder/api/FinderRouterApi", "enterFinderUI", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/plugin/findersdk/api/ICallback;Lkotlin/jvm/functions/Function1;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                return;
                            }
                        case 519087087:
                            if (!string.equals("openFinderLiveAliasRoleView")) {
                                break;
                            } else {
                                pm0.v.X(ya2.h0.f460486d);
                                return;
                            }
                        case 685848668:
                            if (!string.equals("openFinderLiveHalfOnlineUserProfile")) {
                                break;
                            } else {
                                P(this, a17, context, null, null, 12, null);
                                return;
                            }
                        case 781733111:
                            if (!string.equals("openTingAlbum")) {
                                break;
                            } else {
                                java.lang.String string2 = a17.getString("categoryId");
                                i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                                kotlin.jvm.internal.o.f(c18, "getService(...)");
                                bw5.o50 o50Var = new bw5.o50();
                                o50Var.i(string2);
                                com.tencent.mm.plugin.finder.assist.i0.gl((com.tencent.mm.plugin.finder.assist.i0) c18, context, o50Var, bw5.ar0.TingScene_FinderProfileMusic, false, false, 24, null);
                                return;
                            }
                        case 819909547:
                            if (!string.equals("autoOpenFinderLive")) {
                                break;
                            } else {
                                ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Di(a17, str4, context, null, null);
                                return;
                            }
                        case 1337525401:
                            if (!string.equals("openFinderFansProfile")) {
                                break;
                            } else {
                                pm0.v.X(new ya2.g0(a17));
                                return;
                            }
                        case 1456424243:
                            if (!string.equals("openFinderLiveGiftPacksView")) {
                                break;
                            } else {
                                android.content.Intent intent3 = new android.content.Intent();
                                int optInt3 = a17.optInt("selfRewardLevel", -1);
                                if (optInt3 >= 0) {
                                    intent3.putExtra("KEY_CUR_LEVEL", optInt3);
                                }
                                ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).pj(context, intent3);
                                return;
                            }
                        case 1620495011:
                            if (!string.equals("openFinderReplayInLiveRoom")) {
                                break;
                            } else {
                                W(a17, context);
                                return;
                            }
                    }
                }
                i17 = 0;
                str2 = "FinderRouterApi";
                com.tencent.mars.xlog.Log.i(str2, "unKnow action:" + string);
            } catch (java.lang.Throwable th6) {
                th = th6;
                com.tencent.mars.xlog.Log.printErrStackTrace(str2, th, "enterFinderUI exception", new java.lang.Object[i17]);
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            i17 = 0;
            str2 = "FinderRouterApi";
        }
    }

    public void G(android.content.Context context, boolean z17, java.lang.String str, zy2.i5 i5Var, zy2.i5 i5Var2, zy2.i5 i5Var3) {
        s40.r0 r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        try {
            cl0.g a17 = new cl0.g(str).a("extInfo");
            java.lang.String string = a17.getString("action");
            java.lang.String optString = a17.optString("sourceId", "");
            com.tencent.mars.xlog.Log.i("FinderRouterApi", "enterFinderUIFromMiniApp json = " + str + ", appid:" + optString);
            a17.o("KEY_JSAPI_SOURCE_TYPE", 1);
            if (!kotlin.jvm.internal.o.b(string, "openFinderLive") && !kotlin.jvm.internal.o.b(string, "autoOpenFinderLive") && context.getResources().getConfiguration().orientation != 1 && (r0Var = (s40.r0) i95.n0.c(s40.r0.class)) != null) {
                ((com.tencent.mm.feature.finder.live.m1) r0Var).wi();
            }
            if (string != null) {
                switch (string.hashCode()) {
                    case -1167465866:
                        if (!string.equals("openChannelsRewardedVideoAd")) {
                            break;
                        } else {
                            M(context, a17, i5Var, i5Var2);
                            return;
                        }
                    case -1160307446:
                        if (!string.equals("openFinderMultiMoreLive")) {
                            break;
                        } else {
                            Q(this, a17, context, i5Var, null, 8, null);
                            return;
                        }
                    case -412058418:
                        if (!string.equals("openFinderFeed")) {
                            break;
                        } else if (!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Jk()) {
                            kotlin.jvm.internal.o.d(optString);
                            zy2.ta.a(this, a17, context, i5Var, optString, true, i5Var3, null, 64, null);
                            return;
                        } else {
                            wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
                            ya2.i0 i0Var = new ya2.i0(a17, context, i5Var, optString, i5Var3);
                            ((vd0.j2) q1Var).getClass();
                            v24.o0.h(context, 34359738368L, null, i0Var, 3);
                            return;
                        }
                    case -411875300:
                        if (!string.equals("openFinderLive")) {
                            break;
                        } else {
                            ya2.j0 j0Var = new ya2.j0(i5Var2);
                            ya2.k0 k0Var = new ya2.k0(i5Var);
                            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
                            kotlin.jvm.internal.o.d(optString);
                            ((com.tencent.mm.feature.finder.live.v4) w0Var).xk(a17, z17, j0Var, k0Var, optString);
                            return;
                        }
                    case 50881657:
                        if (!string.equals(com.tencent.mm.plugin.appbrand.jsapi.finder.h0.NAME)) {
                            break;
                        } else {
                            kotlin.jvm.internal.o.d(optString);
                            S(a17, context, i5Var, optString);
                            return;
                        }
                    case 819909547:
                        if (!string.equals("autoOpenFinderLive")) {
                            break;
                        } else {
                            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Di(a17, "", context, i5Var, i5Var2);
                            return;
                        }
                    case 1303658160:
                        if (!string.equals(com.tencent.mm.plugin.appbrand.jsapi.channels.z.NAME)) {
                            break;
                        } else {
                            V(a17, context, i5Var, i5Var2);
                            return;
                        }
                    case 1950532136:
                        if (!string.equals(com.tencent.mm.plugin.appbrand.jsapi.channels.g0.NAME)) {
                            break;
                        } else {
                            U(a17, context, i5Var, i5Var2);
                            return;
                        }
                }
            }
            com.tencent.mars.xlog.Log.i("FinderRouterApi", "unKnow action:" + string);
            if (i5Var2 != null) {
                i5Var2.a(-1000);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FinderRouterApi", th6, "enterFinderUI exception", new java.lang.Object[0]);
            if (i5Var2 != null) {
                i5Var2.a(java.lang.Integer.valueOf(com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMTYPEERROR));
            }
        }
    }

    public void H(android.app.Activity context, java.lang.String myFinderUsername, r45.lk2 prepareResp) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(myFinderUsername, "myFinderUsername");
        kotlin.jvm.internal.o.g(prepareResp, "prepareResp");
        if (hz2.d.f286313a.a("post")) {
            return;
        }
        com.tencent.mm.plugin.finder.report.p2.f125237a.D(context, false, 110);
        if (!com.tencent.mm.plugin.finder.assist.w5.f102652d.d(context, prepareResp, new ya2.l0(context, myFinderUsername, prepareResp))) {
            com.tencent.mars.xlog.Log.i("FinderRouterApi", "preCheck interrupt");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
        intent.putExtra("KEY_POST_ENTERSCENE", 110);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Cj(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(13, 53, 386), intent);
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).Ri(context, new qs2.e(3, 110, 0), intent);
    }

    public void I(android.content.Context context, int i17, long j17, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        if (!(context instanceof android.app.Activity)) {
            context = com.tencent.mm.plugin.finder.assist.v1.f102611a.b();
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        com.tencent.mars.xlog.Log.i("FinderRouterApi", "OpenFinderTemplateViewTask context:" + context);
        intent.putExtra("key_activity_id", j17);
        intent.putExtra("key_entrance_source_type", i17);
        com.tencent.mars.xlog.Log.i("FinderRouterApi", "JsEnterTemplateCollectionUI :" + j17 + " sourceType:" + i17);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).fl(context, intent);
    }

    public final java.lang.String J(int i17, int i18, int i19, android.content.Intent intent) {
        return ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(i17, i18, i19, intent);
    }

    public void K(android.content.Context context, java.lang.String appId, java.lang.String page, java.lang.String query, java.lang.String defaultUrl) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(page, "page");
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(defaultUrl, "defaultUrl");
        xc2.y2 y2Var = xc2.y2.f453343a;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
        r45.k74 k74Var = new r45.k74();
        k74Var.set(0, appId);
        k74Var.set(2, query);
        k74Var.set(1, page);
        k74Var.set(3, defaultUrl);
        finderJumpInfo.setLite_app_info(k74Var);
        xc2.y2.L(y2Var, context, new xc2.p0(finderJumpInfo), null, null, null, 28, null);
    }

    public boolean L(android.content.Context context, android.os.Bundle bundle, boolean z17, yz5.l lVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bundle, "bundle");
        java.lang.String string = bundle.getString("appId");
        com.tencent.mars.xlog.Log.i("FinderRouterApi", "lite_app appId: " + string);
        boolean z18 = true;
        if ((string == null || string.length() == 0) || (z17 && !((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Jj(string))) {
            z18 = false;
        }
        if (z18) {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(context, bundle, true, false, new ya2.o0(lVar));
        }
        return z18;
    }

    public void M(android.content.Context context, org.json.JSONObject extInfo, zy2.i5 i5Var, zy2.i5 i5Var2) {
        java.lang.String jSONObject;
        java.lang.String jSONObject2;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        java.lang.String optString = extInfo.optString("feedId");
        java.lang.String optString2 = extInfo.optString("nonceId");
        int optInt = extInfo.optInt("shareScene", 0);
        java.lang.String optString3 = extInfo.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "");
        java.lang.String optString4 = extInfo.optString("reportExtraInfo", "");
        int optInt2 = extInfo.optInt("entryScene", 0);
        int optInt3 = extInfo.optInt("adJSAPIType", 0);
        java.lang.String optString5 = extInfo.optString("userName", "");
        zu2.p.f475730a = i5Var;
        int b17 = hz2.d.f286313a.b("entrance");
        if (b17 != 0) {
            if (i5Var2 != null) {
                i5Var2.a(java.lang.Integer.valueOf(com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PLATFORMVIEWNOTFOUND));
            }
            com.tencent.mars.xlog.Log.i("FinderRouterApi", "[openChannelsRewardedVideoAd] spamAction:" + b17 + ' ');
            return;
        }
        int a17 = zy2.v.a(optInt);
        if (a17 != -1) {
            optInt2 = a17;
        } else if (optInt2 == 0) {
            optInt2 = 15;
        }
        int i17 = hc2.l.h(optString4) ? 4 : 2;
        if (optInt3 == 1) {
            p52.h.f352016a.f(optString4, optString5);
            android.content.Intent intent = new android.content.Intent();
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(optInt2, i17, 104, intent);
            i95.m c17 = i95.n0.c(fe0.l4.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doJumpFinderFeedsDetailUI", "com.tencent.mm.feature.sns.SnsFinderService");
            l44.s4.g(intent, context, optString5, optString2, optString, optString4, -1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpFinderFeedsDetailUI", "com.tencent.mm.feature.sns.SnsFinderService");
            return;
        }
        r45.i33 i33Var = new r45.i33();
        i33Var.set(0, optString);
        i33Var.set(1, optString2);
        i33Var.set(2, extInfo.optString("finderUserName"));
        i33Var.set(3, extInfo.optString("expReportLink"));
        i33Var.set(4, extInfo.optString("clkReportLink"));
        org.json.JSONObject optJSONObject = extInfo.optJSONObject("reportInfo");
        if (optJSONObject == null || (jSONObject = optJSONObject.toString()) == null) {
            jSONObject = new org.json.JSONObject().toString();
        }
        i33Var.set(5, jSONObject);
        org.json.JSONObject optJSONObject2 = extInfo.optJSONObject("clickPosMap");
        if (optJSONObject2 == null || (jSONObject2 = optJSONObject2.toString()) == null) {
            jSONObject2 = new org.json.JSONObject().toString();
        }
        i33Var.set(6, jSONObject2);
        i33Var.set(7, extInfo.optString("feedbackUrl"));
        i33Var.set(9, extInfo.optString("marketingWord", ""));
        i33Var.set(10, java.lang.Integer.valueOf(extInfo.optInt("rewardTime", 15)));
        com.tencent.mars.xlog.Log.i("FinderRouterApi", "adFlowInfo feedId:" + optString + ", nonceId:" + i33Var.getString(1) + ", finderUserName:" + i33Var.getString(2));
        com.tencent.mars.xlog.Log.i("FinderRouterApi", "adFlowInfo expReportLink:" + i33Var.getString(3) + ", clkReportLink:" + i33Var.getString(4) + ", reportInfo:" + i33Var.getString(5));
        com.tencent.mars.xlog.Log.i("FinderRouterApi", "adFlowInfo clickPosMap:" + i33Var.getString(6) + ", feedbackUrl:" + i33Var.getString(7) + " marketingWord:" + i33Var.getString(9));
        p52.h.f352016a.f(optString4, i33Var.getString(2));
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("KEY_MINI_APP_AD_FLOW_INFO", i33Var.toByteArray());
        intent2.putExtra("from_user", c01.z1.r());
        intent2.putExtra("feed_encrypted_object_id", optString);
        intent2.putExtra("feed_object_nonceId", optString2);
        intent2.putExtra("key_need_related_list", true);
        intent2.putExtra("key_comment_scene", 104);
        intent2.putExtra("key_reuqest_scene", 23);
        intent2.putExtra("key_session_id", optString3);
        intent2.putExtra("key_extra_info", optString4);
        intent2.putExtra("is_from_ad", true);
        intent2.putExtra("key_disable_personal_center_and_search", true);
        java.lang.String Bj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(optInt2, i17, 104, intent2);
        if (!com.tencent.mm.sdk.platformtools.t8.K0("")) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21140, Bj, "", optString, "");
        }
        intent2.putExtra("report_scene", optInt);
        intent2.putExtra("tab_type", 9);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).uk(context, intent2, false);
        w04.l.INSTANCE.b(540999685);
    }

    public void N(android.content.Context context, android.content.Intent intent, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        long longExtra = intent.getLongExtra("feed_object_id", 0L);
        long longExtra2 = intent.getLongExtra("feed_object_nonceId", 0L);
        int intExtra = intent.getIntExtra("key_reuqest_scene", 35);
        com.tencent.mars.xlog.Log.i("FinderRouterApi", "openFinderFeedFromTing: objectId=" + longExtra + ", nonceId=" + longExtra2 + ", requestScene=" + intExtra);
        intent.putExtra("feed_object_id", longExtra);
        intent.putExtra("feed_object_nonceId", longExtra2);
        intent.putExtra("report_scene", 19);
        intent.putExtra("tab_type", 302);
        intent.putExtra("key_reuqest_scene", intExtra);
        if (!z17) {
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).uk(context, intent, false);
            return;
        }
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).getClass();
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderHalfScreenUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderHalfScreenUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void O(int i17, int i18, int i19, android.content.Context context, android.content.Intent intent, android.view.View view, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        if (!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Jk()) {
            X(i17, i18, i19, context, intent, view, z17);
            return;
        }
        wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
        ya2.v0 v0Var = new ya2.v0(i17, i18, i19, context, intent, view, z17);
        ((vd0.j2) q1Var).getClass();
        v24.o0.h(context, 34359738368L, null, v0Var, 3);
    }

    public final void R(android.content.Context context, int i17, boolean z17, int i18, int i19, java.lang.String str, int i27, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        int i28;
        java.lang.String str5;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_request_scene", i17);
        intent.putExtra("key_use_dark_style", z17 ? 1 : 0);
        intent.putExtra("key_select_tab_id", i18);
        intent.putExtra("key_select_second_tab_id", i19);
        intent.putExtra("key_by_pass", str);
        intent.putExtra("key_feed_export_id", str2);
        intent.putExtra("key_feed_nonce_id", str3);
        intent.putExtra("key_page_title", str4);
        intent.putExtra("nearby_live_target_auto_refresh_params_key", true);
        intent.putExtra("nearby_live_all_auto_refresh_params_key", true);
        if (i17 != 1) {
            i28 = 9500002;
            if (i17 != 2 && i17 != 3) {
                if (i17 == 4) {
                    i28 = 9500004;
                } else if (i17 == 5) {
                    i28 = 9500003;
                }
            }
        } else {
            i28 = 9500001;
        }
        if (i17 != 1) {
            str5 = "9002";
            if (i17 != 2 && i17 != 3) {
                if (i17 == 4) {
                    str5 = "9004";
                } else if (i17 == 5) {
                    str5 = "9003";
                }
            }
        } else {
            str5 = "9001";
        }
        intent.putExtra("key_from_comment_scene", i28);
        intent.putExtra("key_click_tab_id", str5);
        J(i27, 2, i28, intent);
        ((v40.s) ((uc.n) i95.n0.c(uc.n.class))).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.tencent.mm.plugin.finder.feed.ui.FinderLiveOperationUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterFinderLiveOperationUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterFinderLiveOperationUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void S(cl0.g gVar, android.content.Context context, zy2.i5 i5Var, java.lang.String str) {
        java.lang.String optString = gVar.optString("finderUserName", "");
        java.lang.String optString2 = gVar.optString("exportUsername", "");
        kotlin.jvm.internal.o.d(optString);
        if (optString.length() > 0) {
            T(this, gVar, context, i5Var, str, optString, null, null, 96, null);
            return;
        }
        kotlin.jvm.internal.o.d(optString2);
        if (optString2.length() > 0) {
            boolean z17 = gVar.optInt("profileEnterActionType") == 1;
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Wf).getValue()).r()).booleanValue() || z17) {
                new db2.u1(kz5.p0.f313996d, optString2).l().K(new ya2.w0(gVar, context, i5Var, str));
            } else {
                T(this, gVar, context, i5Var, str, null, null, optString2, 48, null);
            }
        }
    }

    public final void U(cl0.g extInfo, android.content.Context context, zy2.i5 i5Var, zy2.i5 i5Var2) {
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            com.tencent.mars.xlog.Log.i("FinderRouterApi", "[openRedPacketEditPage] exit in teen mode");
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
            return;
        }
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        kotlin.jvm.internal.o.g(context, "context");
        int optInt = extInfo.optInt("durationMinLimit");
        int optInt2 = extInfo.optInt("durationMaxLimit");
        java.lang.String optString = extInfo.optString("encryptedID");
        java.lang.String optString2 = extInfo.optString("nonceID");
        qd2.d0.f361717d = i5Var;
        qd2.d0.f361718e = i5Var2;
        kotlin.jvm.internal.o.d(optString2);
        kotlin.jvm.internal.o.d(optString);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = qd2.d0.f361716c;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f490468vx);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, "", string, true, true, new qd2.c0(context));
        qd2.d0.f361716c = Q;
        if (Q != null) {
            Q.show();
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        new db2.g4(0L, optString2, 0, 0, "", true, null, null, 0L, null, false, false, optString, nyVar != null ? nyVar.V6() : null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536858560, null).l().K(new qd2.b0(context, optInt, optInt2));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0146 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(cl0.g r17, android.content.Context r18, zy2.i5 r19, zy2.i5 r20) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ya2.e1.V(cl0.g, android.content.Context, zy2.i5, zy2.i5):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(cl0.g r21, android.content.Context r22) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ya2.e1.W(cl0.g, android.content.Context):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0189, code lost:
    
        if (r6.l().G(new ya2.a1(r56, r55)) == null) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X(int r52, int r53, int r54, android.content.Context r55, android.content.Intent r56, android.view.View r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ya2.e1.X(int, int, int, android.content.Context, android.content.Intent, android.view.View, boolean):void");
    }

    public final boolean Y() {
        return ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el();
    }

    public final void j(android.content.Context context, com.tencent.mm.ui.widget.dialog.k0 k0Var, db5.g4 g4Var, int i17, java.lang.CharSequence charSequence, java.lang.String str) {
        g4Var.q(i17, charSequence, context.getResources().getString(com.tencent.mm.R.string.nig), 0, 0);
        k0Var.F = new ya2.s(context, str);
        k0Var.G = new ya2.t(charSequence, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0104 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k(android.content.Context r16, java.lang.String r17, com.tencent.mm.ui.widget.dialog.k0 r18, db5.g4 r19, int r20) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ya2.e1.k(android.content.Context, java.lang.String, com.tencent.mm.ui.widget.dialog.k0, db5.g4, int):boolean");
    }

    public void l(android.content.Context context, java.lang.String username, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mars.xlog.Log.i("FinderRouterApi", "enterChatting anchorUsername=" + username + ", sourceType = " + i17);
        i95.m c17 = i95.n0.c(c61.ub.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.ub.c7((c61.ub) c17, context, username, 1, null, java.lang.Integer.valueOf(i17), null, null, null, 224, null);
    }

    public void m(android.content.Context context, android.content.Intent intent, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        if (!Y()) {
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).kl(context);
            return;
        }
        s92.g.f405006a.a(context, intent, c01.id.c(), i17);
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((com.tencent.mm.plugin.finder.assist.i0) c17).Bi(context, intent, false);
    }

    public void n(android.content.Context context, r45.ev2 collection, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(collection, "collection");
        android.content.Intent intent = new android.content.Intent();
        r45.vx0 vx0Var = new r45.vx0();
        vx0Var.set(0, java.lang.Long.valueOf(collection.getLong(0)));
        vx0Var.set(1, collection.getString(1));
        vx0Var.set(2, collection.getString(2));
        vx0Var.set(3, collection.getString(3));
        vx0Var.set(4, java.lang.Integer.valueOf(collection.getInteger(4)));
        vx0Var.set(21, java.lang.Integer.valueOf(collection.getInteger(5)));
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        com.tencent.mars.xlog.Log.i("FinderRouterApi", "enterFinderCollectionUI %s", pm0.v.u(collection.getLong(0)));
        intent.putExtra("collection_info", vx0Var.toByteArray());
        intent.putExtra("collection_author_username", collection.getString(8));
        intent.putExtra("collection_nickname", collection.getString(9));
        intent.putExtra("collection_avatar_url", collection.getString(10));
        intent.putExtra("collection_authicon_url", collection.getString(11));
        intent.putExtra("collection_authicon_type", collection.getInteger(12));
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        intent.putExtra("collection_ref_comment_scene", collection.getInteger(13) != 0 ? collection.getInteger(13) : V6 != null ? V6.getInteger(5) : 0);
        intent.setClass(context, com.tencent.mm.plugin.finder.feed.ui.FinderCollectionUI.class);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(i17, 2, yc1.a0.CTRL_INDEX, intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/api/FinderRouterApi", "enterFinderCollectionUI", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderShareCollection;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/api/FinderRouterApi", "enterFinderCollectionUI", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderShareCollection;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void o(android.content.Context context, r45.lu2 hotWord, int i17, java.util.List list, int i18, java.lang.String reportInfo) {
        android.app.Activity Ui;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(hotWord, "hotWord");
        kotlin.jvm.internal.o.g(reportInfo, "reportInfo");
        if (!(context instanceof android.app.Activity) && (Ui = ((com.tencent.mm.plugin.finder.service.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Ui()) != null) {
            context = Ui;
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String string = hotWord.getString(0);
        if (string == null) {
            string = "";
        }
        intent.putExtra("key_search_query", string);
        com.tencent.mm.protobuf.g byteString = hotWord.getByteString(4);
        intent.putExtra("key_search_session_buffer", byteString != null ? byteString.g() : null);
        intent.putExtra("key_search_hot_word_info", com.tencent.mm.plugin.finder.search.data.SearchHotWordListParcelable.CREATOR.a(hotWord, i17, list));
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).wj(context, null, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(android.content.Context r22, java.lang.String r23, boolean r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ya2.e1.p(android.content.Context, java.lang.String, boolean, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[Catch: Exception -> 0x0202, TRY_LEAVE, TryCatch #0 {Exception -> 0x0202, blocks: (B:3:0x0013, B:5:0x002c, B:7:0x003a, B:10:0x004a, B:12:0x0053, B:18:0x0062, B:22:0x0075, B:23:0x0079, B:25:0x008b, B:28:0x0095, B:30:0x00d4, B:31:0x00da, B:34:0x00fb, B:38:0x012e, B:41:0x0153, B:44:0x015d, B:48:0x01c9, B:51:0x01e9, B:54:0x01fc), top: B:2:0x0013, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(android.content.Context r17, java.lang.String r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ya2.e1.q(android.content.Context, java.lang.String, boolean):void");
    }

    public void r(android.content.Context context, java.lang.String str) {
        android.content.Context context2 = context;
        kotlin.jvm.internal.o.g(context2, "context");
        r45.f03 I0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0("FinderLiveIncomeEntrance");
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("FinderLiveIncomeEntrance");
        if (I0 != null && L0 != null) {
            com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.x2.i(x2Var, "4", L0, I0, 2, nyVar != null ? nyVar.V6() : null, 0, null, 0, 0, 480, null);
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("FinderLiveIncomeEntrance");
        if (!(context2 instanceof android.app.Activity)) {
            context2 = com.tencent.mm.plugin.finder.assist.v1.f102611a.b();
        }
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3.Kj((com.tencent.mm.plugin.finder.report.o3) c17, context2, 0L, false, 2L, 9L, false, 0L, null, null, 384, null);
        db2.x0 x0Var = new db2.x0(xy2.c.e(context2));
        az2.j.u(x0Var, context2, null, 0L, 6, null);
        pm0.v.T(x0Var.l(), new ya2.m0(context2));
    }

    public void s(android.content.Context context, java.lang.String noticeId, java.lang.String username) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(noticeId, "noticeId");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) h0Var2.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        h0Var2.f310123d = com.tencent.mm.ui.widget.dialog.u3.f(context, context.getString(com.tencent.mm.R.string.f490604zq), true, 3, new ya2.x(h0Var));
        db2.b1 b1Var = new db2.b1(noticeId, null, username, 0, null, null, null, null, 0, null, null, 2042, null);
        b1Var.l().K(new ya2.w(noticeId, username, context, h0Var2));
        h0Var.f310123d = b1Var;
    }

    public void t(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).getClass();
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.H7).getValue()).r()).intValue() != 1) {
            boolean z17 = context instanceof android.app.Activity;
            android.content.Intent intent3 = !z17 ? intent2 : null;
            if (intent3 != null) {
                intent3.addFlags(268435456);
            }
            intent2.setClass(context, ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.V2).getValue()).r()).intValue() == 1 ? com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoNewFormUI.class : ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.W2).getValue()).r()).intValue() == 1 ? com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI.class : com.tencent.mm.plugin.finder.feed.ui.FinderNewStyleTimelineUI.class);
            if (intent2.getBooleanExtra("key_enter_content_by_red_dot", false) && z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(16);
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.k((android.app.Activity) context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLongVideoShareUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLongVideoShareUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLongVideoShareUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        java.lang.String stringExtra = intent2.getStringExtra("key_context_id");
        java.lang.String stringExtra2 = intent2.getStringExtra("from_user");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        java.lang.String stringExtra3 = intent2.getStringExtra("key_session_id");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        long longExtra = intent2.getLongExtra("feed_object_id", 0L);
        java.lang.String stringExtra4 = intent2.getStringExtra("feed_encrypted_object_id");
        java.lang.String str = stringExtra4 != null ? stringExtra4 : "";
        java.lang.String stringExtra5 = intent2.getStringExtra("feed_object_nonceId");
        int intExtra = intent2.getIntExtra("key_comment_scene", 162);
        int intExtra2 = intent2.getIntExtra("key_reuqest_scene", 31);
        java.lang.String stringExtra6 = intent2.getStringExtra("key_firstFeedSessionBuffer");
        long longExtra2 = intent2.getLongExtra("KEY_VIDEO_START_PLAY_TIME_MS", 0L);
        int i17 = qg3.g1.f362820d;
        java.lang.String UR_BC6E = urgen.ur_54A4.UR_6075.UR_BC6E();
        java.lang.String u17 = pm0.v.u(longExtra);
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoJumpRouter", "jumpPlayerDetailUI contextId=" + stringExtra + ", feedId=" + u17 + ", encryptedObjectId=" + str + ", nonceId=" + stringExtra5 + ", commentScene=" + intExtra + ", fromUserName=" + stringExtra2 + "，requestScene=" + intExtra2);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        android.os.Bundle extras = intent2.getExtras();
        if (extras == null) {
            extras = new android.os.Bundle();
        }
        h0Var.f310123d = extras;
        bw5.id0 id0Var = new bw5.id0();
        id0Var.f(UR_BC6E);
        id0Var.g((int) longExtra2);
        id0Var.d(intExtra);
        id0Var.f28543h = intExtra2;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        android.util.ArrayMap arrayMap = id0Var.f28558z;
        arrayMap.put(50, bool);
        id0Var.f28544i = stringExtra3;
        arrayMap.put(51, bool);
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(longExtra);
        if (h17 != null && h17.isUrlValid()) {
            bw5.zc0 zc0Var = new bw5.zc0();
            zc0Var.d(new bw5.yr().parseFrom(h17.getFeedObject().toByteArray()));
            id0Var.e(zc0Var);
        } else {
            bw5.ad0 ad0Var = new bw5.ad0();
            ad0Var.f25138d = u17;
            boolean[] zArr = ad0Var.f25142h;
            zArr[1] = true;
            ad0Var.f25139e = stringExtra5;
            zArr[2] = true;
            ad0Var.f25141g = str;
            zArr[4] = true;
            ad0Var.f25140f = stringExtra6;
            zArr[3] = true;
            id0Var.f28548p = ad0Var;
            arrayMap.put(102, bool);
        }
        byte[] byteArray = id0Var.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        linkedHashMap.put("open_params", byteArray);
        d75.b.g(new c03.j(context, linkedHashMap, h0Var, h17, stringExtra));
    }

    public void u(android.content.Context context, r45.ev2 collection, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(collection, "collection");
        r45.do2 do2Var = new r45.do2();
        do2Var.set(2, java.lang.Integer.valueOf(collection.getInteger(6)));
        if (collection.getInteger(6) == 1) {
            r45.uz0 uz0Var = new r45.uz0();
            uz0Var.set(0, java.lang.Long.valueOf(collection.getLong(0)));
            uz0Var.set(1, collection.getString(1));
            uz0Var.set(2, collection.getString(2));
            uz0Var.set(3, collection.getString(3));
            uz0Var.set(4, java.lang.Integer.valueOf(collection.getInteger(4)));
            uz0Var.set(10, java.lang.Integer.valueOf(collection.getInteger(7)));
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
            finderContact.setUsername(collection.getString(8));
            uz0Var.set(11, finderContact);
            do2Var.set(0, uz0Var);
        } else {
            r45.n11 n11Var = new r45.n11();
            n11Var.set(0, java.lang.Long.valueOf(collection.getLong(0)));
            n11Var.set(1, collection.getString(1));
            n11Var.set(2, collection.getString(2));
            n11Var.set(3, collection.getString(3));
            n11Var.set(4, java.lang.Integer.valueOf(collection.getInteger(4)));
            n11Var.set(10, java.lang.Integer.valueOf(collection.getInteger(7)));
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = new com.tencent.mm.protocal.protobuf.FinderContact();
            finderContact2.setUsername(collection.getString(8));
            n11Var.set(11, finderContact2);
            do2Var.set(1, n11Var);
        }
        nr2.m mVar = new nr2.m(do2Var);
        android.content.Intent intent = new android.content.Intent();
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        com.tencent.mars.xlog.Log.i("FinderRouterApi", "enterFinderPayCourseUI %s", pm0.v.u(mVar.l()));
        intent.putExtra("paid_collection_topic_id", mVar.l());
        intent.putExtra("paid_collection_info", mVar.f339268d.toByteArray());
        intent.putExtra("paid_collection_username", collection.getString(8));
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        intent.putExtra("collection_ref_comment_scene", collection.getInteger(13) != 0 ? collection.getInteger(13) : V6 != null ? V6.getInteger(5) : 0);
        intent.setClass(context, com.tencent.mm.plugin.finder.feed.ui.FinderPaidCollectionUI.class);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(i17, 2, 344, intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/api/FinderRouterApi", "enterFinderPaidCollectionUI", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderShareCollection;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/api/FinderRouterApi", "enterFinderPaidCollectionUI", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderShareCollection;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01c9 A[Catch: all -> 0x02a4, TRY_ENTER, TryCatch #0 {all -> 0x02a4, blocks: (B:13:0x01c9, B:16:0x01d5, B:18:0x0286, B:19:0x028c, B:69:0x029d), top: B:11:0x01c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02cc A[Catch: all -> 0x036e, TryCatch #3 {all -> 0x036e, blocks: (B:24:0x02b0, B:26:0x02cc, B:27:0x02fe, B:29:0x030b, B:30:0x0311, B:32:0x0332, B:34:0x034b, B:35:0x0353, B:37:0x0358, B:38:0x035e), top: B:23:0x02b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x030b A[Catch: all -> 0x036e, TryCatch #3 {all -> 0x036e, blocks: (B:24:0x02b0, B:26:0x02cc, B:27:0x02fe, B:29:0x030b, B:30:0x0311, B:32:0x0332, B:34:0x034b, B:35:0x0353, B:37:0x0358, B:38:0x035e), top: B:23:0x02b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0332 A[Catch: all -> 0x036e, TryCatch #3 {all -> 0x036e, blocks: (B:24:0x02b0, B:26:0x02cc, B:27:0x02fe, B:29:0x030b, B:30:0x0311, B:32:0x0332, B:34:0x034b, B:35:0x0353, B:37:0x0358, B:38:0x035e), top: B:23:0x02b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x029d A[Catch: all -> 0x02a4, TRY_LEAVE, TryCatch #0 {all -> 0x02a4, blocks: (B:13:0x01c9, B:16:0x01d5, B:18:0x0286, B:19:0x028c, B:69:0x029d), top: B:11:0x01c7 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(android.content.Context r22, java.lang.String r23, int r24, zy2.s9 r25) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ya2.e1.v(android.content.Context, java.lang.String, int, zy2.s9):void");
    }

    public void w(android.content.Context context, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String stringExtra;
        int i17;
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String stringExtra2 = intent != null ? intent.getStringExtra("key_extra_info") : null;
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("key_is_in_finder", false) : false;
        int intExtra = intent != null ? intent.getIntExtra("key_entry_type", 0) : 0;
        if (booleanExtra && intExtra == 6) {
            java.lang.String Yj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Yj();
            if (!(Yj == null || Yj.length() == 0) && intent != null) {
                intent.putExtra("key_context_id", Yj);
            }
        }
        c50.c1 c1Var = (c50.c1) i95.n0.c(c50.c1.class);
        java.lang.String str3 = "";
        java.lang.String str4 = stringExtra2 == null ? "" : stringExtra2;
        ml2.r0 r0Var = (ml2.r0) c1Var;
        r0Var.getClass();
        r0Var.H1 = str4;
        java.lang.String stringExtra3 = intent != null ? intent.getStringExtra("key_biz_username") : null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3) && !kotlin.jvm.internal.o.b("null", stringExtra3)) {
            android.content.Intent intent2 = new android.content.Intent();
            if (!(context instanceof android.app.Activity)) {
                intent2.addFlags(268435456);
            }
            intent2.putExtra("Contact_User", stringExtra3);
            intent2.putExtra("Contact_Scene", 213);
            intent2.putExtra("biz_profile_enter_from_finder", true);
            intent2.putExtra("force_get_contact", true);
            intent2.putExtra("key_use_new_contact_profile", true);
            intent2.putExtra("biz_profile_tab_type", 1);
            j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent2, null);
            return;
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        jz5.g gVar = com.tencent.mm.plugin.finder.storage.t70.X0;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) gVar).getValue()).r()).booleanValue()) {
            if (intent == null) {
                com.tencent.mars.xlog.Log.i("FinderProfileUtils", "initRefCommentScene: intent is null, skip");
            } else {
                int intExtra2 = intent.getIntExtra("key_from_comment_scene", 0);
                if (intExtra2 != 0) {
                    com.tencent.mars.xlog.Log.i("FinderProfileUtils", "initRefCommentScene: already set=" + intExtra2 + ", skip");
                } else {
                    int intExtra3 = intent.getIntExtra("key_enter_profile_type", -1);
                    int i18 = 23;
                    if (intExtra3 != 1) {
                        if (intExtra3 == 4) {
                            i18 = 11;
                        } else if (intExtra3 == 8) {
                            i18 = 37;
                        } else if (intExtra3 != 63) {
                            if (intExtra3 != 12) {
                                if (intExtra3 == 13) {
                                    i18 = 33;
                                } else if (intExtra3 != 23 && intExtra3 != 24) {
                                    com.tencent.mars.xlog.Log.i("FinderProfileUtils", "initRefCommentScene: unhandled enterProfileType=" + intExtra3 + ", skip");
                                }
                            }
                            i18 = 120;
                        } else {
                            i18 = 386;
                        }
                    }
                    com.tencent.mars.xlog.Log.i("FinderProfileUtils", "initRefCommentScene: enterProfileType=" + intExtra3 + " -> refCommentScene=" + i18);
                    intent.putExtra("key_from_comment_scene", i18);
                }
            }
        }
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) gVar).getValue()).r()).booleanValue()) {
            if (intent == null) {
                com.tencent.mars.xlog.Log.i("FinderProfileUtils", "initEnterScene: intent is null, skip");
            } else {
                int intExtra4 = intent.getIntExtra("key_enter_scene", 0);
                if (intExtra4 != 0) {
                    com.tencent.mars.xlog.Log.i("FinderProfileUtils", "initEnterScene: already set=" + intExtra4 + ", skip");
                } else {
                    int intExtra5 = intent.getIntExtra("key_enter_profile_type", -1);
                    if (intExtra5 == 1) {
                        i17 = 6;
                    } else if (intExtra5 != 4) {
                        int i19 = 52;
                        if (intExtra5 != 52) {
                            if (intExtra5 != 63) {
                                if (intExtra5 != 12) {
                                    i19 = 13;
                                    if (intExtra5 != 13) {
                                        com.tencent.mars.xlog.Log.i("FinderProfileUtils", "initEnterScene: unhandled enterProfileType=" + intExtra5 + ", skip");
                                    }
                                } else {
                                    i17 = 5;
                                }
                            }
                            i17 = i19;
                        } else {
                            i17 = 10;
                        }
                    } else {
                        i17 = 45;
                    }
                    com.tencent.mars.xlog.Log.i("FinderProfileUtils", "initEnterScene: enterProfileType=" + intExtra5 + " -> enterScene=" + i17);
                    intent.putExtra("key_enter_scene", i17);
                }
            }
        }
        if (intent == null || (str = intent.getStringExtra("finder_username")) == null) {
            str = "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(context, intent);
            w04.l.INSTANCE.b(540999686);
            return;
        }
        p52.h.f352016a.f(stringExtra2, str);
        if (intent == null || (str2 = intent.getStringExtra("key_finder_object_Id")) == null) {
            str2 = "0";
        }
        long Z = pm0.v.Z(str2);
        if (intent != null && (stringExtra = intent.getStringExtra("key_finder_object_nonce_id_key")) != null) {
            str3 = stringExtra;
        }
        int intExtra6 = intent != null ? intent.getIntExtra("share_enter_scene", 25) : 25;
        if (Z == 0) {
            com.tencent.mars.xlog.Log.e("FinderRouterApi", "enterFinderProfileUI username & objectId invalid");
        } else {
            pm0.v.K(null, new ya2.a0(Z, str3, intExtra6, intent, context));
        }
    }

    public void x(android.content.Context context, android.content.Intent intent, int i17, int i18) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        java.lang.String stringExtra = intent.getStringExtra("key_biz_username");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) && !kotlin.jvm.internal.o.b("null", stringExtra)) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Contact_User", stringExtra);
            intent2.putExtra("Contact_Scene", 213);
            intent2.putExtra("biz_profile_enter_from_finder", true);
            intent2.putExtra("force_get_contact", true);
            intent2.putExtra("key_use_new_contact_profile", true);
            intent2.putExtra("biz_profile_tab_type", 1);
            j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent2, null);
            return;
        }
        java.lang.String e17 = xy2.c.e(context);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
            intent.putExtra("finder_username", e17);
            intent.putExtra("KEY_FINDER_SELF_FLAG", true);
            J(i17, i18, 33, intent);
            ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).mk(context, intent);
            return;
        }
        if (context instanceof android.app.Activity) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("key_create_scene", 6);
            intent3.putExtra("key_router_to_profile", false);
            ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).qj(context, intent3);
        }
    }

    public void y() {
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        if (b6Var != null) {
            android.content.Context ll6 = ((c61.l7) b6Var).ll();
            com.tencent.mm.plugin.finder.feed.ui.f fVar = com.tencent.mm.plugin.finder.feed.ui.FinderAccountManagent.f109198g;
            java.lang.String e17 = xy2.c.e(ll6);
            m92.b j37 = g92.a.j3(g92.b.f269769e, e17, false, 2, null);
            r45.d1 d1Var = j37 != null ? (r45.d1) j37.u0().getCustom(9) : null;
            boolean z17 = com.tencent.mm.plugin.finder.feed.ui.FinderAccountManagent.f109199h;
            if (!z17 && d1Var != null) {
                fVar.a(ll6, e17, d1Var);
                return;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("Finder.AccountManagementUI", "openFromJsApi invalidate data");
                com.tencent.mm.plugin.finder.feed.ui.FinderAccountManagent.f109199h = false;
            }
            com.tencent.mars.xlog.Log.i("Finder.AccountManagementUI", "openFromJsApi config" + d1Var + ", flag" + z17 + ", wait for prepare");
            kotlinx.coroutines.l.d(((c61.l7) i95.n0.c(c61.l7.class)).U, null, null, new com.tencent.mm.plugin.finder.feed.ui.e(e17, null), 3, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c1, code lost:
    
        if (((com.tencent.mm.plugin.finder.service.l3) r4).Di((android.app.Activity) r10) == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(android.content.Context r10, android.content.Intent r11, int r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ya2.e1.z(android.content.Context, android.content.Intent, int, boolean):void");
    }
}
