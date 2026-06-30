package com.tencent.mm.plugin.finder.report;

/* loaded from: classes10.dex */
public final class p2 {

    /* renamed from: b */
    public static com.tencent.mm.protocal.protobuf.FinderFeedReportObject f125238b;

    /* renamed from: a */
    public static final com.tencent.mm.plugin.finder.report.p2 f125237a = new com.tencent.mm.plugin.finder.report.p2();

    /* renamed from: c */
    public static final java.util.concurrent.ConcurrentHashMap f125239c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d */
    public static final java.util.concurrent.ConcurrentHashMap f125240d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e */
    public static final java.util.concurrent.ConcurrentHashMap f125241e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f */
    public static final java.util.Set f125242f = kz5.z.D0(new java.lang.Integer[]{7, 13, 16, 27, 28});

    /* renamed from: g */
    public static final java.util.List f125243g = kz5.c0.i(bw5.jr.FinderMusicReportInfoSceneShoot, bw5.jr.FinderMusicReportInfoSceneEdit);

    /* renamed from: h */
    public static final jz5.g f125244h = jz5.h.b(com.tencent.mm.plugin.finder.report.g2.f125044d);

    /* renamed from: i */
    public static final long f125245i = 2;

    /* renamed from: j */
    public static final mv2.w0 f125246j = new com.tencent.mm.plugin.finder.report.i2();

    public static void H(com.tencent.mm.plugin.finder.report.p2 p2Var, java.lang.String customKey, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, int i17, java.lang.String str, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        if ((i18 & 8) != 0) {
            str = "";
        }
        p2Var.getClass();
        kotlin.jvm.internal.o.g(customKey, "customKey");
        kotlin.jvm.internal.o.g(finderItem, "finderItem");
        p2Var.I(customKey, finderItem.field_reportObject, p2Var.q(finderItem.field_reportObject, finderItem, i17, str));
    }

    public static /* synthetic */ void L(com.tencent.mm.plugin.finder.report.p2 p2Var, android.content.Context context, int i17, r45.q23 q23Var, long j17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 8) != 0) {
            j17 = 0;
        }
        long j18 = j17;
        if ((i19 & 16) != 0) {
            i18 = 0;
        }
        p2Var.K(context, i17, q23Var, j18, i18);
    }

    public static /* synthetic */ void N(com.tencent.mm.plugin.finder.report.p2 p2Var, android.content.Context context, int i17, java.lang.String str, long j17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            str = null;
        }
        java.lang.String str2 = str;
        if ((i19 & 8) != 0) {
            j17 = 0;
        }
        long j18 = j17;
        if ((i19 & 16) != 0) {
            i18 = 0;
        }
        p2Var.M(context, i17, str2, j18, i18);
    }

    public static void O(com.tencent.mm.plugin.finder.report.p2 p2Var, android.view.View view, java.lang.String viewId, int i17, java.util.Map map, ly1.a aVar, int i18, java.lang.Object obj) {
        android.content.Intent intent;
        android.content.Intent intent2;
        android.content.Intent intent3;
        int i19 = (i18 & 4) != 0 ? 40 : i17;
        java.lang.String str = null;
        java.util.Map map2 = (i18 & 8) != 0 ? null : map;
        ly1.a aVar2 = (i18 & 16) != 0 ? null : aVar;
        p2Var.getClass();
        kotlin.jvm.internal.o.g(viewId, "viewId");
        if (view == null) {
            return;
        }
        android.content.Context context = view.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        long j17 = 0;
        if (activity != null && (intent3 = activity.getIntent()) != null) {
            j17 = intent3.getLongExtra("key_ref_feed_id", 0L);
        }
        java.lang.String u17 = pm0.v.u(j17);
        int intExtra = (activity == null || (intent2 = activity.getIntent()) == null) ? 0 : intent2.getIntExtra("key_ref_comment_scene", 0);
        if (activity != null && (intent = activity.getIntent()) != null) {
            str = intent.getStringExtra("key_ref_feed_dup_flag");
        }
        java.lang.String ek6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(j17, str, intExtra);
        java.util.Map l17 = kz5.c1.l(new jz5.l("source_feedid", u17), new jz5.l("source_feed_commentscene", java.lang.Integer.valueOf(intExtra)), new jz5.l("source_feed_sessionbuffer", ek6));
        if (map2 != null) {
            l17.putAll(map2);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[reportViewEventToSession3] viewId:");
        sb6.append(viewId);
        sb6.append(" sourceFeedId:");
        sb6.append(u17);
        sb6.append(" sourceCommentScene:");
        sb6.append(intExtra);
        sb6.append(" sourceFeedSessionBuffer:");
        sb6.append(ek6.length() == 0);
        com.tencent.mars.xlog.Log.i("Finder.FinderPostReportLogic", sb6.toString());
        hc2.v0.e(view, viewId, i19, 0, false, true, l17, aVar2, 12, null);
    }

    public static void X(com.tencent.mm.plugin.finder.report.p2 p2Var, int i17, r45.ze2 ze2Var, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            ze2Var = null;
        }
        if ((i19 & 4) != 0) {
            i18 = -1;
        }
        p2Var.getClass();
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = f125238b;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setLbsFlag(i17);
            finderFeedReportObject.setSelectLocation(ze2Var);
            finderFeedReportObject.setRecommend_lbs_position(i18);
        }
    }

    public static final java.lang.String a(com.tencent.mm.plugin.finder.report.p2 p2Var) {
        p2Var.getClass();
        return com.tencent.mm.plugin.finder.assist.e9.f102145n + "post_loading_info";
    }

    public static /* synthetic */ void e(com.tencent.mm.plugin.finder.report.p2 p2Var, com.tencent.mm.autogen.mmdata.rpt.FinderPostStruct finderPostStruct, int i17, int i18, com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, boolean z17, int i19, java.lang.Object obj) {
        if ((i19 & 16) != 0) {
            finderItem = null;
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = finderItem;
        if ((i19 & 32) != 0) {
            z17 = false;
        }
        p2Var.d(finderPostStruct, i17, i18, finderFeedReportObject, finderItem2, z17);
    }

    public static r45.xp2 o(com.tencent.mm.plugin.finder.report.p2 p2Var, com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject, java.lang.String moduleName, java.lang.String str, java.lang.String str2, int i17, long j17, yz5.q qVar, int i18, java.lang.Object obj) {
        java.lang.Object obj2;
        r45.xp2 xp2Var;
        r45.xp2 xp2Var2;
        java.lang.String str3 = (i18 & 4) != 0 ? "" : str;
        java.lang.String str4 = (i18 & 8) != 0 ? "" : str2;
        int i19 = (i18 & 16) != 0 ? -1 : i17;
        long j18 = (i18 & 32) != 0 ? 0L : j17;
        r45.xp2 xp2Var3 = null;
        yz5.q qVar2 = (i18 & 64) != 0 ? null : qVar;
        p2Var.getClass();
        kotlin.jvm.internal.o.g(finderFeedReportObject, "<this>");
        kotlin.jvm.internal.o.g(moduleName, "moduleName");
        java.util.LinkedList<r45.xp2> loadingInfoList = finderFeedReportObject.getLoadingInfoList();
        kotlin.jvm.internal.o.f(loadingInfoList, "getLoadingInfoList(...)");
        synchronized (loadingInfoList) {
            java.util.LinkedList<r45.xp2> loadingInfoList2 = finderFeedReportObject.getLoadingInfoList();
            kotlin.jvm.internal.o.f(loadingInfoList2, "getLoadingInfoList(...)");
            java.util.Iterator<T> it = loadingInfoList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                r45.xp2 xp2Var4 = (r45.xp2) obj2;
                boolean z17 = true;
                if (!kotlin.jvm.internal.o.b(xp2Var4 != null ? xp2Var4.getString(1) : null, moduleName) || !ft2.a.a(xp2Var4.getString(0), str3) || !ft2.a.a(xp2Var4.getString(2), str4) || j18 != xp2Var4.getLong(3)) {
                    z17 = false;
                }
                if (z17) {
                    break;
                }
            }
            xp2Var = (r45.xp2) obj2;
        }
        if (xp2Var == null) {
            if (qVar2 != null && (xp2Var2 = (r45.xp2) qVar2.invoke(moduleName, str3, str4)) != null) {
                java.util.LinkedList<r45.xp2> loadingInfoList3 = finderFeedReportObject.getLoadingInfoList();
                kotlin.jvm.internal.o.f(loadingInfoList3, "getLoadingInfoList(...)");
                synchronized (loadingInfoList3) {
                    finderFeedReportObject.getLoadingInfoList().add(xp2Var2);
                }
                xp2Var3 = xp2Var2;
            }
            xp2Var = xp2Var3;
        }
        if (xp2Var != null) {
            xp2Var.set(5, java.lang.Integer.valueOf(i19));
        }
        return xp2Var;
    }

    public static kotlinx.coroutines.r2 t(com.tencent.mm.plugin.finder.report.p2 p2Var, oz5.l lVar, kotlinx.coroutines.a1 a1Var, yz5.p pVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            lVar = oz5.m.f350329d;
        }
        if ((i17 & 2) != 0) {
            a1Var = kotlinx.coroutines.a1.DEFAULT;
        }
        p2Var.getClass();
        return kotlinx.coroutines.l.c((kotlinx.coroutines.y0) ((jz5.n) f125244h).getValue(), lVar, a1Var, pVar);
    }

    public static void v(com.tencent.mm.plugin.finder.report.p2 p2Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, long j17, int i18, java.lang.Object obj) {
        java.lang.String str4 = (i18 & 4) != 0 ? "" : str2;
        java.lang.String str5 = (i18 & 8) != 0 ? "" : str3;
        int i19 = (i18 & 16) != 0 ? -1 : i17;
        long j18 = (i18 & 32) != 0 ? 0L : j17;
        p2Var.getClass();
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
        if (finderFeedReportObject != null) {
            f125237a.u(finderFeedReportObject, str, str4, str5, i19, j18);
            cu2.u.f222441a.l(finderItem);
        }
    }

    public static void w(com.tencent.mm.plugin.finder.report.p2 p2Var, java.lang.String moduleName, java.lang.String str, java.lang.String str2, int i17, long j17, int i18, java.lang.Object obj) {
        java.lang.String str3 = (i18 & 2) != 0 ? "" : str;
        java.lang.String str4 = (i18 & 4) != 0 ? "" : str2;
        int i19 = (i18 & 8) != 0 ? -1 : i17;
        long j18 = (i18 & 16) != 0 ? 0L : j17;
        p2Var.getClass();
        kotlin.jvm.internal.o.g(moduleName, "moduleName");
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = f125238b;
        if (finderFeedReportObject != null) {
            f125237a.u(finderFeedReportObject, moduleName, str3, str4, i19, j18);
        }
    }

    public static void y(com.tencent.mm.plugin.finder.report.p2 p2Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, long j17, int i18, java.lang.Object obj) {
        java.lang.String str4 = (i18 & 4) != 0 ? "" : str2;
        java.lang.String str5 = (i18 & 8) != 0 ? "" : str3;
        int i19 = (i18 & 16) != 0 ? -1 : i17;
        long j18 = (i18 & 32) != 0 ? 0L : j17;
        p2Var.getClass();
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
        if (finderFeedReportObject != null) {
            f125237a.x(finderFeedReportObject, str, str4, str5, i19, j18);
            cu2.u.f222441a.l(finderItem);
        }
    }

    public static void z(com.tencent.mm.plugin.finder.report.p2 p2Var, java.lang.String moduleName, java.lang.String str, java.lang.String str2, int i17, long j17, int i18, java.lang.Object obj) {
        java.lang.String str3 = (i18 & 2) != 0 ? "" : str;
        java.lang.String str4 = (i18 & 4) != 0 ? "" : str2;
        int i19 = (i18 & 8) != 0 ? -1 : i17;
        long j18 = (i18 & 16) != 0 ? 0L : j17;
        p2Var.getClass();
        kotlin.jvm.internal.o.g(moduleName, "moduleName");
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = f125238b;
        if (finderFeedReportObject != null) {
            f125237a.x(finderFeedReportObject, moduleName, str3, str4, i19, j18);
        }
    }

    public final org.json.JSONObject A(org.json.JSONObject jSONObject, java.lang.String str, int i17) {
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        try {
            jSONObject.put(str, i17);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r4 != 4) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(int r4) {
        /*
            r3 = this;
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = com.tencent.mm.plugin.finder.report.p2.f125238b
            if (r0 == 0) goto L47
            int r1 = r0.getEnterScene()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.Set r2 = com.tencent.mm.plugin.finder.report.p2.f125242f
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L18
            r1 = 4
            if (r4 == r1) goto L18
            goto L19
        L18:
            r1 = r4
        L19:
            r0.setVideoSource(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[pickMedia] videoSource:"
            r1.<init>(r2)
            int r2 = r0.getVideoSource()
            r1.append(r2)
            java.lang.String r2 = " mediaSource:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " enterScene:"
            r1.append(r4)
            int r4 = r0.getEnterScene()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r0 = "Finder.FinderPostReportLogic"
            com.tencent.mars.xlog.Log.i(r0, r4)
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.p2.B(int):void");
    }

    public final void C(int i17, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = f125238b;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setExitPageId(i17);
            if (i17 == 4) {
                finderFeedReportObject.setSendOrExitButtonTime(c01.id.c());
            }
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = f125238b;
            if (finderFeedReportObject2 != null) {
                pm0.v.O("Finder.FinderPostReportLogic", new com.tencent.mm.plugin.finder.report.k2(finderFeedReportObject2, finderItem));
            }
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject3 = f125238b;
            if (finderFeedReportObject3 != null) {
                pm0.v.O("Finder.FinderPostReportLogic", new com.tencent.mm.plugin.finder.report.l2(finderFeedReportObject3, false));
            }
        }
        t(this, null, null, new com.tencent.mm.plugin.finder.report.j2("exit", null), 3, null);
    }

    public final void D(android.content.Context context, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        boolean z18 = xy2.c.e(context).length() > 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.b().j());
        sb6.append('_');
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        int i18 = (((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("TLPostCamera") == null && ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("TLCamera") == null) ? 0 : 1;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = sb7;
        objArr[1] = java.lang.Integer.valueOf(z17 ? 1 : 2);
        objArr[2] = java.lang.Integer.valueOf(i17);
        objArr[3] = java.lang.Integer.valueOf(z18 ? 1 : 2);
        objArr[4] = java.lang.Integer.valueOf(i18);
        g0Var.d(20949, objArr);
    }

    public final void E(int i17, int i18, long j17, long j18) {
        com.tencent.mm.autogen.mmdata.rpt.FinderPostPageDeleteStruct finderPostPageDeleteStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPostPageDeleteStruct();
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = f125238b;
        if (finderFeedReportObject != null) {
            finderPostPageDeleteStruct.f57539d = finderPostPageDeleteStruct.b("PostId", finderFeedReportObject.getPostId(), true);
            finderPostPageDeleteStruct.f57540e = finderPostPageDeleteStruct.b("EditId", finderFeedReportObject.getEditId(), true);
            finderPostPageDeleteStruct.f57541f = finderFeedReportObject.getVideoSource();
            finderPostPageDeleteStruct.f57542g = i18;
            finderPostPageDeleteStruct.f57543h = j17;
            finderPostPageDeleteStruct.f57544i = j18;
            finderPostPageDeleteStruct.f57545j = i17;
            finderPostPageDeleteStruct.k();
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderPostPageDeleteStruct);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x04f0, code lost:
    
        if (r0 == null) goto L435;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01bf A[Catch: JSONException -> 0x01f4, TryCatch #0 {JSONException -> 0x01f4, blocks: (B:54:0x01ae, B:55:0x01b5, B:57:0x01bf, B:58:0x01c5, B:60:0x01ce, B:61:0x01d8, B:63:0x01e2, B:64:0x01ec), top: B:53:0x01ae }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ce A[Catch: JSONException -> 0x01f4, TryCatch #0 {JSONException -> 0x01f4, blocks: (B:54:0x01ae, B:55:0x01b5, B:57:0x01bf, B:58:0x01c5, B:60:0x01ce, B:61:0x01d8, B:63:0x01e2, B:64:0x01ec), top: B:53:0x01ae }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e2 A[Catch: JSONException -> 0x01f4, TryCatch #0 {JSONException -> 0x01f4, blocks: (B:54:0x01ae, B:55:0x01b5, B:57:0x01bf, B:58:0x01c5, B:60:0x01ce, B:61:0x01d8, B:63:0x01e2, B:64:0x01ec), top: B:53:0x01ae }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x085e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(com.tencent.mm.plugin.finder.storage.FinderItem r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 2360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.p2.F(com.tencent.mm.plugin.finder.storage.FinderItem, boolean):void");
    }

    public final void G(java.lang.String customKey, r45.rb4 rb4Var) {
        kotlin.jvm.internal.o.g(customKey, "customKey");
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = f125238b;
        if (rb4Var == null) {
            rb4Var = q(finderFeedReportObject, null, 0, "");
        }
        I(customKey, finderFeedReportObject, rb4Var);
    }

    public final void I(java.lang.String str, com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject, r45.rb4 rb4Var) {
        if (finderFeedReportObject == null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderPostReportLogic", "[reportPostTrace28992] reportObject is null, customKey:" + str);
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.FinderPostTraceSourceDataStruct finderPostTraceSourceDataStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPostTraceSourceDataStruct();
        finderPostTraceSourceDataStruct.f57610f = finderPostTraceSourceDataStruct.b("TraceKey", finderFeedReportObject.getTraceKey(), true);
        finderPostTraceSourceDataStruct.f57611g = finderPostTraceSourceDataStruct.b("CustomKey", str, true);
        finderPostTraceSourceDataStruct.f57612h = c01.id.e();
        finderPostTraceSourceDataStruct.f57621q = finderPostTraceSourceDataStruct.b("FinderUsername", g92.b.f269769e.U(), true);
        finderPostTraceSourceDataStruct.f57615k = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getContext().getManager(com.tencent.mars.cdn.CdnManager.class)) != null ? r2.getRecentAverageSpeed(2) : 0L;
        finderPostTraceSourceDataStruct.f57617m = rb4Var.getLong(3);
        finderPostTraceSourceDataStruct.f57618n = rb4Var.getLong(2);
        finderPostTraceSourceDataStruct.f57620p = rb4Var.getInteger(0);
        finderPostTraceSourceDataStruct.f57614j = rb4Var.getInteger(5);
        finderPostTraceSourceDataStruct.f57619o = finderPostTraceSourceDataStruct.b("RetMsg", rb4Var.getString(6), true);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("enterScene", finderFeedReportObject.getEnterScene());
        jSONObject.put("mediaCount", rb4Var.getInteger(1));
        jSONObject.put("feedId", rb4Var.getString(4));
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        finderPostTraceSourceDataStruct.f57613i = finderPostTraceSourceDataStruct.b("ClientInfo", r26.i0.t(jSONObject2, ",", ";", false), true);
        finderPostTraceSourceDataStruct.k();
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderPostTraceSourceDataStruct);
        com.tencent.mars.xlog.Log.i("Finder.FinderPostReportLogic", "[reportPostTrace28992] traceKey:" + finderFeedReportObject.getTraceKey() + " customKey:" + str);
    }

    public final void J(boolean z17, com.tencent.mm.plugin.finder.storage.x80 x80Var) {
        com.tencent.mm.plugin.finder.storage.FinderItem t07 = x80Var.t0();
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = t07.field_reportObject;
        if (finderFeedReportObject != null) {
            if (finderFeedReportObject.getDraftObjectId() == 0) {
                long j17 = x80Var.field_objectId;
                if (j17 != 0) {
                    finderFeedReportObject.setDraftObjectId(j17);
                }
            }
            pm0.v.O("Finder.FinderPostReportLogic", new com.tencent.mm.plugin.finder.report.m2(z17, finderFeedReportObject, x80Var, t07));
        }
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = f125238b;
        if (finderFeedReportObject2 != null) {
            pm0.v.O("Finder.FinderPostReportLogic", new com.tencent.mm.plugin.finder.report.l2(finderFeedReportObject2, true));
        }
    }

    public final void K(android.content.Context context, int i17, r45.q23 q23Var, long j17, int i18) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(context, "context");
        if (q23Var != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("template_id", q23Var.f383585d);
                jSONObject.put("template_type", q23Var.f383586e);
                str = jSONObject.toString();
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("Finder.FinderPostReportLogic", "reportClickToSession2 >> " + e17.getMessage());
                str = "";
            }
            if (str != null) {
                str2 = str;
                M(context, i17, str2, j17, i18);
            }
        }
        str2 = "";
        M(context, i17, str2, j17, i18);
    }

    public final void M(android.content.Context context, int i17, java.lang.String str, long j17, int i18) {
        org.json.JSONObject jSONObject;
        int i19;
        kotlin.jvm.internal.o.g(context, "context");
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        android.content.Intent intent = activity != null ? activity.getIntent() : null;
        long longExtra = intent != null ? intent.getLongExtra("key_ref_feed_id", 0L) : 0L;
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("key_ref_feed_dup_flag") : null;
        if (longExtra == 0) {
            longExtra = j17;
        }
        java.lang.String u17 = pm0.v.u(longExtra);
        int intExtra = intent != null ? intent.getIntExtra("key_ref_comment_scene", 0) : 0;
        if (intExtra == 0) {
            intExtra = i18;
        }
        java.lang.String ek6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(longExtra, stringExtra, intExtra);
        com.tencent.mars.xlog.Log.i("Finder.FinderPostReportLogic", "[reportToSession2] actionType=" + i17 + " sourceFeedId=" + u17 + ", sourcecommentScene=" + intExtra);
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(longExtra);
        if (h17 == null) {
            h17 = new com.tencent.mm.plugin.finder.storage.FinderItem();
            h17.field_id = longExtra;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
            finderObject.setId(longExtra);
            h17.setFeedObject(finderObject);
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = h17;
        if (str == null || str.length() == 0) {
            jSONObject = new org.json.JSONObject();
        } else {
            try {
                jSONObject = new org.json.JSONObject(str);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("Finder.FinderPostReportLogic", e17.getMessage());
                jSONObject = new org.json.JSONObject();
            }
        }
        org.json.JSONObject jSONObject2 = jSONObject;
        try {
            jSONObject2.put("feedId", u17);
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = f125238b;
            if (finderFeedReportObject != null) {
                jSONObject2.put("song_source_position", finderFeedReportObject.getSourcePosition());
                jSONObject2.put("source_feedid", u17);
                jSONObject2.put("source_feed_commentScene", intExtra);
                jSONObject2.put("source_feed_sessionbuffer", ek6);
                jSONObject2.put("source_song_id", finderFeedReportObject.getSongId());
                jSONObject2.put("enter_child_scene", finderFeedReportObject.getChildEnterScene());
            }
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.e("Finder.FinderPostReportLogic", e18.getMessage());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        com.tencent.mm.plugin.finder.report.l0 l0Var = com.tencent.mm.plugin.finder.report.l0.f125109a;
        java.lang.String jSONObject3 = jSONObject2.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        if (intExtra == 0) {
            i19 = V6 != null ? V6.getInteger(5) : 0;
        } else {
            i19 = intExtra;
        }
        l0Var.c(V6, finderItem, i17, jSONObject3, i19);
    }

    public final void P(long j17, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("Finder.FinderPostReportLogic", "savePostError " + j17 + ", " + i17 + ", " + i18);
        cu2.t tVar = cu2.u.f222441a;
        com.tencent.mm.plugin.finder.storage.FinderItem f17 = tVar.f(j17);
        if (f17 != null) {
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = f17.field_reportObject;
            if (finderFeedReportObject != null) {
                finderFeedReportObject.setCgiErrorType(i17);
            }
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = f17.field_reportObject;
            if (finderFeedReportObject2 != null) {
                finderFeedReportObject2.setCgiErrorCode(i18);
            }
            tVar.l(f17);
        }
    }

    public final void Q(java.util.ArrayList arrayList, int i17, int i18) {
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = f125238b;
        if (finderFeedReportObject != null) {
            if (arrayList != null) {
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    java.lang.String string = ((r45.gb4) it.next()).getString(0);
                    if (string == null) {
                        string = "";
                    }
                    hashSet.add(string);
                }
                finderFeedReportObject.setMentionCount(hashSet.size());
            }
            finderFeedReportObject.setClickMentionCount(i17);
            finderFeedReportObject.setClickSucMentionCount(i18);
            finderFeedReportObject.setMentionRepeatCount(arrayList != null ? arrayList.size() : 0);
        }
    }

    public final void R(java.lang.String clickId) {
        kotlin.jvm.internal.o.g(clickId, "clickId");
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = f125238b;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setClickId(clickId);
        }
    }

    public final void S(bw5.jr reportInfoScene, r45.ej2 ej2Var) {
        kotlin.jvm.internal.o.g(reportInfoScene, "reportInfoScene");
        java.lang.String n17 = n(reportInfoScene);
        if (ej2Var != null) {
            f125240d.put(n17, ej2Var);
        }
    }

    public final void T(java.lang.String postId, java.lang.String str) {
        kotlin.jvm.internal.o.g(postId, "postId");
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = f125238b;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setPostId(postId);
            if (str != null) {
                finderFeedReportObject.setEditId(str);
            }
        }
    }

    public final void U(long j17, java.lang.String str, int i17) {
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = f125238b;
        if (finderFeedReportObject != null) {
            if (finderFeedReportObject.getSourceFeedInfo() == null) {
                finderFeedReportObject.setSourceFeedInfo(new r45.lc4());
            }
            r45.lc4 sourceFeedInfo = finderFeedReportObject.getSourceFeedInfo();
            if (sourceFeedInfo != null) {
                sourceFeedInfo.set(0, java.lang.Long.valueOf(j17));
            }
            r45.lc4 sourceFeedInfo2 = finderFeedReportObject.getSourceFeedInfo();
            if (sourceFeedInfo2 != null) {
                sourceFeedInfo2.set(1, java.lang.Integer.valueOf(i17));
            }
            r45.lc4 sourceFeedInfo3 = finderFeedReportObject.getSourceFeedInfo();
            if (sourceFeedInfo3 == null) {
                return;
            }
            sourceFeedInfo3.set(2, ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(j17, str, i17));
        }
    }

    public final void V(java.lang.String templateInfo) {
        kotlin.jvm.internal.o.g(templateInfo, "templateInfo");
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = f125238b;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setTempateInfo(templateInfo);
        }
    }

    public final void W(com.tencent.mm.protocal.protobuf.FinderFeedReportObject reportObject) {
        kotlin.jvm.internal.o.g(reportObject, "reportObject");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[startPost] entrance:");
        sb6.append(reportObject.getEnterScene());
        sb6.append(" isDraft:");
        sb6.append(reportObject.getDraft() == 1);
        com.tencent.mars.xlog.Log.i("Finder.FinderPostReportLogic", sb6.toString());
        f125238b = reportObject;
        java.lang.String str = c01.id.c() + '_' + g92.b.f269769e.U();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = f125238b;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setFlowId(str);
        }
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = f125238b;
        if (finderFeedReportObject2 != null) {
            finderFeedReportObject2.setSessionId(Ri);
        }
        G("andr_Post_Entry", null);
        ft2.b bVar = ft2.b.f266519a;
        ft2.d dVar = ft2.c.f266520a;
        bVar.b(str, ft2.c.f266520a);
    }

    public final void Y(r45.df2 finderMJPublisherInfo) {
        kotlin.jvm.internal.o.g(finderMJPublisherInfo, "finderMJPublisherInfo");
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = f125238b;
        if (finderFeedReportObject != null) {
            pm0.v.O("Finder.FinderPostReportLogic", new com.tencent.mm.plugin.finder.report.o2(finderFeedReportObject, finderMJPublisherInfo));
        }
    }

    public final java.lang.String b(java.util.List multiMediaInfo) {
        kotlin.jvm.internal.o.g(multiMediaInfo, "multiMediaInfo");
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = multiMediaInfo.iterator();
        while (it.hasNext()) {
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo finderMediaReportInfo = (com.tencent.mm.protocal.protobuf.FinderMediaReportInfo) it.next();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("w", finderMediaReportInfo.getWidth());
            jSONObject.put("h", finderMediaReportInfo.getHeight());
            jSONObject.put(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS, finderMediaReportInfo.getFps());
            jSONObject.put("audiobitrate", finderMediaReportInfo.getAudioBitrate());
            jSONObject.put("videobitrate", finderMediaReportInfo.getVideoBitrate());
            jSONArray.put(jSONObject);
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        kotlin.jvm.internal.o.f(jSONArray2, "toString(...)");
        return jSONArray2;
    }

    public final void c(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        kotlin.jvm.internal.o.g(finderItem, "finderItem");
        long c17 = c01.id.c();
        v(this, finderItem, "PostConfirmCgi", null, null, 0, c17, 28, null);
        v(this, finderItem, "RealWait", null, null, 0, c17, 28, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:81|82|83|(10:88|(1:90)(1:107)|91|92|93|(1:95)(1:104)|(3:97|(1:99)|100)|103|(0)|100)|108|(0)(0)|91|92|93|(0)(0)|(0)|103|(0)|100) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03e6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03e7, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetInt", "", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c3 A[Catch: JSONException -> 0x0412, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0412, blocks: (B:83:0x03ac, B:85:0x03b0, B:90:0x03bc, B:99:0x03f3, B:100:0x03fb, B:106:0x03e7, B:107:0x03c3, B:93:0x03d5, B:97:0x03e1), top: B:82:0x03ac, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0546 A[Catch: all -> 0x055f, TryCatch #5 {all -> 0x055f, blocks: (B:149:0x0512, B:154:0x0522, B:156:0x053a, B:161:0x0546, B:162:0x0553), top: B:148:0x0512 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03bc A[Catch: JSONException -> 0x0412, TryCatch #0 {JSONException -> 0x0412, blocks: (B:83:0x03ac, B:85:0x03b0, B:90:0x03bc, B:99:0x03f3, B:100:0x03fb, B:106:0x03e7, B:107:0x03c3, B:93:0x03d5, B:97:0x03e1), top: B:82:0x03ac, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03e1 A[Catch: Exception -> 0x03e6, TRY_LEAVE, TryCatch #3 {Exception -> 0x03e6, blocks: (B:93:0x03d5, B:97:0x03e1), top: B:92:0x03d5, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03f3 A[Catch: JSONException -> 0x0412, TryCatch #0 {JSONException -> 0x0412, blocks: (B:83:0x03ac, B:85:0x03b0, B:90:0x03bc, B:99:0x03f3, B:100:0x03fb, B:106:0x03e7, B:107:0x03c3, B:93:0x03d5, B:97:0x03e1), top: B:82:0x03ac, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.tencent.mm.autogen.mmdata.rpt.FinderPostStruct r22, int r23, int r24, com.tencent.mm.protocal.protobuf.FinderFeedReportObject r25, com.tencent.mm.plugin.finder.storage.FinderItem r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 1750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.p2.d(com.tencent.mm.autogen.mmdata.rpt.FinderPostStruct, int, int, com.tencent.mm.protocal.protobuf.FinderFeedReportObject, com.tencent.mm.plugin.finder.storage.FinderItem, boolean):void");
    }

    public final void f(com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo reportInfo) {
        kotlin.jvm.internal.o.g(reportInfo, "reportInfo");
        java.lang.Long l17 = (java.lang.Long) reportInfo.b("KEY_ORIGIN_MEDIA_DURATION_MS_LONG", 0L);
        java.lang.Long l18 = (java.lang.Long) reportInfo.b("KEY_VIDEO_CROP_DURATION_MS_INT", 0L);
        java.lang.Integer num = (java.lang.Integer) reportInfo.b("KEY_ADD_EMOJI_COUNT_INT", 0);
        java.lang.Integer num2 = (java.lang.Integer) reportInfo.b("KEY_ADD_TEXT_COUNT_INT", 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[finishEdit] originTimeMs:");
        sb6.append(l17);
        sb6.append(" cropTimeMs:");
        sb6.append(l18);
        sb6.append(" emojiCount:");
        sb6.append(num);
        sb6.append(" textCount:");
        sb6.append(num2);
        sb6.append(" videoSource:");
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = f125238b;
        sb6.append(finderFeedReportObject != null ? java.lang.Integer.valueOf(finderFeedReportObject.getVideoSource()) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderPostReportLogic", sb6.toString());
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = f125238b;
        if (finderFeedReportObject2 != null) {
            kotlin.jvm.internal.o.d(l17);
            finderFeedReportObject2.setVideoRecordTime(l17.longValue());
            kotlin.jvm.internal.o.d(l18);
            finderFeedReportObject2.setVideoCropTime(l18.longValue());
            finderFeedReportObject2.setVideoMusicId((java.lang.String) reportInfo.b("KEY_MUSIC_ID_STRING", ""));
            finderFeedReportObject2.setLikeMusicFeedId((java.lang.String) reportInfo.b("KEY_MUSIC_LIKE_FINDER_FEED_ID_STRING", ""));
            java.lang.Object b17 = reportInfo.b("KEY_SEARCH_MUSIC_INT", 0);
            kotlin.jvm.internal.o.f(b17, "getReportValue(...)");
            finderFeedReportObject2.setVideoMusicSearch(((java.lang.Number) b17).intValue());
            java.lang.Object b18 = reportInfo.b("KEY_MUSIC_INDEX_INT", 0);
            kotlin.jvm.internal.o.f(b18, "getReportValue(...)");
            finderFeedReportObject2.setVideoMusicIndex(((java.lang.Number) b18).intValue());
            kotlin.jvm.internal.o.d(num);
            finderFeedReportObject2.setVideoEmojiCount(num.intValue());
            kotlin.jvm.internal.o.d(num2);
            finderFeedReportObject2.setVideoWordingCount(num2.intValue());
            java.lang.Object b19 = reportInfo.b("KEY_ENTER_EDIT_PAGE_TIME_MS_LONG", 0L);
            kotlin.jvm.internal.o.f(b19, "getReportValue(...)");
            finderFeedReportObject2.setEnterVideoEditTime(((java.lang.Number) b19).longValue());
            java.lang.Object b27 = reportInfo.b("KEY_VIDEO_SUB_TYPE_INT", 0);
            kotlin.jvm.internal.o.f(b27, "getReportValue(...)");
            finderFeedReportObject2.setVideoSubType(((java.lang.Number) b27).intValue());
            finderFeedReportObject2.setPostId((java.lang.String) reportInfo.b("KEY_MULTI_MEDIA_POST_ID_STRING", ""));
            finderFeedReportObject2.setEditId((java.lang.String) reportInfo.b("KEY_MULTI_MEDIA_EDIT_ID_STRING", ""));
            java.lang.Object b28 = reportInfo.b("KEY_IS_SUB_RECORD_BOOLEAN", java.lang.Boolean.FALSE);
            kotlin.jvm.internal.o.f(b28, "getReportValue(...)");
            finderFeedReportObject2.setIsMultiShot(((java.lang.Boolean) b28).booleanValue() ? 1 : 0);
            java.lang.Object b29 = reportInfo.b("KEY_CHANGE_SUB_RECORD_TAB_INT", 0);
            kotlin.jvm.internal.o.f(b29, "getReportValue(...)");
            finderFeedReportObject2.setMultiShotChangeCnt(((java.lang.Number) b29).intValue());
            java.lang.Object b37 = reportInfo.b("KEY_SUB_VIDEO_RECORD_CLICK_INT", 0);
            kotlin.jvm.internal.o.f(b37, "getReportValue(...)");
            finderFeedReportObject2.setMultiShotClickCnt(((java.lang.Number) b37).intValue());
            java.lang.Object b38 = reportInfo.b("KEY_SUB_VIDEO_RECORD_SUCCESS_INT", 0);
            kotlin.jvm.internal.o.f(b38, "getReportValue(...)");
            finderFeedReportObject2.setMultiShotSuccessCnt(((java.lang.Number) b38).intValue());
            java.lang.Object b39 = reportInfo.b("KEY_SUB_VIDEO_NUM_INT", 0);
            kotlin.jvm.internal.o.f(b39, "getReportValue(...)");
            finderFeedReportObject2.setMultiShotVideoCnt(((java.lang.Number) b39).intValue());
            if (finderFeedReportObject2.getVideoSource() == 0) {
                finderFeedReportObject2.setVideoSource(1);
            }
            finderFeedReportObject2.getVideoMusicId();
            finderFeedReportObject2.getLikeMusicFeedId();
            finderFeedReportObject2.getVideoSource();
        }
    }

    public final void g(com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo reportInfo) {
        kotlin.jvm.internal.o.g(reportInfo, "reportInfo");
        java.lang.Long l17 = (java.lang.Long) reportInfo.b("KEY_ORIGIN_MEDIA_DURATION_MS_LONG", 0L);
        java.lang.Long l18 = (java.lang.Long) reportInfo.b("KEY_VIDEO_CROP_DURATION_MS_INT", 0L);
        java.lang.Integer num = (java.lang.Integer) reportInfo.b("KEY_ADD_EMOJI_COUNT_INT", 0);
        java.lang.Integer num2 = (java.lang.Integer) reportInfo.b("KEY_ADD_TEXT_COUNT_INT", 0);
        java.lang.Object obj = (java.lang.Integer) reportInfo.b("KEY_MEDIA_SOURCE_INT", 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[finishTakePhoto] originTimeMs:");
        sb6.append(l17);
        sb6.append(" cropTimeMs:");
        sb6.append(l18);
        sb6.append(" emojiCount:");
        sb6.append(num);
        sb6.append(" textCount:");
        sb6.append(num2);
        sb6.append(" mediaSource:");
        sb6.append(obj);
        sb6.append(" videoSource:");
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = f125238b;
        sb6.append(finderFeedReportObject != null ? java.lang.Integer.valueOf(finderFeedReportObject.getVideoSource()) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderPostReportLogic", sb6.toString());
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = f125238b;
        if (finderFeedReportObject2 != null) {
            kotlin.jvm.internal.o.d(l17);
            finderFeedReportObject2.setVideoRecordTime(l17.longValue());
            kotlin.jvm.internal.o.d(l18);
            finderFeedReportObject2.setVideoCropTime(l18.longValue());
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            java.lang.Object b17 = reportInfo.b("KEY_RECORD_IS_BEAUTIFY", bool);
            kotlin.jvm.internal.o.f(b17, "getReportValue(...)");
            finderFeedReportObject2.setIsBeauty(((java.lang.Boolean) b17).booleanValue() ? 1 : 0);
            finderFeedReportObject2.setVideoSource(((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).nj(reportInfo));
            finderFeedReportObject2.setVideoMusicId((java.lang.String) reportInfo.b("KEY_MUSIC_ID_STRING", ""));
            finderFeedReportObject2.setLikeMusicFeedId((java.lang.String) reportInfo.b("KEY_MUSIC_LIKE_FINDER_FEED_ID_STRING", ""));
            java.lang.Object b18 = reportInfo.b("KEY_SEARCH_MUSIC_INT", 0);
            kotlin.jvm.internal.o.f(b18, "getReportValue(...)");
            finderFeedReportObject2.setVideoMusicSearch(((java.lang.Number) b18).intValue());
            java.lang.Object b19 = reportInfo.b("KEY_MUSIC_INDEX_INT", 0);
            kotlin.jvm.internal.o.f(b19, "getReportValue(...)");
            finderFeedReportObject2.setVideoMusicIndex(((java.lang.Number) b19).intValue());
            kotlin.jvm.internal.o.d(num);
            finderFeedReportObject2.setVideoEmojiCount(num.intValue());
            kotlin.jvm.internal.o.d(num2);
            finderFeedReportObject2.setVideoWordingCount(num2.intValue());
            java.lang.Object b27 = reportInfo.b("KEY_ENTER_EDIT_PAGE_TIME_MS_LONG", 0L);
            kotlin.jvm.internal.o.f(b27, "getReportValue(...)");
            finderFeedReportObject2.setEnterVideoEditTime(((java.lang.Number) b27).longValue());
            java.lang.Object b28 = reportInfo.b("KEY_ENTER_TIME_MS_LONG", 0L);
            kotlin.jvm.internal.o.f(b28, "getReportValue(...)");
            finderFeedReportObject2.setEnterTakePhotoTime(((java.lang.Number) b28).longValue());
            java.lang.Object b29 = reportInfo.b("KEY_IS_SUB_RECORD_BOOLEAN", bool);
            kotlin.jvm.internal.o.f(b29, "getReportValue(...)");
            finderFeedReportObject2.setIsMultiShot(((java.lang.Boolean) b29).booleanValue() ? 1 : 0);
            java.lang.Object b37 = reportInfo.b("KEY_CHANGE_SUB_RECORD_TAB_INT", 0);
            kotlin.jvm.internal.o.f(b37, "getReportValue(...)");
            finderFeedReportObject2.setMultiShotChangeCnt(((java.lang.Number) b37).intValue());
            java.lang.Object b38 = reportInfo.b("KEY_SUB_VIDEO_RECORD_CLICK_INT", 0);
            kotlin.jvm.internal.o.f(b38, "getReportValue(...)");
            finderFeedReportObject2.setMultiShotClickCnt(((java.lang.Number) b38).intValue());
            java.lang.Object b39 = reportInfo.b("KEY_SUB_VIDEO_RECORD_SUCCESS_INT", 0);
            kotlin.jvm.internal.o.f(b39, "getReportValue(...)");
            finderFeedReportObject2.setMultiShotSuccessCnt(((java.lang.Number) b39).intValue());
            java.lang.Object b47 = reportInfo.b("KEY_SUB_VIDEO_NUM_INT", 0);
            kotlin.jvm.internal.o.f(b47, "getReportValue(...)");
            finderFeedReportObject2.setMultiShotVideoCnt(((java.lang.Number) b47).intValue());
            finderFeedReportObject2.getVideoMusicId();
            finderFeedReportObject2.getLikeMusicFeedId();
            finderFeedReportObject2.getVideoSource();
        }
    }

    public final java.lang.String h(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!(str2 == null || str2.length() == 0)) {
            str = str2 + '_' + str;
        }
        if (str3 == null || str3.length() == 0) {
            return str;
        }
        return str + '_' + str3;
    }

    public final com.tencent.mm.protocal.protobuf.FinderFeedReportObject i(android.content.Context context, int i17, boolean z17) {
        int i18;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = new com.tencent.mm.protocal.protobuf.FinderFeedReportObject();
        finderFeedReportObject.setEnterScene(i17);
        finderFeedReportObject.setDraft(z17 ? 1 : 0);
        if (context != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            java.lang.Integer valueOf = nyVar != null ? java.lang.Integer.valueOf(nyVar.f135380n) : null;
            if (valueOf != null) {
                i18 = valueOf.intValue();
                finderFeedReportObject.setCommentScene(i18);
                finderFeedReportObject.setTraceKey("finder_upload_" + c01.id.c() + '_' + c01.z1.r());
                return finderFeedReportObject;
            }
        }
        i18 = 0;
        finderFeedReportObject.setCommentScene(i18);
        finderFeedReportObject.setTraceKey("finder_upload_" + c01.id.c() + '_' + c01.z1.r());
        return finderFeedReportObject;
    }

    public final java.util.Map j(com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject) {
        jz5.l[] lVarArr = new jz5.l[27];
        lVarArr[0] = new jz5.l("EnterScene", java.lang.String.valueOf(finderFeedReportObject.getEnterScene()));
        lVarArr[1] = new jz5.l("VideoSource", java.lang.String.valueOf(finderFeedReportObject.getVideoSource()));
        lVarArr[2] = new jz5.l("parentEnterScene", java.lang.String.valueOf(finderFeedReportObject.getParentEnterScene()));
        lVarArr[3] = new jz5.l("ExitUI", java.lang.String.valueOf(finderFeedReportObject.getExitPageId()));
        lVarArr[4] = new jz5.l("VideoEmoji", java.lang.String.valueOf(finderFeedReportObject.getVideoEmojiCount()));
        lVarArr[5] = new jz5.l("VideoText", java.lang.String.valueOf(finderFeedReportObject.getVideoWordingCount()));
        java.lang.String videoMusicId = finderFeedReportObject.getVideoMusicId();
        if (videoMusicId == null) {
            videoMusicId = "";
        }
        lVarArr[6] = new jz5.l("VideoMusicId", videoMusicId);
        lVarArr[7] = new jz5.l("VideoMusicIndex", java.lang.String.valueOf(finderFeedReportObject.getVideoMusicIndex()));
        lVarArr[8] = new jz5.l("IsSearchMusic", java.lang.String.valueOf(finderFeedReportObject.getVideoMusicSearch()));
        lVarArr[9] = new jz5.l("VideoType", java.lang.String.valueOf(finderFeedReportObject.getVideoPostType()));
        lVarArr[10] = new jz5.l("HasWording", java.lang.String.valueOf(finderFeedReportObject.getExistDesc()));
        lVarArr[11] = new jz5.l("WordingCount", java.lang.String.valueOf(finderFeedReportObject.getDescCount()));
        lVarArr[12] = new jz5.l("LbsFlag", java.lang.String.valueOf(finderFeedReportObject.getLbsFlag()));
        lVarArr[13] = new jz5.l("EditDraftFlag", java.lang.String.valueOf(finderFeedReportObject.getDraft()));
        lVarArr[14] = new jz5.l("MentionUsercnt", java.lang.String.valueOf(finderFeedReportObject.getMentionCount()));
        lVarArr[15] = new jz5.l("ClickMentionCnt", java.lang.String.valueOf(finderFeedReportObject.getClickMentionCount()));
        lVarArr[16] = new jz5.l("MentionCnt", java.lang.String.valueOf(finderFeedReportObject.getMentionCount()));
        lVarArr[17] = new jz5.l("MentionRepeatCnt", java.lang.String.valueOf(finderFeedReportObject.getMentionRepeatCount()));
        lVarArr[18] = new jz5.l("VideoSubType", java.lang.String.valueOf(finderFeedReportObject.getVideoSubType()));
        lVarArr[19] = new jz5.l("MusicType", java.lang.String.valueOf(finderFeedReportObject.getMusicType()));
        lVarArr[20] = new jz5.l("SoundTrackType", java.lang.String.valueOf(finderFeedReportObject.getSoundTrackType()));
        java.lang.String followSoundTrackId = finderFeedReportObject.getFollowSoundTrackId();
        if (followSoundTrackId == null) {
            followSoundTrackId = "";
        }
        lVarArr[21] = new jz5.l("FollowSoundTrackId", followSoundTrackId);
        java.lang.String topicActivityId = finderFeedReportObject.getTopicActivityId();
        if (topicActivityId == null) {
            topicActivityId = "";
        }
        lVarArr[22] = new jz5.l("ActivityID", topicActivityId);
        lVarArr[23] = new jz5.l("ActivityType", java.lang.String.valueOf(finderFeedReportObject.getTopicActivityType()));
        lVarArr[24] = new jz5.l("videoDuration", java.lang.String.valueOf(r(finderFeedReportObject)));
        lVarArr[25] = new jz5.l("child_enterscene", java.lang.String.valueOf(finderFeedReportObject.getChildEnterScene()));
        java.lang.String tempateInfo = finderFeedReportObject.getTempateInfo();
        if (tempateInfo == null) {
            tempateInfo = "";
        }
        lVarArr[26] = new jz5.l("TemplateInfo", tempateInfo);
        java.util.Map c17 = kotlin.jvm.internal.m0.c(kz5.c1.k(lVarArr));
        r45.ze2 selectLocation = finderFeedReportObject.getSelectLocation();
        if (selectLocation != null) {
            java.lang.String string = selectLocation.getString(2);
            java.lang.String string2 = selectLocation.getString(3);
            if (!com.tencent.mm.sdk.platformtools.t8.N0(string, string2)) {
                string = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f491898el5, string, string2);
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                string = !com.tencent.mm.sdk.platformtools.t8.K0(string2) ? string2 : "";
            }
            if (string == null) {
                string = "";
            }
            c17.put("LbsInfo", string);
        }
        r45.ke4 mjPublisherInfo = finderFeedReportObject.getMjPublisherInfo();
        if (mjPublisherInfo != null) {
            java.lang.String string3 = mjPublisherInfo.getString(1);
            if (string3 == null) {
                string3 = "";
            }
            c17.put("sourceFeedId", string3);
            java.lang.String string4 = mjPublisherInfo.getString(2);
            if (string4 == null) {
                string4 = "";
            }
            c17.put("sourceSongId", string4);
            java.lang.String string5 = mjPublisherInfo.getString(3);
            if (string5 == null) {
                string5 = "";
            }
            c17.put("followFeedTemplateId", string5);
            java.lang.String string6 = mjPublisherInfo.getString(4);
            if (string6 == null) {
                string6 = "";
            }
            c17.put("TemplateID", string6);
            java.lang.String string7 = mjPublisherInfo.getString(5);
            c17.put("TemplateTabID", string7 != null ? string7 : "");
            c17.put("TemplatePosition", java.lang.String.valueOf(mjPublisherInfo.getInteger(6)));
            c17.put("TemplateType", java.lang.String.valueOf(mjPublisherInfo.getInteger(12)));
            c17.put("ExportScene", java.lang.String.valueOf(mjPublisherInfo.getInteger(8)));
            c17.put("IsSCAssetGenerate", mjPublisherInfo.getBoolean(10) ? "1" : "0");
            c17.put("CreationPageID", java.lang.String.valueOf(mjPublisherInfo.getInteger(11)));
            c17.put("TemplateIsFavorite", mjPublisherInfo.getBoolean(13) ? "1" : "0");
            c17.put("TemplateIsAIGC", mjPublisherInfo.getBoolean(14) ? "1" : "0");
        }
        return c17;
    }

    public final java.util.Map k(com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject) {
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("video_duration", java.lang.Long.valueOf(r(finderFeedReportObject)));
        lVarArr[1] = new jz5.l("video_source", java.lang.Integer.valueOf(finderFeedReportObject.getVideoSource()));
        lVarArr[2] = new jz5.l("enter_scene", java.lang.Integer.valueOf(finderFeedReportObject.getEnterScene()));
        java.lang.String mjPublisherSessionID = finderFeedReportObject.getMjPublisherSessionID();
        if (mjPublisherSessionID == null) {
            mjPublisherSessionID = "";
        }
        lVarArr[3] = new jz5.l("mj_publisher_session_id", mjPublisherSessionID);
        java.util.Map c17 = kotlin.jvm.internal.m0.c(kz5.c1.k(lVarArr));
        r45.ke4 mjPublisherInfo = finderFeedReportObject.getMjPublisherInfo();
        if (mjPublisherInfo != null) {
            java.lang.String string = mjPublisherInfo.getString(1);
            if (string == null) {
                string = "";
            }
            c17.put("source_feed_id", string);
            java.lang.String string2 = mjPublisherInfo.getString(2);
            if (string2 == null) {
                string2 = "";
            }
            c17.put("source_song_id", string2);
            java.lang.String string3 = mjPublisherInfo.getString(3);
            if (string3 == null) {
                string3 = "";
            }
            c17.put("follow_feed_template_id", string3);
            java.lang.String string4 = mjPublisherInfo.getString(4);
            if (string4 == null) {
                string4 = "";
            }
            c17.put("template_id", string4);
            java.lang.String string5 = mjPublisherInfo.getString(5);
            if (string5 == null) {
                string5 = "";
            }
            c17.put("template_tab_id", string5);
            c17.put("template_position", java.lang.Integer.valueOf(mjPublisherInfo.getInteger(6)));
            java.lang.String string6 = mjPublisherInfo.getString(7);
            c17.put("template_session_buffer", string6 != null ? string6 : "");
            c17.put("template_type", java.lang.Integer.valueOf(mjPublisherInfo.getInteger(12)));
            c17.put("template_is_favorite", java.lang.Boolean.valueOf(mjPublisherInfo.getBoolean(13)));
            c17.put("template_is_aigc", java.lang.Boolean.valueOf(mjPublisherInfo.getBoolean(14)));
            c17.put("export_scene", java.lang.Integer.valueOf(mjPublisherInfo.getInteger(8)));
            c17.put("is_sc_asset_generate", java.lang.Boolean.valueOf(mjPublisherInfo.getBoolean(10)));
            c17.put("creation_page_id", java.lang.Integer.valueOf(mjPublisherInfo.getInteger(11)));
        }
        return c17;
    }

    public final long l(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        java.util.LinkedList<r45.mb4> mediaList;
        java.util.LinkedList linkedList;
        r45.ho6 ho6Var;
        long j17 = 0;
        if (finderItem != null && (mediaList = finderItem.getMediaList()) != null) {
            for (r45.mb4 mb4Var : mediaList) {
                int integer = mb4Var.getInteger(7);
                if (integer == 0) {
                    r45.h70 h70Var = (r45.h70) mb4Var.getCustom(21);
                    integer = (int) com.tencent.mm.vfs.w6.k((h70Var == null || (linkedList = h70Var.f375897d) == null || (ho6Var = (r45.ho6) kz5.n0.Z(linkedList)) == null) ? null : ho6Var.f376333d);
                }
                j17 += integer;
            }
        }
        return j17;
    }

    public final r45.ej2 m(bw5.jr jrVar) {
        r45.ej2 ej2Var = (r45.ej2) f125240d.get(n(jrVar));
        if (ej2Var != null) {
            return ej2Var;
        }
        r45.ej2 ej2Var2 = new r45.ej2();
        ej2Var2.set(2, java.lang.Integer.valueOf(jrVar.f29119d));
        return ej2Var2;
    }

    public final java.lang.String n(bw5.jr jrVar) {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = f125238b;
        if (finderFeedReportObject == null || (str = finderFeedReportObject.getFlowId()) == null) {
            str = "";
        }
        return str + '_' + jrVar.f29119d;
    }

    public final java.lang.String p(com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject) {
        java.lang.String flowId = finderFeedReportObject != null ? finderFeedReportObject.getFlowId() : null;
        return flowId == null ? "" : flowId;
    }

    public final r45.rb4 q(com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, int i17, java.lang.String str) {
        java.util.LinkedList<r45.mb4> mediaList;
        r45.mb4 mb4Var;
        r45.h70 h70Var;
        java.util.LinkedList<r45.mb4> mediaList2;
        r45.mb4 mb4Var2;
        java.util.LinkedList<r45.mb4> mediaList3;
        r45.rb4 rb4Var = new r45.rb4();
        int i18 = 0;
        rb4Var.set(0, java.lang.Integer.valueOf(finderFeedReportObject != null ? finderFeedReportObject.getVideoPostType() : 0));
        if (finderItem != null && (mediaList3 = finderItem.getMediaList()) != null) {
            i18 = mediaList3.size();
        }
        rb4Var.set(1, java.lang.Integer.valueOf(i18));
        rb4Var.set(2, java.lang.Long.valueOf(f125237a.l(finderItem)));
        java.lang.Long l17 = null;
        java.lang.Long valueOf = (finderItem == null || (mediaList2 = finderItem.getMediaList()) == null || (mb4Var2 = (r45.mb4) kz5.n0.Z(mediaList2)) == null) ? null : java.lang.Long.valueOf(mb4Var2.getInteger(3));
        long j17 = 0;
        if ((valueOf != null && valueOf.longValue() == 0) || valueOf == null) {
            if (finderItem != null && (mediaList = finderItem.getMediaList()) != null && (mb4Var = (r45.mb4) kz5.n0.Z(mediaList)) != null && (h70Var = (r45.h70) mb4Var.getCustom(21)) != null) {
                l17 = java.lang.Long.valueOf(h70Var.f375899f);
            }
            valueOf = l17;
        }
        if (valueOf != null) {
            rb4Var.set(3, java.lang.Long.valueOf(valueOf.longValue()));
        }
        long id6 = finderItem != null ? finderItem.getId() : 0L;
        if (id6 != 0) {
            j17 = id6;
        } else if (finderFeedReportObject != null) {
            j17 = finderFeedReportObject.getDraftObjectId();
        }
        rb4Var.set(4, pm0.v.u(j17));
        rb4Var.set(5, java.lang.Integer.valueOf(i17));
        rb4Var.set(6, str);
        return rb4Var;
    }

    public final long r(com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject) {
        long videoRecordTime = (finderFeedReportObject.getVideoRecordTime() <= finderFeedReportObject.getVideoCropTime() || finderFeedReportObject.getVideoCropTime() <= 0) ? finderFeedReportObject.getVideoRecordTime() : finderFeedReportObject.getVideoCropTime();
        com.tencent.mars.xlog.Log.i("Finder.FinderPostReportLogic", "[getVideoDurationMs] videoDurationMs=" + videoRecordTime);
        return videoRecordTime;
    }

    public final boolean s() {
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = f125238b;
        if (finderFeedReportObject != null && finderFeedReportObject.getEnterScene() == 105) {
            return true;
        }
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = f125238b;
        return finderFeedReportObject2 != null && finderFeedReportObject2.getEnterScene() == 110;
    }

    public final void u(com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, long j17) {
        java.lang.Long l17 = (java.lang.Long) f125241e.remove(h(str, str2, str3));
        if (l17 == null) {
            l17 = 0L;
        }
        r45.xp2 o17 = o(this, finderFeedReportObject, str, str2, str3, i17, l17.longValue(), null, 64, null);
        if (o17 != null) {
            o17.set(4, java.lang.Long.valueOf(j17 > 0 ? j17 : c01.id.c()));
            t(f125237a, null, null, new com.tencent.mm.plugin.finder.report.n2(finderFeedReportObject, null), 3, null);
        }
    }

    public final void x(com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, long j17) {
        r45.xp2 o17 = o(this, finderFeedReportObject, str, str2, str3, i17, 0L, new com.tencent.mm.plugin.finder.report.h2(this), 32, null);
        if (o17 != null) {
            o17.set(3, java.lang.Long.valueOf(j17 > 0 ? j17 : c01.id.c()));
            com.tencent.mm.plugin.finder.report.p2 p2Var = f125237a;
            java.lang.String h17 = p2Var.h(str, str2, str3);
            if (h17.length() > 0) {
                f125241e.put(h17, java.lang.Long.valueOf(o17.getLong(3)));
            }
            t(p2Var, null, null, new com.tencent.mm.plugin.finder.report.n2(finderFeedReportObject, null), 3, null);
        }
    }
}
