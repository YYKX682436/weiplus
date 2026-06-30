package k41;

/* loaded from: classes11.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final k41.o0 f304031a = new k41.o0();

    /* renamed from: b, reason: collision with root package name */
    public static final k41.h0 f304032b;

    /* renamed from: c, reason: collision with root package name */
    public static final kk.j f304033c;

    /* renamed from: d, reason: collision with root package name */
    public static final kk.j f304034d;

    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        f304032b = new k41.h0();
        f304033c = new jt0.j(20);
        f304034d = new jt0.j(20);
    }

    public static final k41.k0 b(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMKefuContactLogic", "kefuCard getCardContent content null");
            return null;
        }
        kk.j jVar = f304034d;
        k41.k0 k0Var = (k41.k0) ((lt0.f) jVar).get(java.lang.Integer.valueOf(str.hashCode()));
        if (k0Var != null) {
            return k0Var;
        }
        k41.k0 a17 = k41.k0.f304016h.a(str);
        if (a17 != null) {
            ((lt0.f) jVar).j(java.lang.Integer.valueOf(str.hashCode()), a17);
        }
        return a17;
    }

    public static final k41.g0 c(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        k41.h0 h0Var = f304032b;
        k41.g0 a17 = h0Var.a(str);
        if (a17 != null) {
            return a17;
        }
        k41.r0 Di = ((i41.l) i95.n0.c(i41.l.class)).Di();
        k41.g0 y07 = Di != null ? Di.y0(str) : null;
        if (y07 != null) {
            f304031a.h(y07.field_username, y07);
        }
        return h0Var.a(str);
    }

    public static final k41.g0 d(java.lang.String str) {
        k41.g0 g0Var;
        boolean z17 = false;
        k41.g0 g0Var2 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        k41.o0 o0Var = f304031a;
        java.lang.String g17 = o0Var.g(str);
        k41.h0 h0Var = f304032b;
        k41.g0 a17 = h0Var.a(g17);
        if (a17 != null) {
            return a17;
        }
        k41.r0 Di = ((i41.l) i95.n0.c(i41.l.class)).Di();
        if (Di != null) {
            android.database.Cursor f17 = Di.f304040d.f("SELECT *, rowid FROM OpenIMKefuContact WHERE kfUrl = " + d95.b0.O(g17), null, 2);
            if (f17 != null) {
                try {
                    if (f17.moveToFirst()) {
                        z17 = true;
                    }
                } finally {
                }
            }
            if (z17) {
                g0Var = new k41.g0();
                g0Var.convertFrom(f17);
                g0Var.f303997x1 = g0Var.systemRowid;
                g0Var.f303996p1 = true;
            } else {
                g0Var = null;
            }
            vz5.b.a(f17, null);
            g0Var2 = g0Var;
        }
        if (g0Var2 != null) {
            o0Var.h(g17, g0Var2);
        }
        return h0Var.a(g17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006e, code lost:
    
        if (r7 > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e8, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r2 > 0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean f(k41.g0 r12) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k41.o0.f(k41.g0):boolean");
    }

    public final k41.g0 a(java.lang.String str, r45.h05 h05Var) {
        java.lang.String str2;
        java.lang.String str3;
        if (h05Var == null) {
            return null;
        }
        k41.g0 c17 = c(h05Var.f375714d);
        if (c17 == null) {
            c17 = new k41.g0();
        }
        c17.field_username = h05Var.f375714d;
        c17.field_nickname = h05Var.f375715e;
        c17.field_bigHeadImg = h05Var.f375716f;
        c17.field_smallHeadImg = h05Var.f375717g;
        c17.field_nicknamePyInit = h05Var.f375718h;
        c17.field_nicknamePyQuanPin = h05Var.f375719i;
        c17.field_openImAppId = h05Var.f375720m;
        c17.field_openImDescWordingId = h05Var.f375721n;
        c17.field_source = h05Var.f375722o;
        c17.field_checkTime = (int) com.tencent.mm.sdk.platformtools.t8.i1();
        r45.b05 b05Var = h05Var.f375723p;
        if (b05Var == null || (str2 = b05Var.f370396e) == null) {
            str2 = "";
        }
        c17.field_customInfoDetail = str2;
        boolean z17 = false;
        c17.field_customInfoDetailVisible = b05Var != null ? b05Var.f370395d : 0;
        java.lang.String str4 = h05Var.f375724q;
        if (str4 == null) {
            str4 = "";
        }
        c17.field_ticket = str4;
        r45.m05 m05Var = h05Var.f375725r;
        c17.field_type = m05Var != null ? m05Var.f380047d : 0L;
        java.lang.String str5 = h05Var.f375726s;
        c17.field_finderUsername = str5 != null ? str5 : "";
        java.lang.String str6 = h05Var.f375714d;
        c17.f303996p1 = !(str6 == null || str6.length() == 0);
        r45.m05 m05Var2 = h05Var.f375725r;
        long j17 = m05Var2.f380047d;
        c17.field_needReport = (j17 & 8589934592L) == 8589934592L;
        c17.field_hasSetReport = (j17 & 4294967296L) == 4294967296L;
        r45.hd4 hd4Var = m05Var2.f380048e;
        if (hd4Var == null || (str3 = hd4Var.f376068e) == null) {
            str3 = "wgs84";
        }
        c17.field_locationType = str3;
        c17.field_kefuType = h05Var.f375727t;
        c17.field_kefuToolsInfo = h05Var.f375728u;
        c17.field_enterprise_auth_status = h05Var.f375729v;
        if (str != null) {
            if (str.length() > 0) {
                z17 = true;
            }
        }
        if (z17) {
            c17.field_kfUrl = f304031a.g(str);
        }
        return c17;
    }

    public final void e(k41.g0 g0Var) {
        java.lang.String str;
        java.lang.String str2;
        boolean z17;
        if (g0Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuContactLogic", "processGetContact openImKefuContact " + g0Var.t0());
        f(g0Var);
        java.lang.String str3 = g0Var.field_username;
        com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(str3);
        if (n07 != null) {
            str = n07.c();
            kotlin.jvm.internal.o.f(str, "getBigUrl(...)");
            str2 = n07.d();
            kotlin.jvm.internal.o.f(str2, "getSmallUrl(...)");
        } else {
            str = "";
            str2 = "";
        }
        com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
        r0Var.f70537i = -1;
        r0Var.f70529a = str3;
        r0Var.f70532d = g0Var.field_smallHeadImg;
        r0Var.f70533e = g0Var.field_bigHeadImg;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuContactLogic", "dealWithAvatarFromGetContactResp contact %s b[%s] s[%s]", r0Var.e(), r0Var.c(), r0Var.d());
        boolean b17 = kotlin.jvm.internal.o.b(r0Var.c(), str);
        boolean z18 = true;
        if (b17) {
            z17 = false;
        } else {
            com.tencent.mm.modelavatar.d1.Ai().p(str3, true);
            z17 = true;
        }
        if (!kotlin.jvm.internal.o.b(r0Var.d(), str2)) {
            com.tencent.mm.modelavatar.d1.Ai().p(str3, false);
            z17 = true;
        }
        if (z17) {
            com.tencent.mm.modelavatar.d1.Ni().y0(r0Var);
            com.tencent.mm.modelavatar.d1.wi().i(str3);
        }
        ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Bi(g0Var.field_openImAppId, g0Var.field_openImDescWordingId, 0);
        java.lang.String str4 = g0Var.field_username;
        if (str4 != null && str4.length() != 0) {
            z18 = false;
        }
        if (z18) {
            return;
        }
        u41.g gVar = new u41.g();
        gVar.field_openIMUsername = g0Var.field_username;
        gVar.field_finder_username = g0Var.field_finderUsername;
        ((i41.l) i95.n0.c(i41.l.class)).Ni().replace(gVar);
    }

    public final java.lang.String g(java.lang.String str) {
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String str2 = parse.getScheme() + "://" + parse.getHost() + '/' + parse.getPath();
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuContactLogic", "trimKfUrl %s", str2);
        return str2;
    }

    public final void h(java.lang.String key, k41.g0 contact) {
        if (key == null || key.length() == 0) {
            return;
        }
        k41.h0 h0Var = f304032b;
        h0Var.getClass();
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(contact, "contact");
        ((lt0.f) h0Var.f304006a).j(key, contact);
        ((lt0.f) f304033c).j(key, contact.u0());
    }
}
