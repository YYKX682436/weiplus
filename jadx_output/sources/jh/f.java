package jh;

/* loaded from: classes13.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.CancellationSignal f299699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jh.m f299700e;

    public f(jh.m mVar, android.os.CancellationSignal cancellationSignal) {
        this.f299700e = mVar;
        this.f299699d = cancellationSignal;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:7:0x0025, B:9:0x0029, B:13:0x004c, B:15:0x0052, B:17:0x0058, B:19:0x005c, B:20:0x006d, B:22:0x0082, B:25:0x0088, B:31:0x0090, B:26:0x0093), top: B:6:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r14 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "Going to consume requested QUT."
            java.lang.String r3 = "Matrix.WarmUpDelegate"
            oj.j.c(r3, r2, r1)
            java.lang.String[] r1 = com.tencent.matrix.backtrace.WeChatBacktraceNative.consumeRequestedQut()
            jh.m r2 = r14.f299700e
            jh.n r4 = jh.m.a(r2)
            jh.s r5 = jh.s.RequestConsuming
            if (r4 != 0) goto L25
            jh.t r1 = r2.f299729e
            r1.a(r5)
            java.lang.String r1 = "Failed to acquire warm-up invoker."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            oj.j.f(r3, r1, r0)
            return
        L25:
            int r6 = r1.length     // Catch: java.lang.Throwable -> La3
            r7 = r0
        L27:
            if (r7 >= r6) goto L93
            r8 = r1[r7]     // Catch: java.lang.Throwable -> La3
            r9 = 58
            int r9 = r8.lastIndexOf(r9)     // Catch: java.lang.Throwable -> La3
            r10 = -1
            if (r9 == r10) goto L4a
            java.lang.String r10 = r8.substring(r0, r9)     // Catch: java.lang.Throwable -> L47
            int r9 = r9 + 1
            java.lang.String r9 = r8.substring(r9)     // Catch: java.lang.Throwable -> L48
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L48
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L48
            goto L4c
        L47:
            r10 = r8
        L48:
            r9 = r0
            goto L4c
        L4a:
            r9 = r0
            r10 = r8
        L4c:
            boolean r11 = jh.m.b(r2, r10, r9)     // Catch: java.lang.Throwable -> La3
            if (r11 != 0) goto L6c
            boolean r11 = r4.a(r10, r9)     // Catch: java.lang.Throwable -> La3
            if (r11 != 0) goto L6d
            jh.p r12 = jh.m.f299724h     // Catch: java.lang.Throwable -> La3
            if (r12 == 0) goto L6d
            jh.o r13 = jh.o.WarmUpFailed     // Catch: java.lang.Throwable -> La3
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> La3
            java.lang.Object[] r9 = new java.lang.Object[]{r10, r9}     // Catch: java.lang.Throwable -> La3
            com.tencent.mm.plugin.performance.diagnostic.c r12 = (com.tencent.mm.plugin.performance.diagnostic.c) r12     // Catch: java.lang.Throwable -> La3
            r12.a(r13, r9)     // Catch: java.lang.Throwable -> La3
            goto L6d
        L6c:
            r11 = r0
        L6d:
            java.lang.String r9 = "Consumed requested QUT -> %s, ret = %s."
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> La3
            r10[r0] = r8     // Catch: java.lang.Throwable -> La3
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r11)     // Catch: java.lang.Throwable -> La3
            r11 = 1
            r10[r11] = r8     // Catch: java.lang.Throwable -> La3
            oj.j.c(r3, r9, r10)     // Catch: java.lang.Throwable -> La3
            android.os.CancellationSignal r8 = r14.f299699d     // Catch: java.lang.Throwable -> La3
            if (r8 == 0) goto L90
            boolean r8 = r8.isCanceled()     // Catch: java.lang.Throwable -> La3
            if (r8 == 0) goto L90
            java.lang.String r1 = "Consume requested QUT canceled."
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> La3
            oj.j.c(r3, r1, r6)     // Catch: java.lang.Throwable -> La3
            goto L93
        L90:
            int r7 = r7 + 1
            goto L27
        L93:
            java.lang.String r1 = "Consume requested QUT done."
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> La3
            oj.j.c(r3, r1, r0)     // Catch: java.lang.Throwable -> La3
            jh.m.c(r2, r4)
            jh.t r0 = r2.f299729e
            r0.a(r5)
            return
        La3:
            r0 = move-exception
            jh.m.c(r2, r4)
            jh.t r1 = r2.f299729e
            r1.a(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jh.f.run():void");
    }
}
