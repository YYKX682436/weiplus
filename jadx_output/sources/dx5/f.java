package dx5;

/* loaded from: classes8.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final dx5.d f244514d;

    /* renamed from: e, reason: collision with root package name */
    public final long f244515e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f244516f;

    /* renamed from: g, reason: collision with root package name */
    public java.net.HttpURLConnection f244517g;

    public f(dx5.d downloadParams) {
        kotlin.jvm.internal.o.g(downloadParams, "downloadParams");
        this.f244514d = downloadParams;
        this.f244515e = downloadParams.f244510a;
        this.f244516f = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final void a(long j17) {
        java.lang.String format = "finishDownloadTask taskId:" + j17;
        java.lang.Object[] objArr = new java.lang.Object[0];
        kotlin.jvm.internal.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        kotlin.jvm.internal.o.d(format);
        dx5.g.f244521d.remove(java.lang.Long.valueOf(j17));
    }

    public final void b(dx5.c cVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDownloadCanceled taskId:");
        long j17 = this.f244515e;
        sb6.append(j17);
        sb6.append(" reason:");
        sb6.append(cVar);
        java.lang.String format = sb6.toString();
        java.lang.Object[] objArr = new java.lang.Object[0];
        kotlin.jvm.internal.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        kotlin.jvm.internal.o.d(format);
        dx5.g gVar = dx5.g.f244518a;
        dx5.g.f244519b.onCanceled(j17, cVar);
    }

    public final void c(jz5.l lVar) {
        if (this.f244516f.get()) {
            b(dx5.c.f244508e);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDownloadFailed taskId:");
        long j17 = this.f244515e;
        sb6.append(j17);
        sb6.append(" error:");
        sb6.append(lVar);
        java.lang.String format = sb6.toString();
        java.lang.Object[] objArr = new java.lang.Object[0];
        kotlin.jvm.internal.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        kotlin.jvm.internal.o.d(format);
        dx5.g gVar = dx5.g.f244518a;
        dx5.g.f244519b.onFailed(j17, lVar);
    }

    public final void d(long j17) {
        if (this.f244516f.get()) {
            b(dx5.c.f244508e);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDownloadSuccess taskId:");
        long j18 = this.f244515e;
        sb6.append(j18);
        java.lang.String format = sb6.toString();
        java.lang.Object[] objArr = new java.lang.Object[0];
        kotlin.jvm.internal.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        kotlin.jvm.internal.o.d(format);
        dx5.g gVar = dx5.g.f244518a;
        dx5.g.f244519b.onSucceeded(j18, j17);
    }

    public final void e(long j17, int i17, java.util.Map map) {
        java.lang.String format = "onResponseStarted taskId:" + j17;
        java.lang.Object[] objArr = new java.lang.Object[0];
        kotlin.jvm.internal.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        kotlin.jvm.internal.o.d(format);
        dx5.g gVar = dx5.g.f244518a;
        dx5.g.f244519b.onResponseStarted(j17, i17, map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        throw new java.io.IOException("Download canceled");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f(java.io.InputStream r15) {
        /*
            r14 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "processStreamingDownload start taskId:"
            r2.<init>(r3)
            long r3 = r14.f244515e
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r7 = "format"
            kotlin.jvm.internal.o.g(r2, r7)
            int r8 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r8)
            int r8 = r6.length
            r9 = 1
            if (r8 != 0) goto L27
            r8 = r9
            goto L28
        L27:
            r8 = r5
        L28:
            if (r8 == 0) goto L2b
            goto L34
        L2b:
            int r8 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r8)
            java.lang.String r2 = java.lang.String.format(r2, r6)
        L34:
            kotlin.jvm.internal.o.d(r2)
            r2 = 8192(0x2000, float:1.148E-41)
            byte[] r2 = new byte[r2]
            r10 = 0
        L3d:
            int r6 = r15.read(r2)     // Catch: java.lang.Throwable -> Lac
            r8 = -1
            if (r6 == r8) goto L68
            java.util.concurrent.atomic.AtomicBoolean r8 = r14.f244516f     // Catch: java.lang.Throwable -> Lac
            boolean r8 = r8.get()     // Catch: java.lang.Throwable -> Lac
            if (r8 != 0) goto L60
            long r12 = (long) r6     // Catch: java.lang.Throwable -> Lac
            long r10 = r10 + r12
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocateDirect(r6)     // Catch: java.lang.Throwable -> Lac
            r8.put(r2, r5, r6)     // Catch: java.lang.Throwable -> Lac
            r8.flip()     // Catch: java.lang.Throwable -> Lac
            dx5.g r12 = dx5.g.f244518a     // Catch: java.lang.Throwable -> Lac
            dx5.b r12 = dx5.g.f244519b     // Catch: java.lang.Throwable -> Lac
            r12.onStreamDataChunk(r3, r8, r6)     // Catch: java.lang.Throwable -> Lac
            goto L3d
        L60:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Lac
            java.lang.String r1 = "Download canceled"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lac
            throw r0     // Catch: java.lang.Throwable -> Lac
        L68:
            r15.close()
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r0
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "processStreamingDownload done, taskId:"
            r15.<init>(r0)
            r15.append(r3)
            java.lang.String r0 = " downloadedLength: "
            r15.append(r0)
            r15.append(r10)
            java.lang.String r0 = " costTime: "
            r15.append(r0)
            r15.append(r12)
            java.lang.String r15 = r15.toString()
            java.lang.Object[] r0 = new java.lang.Object[r5]
            kotlin.jvm.internal.o.g(r15, r7)
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            int r1 = r0.length
            if (r1 != 0) goto L9c
            r5 = r9
        L9c:
            if (r5 == 0) goto L9f
            goto La8
        L9f:
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r15 = java.lang.String.format(r15, r0)
        La8:
            kotlin.jvm.internal.o.d(r15)
            return r10
        Lac:
            r0 = move-exception
            r15.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dx5.f.f(java.io.InputStream):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0270, code lost:
    
        if (r0 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0229, code lost:
    
        if (r0 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0168, code lost:
    
        if (r0 != null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02b2, code lost:
    
        a(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02b5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02af, code lost:
    
        r0.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02ad, code lost:
    
        if (r0 == null) goto L122;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dx5.f.run():void");
    }
}
