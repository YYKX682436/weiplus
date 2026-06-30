package com.tencent.mm.plugin.finder.service;

/* loaded from: classes5.dex */
public final class m4 implements zy2.ab {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.service.m4 f126148a = new com.tencent.mm.plugin.finder.service.m4();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f126149b = jz5.h.b(com.tencent.mm.plugin.finder.service.l4.f126140d);

    /* JADX WARN: Removed duplicated region for block: B:55:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(com.tencent.mm.plugin.finder.service.m4 r22, android.content.Context r23, int r24, java.lang.String r25, java.lang.String r26, long r27, long r29, boolean r31, java.lang.String r32, zy2.bb r33, java.lang.Integer r34, java.lang.Integer r35, java.lang.Integer r36, java.lang.Long r37, boolean r38, boolean r39, boolean r40, boolean r41, boolean r42, byte[] r43, yz5.s r44, int r45, java.lang.Object r46) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.service.m4.d(com.tencent.mm.plugin.finder.service.m4, android.content.Context, int, java.lang.String, java.lang.String, long, long, boolean, java.lang.String, zy2.bb, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, boolean, boolean, boolean, boolean, boolean, byte[], yz5.s, int, java.lang.Object):void");
    }

    public static int g(com.tencent.mm.plugin.finder.service.m4 m4Var, java.lang.Integer num, java.lang.String str, long j17, long j18, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29, byte[] bArr, int i17, java.lang.Object obj) {
        java.lang.Integer num2 = (i17 & 1) != 0 ? null : num;
        java.lang.String str2 = (i17 & 2) != 0 ? null : str;
        long j19 = (i17 & 4) != 0 ? 0L : j17;
        long j27 = (i17 & 8) != 0 ? 0L : j18;
        int i18 = 0;
        boolean z37 = (i17 & 16) != 0 ? false : z17;
        boolean z38 = (i17 & 32) != 0 ? false : z18;
        boolean z39 = (i17 & 64) != 0 ? false : z19;
        boolean z47 = (i17 & 128) != 0 ? false : z27;
        boolean z48 = (i17 & 256) != 0 ? false : z28;
        boolean z49 = (i17 & 512) != 0 ? false : z29;
        byte[] bArr2 = (i17 & 1024) != 0 ? null : bArr;
        m4Var.getClass();
        if (str2 != null) {
            return 3;
        }
        if (j19 != 0 && j27 != 0 && !z38) {
            i18 = z48 ? 11 : 4;
        } else if (j19 != 0 && z39) {
            i18 = 8;
        } else if (j19 != 0 && z49) {
            i18 = 6;
        } else if (j19 != 0 && z47) {
            i18 = 10;
        } else if (z37) {
            i18 = num2 != null ? num2.intValue() : 1;
        } else if (bArr2 != null) {
            i18 = 14;
        } else if (num2 != null) {
            i18 = num2.intValue();
        }
        return i18;
    }

    public void b(android.content.Context context, java.lang.String sessionId, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Long l17, yz5.r callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(callback, "callback");
        db2.l4 l4Var = new db2.l4(sessionId, num, num2, num3, l17);
        az2.j.u(l4Var, context, null, 1500L, 2, null);
        l4Var.l().H(new com.tencent.mm.plugin.finder.service.q3(callback, context));
    }

    public java.lang.String c(java.lang.String str, int i17) {
        return e().z0(str, i17);
    }

    public final com.tencent.mm.plugin.finder.storage.dj0 e() {
        return (com.tencent.mm.plugin.finder.storage.dj0) ((jz5.n) f126149b).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String f(java.lang.String r11) {
        /*
            r10 = this;
            com.tencent.mm.plugin.finder.storage.dj0 r0 = r10.e()
            qb2.x1 r11 = r0.J0(r11)
            xy2.b r0 = xy2.b.f458155b
            java.lang.String r1 = "getSessionSender"
            java.lang.String r2 = r11.field_senderUserName
            r3 = 0
            if (r2 == 0) goto L1f
            int r2 = r2.length()
            r4 = 1
            if (r2 <= 0) goto L1a
            r2 = r4
            goto L1b
        L1a:
            r2 = r3
        L1b:
            if (r2 != r4) goto L1f
            r2 = r4
            goto L20
        L1f:
            r2 = r3
        L20:
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            com.tencent.mm.plugin.finder.service.k4 r7 = com.tencent.mm.plugin.finder.service.k4.f126108d
            r8 = 60
            r9 = 0
            pm0.z.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r11 = r11.field_senderUserName
            if (r11 != 0) goto L32
            java.lang.String r11 = ""
        L32:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.service.m4.f(java.lang.String):java.lang.String");
    }

    public java.lang.String h(java.lang.String str) {
        java.lang.String str2 = e().J0(str).field_talker;
        return str2 == null ? "" : str2;
    }
}
