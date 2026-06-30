package vn2;

/* loaded from: classes2.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final vn2.u0 f438387a = new vn2.u0();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f438388b = false;

    /* renamed from: c, reason: collision with root package name */
    public static int f438389c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f438390d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f438391e;

    /* renamed from: f, reason: collision with root package name */
    public static jz5.l f438392f;

    /* renamed from: g, reason: collision with root package name */
    public static jz5.l f438393g;

    static {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        f438390d = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.E7).getValue()).r()).intValue() == 1;
    }

    public final boolean a(java.lang.String str, java.lang.String source, android.app.Activity activity, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, boolean z17, boolean z18, float f17) {
        boolean z19;
        r45.qt2 V6;
        boolean Ni;
        r45.yu2 yu2Var;
        java.lang.String tag = str;
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(feed, "feed");
        float f18 = f17 * 100;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = feed.getFeedObject().getFeedObject();
        r45.dm2 object_extend = feed.getFeedObject().getFeedObject().getObject_extend();
        if (object_extend == null) {
            object_extend = new r45.dm2();
        }
        feedObject.setObject_extend(object_extend);
        r45.dm2 object_extend2 = feed.getFeedObject().getFeedObject().getObject_extend();
        if (object_extend2 != null) {
            r45.dm2 object_extend3 = feed.getFeedObject().getFeedObject().getObject_extend();
            if (object_extend3 == null || (yu2Var = (r45.yu2) object_extend3.getCustom(35)) == null) {
                yu2Var = new r45.yu2();
            }
            object_extend2.set(35, yu2Var);
        }
        r45.dm2 object_extend4 = feed.getFeedObject().getFeedObject().getObject_extend();
        r45.yu2 yu2Var2 = object_extend4 != null ? (r45.yu2) object_extend4.getCustom(35) : null;
        if (yu2Var2 != null) {
            java.lang.Number valueOf = java.lang.Integer.valueOf(c01.id.e());
            if (!(valueOf.intValue() > 0)) {
                valueOf = null;
            }
            if (valueOf == null) {
                valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000);
            }
            yu2Var2.set(1, java.lang.Integer.valueOf(valueOf.intValue()));
        }
        boolean z27 = f438388b;
        pf5.u uVar = pf5.u.f353936a;
        if (z27) {
            try {
                try {
                    com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                    V6 = nyVar != null ? nyVar.V6() : null;
                    ((ey2.g1) uVar.e(c61.l7.class).a(ey2.g1.class)).Q6(feed);
                    java.lang.Object a17 = uVar.b(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                    kotlin.jvm.internal.o.f(a17, "get(...)");
                    ec2.d e27 = zy2.ra.e2((zy2.ra) a17, 0, 1, null);
                    if (e27 != null) {
                        e27.a(new com.tencent.mm.plugin.finder.megavideo.topstory.flow.d1(feed, com.tencent.mm.plugin.finder.megavideo.topstory.flow.c1.f120908d));
                    }
                    androidx.lifecycle.c1 a18 = uVar.b(activity).a(um3.b.class);
                    kotlin.jvm.internal.o.f(a18, "get(...)");
                    pf5.e.launch$default((pf5.e) a18, null, null, new vn2.t(V6, feed, tag, null), 3, null);
                    Ni = ((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).Ni();
                } catch (java.lang.Throwable unused) {
                    z19 = false;
                    return z19;
                }
                try {
                    activity.getWindow().getDecorView().postDelayed(new vn2.w(activity, z18, Ni, feed, V6), 100L);
                    if (z17) {
                        n(V6, feed, f18);
                    }
                    tag = str;
                    com.tencent.mars.xlog.Log.i(tag, source + " addSeeLaterToNative " + feed.getItemId() + ' ' + feed.getFeedObject().getNickName() + ' ' + hc2.o0.l(feed.getFeedObject().getFeedObject()) + ",isTopStoryShow:" + Ni + ", playPercent:" + f18 + ", needClickAction:" + z18 + ",reportMenuClick:" + z17);
                    z19 = true;
                } catch (java.lang.Exception e17) {
                    e = e17;
                    tag = str;
                    hc2.c.a(e, tag.concat("_addSeeLater"));
                    z19 = false;
                    return z19;
                }
            } catch (java.lang.Exception e18) {
                e = e18;
            }
            return z19;
        }
        boolean Ni2 = ((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).Ni();
        r45.td4 td4Var = (r45.td4) ((ey2.g1) uVar.e(c61.l7.class).a(ey2.g1.class)).f257378g.getCustom(0);
        java.lang.String string = td4Var != null ? td4Var.getString(0) : null;
        com.tencent.mars.xlog.Log.i(tag, source + " addSeeLaterToLiteApp appId:" + string + ',' + feed.getItemId() + ' ' + feed.getFeedObject().getNickName() + ' ' + hc2.o0.l(feed.getFeedObject().getFeedObject()) + ",isTopStoryShow:" + Ni2 + ",playPercent:" + f18 + ", needClickAction:" + z18);
        if (string == null || string.length() == 0) {
            return false;
        }
        ((ey2.g1) uVar.e(c61.l7.class).a(ey2.g1.class)).Q6(feed);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("feed_id", pm0.v.u(feed.getItemId()));
        hashMap.put("session_buffer", feed.g0());
        hashMap.put("comment_scene", java.lang.String.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.b(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n));
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mars.xlog.Log.i("MegaVideoManager", "dispatchStore appId:" + string + ",actionName:finderAddFeedSeeLater,params:" + hashMap + '!');
        if (string == null || string.length() == 0) {
            com.tencent.mars.xlog.Log.e("MegaVideoManager", "dispatchStore fail,appId:" + string + '!');
        } else if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).tk(string)) {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).rj(string, "finderAddFeedSeeLater", hashMap);
        } else {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).qj(string, 60, false, 10L, new vn2.i0(string, "finderAddFeedSeeLater", hashMap));
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V62 = nyVar2 != null ? nyVar2.V6() : null;
        activity.getWindow().getDecorView().postDelayed(new vn2.w(activity, z18, Ni2, feed, V62), 100L);
        if (z17) {
            n(V62, feed, f18);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if ((r2 - (new java.util.GregorianCalendar(r13.get(1), r13.get(2), r13.get(5)).getTimeInMillis() - (6 * 86400000))) < 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(zn2.c r13) {
        /*
            r12 = this;
            r0 = 0
            r1 = 1
            if (r13 == 0) goto L25
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r13.getFeedObject()
            if (r13 == 0) goto L25
            com.tencent.mm.protocal.protobuf.FinderObject r13 = r13.getFeedObject()
            if (r13 == 0) goto L25
            r45.dm2 r13 = r13.getObject_extend()
            if (r13 == 0) goto L25
            r2 = 35
            com.tencent.mm.protobuf.f r13 = r13.getCustom(r2)
            r45.yu2 r13 = (r45.yu2) r13
            if (r13 == 0) goto L25
            int r13 = r13.getInteger(r1)
            goto L26
        L25:
            r13 = r0
        L26:
            long r2 = (long) r13
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r4 = 0
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r13 > 0) goto L31
            goto L59
        L31:
            java.util.GregorianCalendar r13 = new java.util.GregorianCalendar
            r13.<init>()
            java.util.GregorianCalendar r6 = new java.util.GregorianCalendar
            int r7 = r13.get(r1)
            r8 = 2
            int r8 = r13.get(r8)
            r9 = 5
            int r13 = r13.get(r9)
            r6.<init>(r7, r8, r13)
            long r6 = r6.getTimeInMillis()
            r13 = 6
            long r8 = (long) r13
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            long r8 = r8 * r10
            long r6 = r6 - r8
            long r2 = r2 - r6
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r13 >= 0) goto L5a
        L59:
            r0 = r1
        L5a:
            r13 = r0 ^ 1
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: vn2.u0.b(zn2.c):boolean");
    }

    public final void c(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        activity.getWindow().getDecorView().postDelayed(new vn2.h0(activity), 100L);
    }

    public final void d(java.lang.String tag, android.content.Context context, r45.qt2 qt2Var, ym5.q1 q1Var, com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader loader, int i17, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, boolean z17, boolean z18) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(loader, "loader");
        kotlin.jvm.internal.o.g(feed, "feed");
        java.util.List<E> listOfType = loader.getListOfType(so2.j5.class);
        int indexOf = listOfType.indexOf(feed);
        if (indexOf >= 0) {
            e(context, feed.getItemId(), feed.g0(), z17, qt2Var, new vn2.m0(feed, loader, qt2Var, z18, context, q1Var, null), new vn2.o0(context, tag, null));
        } else {
            com.tencent.mars.xlog.Log.i(tag, "deleteSeeLater pos error=" + indexOf + ", feed=" + feed + ", dataList=" + listOfType);
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("view_id", "remove_watch_later_card");
        if (qt2Var == null || (str = qt2Var.getString(1)) == null) {
            str = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", str);
        lVarArr[2] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : "");
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(feed.getItemId()));
        ((cy1.a) rVar).yj("view_clk", null, kz5.c1.k(lVarArr), 1, true);
    }

    public final void e(android.content.Context context, long j17, java.lang.String str, boolean z17, r45.qt2 qt2Var, yz5.p pVar, yz5.p pVar2) {
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(um3.b.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        pf5.e.launch$default((pf5.e) a17, null, null, new vn2.p0(context, j17, str, z17, qt2Var, pVar, pVar2, null), 3, null);
    }

    public final boolean g() {
        int i17 = f438389c;
        return i17 == 1 || i17 == 2;
    }

    public final boolean h() {
        return f438389c == 1;
    }

    public final java.lang.String i(int i17) {
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        java.lang.Number valueOf = java.lang.Integer.valueOf(c01.id.e());
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf == null) {
            valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000);
        }
        int intValue = (valueOf.intValue() - i17) * 1000;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (intValue < 0) {
            return "";
        }
        if (intValue < 14400000) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491382lt1);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        long j17 = i17 * 1000;
        java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
        long timeInMillis = j17 - gregorianCalendar2.getTimeInMillis();
        if (timeInMillis >= 0 && timeInMillis < 86400000) {
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491383lt2);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            return string2;
        }
        if (j17 - (gregorianCalendar2.getTimeInMillis() - 86400000) >= 0) {
            java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491384lt3);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            return string3;
        }
        if (j17 - (gregorianCalendar2.getTimeInMillis() - 172800000) >= 0) {
            java.lang.String string4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491385lt4);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            return string4;
        }
        if (j17 - (gregorianCalendar2.getTimeInMillis() - 518400000) < 0) {
            return "";
        }
        java.lang.String string5 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.lt6);
        kotlin.jvm.internal.o.f(string5, "getString(...)");
        return string5;
    }

    public final long j(com.tencent.mm.plugin.finder.storage.FinderItem feedObject) {
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        if (((r45.mb4) kz5.n0.Z(com.tencent.mm.plugin.finder.storage.FeedData.Companion.b(feedObject).getMediaList())) == null) {
            return 0L;
        }
        return cu2.x.c(cu2.x.f222449a, ds2.h.f242866a.c(feedObject.getId(), r0, false).n(), false, false, false, 14, null).field_playProgress * ((float) r0.getLong(24));
    }

    public final boolean k() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128055z7).getValue()).r()).intValue() == 2;
    }

    public final void l(java.lang.String tag, java.lang.String msg) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    public final void m(java.lang.String tag, java.lang.String msg) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i(tag, "MegaVideoPath\t".concat(msg));
    }

    public final void n(r45.qt2 qt2Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, float f17) {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[7];
        lVarArr[0] = new jz5.l("view_id", "watch_later_in_forward_menu");
        lVarArr[1] = new jz5.l("feed_id", pm0.v.u(baseFinderFeed.getItemId()));
        lVarArr[2] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.getString(1) : null);
        lVarArr[3] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.getString(2) : null);
        lVarArr[4] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null);
        java.lang.String sessionBuffer = baseFinderFeed.getFeedObject().getFeedObject().getSessionBuffer();
        if (sessionBuffer == null) {
            sessionBuffer = "";
        }
        lVarArr[5] = new jz5.l("session_buffer", sessionBuffer);
        lVarArr[6] = new jz5.l("click_playpercent", java.lang.Float.valueOf(f17));
        ((cy1.a) rVar).yj("view_clk", null, kz5.c1.k(lVarArr), 1, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(android.content.Context r17, long r18, java.lang.String r20, boolean r21, r45.qt2 r22, yz5.p r23, yz5.p r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vn2.u0.o(android.content.Context, long, java.lang.String, boolean, r45.qt2, yz5.p, yz5.p, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
