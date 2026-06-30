package rk4;

/* loaded from: classes2.dex */
public abstract class l5 {
    public static final java.lang.String a(bw5.lp0 tingItem) {
        kotlin.jvm.internal.o.g(tingItem, "tingItem");
        if (tingItem.d() == null) {
            return "";
        }
        try {
            bw5.v70 d17 = tingItem.d();
            if (d17 != null) {
                android.util.ArrayMap arrayMap = d17.Q;
                d17.f34191g = new bw5.d60();
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                arrayMap.put(4, bool);
                d17.f34190f = new bw5.xa0();
                arrayMap.put(3, bool);
                d17.E = new bw5.n80();
                arrayMap.put(101, bool);
            } else {
                d17 = null;
            }
            if (d17 == null) {
                return "";
            }
            java.lang.String encodeToString = android.util.Base64.encodeToString(d17.toByteArray(), 2);
            kotlin.jvm.internal.o.f(encodeToString, "encodeToString(...)");
            return encodeToString;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TingListenItemUtils", e17, "encodeTingListenItem exception", new java.lang.Object[0]);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0067 A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:12:0x001a, B:14:0x002e, B:17:0x0039, B:19:0x003f, B:22:0x004f, B:25:0x0055, B:27:0x005b, B:32:0x0067, B:34:0x006c, B:36:0x0070, B:47:0x0042, B:49:0x0031), top: B:11:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(bw5.v70 r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 23
            boolean r1 = r5.hasFieldNumber(r1)
            if (r1 == 0) goto Lf
            com.tencent.mm.protobuf.g r5 = r5.C
            goto L11
        Lf:
            com.tencent.mm.protobuf.g r5 = com.tencent.mm.protobuf.g.f192155b
        L11:
            if (r5 == 0) goto L89
            byte[] r1 = r5.f192156a
            int r1 = r1.length
            if (r1 != 0) goto L1a
            goto L89
        L1a:
            bw5.rp0 r1 = new bw5.rp0     // Catch: java.lang.Exception -> L7e
            r1.<init>()     // Catch: java.lang.Exception -> L7e
            byte[] r5 = r5.g()     // Catch: java.lang.Exception -> L7e
            bw5.rp0 r5 = r1.parseFrom(r5)     // Catch: java.lang.Exception -> L7e
            boolean[] r1 = r5.f32650g     // Catch: java.lang.Exception -> L7e
            r2 = 3
            boolean r1 = r1[r2]     // Catch: java.lang.Exception -> L7e
            if (r1 == 0) goto L31
            bw5.sp0 r5 = r5.f32649f     // Catch: java.lang.Exception -> L7e
            goto L36
        L31:
            bw5.sp0 r5 = new bw5.sp0     // Catch: java.lang.Exception -> L7e
            r5.<init>()     // Catch: java.lang.Exception -> L7e
        L36:
            r1 = 1
            if (r5 == 0) goto L48
            boolean[] r2 = r5.f33107f     // Catch: java.lang.Exception -> L7e
            boolean r2 = r2[r1]     // Catch: java.lang.Exception -> L7e
            if (r2 == 0) goto L42
            bw5.ta0 r5 = r5.f33105d     // Catch: java.lang.Exception -> L7e
            goto L49
        L42:
            bw5.ta0 r5 = new bw5.ta0     // Catch: java.lang.Exception -> L7e
            r5.<init>()     // Catch: java.lang.Exception -> L7e
            goto L49
        L48:
            r5 = 0
        L49:
            if (r5 == 0) goto L89
            boolean[] r2 = r5.f33343v
            r3 = 8
            boolean r3 = r2[r3]     // Catch: java.lang.Exception -> L7e
            java.lang.String r4 = ""
            if (r3 == 0) goto L58
            java.lang.String r3 = r5.f33335n     // Catch: java.lang.Exception -> L7e
            goto L59
        L58:
            r3 = r4
        L59:
            if (r3 == 0) goto L64
            int r3 = r3.length()     // Catch: java.lang.Exception -> L7e
            if (r3 != 0) goto L62
            goto L64
        L62:
            r3 = r0
            goto L65
        L64:
            r3 = r1
        L65:
            if (r3 == 0) goto L7c
            r3 = 4
            boolean r2 = r2[r3]     // Catch: java.lang.Exception -> L7e
            if (r2 == 0) goto L6e
            java.lang.String r4 = r5.f33331g     // Catch: java.lang.Exception -> L7e
        L6e:
            if (r4 == 0) goto L79
            int r5 = r4.length()     // Catch: java.lang.Exception -> L7e
            if (r5 != 0) goto L77
            goto L79
        L77:
            r5 = r0
            goto L7a
        L79:
            r5 = r1
        L7a:
            if (r5 != 0) goto L7d
        L7c:
            r0 = r1
        L7d:
            return r0
        L7e:
            r5 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "MicroMsg.TingListenItemUtils"
            java.lang.String r3 = "hasReviewInfo parse clientInfoBytes exception"
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r5, r3, r1)
        L89:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.l5.b(bw5.v70):boolean");
    }

    public static final bw5.v70 c(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            byte[] decode = android.util.Base64.decode(str, 2);
            if (decode != null) {
                return new bw5.v70().parseFrom(decode);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TingListenItemUtils", e17, "parseTingListenItem exception", new java.lang.Object[0]);
        }
        return null;
    }
}
