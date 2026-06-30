package gq;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static int f274473a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f274474b = {17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L};

    /* renamed from: c, reason: collision with root package name */
    public static final long[] f274475c = {com.tencent.tmassistantsdk.downloadservice.DownloadHelper.SAVE_LENGTH, 314572800, 314572800, 314572800, 314572800};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a() {
        /*
            java.lang.String r0 = "MicroMsg.DbChecker"
            r1 = 0
            android.os.StatFs r3 = new android.os.StatFs     // Catch: java.lang.Exception -> L36
            java.io.File r4 = fp.m.a()     // Catch: java.lang.Exception -> L36
            java.lang.String r4 = r4.getPath()     // Catch: java.lang.Exception -> L36
            r3.<init>(r4)     // Catch: java.lang.Exception -> L36
            int r4 = r3.getAvailableBlocks()     // Catch: java.lang.Exception -> L36
            long r4 = (long) r4     // Catch: java.lang.Exception -> L36
            int r6 = r3.getBlockSize()     // Catch: java.lang.Exception -> L36
            long r6 = (long) r6
            long r4 = r4 * r6
            int r6 = r3.getBlockCount()     // Catch: java.lang.Exception -> L37
            long r6 = (long) r6     // Catch: java.lang.Exception -> L37
            int r8 = r3.getBlockSize()     // Catch: java.lang.Exception -> L37
            long r8 = (long) r8     // Catch: java.lang.Exception -> L37
            long r6 = r6 * r8
            int r8 = r3.getFreeBlocks()     // Catch: java.lang.Exception -> L37
            long r8 = (long) r8     // Catch: java.lang.Exception -> L37
            int r3 = r3.getBlockSize()     // Catch: java.lang.Exception -> L37
            long r10 = (long) r3
            long r8 = r8 * r10
            double r10 = (double) r4
            double r12 = (double) r6
            double r10 = r10 / r12
            goto L40
        L36:
            r4 = r1
        L37:
            java.lang.String r3 = "get db spare space error"
            com.tencent.mars.xlog.Log.e(r0, r3)
            r10 = 0
            r6 = r1
            r8 = r6
        L40:
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r2 = 0
            if (r1 <= 0) goto L72
            r12 = 52428800(0x3200000, double:2.5903269E-316)
            int r1 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r1 >= 0) goto L4e
            r2 = 2
            goto L72
        L4e:
            int r1 = gq.a.f274473a
            if (r1 >= 0) goto L67
            r1 = 4
            gq.a.f274473a = r1
            r1 = r2
        L56:
            r3 = 5
            if (r1 >= r3) goto L67
            long[] r3 = gq.a.f274474b
            r12 = r3[r1]
            int r3 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r3 >= 0) goto L64
            gq.a.f274473a = r1
            goto L67
        L64:
            int r1 = r1 + 1
            goto L56
        L67:
            long[] r1 = gq.a.f274475c
            int r3 = gq.a.f274473a
            r12 = r1[r3]
            int r1 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r1 >= 0) goto L72
            r2 = 1
        L72:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            java.lang.Long r13 = java.lang.Long.valueOf(r4)
            java.lang.Long r14 = java.lang.Long.valueOf(r6)
            java.lang.Long r15 = java.lang.Long.valueOf(r8)
            java.lang.Double r16 = java.lang.Double.valueOf(r10)
            int r1 = gq.a.f274473a
            java.lang.Integer r17 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r12, r13, r14, r15, r16, r17}
            java.lang.String r3 = "checkRomSparespace[%d] available:%d all:%d freeSize :%d availPercent %f mobileSizeIndex %d"
            com.tencent.mars.xlog.Log.i(r0, r3, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gq.a.a():int");
    }
}
