package yn1;

/* loaded from: classes11.dex */
public final class c4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final yn1.c4 f463632d = new yn1.c4();

    public c4() {
        super(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:3:0x0005, B:5:0x000d, B:7:0x0015, B:12:0x0021, B:16:0x0027, B:18:0x002f, B:19:0x0035, B:21:0x004c, B:22:0x0050), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0027 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:3:0x0005, B:5:0x000d, B:7:0x0015, B:12:0x0021, B:16:0x0027, B:18:0x002f, B:19:0x0035, B:21:0x004c, B:22:0x0050), top: B:2:0x0005 }] */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r17 = this;
            java.lang.String r1 = "MM.Mig.RoamMigrationService"
            java.lang.String r0 = "[checkDBSize] db="
            r2 = 0
            gm0.b0 r3 = gm0.j1.u()     // Catch: java.lang.Throwable -> L85
            l75.k0 r3 = r3.f273153f     // Catch: java.lang.Throwable -> L85
            if (r3 == 0) goto L12
            java.lang.String r3 = r3.getPath()     // Catch: java.lang.Throwable -> L85
            goto L13
        L12:
            r3 = 0
        L13:
            if (r3 == 0) goto L1e
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L85
            if (r4 != 0) goto L1c
            goto L1e
        L1c:
            r4 = r2
            goto L1f
        L1e:
            r4 = 1
        L1f:
            if (r4 == 0) goto L27
            java.lang.String r0 = "[checkDBSize] dataDB path is null"
            com.tencent.mars.xlog.Log.e(r1, r0)     // Catch: java.lang.Throwable -> L85
            goto L8d
        L27:
            boolean r4 = com.tencent.mm.vfs.w6.j(r3)     // Catch: java.lang.Throwable -> L85
            r5 = 0
            if (r4 == 0) goto L34
            long r7 = com.tencent.mm.vfs.w6.k(r3)     // Catch: java.lang.Throwable -> L85
            goto L35
        L34:
            r7 = r5
        L35:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r4.<init>()     // Catch: java.lang.Throwable -> L85
            r4.append(r3)     // Catch: java.lang.Throwable -> L85
            java.lang.String r9 = "-wal"
            r4.append(r9)     // Catch: java.lang.Throwable -> L85
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L85
            boolean r9 = com.tencent.mm.vfs.w6.j(r4)     // Catch: java.lang.Throwable -> L85
            if (r9 == 0) goto L50
            long r5 = com.tencent.mm.vfs.w6.k(r4)     // Catch: java.lang.Throwable -> L85
        L50:
            long r12 = r7 + r5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L85
            r4.append(r7)     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = " wal="
            r4.append(r0)     // Catch: java.lang.Throwable -> L85
            r4.append(r5)     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = " total="
            r4.append(r0)     // Catch: java.lang.Throwable -> L85
            r4.append(r12)     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = " path="
            r4.append(r0)     // Catch: java.lang.Throwable -> L85
            r4.append(r3)     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L85
            com.tencent.mars.xlog.Log.i(r1, r0)     // Catch: java.lang.Throwable -> L85
            r9 = 0
            r10 = 0
            r11 = 3
            java.lang.String r14 = "checkDBSize"
            r15 = 2
            r16 = 0
            yn1.k4.e(r9, r10, r11, r12, r14, r15, r16)     // Catch: java.lang.Throwable -> L85
            goto L8d
        L85:
            r0 = move-exception
            java.lang.String r3 = "checkDBSize error"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r0, r3, r2)
        L8d:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.c4.invoke():java.lang.Object");
    }
}
