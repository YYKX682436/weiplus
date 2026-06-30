package zl2;

/* loaded from: classes3.dex */
public final class q4 {

    /* renamed from: d */
    public static boolean f473936d;

    /* renamed from: a */
    public static final zl2.q4 f473933a = new zl2.q4();

    /* renamed from: b */
    public static final jz5.g f473934b = jz5.h.b(zl2.i4.f473822d);

    /* renamed from: c */
    public static final jz5.g f473935c = jz5.h.b(zl2.h4.f473806d);

    /* renamed from: e */
    public static final java.lang.String f473937e = "https://dldir1v6.qq.com/weixin/checkresupdate/heart_9dad86cce3344f11ba624759a5a73420.png";

    public static final org.json.JSONObject M(java.util.List list) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.Iterator it = list.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            r45.qa4 qa4Var = (r45.qa4) it.next();
            jSONObject.put(qa4Var.getString(0), qa4Var.getLong(1) - j17);
            j17 = qa4Var.getLong(1);
        }
        return jSONObject;
    }

    public static /* synthetic */ void N(zl2.q4 q4Var, java.lang.String str, long j17, java.lang.String str2, long j18, java.util.LinkedList linkedList, mn0.k0 k0Var, java.lang.String str3, int i17, java.lang.Object obj) {
        q4Var.L(str, j17, str2, j18, linkedList, k0Var, (i17 & 64) != 0 ? "" : str3);
    }

    public static /* synthetic */ r45.rn1 d(zl2.q4 q4Var, r45.v52 v52Var, java.util.LinkedList linkedList, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            v52Var = null;
        }
        if ((i17 & 2) != 0) {
            linkedList = null;
        }
        return q4Var.c(v52Var, linkedList);
    }

    public static /* synthetic */ void k(zl2.q4 q4Var, android.view.View view, int i17, int i18, long j17, yz5.l lVar, int i19, java.lang.Object obj) {
        if ((i19 & 8) != 0) {
            j17 = 300;
        }
        long j18 = j17;
        if ((i19 & 16) != 0) {
            lVar = null;
        }
        q4Var.j(view, i17, i18, j18, lVar);
    }

    public static /* synthetic */ java.lang.String r(zl2.q4 q4Var, long j17, java.lang.Boolean bool, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        java.lang.Boolean bool2 = bool;
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        boolean z19 = z17;
        if ((i17 & 8) != 0) {
            z18 = false;
        }
        return q4Var.q(j17, bool2, z19, z18);
    }

    public static final java.lang.String s(kotlin.jvm.internal.h0 h0Var, boolean z17, long j17, kotlin.jvm.internal.h0 h0Var2, java.lang.Boolean bool) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getStringArray(com.tencent.mm.R.array.f478029ae)[(((java.util.Calendar) h0Var.f310123d).get(7) + 5) % 7];
        if (!kotlin.jvm.internal.o.b(bool, java.lang.Boolean.FALSE)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append((java.lang.Object) android.text.format.DateFormat.format(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492135fc2), j17));
            sb6.append(h0Var2.f310123d);
            return sb6.toString();
        }
        if (z17) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            sb7.append(context.getString(com.tencent.mm.R.string.f491516dc4, android.text.format.DateFormat.format(context.getString(com.tencent.mm.R.string.f492135fc2), j17), str));
            sb7.append(h0Var2.f310123d);
            return sb7.toString();
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        sb8.append(context2.getString(com.tencent.mm.R.string.f491517dc5, android.text.format.DateFormat.format(context2.getString(com.tencent.mm.R.string.f492135fc2), j17)));
        sb8.append(h0Var2.f310123d);
        return sb8.toString();
    }

    public static java.lang.String t(zl2.q4 q4Var, r45.h32 noticeInfo, int i17, boolean z17, boolean z18, boolean z19, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        if ((i18 & 4) != 0) {
            z17 = false;
        }
        boolean z27 = (i18 & 8) != 0 ? true : z18;
        boolean z28 = (i18 & 16) != 0 ? false : z19;
        q4Var.getClass();
        kotlin.jvm.internal.o.g(noticeInfo, "noticeInfo");
        if (noticeInfo.getInteger(20) == 1) {
            return q4Var.v(noticeInfo.getInteger(0) * 1000);
        }
        java.lang.String q17 = q4Var.q(noticeInfo.getInteger(0) * 1000, java.lang.Boolean.valueOf(z17), z27, z28);
        if (i17 != 0) {
            q17 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(i17, q17);
        }
        kotlin.jvm.internal.o.d(q17);
        return q17;
    }

    public static final jz5.l u(kotlin.jvm.internal.h0 h0Var, boolean z17, java.lang.String str, long j17, kotlin.jvm.internal.h0 h0Var2, java.lang.Boolean bool) {
        return kotlin.jvm.internal.o.b(bool, java.lang.Boolean.FALSE) ? z17 ? new jz5.l(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491516dc4, android.text.format.DateFormat.format(str, j17), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getStringArray(com.tencent.mm.R.array.f478029ae)[(((java.util.Calendar) h0Var.f310123d).get(7) + 5) % 7]), h0Var2.f310123d) : new jz5.l(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491517dc5, android.text.format.DateFormat.format(str, j17)), h0Var2.f310123d) : new jz5.l(android.text.format.DateFormat.format(str, j17).toString(), h0Var2.f310123d);
    }

    public final long A() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        kotlin.jvm.internal.o.f(calendar, "getInstance(...)");
        calendar.setTimeInMillis(java.lang.System.currentTimeMillis());
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public final int B(int i17) {
        ae2.in inVar = ae2.in.f3688a;
        java.lang.Object r17 = ((lb2.j) ((jz5.n) ae2.in.f3779j0).getValue()).r();
        if (!(((java.lang.Number) r17).intValue() > 0)) {
            r17 = null;
        }
        java.lang.Integer num = (java.lang.Integer) r17;
        if (num == null) {
            return i17;
        }
        int intValue = num.intValue();
        if (intValue == 1) {
            return 71;
        }
        if (intValue == 2) {
            return 81;
        }
        if (intValue == 3) {
            return 91;
        }
        if (intValue != 4) {
            return i17;
        }
        return 101;
    }

    public final boolean C(com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        kotlin.jvm.internal.o.g(item, "item");
        return item.getFeedObject().getMediaType() == 9;
    }

    public final boolean D(gk2.e buContext) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        long t17 = ((mm2.c1) buContext.a(mm2.c1.class)).f328778a5 ? gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_GAME_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, 0L) : gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, 0L);
        ae2.b2 b2Var = ae2.b2.f3461a;
        jz5.g gVar = ae2.b2.N;
        boolean z17 = true;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() == -1) {
            z17 = pm0.v.z((int) t17, 1);
        } else if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() != 1) {
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderUtil2", "flag = " + t17 + " , localConfig = " + ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() + " , result = " + z17);
        return z17;
    }

    public final boolean E() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return z65.c.a();
    }

    public final boolean F(boolean z17) {
        long t17 = z17 ? gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_GAME_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, 0L) : gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, 0L);
        ae2.b2 b2Var = ae2.b2.f3461a;
        jz5.g gVar = ae2.b2.V;
        boolean z18 = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() == -1 ? pm0.v.z((int) t17, 64) : ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() == 1;
        com.tencent.mars.xlog.Log.i("Finder.FinderUtil2", "[isVipLiveEnable] flag = " + t17 + " , localConfig = " + ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() + " , result = " + z18);
        return z18;
    }

    public final void G(java.lang.String bizUsername, java.lang.String finderUsername, android.content.Context context, long j17, java.lang.String liveId, int i17) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveId, "liveId");
        com.tencent.mars.xlog.Log.i("Finder.FinderUtil2", "#liveJumpToBizContactProfile bizUsername=" + bizUsername + " sessionId=" + j17 + " liveId=" + liveId + " subScene=" + i17);
        if (bizUsername.length() == 0) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", bizUsername);
        intent.putExtra("Contact_Scene", 208);
        intent.putExtra("Contact_Sub_Scene", i17);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("Contact_Finder_Buffer", p52.h.f352016a.b(finderUsername));
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("Contact_Scene_Note", liveId);
        intent.putExtra("biz_profile_tab_type", 1);
        intent.putExtra("biz_profile_enter_from_finder", true);
        j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }

    public final void H() {
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("Finder.FinderUtil2", "loadPagLib account is not ready");
            return;
        }
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.T0).getValue()).r()).intValue() != 0) {
            I();
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(zl2.k4.f473863d);
    }

    public final void I() {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1279L, 200L, 1L);
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderUtil2", "loadPagLib result:" + com.tencent.mm.plugin.expansions.i0.g("pag"));
        g0Var.C(1279L, 201L, 1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J(android.content.Context context, boolean z17, yz5.p onModifyEnd) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(onModifyEnd, "onModifyEnd");
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        int i17 = z17 ? 1 : 2;
        zl2.l4 l4Var = new zl2.l4(z17, onModifyEnd);
        hb2.w wVar = hb2.w.f280108e;
        wVar.getClass();
        androidx.lifecycle.y yVar = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
        if (yVar == null) {
            return;
        }
        r45.g33 g33Var = new r45.g33();
        g33Var.set(0, java.lang.Integer.valueOf(i17));
        g33Var.set(1, 2);
        com.tencent.mars.xlog.Log.i(hb2.w.f280109f, "[modifyWxUserSetting] op_type:" + g33Var.getInteger(0) + ", scene:" + g33Var.getInteger(1));
        hb2.w0.h(wVar, yVar, g33Var, l4Var, false, false, 24, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0429  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean K(android.content.Context r31, com.tencent.mm.protocal.protobuf.FinderObject r32, android.view.View r33) {
        /*
            Method dump skipped, instructions count: 1206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.q4.K(android.content.Context, com.tencent.mm.protocal.protobuf.FinderObject, android.view.View):boolean");
    }

    public final void L(java.lang.String commentScene, long j17, java.lang.String sessionId, long j18, java.util.LinkedList linkedList, mn0.k0 playStep, java.lang.String extra) {
        boolean z17;
        org.json.JSONObject M;
        kotlin.jvm.internal.o.g(commentScene, "commentScene");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(playStep, "playStep");
        kotlin.jvm.internal.o.g(extra, "extra");
        java.util.ArrayList b17 = playStep.b();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
        java.util.Iterator it = b17.iterator();
        while (true) {
            z17 = true;
            if (!it.hasNext()) {
                break;
            }
            jz5.l lVar = (jz5.l) it.next();
            r45.qa4 qa4Var = new r45.qa4();
            qa4Var.set(0, (java.lang.String) lVar.f302833d);
            qa4Var.set(1, java.lang.Long.valueOf(((java.lang.Number) lVar.f302834e).longValue()));
            arrayList.add(qa4Var);
        }
        if (linkedList != null && !linkedList.isEmpty()) {
            z17 = false;
        }
        if (z17) {
            M = M(arrayList);
        } else if (arrayList.isEmpty()) {
            M = M(linkedList);
        } else {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            linkedList2.addAll(linkedList);
            linkedList2.addAll(arrayList);
            kz5.g0.t(linkedList2, zl2.o4.f473913d);
            M = M(linkedList2);
        }
        zy2.qa qaVar = (zy2.qa) i95.n0.c(zy2.qa.class);
        long j19 = playStep.f329767d;
        playStep.f329767d = 0L;
        java.lang.String jSONObject = M.toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        ((com.tencent.mm.plugin.finder.report.o3) qaVar).Bk(2, 0L, j19, 0, 0, 0L, 0L, 0L, j18, 0, 0, jSONObject, 0, 0, "", 0, 0, commentScene, extra, "", j17, 0L, sessionId);
    }

    public final int O(java.lang.String rgbaColor) {
        int l17;
        kotlin.jvm.internal.o.g(rgbaColor, "rgbaColor");
        try {
            if (rgbaColor.length() != 9) {
                l17 = hc2.l.l(rgbaColor);
            } else {
                char charAt = rgbaColor.charAt(0);
                java.lang.String substring = rgbaColor.substring(1, 3);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                java.lang.String substring2 = rgbaColor.substring(3, 5);
                kotlin.jvm.internal.o.f(substring2, "substring(...)");
                java.lang.String substring3 = rgbaColor.substring(5, 7);
                kotlin.jvm.internal.o.f(substring3, "substring(...)");
                java.lang.String substring4 = rgbaColor.substring(7, 9);
                kotlin.jvm.internal.o.f(substring4, "substring(...)");
                l17 = hc2.l.l(charAt + substring4 + substring + substring2 + substring3);
            }
            return l17;
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    public final void P(java.lang.String content) {
        kotlin.jvm.internal.o.g(content, "content");
        db5.t7.f(com.tencent.mm.sdk.platformtools.x2.f193071a, content, zl2.p4.f473923a);
    }

    public final void Q() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        db5.t7.i(context, context.getString(com.tencent.mm.R.string.epy), com.tencent.mm.R.raw.icons_filled_error);
    }

    public final void R(java.lang.String prefix) {
        kotlin.jvm.internal.o.g(prefix, "prefix");
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Hk();
        boolean c17 = com.tencent.mm.sdk.platformtools.a0.c();
        com.tencent.mars.xlog.Log.i("Finder.FinderUtil2", prefix + " tryLoadPagLibrary pag start,gpVersion:" + c17 + ",isPagEnable:true");
        if (c17) {
            H();
        } else {
            H();
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderUtil2", prefix.concat(" tryLoadPagLibrary pag end"));
    }

    public final void a(db5.g4 menu) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(menu, "menu");
        java.util.LinkedList a17 = com.tencent.mm.plugin.finder.live.util.n2.f115640a.a();
        int integer = g92.b.f269769e.k2().getInteger(4);
        java.util.Iterator it = a17.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.of1) obj).getInteger(2) == integer) {
                    break;
                }
            }
        }
        r45.of1 of1Var = (r45.of1) obj;
        java.lang.String string = of1Var != null ? of1Var.getString(0) : null;
        if (f473936d) {
            menu.w(403, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.npm, string), com.tencent.mm.R.raw.icons_outlined_exchange);
        } else {
            menu.g(403, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.npm, string), com.tencent.mm.R.raw.icons_outlined_exchange);
        }
        f473936d = false;
    }

    public final r45.om1 b() {
        r45.om1 om1Var = new r45.om1();
        r45.nm1 nm1Var = new r45.nm1();
        if (com.tencent.mars.MarsContext.getContext().getManager(com.tencent.mars.cdn.CdnManager.class) != null) {
            nm1Var.set(0, java.lang.Integer.valueOf(((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).getRecentAverageSpeed(2)));
        }
        om1Var.set(0, nm1Var);
        return om1Var;
    }

    public final r45.rn1 c(r45.v52 v52Var, java.util.LinkedList linkedList) {
        int i17;
        r45.rn1 rn1Var = new r45.rn1();
        rn1Var.set(0, java.lang.Integer.valueOf(com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a)));
        rn1Var.set(1, com.tencent.mars.comm.NetStatusUtil.getNetTypeString(com.tencent.mm.sdk.platformtools.x2.f193071a));
        if (com.tencent.mars.MarsContext.getContext().getManager(com.tencent.mars.cdn.CdnManager.class) != null) {
            rn1Var.set(2, java.lang.Integer.valueOf(((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).getRecentAverageSpeed(2)));
        }
        rn1Var.set(3, wo.w0.m());
        rn1Var.set(13, android.os.Build.CPU_ABI);
        rn1Var.set(4, android.os.Build.BRAND);
        rn1Var.set(5, android.os.Build.DISPLAY);
        rn1Var.set(6, android.os.Build.VERSION.RELEASE);
        if (v52Var != null) {
            rn1Var.set(7, v52Var);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            rn1Var.set(8, linkedList);
        }
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).getClass();
        com.tencent.mm.modelcdntran.l1 cj6 = com.tencent.mm.modelcdntran.s1.cj();
        synchronized (cj6.f71051o) {
            i17 = cj6.f71052p;
        }
        boolean z17 = i17 != 0;
        if (!z17 && ((java.lang.Boolean) ((jz5.n) f473934b).getValue()).booleanValue()) {
            rn1Var.set(9, 1);
        }
        if (!z17 && ((java.lang.Boolean) ((jz5.n) f473935c).getValue()).booleanValue()) {
            rn1Var.set(10, 1);
        }
        java.util.LinkedList list = rn1Var.getList(14);
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = cw2.p4.f223916f;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(copyOnWriteArrayList, 10));
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            r45.sf0 sf0Var = (r45.sf0) it.next();
            cw2.p4 p4Var = cw2.p4.f223911a;
            kotlin.jvm.internal.o.d(sf0Var);
            p4Var.k(sf0Var);
            arrayList.add(sf0Var);
        }
        list.addAll(arrayList);
        com.tencent.mars.xlog.Log.i("Finder.FinderUtil2", "buildLiveClientStatus: isCodec1Limit=" + z17 + ", cpu_architecture=" + rn1Var.getString(13) + ", recent_finder_download_speed=" + rn1Var.getList(14).size());
        return rn1Var;
    }

    public final long e(java.util.LinkedList linkedList, mn0.k0 playStep) {
        kotlin.jvm.internal.o.g(playStep, "playStep");
        if (linkedList == null) {
            return 0L;
        }
        long j17 = playStep.f329766c;
        playStep.f329766c = 0L;
        r45.qa4 qa4Var = (r45.qa4) linkedList.getFirst();
        long j18 = qa4Var != null ? qa4Var.getLong(1) : 0L;
        if (1 <= j18 && j18 < j17) {
            return j17 - j18;
        }
        return 0L;
    }

    public final jz5.l f(int i17, float f17, float f18, float f19, float f27) {
        jz5.l lVar;
        if (f18 == 0.0f) {
            return null;
        }
        if (f17 == 0.0f) {
            return null;
        }
        if (f27 == 0.0f) {
            return null;
        }
        if (f19 == 0.0f) {
            return null;
        }
        if (i17 == android.widget.ImageView.ScaleType.FIT_CENTER.ordinal()) {
            if (f27 / f19 < f18 / f17) {
                return new jz5.l(java.lang.Integer.valueOf((int) f17), java.lang.Integer.valueOf((int) ((f27 * f17) / f19)));
            }
            lVar = new jz5.l(java.lang.Integer.valueOf((int) ((f19 * f18) / f27)), java.lang.Integer.valueOf((int) f18));
        } else {
            if (f27 / f19 > f18 / f17) {
                return new jz5.l(java.lang.Integer.valueOf((int) f17), java.lang.Integer.valueOf((int) ((f27 * f17) / f19)));
            }
            lVar = new jz5.l(java.lang.Integer.valueOf((int) ((f19 * f18) / f27)), java.lang.Integer.valueOf((int) f18));
        }
        return lVar;
    }

    public final boolean g() {
        boolean E = E();
        ae2.in inVar = ae2.in.f3688a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3691a2).getValue()).r()).intValue();
        com.tencent.mars.xlog.Log.i("Finder.FinderUtil2", "canShowVisitorRoleEntrance isTest:" + E + ",configValue:" + intValue);
        if (intValue == 0) {
            return true;
        }
        if (intValue != 1) {
            return false;
        }
        return E;
    }

    public final com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo h(r45.ce0 ce0Var) {
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo customSubjectInfo = com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo.f77386f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("convertToCustomSubjectInfo page:");
        sb6.append(ce0Var != null ? ce0Var.getString(2) : null);
        sb6.append(", ");
        sb6.append(ce0Var != null ? ce0Var.getString(3) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderUtil2", sb6.toString());
        if (ce0Var != null) {
            java.lang.String string = ce0Var.getString(2);
            if (!(string == null || string.length() == 0)) {
                java.lang.String string2 = ce0Var.getString(3);
                if (!(string2 == null || string2.length() == 0)) {
                    java.lang.String string3 = ce0Var.getString(3);
                    if (string3 == null) {
                        string3 = "";
                    }
                    java.lang.String string4 = ce0Var.getString(2);
                    customSubjectInfo = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo(string3, string4 != null ? string4 : "");
                }
            }
        }
        return customSubjectInfo;
    }

    public final r45.ce0 i(l81.b1 bundle) {
        kotlin.jvm.internal.o.g(bundle, "bundle");
        if (kotlin.jvm.internal.o.b(bundle.G.F, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo.f77386f)) {
            return null;
        }
        r45.ce0 ce0Var = new r45.ce0();
        ce0Var.set(2, bundle.G.F.f77388e);
        ce0Var.set(3, bundle.G.F.f77387d);
        return ce0Var;
    }

    public final void j(android.view.View view, int i17, int i18, long j17, yz5.l lVar) {
        kotlin.jvm.internal.o.g(view, "view");
        if (view.getVisibility() != 0) {
            return;
        }
        kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
        kotlin.jvm.internal.e0 e0Var2 = new kotlin.jvm.internal.e0();
        e0Var2.f310115d = e0Var.f310115d;
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(i17, i18);
        ofInt.setDuration(j17);
        ofInt.addUpdateListener(new zl2.j4(i18, view, e0Var, e0Var2, lVar, i17, i18 - i17));
        ofInt.start();
    }

    public final java.lang.String l(int i17) {
        long j17 = i17;
        long j18 = j17 / 3600;
        if (j18 == 0) {
            java.lang.String format = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j17 / 60), java.lang.Long.valueOf(j17 % 60)}, 2));
            kotlin.jvm.internal.o.f(format, "format(...)");
            return format;
        }
        java.lang.String format2 = java.lang.String.format("%d:%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j18), java.lang.Long.valueOf((j17 % 3600) / 60), java.lang.Long.valueOf(j17 % 60)}, 3));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        return format2;
    }

    public final java.lang.String m() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(java.util.UUID.randomUUID());
        sb6.append('_');
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(sb6.toString());
        kotlin.jvm.internal.o.f(a17, "getMD5String(...)");
        return a17;
    }

    public final java.lang.String n() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.noj);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public final java.lang.String o(long j17) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(new java.util.Date(j17));
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dan, java.lang.Integer.valueOf(calendar.get(1)), java.lang.Integer.valueOf(calendar.get(2) + 1), java.lang.Integer.valueOf(calendar.get(5)), com.tencent.mm.plugin.finder.assist.w2.p(com.tencent.mm.sdk.platformtools.x2.f193071a, j17));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public final java.lang.String p(java.lang.String str, java.lang.String str2, boolean z17) {
        return ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Ri(str, str2, z17);
    }

    public final java.lang.String q(long j17, java.lang.Boolean bool, boolean z17, boolean z18) {
        java.lang.Object p17;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = java.util.Calendar.getInstance();
        java.util.Date date = new java.util.Date(j17);
        ((java.util.Calendar) h0Var.f310123d).setTime(date);
        int i17 = ((java.util.Calendar) h0Var.f310123d).get(6);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        java.util.Date date2 = new java.util.Date(c01.id.c());
        calendar.setTime(date2);
        int i18 = i17 - calendar.get(6);
        com.tencent.mars.xlog.Log.i("Finder.FinderUtil2", "[getFinderLiveNoticeTips] dayDiff:" + i18 + ", bookTime:" + date + ", todayTime:" + date2);
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        if (z18) {
            p17 = " " + ((java.lang.Object) com.tencent.mm.plugin.finder.assist.w2.p(com.tencent.mm.sdk.platformtools.x2.f193071a, j17)) + ' ';
        } else {
            p17 = com.tencent.mm.plugin.finder.assist.w2.p(com.tencent.mm.sdk.platformtools.x2.f193071a, j17);
        }
        h0Var2.f310123d = p17;
        if (!com.tencent.mm.sdk.platformtools.m2.j()) {
            int i19 = ((java.util.Calendar) h0Var.f310123d).get(1);
            int i27 = ((java.util.Calendar) h0Var.f310123d).get(2) + 1;
            int i28 = ((java.util.Calendar) h0Var.f310123d).get(5);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(i19);
            sb6.append('.');
            sb6.append(i27);
            sb6.append('.');
            sb6.append(i28);
            sb6.append(' ');
            sb6.append(h0Var2.f310123d);
            return sb6.toString();
        }
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        if (!kotlin.jvm.internal.o.b(bool, bool2)) {
            return s(h0Var, z17, j17, h0Var2, bool);
        }
        if (i18 == -1) {
            return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.fdi) + h0Var2.f310123d;
        }
        if (i18 == 0) {
            return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.fd_) + h0Var2.f310123d;
        }
        if (i18 == 1) {
            return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.fda) + h0Var2.f310123d;
        }
        if (i18 != 2) {
            return s(h0Var, z17, j17, h0Var2, bool2);
        }
        return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491515dc3) + h0Var2.f310123d;
    }

    public final java.lang.String v(long j17) {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.mq9, android.text.format.DateFormat.format(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f492135fc2), j17));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public final java.util.HashMap w(java.lang.String jsonString) {
        kotlin.jvm.internal.o.g(jsonString, "jsonString");
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(jsonString);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            kotlin.jvm.internal.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object obj = jSONObject.get(next);
                java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
                if (str == null) {
                    str = "";
                }
                hashMap.put(next, str);
            }
        } catch (org.json.JSONException unused) {
        }
        return hashMap;
    }

    public final int x() {
        if (!E()) {
            return 0;
        }
        ae2.in inVar = ae2.in.f3688a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3722d3).getValue()).r()).intValue();
        int i17 = 1;
        if (intValue != 1) {
            i17 = 2;
            if (intValue != 2) {
                return 0;
            }
        }
        return i17;
    }

    public final java.lang.String y(r45.mb4 mediaObj, int i17) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(mediaObj, "mediaObj");
        java.util.LinkedList list = mediaObj.getList(53);
        kotlin.jvm.internal.o.f(list, "getLive_cover_imgs(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.lw1) obj).getInteger(5) == i17) {
                break;
            }
        }
        r45.lw1 lw1Var = (r45.lw1) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String string = lw1Var != null ? lw1Var.getString(0) : null;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (string == null) {
            string = "";
        }
        sb6.append(string);
        java.lang.String string2 = lw1Var != null ? lw1Var.getString(1) : null;
        sb6.append(string2 != null ? string2 : "");
        return sb6.toString();
    }

    public final java.lang.String z(int i17) {
        if (i17 >= 10) {
            return java.lang.String.valueOf(i17);
        }
        return "0" + i17;
    }
}
