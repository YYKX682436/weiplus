package lf3;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final lf3.d f318314a = new lf3.d();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f318315b = jz5.h.b(lf3.a.f318305d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f318316c = kz5.b0.c(new android.util.Pair("DeviceFileExtInfo", up5.a.f429880b));

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f318317d = jz5.h.b(lf3.c.f318309d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f318318e = jz5.h.b(lf3.b.f318307d);

    public final void a(long j17, java.lang.String str, java.lang.Integer num) {
        try {
            if (c()) {
                d().deleteObjects(up5.a.f429881c.eq(g(j17, str, num)));
            } else {
                com.tencent.wcdb.core.Table d17 = d();
                com.tencent.wcdb.orm.Field field = up5.a.f429881c;
                d17.deleteObjects(field.eq(g(j17, str, num)));
                d().deleteObjects(field.eq(g(j17, str, null)));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DeviceFileExtInfoDBProvider", "[delete] by msgId:" + j17 + ", talker: " + str + ", fileType: " + num + ", e:" + e17.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final up5.o b(long j17, java.lang.String talker, int i17) {
        kotlin.jvm.internal.o.g(talker, "talker");
        try {
            if (c()) {
                return (up5.o) d().getFirstObject(up5.a.f429881c.eq(g(j17, talker, java.lang.Integer.valueOf(i17))));
            }
            com.tencent.wcdb.core.Table d17 = d();
            com.tencent.wcdb.orm.Field field = up5.a.f429881c;
            up5.o oVar = (up5.o) d17.getFirstObject(field.eq(g(j17, talker, java.lang.Integer.valueOf(i17))));
            return oVar == null ? (up5.o) d().getFirstObject(field.eq(g(j17, talker, null))) : oVar;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DeviceFileExtInfoDBProvider", "[get] by msgId:" + j17 + ", talker: " + talker + ", fileType: " + i17 + ", e:" + e17.getMessage());
            return null;
        }
    }

    public final boolean c() {
        return ((java.lang.Boolean) ((jz5.n) f318318e).getValue()).booleanValue();
    }

    public final com.tencent.wcdb.core.Table d() {
        return (com.tencent.wcdb.core.Table) ((jz5.n) f318317d).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b A[Catch: Exception -> 0x0046, TryCatch #0 {Exception -> 0x0046, blocks: (B:3:0x0009, B:5:0x000f, B:10:0x001b, B:12:0x001f, B:20:0x002e, B:23:0x003e), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e A[Catch: Exception -> 0x0046, TryCatch #0 {Exception -> 0x0046, blocks: (B:3:0x0009, B:5:0x000f, B:10:0x001b, B:12:0x001f, B:20:0x002e, B:23:0x003e), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e A[Catch: Exception -> 0x0046, TRY_LEAVE, TryCatch #0 {Exception -> 0x0046, blocks: (B:3:0x0009, B:5:0x000f, B:10:0x001b, B:12:0x001f, B:20:0x002e, B:23:0x003e), top: B:2:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(up5.o r6) {
        /*
            r5 = this;
            java.lang.String r0 = "MicroMsg.DeviceFileExtInfoDBProvider"
            java.lang.String r1 = "[insert] invalid, info = "
            java.lang.String r2 = "info"
            kotlin.jvm.internal.o.g(r6, r2)
            java.lang.String r2 = r6.f430022a     // Catch: java.lang.Exception -> L46
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L18
            int r2 = r2.length()     // Catch: java.lang.Exception -> L46
            if (r2 != 0) goto L16
            goto L18
        L16:
            r2 = r3
            goto L19
        L18:
            r2 = r4
        L19:
            if (r2 != 0) goto L2c
            java.lang.String r2 = r6.f430024c     // Catch: java.lang.Exception -> L46
            if (r2 == 0) goto L28
            int r2 = r2.length()     // Catch: java.lang.Exception -> L46
            if (r2 != 0) goto L26
            goto L28
        L26:
            r2 = r3
            goto L29
        L28:
            r2 = r4
        L29:
            if (r2 != 0) goto L2c
            r3 = r4
        L2c:
            if (r3 != 0) goto L3e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L46
            r2.<init>(r1)     // Catch: java.lang.Exception -> L46
            r2.append(r6)     // Catch: java.lang.Exception -> L46
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Exception -> L46
            com.tencent.mars.xlog.Log.e(r0, r6)     // Catch: java.lang.Exception -> L46
            return
        L3e:
            com.tencent.wcdb.core.Table r1 = r5.d()     // Catch: java.lang.Exception -> L46
            r1.insertOrReplaceObject(r6)     // Catch: java.lang.Exception -> L46
            return
        L46:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[insert] e:"
            r1.<init>(r2)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.tencent.mars.xlog.Log.e(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lf3.d.e(up5.o):void");
    }

    public final int f(up5.o oVar) {
        java.lang.Long l17;
        if (oVar != null) {
            java.lang.Boolean deleted = oVar.f430025d;
            kotlin.jvm.internal.o.f(deleted, "deleted");
            if (deleted.booleanValue()) {
                return -1;
            }
            try {
                if (com.tencent.mm.vfs.w6.j(oVar.f430024c)) {
                    try {
                        com.tencent.mm.sdk.platformtools.t8.v1(com.tencent.mm.vfs.w6.E(oVar.f430024c));
                        return 0;
                    } catch (java.lang.Exception e17) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[get] openRead error, e:");
                        sb6.append(e17.getMessage());
                        sb6.append(", ");
                        java.lang.Throwable cause = e17.getCause();
                        sb6.append(cause != null ? cause.getMessage() : null);
                        com.tencent.mars.xlog.Log.e("MicroMsg.DeviceFileExtInfoDBProvider", sb6.toString());
                        if (!com.tencent.mm.sdk.platformtools.d7.a(com.tencent.mm.sdk.platformtools.x2.f193071a) || ((l17 = oVar.f430028g) != null && l17.longValue() == 0)) {
                            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            return -2;
                        }
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        return 1;
                    }
                }
            } catch (java.lang.Throwable th6) {
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                throw th6;
            }
        }
        return -1;
    }

    public final java.lang.String g(long j17, java.lang.String str, java.lang.Integer num) {
        byte[] bArr;
        if (j17 <= 0) {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            return "";
        }
        if (str == null || r26.n0.N(str)) {
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            return "";
        }
        if (str != null) {
            bArr = str.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bArr, "getBytes(...)");
        } else {
            bArr = null;
        }
        java.lang.String g17 = kk.k.g(bArr);
        if ((g17 != null ? g17.length() : 0) < 3) {
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            return "";
        }
        if (!c() && num == null) {
            return j17 + '_' + g17;
        }
        return j17 + '_' + g17 + '_' + num;
    }
}
