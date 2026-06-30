package vu;

/* loaded from: classes9.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.text.SimpleDateFormat f440046a = new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS);

    public static final java.lang.String a(java.lang.String str) {
        try {
            java.util.Date parse = new java.text.SimpleDateFormat("yyyy-MM-dd").parse(str);
            if (parse == null) {
                return str;
            }
            java.lang.CharSequence format = android.text.format.DateFormat.format(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fcl), parse.getTime());
            java.lang.String str2 = format instanceof java.lang.String ? (java.lang.String) format : null;
            return str2 == null ? "" : str2;
        } catch (java.text.ParseException unused) {
            return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if (com.tencent.mm.vfs.w6.j(r0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        if (com.tencent.mm.vfs.w6.j(r0) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String b(hu.b r9, java.lang.String r10, long r11, java.lang.Long r13) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.g(r9, r0)
            s15.h r1 = r9.f284997e
            kotlin.jvm.internal.o.g(r1, r0)
            oi3.e r0 = c(r1)
            r2 = 0
            if (r0 != 0) goto L13
            goto L8b
        L13:
            int r3 = r1.f303422d
            r4 = 2
            int r3 = r3 + r4
            int r5 = r1.getInteger(r3)
            r6 = 4
            r7 = 3
            r8 = 0
            if (r5 != r6) goto L4a
            bm5.x r1 = bm5.y.f22756i
            bm5.f0 r3 = bm5.f0.f22570r
            bm5.y r3 = r1.d(r0, r3)
            java.lang.String r3 = bm5.z.h(r3, r2, r8, r7, r2)
            boolean r4 = com.tencent.mm.vfs.w6.j(r3)
            if (r4 == 0) goto L33
            goto L34
        L33:
            r3 = r2
        L34:
            if (r3 != 0) goto L48
            bm5.f0 r3 = bm5.f0.f22571s
            bm5.y r0 = r1.d(r0, r3)
            java.lang.String r0 = bm5.z.h(r0, r2, r8, r7, r2)
            boolean r1 = com.tencent.mm.vfs.w6.j(r0)
            if (r1 == 0) goto L8b
        L46:
            r2 = r0
            goto L8b
        L48:
            r2 = r3
            goto L8b
        L4a:
            int r1 = r1.getInteger(r3)
            if (r1 != r4) goto L8b
            bm5.x r1 = bm5.y.f22756i
            bm5.f0 r3 = bm5.f0.f22562g
            bm5.y r3 = r1.d(r0, r3)
            java.lang.String r3 = bm5.z.h(r3, r2, r8, r7, r2)
            boolean r4 = com.tencent.mm.vfs.w6.j(r3)
            if (r4 == 0) goto L63
            goto L64
        L63:
            r3 = r2
        L64:
            if (r3 != 0) goto L48
            bm5.f0 r3 = bm5.f0.f22563h
            bm5.y r3 = r1.d(r0, r3)
            java.lang.String r3 = bm5.z.h(r3, r2, r8, r7, r2)
            boolean r4 = com.tencent.mm.vfs.w6.j(r3)
            if (r4 == 0) goto L77
            goto L78
        L77:
            r3 = r2
        L78:
            if (r3 != 0) goto L48
            bm5.f0 r3 = bm5.f0.f22565m
            bm5.y r0 = r1.d(r0, r3)
            java.lang.String r0 = bm5.z.h(r0, r2, r8, r7, r2)
            boolean r1 = com.tencent.mm.vfs.w6.j(r0)
            if (r1 == 0) goto L8b
            goto L46
        L8b:
            if (r2 != 0) goto Lab
            java.lang.Class<mc0.k> r0 = mc0.k.class
            i95.m r0 = i95.n0.c(r0)
            mc0.k r0 = (mc0.k) r0
            s15.h r2 = r9.f284997e
            if (r13 == 0) goto L9e
            long r3 = r13.longValue()
            goto La0
        L9e:
            r3 = 0
        La0:
            r6 = r3
            r8 = 1
            r1 = r0
            zs3.z r1 = (zs3.z) r1
            r3 = r10
            r4 = r11
            java.lang.String r2 = r1.fj(r2, r3, r4, r6, r8)
        Lab:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: vu.a.b(hu.b, java.lang.String, long, java.lang.Long):java.lang.String");
    }

    public static final oi3.e c(s15.h hVar) {
        kotlin.jvm.internal.o.g(hVar, "<this>");
        c01.z1.r();
        s15.i p17 = hVar.p();
        if (p17 == null) {
            return null;
        }
        java.lang.String j17 = p17.j();
        long A = hVar.A();
        com.tencent.mm.storage.f9 l17 = (A <= 0 || !(r26.n0.N(j17) ^ true)) ? null : pt0.f0.f358209b1.l(j17, A);
        oi3.e qj6 = l17 != null ? ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).qj(l17) : null;
        if (qj6 == null) {
            return null;
        }
        return qj6;
    }

    public static final java.lang.String d(hu.b bVar, java.lang.String str, long j17, java.lang.Long l17) {
        kotlin.jvm.internal.o.g(bVar, "<this>");
        java.lang.String g17 = g(bVar.f284997e);
        if (g17 != null) {
            return g17;
        }
        return ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).fj(bVar.f284997e, str, j17, l17 != null ? l17.longValue() : 0L, 1);
    }

    public static final java.lang.String e(s15.w wVar, long j17) {
        kotlin.jvm.internal.o.g(wVar, "<this>");
        if (j17 <= 0) {
            return "";
        }
        try {
            java.lang.String format = f440046a.format(new java.util.Date(j17 * 1000));
            kotlin.jvm.internal.o.d(format);
            return format;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RecordDetailItemEx", "Failed to format srcMsgCreateTime: " + e17.getMessage());
            return "";
        }
    }

    public static final m15.a f(hu.b bVar) {
        kotlin.jvm.internal.o.g(bVar, "<this>");
        m15.a aVar = new m15.a();
        s15.h hVar = bVar.f284997e;
        aVar.fromXml(r26.i0.t(r26.i0.v(hVar.getString(hVar.f303422d + 1), "&lt;", "<", false, 4, null), "&gt;", ">", false));
        return aVar;
    }

    public static final java.lang.String g(s15.h hVar) {
        kotlin.jvm.internal.o.g(hVar, "<this>");
        oi3.e c17 = c(hVar);
        if (c17 == null) {
            return null;
        }
        int i17 = hVar.f303422d;
        if (hVar.getInteger(i17 + 2) == 4) {
            java.lang.String h17 = bm5.z.h(bm5.y.f22756i.d(c17, bm5.f0.f22572t), null, false, 3, null);
            if (com.tencent.mm.vfs.w6.j(h17)) {
                return h17;
            }
            return null;
        }
        if (hVar.getInteger(i17 + 2) != 2) {
            java.lang.String h18 = bm5.z.h(bm5.y.f22756i.d(c17, bm5.f0.f22564i), null, false, 3, null);
            if (com.tencent.mm.vfs.w6.j(h18)) {
                return h18;
            }
            return null;
        }
        bm5.x xVar = bm5.y.f22756i;
        java.lang.String h19 = bm5.z.h(xVar.d(c17, bm5.f0.f22565m), null, false, 3, null);
        if (!com.tencent.mm.vfs.w6.j(h19)) {
            h19 = null;
        }
        if (h19 != null) {
            return h19;
        }
        java.lang.String h27 = bm5.z.h(xVar.d(c17, bm5.f0.f22564i), null, false, 3, null);
        if (com.tencent.mm.vfs.w6.j(h27)) {
            return h27;
        }
        return null;
    }
}
