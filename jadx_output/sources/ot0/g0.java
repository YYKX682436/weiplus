package ot0;

/* loaded from: classes9.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final kk.j f348477a = new kk.l(50);

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f348478b = new java.util.concurrent.ConcurrentHashMap(50);

    public static java.lang.String a(java.lang.String str, int i17, int i18, int i19) {
        return b(str, i17, i18, i19, null, "");
    }

    public static java.lang.String b(java.lang.String str, int i17, int i18, int i19, com.tencent.mm.storage.s1 s1Var, java.lang.String str2) {
        return c(str, i17, i18, i19, s1Var, str2, -1, -1, "", "", 0);
    }

    public static java.lang.String c(java.lang.String str, int i17, int i18, int i19, com.tencent.mm.storage.s1 s1Var, java.lang.String str2, int i27, int i28, java.lang.String str3, java.lang.String str4, int i29) {
        java.lang.String str5;
        java.lang.String str6;
        boolean z17;
        boolean z18;
        if (!((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(str)) {
            return str;
        }
        int i37 = com.tencent.mm.storage.c2.f193803a;
        if (i37 <= 0 && i18 < 0 && i17 < 0 && i19 <= 0) {
            return str;
        }
        int indexOf = str.indexOf("#");
        boolean z19 = false;
        if (indexOf > 0) {
            str5 = str.substring(0, indexOf);
            str6 = str.substring(indexOf);
        } else {
            str5 = str;
            str6 = "";
        }
        boolean z27 = true;
        if (str.contains("?")) {
            z17 = false;
        } else {
            str5 = str5 + "?";
            z17 = true;
        }
        if (s1Var != null && s1Var.A0()) {
            z19 = true;
        }
        if (z19) {
            z27 = !str5.contains("&scene=");
            z18 = !str5.contains("&subscene=");
        } else {
            z18 = true;
        }
        if (i17 >= 0 && z27) {
            str5 = str5.replaceAll("(&scene=[\\d]*)", "").replaceAll("(\\?scene=[\\d]*)", "?") + "&scene=" + i17;
        }
        if (i18 >= 0 && z18) {
            str5 = str5.replaceAll("(&subscene=[\\d]*)", "").replaceAll("(\\?subscene=[\\d]*)", "?") + "&subscene=" + i18;
        }
        if (i37 > 0) {
            str5 = str5 + "&sessionid=" + i37;
        }
        if (i27 >= 0) {
            str5 = str5 + "&flutter_pos=" + i27;
        }
        if (i19 > 0) {
            str5 = (str5 + "&clicktime=" + i19) + "&enterid=" + i19;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str5 = str5 + "&search_click_id=" + str2;
        }
        if (i28 > 0) {
            str5 = str5 + "&finder_biz_enter_id=" + i28;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            str5 = str5 + "&ranksessionid=" + str3;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4) && i29 > 0) {
            str5 = (str5 + "&jumppath=" + str4) + "&jumppathdepth=" + i29;
        }
        if (z17) {
            str5 = str5.replace("?&", "?");
        }
        return str5 + str6;
    }

    public static java.lang.String d(int i17) {
        if (i17 <= 0) {
            return null;
        }
        long j17 = i17;
        if (j17 >= 86400) {
            return null;
        }
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(j17 < 3600 ? "mm:ss" : "HH:mm:ss");
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT+0:00"));
        return simpleDateFormat.format(java.lang.Long.valueOf(j17 * 1000));
    }

    public static r45.qp0 e(com.tencent.mm.storage.f9 f9Var, r45.tq0 tq0Var) {
        ot0.q v17;
        ot0.f fVar;
        if (f9Var == null || !f9Var.k2() || f9Var.t2() || (v17 = ot0.q.v(f9Var.U1())) == null || (fVar = (ot0.f) v17.y(ot0.f.class)) == null) {
            return null;
        }
        if (fVar.f348455b == -1 && fVar.f348466m != 1) {
            return null;
        }
        r45.qp0 qp0Var = new r45.qp0();
        qp0Var.f384163e = fVar.f348460g;
        qp0Var.f384162d = fVar.f348455b;
        qp0Var.f384176u = fVar.f348461h;
        qp0Var.f384168m = fVar.f348463j;
        qp0Var.f384164f = fVar.f348458e;
        qp0Var.f384165g = fVar.f348459f;
        qp0Var.f384167i = fVar.f348457d;
        qp0Var.f384166h = fVar.f348456c;
        qp0Var.f384173r = v17.f348734z;
        qp0Var.f384169n = v17.f348722w;
        qp0Var.f384170o = v17.f348726x;
        tq0Var.p(v17.f348654f);
        tq0Var.j(v17.f348658g);
        return qp0Var;
    }

    public static r45.qp0 f(ot0.s0 s0Var, r45.tq0 tq0Var, java.lang.String str, java.lang.String str2) {
        if (s0Var == null || s0Var.f348770o == -1) {
            return null;
        }
        r45.qp0 qp0Var = new r45.qp0();
        int i17 = s0Var.f348770o;
        qp0Var.f384163e = i17 == 5 ? 1 : 0;
        qp0Var.f384162d = i17;
        qp0Var.f384176u = s0Var.I;
        qp0Var.f384168m = s0Var.G;
        qp0Var.f384164f = s0Var.E;
        qp0Var.f384165g = s0Var.F;
        qp0Var.f384167i = s0Var.f348774q;
        qp0Var.f384166h = (int) s0Var.f348765h;
        qp0Var.f384169n = str;
        qp0Var.f384170o = str2;
        qp0Var.f384173r = s0Var.f348766i;
        tq0Var.p(s0Var.f348761d);
        tq0Var.j(s0Var.f348769n);
        return qp0Var;
    }

    public static r45.qp0 g(com.tencent.mm.storage.f9 f9Var) {
        ot0.q v17;
        ot0.f fVar;
        if (f9Var == null || !f9Var.M2() || (v17 = ot0.q.v(f9Var.U1())) == null || (fVar = (ot0.f) v17.y(ot0.f.class)) == null || fVar.f348465l == null) {
            return null;
        }
        r45.qp0 qp0Var = new r45.qp0();
        qp0Var.f384169n = v17.f348722w;
        qp0Var.f384170o = v17.f348726x;
        ot0.m1 m1Var = fVar.f348465l;
        qp0Var.f384174s = m1Var.f373339d;
        qp0Var.f384175t = m1Var.f373340e;
        qp0Var.f384168m = m1Var.f373341f;
        qp0Var.f384173r = m1Var.f373343h;
        qp0Var.f384164f = m1Var.f373345m;
        qp0Var.f384165g = m1Var.f373346n;
        qp0Var.f384167i = m1Var.f373344i;
        return qp0Var;
    }

    public static int h() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(context)) {
            return 100;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is2G(context)) {
            return 2;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is3G(context)) {
            return 3;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is4G(context)) {
            return 4;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is5G(context)) {
            return 5;
        }
        return com.tencent.mars.comm.NetStatusUtil.isWifi(context) ? 1 : 0;
    }

    public static java.lang.String i(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, long j17) {
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppMsgBizHelper", "getReaderAppMsgContent: context is null");
            return null;
        }
        if (str == null || str2 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppMsgBizHelper", "getReaderAppMsgContent: msg is null");
            return null;
        }
        gm0.j1.i();
        if (!gm0.j1.u().l()) {
            db5.t7.k(context, null);
            return null;
        }
        try {
            ot0.m0 Di = ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(j17, str);
            java.util.LinkedList linkedList = Di.f348581i;
            if (linkedList != null && linkedList.size() > 0 && i17 < linkedList.size()) {
                ot0.s0 s0Var = (ot0.s0) linkedList.get(i17);
                ot0.q qVar = new ot0.q();
                qVar.f348654f = s0Var.f348761d;
                qVar.f348658g = s0Var.f348769n;
                qVar.f348662h = "view";
                qVar.f348666i = 5;
                qVar.f348674k = s0Var.f348762e;
                qVar.f348722w = Di.f348578f;
                qVar.f348726x = Di.f348579g;
                qVar.f348730y = Di.f348580h;
                qVar.f348734z = j(s0Var);
                ot0.f fVar = new ot0.f();
                int i18 = s0Var.f348770o;
                fVar.f348455b = i18;
                fVar.f348461h = s0Var.I;
                if (i18 == 5 || i18 == 16) {
                    fVar.f348463j = s0Var.G;
                    fVar.f348456c = (int) s0Var.f348765h;
                    fVar.f348457d = s0Var.f348774q;
                    fVar.f348458e = s0Var.E;
                    fVar.f348459f = s0Var.F;
                }
                qVar.f(fVar);
                if (com.tencent.mm.sdk.platformtools.t8.K0(qVar.f348734z)) {
                    ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(str2);
                    if (n07 != null) {
                        qVar.f348734z = n07.c();
                    }
                }
                return ot0.q.u(qVar, null, null);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppMsgBizHelper", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgBizHelper", "retransmit app msg error : %s", e17.getLocalizedMessage());
        }
        return null;
    }

    public static java.lang.String j(ot0.s0 s0Var) {
        int i17 = s0Var.f348770o;
        return (i17 == 5 || i17 == 16) ? com.tencent.mm.sdk.platformtools.t8.K0(s0Var.f348766i) ? s0Var.D : s0Var.f348766i : com.tencent.mm.sdk.platformtools.t8.K0(s0Var.D) ? s0Var.f348766i : s0Var.D;
    }

    public static java.lang.String k(java.lang.String str) {
        java.util.Map x17 = ot0.q.x(str);
        if (x17 == null) {
            x17 = com.tencent.mm.sdk.platformtools.aa.d(str, "msg", null);
        }
        if (x17 != null) {
            java.lang.String str2 = (java.lang.String) x17.get(".msg.appmsg.mmreader.category.item.title");
            return str2 == null ? "" : str2;
        }
        ot0.r0 r0Var = new ot0.r0();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.util.Iterator it = r0Var.f348581i.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ot0.s0 s0Var = (ot0.s0) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(s0Var.f348761d)) {
                sb6.append(s0Var.f348761d);
                break;
            }
        }
        return sb6.toString();
    }
}
